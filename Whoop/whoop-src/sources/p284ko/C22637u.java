package p284ko;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import io.sentry.internal.debugmeta.C20378c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import live.hms.video.error.ErrorCodes;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p690zr.C41009b1;
import q63.AbstractC30007c;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: ko.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C22637u extends AbstractC22616f {

    /* JADX INFO: renamed from: E */
    public final int f89068E;

    /* JADX INFO: renamed from: F */
    public final int f89069F;

    /* JADX INFO: renamed from: G */
    public final C20378c f89070G;

    /* JADX INFO: renamed from: H */
    public final C20378c f89071H;

    /* JADX INFO: renamed from: I */
    public HttpURLConnection f89072I;

    /* JADX INFO: renamed from: J */
    public InputStream f89073J;

    /* JADX INFO: renamed from: K */
    public boolean f89074K;

    /* JADX INFO: renamed from: L */
    public int f89075L;

    /* JADX INFO: renamed from: M */
    public long f89076M;

    /* JADX INFO: renamed from: N */
    public long f89077N;

    public C22637u(int i13, int i14, C20378c c20378c) {
        super(true);
        this.f89068E = i13;
        this.f89069F = i14;
        this.f89070G = c20378c;
        this.f89071H = new C20378c(23, (byte) 0);
    }

    /* JADX INFO: renamed from: o */
    public static void m65580o(HttpURLConnection httpURLConnection, long j7) {
        int i13;
        if (httpURLConnection == null || (i13 = AbstractC24567y.f95875a) < 19 || i13 > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j7 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j7 <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p284ko.InterfaceC22628l
    public final void close() {
        try {
            InputStream inputStream = this.f89073J;
            if (inputStream != null) {
                long j7 = this.f89076M;
                long j13 = -1;
                if (j7 != -1) {
                    j13 = j7 - this.f89077N;
                }
                m65580o(this.f89072I, j13);
                try {
                    inputStream.close();
                } catch (IOException e5) {
                    int i13 = AbstractC24567y.f95875a;
                    throw new HttpDataSource$HttpDataSourceException(e5, ErrorCodes.InitAPIErrors.cServerErrors, 3);
                }
            }
            this.f89073J = null;
            m65581j();
            if (this.f89074K) {
                this.f89074K = false;
                m65558b();
            }
        } catch (Throwable th3) {
            this.f89073J = null;
            m65581j();
            if (this.f89074K) {
                this.f89074K = false;
                m65558b();
            }
            throw th3;
        }
    }

    @Override // p284ko.InterfaceC22628l
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f89072I;
        return httpURLConnection == null ? C41009b1.f176959G : new C22636t(httpURLConnection.getHeaderFields(), 0);
    }

    @Override // p284ko.InterfaceC22628l
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f89072I;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX INFO: renamed from: j */
    public final void m65581j() {
        HttpURLConnection httpURLConnection = this.f89072I;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e5) {
                AbstractC24543a.m71578n("DefaultHttpDataSource", "Unexpected error while disconnecting", e5);
            }
            this.f89072I = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final HttpURLConnection m65582l(URL url, int i13, byte[] bArr, long j7, long j13, boolean z4, boolean z13, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f89068E);
        httpURLConnection.setReadTimeout(this.f89069F);
        HashMap map2 = new HashMap();
        C20378c c20378c = this.f89070G;
        if (c20378c != null) {
            map2.putAll(c20378c.m56593v());
        }
        map2.putAll(this.f89071H.m56593v());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = AbstractC22640x.f89082a;
        if (j7 == 0 && j13 == -1) {
            string = null;
        } else {
            StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "bytes=", "-");
            if (j13 != -1) {
                sbM125596b.append((j7 + j13) - 1);
            }
            string = sbM125596b.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z4 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z13);
        httpURLConnection.setDoOutput(bArr != null);
        int i14 = C22630n.f89018h;
        if (i13 == 1) {
            str = "GET";
        } else if (i13 == 2) {
            str = "POST";
        } else {
            if (i13 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: q */
    public final void m65583q(long j7) throws IOException {
        if (j7 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j7 > 0) {
            int iMin = (int) Math.min(j7, 4096);
            InputStream inputStream = this.f89073J;
            int i13 = AbstractC24567y.f95875a;
            int i14 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), ErrorCodes.InitAPIErrors.cServerErrors, 1);
            }
            if (i14 == -1) {
                throw new HttpDataSource$HttpDataSourceException(2008);
            }
            j7 -= (long) i14;
            m65557a(i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // p284ko.InterfaceC22622i, p516u8.InterfaceC34594h
    public final int read(byte[] bArr, int i13, int i14) throws HttpDataSource$HttpDataSourceException {
        int i15;
        if (i14 == 0) {
            return 0;
        }
        try {
            long j7 = this.f89076M;
            if (j7 != -1) {
                long j13 = j7 - this.f89077N;
                if (j13 != 0) {
                    i14 = (int) Math.min(i14, j13);
                    InputStream inputStream = this.f89073J;
                    int i16 = AbstractC24567y.f95875a;
                    i15 = inputStream.read(bArr, i13, i14);
                    if (i15 != -1) {
                        this.f89077N += (long) i15;
                        m65557a(i15);
                        return i15;
                    }
                }
            } else {
                InputStream inputStream2 = this.f89073J;
                int i17 = AbstractC24567y.f95875a;
                i15 = inputStream2.read(bArr, i13, i14);
                if (i15 != -1) {
                    this.f89077N += (long) i15;
                    m65557a(i15);
                    return i15;
                }
            }
            return -1;
        } catch (IOException e5) {
            int i18 = AbstractC24567y.f95875a;
            throw HttpDataSource$HttpDataSourceException.m15582a(e5, 2);
        }
    }

    @Override // p284ko.InterfaceC22628l
    /* JADX INFO: renamed from: z */
    public final long mo65551z(C22630n c22630n) throws HttpDataSource$HttpDataSourceException {
        boolean z4;
        long j7;
        long jMax;
        this.f89077N = 0L;
        this.f89076M = 0L;
        m65559d();
        try {
            HttpURLConnection httpURLConnectionM65582l = m65582l(new URL(c22630n.f89019a.toString()), c22630n.f89020b, c22630n.f89021c, c22630n.f89023e, c22630n.f89024f, (c22630n.f89025g & 1) == 1, true, c22630n.f89022d);
            long j13 = c22630n.f89023e;
            long j14 = c22630n.f89024f;
            this.f89072I = httpURLConnectionM65582l;
            this.f89075L = httpURLConnectionM65582l.getResponseCode();
            httpURLConnectionM65582l.getResponseMessage();
            int i13 = this.f89075L;
            if (i13 < 200 || i13 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionM65582l.getHeaderFields();
                if (this.f89075L == 416) {
                    String headerField = httpURLConnectionM65582l.getHeaderField("Content-Range");
                    Pattern pattern = AbstractC22640x.f89082a;
                    if (TextUtils.isEmpty(headerField)) {
                        j7 = -1;
                        z4 = true;
                    } else {
                        Matcher matcher = AbstractC22640x.f89083b.matcher(headerField);
                        z4 = true;
                        if (matcher.matches()) {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            j7 = Long.parseLong(strGroup);
                        } else {
                            j7 = -1;
                        }
                    }
                    if (j13 == j7) {
                        this.f89074K = z4;
                        m65560h(c22630n);
                        if (j14 != -1) {
                            return j14;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionM65582l.getErrorStream();
                try {
                    if (errorStream != null) {
                        int i14 = AbstractC24567y.f95875a;
                        byte[] bArr = new byte[4096];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int i15 = errorStream.read(bArr);
                            if (i15 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i15);
                        }
                        byteArrayOutputStream.toByteArray();
                    } else {
                        int i16 = AbstractC24567y.f95875a;
                    }
                } catch (IOException unused) {
                    int i17 = AbstractC24567y.f95875a;
                }
                m65581j();
                throw new HttpDataSource$InvalidResponseCodeException(this.f89075L, this.f89075L == 416 ? new DataSourceException(2008) : null, headerFields);
            }
            httpURLConnectionM65582l.getContentType();
            if (this.f89075L != 200 || j13 == 0) {
                j13 = 0;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionM65582l.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase || j14 != -1) {
                this.f89076M = j14;
            } else {
                String headerField2 = httpURLConnectionM65582l.getHeaderField("Content-Length");
                String headerField3 = httpURLConnectionM65582l.getHeaderField("Content-Range");
                Pattern pattern2 = AbstractC22640x.f89082a;
                if (TextUtils.isEmpty(headerField2)) {
                    jMax = -1;
                } else {
                    try {
                        jMax = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(28, headerField2));
                        sb4.append("Unexpected Content-Length [");
                        sb4.append(headerField2);
                        sb4.append("]");
                        Log.e("HttpUtil", sb4.toString());
                        jMax = -1;
                    }
                }
                if (!TextUtils.isEmpty(headerField3)) {
                    Matcher matcher2 = AbstractC22640x.f89082a.matcher(headerField3);
                    if (matcher2.matches()) {
                        try {
                            String strGroup2 = matcher2.group(2);
                            strGroup2.getClass();
                            long j15 = Long.parseLong(strGroup2);
                            String strGroup3 = matcher2.group(1);
                            strGroup3.getClass();
                            long j16 = (j15 - Long.parseLong(strGroup3)) + 1;
                            if (jMax < 0) {
                                jMax = j16;
                            } else if (jMax != j16) {
                                StringBuilder sb5 = new StringBuilder(String.valueOf(headerField2).length() + 26 + String.valueOf(headerField3).length());
                                sb5.append("Inconsistent headers [");
                                sb5.append(headerField2);
                                sb5.append("] [");
                                sb5.append(headerField3);
                                sb5.append("]");
                                Log.w("HttpUtil", sb5.toString());
                                jMax = Math.max(jMax, j16);
                            }
                        } catch (NumberFormatException unused3) {
                            StringBuilder sb6 = new StringBuilder(AbstractC30007c.m91832b(27, headerField3));
                            sb6.append("Unexpected Content-Range [");
                            sb6.append(headerField3);
                            sb6.append("]");
                            Log.e("HttpUtil", sb6.toString());
                        }
                    }
                }
                this.f89076M = jMax != -1 ? jMax - j13 : -1L;
            }
            try {
                this.f89073J = httpURLConnectionM65582l.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.f89073J = new GZIPInputStream(this.f89073J);
                }
                this.f89074K = true;
                m65560h(c22630n);
                try {
                    m65583q(j13);
                    return this.f89076M;
                } catch (IOException e5) {
                    m65581j();
                    if (e5 instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e5);
                    }
                    throw new HttpDataSource$HttpDataSourceException(e5, ErrorCodes.InitAPIErrors.cServerErrors, 1);
                }
            } catch (IOException e13) {
                m65581j();
                throw new HttpDataSource$HttpDataSourceException(e13, ErrorCodes.InitAPIErrors.cServerErrors, 1);
            }
        } catch (IOException e14) {
            m65581j();
            throw HttpDataSource$HttpDataSourceException.m15582a(e14, 1);
        }
    }
}
