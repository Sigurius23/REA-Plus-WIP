package p607x8;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p690zr.AbstractC41032j0;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: x8.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C38059n {

    /* JADX INFO: renamed from: d */
    public static final char[] f163014d = {'\r', '\n'};

    /* JADX INFO: renamed from: e */
    public static final char[] f163015e = {'\n'};

    /* JADX INFO: renamed from: f */
    public static final AbstractC41032j0 f163016f = AbstractC41032j0.m133263l(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* JADX INFO: renamed from: a */
    public byte[] f163017a;

    /* JADX INFO: renamed from: b */
    public int f163018b;

    /* JADX INFO: renamed from: c */
    public int f163019c;

    public C38059n() {
        this.f163017a = AbstractC38065t.f163033c;
    }

    /* JADX INFO: renamed from: A */
    public final long m121841A() {
        int i13;
        int i14;
        long j7 = this.f163017a[this.f163018b];
        int i15 = 7;
        while (true) {
            if (i15 >= 0) {
                int i16 = 1 << i15;
                if ((((long) i16) & j7) == 0) {
                    if (i15 < 6) {
                        j7 &= (long) (i16 - 1);
                        i14 = 7 - i15;
                        break;
                    }
                    if (i15 == 7) {
                        i14 = 1;
                        break;
                    }
                } else {
                    i15--;
                }
            }
            i14 = 0;
            break;
        }
        if (i14 == 0) {
            throw new NumberFormatException(AbstractC11895b.m31994m(j7, "Invalid UTF-8 sequence first byte: "));
        }
        for (i13 = 1; i13 < i14; i13++) {
            byte b = this.f163017a[this.f163018b + i13];
            if ((b & 192) != 128) {
                throw new NumberFormatException(AbstractC11895b.m31994m(j7, "Invalid UTF-8 sequence continuation byte: "));
            }
            j7 = (j7 << 6) | ((long) (b & 63));
        }
        this.f163018b += i14;
        return j7;
    }

    /* JADX INFO: renamed from: B */
    public final Charset m121842B() {
        if (m121848a() >= 3) {
            byte[] bArr = this.f163017a;
            int i13 = this.f163018b;
            if (bArr[i13] == -17 && bArr[i13 + 1] == -69 && bArr[i13 + 2] == -65) {
                this.f163018b = i13 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (m121848a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f163017a;
        int i14 = this.f163018b;
        byte b = bArr2[i14];
        if (b == -2 && bArr2[i14 + 1] == -1) {
            this.f163018b = i14 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i14 + 1] != -2) {
            return null;
        }
        this.f163018b = i14 + 2;
        return StandardCharsets.UTF_16LE;
    }

    /* JADX INFO: renamed from: C */
    public final void m121843C(int i13) {
        byte[] bArr = this.f163017a;
        if (bArr.length < i13) {
            bArr = new byte[i13];
        }
        m121844D(i13, bArr);
    }

    /* JADX INFO: renamed from: D */
    public final void m121844D(int i13, byte[] bArr) {
        this.f163017a = bArr;
        this.f163019c = i13;
        this.f163018b = 0;
    }

    /* JADX INFO: renamed from: E */
    public final void m121845E(int i13) {
        AbstractC35849g.m113802d(i13 >= 0 && i13 <= this.f163017a.length);
        this.f163019c = i13;
    }

    /* JADX INFO: renamed from: F */
    public final void m121846F(int i13) {
        AbstractC35849g.m113802d(i13 >= 0 && i13 <= this.f163019c);
        this.f163018b = i13;
    }

    /* JADX INFO: renamed from: G */
    public final void m121847G(int i13) {
        m121846F(this.f163018b + i13);
    }

    /* JADX INFO: renamed from: a */
    public final int m121848a() {
        return this.f163019c - this.f163018b;
    }

    /* JADX INFO: renamed from: b */
    public final void m121849b(int i13) {
        byte[] bArr = this.f163017a;
        if (i13 > bArr.length) {
            this.f163017a = Arrays.copyOf(bArr, i13);
        }
    }

    /* JADX INFO: renamed from: c */
    public final char m121850c(Charset charset) {
        AbstractC35849g.m113803e(f163016f.contains(charset), "Unsupported charset: " + charset);
        return (char) (m121851d(charset) >> 16);
    }

    /* JADX INFO: renamed from: d */
    public final int m121851d(Charset charset) {
        byte b;
        byte b6 = 0;
        int i13 = 1;
        if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && m121848a() >= 1) {
            b = this.f163017a[this.f163018b];
        } else {
            if ((charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) && m121848a() >= 2) {
                byte[] bArr = this.f163017a;
                int i14 = this.f163018b;
                b6 = bArr[i14];
                b = bArr[i14 + 1];
            } else {
                if (!charset.equals(StandardCharsets.UTF_16LE) || m121848a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f163017a;
                int i15 = this.f163018b;
                b6 = bArr2[i15 + 1];
                b = bArr2[i15];
            }
            i13 = 2;
        }
        return ((b & 255) << 16) | (b6 << 24) | (i13 & 255);
    }

    /* JADX INFO: renamed from: e */
    public final void m121852e(byte[] bArr, int i13, int i14) {
        System.arraycopy(this.f163017a, this.f163018b, bArr, i13, i14);
        this.f163018b += i14;
    }

    /* JADX INFO: renamed from: f */
    public final char m121853f(Charset charset, char[] cArr) {
        int iM121851d = m121851d(charset);
        if (iM121851d != 0) {
            char c3 = (char) (iM121851d >> 16);
            for (char c7 : cArr) {
                if (c7 == c3) {
                    this.f163018b += iM121851d & 65535;
                    return c3;
                }
            }
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: g */
    public final int m121854g() {
        byte[] bArr = this.f163017a;
        int i13 = this.f163018b;
        int i14 = i13 + 1;
        this.f163018b = i14;
        int i15 = (bArr[i13] & 255) << 24;
        int i16 = i13 + 2;
        this.f163018b = i16;
        int i17 = ((bArr[i14] & 255) << 16) | i15;
        int i18 = i13 + 3;
        this.f163018b = i18;
        int i19 = i17 | ((bArr[i16] & 255) << 8);
        this.f163018b = i13 + 4;
        return (bArr[i18] & 255) | i19;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x00cd A[ADDED_TO_REGION, EDGE_INSN: B:66:0x00cd->B:56:0x00cd BREAK  A[LOOP:0: B:26:0x0069->B:54:0x00ca], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00cd A[ADDED_TO_REGION, EDGE_INSN: B:68:0x00cd->B:56:0x00cd BREAK  A[LOOP:0: B:26:0x0069->B:54:0x00ca], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca A[SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public final String m121855h(Charset charset) {
        int i13;
        byte[] bArr;
        byte b;
        byte[] bArr2;
        byte b6;
        AbstractC35849g.m113803e(f163016f.contains(charset), "Unsupported charset: " + charset);
        if (m121848a() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            m121842B();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i13 = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i13 = 2;
        }
        int i14 = this.f163018b;
        while (true) {
            int i15 = this.f163019c;
            if (i14 >= i15 - (i13 - 1)) {
                i14 = i15;
                break;
            }
            if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
                byte b8 = this.f163017a[i14];
                int i16 = AbstractC38065t.f163031a;
                if (b8 == 10 || b8 == 13) {
                    break;
                }
                if (!charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    bArr = this.f163017a;
                    if (bArr[i14] == 0) {
                        b = bArr[i14 + 1];
                        int i17 = AbstractC38065t.f163031a;
                        if (b != 10 || b == 13) {
                            break;
                        }
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            bArr2 = this.f163017a;
                            if (bArr2[i14 + 1] == 0) {
                                b6 = bArr2[i14];
                                int i18 = AbstractC38065t.f163031a;
                                if (b6 != 10 || b6 == 13) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i14 += i13;
                    } else {
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            bArr2 = this.f163017a;
                            if (bArr2[i14 + 1] == 0) {
                                b6 = bArr2[i14];
                                int i19 = AbstractC38065t.f163031a;
                                if (b6 != 10) {
                                    break;
                                }
                                break;
                                break;
                            }
                            continue;
                        }
                        i14 += i13;
                    }
                } else {
                    if (charset.equals(StandardCharsets.UTF_16LE)) {
                        bArr2 = this.f163017a;
                        if (bArr2[i14 + 1] == 0) {
                            b6 = bArr2[i14];
                            int i110 = AbstractC38065t.f163031a;
                            if (b6 != 10) {
                                break;
                                break;
                            }
                            break;
                            break;
                        }
                        continue;
                    }
                    i14 += i13;
                }
            } else if (charset.equals(StandardCharsets.UTF_16)) {
                bArr = this.f163017a;
                if (bArr[i14] == 0) {
                    b = bArr[i14 + 1];
                    int i111 = AbstractC38065t.f163031a;
                    if (b != 10) {
                        break;
                    }
                    break;
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr2 = this.f163017a;
                    if (bArr2[i14 + 1] == 0) {
                        b6 = bArr2[i14];
                        int i112 = AbstractC38065t.f163031a;
                        if (b6 != 10) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    continue;
                }
                i14 += i13;
            } else {
                bArr = this.f163017a;
                if (bArr[i14] == 0) {
                    b = bArr[i14 + 1];
                    int i113 = AbstractC38065t.f163031a;
                    if (b != 10) {
                        break;
                        break;
                    }
                    break;
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr2 = this.f163017a;
                    if (bArr2[i14 + 1] == 0) {
                        b6 = bArr2[i14];
                        int i114 = AbstractC38065t.f163031a;
                        if (b6 != 10) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    continue;
                }
                i14 += i13;
            }
        }
        String strM121865r = m121865r(i14 - this.f163018b, charset);
        if (this.f163018b != this.f163019c && m121853f(charset, f163014d) == '\r') {
            m121853f(charset, f163015e);
        }
        return strM121865r;
    }

    /* JADX INFO: renamed from: i */
    public final int m121856i() {
        byte[] bArr = this.f163017a;
        int i13 = this.f163018b;
        int i14 = i13 + 1;
        this.f163018b = i14;
        int i15 = bArr[i13] & 255;
        int i16 = i13 + 2;
        this.f163018b = i16;
        int i17 = ((bArr[i14] & 255) << 8) | i15;
        int i18 = i13 + 3;
        this.f163018b = i18;
        int i19 = i17 | ((bArr[i16] & 255) << 16);
        this.f163018b = i13 + 4;
        return ((bArr[i18] & 255) << 24) | i19;
    }

    /* JADX INFO: renamed from: j */
    public final long m121857j() {
        byte[] bArr = this.f163017a;
        int i13 = this.f163018b;
        int i14 = i13 + 1;
        this.f163018b = i14;
        long j7 = ((long) bArr[i13]) & 255;
        int i15 = i13 + 2;
        this.f163018b = i15;
        long j13 = j7 | ((((long) bArr[i14]) & 255) << 8);
        int i16 = i13 + 3;
        this.f163018b = i16;
        long j14 = j13 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i13 + 4;
        this.f163018b = i17;
        long j15 = j14 | ((((long) bArr[i16]) & 255) << 24);
        int i18 = i13 + 5;
        this.f163018b = i18;
        long j16 = j15 | ((((long) bArr[i17]) & 255) << 32);
        int i19 = i13 + 6;
        this.f163018b = i19;
        long j17 = j16 | ((((long) bArr[i18]) & 255) << 40);
        int i24 = i13 + 7;
        this.f163018b = i24;
        long j18 = j17 | ((((long) bArr[i19]) & 255) << 48);
        this.f163018b = i13 + 8;
        return ((((long) bArr[i24]) & 255) << 56) | j18;
    }

    /* JADX INFO: renamed from: k */
    public final long m121858k() {
        byte[] bArr = this.f163017a;
        int i13 = this.f163018b;
        int i14 = i13 + 1;
        this.f163018b = i14;
        long j7 = ((long) bArr[i13]) & 255;
        int i15 = i13 + 2;
        this.f163018b = i15;
        long j13 = j7 | ((((long) bArr[i14]) & 255) << 8);
        int i16 = i13 + 3;
        this.f163018b = i16;
        long j14 = j13 | ((((long) bArr[i15]) & 255) << 16);
        this.f163018b = i13 + 4;
        return ((((long) bArr[i16]) & 255) << 24) | j14;
    }

    /* JADX INFO: renamed from: l */
    public final int m121859l() {
        int iM121856i = m121856i();
        if (iM121856i >= 0) {
            return iM121856i;
        }
        throw new IllegalStateException(AbstractC2875y.m8295h(iM121856i, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: m */
    public final int m121860m() {
        byte[] bArr = this.f163017a;
        int i13 = this.f163018b;
        int i14 = i13 + 1;
        this.f163018b = i14;
        int i15 = bArr[i13] & 255;
        this.f163018b = i13 + 2;
        return ((bArr[i14] & 255) << 8) | i15;
    }

    /* JADX INFO: renamed from: n */
    public final long m121861n() {
        byte[] bArr = this.f163017a;
        int i13 = this.f163018b;
        int i14 = i13 + 1;
        this.f163018b = i14;
        long j7 = (((long) bArr[i13]) & 255) << 56;
        int i15 = i13 + 2;
        this.f163018b = i15;
        long j13 = j7 | ((((long) bArr[i14]) & 255) << 48);
        int i16 = i13 + 3;
        this.f163018b = i16;
        long j14 = j13 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i13 + 4;
        this.f163018b = i17;
        long j15 = j14 | ((((long) bArr[i16]) & 255) << 32);
        int i18 = i13 + 5;
        this.f163018b = i18;
        long j16 = j15 | ((((long) bArr[i17]) & 255) << 24);
        int i19 = i13 + 6;
        this.f163018b = i19;
        long j17 = j16 | ((((long) bArr[i18]) & 255) << 16);
        int i24 = i13 + 7;
        this.f163018b = i24;
        long j18 = j17 | ((((long) bArr[i19]) & 255) << 8);
        this.f163018b = i13 + 8;
        return (((long) bArr[i24]) & 255) | j18;
    }

    /* JADX INFO: renamed from: o */
    public final String m121862o() {
        if (m121848a() == 0) {
            return null;
        }
        int i13 = this.f163018b;
        while (i13 < this.f163019c && this.f163017a[i13] != 0) {
            i13++;
        }
        byte[] bArr = this.f163017a;
        int i14 = this.f163018b;
        int i15 = AbstractC38065t.f163031a;
        String str = new String(bArr, i14, i13 - i14, StandardCharsets.UTF_8);
        this.f163018b = i13;
        if (i13 < this.f163019c) {
            this.f163018b = i13 + 1;
        }
        return str;
    }

    /* JADX INFO: renamed from: p */
    public final String m121863p(int i13) {
        if (i13 == 0) {
            return "";
        }
        int i14 = this.f163018b;
        int i15 = (i14 + i13) - 1;
        int i16 = (i15 >= this.f163019c || this.f163017a[i15] != 0) ? i13 : i13 - 1;
        byte[] bArr = this.f163017a;
        int i17 = AbstractC38065t.f163031a;
        String str = new String(bArr, i14, i16, StandardCharsets.UTF_8);
        this.f163018b += i13;
        return str;
    }

    /* JADX INFO: renamed from: q */
    public final short m121864q() {
        byte[] bArr = this.f163017a;
        int i13 = this.f163018b;
        int i14 = i13 + 1;
        this.f163018b = i14;
        int i15 = (bArr[i13] & 255) << 8;
        this.f163018b = i13 + 2;
        return (short) ((bArr[i14] & 255) | i15);
    }

    /* JADX INFO: renamed from: r */
    public final String m121865r(int i13, Charset charset) {
        String str = new String(this.f163017a, this.f163018b, i13, charset);
        this.f163018b += i13;
        return str;
    }

    /* JADX INFO: renamed from: s */
    public final int m121866s() {
        return (m121867t() << 21) | (m121867t() << 14) | (m121867t() << 7) | m121867t();
    }

    /* JADX INFO: renamed from: t */
    public final int m121867t() {
        byte[] bArr = this.f163017a;
        int i13 = this.f163018b;
        this.f163018b = i13 + 1;
        return bArr[i13] & 255;
    }

    /* JADX INFO: renamed from: u */
    public final int m121868u() {
        byte[] bArr = this.f163017a;
        int i13 = this.f163018b;
        int i14 = i13 + 1;
        this.f163018b = i14;
        int i15 = (bArr[i13] & 255) << 8;
        this.f163018b = i13 + 2;
        int i16 = (bArr[i14] & 255) | i15;
        this.f163018b = i13 + 4;
        return i16;
    }

    /* JADX INFO: renamed from: v */
    public final long m121869v() {
        byte[] bArr = this.f163017a;
        int i13 = this.f163018b;
        int i14 = i13 + 1;
        this.f163018b = i14;
        long j7 = (((long) bArr[i13]) & 255) << 24;
        int i15 = i13 + 2;
        this.f163018b = i15;
        long j13 = j7 | ((((long) bArr[i14]) & 255) << 16);
        int i16 = i13 + 3;
        this.f163018b = i16;
        long j14 = j13 | ((((long) bArr[i15]) & 255) << 8);
        this.f163018b = i13 + 4;
        return (((long) bArr[i16]) & 255) | j14;
    }

    /* JADX INFO: renamed from: w */
    public final int m121870w() {
        byte[] bArr = this.f163017a;
        int i13 = this.f163018b;
        int i14 = i13 + 1;
        this.f163018b = i14;
        int i15 = (bArr[i13] & 255) << 16;
        int i16 = i13 + 2;
        this.f163018b = i16;
        int i17 = ((bArr[i14] & 255) << 8) | i15;
        this.f163018b = i13 + 3;
        return (bArr[i16] & 255) | i17;
    }

    /* JADX INFO: renamed from: x */
    public final int m121871x() {
        int iM121854g = m121854g();
        if (iM121854g >= 0) {
            return iM121854g;
        }
        throw new IllegalStateException(AbstractC2875y.m8295h(iM121854g, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: y */
    public final long m121872y() {
        long jM121861n = m121861n();
        if (jM121861n >= 0) {
            return jM121861n;
        }
        throw new IllegalStateException(AbstractC11895b.m31994m(jM121861n, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: z */
    public final int m121873z() {
        byte[] bArr = this.f163017a;
        int i13 = this.f163018b;
        int i14 = i13 + 1;
        this.f163018b = i14;
        int i15 = (bArr[i13] & 255) << 8;
        this.f163018b = i13 + 2;
        return (bArr[i14] & 255) | i15;
    }

    public C38059n(int i13) {
        this.f163017a = new byte[i13];
        this.f163019c = i13;
    }

    public C38059n(byte[] bArr) {
        this.f163017a = bArr;
        this.f163019c = bArr.length;
    }

    public C38059n(byte[] bArr, int i13) {
        this.f163017a = bArr;
        this.f163019c = i13;
    }
}
