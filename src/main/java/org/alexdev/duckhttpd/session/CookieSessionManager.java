package org.alexdev.duckhttpd.session;

import org.alexdev.duckhttpd.server.connection.WebConnection;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CookieSessionManager implements Runnable {
    public static final String HTTPSESSID = "HTTPSESSID";
    public static final long EXPIRE_TIME = TimeUnit.HOURS.toMinutes(24);
    private static CookieSessionManager instance;

    private File sessionDirectory;
    private ScheduledExecutorService executorService;

    public CookieSessionManager() {
        this.createScheduler();

        this.sessionDirectory = new File("tmp");

        if (!this.sessionDirectory.exists()) {
            this.sessionDirectory.mkdir();
        } else {
            if (this.sessionDirectory.isFile()) {
                this.sessionDirectory.delete();
                this.sessionDirectory.mkdir();
            }
        }
    }

    /**
     * Creates scheduler to clear stored cookies every 24 hours
     */
    private void createScheduler() {
        this.executorService = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors() * 2);
        this.executorService.scheduleAtFixedRate(this, 0, EXPIRE_TIME, TimeUnit.MINUTES);
    }

    @Override
    public void run() {
        try {
            if (this.sessionDirectory == null) {
                return;
            }

            if (this.sessionDirectory.listFiles() == null) {
                return;
            }

            for (File file : this.sessionDirectory.listFiles()) {
                if (file == null) {
                    continue;
                }

                if (System.currentTimeMillis() > file.lastModified() + TimeUnit.MINUTES.toMillis(EXPIRE_TIME)) {
                    try {
                        file.delete();
                    } catch (Exception e) {
                    }
                }
            }
        } catch (Exception ignored) { }
    }

    /**
     * Checks if the connection has a stored session cookie, if not, send one.
     * And retrieve the session ID instance.
     *
     * @param client the http connection
     * @return the session id
     */
    public CookieSession getSession(WebConnection client) {
        String cookie = client.cookies().getString(HTTPSESSID, "");
        boolean createCookie = true;

        if (cookie != null && !cookie.isBlank()) {
            if (Paths.get(this.sessionDirectory.getAbsolutePath(), cookie).toFile().exists()) {
                createCookie = false;
            }
        }

        CookieSession session = new CookieSession(client);

        if (createCookie) {
            session.generateFingerprint();
        } else {
            session.setFingerprint(cookie);
        }

        return session;
    }

    /**
     * Get the session directory instance
     *
     * @return the directory instance
     */
    public File getSessionDirectory() {
        return sessionDirectory;
    }

    /**
     * Gets the time in minutes that the session data should expire
     *
     * @return the expire time in minutes
     */
    public static long getExpireTime() {
        return EXPIRE_TIME;
    }

    /**
     * Gets the session ID manager instance
     *
     * @return the instance
     */
    public static CookieSessionManager getInstance() {
        if (instance == null) {
            instance = new CookieSessionManager();
        }

        return instance;
    }


}
