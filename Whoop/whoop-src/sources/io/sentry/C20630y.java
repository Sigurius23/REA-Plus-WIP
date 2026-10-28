package io.sentry;

import java.net.URI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C20630y {

    /* JADX INFO: renamed from: e */
    public static final Pattern f77180e = Pattern.compile("^o(\\d+)\\.");

    /* JADX INFO: renamed from: a */
    public final String f77181a;

    /* JADX INFO: renamed from: b */
    public final String f77182b;

    /* JADX INFO: renamed from: c */
    public final URI f77183c;

    /* JADX INFO: renamed from: d */
    public final String f77184d;

    public C20630y(String str) {
        try {
            AbstractC29125c.m88510S(str, "The DSN is required.");
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                throw new IllegalArgumentException("The DSN is empty.");
            }
            URI uriNormalize = new URI(strTrim).normalize();
            String scheme = uriNormalize.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                throw new IllegalArgumentException("Invalid DSN scheme: " + scheme);
            }
            String userInfo = uriNormalize.getUserInfo();
            if (userInfo == null || userInfo.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            String[] strArrSplit = userInfo.split(":", -1);
            String str2 = strArrSplit[0];
            this.f77182b = str2;
            if (str2 == null || str2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            String strGroup = null;
            this.f77181a = strArrSplit.length > 1 ? strArrSplit[1] : null;
            String path = uriNormalize.getPath();
            path = path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
            int iLastIndexOf = path.lastIndexOf("/") + 1;
            String strSubstring = path.substring(0, iLastIndexOf);
            strSubstring = strSubstring.endsWith("/") ? strSubstring : strSubstring.concat("/");
            String strSubstring2 = path.substring(iLastIndexOf);
            if (strSubstring2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
            }
            this.f77183c = new URI(scheme, null, uriNormalize.getHost(), uriNormalize.getPort(), strSubstring + "api/" + strSubstring2, null, null);
            String host = uriNormalize.getHost();
            if (host != null) {
                Matcher matcher = f77180e.matcher(host);
                if (matcher.find()) {
                    strGroup = matcher.group(1);
                }
            }
            this.f77184d = strGroup;
        } catch (Throwable th3) {
            throw new IllegalArgumentException(th3);
        }
    }
}
