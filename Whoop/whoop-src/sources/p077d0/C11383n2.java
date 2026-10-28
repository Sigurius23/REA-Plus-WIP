package p077d0;

import p002a0.C0020f0;
import p002a0.C0023g0;
import p014aj.C0929d;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: d0.n2 */
/* JADX INFO: loaded from: classes.dex */
public final class C11383n2 implements InterfaceC11363i2 {

    /* JADX INFO: renamed from: E */
    public int[] f36491E = AbstractC11359h2.f36411a;

    /* JADX INFO: renamed from: F */
    public float[] f36492F;

    /* JADX INFO: renamed from: G */
    public AbstractC11395r f36493G;

    /* JADX INFO: renamed from: H */
    public AbstractC11395r f36494H;

    /* JADX INFO: renamed from: I */
    public AbstractC11395r f36495I;

    /* JADX INFO: renamed from: J */
    public AbstractC11395r f36496J;

    /* JADX INFO: renamed from: K */
    public float[] f36497K;

    /* JADX INFO: renamed from: L */
    public float[] f36498L;

    /* JADX INFO: renamed from: M */
    public C0929d f36499M;

    /* JADX INFO: renamed from: w */
    public final C0020f0 f36500w;

    /* JADX INFO: renamed from: x */
    public final C0023g0 f36501x;

    /* JADX INFO: renamed from: y */
    public final int f36502y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC11419z f36503z;

    public C11383n2(C0020f0 c0020f0, C0023g0 c0023g0, int i13, InterfaceC11419z interfaceC11419z) {
        this.f36500w = c0020f0;
        this.f36501x = c0023g0;
        this.f36502y = i13;
        this.f36503z = interfaceC11419z;
        float[] fArr = AbstractC11359h2.f36412b;
        this.f36492F = fArr;
        this.f36497K = fArr;
        this.f36498L = fArr;
        this.f36499M = AbstractC11359h2.f36413c;
    }

    /* JADX INFO: renamed from: b */
    public final int m30612b(int i13) {
        int i14;
        C0020f0 c0020f0 = this.f36500w;
        int i15 = c0020f0.f47b;
        c0020f0.getClass();
        if (i15 <= 0 || i15 > c0020f0.f47b) {
            AbstractC34924m.m110135Q("");
            throw null;
        }
        int i16 = i15 - 1;
        int i17 = 0;
        while (true) {
            if (i17 <= i16) {
                i14 = (i17 + i16) >>> 1;
                int i18 = c0020f0.f46a[i14];
                if (i18 >= i13) {
                    if (i18 <= i13) {
                        break;
                    }
                    i16 = i14 - 1;
                } else {
                    i17 = i14 + 1;
                }
            } else {
                i14 = -(i17 + 1);
                break;
            }
        }
        return i14 < -1 ? -(i14 + 2) : i14;
    }

    /* JADX INFO: renamed from: d */
    public final float m30613d(int i13, int i14, boolean z4) {
        InterfaceC11419z interfaceC11419z;
        float f13;
        C0020f0 c0020f0 = this.f36500w;
        if (i13 >= c0020f0.f47b - 1) {
            f13 = i14;
        } else {
            int iM28c = c0020f0.m28c(i13);
            int iM28c2 = c0020f0.m28c(i13 + 1);
            if (i14 == iM28c) {
                f13 = iM28c;
            } else {
                int i15 = iM28c2 - iM28c;
                C11379m2 c11379m2 = (C11379m2) this.f36501x.m121b(iM28c);
                if (c11379m2 == null || (interfaceC11419z = c11379m2.f36482b) == null) {
                    interfaceC11419z = this.f36503z;
                }
                float f14 = i15;
                float fMo7226i = interfaceC11419z.mo7226i((i14 - iM28c) / f14);
                if (z4) {
                    return fMo7226i;
                }
                f13 = (f14 * fMo7226i) + iM28c;
            }
        }
        return f13 / 1000;
    }

    /* JADX INFO: renamed from: e */
    public final void m30614e(AbstractC11395r abstractC11395r, AbstractC11395r abstractC11395r2, AbstractC11395r abstractC11395r3) {
        float[] fArr;
        boolean z4 = this.f36499M != AbstractC11359h2.f36413c;
        AbstractC11395r abstractC11395r4 = this.f36493G;
        C0023g0 c0023g0 = this.f36501x;
        C0020f0 c0020f0 = this.f36500w;
        if (abstractC11395r4 == null) {
            this.f36493G = abstractC11395r.mo30609c();
            this.f36494H = abstractC11395r3.mo30609c();
            int i13 = c0020f0.f47b;
            float[] fArr2 = new float[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                fArr2[i14] = c0020f0.m28c(i14) / 1000;
            }
            this.f36492F = fArr2;
            int i15 = c0020f0.f47b;
            int[] iArr = new int[i15];
            for (int i16 = 0; i16 < i15; i16++) {
                iArr[i16] = 0;
            }
            this.f36491E = iArr;
        }
        if (z4) {
            if (this.f36499M != AbstractC11359h2.f36413c && AbstractC22676k.m65745e(this.f36495I, abstractC11395r) && AbstractC22676k.m65745e(this.f36496J, abstractC11395r2)) {
                return;
            }
            this.f36495I = abstractC11395r;
            this.f36496J = abstractC11395r2;
            int iMo30608b = abstractC11395r.mo30608b() + (abstractC11395r.mo30608b() % 2);
            this.f36497K = new float[iMo30608b];
            this.f36498L = new float[iMo30608b];
            int i17 = c0020f0.f47b;
            float[][] fArr3 = new float[i17][];
            for (int i18 = 0; i18 < i17; i18++) {
                int iM28c = c0020f0.m28c(i18);
                C11379m2 c11379m2 = (C11379m2) c0023g0.m121b(iM28c);
                if (iM28c == 0 && c11379m2 == null) {
                    fArr = new float[iMo30608b];
                    for (int i19 = 0; i19 < iMo30608b; i19++) {
                        fArr[i19] = abstractC11395r.mo30607a(i19);
                    }
                } else if (iM28c == this.f36502y && c11379m2 == null) {
                    fArr = new float[iMo30608b];
                    for (int i24 = 0; i24 < iMo30608b; i24++) {
                        fArr[i24] = abstractC11395r2.mo30607a(i24);
                    }
                } else {
                    AbstractC22676k.m65747g(c11379m2);
                    AbstractC11395r abstractC11395r5 = c11379m2.f36481a;
                    float[] fArr4 = new float[iMo30608b];
                    for (int i25 = 0; i25 < iMo30608b; i25++) {
                        fArr4[i25] = abstractC11395r5.mo30607a(i25);
                    }
                    fArr = fArr4;
                }
                fArr3[i18] = fArr;
            }
            this.f36499M = new C0929d(this.f36491E, this.f36492F, fArr3);
        }
    }

    @Override // p077d0.InterfaceC11355g2
    /* JADX INFO: renamed from: h */
    public final AbstractC11395r mo2202h(long j7, AbstractC11395r abstractC11395r, AbstractC11395r abstractC11395r2, AbstractC11395r abstractC11395r3) {
        AbstractC11395r abstractC11395r4;
        AbstractC11395r abstractC11395r5;
        float f13;
        AbstractC11395r abstractC11395r6 = abstractC11395r;
        AbstractC11395r abstractC11395r7 = abstractC11395r2;
        int[] iArr = AbstractC11359h2.f36411a;
        int i13 = 0;
        long j13 = (j7 / 1000000) - ((long) 0);
        int i14 = this.f36502y;
        long j14 = i14;
        if (j13 < 0) {
            j13 = 0;
        }
        if (j13 <= j14) {
            j14 = j13;
        }
        int i15 = (int) j14;
        C0023g0 c0023g0 = this.f36501x;
        C11379m2 c11379m2 = (C11379m2) c0023g0.m121b(i15);
        if (c11379m2 != null) {
            return c11379m2.f36481a;
        }
        if (i15 >= i14) {
            return abstractC11395r7;
        }
        if (i15 <= 0) {
            return abstractC11395r6;
        }
        m30614e(abstractC11395r6, abstractC11395r7, abstractC11395r3);
        AbstractC11395r abstractC11395r8 = this.f36493G;
        AbstractC22676k.m65747g(abstractC11395r8);
        boolean z4 = true;
        if (this.f36499M != AbstractC11359h2.f36413c) {
            float fM30613d = m30613d(m30612b(i15), i15, false);
            float[] fArr = this.f36497K;
            C11401t[][] c11401tArr = (C11401t[][]) this.f36499M.f3422w;
            int length = c11401tArr.length - 1;
            float f14 = c11401tArr[0][0].f36548a;
            float f15 = c11401tArr[length][0].f36549b;
            int length2 = fArr.length;
            if (fM30613d < f14 || fM30613d > f15) {
                if (fM30613d > f15) {
                    f14 = f15;
                } else {
                    length = 0;
                }
                float f16 = fM30613d - f14;
                int i16 = 0;
                int i17 = 0;
                while (i16 < length2 - 1) {
                    C11401t c11401t = c11401tArr[length][i17];
                    boolean z13 = c11401t.f36563p;
                    float f17 = c11401t.f36565r;
                    float f18 = c11401t.f36564q;
                    if (z13) {
                        float f19 = c11401t.f36548a;
                        float f24 = c11401t.f36558k;
                        f13 = f16;
                        float f25 = c11401t.f36550c;
                        fArr[i16] = (f13 * f18) + AbstractC2875y.m8288a(c11401t.f36552e, f25, (f14 - f19) * f24, f25);
                        float f26 = (f14 - f19) * f24;
                        float f27 = c11401t.f36551d;
                        fArr[i16 + 1] = (f13 * f17) + AbstractC2875y.m8288a(c11401t.f36553f, f27, f26, f27);
                    } else {
                        f13 = f16;
                        c11401t.m30635c(f14);
                        fArr[i16] = (c11401t.m30633a() * f13) + (c11401t.f36561n * c11401t.f36555h) + f18;
                        fArr[i16 + 1] = (c11401t.m30634b() * f13) + (c11401t.f36562o * c11401t.f36556i) + f17;
                    }
                    i16 += 2;
                    i17++;
                    f16 = f13;
                    c11401tArr = c11401tArr;
                }
            } else {
                int length3 = c11401tArr.length;
                int i18 = 0;
                boolean z14 = false;
                while (i18 < length3) {
                    int i19 = i13;
                    int i24 = i19;
                    while (i19 < length2 - 1) {
                        C11401t c11401t2 = c11401tArr[i18][i24];
                        if (fM30613d <= c11401t2.f36549b) {
                            if (c11401t2.f36563p) {
                                float f28 = c11401t2.f36548a;
                                float f29 = c11401t2.f36558k;
                                float f34 = c11401t2.f36550c;
                                fArr[i19] = AbstractC2875y.m8288a(c11401t2.f36552e, f34, (fM30613d - f28) * f29, f34);
                                float f35 = c11401t2.f36551d;
                                fArr[i19 + 1] = AbstractC2875y.m8288a(c11401t2.f36553f, f35, (fM30613d - f28) * f29, f35);
                            } else {
                                c11401t2.m30635c(fM30613d);
                                fArr[i19] = (c11401t2.f36561n * c11401t2.f36555h) + c11401t2.f36564q;
                                fArr[i19 + 1] = (c11401t2.f36562o * c11401t2.f36556i) + c11401t2.f36565r;
                            }
                            z14 = z4;
                        } else {
                            z4 = z4;
                        }
                        i19 += 2;
                        i24++;
                        z4 = z4;
                    }
                    boolean z15 = z4;
                    if (z14) {
                        break;
                    }
                    i18++;
                    z4 = z15;
                    i13 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i25 = 0; i25 < length4; i25++) {
                abstractC11395r8.mo30611e(fArr[i25], i25);
            }
        } else {
            int iM30612b = m30612b(i15);
            float fM30613d2 = m30613d(iM30612b, i15, true);
            C0020f0 c0020f0 = this.f36500w;
            C11379m2 c11379m3 = (C11379m2) c0023g0.m121b(c0020f0.m28c(iM30612b));
            if (c11379m3 != null && (abstractC11395r5 = c11379m3.f36481a) != null) {
                abstractC11395r6 = abstractC11395r5;
            }
            C11379m2 c11379m4 = (C11379m2) c0023g0.m121b(c0020f0.m28c(iM30612b + 1));
            if (c11379m4 != null && (abstractC11395r4 = c11379m4.f36481a) != null) {
                abstractC11395r7 = abstractC11395r4;
            }
            int iMo30608b = abstractC11395r8.mo30608b();
            for (int i26 = 0; i26 < iMo30608b; i26++) {
                abstractC11395r8.mo30611e((abstractC11395r7.mo30607a(i26) * fM30613d2) + ((1 - fM30613d2) * abstractC11395r6.mo30607a(i26)), i26);
            }
        }
        return abstractC11395r8;
    }

    @Override // p077d0.InterfaceC11363i2
    /* JADX INFO: renamed from: i */
    public final int mo14111i() {
        return 0;
    }

    @Override // p077d0.InterfaceC11363i2
    /* JADX INFO: renamed from: l */
    public final int mo14112l() {
        return this.f36502y;
    }

    @Override // p077d0.InterfaceC11355g2
    /* JADX INFO: renamed from: m */
    public final AbstractC11395r mo2205m(long j7, AbstractC11395r abstractC11395r, AbstractC11395r abstractC11395r2, AbstractC11395r abstractC11395r3) {
        int[] iArr = AbstractC11359h2.f36411a;
        int i13 = 0;
        long j13 = (j7 / 1000000) - ((long) 0);
        long j14 = this.f36502y;
        if (j13 < 0) {
            j13 = 0;
        }
        long j15 = j13 > j14 ? j14 : j13;
        if (j15 < 0) {
            return abstractC11395r3;
        }
        m30614e(abstractC11395r, abstractC11395r2, abstractC11395r3);
        AbstractC11395r abstractC11395r4 = this.f36494H;
        AbstractC22676k.m65747g(abstractC11395r4);
        if (this.f36499M != AbstractC11359h2.f36413c) {
            int i14 = (int) j15;
            float fM30613d = m30613d(m30612b(i14), i14, false);
            float[] fArr = this.f36498L;
            C11401t[][] c11401tArr = (C11401t[][]) this.f36499M.f3422w;
            float f13 = c11401tArr[0][0].f36548a;
            float f14 = c11401tArr[c11401tArr.length - 1][0].f36549b;
            if (fM30613d < f13) {
                fM30613d = f13;
            }
            if (fM30613d <= f14) {
                f14 = fM30613d;
            }
            int length = fArr.length;
            boolean z4 = false;
            for (C11401t[] c11401tArr2 : c11401tArr) {
                int i15 = 0;
                int i16 = 0;
                while (i15 < length - 1) {
                    C11401t c11401t = c11401tArr2[i16];
                    if (f14 <= c11401t.f36549b) {
                        if (c11401t.f36563p) {
                            fArr[i15] = c11401t.f36564q;
                            fArr[i15 + 1] = c11401t.f36565r;
                        } else {
                            c11401t.m30635c(f14);
                            fArr[i15] = c11401t.m30633a();
                            fArr[i15 + 1] = c11401t.m30634b();
                        }
                        z4 = true;
                    }
                    i15 += 2;
                    i16++;
                }
                if (z4) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i13 < length2) {
                abstractC11395r4.mo30611e(fArr[i13], i13);
                i13++;
            }
        } else {
            AbstractC11395r abstractC11395rMo2202h = mo2202h((j15 - 1) * 1000000, abstractC11395r, abstractC11395r2, abstractC11395r3);
            AbstractC11395r abstractC11395rMo2202h2 = mo2202h(j15 * 1000000, abstractC11395r, abstractC11395r2, abstractC11395r3);
            int iMo30608b = abstractC11395rMo2202h.mo30608b();
            while (i13 < iMo30608b) {
                abstractC11395r4.mo30611e((abstractC11395rMo2202h.mo30607a(i13) - abstractC11395rMo2202h2.mo30607a(i13)) * 1000.0f, i13);
                i13++;
            }
        }
        return abstractC11395r4;
    }
}
