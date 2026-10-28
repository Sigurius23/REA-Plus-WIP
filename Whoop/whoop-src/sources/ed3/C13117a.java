package ed3;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kotlinx.serialization.SerializationException;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p658yr.AbstractC39717d;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ed3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C13117a {

    /* JADX INFO: renamed from: a */
    public byte[] f45381a;

    /* JADX INFO: renamed from: b */
    public int f45382b;

    /* JADX INFO: renamed from: c */
    public int f45383c;

    public C13117a(byte[] array, int i13, int i14, boolean z4) {
        switch (i14) {
            case 1:
                this.f45381a = array;
                this.f45383c = i13;
                break;
            default:
                AbstractC22676k.m65750j(array, "array");
                this.f45381a = array;
                this.f45382b = i13;
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m36678d(int i13, int i14, int i15) {
        String str;
        if (i14 == i15) {
            return;
        }
        StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Field ", ": expected ");
        String str2 = "varint";
        if (i14 == 0) {
            str = "varint";
        } else if (i14 == 1) {
            str = "fixed64";
        } else if (i14 != 2) {
            str = i14 != 5 ? "unknown" : "fixed32";
        } else {
            str = "length-delimited";
        }
        AbstractC11266d.m30470x(i14, str, " (wire type ", ") but got ", sbM30466t);
        if (i15 != 0) {
            if (i15 == 1) {
                str2 = "fixed64";
            } else if (i15 != 2) {
                str2 = i15 != 5 ? "unknown" : "fixed32";
            } else {
                str2 = "length-delimited";
            }
        }
        sbM30466t.append(str2);
        sbM30466t.append(" (wire type ");
        sbM30466t.append(i15);
        sbM30466t.append(")");
        throw new IOException(sbM30466t.toString());
    }

    /* JADX INFO: renamed from: A */
    public int m36679A() {
        byte[] bArr = this.f45381a;
        int i13 = this.f45382b;
        int i14 = i13 + 1;
        this.f45382b = i14;
        int i15 = (bArr[i13] & 255) << 16;
        int i16 = i13 + 2;
        this.f45382b = i16;
        int i17 = ((bArr[i14] & 255) << 8) | i15;
        this.f45382b = i13 + 3;
        return (bArr[i16] & 255) | i17;
    }

    /* JADX INFO: renamed from: B */
    public int m36680B() {
        int iM36699i = m36699i();
        if (iM36699i >= 0) {
            return iM36699i;
        }
        throw new IllegalStateException(AbstractC31061c.m95634j(29, iM36699i, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: C */
    public long m36681C() {
        long jM36706p = m36706p();
        if (jM36706p >= 0) {
            return jM36706p;
        }
        StringBuilder sb4 = new StringBuilder(38);
        sb4.append("Top bit not zero: ");
        sb4.append(jM36706p);
        throw new IllegalStateException(sb4.toString());
    }

    /* JADX INFO: renamed from: D */
    public int m36682D() {
        byte[] bArr = this.f45381a;
        int i13 = this.f45382b;
        int i14 = i13 + 1;
        this.f45382b = i14;
        int i15 = (bArr[i13] & 255) << 8;
        this.f45382b = i13 + 2;
        return (bArr[i14] & 255) | i15;
    }

    /* JADX INFO: renamed from: E */
    public long m36683E() {
        int i13;
        int i14;
        long j7 = this.f45381a[this.f45382b];
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
            StringBuilder sb4 = new StringBuilder(55);
            sb4.append("Invalid UTF-8 sequence first byte: ");
            sb4.append(j7);
            throw new NumberFormatException(sb4.toString());
        }
        for (i13 = 1; i13 < i14; i13++) {
            byte b = this.f45381a[this.f45382b + i13];
            if ((b & 192) != 128) {
                StringBuilder sb5 = new StringBuilder(62);
                sb5.append("Invalid UTF-8 sequence continuation byte: ");
                sb5.append(j7);
                throw new NumberFormatException(sb5.toString());
            }
            j7 = (j7 << 6) | ((long) (b & 63));
        }
        this.f45382b += i14;
        return j7;
    }

    /* JADX INFO: renamed from: F */
    public long m36684F() {
        long j7 = 0;
        for (int i13 = 0; i13 < 64; i13 += 7) {
            int i14 = this.f45382b;
            if (i14 >= this.f45383c) {
                throw new EOFException("Truncated varint");
            }
            byte[] bArr = this.f45381a;
            this.f45382b = i14 + 1;
            byte b = bArr[i14];
            j7 |= ((long) (b & 127)) << i13;
            if ((b & 128) == 0) {
                return j7;
            }
        }
        throw new IOException("Malformed varint");
    }

    /* JADX INFO: renamed from: G */
    public long m36685G(boolean z4) {
        int i13 = this.f45383c;
        int i14 = this.f45382b;
        if (i13 == i14) {
            if (z4) {
                return -1L;
            }
            throw new SerializationException("Unexpected EOF");
        }
        byte[] bArr = this.f45381a;
        int i15 = i13 + 1;
        long j7 = bArr[i13];
        long j13 = 0;
        if (j7 >= 0) {
            this.f45383c = i15;
            return j7;
        }
        if (i14 - i13 > 1) {
            int i16 = i13 + 2;
            long j14 = (((long) bArr[i15]) << 7) ^ j7;
            if (j14 < 0) {
                this.f45383c = i16;
                return j14 ^ (-128);
            }
        }
        for (int i17 = 0; i17 < 64; i17 += 7) {
            int iM36695e = m36695e();
            j13 |= ((long) (iM36695e & 127)) << i17;
            if ((iM36695e & 128) == 0) {
                return j13;
            }
        }
        throw new SerializationException("Input stream is malformed: Varint too long (exceeded 64 bits)");
    }

    /* JADX INFO: renamed from: H */
    public void m36686H(int i13) {
        byte[] bArr = this.f45381a;
        if (bArr.length < i13) {
            bArr = new byte[i13];
        }
        m36687I(i13, bArr);
    }

    /* JADX INFO: renamed from: I */
    public void m36687I(int i13, byte[] bArr) {
        this.f45381a = bArr;
        this.f45383c = i13;
        this.f45382b = 0;
    }

    /* JADX INFO: renamed from: J */
    public void m36688J(int i13) {
        AbstractC24543a.m71569e(i13 >= 0 && i13 <= this.f45381a.length);
        this.f45383c = i13;
    }

    /* JADX INFO: renamed from: K */
    public void m36689K(int i13) {
        AbstractC24543a.m71569e(i13 >= 0 && i13 <= this.f45383c);
        this.f45382b = i13;
    }

    /* JADX INFO: renamed from: L */
    public void m36690L(int i13) {
        m36689K(this.f45382b + i13);
    }

    /* JADX INFO: renamed from: M */
    public void m36691M(int i13) {
        int i14 = this.f45383c;
        if (i13 == 0) {
            m36684F();
            return;
        }
        if (i13 == 1) {
            int i15 = this.f45382b;
            if (i14 - i15 < 8) {
                throw new EOFException("Not enough bytes to skip fixed64");
            }
            this.f45382b = i15 + 8;
            return;
        }
        if (i13 == 2) {
            int iM36684F = (int) m36684F();
            int i16 = this.f45382b;
            if (i14 - i16 < iM36684F) {
                throw new EOFException("Not enough bytes to skip length-delimited");
            }
            this.f45382b = i16 + iM36684F;
            return;
        }
        if (i13 != 5) {
            throw new IOException(AbstractC2875y.m8295h(i13, "Unknown wire type: "));
        }
        int i17 = this.f45382b;
        if (i14 - i17 < 4) {
            throw new EOFException("Not enough bytes to skip fixed32");
        }
        this.f45382b = i17 + 4;
    }

    /* JADX INFO: renamed from: a */
    public int m36692a() {
        return this.f45383c - this.f45382b;
    }

    /* JADX INFO: renamed from: b */
    public void m36693b(int i13) {
        byte[] bArr = this.f45381a;
        if (i13 > bArr.length) {
            this.f45381a = Arrays.copyOf(bArr, i13);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m36694c(int i13) {
        int i14 = this.f45382b;
        if (i13 <= i14 - this.f45383c) {
            return;
        }
        throw new SerializationException("Unexpected EOF, available " + (i14 - this.f45383c) + " bytes, requested: " + i13);
    }

    /* JADX INFO: renamed from: e */
    public int m36695e() {
        int i13 = this.f45383c;
        if (i13 >= this.f45382b) {
            return -1;
        }
        byte[] bArr = this.f45381a;
        this.f45383c = i13 + 1;
        return bArr[i13] & 255;
    }

    /* JADX INFO: renamed from: f */
    public boolean m36696f() {
        return m36684F() != 0;
    }

    /* JADX INFO: renamed from: g */
    public void m36697g(byte[] bArr, int i13, int i14) {
        System.arraycopy(this.f45381a, this.f45382b, bArr, i13, i14);
        this.f45382b += i14;
    }

    /* JADX INFO: renamed from: h */
    public byte[] m36698h() {
        int iM36684F = (int) m36684F();
        if (iM36684F < 0) {
            throw new IOException(AbstractC2875y.m8295h(iM36684F, "Negative length: "));
        }
        int i13 = this.f45383c;
        int i14 = this.f45382b;
        if (i13 - i14 < iM36684F) {
            throw new EOFException("Not enough bytes for length-delimited field");
        }
        byte[] bArr = new byte[iM36684F];
        System.arraycopy(this.f45381a, i14, bArr, 0, iM36684F);
        this.f45382b += iM36684F;
        return bArr;
    }

    /* JADX INFO: renamed from: i */
    public int m36699i() {
        byte[] bArr = this.f45381a;
        int i13 = this.f45382b;
        int i14 = i13 + 1;
        this.f45382b = i14;
        int i15 = (bArr[i13] & 255) << 24;
        int i16 = i13 + 2;
        this.f45382b = i16;
        int i17 = ((bArr[i14] & 255) << 16) | i15;
        int i18 = i13 + 3;
        this.f45382b = i18;
        int i19 = i17 | ((bArr[i16] & 255) << 8);
        this.f45382b = i13 + 4;
        return (bArr[i18] & 255) | i19;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX INFO: renamed from: j */
    public String m36700j() {
        int i13;
        if (m36692a() == 0) {
            return null;
        }
        int i14 = this.f45382b;
        while (i14 < this.f45383c) {
            byte b = this.f45381a[i14];
            int i15 = AbstractC24567y.f95875a;
            if (b == 10 || b == 13) {
                break;
            }
            i14++;
        }
        int i16 = this.f45382b;
        if (i14 - i16 >= 3) {
            byte[] bArr = this.f45381a;
            if (bArr[i16] == -17 && bArr[i16 + 1] == -69 && bArr[i16 + 2] == -65) {
                this.f45382b = i16 + 3;
            }
        }
        byte[] bArr2 = this.f45381a;
        int i17 = this.f45382b;
        int i18 = AbstractC24567y.f95875a;
        String str = new String(bArr2, i17, i14 - i17, AbstractC39717d.f170958c);
        this.f45382b = i14;
        int i19 = this.f45383c;
        if (i14 != i19) {
            byte[] bArr3 = this.f45381a;
            if (bArr3[i14] == 13) {
                int i24 = i14 + 1;
                this.f45382b = i24;
                if (i24 != i19) {
                    i13 = this.f45382b;
                    if (bArr3[i13] == 10) {
                        this.f45382b = i13 + 1;
                    }
                }
            } else {
                i13 = this.f45382b;
                if (bArr3[i13] == 10) {
                    this.f45382b = i13 + 1;
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: k */
    public int m36701k() {
        byte[] bArr = this.f45381a;
        int i13 = this.f45382b;
        int i14 = i13 + 1;
        this.f45382b = i14;
        int i15 = bArr[i13] & 255;
        int i16 = i13 + 2;
        this.f45382b = i16;
        int i17 = ((bArr[i14] & 255) << 8) | i15;
        int i18 = i13 + 3;
        this.f45382b = i18;
        int i19 = i17 | ((bArr[i16] & 255) << 16);
        this.f45382b = i13 + 4;
        return ((bArr[i18] & 255) << 24) | i19;
    }

    /* JADX INFO: renamed from: l */
    public long m36702l() {
        byte[] bArr = this.f45381a;
        int i13 = this.f45382b;
        int i14 = i13 + 1;
        this.f45382b = i14;
        long j7 = ((long) bArr[i13]) & 255;
        int i15 = i13 + 2;
        this.f45382b = i15;
        long j13 = j7 | ((((long) bArr[i14]) & 255) << 8);
        int i16 = i13 + 3;
        this.f45382b = i16;
        long j14 = j13 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i13 + 4;
        this.f45382b = i17;
        long j15 = j14 | ((((long) bArr[i16]) & 255) << 24);
        int i18 = i13 + 5;
        this.f45382b = i18;
        long j16 = j15 | ((((long) bArr[i17]) & 255) << 32);
        int i19 = i13 + 6;
        this.f45382b = i19;
        long j17 = j16 | ((((long) bArr[i18]) & 255) << 40);
        int i24 = i13 + 7;
        this.f45382b = i24;
        long j18 = j17 | ((((long) bArr[i19]) & 255) << 48);
        this.f45382b = i13 + 8;
        return ((((long) bArr[i24]) & 255) << 56) | j18;
    }

    /* JADX INFO: renamed from: m */
    public long m36703m() {
        byte[] bArr = this.f45381a;
        int i13 = this.f45382b;
        int i14 = i13 + 1;
        this.f45382b = i14;
        long j7 = ((long) bArr[i13]) & 255;
        int i15 = i13 + 2;
        this.f45382b = i15;
        long j13 = j7 | ((((long) bArr[i14]) & 255) << 8);
        int i16 = i13 + 3;
        this.f45382b = i16;
        long j14 = j13 | ((((long) bArr[i15]) & 255) << 16);
        this.f45382b = i13 + 4;
        return ((((long) bArr[i16]) & 255) << 24) | j14;
    }

    /* JADX INFO: renamed from: n */
    public int m36704n() {
        int iM36701k = m36701k();
        if (iM36701k >= 0) {
            return iM36701k;
        }
        throw new IllegalStateException(AbstractC31061c.m95634j(29, iM36701k, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: o */
    public int m36705o() {
        byte[] bArr = this.f45381a;
        int i13 = this.f45382b;
        int i14 = i13 + 1;
        this.f45382b = i14;
        int i15 = bArr[i13] & 255;
        this.f45382b = i13 + 2;
        return ((bArr[i14] & 255) << 8) | i15;
    }

    /* JADX INFO: renamed from: p */
    public long m36706p() {
        byte[] bArr = this.f45381a;
        int i13 = this.f45382b;
        int i14 = i13 + 1;
        this.f45382b = i14;
        long j7 = (((long) bArr[i13]) & 255) << 56;
        int i15 = i13 + 2;
        this.f45382b = i15;
        long j13 = j7 | ((((long) bArr[i14]) & 255) << 48);
        int i16 = i13 + 3;
        this.f45382b = i16;
        long j14 = j13 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i13 + 4;
        this.f45382b = i17;
        long j15 = j14 | ((((long) bArr[i16]) & 255) << 32);
        int i18 = i13 + 5;
        this.f45382b = i18;
        long j16 = j15 | ((((long) bArr[i17]) & 255) << 24);
        int i19 = i13 + 6;
        this.f45382b = i19;
        long j17 = j16 | ((((long) bArr[i18]) & 255) << 16);
        int i24 = i13 + 7;
        this.f45382b = i24;
        long j18 = j17 | ((((long) bArr[i19]) & 255) << 8);
        this.f45382b = i13 + 8;
        return (((long) bArr[i24]) & 255) | j18;
    }

    /* JADX INFO: renamed from: q */
    public C13117a m36707q() {
        return new C13117a(m36698h(), 2, (byte) 0);
    }

    /* JADX INFO: renamed from: r */
    public String m36708r() {
        if (m36692a() == 0) {
            return null;
        }
        int i13 = this.f45382b;
        while (i13 < this.f45383c && this.f45381a[i13] != 0) {
            i13++;
        }
        byte[] bArr = this.f45381a;
        int i14 = this.f45382b;
        int i15 = AbstractC24567y.f95875a;
        String str = new String(bArr, i14, i13 - i14, AbstractC39717d.f170958c);
        this.f45382b = i13;
        if (i13 < this.f45383c) {
            this.f45382b = i13 + 1;
        }
        return str;
    }

    /* JADX INFO: renamed from: s */
    public String m36709s(int i13) {
        if (i13 == 0) {
            return "";
        }
        int i14 = this.f45382b;
        int i15 = (i14 + i13) - 1;
        int i16 = (i15 >= this.f45383c || this.f45381a[i15] != 0) ? i13 : i13 - 1;
        byte[] bArr = this.f45381a;
        int i17 = AbstractC24567y.f95875a;
        String str = new String(bArr, i14, i16, AbstractC39717d.f170958c);
        this.f45382b += i13;
        return str;
    }

    /* JADX INFO: renamed from: t */
    public short m36710t() {
        byte[] bArr = this.f45381a;
        int i13 = this.f45382b;
        int i14 = i13 + 1;
        this.f45382b = i14;
        int i15 = (bArr[i13] & 255) << 8;
        this.f45382b = i13 + 2;
        return (short) ((bArr[i14] & 255) | i15);
    }

    /* JADX INFO: renamed from: u */
    public String m36711u() {
        return new String(m36698h(), StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: v */
    public String m36712v(int i13, Charset charset) {
        String str = new String(this.f45381a, this.f45382b, i13, charset);
        this.f45382b += i13;
        return str;
    }

    /* JADX INFO: renamed from: w */
    public int m36713w() {
        return (m36715y() << 21) | (m36715y() << 14) | (m36715y() << 7) | m36715y();
    }

    /* JADX INFO: renamed from: x */
    public int m36714x() {
        if (this.f45382b < this.f45383c) {
            return (int) m36684F();
        }
        return 0;
    }

    /* JADX INFO: renamed from: y */
    public int m36715y() {
        byte[] bArr = this.f45381a;
        int i13 = this.f45382b;
        this.f45382b = i13 + 1;
        return bArr[i13] & 255;
    }

    /* JADX INFO: renamed from: z */
    public long m36716z() {
        byte[] bArr = this.f45381a;
        int i13 = this.f45382b;
        int i14 = i13 + 1;
        this.f45382b = i14;
        long j7 = (((long) bArr[i13]) & 255) << 24;
        int i15 = i13 + 2;
        this.f45382b = i15;
        long j13 = j7 | ((((long) bArr[i14]) & 255) << 16);
        int i16 = i13 + 3;
        this.f45382b = i16;
        long j14 = j13 | ((((long) bArr[i15]) & 255) << 8);
        this.f45382b = i13 + 4;
        return (((long) bArr[i16]) & 255) | j14;
    }

    public C13117a() {
        this.f45381a = AbstractC24567y.f95880f;
    }

    public C13117a(int i13) {
        this.f45381a = new byte[i13];
        this.f45383c = i13;
    }

    public C13117a(byte[] bArr, int i13, byte b) {
        switch (i13) {
            case 2:
                int length = bArr.length;
                this.f45381a = bArr;
                this.f45382b = 0;
                this.f45383c = length;
                break;
            default:
                this.f45381a = bArr;
                this.f45383c = bArr.length;
                break;
        }
    }
}
