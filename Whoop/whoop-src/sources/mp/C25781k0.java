package mp;

import java.math.RoundingMode;
import java.util.Arrays;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: mp.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C25781k0 {

    /* JADX INFO: renamed from: a */
    public final String f101500a;

    /* JADX INFO: renamed from: b */
    public final char[] f101501b;

    /* JADX INFO: renamed from: c */
    public final int f101502c;

    /* JADX INFO: renamed from: d */
    public final int f101503d;

    /* JADX INFO: renamed from: e */
    public final int f101504e;

    /* JADX INFO: renamed from: f */
    public final int f101505f;

    /* JADX INFO: renamed from: g */
    public final byte[] f101506g;

    /* JADX INFO: renamed from: h */
    public final boolean f101507h;

    /* JADX WARN: Illegal instructions before constructor call */
    public C25781k0(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i13 = 0; i13 < cArr.length; i13++) {
            char c3 = cArr[i13];
            if (!(c3 < 128)) {
                throw new IllegalArgumentException(AbstractC25753b.m75991c("Non-ASCII character: %s", Character.valueOf(c3)));
            }
            if (!(bArr[c3] == -1)) {
                throw new IllegalArgumentException(AbstractC25753b.m75991c("Duplicate character: %s", Character.valueOf(c3)));
            }
            bArr[c3] = (byte) i13;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C25781k0)) {
            return false;
        }
        C25781k0 c25781k0 = (C25781k0) obj;
        return this.f101507h == c25781k0.f101507h && Arrays.equals(this.f101501b, c25781k0.f101501b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f101501b) + (true != this.f101507h ? 1237 : 1231);
    }

    public final String toString() {
        return this.f101500a;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0061 A[LOOP:0: B:16:0x005d->B:18:0x0061, LOOP_END] */
    public C25781k0(String str, char[] cArr, byte[] bArr, boolean z4) {
        int iNumberOfLeadingZeros;
        boolean[] zArr;
        int i13;
        this.f101500a = str;
        cArr.getClass();
        this.f101501b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (AbstractC25791o0.f101522a[roundingMode.ordinal()]) {
                    case 1:
                        if (((length - 1) & length) != 0) {
                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                        }
                    case 2:
                    case 3:
                        iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                        this.f101503d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i14 = 1 << (3 - iNumberOfTrailingZeros);
                        this.f101504e = i14;
                        this.f101505f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros;
                        this.f101502c = length - 1;
                        this.f101506g = bArr;
                        zArr = new boolean[i14];
                        for (i13 = 0; i13 < this.f101505f; i13++) {
                            int i15 = this.f101503d;
                            RoundingMode roundingMode2 = RoundingMode.CEILING;
                            zArr[AbstractC25753b.m75989a(i13 * 8, i15)] = true;
                        }
                        this.f101507h = z4;
                        return;
                    case 4:
                    case 5:
                        iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                        this.f101503d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros2 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i16 = 1 << (3 - iNumberOfTrailingZeros2);
                        this.f101504e = i16;
                        this.f101505f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros2;
                        this.f101502c = length - 1;
                        this.f101506g = bArr;
                        zArr = new boolean[i16];
                        while (i13 < this.f101505f) {
                            int i17 = this.f101503d;
                            RoundingMode roundingMode3 = RoundingMode.CEILING;
                            zArr[AbstractC25753b.m75989a(i13 * 8, i17)] = true;
                        }
                        this.f101507h = z4;
                        return;
                    case 6:
                    case 7:
                    case 8:
                        int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                        iNumberOfLeadingZeros = (31 - iNumberOfLeadingZeros2) + ((((-1257966797) >>> iNumberOfLeadingZeros2) - length) >>> 31);
                        this.f101503d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros3 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i18 = 1 << (3 - iNumberOfTrailingZeros3);
                        this.f101504e = i18;
                        this.f101505f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros3;
                        this.f101502c = length - 1;
                        this.f101506g = bArr;
                        zArr = new boolean[i18];
                        while (i13 < this.f101505f) {
                            int i19 = this.f101503d;
                            RoundingMode roundingMode4 = RoundingMode.CEILING;
                            zArr[AbstractC25753b.m75989a(i13 * 8, i19)] = true;
                        }
                        this.f101507h = z4;
                        return;
                    default:
                        throw new AssertionError();
                }
            } else {
                throw new IllegalArgumentException("x (0) must be > 0");
            }
        } catch (ArithmeticException e5) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(cArr.length, "Illegal alphabet length "), e5);
        }
    }
}
