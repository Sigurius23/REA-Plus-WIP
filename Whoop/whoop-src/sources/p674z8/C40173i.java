package p674z8;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import as.AbstractC1938b;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import live.hms.video.error.ErrorCodes;
import p284ko.C22636t;
import p389p0.C28539n0;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p690zr.C41009b1;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: z8.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C40173i extends AbstractC40166b {

    /* JADX INFO: renamed from: E */
    public final int f173362E;

    /* JADX INFO: renamed from: F */
    public final int f173363F;

    /* JADX INFO: renamed from: G */
    public final C28539n0 f173364G;

    /* JADX INFO: renamed from: H */
    public final C28539n0 f173365H;

    /* JADX INFO: renamed from: I */
    public C40171g f173366I;

    /* JADX INFO: renamed from: J */
    public HttpURLConnection f173367J;

    /* JADX INFO: renamed from: K */
    public InputStream f173368K;

    /* JADX INFO: renamed from: L */
    public boolean f173369L;

    /* JADX INFO: renamed from: M */
    public int f173370M;

    /* JADX INFO: renamed from: N */
    public long f173371N;

    /* JADX INFO: renamed from: O */
    public long f173372O;

    public C40173i(int i13, int i14, C28539n0 c28539n0) {
        super(true);
        this.f173362E = i13;
        this.f173363F = i14;
        this.f173364G = c28539n0;
        this.f173365H = new C28539n0(12);
    }

    @Override // p674z8.InterfaceC40170f
    public final void close() {
        try {
            InputStream inputStream = this.f173368K;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e5) {
                    int i13 = AbstractC38065t.f163031a;
                    throw new HttpDataSource$HttpDataSourceException(e5, ErrorCodes.InitAPIErrors.cServerErrors, 3);
                }
            }
            this.f173368K = null;
            m128890j();
            if (this.f173369L) {
                this.f173369L = false;
                m128884b();
            }
            this.f173367J = null;
            this.f173366I = null;
        } catch (Throwable th3) {
            this.f173368K = null;
            m128890j();
            if (this.f173369L) {
                this.f173369L = false;
                m128884b();
            }
            this.f173367J = null;
            this.f173366I = null;
            throw th3;
        }
    }

    @Override // p674z8.InterfaceC40170f
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f173367J;
        return httpURLConnection == null ? C41009b1.f176959G : new C22636t(httpURLConnection.getHeaderFields(), 1);
    }

    @Override // p674z8.InterfaceC40170f
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f173367J;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        C40171g c40171g = this.f173366I;
        if (c40171g != null) {
            return c40171g.f173343a;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m128890j() {
        HttpURLConnection httpURLConnection = this.f173367J;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e5) {
                AbstractC38046a.m121813h("DefaultHttpDataSource", "Unexpected error while disconnecting", e5);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final HttpURLConnection m128891l(URL url, int i13, byte[] bArr, long j7, long j13, boolean z4, boolean z13, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f173362E);
        httpURLConnection.setReadTimeout(this.f173363F);
        HashMap map2 = new HashMap();
        C28539n0 c28539n0 = this.f173364G;
        if (c28539n0 != null) {
            map2.putAll(c28539n0.m86836f());
        }
        map2.putAll(this.f173365H.m86836f());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = AbstractC40175k.f173377a;
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
        int i14 = C40171g.f173342i;
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

    /* JADX INFO: renamed from: o */
    public final void m128892o(long j7) throws IOException {
        if (j7 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j7 > 0) {
            int iMin = (int) Math.min(j7, 4096);
            InputStream inputStream = this.f173368K;
            int i13 = AbstractC38065t.f163031a;
            int i14 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), ErrorCodes.InitAPIErrors.cServerErrors, 1);
            }
            if (i14 == -1) {
                throw new HttpDataSource$HttpDataSourceException();
            }
            j7 -= (long) i14;
            m128883a(i14);
        }
    }

    @Override // p674z8.InterfaceC40170f
    public final long open(C40171g c40171g) throws HttpDataSource$HttpDataSourceException {
        boolean z4;
        long j7;
        long jMax;
        String str;
        this.f173366I = c40171g;
        this.f173372O = 0L;
        this.f173371N = 0L;
        m128885d();
        try {
            HttpURLConnection httpURLConnectionM128891l = m128891l(new URL(c40171g.f173343a.toString()), c40171g.f173344b, c40171g.f173345c, c40171g.f173347e, c40171g.f173348f, (c40171g.f173350h & 1) == 1, true, c40171g.f173346d);
            long j13 = c40171g.f173347e;
            long j14 = c40171g.f173348f;
            this.f173367J = httpURLConnectionM128891l;
            this.f173370M = httpURLConnectionM128891l.getResponseCode();
            httpURLConnectionM128891l.getResponseMessage();
            int i13 = this.f173370M;
            if (i13 < 200 || i13 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionM128891l.getHeaderFields();
                if (this.f173370M == 416) {
                    String headerField = httpURLConnectionM128891l.getHeaderField("Content-Range");
                    Pattern pattern = AbstractC40175k.f173377a;
                    if (TextUtils.isEmpty(headerField)) {
                        j7 = -1;
                        z4 = true;
                    } else {
                        Matcher matcher = AbstractC40175k.f173378b.matcher(headerField);
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
                        this.f173369L = z4;
                        m128886h(c40171g);
                        if (j14 != -1) {
                            return j14;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionM128891l.getErrorStream();
                try {
                    if (errorStream != null) {
                        AbstractC1938b.m5940b(errorStream);
                    } else {
                        int i14 = AbstractC38065t.f163031a;
                    }
                } catch (IOException unused) {
                    int i15 = AbstractC38065t.f163031a;
                }
                m128890j();
                throw new HttpDataSource$InvalidResponseCodeException(this.f173370M, this.f173370M == 416 ? new DataSourceException(2008) : null, headerFields);
            }
            httpURLConnectionM128891l.getContentType();
            if (this.f173370M != 200 || j13 == 0) {
                j13 = 0;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionM128891l.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase || j14 != -1) {
                this.f173371N = j14;
            } else {
                String headerField2 = httpURLConnectionM128891l.getHeaderField("Content-Length");
                String headerField3 = httpURLConnectionM128891l.getHeaderField("Content-Range");
                Pattern pattern2 = AbstractC40175k.f173377a;
                if (TextUtils.isEmpty(headerField2)) {
                    jMax = -1;
                } else {
                    try {
                        jMax = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        AbstractC38046a.m121812g("HttpUtil", "Unexpected Content-Length [" + headerField2 + "]");
                        jMax = -1;
                    }
                }
                if (!TextUtils.isEmpty(headerField3)) {
                    Matcher matcher2 = AbstractC40175k.f173377a.matcher(headerField3);
                    if (matcher2.matches()) {
                        try {
                            String strGroup2 = matcher2.group(2);
                            strGroup2.getClass();
                            long j15 = Long.parseLong(strGroup2);
                            String strGroup3 = matcher2.group(1);
                            strGroup3.getClass();
                            str = "]";
                            long j16 = (j15 - Long.parseLong(strGroup3)) + 1;
                            if (jMax < 0) {
                                jMax = j16;
                            } else if (jMax != j16) {
                                try {
                                    AbstractC38046a.m121826u("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + str);
                                    jMax = Math.max(jMax, j16);
                                } catch (NumberFormatException unused3) {
                                    AbstractC38046a.m121812g("HttpUtil", "Unexpected Content-Range [" + headerField3 + str);
                                }
                            }
                        } catch (NumberFormatException unused4) {
                            str = "]";
                        }
                    }
                }
                this.f173371N = jMax != -1 ? jMax - j13 : -1L;
            }
            try {
                this.f173368K = httpURLConnectionM128891l.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.f173368K = new GZIPInputStream(this.f173368K);
                }
                this.f173369L = true;
                m128886h(c40171g);
                try {
                    m128892o(j13);
                    return this.f173371N;
                } catch (IOException e5) {
                    m128890j();
                    if (e5 instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e5);
                    }
                    throw new HttpDataSource$HttpDataSourceException(e5, ErrorCodes.InitAPIErrors.cServerErrors, 1);
                }
            } catch (IOException e13) {
                m128890j();
                throw new HttpDataSource$HttpDataSourceException(e13, ErrorCodes.InitAPIErrors.cServerErrors, 1);
            }
        } catch (IOException e14) {
            m128890j();
            throw HttpDataSource$HttpDataSourceException.m5053b(e14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // p516u8.InterfaceC34594h
    public final int read(byte[] bArr, int i13, int i14) throws HttpDataSource$HttpDataSourceException {
        int i15;
        if (i14 == 0) {
            return 0;
        }
        try {
            long j7 = this.f173371N;
            if (j7 != -1) {
                long j13 = j7 - this.f173372O;
                if (j13 != 0) {
                    i14 = (int) Math.min(i14, j13);
                    InputStream inputStream = this.f173368K;
                    int i16 = AbstractC38065t.f163031a;
                    i15 = inputStream.read(bArr, i13, i14);
                    if (i15 != -1) {
                        this.f173372O += (long) i15;
                        m128883a(i15);
                        return i15;
                    }
                }
            } else {
                InputStream inputStream2 = this.f173368K;
                int i17 = AbstractC38065t.f163031a;
                i15 = inputStream2.read(bArr, i13, i14);
                if (i15 != -1) {
                    this.f173372O += (long) i15;
                    m128883a(i15);
                    return i15;
                }
            }
            return -1;
        } catch (IOException e5) {
            int i18 = AbstractC38065t.f163031a;
            throw HttpDataSource$HttpDataSourceException.m5053b(e5, 2);
        }
    }
}
