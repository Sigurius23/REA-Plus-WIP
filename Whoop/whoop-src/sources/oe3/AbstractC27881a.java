package oe3;

import java.io.EOFException;
import ne3.AbstractC26604b;
import ne3.C26607c0;
import ne3.C26616h;
import ne3.C26623k0;
import ne3.C26624l;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb0.AbstractC39383f;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: oe3.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC27881a {

    /* JADX INFO: renamed from: a */
    public static final byte[] f112425a;

    /* JADX INFO: renamed from: b */
    public static final long[] f112426b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(AbstractC39397a.f169546a);
        AbstractC22676k.m65749i(bytes, "getBytes(...)");
        f112425a = bytes;
        f112426b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    /* JADX INFO: renamed from: a */
    public static final long m84147a(C26616h c26616h, C26624l bytes, long j7, long j13, int i13) {
        C26623k0 c26623k0;
        byte[] bArr;
        long j14 = j7;
        long j15 = j13;
        AbstractC22676k.m65750j(bytes, "bytes");
        long j16 = i13;
        AbstractC26604b.m79160e(bytes.mo79253d(), 0, j16);
        if (i13 <= 0) {
            throw new IllegalArgumentException("byteCount == 0");
        }
        long j17 = 0;
        if (j14 < 0) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j14, "fromIndex < 0: ").toString());
        }
        if (j14 > j15) {
            StringBuilder sbM125596b = AbstractC39383f.m125596b(j14, "fromIndex > toIndex: ", " > ");
            sbM125596b.append(j15);
            throw new IllegalArgumentException(sbM125596b.toString().toString());
        }
        long j18 = c26616h.f105866x;
        if (j15 > j18) {
            j15 = j18;
        }
        if (j14 == j15 || (c26623k0 = c26616h.f105865w) == null) {
            return -1L;
        }
        if (j18 - j14 >= j14) {
            while (true) {
                long j19 = ((long) (c26623k0.f105876c - c26623k0.f105875b)) + j17;
                if (j19 > j14) {
                    break;
                }
                c26623k0 = c26623k0.f105879f;
                AbstractC22676k.m65747g(c26623k0);
                j17 = j19;
            }
            byte[] bArrMo79256h = bytes.mo79256h();
            byte b = bArrMo79256h[0];
            long jMin = Math.min(j15, (c26616h.f105866x - j16) + 1);
            while (j17 < jMin) {
                byte[] bArr2 = c26623k0.f105874a;
                int iMin = (int) Math.min(c26623k0.f105876c, (((long) c26623k0.f105875b) + jMin) - j17);
                for (int i14 = (int) ((((long) c26623k0.f105875b) + j14) - j17); i14 < iMin; i14++) {
                    if (bArr2[i14] == b && m84148b(c26623k0, i14 + 1, bArrMo79256h, 1, i13)) {
                        return ((long) (i14 - c26623k0.f105875b)) + j17;
                    }
                }
                j17 += (long) (c26623k0.f105876c - c26623k0.f105875b);
                c26623k0 = c26623k0.f105879f;
                AbstractC22676k.m65747g(c26623k0);
                j14 = j17;
            }
            return -1L;
        }
        while (j18 > j14) {
            c26623k0 = c26623k0.f105880g;
            AbstractC22676k.m65747g(c26623k0);
            j18 -= (long) (c26623k0.f105876c - c26623k0.f105875b);
        }
        byte[] bArrMo79256h2 = bytes.mo79256h();
        byte b6 = bArrMo79256h2[0];
        byte[] bArr3 = bArrMo79256h2;
        long jMin2 = Math.min(j15, (c26616h.f105866x - j16) + 1);
        while (j18 < jMin2) {
            byte[] bArr4 = c26623k0.f105874a;
            int iMin2 = (int) Math.min(c26623k0.f105876c, (((long) c26623k0.f105875b) + jMin2) - j18);
            int i15 = (int) ((((long) c26623k0.f105875b) + j14) - j18);
            while (i15 < iMin2) {
                if (bArr4[i15] == b6) {
                    bArr = bArr3;
                    if (m84148b(c26623k0, i15 + 1, bArr, 1, i13)) {
                        return ((long) (i15 - c26623k0.f105875b)) + j18;
                    }
                } else {
                    bArr = bArr3;
                }
                i15++;
                bArr3 = bArr;
            }
            j18 += (long) (c26623k0.f105876c - c26623k0.f105875b);
            c26623k0 = c26623k0.f105879f;
            AbstractC22676k.m65747g(c26623k0);
            j14 = j18;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m84148b(C26623k0 c26623k0, int i13, byte[] bArr, int i14, int i15) {
        int i16 = c26623k0.f105876c;
        byte[] bArr2 = c26623k0.f105874a;
        while (i14 < i15) {
            if (i13 == i16) {
                c26623k0 = c26623k0.f105879f;
                AbstractC22676k.m65747g(c26623k0);
                byte[] bArr3 = c26623k0.f105874a;
                bArr2 = bArr3;
                i13 = c26623k0.f105875b;
                i16 = c26623k0.f105876c;
            }
            if (bArr2[i13] != bArr[i14]) {
                return false;
            }
            i13++;
            i14++;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static final String m84149c(C26616h c26616h, long j7) throws EOFException {
        if (j7 > 0) {
            long j13 = j7 - 1;
            if (c26616h.m79229s(j13) == 13) {
                String strM79188M0 = c26616h.m79188M0(j13, AbstractC39397a.f169546a);
                c26616h.skip(2L);
                return strM79188M0;
            }
        }
        String strM79188M1 = c26616h.m79188M0(j7, AbstractC39397a.f169546a);
        c26616h.skip(1L);
        return strM79188M1;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a3 A[LOOP:0: B:8:0x001e->B:49:0x00a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2 A[SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final int m84150d(C26616h c26616h, C26607c0 options, boolean z4) {
        int i13;
        int i14;
        int i15;
        C26623k0 c26623k0;
        int i16;
        AbstractC22676k.m65750j(options, "options");
        C26623k0 c26623k1 = c26616h.f105865w;
        if (c26623k1 == null) {
            return z4 ? -2 : -1;
        }
        byte[] bArr = c26623k1.f105874a;
        int i17 = c26623k1.f105875b;
        int i18 = c26623k1.f105876c;
        int[] iArr = options.f105836x;
        C26623k0 c26623k2 = c26623k1;
        int i19 = -1;
        int i24 = 0;
        loop0: while (true) {
            int i25 = i24 + 1;
            int i26 = iArr[i24];
            int i27 = i24 + 2;
            int i28 = iArr[i25];
            if (i28 != -1) {
                i19 = i28;
            }
            if (c26623k2 == null) {
                break;
            }
            if (i26 >= 0) {
                int i29 = i17 + 1;
                int i34 = bArr[i17] & 255;
                int i35 = i27 + i26;
                while (i27 != i35) {
                    if (i34 == iArr[i27]) {
                        i13 = iArr[i27 + i26];
                        if (i29 == i18) {
                            c26623k2 = c26623k2.f105879f;
                            AbstractC22676k.m65747g(c26623k2);
                            int i36 = c26623k2.f105875b;
                            byte[] bArr2 = c26623k2.f105874a;
                            i14 = c26623k2.f105876c;
                            if (c26623k2 == c26623k1) {
                                i15 = i36;
                                bArr = bArr2;
                                c26623k2 = null;
                            } else {
                                i15 = i36;
                                bArr = bArr2;
                            }
                        } else {
                            i14 = i18;
                            i15 = i29;
                        }
                        if (i13 >= 0) {
                            return i13;
                        }
                        int i37 = i14;
                        i24 = -i13;
                        i17 = i15;
                        i18 = i37;
                    } else {
                        i27++;
                    }
                }
                return i19;
            }
            int i38 = (i26 * (-1)) + i27;
            while (true) {
                int i39 = i17 + 1;
                int i44 = i27 + 1;
                if ((bArr[i17] & 255) == iArr[i27]) {
                    boolean z13 = i44 == i38;
                    if (i39 == i18) {
                        AbstractC22676k.m65747g(c26623k2);
                        C26623k0 c26623k3 = c26623k2.f105879f;
                        AbstractC22676k.m65747g(c26623k3);
                        i15 = c26623k3.f105875b;
                        byte[] bArr3 = c26623k3.f105874a;
                        i16 = c26623k3.f105876c;
                        if (c26623k3 != c26623k1) {
                            c26623k0 = c26623k3;
                            bArr = bArr3;
                        } else {
                            if (!z13) {
                                break loop0;
                            }
                            bArr = bArr3;
                            c26623k0 = null;
                        }
                    } else {
                        c26623k0 = c26623k2;
                        i16 = i18;
                        i15 = i39;
                    }
                    if (z13) {
                        i13 = iArr[i44];
                        int i45 = i16;
                        c26623k2 = c26623k0;
                        i14 = i45;
                        break;
                    }
                    i17 = i15;
                    i18 = i16;
                    c26623k2 = c26623k0;
                    i27 = i44;
                }
                return i19;
            }
            if (i13 >= 0) {
                return i13;
            }
            int i310 = i14;
            i24 = -i13;
            i17 = i15;
            i18 = i310;
        }
        if (z4) {
            return -2;
        }
        return i19;
    }
}
