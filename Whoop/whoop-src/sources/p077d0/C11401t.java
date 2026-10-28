package p077d0;

import java.util.Arrays;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: d0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C11401t {

    /* JADX INFO: renamed from: a */
    public final float f36548a;

    /* JADX INFO: renamed from: b */
    public final float f36549b;

    /* JADX INFO: renamed from: c */
    public final float f36550c;

    /* JADX INFO: renamed from: d */
    public final float f36551d;

    /* JADX INFO: renamed from: e */
    public final float f36552e;

    /* JADX INFO: renamed from: f */
    public final float f36553f;

    /* JADX INFO: renamed from: g */
    public final float f36554g;

    /* JADX INFO: renamed from: h */
    public float f36555h;

    /* JADX INFO: renamed from: i */
    public float f36556i;

    /* JADX INFO: renamed from: j */
    public final float[] f36557j;

    /* JADX INFO: renamed from: k */
    public final float f36558k;

    /* JADX INFO: renamed from: l */
    public final float f36559l;

    /* JADX INFO: renamed from: m */
    public final float f36560m;

    /* JADX INFO: renamed from: n */
    public final float f36561n;

    /* JADX INFO: renamed from: o */
    public final float f36562o;

    /* JADX INFO: renamed from: p */
    public final boolean f36563p;

    /* JADX INFO: renamed from: q */
    public final float f36564q;

    /* JADX INFO: renamed from: r */
    public final float f36565r;

    public C11401t(int i13, float f13, float f14, float f15, float f16, float f17, float f18) {
        boolean z4;
        int i14;
        float f19;
        float[] fArr;
        this.f36548a = f13;
        this.f36549b = f14;
        this.f36550c = f15;
        this.f36551d = f16;
        this.f36552e = f17;
        this.f36553f = f18;
        float f24 = f17 - f15;
        float f25 = f18 - f16;
        float f26 = 0.0f;
        int i15 = 1;
        boolean z13 = i13 == 1 || (i13 == 4 ? f25 > 0.0f : !(i13 != 5 || f25 >= 0.0f));
        float f27 = z13 ? -1.0f : 1.0f;
        this.f36560m = f27;
        float f28 = 1 / (f14 - f13);
        this.f36558k = f28;
        float[] fArr2 = new float[101];
        this.f36557j = fArr2;
        boolean z14 = i13 == 3;
        if (z14 || Math.abs(f24) < 0.001f || Math.abs(f25) < 0.001f) {
            float fHypot = (float) Math.hypot(f25, f24);
            this.f36554g = fHypot;
            this.f36559l = fHypot * f28;
            this.f36564q = f24 * f28;
            this.f36565r = f25 * f28;
            this.f36561n = Float.NaN;
            this.f36562o = Float.NaN;
            z4 = true;
        } else {
            this.f36561n = f24 * f27;
            this.f36562o = f25 * (-f27);
            this.f36564q = z13 ? f17 : f15;
            this.f36565r = z13 ? f16 : f18;
            float f29 = f17 - f15;
            float f34 = f16 - f18;
            float f35 = 90;
            float f36 = f34;
            float fHypot2 = 0.0f;
            float f37 = 0.0f;
            int i16 = 1;
            while (true) {
                i14 = i15;
                float f38 = f36;
                double radians = (float) Math.toRadians((((double) i16) * 90.0d) / ((double) 90));
                float fSin = ((float) Math.sin(radians)) * f29;
                float fCos = ((float) Math.cos(radians)) * f34;
                f19 = f26;
                fHypot2 += (float) Math.hypot(fSin - f37, fCos - f38);
                fArr = AbstractC11404u.f36568a;
                fArr[i16] = fHypot2;
                if (i16 == 90) {
                    break;
                }
                i16++;
                f37 = fSin;
                f26 = f19;
                f36 = fCos;
                i15 = i14;
            }
            this.f36554g = fHypot2;
            int i17 = i14;
            while (true) {
                fArr[i17] = fArr[i17] / fHypot2;
                if (i17 == 90) {
                    break;
                } else {
                    i17++;
                }
            }
            int length = fArr2.length;
            for (int i18 = 0; i18 < length; i18++) {
                float f39 = i18 / 100.0f;
                int iBinarySearch = Arrays.binarySearch(fArr, 0, 91, f39);
                if (iBinarySearch >= 0) {
                    fArr2[i18] = iBinarySearch / f35;
                } else if (iBinarySearch == -1) {
                    fArr2[i18] = f19;
                } else {
                    int i19 = -iBinarySearch;
                    int i24 = i19 - 2;
                    float f43 = i24;
                    float f44 = fArr[i24];
                    fArr2[i18] = (((f39 - f44) / (fArr[i19 - 1] - f44)) + f43) / f35;
                }
            }
            this.f36559l = this.f36554g * this.f36558k;
            z4 = z14;
        }
        this.f36563p = z4;
    }

    /* JADX INFO: renamed from: a */
    public final float m30633a() {
        float f13 = this.f36561n * this.f36556i;
        return f13 * this.f36560m * (this.f36559l / ((float) Math.hypot(f13, (-this.f36562o) * this.f36555h)));
    }

    /* JADX INFO: renamed from: b */
    public final float m30634b() {
        float f13 = this.f36561n * this.f36556i;
        float f14 = (-this.f36562o) * this.f36555h;
        return f14 * this.f36560m * (this.f36559l / ((float) Math.hypot(f13, f14)));
    }

    /* JADX INFO: renamed from: c */
    public final void m30635c(float f13) {
        float f14 = (this.f36560m == -1.0f ? this.f36549b - f13 : f13 - this.f36548a) * this.f36558k;
        float fM8288a = 0.0f;
        if (f14 > 0.0f) {
            fM8288a = 1.0f;
            if (f14 < 1.0f) {
                float f15 = f14 * 100;
                int i13 = (int) f15;
                float[] fArr = this.f36557j;
                float f16 = fArr[i13];
                fM8288a = AbstractC2875y.m8288a(fArr[i13 + 1], f16, f15 - i13, f16);
            }
        }
        double d3 = fM8288a * 1.5707964f;
        this.f36555h = (float) Math.sin(d3);
        this.f36556i = (float) Math.cos(d3);
    }
}
