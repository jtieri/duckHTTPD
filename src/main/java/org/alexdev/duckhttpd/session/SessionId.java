package org.alexdev.duckhttpd.session;

import com.google.gson.Gson;
import org.alexdev.duckhttpd.queries.WebSession;
import org.alexdev.duckhttpd.server.connection.WebConnection;
import org.alexdev.duckhttpd.util.WebUtilities;
import org.alexdev.duckhttpd.util.config.Settings;
import org.apache.commons.codec.digest.DigestUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class SessionId {

    private String id;
    private String fingerprint;
    private long expireTime;

    private WebConnection client;
    private WebSession webSession;

    public SessionId(WebConnection client) {
        this.client = client;
        this.id = client.channel().id().toString();
        this.expireTime = WebUtilities.currentTimeSeconds() + TimeUnit.MINUTES.toSeconds(24); // TODO: Configure GC collection time
        this.webSession = new WebSession(this.client);
    }

    public void generateFingerprint() {
        this.setFingerprint(DigestUtils.sha256Hex(this.id + String.valueOf(WebUtilities.currentTimeSeconds())));
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;

        try {
            File sessionFile = this.getSessionFile();

            if (!sessionFile.exists()) {
                sessionFile.createNewFile();
            }

        } catch (Exception e) {
            Settings.getInstance().getResponses().getInternalServerErrorResponse(this.client, e);
        }

    }

    public File getSessionFile() {
        try {
            return Paths.get(SessionIdManager.getInstance().getSessionDirectory().getCanonicalPath(), fingerprint).toFile();
        } catch (IOException ignored) {

        }

        return null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public long getExpireTime() {
        return expireTime;
    }

    public WebSession getWebSession() {
        return webSession;
    }
}
