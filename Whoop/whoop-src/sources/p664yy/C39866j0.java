package p664yy;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35854l;

/* JADX INFO: renamed from: yy.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C39866j0 implements Closeable {

    /* JADX INFO: renamed from: x */
    public static final String f172156x = StandardCharsets.UTF_8.name();

    /* JADX INFO: renamed from: w */
    public final HttpsURLConnection f172157w;

    public C39866j0(HttpsURLConnection httpsURLConnection) {
        this.f172157w = httpsURLConnection;
    }

    /* JADX INFO: renamed from: b */
    public final C39874n0 m127939b() throws IOException {
        HttpsURLConnection httpsURLConnection = this.f172157w;
        int responseCode = httpsURLConnection.getResponseCode();
        int responseCode2 = httpsURLConnection.getResponseCode();
        InputStream errorStream = (200 > responseCode2 || responseCode2 >= 300) ? httpsURLConnection.getErrorStream() : httpsURLConnection.getInputStream();
        String next = null;
        if (errorStream != null) {
            try {
                Scanner scannerUseDelimiter = new Scanner(errorStream, f172156x).useDelimiter("\\A");
                next = scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : null;
                errorStream.close();
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC35854l.m113829i(errorStream, th3);
                    throw th4;
                }
            }
        }
        Map<String, List<String>> headerFields = httpsURLConnection.getHeaderFields();
        AbstractC22676k.m65749i(headerFields, "getHeaderFields(...)");
        return new C39874n0(responseCode, next, headerFields);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        HttpsURLConnection httpsURLConnection = this.f172157w;
        int responseCode = httpsURLConnection.getResponseCode();
        InputStream errorStream = (200 > responseCode || responseCode >= 300) ? httpsURLConnection.getErrorStream() : httpsURLConnection.getInputStream();
        if (errorStream != null) {
            errorStream.close();
        }
        httpsURLConnection.disconnect();
    }
}
