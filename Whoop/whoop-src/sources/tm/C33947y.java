package tm;

import java.util.Arrays;
import p309lo.AbstractC24543a;

/* JADX INFO: renamed from: tm.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C33947y {

    /* JADX INFO: renamed from: a */
    public final int f142322a;

    /* JADX INFO: renamed from: b */
    public final int f142323b;

    /* JADX INFO: renamed from: c */
    public final float f142324c;

    /* JADX INFO: renamed from: d */
    public final float f142325d;

    /* JADX INFO: renamed from: e */
    public final float f142326e;

    /* JADX INFO: renamed from: f */
    public final int f142327f;

    /* JADX INFO: renamed from: g */
    public final int f142328g;

    /* JADX INFO: renamed from: h */
    public final int f142329h;

    /* JADX INFO: renamed from: i */
    public final short[] f142330i;

    /* JADX INFO: renamed from: j */
    public short[] f142331j;

    /* JADX INFO: renamed from: k */
    public int f142332k;

    /* JADX INFO: renamed from: l */
    public short[] f142333l;

    /* JADX INFO: renamed from: m */
    public int f142334m;

    /* JADX INFO: renamed from: n */
    public short[] f142335n;

    /* JADX INFO: renamed from: o */
    public int f142336o;

    /* JADX INFO: renamed from: p */
    public int f142337p;

    /* JADX INFO: renamed from: q */
    public int f142338q;

    /* JADX INFO: renamed from: r */
    public int f142339r;

    /* JADX INFO: renamed from: s */
    public int f142340s;

    /* JADX INFO: renamed from: t */
    public int f142341t;

    /* JADX INFO: renamed from: u */
    public int f142342u;

    /* JADX INFO: renamed from: v */
    public int f142343v;

    public C33947y(int i13, int i14, float f13, float f14, int i15) {
        this.f142322a = i13;
        this.f142323b = i14;
        this.f142324c = f13;
        this.f142325d = f14;
        this.f142326e = i13 / i15;
        this.f142327f = i13 / 400;
        int i16 = i13 / 65;
        this.f142328g = i16;
        int i17 = i16 * 2;
        this.f142329h = i17;
        this.f142330i = new short[i17];
        this.f142331j = new short[i17 * i14];
        this.f142333l = new short[i17 * i14];
        this.f142335n = new short[i17 * i14];
    }

    /* JADX INFO: renamed from: e */
    public static void m107383e(int i13, int i14, short[] sArr, int i15, short[] sArr2, int i16, short[] sArr3, int i17) {
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
    public final void m107384a(short[] sArr, int i13, int i14) {
        short[] sArrM107386c = m107386c(this.f142333l, this.f142334m, i14);
        this.f142333l = sArrM107386c;
        int i15 = this.f142323b;
        System.arraycopy(sArr, i13 * i15, sArrM107386c, this.f142334m * i15, i15 * i14);
        this.f142334m += i14;
    }

    /* JADX INFO: renamed from: b */
    public final void m107385b(short[] sArr, int i13, int i14) {
        int i15 = this.f142329h / i14;
        int i16 = this.f142323b;
        int i17 = i14 * i16;
        int i18 = i13 * i16;
        for (int i19 = 0; i19 < i15; i19++) {
            int i24 = 0;
            for (int i25 = 0; i25 < i17; i25++) {
                i24 += sArr[(i19 * i17) + i18 + i25];
            }
            this.f142330i[i19] = (short) (i24 / i17);
        }
    }

    /* JADX INFO: renamed from: c */
    public final short[] m107386c(short[] sArr, int i13, int i14) {
        int length = sArr.length;
        int i15 = this.f142323b;
        int i16 = length / i15;
        return i13 + i14 <= i16 ? sArr : Arrays.copyOf(sArr, (((i16 * 3) / 2) + i14) * i15);
    }

    /* JADX INFO: renamed from: d */
    public final int m107387d(short[] sArr, int i13, int i14, int i15) {
        int i16 = i13 * this.f142323b;
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
        this.f142342u = i18 / i19;
        this.f142343v = i24 / i17;
        return i19;
    }

    /* JADX INFO: renamed from: f */
    public final void m107388f() {
        float f13;
        float f14;
        float f15;
        double d3;
        int iM107387d;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24 = this.f142334m;
        float f16 = this.f142324c;
        float f17 = this.f142325d;
        float f18 = f16 / f17;
        float f19 = this.f142326e * f17;
        double d14 = f18;
        int i25 = this.f142322a;
        int i26 = 1;
        int i27 = this.f142323b;
        if (d14 > 1.00001d || d14 < 0.99999d) {
            int i28 = this.f142332k;
            int i29 = this.f142329h;
            if (i28 >= i29) {
                int i34 = 0;
                while (true) {
                    int i35 = this.f142339r;
                    if (i35 > 0) {
                        int iMin = Math.min(i29, i35);
                        m107384a(this.f142331j, i34, iMin);
                        this.f142339r -= iMin;
                        i34 += iMin;
                        f14 = f18;
                        f15 = f19;
                        d3 = d14;
                        f13 = 1.0f;
                    } else {
                        short[] sArr = this.f142331j;
                        int i36 = i25 > 4000 ? i25 / 4000 : i26;
                        f13 = 1.0f;
                        int i37 = this.f142328g;
                        int i38 = this.f142327f;
                        if (i27 == i26 && i36 == i26) {
                            iM107387d = m107387d(sArr, i34, i38, i37);
                            f14 = f18;
                            f15 = f19;
                            d3 = d14;
                        } else {
                            m107385b(sArr, i34, i36);
                            f14 = f18;
                            f15 = f19;
                            short[] sArr2 = this.f142330i;
                            d3 = d14;
                            int iM107387d2 = m107387d(sArr2, 0, i38 / i36, i37 / i36);
                            if (i36 != 1) {
                                int i39 = iM107387d2 * i36;
                                int i44 = i36 * 4;
                                int i45 = i39 - i44;
                                int i46 = i39 + i44;
                                if (i45 >= i38) {
                                    i38 = i45;
                                }
                                if (i46 <= i37) {
                                    i37 = i46;
                                }
                                if (i27 == 1) {
                                    iM107387d = m107387d(sArr, i34, i38, i37);
                                } else {
                                    m107385b(sArr, i34, 1);
                                    iM107387d = m107387d(sArr2, 0, i38, i37);
                                }
                            } else {
                                iM107387d = iM107387d2;
                            }
                        }
                        int i47 = this.f142342u;
                        int i48 = this.f142343v;
                        if (i47 == 0 || (i13 = this.f142340s) == 0 || i48 > i47 * 3 || i47 * 2 <= this.f142341t * 3) {
                            i13 = iM107387d;
                        }
                        this.f142341t = i47;
                        this.f142340s = iM107387d;
                        if (d3 > 1.0d) {
                            short[] sArr3 = this.f142331j;
                            if (f14 >= 2.0f) {
                                i15 = (int) (i13 / (f14 - 1.0f));
                            } else {
                                this.f142339r = (int) (((2.0f - f14) * i13) / (f14 - 1.0f));
                                i15 = i13;
                            }
                            short[] sArrM107386c = m107386c(this.f142333l, this.f142334m, i15);
                            this.f142333l = sArrM107386c;
                            int i49 = i34 + i13;
                            int i54 = i34;
                            int i55 = i15;
                            m107383e(i55, this.f142323b, sArrM107386c, this.f142334m, sArr3, i54, sArr3, i49);
                            this.f142334m += i55;
                            i34 = i13 + i55 + i54;
                        } else {
                            int i56 = i34;
                            short[] sArr4 = this.f142331j;
                            if (f14 < 0.5f) {
                                i14 = (int) ((i13 * f14) / (1.0f - f14));
                            } else {
                                this.f142339r = (int) ((((2.0f * f14) - 1.0f) * i13) / (1.0f - f14));
                                i14 = i13;
                            }
                            int i57 = i13 + i14;
                            short[] sArrM107386c2 = m107386c(this.f142333l, this.f142334m, i57);
                            this.f142333l = sArrM107386c2;
                            System.arraycopy(sArr4, i56 * i27, sArrM107386c2, this.f142334m * i27, i13 * i27);
                            m107383e(i14, this.f142323b, this.f142333l, this.f142334m + i13, sArr4, i56 + i13, sArr4, i56);
                            this.f142334m += i57;
                            i34 = i56 + i14;
                        }
                    }
                    if (i34 + i29 > i28) {
                        break;
                    }
                    i26 = 1;
                    f18 = f14;
                    f19 = f15;
                    d14 = d3;
                }
                int i58 = this.f142332k - i34;
                short[] sArr5 = this.f142331j;
                System.arraycopy(sArr5, i34 * i27, sArr5, 0, i58 * i27);
                this.f142332k = i58;
            }
            if (f15 != f13 || this.f142334m == i24) {
            }
            int i59 = (int) (i25 / f15);
            while (true) {
                if (i59 <= 16384 && i25 <= 16384) {
                    break;
                }
                i59 /= 2;
                i25 /= 2;
            }
            int i64 = this.f142334m - i24;
            short[] sArrM107386c3 = m107386c(this.f142335n, this.f142336o, i64);
            this.f142335n = sArrM107386c3;
            System.arraycopy(this.f142333l, i24 * i27, sArrM107386c3, this.f142336o * i27, i64 * i27);
            this.f142334m = i24;
            this.f142336o += i64;
            int i65 = 0;
            while (true) {
                i16 = this.f142336o;
                i17 = i16 - 1;
                if (i65 >= i17) {
                    break;
                }
                while (true) {
                    i18 = this.f142337p + 1;
                    int i66 = i18 * i59;
                    i19 = this.f142338q;
                    if (i66 <= i19 * i25) {
                        break;
                    }
                    this.f142333l = m107386c(this.f142333l, this.f142334m, 1);
                    for (int i67 = 0; i67 < i27; i67++) {
                        short[] sArr6 = this.f142333l;
                        int i68 = (this.f142334m * i27) + i67;
                        short[] sArr7 = this.f142335n;
                        int i69 = (i65 * i27) + i67;
                        short s13 = sArr7[i69];
                        short s14 = sArr7[i69 + i27];
                        int i74 = this.f142338q * i25;
                        int i75 = this.f142337p;
                        int i76 = i75 * i59;
                        int i77 = (i75 + 1) * i59;
                        int i78 = i77 - i74;
                        int i79 = i77 - i76;
                        sArr6[i68] = (short) ((((i79 - i78) * s14) + (s13 * i78)) / i79);
                    }
                    this.f142338q++;
                    this.f142334m++;
                }
                this.f142337p = i18;
                if (i18 == i25) {
                    this.f142337p = 0;
                    AbstractC24543a.m71573i(i19 == i59);
                    this.f142338q = 0;
                }
                i65++;
            }
            if (i17 == 0) {
                return;
            }
            short[] sArr8 = this.f142335n;
            System.arraycopy(sArr8, i17 * i27, sArr8, 0, (i16 - i17) * i27);
            this.f142336o -= i17;
            return;
        }
        m107384a(this.f142331j, 0, this.f142332k);
        this.f142332k = 0;
        f15 = f19;
        f13 = 1.0f;
        if (f15 != f13) {
        }
    }
}
