package io.sentry.transport;

import androidx.room.AbstractC1772c1;
import com.google.crypto.tink.internal.C5101l0;
import io.sentry.C20437n6;
import io.sentry.C20513q6;
import io.sentry.EnumC20418m;
import io.sentry.EnumC20436n5;
import io.sentry.util.AbstractC20591m;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: io.sentry.transport.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C20555e {

    /* JADX INFO: renamed from: e */
    public static final Charset f77026e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final Proxy f77027a;

    /* JADX INFO: renamed from: b */
    public final C5101l0 f77028b;

    /* JADX INFO: renamed from: c */
    public final C20513q6 f77029c;

    /* JADX INFO: renamed from: d */
    public final C20567q f77030d;

    /* JADX WARN: Code duplicated, block: B:11:0x0052  */
    public C20555e(C20513q6 c20513q6, C5101l0 c5101l0, C20567q c20567q) {
        Proxy proxy;
        this.f77028b = c5101l0;
        this.f77029c = c20513q6;
        this.f77030d = c20567q;
        C20437n6 proxy2 = c20513q6.getProxy();
        if (proxy2 != null) {
            String strM56635c = proxy2.m56635c();
            String strM56633a = proxy2.m56633a();
            if (strM56635c == null || strM56633a == null) {
                proxy = null;
            } else {
                try {
                    proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(strM56633a, Integer.parseInt(strM56635c)));
                } catch (NumberFormatException e5) {
                    this.f77029c.getLogger().mo16058i(EnumC20436n5.ERROR, e5, "Failed to parse Sentry Proxy port: " + proxy2.m56635c() + ". Proxy is ignored", new Object[0]);
                    proxy = null;
                }
            }
        } else {
            proxy = null;
        }
        this.f77027a = proxy;
        if (proxy == null || c20513q6.getProxy() == null) {
            return;
        }
        String strM56636d = c20513q6.getProxy().m56636d();
        String strM56634b = c20513q6.getProxy().m56634b();
        if (strM56636d == null || strM56634b == null) {
            return;
        }
        Authenticator.setDefault(new C20562l(strM56636d, strM56634b));
    }

    /* JADX INFO: renamed from: a */
    public static void m56682a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static String m56683b(HttpURLConnection httpURLConnection) {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f77026e));
                try {
                    StringBuilder sb4 = new StringBuilder();
                    boolean z4 = true;
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!z4) {
                            sb4.append("\n");
                        }
                        sb4.append(line);
                        z4 = false;
                        if (errorStream != null) {
                            try {
                                errorStream.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                        }
                        throw th;
                    }
                    String string = sb4.toString();
                    bufferedReader.close();
                    if (errorStream != null) {
                        errorStream.close();
                    }
                    return string;
                } catch (Throwable th4) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                if (errorStream != null) {
                    errorStream.close();
                }
                throw th6;
            }
        } catch (IOException unused) {
            return "Failed to obtain error message while analyzing send failure.";
        }
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC1772c1 m56684c(HttpURLConnection httpURLConnection) {
        C20513q6 c20513q6 = this.f77029c;
        try {
            int responseCode = httpURLConnection.getResponseCode();
            m56686e(httpURLConnection, responseCode);
            if (responseCode == 200) {
                c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Envelope sent successfully.", new Object[0]);
                return C20570t.f77050a;
            }
            if (responseCode == 413) {
                c20513q6.getLogger().mo16066m(EnumC20436n5.ERROR, "Envelope was discarded by the server because it was too large. Consider reducing the size of events, breadcrumbs, or attachments. You can use the `SentryOptions.onOversizedEvent` callback to customize how oversized events are handled.", new Object[0]);
            } else {
                c20513q6.getLogger().mo16066m(EnumC20436n5.ERROR, "Request failed, API returned %s", Integer.valueOf(responseCode));
            }
            if (c20513q6.isDebug()) {
                c20513q6.getLogger().mo16066m(EnumC20436n5.ERROR, "%s", m56683b(httpURLConnection));
            }
            return new C20569s(responseCode);
        } catch (IOException e5) {
            c20513q6.getLogger().mo16058i(EnumC20436n5.ERROR, e5, "Error reading and logging the response stream", new Object[0]);
            return new C20569s(-1);
        } finally {
            m56682a(httpURLConnection);
        }
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC1772c1 m56685d(C5101l0 c5101l0) {
        C20513q6 c20513q6 = this.f77029c;
        c20513q6.getSocketTagger().mo56060c();
        C5101l0 c5101l1 = this.f77028b;
        URL url = (URL) c5101l1.f21443x;
        Proxy proxy = this.f77027a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) (proxy == null ? url.openConnection() : url.openConnection(proxy));
        for (Map.Entry entry : ((HashMap) c5101l1.f21444y).entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.setConnectTimeout(c20513q6.getConnectionTimeoutMillis());
        httpURLConnection.setReadTimeout(c20513q6.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = c20513q6.getSslSocketFactory();
        if ((httpURLConnection instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sslSocketFactory);
        }
        httpURLConnection.connect();
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    c20513q6.getSerializer().mo56238d(c5101l0, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } catch (Throwable th3) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
        } catch (Throwable th7) {
            try {
                c20513q6.getLogger().mo16058i(EnumC20436n5.ERROR, th7, "An exception occurred while submitting the envelope to the Sentry server.", new Object[0]);
            } finally {
                m56684c(httpURLConnection);
                c20513q6.getSocketTagger().mo56057a();
            }
        }
        return m56684c(httpURLConnection);
    }

    /* JADX INFO: renamed from: e */
    public final void m56686e(HttpURLConnection httpURLConnection, int i13) {
        long j7;
        String[] strArr;
        long j13;
        String[] strArr2;
        String string;
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        String headerField2 = httpURLConnection.getHeaderField("X-Sentry-Rate-Limits");
        C20567q c20567q = this.f77030d;
        C20513q6 c20513q6 = c20567q.f77045x;
        C20554d c20554d = c20567q.f77044w;
        double d3 = 1000.0d;
        if (headerField2 == null) {
            if (i13 == 429) {
                if (headerField != null) {
                    try {
                        j7 = (long) (Double.parseDouble(headerField) * 1000.0d);
                    } catch (NumberFormatException unused) {
                        j7 = 60000;
                    }
                } else {
                    j7 = 60000;
                }
                c20554d.getClass();
                c20567q.m56687b(EnumC20418m.All, new Date(System.currentTimeMillis() + j7));
                return;
            }
            return;
        }
        int i14 = -1;
        String[] strArrSplit = headerField2.split(",", -1);
        int length = strArrSplit.length;
        int i15 = 0;
        int i16 = 0;
        while (i16 < length) {
            String[] strArrSplit2 = strArrSplit[i16].replace(" ", "").split(":", i14);
            if (strArrSplit2.length > 0) {
                String str = strArrSplit2[i15];
                if (str != null) {
                    try {
                        j13 = (long) (Double.parseDouble(str) * d3);
                    } catch (NumberFormatException unused2) {
                        j13 = 60000;
                    }
                } else {
                    j13 = 60000;
                }
                if (strArrSplit2.length > 1) {
                    String str2 = strArrSplit2[1];
                    c20554d.getClass();
                    Date date = new Date(System.currentTimeMillis() + j13);
                    if (str2 == null || str2.isEmpty()) {
                        strArr = strArrSplit;
                        c20567q.m56687b(EnumC20418m.All, date);
                    } else {
                        String[] strArrSplit3 = str2.split(";", i14);
                        int length2 = strArrSplit3.length;
                        int i17 = i15;
                        while (i17 < length2) {
                            String str3 = strArrSplit3[i17];
                            EnumC20418m enumC20418mValueOf = EnumC20418m.Unknown;
                            try {
                                Charset charset = AbstractC20591m.f77097a;
                                if (str3 == null || str3.isEmpty()) {
                                    string = str3;
                                } else {
                                    String[] strArrSplit4 = AbstractC20591m.f77098b.split(str3, i14);
                                    StringBuilder sb4 = new StringBuilder();
                                    for (String str4 : strArrSplit4) {
                                        sb4.append(AbstractC20591m.m56724a(str4));
                                    }
                                    string = sb4.toString();
                                }
                                if (string != null) {
                                    enumC20418mValueOf = EnumC20418m.valueOf(string);
                                    strArr2 = strArrSplit;
                                } else {
                                    strArr2 = strArrSplit;
                                    try {
                                        c20513q6.getLogger().mo16066m(EnumC20436n5.ERROR, "Couldn't capitalize: %s", str3);
                                    } catch (IllegalArgumentException e5) {
                                        e = e5;
                                        c20513q6.getLogger().mo16058i(EnumC20436n5.INFO, e, "Unknown category: %s", str3);
                                    }
                                }
                            } catch (IllegalArgumentException e13) {
                                e = e13;
                                strArr2 = strArrSplit;
                            }
                            if (!EnumC20418m.Unknown.equals(enumC20418mValueOf)) {
                                c20567q.m56687b(enumC20418mValueOf, date);
                            }
                            i17++;
                            strArrSplit = strArr2;
                            i14 = -1;
                        }
                        strArr = strArrSplit;
                    }
                } else {
                    strArr = strArrSplit;
                }
            } else {
                strArr = strArrSplit;
                d3 = d3;
            }
            i16++;
            d3 = d3;
            strArrSplit = strArr;
            i14 = -1;
            i15 = 0;
        }
    }
}
