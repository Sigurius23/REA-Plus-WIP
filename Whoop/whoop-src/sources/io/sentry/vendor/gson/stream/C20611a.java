package io.sentry.vendor.gson.stream;

import androidx.health.platform.client.proto.C1533u;
import ih0.AbstractC18489d0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import live.hms.video.factories.MediaConstraintsFactory;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: io.sentry.vendor.gson.stream.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C20611a implements Closeable {

    /* JADX INFO: renamed from: I */
    public long f77132I;

    /* JADX INFO: renamed from: J */
    public int f77133J;

    /* JADX INFO: renamed from: K */
    public String f77134K;

    /* JADX INFO: renamed from: L */
    public int[] f77135L;

    /* JADX INFO: renamed from: N */
    public String[] f77137N;

    /* JADX INFO: renamed from: O */
    public int[] f77138O;

    /* JADX INFO: renamed from: w */
    public final Reader f77139w;

    /* JADX INFO: renamed from: x */
    public boolean f77140x = false;

    /* JADX INFO: renamed from: y */
    public final char[] f77141y = new char[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];

    /* JADX INFO: renamed from: z */
    public int f77142z = 0;

    /* JADX INFO: renamed from: E */
    public int f77128E = 0;

    /* JADX INFO: renamed from: F */
    public int f77129F = 0;

    /* JADX INFO: renamed from: G */
    public int f77130G = 0;

    /* JADX INFO: renamed from: H */
    public int f77131H = 0;

    /* JADX INFO: renamed from: M */
    public int f77136M = 1;

    public C20611a(Reader reader) {
        int[] iArr = new int[32];
        this.f77135L = iArr;
        iArr[0] = 6;
        this.f77137N = new String[32];
        this.f77138O = new int[32];
        this.f77139w = reader;
    }

    /* JADX INFO: renamed from: F0 */
    public final void m56736F0(String str) throws MalformedJsonException {
        StringBuilder sbM53374o = AbstractC18489d0.m53374o(str);
        sbM53374o.append(m56745m());
        throw new MalformedJsonException(sbM53374o.toString());
    }

    /* JADX INFO: renamed from: J */
    public final void m56737J() {
        int iM56742h = this.f77131H;
        if (iM56742h == 0) {
            iM56742h = m56742h();
        }
        if (iM56742h != 7) {
            throw new IllegalStateException("Expected null but was " + peek() + m56745m());
        }
        this.f77131H = 0;
        int[] iArr = this.f77138O;
        int i13 = this.f77136M - 1;
        iArr[i13] = iArr[i13] + 1;
    }

    /* JADX INFO: renamed from: T */
    public final String m56738T(char c3) throws MalformedJsonException {
        int i13;
        char[] cArr;
        StringBuilder sb4 = null;
        do {
            int i14 = this.f77142z;
            int i15 = this.f77128E;
            while (true) {
                int i16 = i15;
                i13 = i14;
                while (true) {
                    cArr = this.f77141y;
                    if (i14 < i16) {
                        int i17 = i14 + 1;
                        char c7 = cArr[i14];
                        if (c7 == c3) {
                            this.f77142z = i17;
                            int i18 = (i17 - i13) - 1;
                            if (sb4 == null) {
                                return new String(cArr, i13, i18);
                            }
                            sb4.append(cArr, i13, i18);
                            return sb4.toString();
                        }
                        if (c7 == '\\') {
                            this.f77142z = i17;
                            int i19 = i17 - i13;
                            int i24 = i19 - 1;
                            if (sb4 == null) {
                                sb4 = new StringBuilder(Math.max(i19 * 2, 16));
                            }
                            sb4.append(cArr, i13, i24);
                            sb4.append(m56746o0());
                            i14 = this.f77142z;
                            i15 = this.f77128E;
                        } else {
                            if (c7 == '\n') {
                                this.f77129F++;
                                this.f77130G = i17;
                            }
                            i14 = i17;
                        }
                    }
                }
            }
            if (sb4 == null) {
                sb4 = new StringBuilder(Math.max((i14 - i13) * 2, 16));
            }
            sb4.append(cArr, i13, i14 - i13);
            this.f77142z = i14;
        } while (m56743i(1));
        m56736F0("Unterminated string");
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX INFO: renamed from: a0 */
    public final String m56739a0() throws MalformedJsonException {
        String string;
        StringBuilder sb4 = null;
        int i13 = 0;
        while (true) {
            int i14 = 0;
            while (true) {
                int i15 = this.f77142z;
                int i16 = i15 + i14;
                int i17 = this.f77128E;
                char[] cArr = this.f77141y;
                if (i16 < i17) {
                    char c3 = cArr[i15 + i14];
                    if (c3 != '\t' && c3 != '\n' && c3 != '\f' && c3 != '\r' && c3 != ' ') {
                        if (c3 != '#') {
                            if (c3 != ',') {
                                if (c3 != '/' && c3 != '=') {
                                    if (c3 != '{' && c3 != '}' && c3 != ':') {
                                        if (c3 != ';') {
                                            switch (c3) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i14++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        m56740b();
                    }
                    i13 = i14;
                } else if (i14 >= cArr.length) {
                    if (sb4 == null) {
                        sb4 = new StringBuilder(Math.max(i14, 16));
                    }
                    sb4.append(cArr, this.f77142z, i14);
                    this.f77142z += i14;
                    if (!m56743i(1)) {
                    }
                } else if (!m56743i(i14 + 1)) {
                    i13 = i14;
                }
                if (sb4 == null) {
                    string = new String(cArr, this.f77142z, i13);
                } else {
                    sb4.append(cArr, this.f77142z, i13);
                    string = sb4.toString();
                }
                this.f77142z += i13;
                return string;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m56740b() throws MalformedJsonException {
        if (this.f77140x) {
            return;
        }
        m56736F0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m56741b0(int i13) {
        int i14 = this.f77136M;
        int[] iArr = this.f77135L;
        if (i14 == iArr.length) {
            int i15 = i14 * 2;
            this.f77135L = Arrays.copyOf(iArr, i15);
            this.f77138O = Arrays.copyOf(this.f77138O, i15);
            this.f77137N = (String[]) Arrays.copyOf(this.f77137N, i15);
        }
        int[] iArr2 = this.f77135L;
        int i16 = this.f77136M;
        this.f77136M = i16 + 1;
        iArr2[i16] = i13;
    }

    public final void beginArray() {
        int iM56742h = this.f77131H;
        if (iM56742h == 0) {
            iM56742h = m56742h();
        }
        if (iM56742h == 3) {
            m56741b0(1);
            this.f77138O[this.f77136M - 1] = 0;
            this.f77131H = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + peek() + m56745m());
        }
    }

    public final void beginObject() {
        int iM56742h = this.f77131H;
        if (iM56742h == 0) {
            iM56742h = m56742h();
        }
        if (iM56742h == 1) {
            m56741b0(3);
            this.f77131H = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + peek() + m56745m());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f77131H = 0;
        this.f77135L[0] = 8;
        this.f77136M = 1;
        this.f77139w.close();
    }

    public final void endArray() {
        int iM56742h = this.f77131H;
        if (iM56742h == 0) {
            iM56742h = m56742h();
        }
        if (iM56742h != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + peek() + m56745m());
        }
        int i13 = this.f77136M;
        this.f77136M = i13 - 1;
        int[] iArr = this.f77138O;
        int i14 = i13 - 2;
        iArr[i14] = iArr[i14] + 1;
        this.f77131H = 0;
    }

    public final void endObject() {
        int iM56742h = this.f77131H;
        if (iM56742h == 0) {
            iM56742h = m56742h();
        }
        if (iM56742h != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + peek() + m56745m());
        }
        int i13 = this.f77136M;
        int i14 = i13 - 1;
        this.f77136M = i14;
        this.f77137N[i14] = null;
        int[] iArr = this.f77138O;
        int i15 = i13 - 2;
        iArr[i15] = iArr[i15] + 1;
        this.f77131H = 0;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x017d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:116:0x017e  */
    /* JADX WARN: Code duplicated, block: B:119:0x018d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0193  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a6 A[PHI: r2 r4
      0x01a6: PHI (r2v44 int) = (r2v43 int), (r2v46 int) binds: [B:118:0x018b, B:126:0x01a0] A[DONT_GENERATE, DONT_INLINE]
      0x01a6: PHI (r4v10 int) = (r4v9 int), (r4v12 int) binds: [B:118:0x018b, B:126:0x01a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:129:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:171:0x021a  */
    /* JADX WARN: Code duplicated, block: B:172:0x021c  */
    /* JADX WARN: Code duplicated, block: B:184:0x023d A[DONT_INVERT, PHI: r9
      0x023d: PHI (r9v25 int) = (r9v24 int), (r9v27 int) binds: [B:170:0x0218, B:176:0x0225] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:185:0x023f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0262  */
    /* JADX WARN: Code duplicated, block: B:200:0x0268  */
    /* JADX WARN: Code duplicated, block: B:203:0x026d  */
    /* JADX WARN: Code duplicated, block: B:208:0x027c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:209:0x027d  */
    /* JADX WARN: Code duplicated, block: B:211:0x0287  */
    /* JADX WARN: Code duplicated, block: B:213:0x028d  */
    /* JADX WARN: Code duplicated, block: B:223:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:232:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:234:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:275:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ea  */
    /* JADX INFO: renamed from: h */
    public final int m56742h() throws IOException {
        int iM56749x;
        int i13;
        int iM56749x2;
        int i14;
        String str;
        String str2;
        int i15;
        char c3;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z4;
        char c7;
        long j7;
        int i24;
        int i25;
        int i26;
        int i27;
        int[] iArr = this.f77135L;
        int i28 = 1;
        int i29 = this.f77136M - 1;
        int i34 = iArr[i29];
        char[] cArr = this.f77141y;
        if (i34 == 1) {
            iArr[i29] = 2;
        } else if (i34 == 2) {
            int iM56749x3 = m56749x(true);
            if (iM56749x3 != 44) {
                if (iM56749x3 != 59) {
                    if (iM56749x3 == 93) {
                        this.f77131H = 4;
                        return 4;
                    }
                    m56736F0("Unterminated array");
                    throw null;
                }
                m56740b();
            }
        } else {
            if (i34 == 3 || i34 == 5) {
                iArr[i29] = 4;
                if (i34 == 5 && (iM56749x = m56749x(true)) != 44) {
                    if (iM56749x != 59) {
                        if (iM56749x == 125) {
                            this.f77131H = 2;
                            return 2;
                        }
                        m56736F0("Unterminated object");
                        throw null;
                    }
                    m56740b();
                }
                int iM56749x4 = m56749x(true);
                if (iM56749x4 == 34) {
                    this.f77131H = 13;
                    return 13;
                }
                if (iM56749x4 == 39) {
                    m56740b();
                    this.f77131H = 12;
                    return 12;
                }
                if (iM56749x4 == 125) {
                    if (i34 != 5) {
                        this.f77131H = 2;
                        return 2;
                    }
                    m56736F0("Expected name");
                    throw null;
                }
                m56740b();
                this.f77142z--;
                if (m56744k((char) iM56749x4)) {
                    this.f77131H = 14;
                    return 14;
                }
                m56736F0("Expected name");
                throw null;
            }
            if (i34 != 4) {
                if (i34 == 6) {
                    if (this.f77140x) {
                        m56749x(true);
                        int i35 = this.f77142z;
                        int i36 = i35 - 1;
                        this.f77142z = i36;
                        if ((i35 + 4 <= this.f77128E || m56743i(5)) && cArr[i36] == ')' && cArr[i35] == ']' && cArr[i35 + 1] == '}' && cArr[i35 + 2] == '\'' && cArr[i35 + 3] == '\n') {
                            this.f77142z += 5;
                        }
                    }
                    this.f77135L[this.f77136M - 1] = 7;
                } else if (i34 == 7) {
                    i13 = 0;
                    if (m56749x(false) == -1) {
                        this.f77131H = 17;
                        return 17;
                    }
                    m56740b();
                    this.f77142z--;
                } else {
                    i13 = 0;
                    if (i34 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iM56749x2 = m56749x(true);
                if (iM56749x2 != 34) {
                    this.f77131H = 9;
                    return 9;
                }
                if (iM56749x2 != 39) {
                    m56740b();
                    this.f77131H = 8;
                    return 8;
                }
                if (iM56749x2 != 44 || iM56749x2 == 59) {
                    i14 = 1;
                } else {
                    if (iM56749x2 == 91) {
                        this.f77131H = 3;
                        return 3;
                    }
                    if (iM56749x2 != 93) {
                        if (iM56749x2 == 123) {
                            this.f77131H = 1;
                            return 1;
                        }
                        int i37 = this.f77142z - 1;
                        this.f77142z = i37;
                        char c14 = cArr[i37];
                        if (c14 == 't' || c14 == 'T') {
                            str = MediaConstraintsFactory.kValueTrue;
                            str2 = "TRUE";
                            i15 = 5;
                        } else {
                            if (c14 != 'f' && c14 != 'F') {
                                if (c14 != 'n' && c14 != 'N') {
                                    i15 = i13;
                                    break;
                                }
                                str = "null";
                                str2 = "NULL";
                                i15 = 7;
                                if (i15 != 0) {
                                    return i15;
                                }
                                i16 = this.f77142z;
                                i17 = this.f77128E;
                                i18 = i13;
                                i19 = i18;
                                int i38 = i19;
                                z4 = true;
                                long j13 = 0;
                                while (true) {
                                    if (i16 + i19 != i17) {
                                        c7 = cArr[i16 + i19];
                                        j7 = 0;
                                        if (c7 != '+') {
                                            if (c7 != 'E' || c7 == 'e') {
                                                i24 = i17;
                                                if (i18 != 2 || i18 == 4) {
                                                    i18 = 5;
                                                    i19++;
                                                    i17 = i24;
                                                    i28 = 1;
                                                }
                                            } else if (c7 == '-') {
                                                i24 = i17;
                                                i25 = 6;
                                                if (i18 == 0) {
                                                    i18 = 1;
                                                    i38 = 1;
                                                } else {
                                                    if (i18 != 5) {
                                                    }
                                                    i18 = i25;
                                                }
                                                i19++;
                                                i17 = i24;
                                                i28 = 1;
                                            } else if (c7 == '.') {
                                                i24 = i17;
                                                if (i18 == 2) {
                                                    i18 = 3;
                                                    i19++;
                                                    i17 = i24;
                                                    i28 = 1;
                                                }
                                            } else if (c7 >= '0' && c7 <= '9') {
                                                if (i18 == i28 || i18 == 0) {
                                                    i24 = i17;
                                                    j13 = -(c7 - '0');
                                                    i18 = 2;
                                                } else if (i18 != 2) {
                                                    i24 = i17;
                                                    if (i18 == 3) {
                                                        i18 = 4;
                                                    } else if (i18 == 5 || i18 == 6) {
                                                        i18 = 7;
                                                    }
                                                } else if (j13 != 0) {
                                                    i24 = i17;
                                                    long j14 = (10 * j13) - ((long) (c7 - '0'));
                                                    z4 &= j13 > -922337203685477580L || (j13 == -922337203685477580L && j14 < j13);
                                                    j13 = j14;
                                                }
                                                i19++;
                                                i17 = i24;
                                                i28 = 1;
                                            } else if (!m56744k(c7)) {
                                                i27 = 2;
                                                if (i18 != 2) {
                                                    if (i18 != i27 || i18 == 4 || i18 == 7) {
                                                        this.f77133J = i19;
                                                        i26 = 16;
                                                        this.f77131H = 16;
                                                    }
                                                } else if (z4 || ((j13 == Long.MIN_VALUE && i38 == 0) || (j13 == j7 && i38 != 0))) {
                                                    i27 = 2;
                                                    if (i18 != i27) {
                                                    }
                                                    this.f77133J = i19;
                                                    i26 = 16;
                                                    this.f77131H = 16;
                                                } else {
                                                    if (i38 == 0) {
                                                        j13 = -j13;
                                                    }
                                                    this.f77132I = j13;
                                                    this.f77142z += i19;
                                                    i26 = 15;
                                                    this.f77131H = 15;
                                                }
                                            }
                                            if (i26 != 0) {
                                                return i26;
                                            }
                                            if (m56744k(cArr[this.f77142z])) {
                                                m56736F0("Expected value");
                                                throw null;
                                            }
                                            m56740b();
                                            this.f77131H = 10;
                                            return 10;
                                        }
                                        i24 = i17;
                                        i25 = 6;
                                        if (i18 != 5) {
                                        }
                                        i18 = i25;
                                        i19++;
                                        i17 = i24;
                                        i28 = 1;
                                    } else if (i19 != cArr.length) {
                                        if (m56743i(i19 + 1)) {
                                            int i39 = this.f77142z;
                                            i17 = this.f77128E;
                                            i16 = i39;
                                            c7 = cArr[i16 + i19];
                                            j7 = 0;
                                            if (c7 != '+') {
                                                if (c7 != 'E') {
                                                    i24 = i17;
                                                    if (i18 != 2) {
                                                    }
                                                    i18 = 5;
                                                    i19++;
                                                    i17 = i24;
                                                    i28 = 1;
                                                } else {
                                                    i24 = i17;
                                                    if (i18 != 2) {
                                                    }
                                                    i18 = 5;
                                                    i19++;
                                                    i17 = i24;
                                                    i28 = 1;
                                                }
                                                if (i26 != 0) {
                                                    return i26;
                                                }
                                                if (m56744k(cArr[this.f77142z])) {
                                                    m56736F0("Expected value");
                                                    throw null;
                                                }
                                                m56740b();
                                                this.f77131H = 10;
                                                return 10;
                                            }
                                            i24 = i17;
                                            i25 = 6;
                                            if (i18 != 5) {
                                            }
                                            i18 = i25;
                                            i19++;
                                            i17 = i24;
                                            i28 = 1;
                                        } else {
                                            j7 = 0;
                                        }
                                        i27 = 2;
                                        if (i18 != 2) {
                                            if (i18 != i27) {
                                            }
                                            this.f77133J = i19;
                                            i26 = 16;
                                            this.f77131H = 16;
                                        } else {
                                            if (z4) {
                                            }
                                            i27 = 2;
                                            if (i18 != i27) {
                                            }
                                            this.f77133J = i19;
                                            i26 = 16;
                                            this.f77131H = 16;
                                        }
                                        if (i26 != 0) {
                                            return i26;
                                        }
                                        if (m56744k(cArr[this.f77142z])) {
                                            m56736F0("Expected value");
                                            throw null;
                                        }
                                        m56740b();
                                        this.f77131H = 10;
                                        return 10;
                                    }
                                    i26 = 0;
                                    if (i26 != 0) {
                                        return i26;
                                    }
                                    if (m56744k(cArr[this.f77142z])) {
                                        m56736F0("Expected value");
                                        throw null;
                                    }
                                    m56740b();
                                    this.f77131H = 10;
                                    return 10;
                                }
                            }
                            str = MediaConstraintsFactory.kValueFalse;
                            str2 = "FALSE";
                            i15 = 6;
                        }
                        int length = str.length();
                        int i44 = 1;
                        while (true) {
                            if (i44 >= length) {
                                if ((this.f77142z + length >= this.f77128E && !m56743i(length + 1)) || !m56744k(cArr[this.f77142z + length])) {
                                    this.f77142z += length;
                                    this.f77131H = i15;
                                    break;
                                }
                                break;
                            }
                            if ((this.f77142z + i44 < this.f77128E || m56743i(i44 + 1)) && ((c3 = cArr[this.f77142z + i44]) == str.charAt(i44) || c3 == str2.charAt(i44))) {
                                i44++;
                            }
                            i15 = i13;
                            break;
                        }
                        if (i15 != 0) {
                            return i15;
                        }
                        i16 = this.f77142z;
                        i17 = this.f77128E;
                        i18 = i13;
                        i19 = i18;
                        int i310 = i19;
                        z4 = true;
                        long j15 = 0;
                        while (true) {
                            if (i16 + i19 != i17) {
                                c7 = cArr[i16 + i19];
                                j7 = 0;
                                if (c7 != '+') {
                                    if (c7 != 'E') {
                                        i24 = i17;
                                        if (i18 != 2) {
                                        }
                                        i18 = 5;
                                        i19++;
                                        i17 = i24;
                                        i28 = 1;
                                    } else {
                                        i24 = i17;
                                        if (i18 != 2) {
                                        }
                                        i18 = 5;
                                        i19++;
                                        i17 = i24;
                                        i28 = 1;
                                    }
                                    if (i26 != 0) {
                                        return i26;
                                    }
                                    if (m56744k(cArr[this.f77142z])) {
                                        m56736F0("Expected value");
                                        throw null;
                                    }
                                    m56740b();
                                    this.f77131H = 10;
                                    return 10;
                                }
                                i24 = i17;
                                i25 = 6;
                                if (i18 != 5) {
                                }
                                i18 = i25;
                                i19++;
                                i17 = i24;
                                i28 = 1;
                            } else if (i19 != cArr.length) {
                                if (m56743i(i19 + 1)) {
                                    j7 = 0;
                                } else {
                                    int i311 = this.f77142z;
                                    i17 = this.f77128E;
                                    i16 = i311;
                                    c7 = cArr[i16 + i19];
                                    j7 = 0;
                                    if (c7 != '+') {
                                        if (c7 != 'E') {
                                            i24 = i17;
                                            if (i18 != 2) {
                                            }
                                            i18 = 5;
                                            i19++;
                                            i17 = i24;
                                            i28 = 1;
                                        } else {
                                            i24 = i17;
                                            if (i18 != 2) {
                                            }
                                            i18 = 5;
                                            i19++;
                                            i17 = i24;
                                            i28 = 1;
                                        }
                                        if (i26 != 0) {
                                            return i26;
                                        }
                                        if (m56744k(cArr[this.f77142z])) {
                                            m56736F0("Expected value");
                                            throw null;
                                        }
                                        m56740b();
                                        this.f77131H = 10;
                                        return 10;
                                    }
                                    i24 = i17;
                                    i25 = 6;
                                    if (i18 != 5) {
                                    }
                                    i18 = i25;
                                    i19++;
                                    i17 = i24;
                                    i28 = 1;
                                }
                                i27 = 2;
                                if (i18 != 2) {
                                    if (i18 != i27) {
                                    }
                                    this.f77133J = i19;
                                    i26 = 16;
                                    this.f77131H = 16;
                                } else {
                                    if (z4) {
                                    }
                                    i27 = 2;
                                    if (i18 != i27) {
                                    }
                                    this.f77133J = i19;
                                    i26 = 16;
                                    this.f77131H = 16;
                                }
                                if (i26 != 0) {
                                    return i26;
                                }
                                if (m56744k(cArr[this.f77142z])) {
                                    m56736F0("Expected value");
                                    throw null;
                                }
                                m56740b();
                                this.f77131H = 10;
                                return 10;
                            }
                            i26 = 0;
                            if (i26 != 0) {
                                return i26;
                            }
                            if (m56744k(cArr[this.f77142z])) {
                                m56736F0("Expected value");
                                throw null;
                            }
                            m56740b();
                            this.f77131H = 10;
                            return 10;
                        }
                    }
                    i14 = 1;
                    if (i34 == 1) {
                        this.f77131H = 4;
                        return 4;
                    }
                }
                if (i34 == i14 && i34 != 2) {
                    m56736F0("Unexpected value");
                    throw null;
                }
                m56740b();
                this.f77142z -= i14;
                this.f77131H = 7;
                return 7;
            }
            iArr[i29] = 5;
            int iM56749x5 = m56749x(true);
            if (iM56749x5 != 58) {
                if (iM56749x5 != 61) {
                    m56736F0("Expected ':'");
                    throw null;
                }
                m56740b();
                if (this.f77142z < this.f77128E || m56743i(1)) {
                    int i45 = this.f77142z;
                    if (cArr[i45] == '>') {
                        this.f77142z = i45 + 1;
                    }
                }
            }
        }
        i13 = 0;
        iM56749x2 = m56749x(true);
        if (iM56749x2 != 34) {
            this.f77131H = 9;
            return 9;
        }
        if (iM56749x2 != 39) {
            m56740b();
            this.f77131H = 8;
            return 8;
        }
        if (iM56749x2 != 44) {
            i14 = 1;
        } else {
            i14 = 1;
        }
        if (i34 == i14) {
        }
        m56740b();
        this.f77142z -= i14;
        this.f77131H = 7;
        return 7;
    }

    public final boolean hasNext() throws IOException {
        int iM56742h = this.f77131H;
        if (iM56742h == 0) {
            iM56742h = m56742h();
        }
        return (iM56742h == 2 || iM56742h == 4) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m56743i(int i13) throws IOException {
        int i14;
        int i15;
        int i16 = this.f77130G;
        int i17 = this.f77142z;
        this.f77130G = i16 - i17;
        int i18 = this.f77128E;
        char[] cArr = this.f77141y;
        if (i18 != i17) {
            int i19 = i18 - i17;
            this.f77128E = i19;
            System.arraycopy(cArr, i17, cArr, 0, i19);
        } else {
            this.f77128E = 0;
        }
        this.f77142z = 0;
        do {
            int i24 = this.f77128E;
            int i25 = this.f77139w.read(cArr, i24, cArr.length - i24);
            if (i25 == -1) {
                return false;
            }
            i14 = this.f77128E + i25;
            this.f77128E = i14;
            if (this.f77129F == 0 && (i15 = this.f77130G) == 0 && i14 > 0 && cArr[0] == 65279) {
                this.f77142z++;
                this.f77130G = i15 + 1;
                i13++;
            }
        } while (i14 < i13);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m56744k(char c3) throws MalformedJsonException {
        if (c3 == '\t' || c3 == '\n' || c3 == '\f' || c3 == '\r' || c3 == ' ') {
            return false;
        }
        if (c3 != '#') {
            if (c3 == ',') {
                return false;
            }
            if (c3 != '/' && c3 != '=') {
                if (c3 == '{' || c3 == '}' || c3 == ':') {
                    return false;
                }
                if (c3 != ';') {
                    switch (c3) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m56740b();
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final String m56745m() {
        StringBuilder sbM30465s = AbstractC11266d.m30465s(this.f77129F + 1, (this.f77142z - this.f77130G) + 1, " at line ", " column ", " path ");
        StringBuilder sb4 = new StringBuilder("$");
        int i13 = this.f77136M;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = this.f77135L[i14];
            if (i15 == 1 || i15 == 2) {
                sb4.append('[');
                sb4.append(this.f77138O[i14]);
                sb4.append(']');
            } else if (i15 == 3 || i15 == 4 || i15 == 5) {
                sb4.append('.');
                String str = this.f77137N[i14];
                if (str != null) {
                    sb4.append(str);
                }
            }
        }
        sbM30465s.append(sb4.toString());
        return sbM30465s.toString();
    }

    public final double nextDouble() throws IOException {
        int iM56742h = this.f77131H;
        if (iM56742h == 0) {
            iM56742h = m56742h();
        }
        if (iM56742h == 15) {
            this.f77131H = 0;
            int[] iArr = this.f77138O;
            int i13 = this.f77136M - 1;
            iArr[i13] = iArr[i13] + 1;
            return this.f77132I;
        }
        if (iM56742h == 16) {
            this.f77134K = new String(this.f77141y, this.f77142z, this.f77133J);
            this.f77142z += this.f77133J;
        } else if (iM56742h == 8 || iM56742h == 9) {
            this.f77134K = m56738T(iM56742h == 8 ? '\'' : '\"');
        } else if (iM56742h == 10) {
            this.f77134K = m56739a0();
        } else if (iM56742h != 11) {
            throw new IllegalStateException("Expected a double but was " + peek() + m56745m());
        }
        this.f77131H = 11;
        double d3 = Double.parseDouble(this.f77134K);
        if (!this.f77140x && (Double.isNaN(d3) || Double.isInfinite(d3))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + d3 + m56745m());
        }
        this.f77134K = null;
        this.f77131H = 0;
        int[] iArr2 = this.f77138O;
        int i14 = this.f77136M - 1;
        iArr2[i14] = iArr2[i14] + 1;
        return d3;
    }

    public final String nextName() throws IOException {
        String strM56738T;
        int iM56742h = this.f77131H;
        if (iM56742h == 0) {
            iM56742h = m56742h();
        }
        if (iM56742h == 14) {
            strM56738T = m56739a0();
        } else if (iM56742h == 12) {
            strM56738T = m56738T('\'');
        } else {
            if (iM56742h != 13) {
                throw new IllegalStateException("Expected a name but was " + peek() + m56745m());
            }
            strM56738T = m56738T('\"');
        }
        this.f77131H = 0;
        this.f77137N[this.f77136M - 1] = strM56738T;
        return strM56738T;
    }

    public final String nextString() throws IOException {
        String str;
        int iM56742h = this.f77131H;
        if (iM56742h == 0) {
            iM56742h = m56742h();
        }
        if (iM56742h == 10) {
            str = m56739a0();
        } else if (iM56742h == 8) {
            str = m56738T('\'');
        } else if (iM56742h == 9) {
            str = m56738T('\"');
        } else if (iM56742h == 11) {
            str = this.f77134K;
            this.f77134K = null;
        } else if (iM56742h == 15) {
            str = Long.toString(this.f77132I);
        } else {
            if (iM56742h != 16) {
                throw new IllegalStateException("Expected a string but was " + peek() + m56745m());
            }
            str = new String(this.f77141y, this.f77142z, this.f77133J);
            this.f77142z += this.f77133J;
        }
        this.f77131H = 0;
        int[] iArr = this.f77138O;
        int i13 = this.f77136M - 1;
        iArr[i13] = iArr[i13] + 1;
        return str;
    }

    /* JADX INFO: renamed from: o0 */
    public final char m56746o0() throws MalformedJsonException {
        int i13;
        if (this.f77142z == this.f77128E && !m56743i(1)) {
            m56736F0("Unterminated escape sequence");
            throw null;
        }
        int i14 = this.f77142z;
        int i15 = i14 + 1;
        this.f77142z = i15;
        char[] cArr = this.f77141y;
        char c3 = cArr[i14];
        if (c3 == '\n') {
            this.f77129F++;
            this.f77130G = i15;
            return c3;
        }
        if (c3 == '\"' || c3 == '\'' || c3 == '/' || c3 == '\\') {
            return c3;
        }
        if (c3 == 'b') {
            return '\b';
        }
        if (c3 == 'f') {
            return '\f';
        }
        if (c3 == 'n') {
            return '\n';
        }
        if (c3 == 'r') {
            return '\r';
        }
        if (c3 == 't') {
            return '\t';
        }
        if (c3 != 'u') {
            m56736F0("Invalid escape sequence");
            throw null;
        }
        if (i14 + 5 > this.f77128E && !m56743i(4)) {
            m56736F0("Unterminated escape sequence");
            throw null;
        }
        int i16 = this.f77142z;
        int i17 = i16 + 4;
        char c7 = 0;
        while (i16 < i17) {
            char c14 = cArr[i16];
            char c15 = (char) (c7 << 4);
            if (c14 >= '0' && c14 <= '9') {
                i13 = c14 - '0';
            } else if (c14 >= 'a' && c14 <= 'f') {
                i13 = c14 - 'W';
            } else {
                if (c14 < 'A' || c14 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(cArr, this.f77142z, 4)));
                }
                i13 = c14 - '7';
            }
            c7 = (char) (i13 + c15);
            i16++;
        }
        this.f77142z += 4;
        return c7;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m56747p0(char c3) throws MalformedJsonException {
        do {
            int i13 = this.f77142z;
            int i14 = this.f77128E;
            while (i13 < i14) {
                int i15 = i13 + 1;
                char c7 = this.f77141y[i13];
                if (c7 == c3) {
                    this.f77142z = i15;
                    return;
                }
                if (c7 == '\\') {
                    this.f77142z = i15;
                    m56746o0();
                    i13 = this.f77142z;
                    i14 = this.f77128E;
                } else {
                    if (c7 == '\n') {
                        this.f77129F++;
                        this.f77130G = i15;
                    }
                    i13 = i15;
                }
            }
            this.f77142z = i13;
        } while (m56743i(1));
        m56736F0("Unterminated string");
        throw null;
    }

    public final EnumC20612b peek() throws IOException {
        int iM56742h = this.f77131H;
        if (iM56742h == 0) {
            iM56742h = m56742h();
        }
        switch (iM56742h) {
            case 1:
                return EnumC20612b.BEGIN_OBJECT;
            case 2:
                return EnumC20612b.END_OBJECT;
            case 3:
                return EnumC20612b.BEGIN_ARRAY;
            case 4:
                return EnumC20612b.END_ARRAY;
            case 5:
            case 6:
                return EnumC20612b.BOOLEAN;
            case 7:
                return EnumC20612b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC20612b.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC20612b.NAME;
            case 15:
            case 16:
                return EnumC20612b.NUMBER;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return EnumC20612b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m56748s() throws IOException {
        int iM56742h = this.f77131H;
        if (iM56742h == 0) {
            iM56742h = m56742h();
        }
        if (iM56742h == 5) {
            this.f77131H = 0;
            int[] iArr = this.f77138O;
            int i13 = this.f77136M - 1;
            iArr[i13] = iArr[i13] + 1;
            return true;
        }
        if (iM56742h != 6) {
            throw new IllegalStateException("Expected a boolean but was " + peek() + m56745m());
        }
        this.f77131H = 0;
        int[] iArr2 = this.f77138O;
        int i14 = this.f77136M - 1;
        iArr2[i14] = iArr2[i14] + 1;
        return false;
    }

    public final String toString() {
        return C20611a.class.getSimpleName() + m56745m();
    }

    /* JADX INFO: renamed from: x */
    public final int m56749x(boolean z4) throws IOException {
        int i13 = this.f77142z;
        int i14 = this.f77128E;
        while (true) {
            if (i13 == i14) {
                this.f77142z = i13;
                if (!m56743i(1)) {
                    if (!z4) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m56745m());
                }
                i13 = this.f77142z;
                i14 = this.f77128E;
            }
            int i15 = i13 + 1;
            char[] cArr = this.f77141y;
            char c3 = cArr[i13];
            if (c3 == '\n') {
                this.f77129F++;
                this.f77130G = i15;
            } else if (c3 != ' ' && c3 != '\r' && c3 != '\t') {
                if (c3 == '/') {
                    this.f77142z = i15;
                    if (i15 == i14) {
                        this.f77142z = i13;
                        boolean zM56743i = m56743i(2);
                        this.f77142z++;
                        if (!zM56743i) {
                        }
                        return c3;
                    }
                    m56740b();
                    int i16 = this.f77142z;
                    char c7 = cArr[i16];
                    if (c7 == '*') {
                        this.f77142z = i16 + 1;
                        while (true) {
                            if (this.f77142z + 2 > this.f77128E && !m56743i(2)) {
                                m56736F0("Unterminated comment");
                                throw null;
                            }
                            int i17 = this.f77142z;
                            if (cArr[i17] != '\n') {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= 2) {
                                        i13 = this.f77142z + 2;
                                        i14 = this.f77128E;
                                        break;
                                    }
                                    if (cArr[this.f77142z + i18] != "*/".charAt(i18)) {
                                        break;
                                    }
                                    i18++;
                                }
                            } else {
                                this.f77129F++;
                                this.f77130G = i17 + 1;
                            }
                            this.f77142z++;
                        }
                    } else {
                        if (c7 != '/') {
                            return c3;
                        }
                        this.f77142z = i16 + 1;
                        m56750x0();
                        i13 = this.f77142z;
                        i14 = this.f77128E;
                    }
                } else {
                    if (c3 != '#') {
                        this.f77142z = i15;
                        return c3;
                    }
                    this.f77142z = i15;
                    m56740b();
                    m56750x0();
                    i13 = this.f77142z;
                    i14 = this.f77128E;
                }
            }
            i13 = i15;
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m56750x0() {
        char c3;
        do {
            if (this.f77142z >= this.f77128E && !m56743i(1)) {
                return;
            }
            int i13 = this.f77142z;
            int i14 = i13 + 1;
            this.f77142z = i14;
            c3 = this.f77141y[i13];
            if (c3 == '\n') {
                this.f77129F++;
                this.f77130G = i14;
                return;
            }
        } while (c3 != '\r');
    }
}
