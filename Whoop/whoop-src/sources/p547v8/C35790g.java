package p547v8;

import java.util.Arrays;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: v8.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C35790g {

    /* JADX INFO: renamed from: a */
    public final int f152206a;

    /* JADX INFO: renamed from: b */
    public final int f152207b;

    /* JADX INFO: renamed from: c */
    public final float f152208c;

    /* JADX INFO: renamed from: d */
    public final float f152209d;

    /* JADX INFO: renamed from: e */
    public final float f152210e;

    /* JADX INFO: renamed from: f */
    public final int f152211f;

    /* JADX INFO: renamed from: g */
    public final int f152212g;

    /* JADX INFO: renamed from: h */
    public final int f152213h;

    /* JADX INFO: renamed from: i */
    public final short[] f152214i;

    /* JADX INFO: renamed from: j */
    public short[] f152215j;

    /* JADX INFO: renamed from: k */
    public int f152216k;

    /* JADX INFO: renamed from: l */
    public short[] f152217l;

    /* JADX INFO: renamed from: m */
    public int f152218m;

    /* JADX INFO: renamed from: n */
    public short[] f152219n;

    /* JADX INFO: renamed from: o */
    public int f152220o;

    /* JADX INFO: renamed from: p */
    public int f152221p;

    /* JADX INFO: renamed from: q */
    public int f152222q;

    /* JADX INFO: renamed from: r */
    public int f152223r;

    /* JADX INFO: renamed from: s */
    public int f152224s;

    /* JADX INFO: renamed from: t */
    public int f152225t;

    /* JADX INFO: renamed from: u */
    public int f152226u;

    /* JADX INFO: renamed from: v */
    public int f152227v;

    /* JADX INFO: renamed from: w */
    public double f152228w;

    public C35790g(int i13, int i14, float f13, float f14, int i15) {
        this.f152206a = i13;
        this.f152207b = i14;
        this.f152208c = f13;
        this.f152209d = f14;
        this.f152210e = i13 / i15;
        this.f152211f = i13 / 400;
        int i16 = i13 / 65;
        this.f152212g = i16;
        int i17 = i16 * 2;
        this.f152213h = i17;
        this.f152214i = new short[i17];
        this.f152215j = new short[i17 * i14];
        this.f152217l = new short[i17 * i14];
        this.f152219n = new short[i17 * i14];
    }

    /* JADX INFO: renamed from: e */
    public static void m113440e(int i13, int i14, short[] sArr, int i15, short[] sArr2, int i16, short[] sArr3, int i17) {
        for (int i18 = 0; i18 < i14; i18++) {
            int i19 = (i15 * i14) + i18;
            int i24 = (i17 * i14) + i18;
            int i25 = (i16 * i14) + i18;
            for (int i26 = 0; i26 < i13; i26++) {
                sArr[i19] = (short) (((sArr3[i24] * i26) + ((i13 - i26) * sArr2[i25])) / i13);
                i19 += i14;
                i25 += i14;
                i24 += i14;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m113441a(short[] sArr, int i13, int i14) {
        short[] sArrM113443c = m113443c(this.f152217l, this.f152218m, i14);
        this.f152217l = sArrM113443c;
        int i15 = this.f152207b;
        System.arraycopy(sArr, i13 * i15, sArrM113443c, this.f152218m * i15, i15 * i14);
        this.f152218m += i14;
    }

    /* JADX INFO: renamed from: b */
    public final void m113442b(short[] sArr, int i13, int i14) {
        int i15 = this.f152213h / i14;
        int i16 = this.f152207b;
        int i17 = i14 * i16;
        int i18 = i13 * i16;
        for (int i19 = 0; i19 < i15; i19++) {
            int i24 = 0;
            for (int i25 = 0; i25 < i17; i25++) {
                i24 += sArr[(i19 * i17) + i18 + i25];
            }
            this.f152214i[i19] = (short) (i24 / i17);
        }
    }

    /* JADX INFO: renamed from: c */
    public final short[] m113443c(short[] sArr, int i13, int i14) {
        int length = sArr.length;
        int i15 = this.f152207b;
        int i16 = length / i15;
        return i13 + i14 <= i16 ? sArr : Arrays.copyOf(sArr, (((i16 * 3) / 2) + i14) * i15);
    }

    /* JADX INFO: renamed from: d */
    public final int m113444d(short[] sArr, int i13, int i14, int i15) {
        int i16 = i13 * this.f152207b;
        int i17 = 255;
        int i18 = 1;
        int i19 = 0;
        int i24 = 0;
        while (i14 <= i15) {
            int iAbs = 0;
            for (int i25 = 0; i25 < i14; i25++) {
                iAbs += Math.abs(sArr[i16 + i25] - sArr[(i16 + i14) + i25]);
            }
            if (iAbs * i19 < i18 * i14) {
                i19 = i14;
                i18 = iAbs;
            }
            if (iAbs * i17 > i24 * i14) {
                i17 = i14;
                i24 = iAbs;
            }
            i14++;
        }
        this.f152226u = i18 / i19;
        this.f152227v = i24 / i17;
        return i19;
    }

    /* JADX INFO: renamed from: f */
    public final void m113445f() {
        float f13;
        double d3;
        int iM113444d;
        int i13;
        int i14;
        int iRound;
        int i15;
        int i16;
        int i17;
        long j7;
        long j13;
        int i18 = this.f152218m;
        float f14 = this.f152208c;
        float f15 = this.f152209d;
        double d14 = f14 / f15;
        float f16 = this.f152210e * f15;
        int i19 = this.f152206a;
        int i24 = 1;
        int i25 = this.f152207b;
        int i26 = 0;
        if (d14 > 1.0000100135803223d || d14 < 0.9999899864196777d) {
            int i27 = this.f152216k;
            int i28 = this.f152213h;
            if (i27 >= i28) {
                int i29 = 0;
                while (true) {
                    int i34 = this.f152223r;
                    if (i34 > 0) {
                        int iMin = Math.min(i28, i34);
                        m113441a(this.f152215j, i29, iMin);
                        this.f152223r -= iMin;
                        i29 += iMin;
                        f13 = f16;
                        d3 = d14;
                        i28 = i28;
                    } else {
                        short[] sArr = this.f152215j;
                        int i35 = i19 > 4000 ? i19 / 4000 : i24;
                        int i36 = this.f152212g;
                        int i37 = this.f152211f;
                        if (i25 == i24 && i35 == i24) {
                            iM113444d = m113444d(sArr, i29, i37, i36);
                            f13 = f16;
                            d3 = d14;
                        } else {
                            m113442b(sArr, i29, i35);
                            f13 = f16;
                            d3 = d14;
                            short[] sArr2 = this.f152214i;
                            int iM113444d2 = m113444d(sArr2, i26, i37 / i35, i36 / i35);
                            if (i35 != 1) {
                                int i38 = iM113444d2 * i35;
                                int i39 = i35 * 4;
                                int i44 = i38 - i39;
                                int i45 = i38 + i39;
                                if (i44 >= i37) {
                                    i37 = i44;
                                }
                                if (i45 <= i36) {
                                    i36 = i45;
                                }
                                if (i25 == 1) {
                                    iM113444d = m113444d(sArr, i29, i37, i36);
                                } else {
                                    m113442b(sArr, i29, 1);
                                    iM113444d = m113444d(sArr2, i26, i37, i36);
                                }
                            } else {
                                iM113444d = iM113444d2;
                            }
                        }
                        int i46 = this.f152226u;
                        int i47 = this.f152227v;
                        if (i46 == 0 || (i13 = this.f152224s) == 0 || i47 > i46 * 3 || i46 * 2 <= this.f152225t * 3) {
                            i13 = iM113444d;
                        }
                        this.f152225t = i46;
                        this.f152224s = iM113444d;
                        if (d3 > 1.0d) {
                            short[] sArr3 = this.f152215j;
                            if (d3 >= 2.0d) {
                                double d15 = (((double) i13) / (d3 - 1.0d)) + this.f152228w;
                                iRound = (int) Math.round(d15);
                                this.f152228w = d15 - ((double) iRound);
                            } else {
                                double d16 = (((2.0d - d3) * ((double) i13)) / (d3 - 1.0d)) + this.f152228w;
                                int iRound2 = (int) Math.round(d16);
                                this.f152223r = iRound2;
                                this.f152228w = d16 - ((double) iRound2);
                                iRound = i13;
                            }
                            short[] sArrM113443c = m113443c(this.f152217l, this.f152218m, iRound);
                            this.f152217l = sArrM113443c;
                            int i48 = i29 + i13;
                            int i49 = i29;
                            int i54 = iRound;
                            m113440e(i54, this.f152207b, sArrM113443c, this.f152218m, sArr3, i49, sArr3, i48);
                            this.f152218m += i54;
                            i29 = i13 + i54 + i49;
                        } else {
                            i28 = i28;
                            int i55 = i29;
                            short[] sArr4 = this.f152215j;
                            if (d3 < 0.5d) {
                                double d17 = ((((double) i13) * d3) / (1.0d - d3)) + this.f152228w;
                                int iRound3 = (int) Math.round(d17);
                                this.f152228w = d17 - ((double) iRound3);
                                i14 = iRound3;
                            } else {
                                double d18 = ((((d3 * 2.0d) - 1.0d) * ((double) i13)) / (1.0d - d3)) + this.f152228w;
                                int iRound4 = (int) Math.round(d18);
                                this.f152223r = iRound4;
                                this.f152228w = d18 - ((double) iRound4);
                                i14 = i13;
                            }
                            int i56 = i13 + i14;
                            short[] sArrM113443c2 = m113443c(this.f152217l, this.f152218m, i56);
                            this.f152217l = sArrM113443c2;
                            System.arraycopy(sArr4, i55 * i25, sArrM113443c2, this.f152218m * i25, i13 * i25);
                            m113440e(i14, this.f152207b, this.f152217l, this.f152218m + i13, sArr4, i55 + i13, sArr4, i55);
                            this.f152218m += i56;
                            i29 = i55 + i14;
                        }
                    }
                    if (i29 + i28 > i27) {
                        break;
                    }
                    i26 = 0;
                    i28 = i28;
                    i24 = 1;
                    f16 = f13;
                    d14 = d3;
                }
                int i57 = this.f152216k - i29;
                short[] sArr5 = this.f152215j;
                System.arraycopy(sArr5, i29 * i25, sArr5, 0, i57 * i25);
                this.f152216k = i57;
            }
            if (f13 != 1.0f || this.f152218m == i18) {
            }
            long j14 = (long) (i19 / f13);
            long j15 = i19;
            while (j14 != 0 && j15 != 0 && j14 % 2 == 0 && j15 % 2 == 0) {
                j14 /= 2;
                j15 /= 2;
            }
            int i58 = this.f152218m - i18;
            short[] sArrM113443c3 = m113443c(this.f152219n, this.f152220o, i58);
            this.f152219n = sArrM113443c3;
            System.arraycopy(this.f152217l, i18 * i25, sArrM113443c3, this.f152220o * i25, i58 * i25);
            this.f152218m = i18;
            this.f152220o += i58;
            int i59 = 0;
            while (true) {
                i15 = this.f152220o;
                i16 = i15 - 1;
                if (i59 >= i16) {
                    break;
                }
                while (true) {
                    i17 = this.f152221p + 1;
                    j7 = i17;
                    long j16 = j7 * j14;
                    j13 = this.f152222q;
                    if (j16 <= j13 * j15) {
                        break;
                    }
                    this.f152217l = m113443c(this.f152217l, this.f152218m, 1);
                    int i64 = 0;
                    while (i64 < i25) {
                        short[] sArr6 = this.f152217l;
                        int i65 = (this.f152218m * i25) + i64;
                        short[] sArr7 = this.f152219n;
                        int i66 = (i59 * i25) + i64;
                        short s13 = sArr7[i66];
                        short s14 = sArr7[i66 + i25];
                        long j17 = ((long) this.f152222q) * j15;
                        int i67 = this.f152221p;
                        long j18 = j14;
                        int i68 = i59;
                        long j19 = ((long) (i67 + 1)) * j18;
                        long j24 = j19 - j17;
                        long j25 = j19 - (((long) i67) * j18);
                        sArr6[i65] = (short) ((((j25 - j24) * ((long) s14)) + (((long) s13) * j24)) / j25);
                        i64++;
                        i59 = i68;
                        j14 = j18;
                    }
                    this.f152222q++;
                    this.f152218m++;
                    i59 = i59;
                    j14 = j14;
                }
                long j26 = j14;
                int i69 = i59;
                this.f152221p = i17;
                if (j7 == j15) {
                    this.f152221p = 0;
                    AbstractC35849g.m113807i(j13 == j26);
                    this.f152222q = 0;
                }
                i59 = i69 + 1;
                j14 = j26;
            }
            if (i16 == 0) {
                return;
            }
            short[] sArr8 = this.f152219n;
            System.arraycopy(sArr8, i16 * i25, sArr8, 0, (i15 - i16) * i25);
            this.f152220o -= i16;
            return;
        }
        m113441a(this.f152215j, 0, this.f152216k);
        this.f152216k = 0;
        f13 = f16;
        if (f13 != 1.0f) {
        }
    }
}
