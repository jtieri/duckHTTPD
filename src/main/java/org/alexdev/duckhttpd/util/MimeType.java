package org.alexdev.duckhttpd.util;

import java.util.HashMap;

public class MimeType {

    private static MimeType instance;
    private HashMap<String, String> types;

    public MimeType() {
        this.types = new HashMap<String, String>();
        this.types.put("323", "text/h323");
        this.types.put("3gp", "video/3gpp");
        this.types.put("7z", "application/x-7z-compressed");
        this.types.put("abw", "application/x-abiword");
        this.types.put("ai", "application/postscript");
        this.types.put("aif", "audio/x-aiff");
        this.types.put("aifc", "audio/x-aiff");
        this.types.put("aiff", "audio/x-aiff");
        this.types.put("alc", "chemical/x-alchemy");
        this.types.put("art", "image/x-jg");
        this.types.put("asc", "text/plain");
        this.types.put("asf", "video/x-ms-asf");
        this.types.put("asn", "chemical/x-ncbi-asn1");
        this.types.put("asn", "chemical/x-ncbi-asn1-spec");
        this.types.put("aso", "chemical/x-ncbi-asn1-binary");
        this.types.put("asx", "video/x-ms-asf");
        this.types.put("atom", "application/atom");
        this.types.put("atomcat", "application/atomcat+xml");
        this.types.put("atomsrv", "application/atomserv+xml");
        this.types.put("au", "audio/basic");
        this.types.put("avi", "video/x-msvideo");
        this.types.put("bak", "application/x-trash");
        this.types.put("bat", "application/x-msdos-program");
        this.types.put("b", "chemical/x-molconn-Z");
        this.types.put("bcpio", "application/x-bcpio");
        this.types.put("bib", "text/x-bibtex");
        this.types.put("bin", "application/octet-stream");
        this.types.put("bmp", "image/x-ms-bmp");
        this.types.put("book", "application/x-maker");
        this.types.put("boo", "text/x-boo");
        this.types.put("bsd", "chemical/x-crossfire");
        this.types.put("c3d", "chemical/x-chem3d");
        this.types.put("cab", "application/x-cab");
        this.types.put("cac", "chemical/x-cache");
        this.types.put("cache", "chemical/x-cache");
        this.types.put("cap", "application/cap");
        this.types.put("cascii", "chemical/x-cactvs-binary");
        this.types.put("cat", "application/vnd.ms-pki.seccat");
        this.types.put("cbin", "chemical/x-cactvs-binary");
        this.types.put("cbr", "application/x-cbr");
        this.types.put("cbz", "application/x-cbz");
        this.types.put("cc", "text/x-c++src");
        this.types.put("cct", "application/x-director");
        this.types.put("cdf", "application/x-cdf");
        this.types.put("cdr", "image/x-coreldraw");
        this.types.put("cdt", "image/x-coreldrawtemplate");
        this.types.put("cdx", "chemical/x-cdx");
        this.types.put("cdy", "application/vnd.cinderella");
        this.types.put("cef", "chemical/x-cxf");
        this.types.put("cer", "chemical/x-cerius");
        this.types.put("chm", "chemical/x-chemdraw");
        this.types.put("chrt", "application/x-kchart");
        this.types.put("cif", "chemical/x-cif");
        this.types.put("class", "application/java-vm");
        this.types.put("cls", "text/x-tex");
        this.types.put("cmdf", "chemical/x-cmdf");
        this.types.put("cml", "chemical/x-cml");
        this.types.put("cod", "application/vnd.rim.cod");
        this.types.put("com", "application/x-msdos-program");
        this.types.put("cpa", "chemical/x-compass");
        this.types.put("cpio", "application/x-cpio");
        this.types.put("cpp", "text/x-c++src");
        this.types.put("cpt", "application/mac-compactpro");
        this.types.put("cpt", "image/x-corelphotopaint");
        this.types.put("crl", "application/x-pkcs7-crl");
        this.types.put("crt", "application/x-x509-ca-cert");
        this.types.put("csf", "chemical/x-cache-csf");
        this.types.put("csh", "application/x-csh");
        this.types.put("csh", "text/x-csh");
        this.types.put("csm", "chemical/x-csml");
        this.types.put("csml", "chemical/x-csml");
        this.types.put("css", "text/css");
        this.types.put("csv", "text/csv");
        this.types.put("ctab", "chemical/x-cactvs-binary");
        this.types.put("c", "text/x-csrc");
        this.types.put("ctx", "chemical/x-ctx");
        this.types.put("cu", "application/cu-seeme");
        this.types.put("cub", "chemical/x-gaussian-cube");
        this.types.put("cxf", "chemical/x-cxf");
        this.types.put("cxx", "text/x-c++src");
        this.types.put("dat", "chemical/x-mopac-input");
        this.types.put("dcr", "application/x-director");
        this.types.put("deb", "application/x-debian-package");
        this.types.put("diff", "text/x-diff");
        this.types.put("dif", "video/dv");
        this.types.put("dir", "application/x-director");
        this.types.put("djv", "image/vnd.djvu");
        this.types.put("djvu", "image/vnd.djvu");
        this.types.put("dll", "application/x-msdos-program");
        this.types.put("dl", "video/dl");
        this.types.put("dmg", "application/x-apple-diskimage");
        this.types.put("dms", "application/x-dms");
        this.types.put("doc", "application/msword");
        this.types.put("dot", "application/msword");
        this.types.put("d", "text/x-dsrc");
        this.types.put("dvi", "application/x-dvi");
        this.types.put("dv", "video/dv");
        this.types.put("dx", "chemical/x-jcamp-dx");
        this.types.put("dxr", "application/x-director");
        this.types.put("emb", "chemical/x-embl-dl-nucleotide");
        this.types.put("embl", "chemical/x-embl-dl-nucleotide");
        this.types.put("eml", "message/rfc822");
        this.types.put("ent", "chemical/x-ncbi-asn1-ascii");
        this.types.put("ent", "chemical/x-pdb");
        this.types.put("eps", "application/postscript");
        this.types.put("etx", "text/x-setext");
        this.types.put("exe", "application/x-msdos-program");
        this.types.put("ez", "application/andrew-inset");
        this.types.put("fb", "application/x-maker");
        this.types.put("fbdoc", "application/x-maker");
        this.types.put("fch", "chemical/x-gaussian-checkpoint");
        this.types.put("fchk", "chemical/x-gaussian-checkpoint");
        this.types.put("fig", "application/x-xfig");
        this.types.put("flac", "application/x-flac");
        this.types.put("fli", "video/fli");
        this.types.put("fm", "application/x-maker");
        this.types.put("frame", "application/x-maker");
        this.types.put("frm", "application/x-maker");
        this.types.put("gal", "chemical/x-gaussian-log");
        this.types.put("gam", "chemical/x-gamess-input");
        this.types.put("gamin", "chemical/x-gamess-input");
        this.types.put("gau", "chemical/x-gaussian-input");
        this.types.put("gcd", "text/x-pcs-gcd");
        this.types.put("gcf", "application/x-graphing-calculator");
        this.types.put("gcg", "chemical/x-gcg8-sequence");
        this.types.put("gen", "chemical/x-genbank");
        this.types.put("gf", "application/x-tex-gf");
        this.types.put("gif", "image/gif");
        this.types.put("gjc", "chemical/x-gaussian-input");
        this.types.put("gjf", "chemical/x-gaussian-input");
        this.types.put("gl", "video/gl");
        this.types.put("gnumeric", "application/x-gnumeric");
        this.types.put("gpt", "chemical/x-mopac-graph");
        this.types.put("gsf", "application/x-font");
        this.types.put("gsm", "audio/x-gsm");
        this.types.put("gtar", "application/x-gtar");
        this.types.put("hdf", "application/x-hdf");
        this.types.put("hh", "text/x-c++hdr");
        this.types.put("hin", "chemical/x-hin");
        this.types.put("hpp", "text/x-c++hdr");
        this.types.put("hqx", "application/mac-binhex40");
        this.types.put("hs", "text/x-haskell");
        this.types.put("hta", "application/hta");
        this.types.put("htc", "text/x-component");
        this.types.put("h", "text/x-chdr");
        this.types.put("html", "text/html");
        this.types.put("htm", "text/html");
        this.types.put("hxx", "text/x-c++hdr");
        this.types.put("ica", "application/x-ica");
        this.types.put("ice", "x-conference/x-cooltalk");
        this.types.put("ico", "image/x-icon");
        this.types.put("ics", "text/calendar");
        this.types.put("icz", "text/calendar");
        this.types.put("ief", "image/ief");
        this.types.put("iges", "model/iges");
        this.types.put("igs", "model/iges");
        this.types.put("iii", "application/x-iphone");
        this.types.put("inp", "chemical/x-gamess-input");
        this.types.put("ins", "application/x-internet-signup");
        this.types.put("iso", "application/x-iso9660-image");
        this.types.put("isp", "application/x-internet-signup");
        this.types.put("ist", "chemical/x-isostar");
        this.types.put("istr", "chemical/x-isostar");
        this.types.put("jad", "text/vnd.sun.j2me.app-descriptor");
        this.types.put("jar", "application/java-archive");
        this.types.put("java", "text/x-java");
        this.types.put("jdx", "chemical/x-jcamp-dx");
        this.types.put("jmz", "application/x-jmol");
        this.types.put("jng", "image/x-jng");
        this.types.put("jnlp", "application/x-java-jnlp-file");
        this.types.put("jpeg", "image/jpeg");
        this.types.put("jpe", "image/jpeg");
        this.types.put("jpg", "image/jpeg");
        this.types.put("js", "application/x-javascript");
        this.types.put("json", "application/json");
        this.types.put("kar", "audio/midi");
        this.types.put("key", "application/pgp-keys");
        this.types.put("kil", "application/x-killustrator");
        this.types.put("kin", "chemical/x-kinemage");
        this.types.put("kml", "application/vnd.google-earth.kml+xml");
        this.types.put("kmz", "application/vnd.google-earth.kmz");
        this.types.put("kpr", "application/x-kpresenter");
        this.types.put("kpt", "application/x-kpresenter");
        this.types.put("ksp", "application/x-kspread");
        this.types.put("kwd", "application/x-kword");
        this.types.put("kwt", "application/x-kword");
        this.types.put("latex", "application/x-latex");
        this.types.put("lha", "application/x-lha");
        this.types.put("lhs", "text/x-literate-haskell");
        this.types.put("lsf", "video/x-la-asf");
        this.types.put("lsx", "video/x-la-asf");
        this.types.put("ltx", "text/x-tex");
        this.types.put("lyx", "application/x-lyx");
        this.types.put("lzh", "application/x-lzh");
        this.types.put("lzx", "application/x-lzx");
        this.types.put("m3u", "audio/mpegurl");
        this.types.put("m3u", "audio/x-mpegurl");
        this.types.put("m4a", "audio/mpeg");
        this.types.put("m4a", "video/mp4");
        this.types.put("m4b", "video/mp4");
        this.types.put("m4v", "video/mp4");
        this.types.put("maker", "application/x-maker");
        this.types.put("man", "application/x-troff-man");
        this.types.put("mcif", "chemical/x-mmcif");
        this.types.put("mcm", "chemical/x-macmolecule");
        this.types.put("mdb", "application/msaccess");
        this.types.put("me", "application/x-troff-me");
        this.types.put("mesh", "model/mesh");
        this.types.put("mid", "audio/midi");
        this.types.put("midi", "audio/midi");
        this.types.put("mif", "application/x-mif");
        this.types.put("mm", "application/x-freemind");
        this.types.put("mmd", "chemical/x-macromodel-input");
        this.types.put("mmf", "application/vnd.smaf");
        this.types.put("mml", "text/mathml");
        this.types.put("mmod", "chemical/x-macromodel-input");
        this.types.put("mng", "video/x-mng");
        this.types.put("moc", "text/x-moc");
        this.types.put("mol2", "chemical/x-mol2");
        this.types.put("mol", "chemical/x-mdl-molfile");
        this.types.put("moo", "chemical/x-mopac-out");
        this.types.put("mop", "chemical/x-mopac-input");
        this.types.put("mopcrt", "chemical/x-mopac-input");
        this.types.put("movie", "video/x-sgi-movie");
        this.types.put("mov", "video/quicktime");
        this.types.put("mp2", "audio/mpeg");
        this.types.put("mp3", "audio/mpeg");
        this.types.put("mp4", "video/mp4");
        this.types.put("mpc", "chemical/x-mopac-input");
        this.types.put("mpega", "audio/mpeg");
        this.types.put("mpeg", "video/mpeg");
        this.types.put("mpe", "video/mpeg");
        this.types.put("mpga", "audio/mpeg");
        this.types.put("mpg", "video/mpeg");
        this.types.put("ms", "application/x-troff-ms");
        this.types.put("msh", "model/mesh");
        this.types.put("msi", "application/x-msi");
        this.types.put("mvb", "chemical/x-mopac-vib");
        this.types.put("mxu", "video/vnd.mpegurl");
        this.types.put("nb", "application/mathematica");
        this.types.put("nc", "application/x-netcdf");
        this.types.put("nwc", "application/x-nwc");
        this.types.put("o", "application/x-object");
        this.types.put("oda", "application/oda");
        this.types.put("odb", "application/vnd.oasis.opendocument.database");
        this.types.put("odc", "application/vnd.oasis.opendocument.chart");
        this.types.put("odf", "application/vnd.oasis.opendocument.formula");
        this.types.put("odg", "application/vnd.oasis.opendocument.graphics");
        this.types.put("odi", "application/vnd.oasis.opendocument.image");
        this.types.put("odm", "application/vnd.oasis.opendocument.text-master");
        this.types.put("odp", "application/vnd.oasis.opendocument.presentation");
        this.types.put("ods", "application/vnd.oasis.opendocument.spreadsheet");
        this.types.put("odt", "application/vnd.oasis.opendocument.text");
        this.types.put("oga", "audio/ogg");
        this.types.put("ogg", "application/ogg");
        this.types.put("ogv", "video/ogg");
        this.types.put("ogx", "application/ogg");
        this.types.put("old", "application/x-trash");
        this.types.put("otg", "application/vnd.oasis.opendocument.graphics-template");
        this.types.put("oth", "application/vnd.oasis.opendocument.text-duckhttpd");
        this.types.put("otp", "application/vnd.oasis.opendocument.presentation-template");
        this.types.put("ots", "application/vnd.oasis.opendocument.spreadsheet-template");
        this.types.put("ott", "application/vnd.oasis.opendocument.text-template");
        this.types.put("oza", "application/x-oz-application");
        this.types.put("p7r", "application/x-pkcs7-certreqresp");
        this.types.put("pac", "application/x-ns-proxy-autoconfig");
        this.types.put("pas", "text/x-pascal");
        this.types.put("patch", "text/x-diff");
        this.types.put("pat", "image/x-coreldrawpattern");
        this.types.put("pbm", "image/x-portable-bitmap");
        this.types.put("pcap", "application/cap");
        this.types.put("pcf", "application/x-font");
        this.types.put("pcx", "image/pcx");
        this.types.put("pdb", "chemical/x-pdb");
        this.types.put("pdf", "application/pdf");
        this.types.put("pfa", "application/x-font");
        this.types.put("pfb", "application/x-font");
        this.types.put("pgm", "image/x-portable-graymap");
        this.types.put("pgn", "application/x-chess-pgn");
        this.types.put("pgp", "application/pgp-signature");
        this.types.put("php3", "application/x-httpd-php3");
        this.types.put("php3p", "application/x-httpd-php3-preprocessed");
        this.types.put("php4", "application/x-httpd-php4");
        this.types.put("php", "application/x-httpd-php");
        this.types.put("phps", "application/x-httpd-php-source");
        this.types.put("pht", "application/x-httpd-php");
        this.types.put("phtml", "application/x-httpd-php");
        this.types.put("pk", "application/x-tex-pk");
        this.types.put("pls", "audio/x-scpls");
        this.types.put("pl", "text/x-perl");
        this.types.put("pm", "text/x-perl");
        this.types.put("png", "image/png");
        this.types.put("pnm", "image/x-portable-anymap");
        this.types.put("pot", "text/plain");
        this.types.put("ppm", "image/x-portable-pixmap");
        this.types.put("pps", "application/vnd.ms-powerpoint");
        this.types.put("ppt", "application/vnd.ms-powerpoint");
        this.types.put("prf", "application/pics-rules");
        this.types.put("prt", "chemical/x-ncbi-asn1-ascii");
        this.types.put("ps", "application/postscript");
        this.types.put("psd", "image/x-photoshop");
        this.types.put("p", "text/x-pascal");
        this.types.put("pyc", "application/x-python-code");
        this.types.put("pyo", "application/x-python-code");
        this.types.put("py", "text/x-python");
        this.types.put("qtl", "application/x-quicktimeplayer");
        this.types.put("qt", "video/quicktime");
        this.types.put("ra", "audio/x-pn-realaudio");
        this.types.put("ra", "audio/x-realaudio");
        this.types.put("ram", "audio/x-pn-realaudio");
        this.types.put("rar", "application/rar");
        this.types.put("ras", "image/x-cmu-raster");
        this.types.put("rd", "chemical/x-mdl-rdfile");
        this.types.put("rdf", "application/rdf+xml");
        this.types.put("rgb", "image/x-rgb");
        this.types.put("rhtml", "application/x-httpd-eruby");
        this.types.put("rm", "audio/x-pn-realaudio");
        this.types.put("roff", "application/x-troff");
        this.types.put("ros", "chemical/x-rosdal");
        this.types.put("rpm", "application/x-redhat-package-manager");
        this.types.put("rss", "application/rss+xml");
        this.types.put("rtf", "application/rtf");
        this.types.put("rtx", "text/richtext");
        this.types.put("rxn", "chemical/x-mdl-rxnfile");
        this.types.put("sct", "text/scriptlet");
        this.types.put("sd2", "audio/x-sd2");
        this.types.put("sda", "application/vnd.stardivision.draw");
        this.types.put("sdc", "application/vnd.stardivision.calc");
        this.types.put("sd", "chemical/x-mdl-sdfile");
        this.types.put("sdd", "application/vnd.stardivision.impress");
        this.types.put("sdf", "application/vnd.stardivision.math");
        this.types.put("sdf", "chemical/x-mdl-sdfile");
        this.types.put("sds", "application/vnd.stardivision.chart");
        this.types.put("sdw", "application/vnd.stardivision.writer");
        this.types.put("ser", "application/java-serialized-object");
        this.types.put("sgf", "application/x-go-sgf");
        this.types.put("sgl", "application/vnd.stardivision.writer-global");
        this.types.put("sh", "application/x-sh");
        this.types.put("shar", "application/x-shar");
        this.types.put("sh", "text/x-sh");
        this.types.put("shtml", "text/html");
        this.types.put("sid", "audio/prs.sid");
        this.types.put("sik", "application/x-trash");
        this.types.put("silo", "model/mesh");
        this.types.put("sis", "application/vnd.symbian.install");
        this.types.put("sisx", "x-epoc/x-sisx-app");
        this.types.put("sit", "application/x-stuffit");
        this.types.put("sitx", "application/x-stuffit");
        this.types.put("skd", "application/x-koan");
        this.types.put("skm", "application/x-koan");
        this.types.put("skp", "application/x-koan");
        this.types.put("skt", "application/x-koan");
        this.types.put("smi", "application/smil");
        this.types.put("smil", "application/smil");
        this.types.put("snd", "audio/basic");
        this.types.put("spc", "chemical/x-galactic-spc");
        this.types.put("spl", "application/futuresplash");
        this.types.put("spl", "application/x-futuresplash");
        this.types.put("spx", "audio/ogg");
        this.types.put("src", "application/x-wais-source");
        this.types.put("stc", "application/vnd.sun.xml.calc.template");
        this.types.put("std", "application/vnd.sun.xml.draw.template");
        this.types.put("sti", "application/vnd.sun.xml.impress.template");
        this.types.put("stl", "application/vnd.ms-pki.stl");
        this.types.put("stw", "application/vnd.sun.xml.writer.template");
        this.types.put("sty", "text/x-tex");
        this.types.put("sv4cpio", "application/x-sv4cpio");
        this.types.put("sv4crc", "application/x-sv4crc");
        this.types.put("svg", "image/svg+xml");
        this.types.put("svgz", "image/svg+xml");
        this.types.put("sw", "chemical/x-swissprot");
        this.types.put("swf", "application/x-shockwave-flash");
        this.types.put("swfl", "application/x-shockwave-flash");
        this.types.put("sxc", "application/vnd.sun.xml.calc");
        this.types.put("sxd", "application/vnd.sun.xml.draw");
        this.types.put("sxg", "application/vnd.sun.xml.writer.global");
        this.types.put("sxi", "application/vnd.sun.xml.impress");
        this.types.put("sxm", "application/vnd.sun.xml.math");
        this.types.put("sxw", "application/vnd.sun.xml.writer");
        this.types.put("t", "application/x-troff");
        this.types.put("tar", "application/x-tar");
        this.types.put("taz", "application/x-gtar");
        this.types.put("tcl", "application/x-tcl");
        this.types.put("tcl", "text/x-tcl");
        this.types.put("texi", "application/x-texinfo");
        this.types.put("texinfo", "application/x-texinfo");
        this.types.put("tex", "text/x-tex");
        this.types.put("text", "text/plain");
        this.types.put("tgf", "chemical/x-mdl-tgf");
        this.types.put("tgz", "application/x-gtar");
        this.types.put("tiff", "image/tiff");
        this.types.put("tif", "image/tiff");
        this.types.put("tk", "text/x-tcl");
        this.types.put("tm", "text/texmacs");
        this.types.put("torrent", "application/x-bittorrent");
        this.types.put("tr", "application/x-troff");
        this.types.put("tsp", "application/dsptype");
        this.types.put("ts", "text/texmacs");
        this.types.put("tsv", "text/tab-separated-values");
        this.types.put("txt", "text/plain");
        this.types.put("udeb", "application/x-debian-package");
        this.types.put("uls", "text/iuls");
        this.types.put("ustar", "application/x-ustar");
        this.types.put("val", "chemical/x-ncbi-asn1-binary");
        this.types.put("vcd", "application/x-cdlink");
        this.types.put("vcf", "text/x-vcard");
        this.types.put("vcs", "text/x-vcalendar");
        this.types.put("vmd", "chemical/x-vmd");
        this.types.put("vms", "chemical/x-vamas-iso14976");
        this.types.put("vrml", "model/vrml");
        this.types.put("vrml", "x-world/x-vrml");
        this.types.put("vrm", "x-world/x-vrml");
        this.types.put("vsd", "application/vnd.visio");
        this.types.put("wad", "application/x-doom");
        this.types.put("wav", "audio/x-wav");
        this.types.put("wax", "audio/x-ms-wax");
        this.types.put("wbmp", "image/vnd.wap.wbmp");
        this.types.put("wbxml", "application/vnd.wap.wbxml");
        this.types.put("wk", "application/x-123");
        this.types.put("wma", "audio/x-ms-wma");
        this.types.put("wmd", "application/x-ms-wmd");
        this.types.put("wmlc", "application/vnd.wap.wmlc");
        this.types.put("wmlsc", "application/vnd.wap.wmlscriptc");
        this.types.put("wmls", "text/vnd.wap.wmlscript");
        this.types.put("wml", "text/vnd.wap.wml");
        this.types.put("wm", "video/x-ms-wm");
        this.types.put("wmv", "video/x-ms-wmv");
        this.types.put("wmx", "video/x-ms-wmx");
        this.types.put("wmz", "application/x-ms-wmz");
        this.types.put("wp5", "application/wordperfect5.1");
        this.types.put("wpd", "application/wordperfect");
        this.types.put("wrl", "model/vrml");
        this.types.put("wrl", "x-world/x-vrml");
        this.types.put("wsc", "text/scriptlet");
        this.types.put("wvx", "video/x-ms-wvx");
        this.types.put("wz", "application/x-wingz");
        this.types.put("xbm", "image/x-xbitmap");
        this.types.put("xcf", "application/x-xcf");
        this.types.put("xht", "application/xhtml+xml");
        this.types.put("xhtml", "application/xhtml+xml");
        this.types.put("xlb", "application/vnd.ms-excel");
        this.types.put("xls", "application/vnd.ms-excel");
        this.types.put("xlt", "application/vnd.ms-excel");
        this.types.put("xml", "application/xml");
        this.types.put("xpi", "application/x-xpinstall");
        this.types.put("xpm", "image/x-xpixmap");
        this.types.put("xsl", "application/xml");
        this.types.put("xtel", "chemical/x-xtel");
        this.types.put("xul", "application/vnd.mozilla.xul+xml");
        this.types.put("xwd", "image/x-xwindowdump");
        this.types.put("xyz", "chemical/x-xyz");
        this.types.put("zip", "application/zip");
        this.types.put("zmt", "chemical/x-mopac-input");
    }

    public HashMap<String, String> getTypes() {
        return types;
    }

    public static String getContentType(String extension) {
        return getInstance().types.get(extension);
    }

    public static MimeType getInstance() {
        if (instance == null) {
            instance = new MimeType();
        }

        return instance;
    }
}

