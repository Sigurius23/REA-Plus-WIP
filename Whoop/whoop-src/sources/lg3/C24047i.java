package lg3;

import java.math.BigInteger;
import ng3.InterfaceC26700m;
import org.threeten.p379bp.DateTimeException;
import p012ab.C0682h0;
import p108e4.AbstractC12682p;
import p497t7.InterfaceC33561b;
import p715kotlin.time.DurationKt;

/* JADX INFO: renamed from: lg3.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C24047i implements InterfaceC24044f {

    /* JADX INFO: renamed from: F */
    public static final int[] f95034F = {0, 10, 100, 1000, InterfaceC33561b.INVALID_OWNERSHIP, 100000, DurationKt.NANOS_IN_MILLIS, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: E */
    public final int f95035E;

    /* JADX INFO: renamed from: w */
    public final InterfaceC26700m f95036w;

    /* JADX INFO: renamed from: x */
    public final int f95037x;

    /* JADX INFO: renamed from: y */
    public final int f95038y;

    /* JADX INFO: renamed from: z */
    public final int f95039z;

    public C24047i(InterfaceC26700m interfaceC26700m, int i13, int i14, int i15) {
        this.f95036w = interfaceC26700m;
        this.f95037x = i13;
        this.f95038y = i14;
        this.f95039z = i15;
        this.f95035E = 0;
    }

    @Override // lg3.InterfaceC24044f
    /* JADX INFO: renamed from: a */
    public final int mo70946a(C24055q c24055q, CharSequence charSequence, int i13) {
        boolean z4;
        boolean z13;
        boolean z14;
        boolean z15;
        int i14;
        long j7;
        BigInteger bigIntegerDivide;
        int i15;
        int i16 = i13;
        int length = charSequence.length();
        if (i16 == length) {
            return ~i16;
        }
        char cCharAt = charSequence.charAt(i13);
        C24058t c24058t = (C24058t) c24055q.f95070d;
        c24058t.getClass();
        int i17 = this.f95038y;
        int i18 = this.f95039z;
        int i19 = this.f95037x;
        if (cCharAt == '+') {
            boolean z16 = c24055q.f95069c;
            boolean z17 = i19 == i17;
            int iM35485e = AbstractC12682p.m35485e(i18);
            if (iM35485e == 0 ? z16 : !(iM35485e == 1 || iM35485e == 4 || (!z16 && !z17))) {
                return ~i16;
            }
            i16++;
            z13 = true;
            z4 = false;
        } else {
            c24058t.getClass();
            if (cCharAt == '-') {
                boolean z18 = c24055q.f95069c;
                boolean z19 = i19 == i17;
                int iM35485e2 = AbstractC12682p.m35485e(i18);
                if (iM35485e2 != 0 && iM35485e2 != 1 && iM35485e2 != 4 && (z18 || z19)) {
                    return ~i16;
                }
                i16++;
                z4 = true;
            } else {
                if (i18 == 2 && c24055q.f95069c) {
                    return ~i16;
                }
                z4 = false;
            }
            z13 = false;
        }
        boolean z24 = c24055q.f95069c;
        int i24 = this.f95035E;
        int i25 = (z24 || i24 == -1 || (i24 > 0 && i19 == i17 && i18 == 4)) ? i19 : 1;
        int i26 = i16 + i25;
        if (i26 > length) {
            return ~i16;
        }
        if (!z24 && i24 != -1 && (i24 <= 0 || i19 != i17 || i18 != 4)) {
            i17 = 9;
        }
        int i27 = 0;
        int iMax = Math.max(i24, 0) + i17;
        while (true) {
            if (i27 >= 2) {
                z14 = z4;
                z15 = z13;
                i14 = i16;
                j7 = 0;
                bigIntegerDivide = null;
                break;
            }
            int iMin = Math.min(i16 + iMax, length);
            int i28 = i16;
            long j13 = 0;
            BigInteger bigIntegerAdd = null;
            while (true) {
                if (i28 >= iMin) {
                    i15 = length;
                    z14 = z4;
                    break;
                }
                int i29 = i28 + 1;
                char cCharAt2 = charSequence.charAt(i28);
                c24058t.getClass();
                i15 = length;
                int i34 = cCharAt2 - '0';
                z14 = z4;
                if (i34 < 0 || i34 > 9) {
                    i34 = -1;
                }
                if (i34 < 0) {
                    if (i28 >= i26) {
                        break;
                    }
                    return ~i16;
                }
                if (i29 - i16 > 18) {
                    if (bigIntegerAdd == null) {
                        bigIntegerAdd = BigInteger.valueOf(j13);
                    }
                    bigIntegerAdd = bigIntegerAdd.multiply(BigInteger.TEN).add(BigInteger.valueOf(i34));
                } else {
                    j13 = (j13 * 10) + ((long) i34);
                }
                i28 = i29;
                z4 = z14;
                length = i15;
                c24058t = c24058t;
                z13 = z13;
            }
            C24058t c24058t2 = c24058t;
            z15 = z13;
            if (i24 <= 0 || i27 != 0) {
                i14 = i28;
                bigIntegerDivide = bigIntegerAdd;
                j7 = j13;
                break;
            }
            iMax = Math.max(i25, (i28 - i16) - i24);
            i27++;
            z4 = z14;
            length = i15;
            c24058t = c24058t2;
            z13 = z15;
        }
        if (z14) {
            if (bigIntegerDivide != null) {
                if (bigIntegerDivide.equals(BigInteger.ZERO) && c24055q.f95069c) {
                    return ~(i16 - 1);
                }
                bigIntegerDivide = bigIntegerDivide.negate();
            } else {
                if (j7 == 0 && c24055q.f95069c) {
                    return ~(i16 - 1);
                }
                j7 = -j7;
            }
        } else if (i18 == 5 && c24055q.f95069c) {
            int i35 = i14 - i16;
            if (z15) {
                if (i35 <= i19) {
                    return ~(i16 - 1);
                }
            } else if (i35 > i19) {
                return ~i16;
            }
        }
        if (bigIntegerDivide == null) {
            return c24055q.m70974k(this.f95036w, j7, i16, i14);
        }
        if (bigIntegerDivide.bitLength() > 63) {
            bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
            i14--;
        }
        return c24055q.m70974k(this.f95036w, bigIntegerDivide.longValue(), i16, i14);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    @Override // lg3.InterfaceC24044f
    /* JADX INFO: renamed from: b */
    public final boolean mo70947b(C0682h0 c0682h0, StringBuilder sb4) {
        InterfaceC26700m interfaceC26700m = this.f95036w;
        Long lM1703r = c0682h0.m1703r(interfaceC26700m);
        if (lM1703r == null) {
            return false;
        }
        long jLongValue = lM1703r.longValue();
        C24058t c24058t = (C24058t) c0682h0.f2434z;
        String string = jLongValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jLongValue));
        int length = string.length();
        int i13 = this.f95038y;
        if (length > i13) {
            throw new DateTimeException("Field " + interfaceC26700m + " cannot be printed as the value " + jLongValue + " exceeds the maximum print width of " + i13);
        }
        c24058t.getClass();
        int i14 = this.f95037x;
        int i15 = this.f95039z;
        if (jLongValue >= 0) {
            int iM35485e = AbstractC12682p.m35485e(i15);
            if (iM35485e == 1) {
                sb4.append('+');
            } else if (iM35485e == 4 && i14 < 19 && jLongValue >= f95034F[i14]) {
                sb4.append('+');
            }
        } else {
            int iM35485e2 = AbstractC12682p.m35485e(i15);
            if (iM35485e2 == 0 || iM35485e2 == 1) {
                sb4.append('-');
            } else {
                if (iM35485e2 == 3) {
                    throw new DateTimeException("Field " + interfaceC26700m + " cannot be printed as the value " + jLongValue + " cannot be negative according to the SignStyle");
                }
                if (iM35485e2 == 4) {
                    sb4.append('-');
                }
            }
        }
        for (int i16 = 0; i16 < i14 - string.length(); i16++) {
            sb4.append('0');
        }
        sb4.append(string);
        return true;
    }

    public final String toString() {
        String str;
        InterfaceC26700m interfaceC26700m = this.f95036w;
        int i13 = this.f95039z;
        int i14 = this.f95038y;
        int i15 = this.f95037x;
        if (i15 == 1 && i14 == 19 && i13 == 1) {
            return "Value(" + interfaceC26700m + ")";
        }
        if (i15 == i14 && i13 == 4) {
            return "Value(" + interfaceC26700m + "," + i15 + ")";
        }
        StringBuilder sb4 = new StringBuilder("Value(");
        sb4.append(interfaceC26700m);
        sb4.append(",");
        sb4.append(i15);
        sb4.append(",");
        sb4.append(i14);
        sb4.append(",");
        if (i13 == 1) {
            str = "NORMAL";
        } else if (i13 == 2) {
            str = "ALWAYS";
        } else if (i13 == 3) {
            str = "NEVER";
        } else if (i13 != 4) {
            str = i13 != 5 ? "null" : "EXCEEDS_PAD";
        } else {
            str = "NOT_NEGATIVE";
        }
        sb4.append(str);
        sb4.append(")");
        return sb4.toString();
    }

    public C24047i(InterfaceC26700m interfaceC26700m, int i13, int i14, int i15, int i16) {
        this.f95036w = interfaceC26700m;
        this.f95037x = i13;
        this.f95038y = i14;
        this.f95039z = i15;
        this.f95035E = i16;
    }
}
