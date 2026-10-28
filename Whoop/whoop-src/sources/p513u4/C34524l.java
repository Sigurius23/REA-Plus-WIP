package p513u4;

/* JADX INFO: renamed from: u4.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C34524l {

    /* JADX INFO: renamed from: k */
    public static final C34524l f145120k;

    /* JADX INFO: renamed from: a */
    public final float f145121a;

    /* JADX INFO: renamed from: b */
    public final float f145122b;

    /* JADX INFO: renamed from: c */
    public final float f145123c;

    /* JADX INFO: renamed from: d */
    public final float f145124d;

    /* JADX INFO: renamed from: e */
    public final float f145125e;

    /* JADX INFO: renamed from: f */
    public final float f145126f;

    /* JADX INFO: renamed from: g */
    public final float[] f145127g;

    /* JADX INFO: renamed from: h */
    public final float f145128h;

    /* JADX INFO: renamed from: i */
    public final float f145129i;

    /* JADX INFO: renamed from: j */
    public final float f145130j;

    static {
        float[] fArr = AbstractC34514b.f145094c;
        float fM109078p = (float) ((((double) AbstractC34514b.m109078p()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = AbstractC34514b.f145092a;
        float f13 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f14 = fArr3[0] * f13;
        float f15 = fArr[1];
        float f16 = (fArr3[1] * f15) + f14;
        float f17 = fArr[2];
        float f18 = (fArr3[2] * f17) + f16;
        float[] fArr4 = fArr2[1];
        float f19 = (fArr4[2] * f17) + (fArr4[1] * f15) + (fArr4[0] * f13);
        float[] fArr5 = fArr2[2];
        float f24 = (f17 * fArr5[2]) + (f15 * fArr5[1]) + (f13 * fArr5[0]);
        float f25 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fM109078p) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d3 = fExp;
        if (d3 > 1.0d) {
            fExp = 1.0f;
        } else if (d3 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f18) * fExp) + 1.0f) - fExp, (((100.0f / f19) * fExp) + 1.0f) - fExp, (((100.0f / f24) * fExp) + 1.0f) - fExp};
        float f26 = 1.0f / ((5.0f * fM109078p) + 1.0f);
        float f27 = f26 * f26 * f26 * f26;
        float f28 = 1.0f - f27;
        float fCbrt = (0.1f * f28 * f28 * ((float) Math.cbrt(((double) fM109078p) * 5.0d))) + (f27 * fM109078p);
        float fM109078p2 = AbstractC34514b.m109078p() / fArr[1];
        double d14 = fM109078p2;
        float fSqrt = ((float) Math.sqrt(d14)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d14, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f18)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f19)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f24)) / 100.0d, 0.42d)};
        float f29 = fArr7[0];
        float f34 = (f29 * 400.0f) / (f29 + 27.13f);
        float f35 = fArr7[1];
        float f36 = (f35 * 400.0f) / (f35 + 27.13f);
        float f37 = fArr7[2];
        float[] fArr8 = {f34, f36, (400.0f * f37) / (f37 + 27.13f)};
        f145120k = new C34524l(fM109078p2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow, fPow, fPow, f25, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public C34524l(float f13, float f14, float f15, float f16, float f17, float f18, float[] fArr, float f19, float f24, float f25) {
        this.f145126f = f13;
        this.f145121a = f14;
        this.f145122b = f15;
        this.f145123c = f16;
        this.f145124d = f17;
        this.f145125e = f18;
        this.f145127g = fArr;
        this.f145128h = f19;
        this.f145129i = f24;
        this.f145130j = f25;
    }
}
