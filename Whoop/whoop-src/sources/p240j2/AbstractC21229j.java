package p240j2;

/* JADX INFO: renamed from: j2.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21229j {

    /* JADX INFO: renamed from: a */
    public static final C21238s f81052a = new C21238s(0.31006f, 0.31616f);

    /* JADX INFO: renamed from: b */
    public static final C21238s f81053b = new C21238s(0.34567f, 0.3585f);

    /* JADX INFO: renamed from: c */
    public static final C21238s f81054c = new C21238s(0.32168f, 0.33767f);

    /* JADX INFO: renamed from: d */
    public static final C21238s f81055d = new C21238s(0.31271f, 0.32902f);

    /* JADX INFO: renamed from: e */
    public static final float[] f81056e = {0.964212f, 1.0f, 0.825188f};

    /* JADX INFO: renamed from: a */
    public static AbstractC21222c m59553a(AbstractC21222c abstractC21222c) {
        if (AbstractC21221b.m59540a(abstractC21222c.f81017b, AbstractC21221b.f81011a)) {
            C21236q c21236q = (C21236q) abstractC21222c;
            C21238s c21238s = c21236q.f81071d;
            C21238s c21238s2 = f81053b;
            if (!m59556d(c21238s, c21238s2)) {
                return new C21236q(c21236q.f81016a, c21236q.f81075h, c21238s2, m59559g(m59555c(C21220a.f81009b.f81010a, c21238s.m59561a(), c21238s2.m59561a()), c21236q.f81076i), c21236q.f81078k, c21236q.f81081n, c21236q.f81072e, c21236q.f81073f, c21236q.f81074g, -1);
            }
        }
        return abstractC21222c;
    }

    /* JADX INFO: renamed from: b */
    public static float m59554b(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[2];
        float f16 = fArr[3];
        float f17 = fArr[4];
        float f18 = fArr[5];
        float f19 = (((((f15 * f18) + ((f14 * f17) + (f13 * f16))) - (f16 * f17)) - (f14 * f15)) - (f13 * f18)) * 0.5f;
        return f19 < 0.0f ? -f19 : f19;
    }

    /* JADX INFO: renamed from: c */
    public static final float[] m59555c(float[] fArr, float[] fArr2, float[] fArr3) {
        m59560h(fArr, fArr2);
        m59560h(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrM59558f = m59558f(fArr);
        float f13 = fArr4[0];
        float f14 = fArr[0] * f13;
        float f15 = fArr4[1];
        float f16 = fArr[1] * f15;
        float f17 = fArr4[2];
        return m59559g(fArrM59558f, new float[]{f14, f16, fArr[2] * f17, fArr[3] * f13, fArr[4] * f15, fArr[5] * f17, f13 * fArr[6], f15 * fArr[7], f17 * fArr[8]});
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m59556d(C21238s c21238s, C21238s c21238s2) {
        if (c21238s == c21238s2) {
            return true;
        }
        return Math.abs(c21238s.f81092a - c21238s2.f81092a) < 0.001f && Math.abs(c21238s.f81093b - c21238s2.f81093b) < 0.001f;
    }

    /* JADX INFO: renamed from: e */
    public static final C21226g m59557e(AbstractC21222c abstractC21222c, AbstractC21222c abstractC21222c2) {
        if (abstractC21222c == abstractC21222c2) {
            return new C21224e(abstractC21222c, abstractC21222c, 1);
        }
        long j7 = abstractC21222c.f81017b;
        long j13 = AbstractC21221b.f81011a;
        return (AbstractC21221b.m59540a(j7, j13) && AbstractC21221b.m59540a(abstractC21222c2.f81017b, j13)) ? new C21225f((C21236q) abstractC21222c, (C21236q) abstractC21222c2) : new C21226g(abstractC21222c, abstractC21222c2, 0);
    }

    /* JADX INFO: renamed from: f */
    public static final float[] m59558f(float[] fArr) {
        float f13 = fArr[0];
        float f14 = fArr[3];
        float f15 = fArr[6];
        float f16 = fArr[1];
        float f17 = fArr[4];
        float f18 = fArr[7];
        float f19 = fArr[2];
        float f24 = fArr[5];
        float f25 = fArr[8];
        float f26 = (f17 * f25) - (f18 * f24);
        float f27 = (f18 * f19) - (f16 * f25);
        float f28 = (f16 * f24) - (f17 * f19);
        float f29 = (f15 * f28) + (f14 * f27) + (f13 * f26);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f26 / f29;
        fArr2[1] = f27 / f29;
        fArr2[2] = f28 / f29;
        fArr2[3] = ((f15 * f24) - (f14 * f25)) / f29;
        fArr2[4] = ((f25 * f13) - (f15 * f19)) / f29;
        fArr2[5] = ((f19 * f14) - (f24 * f13)) / f29;
        fArr2[6] = ((f14 * f18) - (f15 * f17)) / f29;
        fArr2[7] = ((f15 * f16) - (f18 * f13)) / f29;
        fArr2[8] = ((f13 * f17) - (f14 * f16)) / f29;
        return fArr2;
    }

    /* JADX INFO: renamed from: g */
    public static final float[] m59559g(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f13 = fArr[0] * fArr2[0];
        float f14 = fArr[3];
        float f15 = fArr2[1];
        float f16 = fArr[6];
        float f17 = fArr2[2];
        fArr3[0] = (f16 * f17) + (f14 * f15) + f13;
        float f18 = fArr[1];
        float f19 = fArr2[0];
        float f24 = fArr[4];
        float f25 = fArr[7];
        float f26 = f25 * f17;
        fArr3[1] = f26 + (f15 * f24) + (f18 * f19);
        float f27 = fArr[2] * f19;
        float f28 = fArr[5];
        float f29 = (fArr2[1] * f28) + f27;
        float f34 = fArr[8];
        fArr3[2] = (f17 * f34) + f29;
        float f35 = fArr[0];
        float f36 = fArr2[3] * f35;
        float f37 = fArr2[4];
        float f38 = (f14 * f37) + f36;
        float f39 = fArr2[5];
        fArr3[3] = (f16 * f39) + f38;
        float f43 = fArr[1];
        float f44 = fArr2[3];
        float f45 = f24 * f37;
        fArr3[4] = (f25 * f39) + f45 + (f43 * f44);
        float f46 = fArr[2];
        float f47 = f39 * f34;
        fArr3[5] = f47 + (f28 * fArr2[4]) + (f44 * f46);
        float f48 = f35 * fArr2[6];
        float f49 = fArr[3];
        float f54 = fArr2[7];
        float f55 = (f49 * f54) + f48;
        float f56 = fArr2[8];
        fArr3[6] = (f16 * f56) + f55;
        float f57 = fArr2[6];
        float f58 = f25 * f56;
        fArr3[7] = f58 + (fArr[4] * f54) + (f43 * f57);
        float f59 = f34 * f56;
        fArr3[8] = f59 + (fArr[5] * fArr2[7]) + (f46 * f57);
        return fArr3;
    }

    /* JADX INFO: renamed from: h */
    public static final float[] m59560h(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f13 = fArr2[0];
        float f14 = fArr2[1];
        float f15 = fArr2[2];
        fArr2[0] = (fArr[6] * f15) + (fArr[3] * f14) + (fArr[0] * f13);
        fArr2[1] = (fArr[7] * f15) + (fArr[4] * f14) + (fArr[1] * f13);
        fArr2[2] = (fArr[8] * f15) + (fArr[5] * f14) + (fArr[2] * f13);
        return fArr2;
    }
}
