package p040c0;

import e93.AbstractC12889b;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: c0.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3725b {

    /* JADX INFO: renamed from: a */
    public static final float[] f15209a;

    static {
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f24;
        float f25;
        float[] fArr = new float[101];
        f15209a = fArr;
        float[] fArr2 = new float[101];
        float f26 = 0.0f;
        int i13 = 0;
        float f27 = 0.0f;
        while (true) {
            float f28 = 1.0f;
            if (i13 >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f29 = i13 / 100;
            float f34 = 1.0f;
            while (true) {
                f13 = ((f34 - f26) / 2.0f) + f26;
                f14 = f28 - f13;
                f15 = f13 * 3.0f * f14;
                f16 = f13 * f13 * f13;
                float f35 = (((f13 * 0.35000002f) + (f14 * 0.175f)) * f15) + f16;
                f17 = f28;
                if (Math.abs(f35 - f29) < 1.0E-5d) {
                    break;
                }
                if (f35 > f29) {
                    f34 = f13;
                } else {
                    f26 = f13;
                }
                f28 = f17;
            }
            float f36 = 0.5f;
            fArr[i13] = (((f14 * 0.5f) + f13) * f15) + f16;
            float f37 = f17;
            while (true) {
                f18 = ((f37 - f27) / 2.0f) + f27;
                f19 = f17 - f18;
                f24 = f18 * 3.0f * f19;
                f25 = f18 * f18 * f18;
                float f38 = (((f19 * f36) + f18) * f24) + f25;
                float f39 = f37;
                if (Math.abs(f38 - f29) >= 1.0E-5d) {
                    if (f38 > f29) {
                        f37 = f18;
                    } else {
                        f27 = f18;
                        f37 = f39;
                    }
                    f36 = 0.5f;
                }
            }
            fArr2[i13] = (((f18 * 0.35000002f) + (f19 * 0.175f)) * f24) + f25;
            i13++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static double m11559a(float f13, float f14) {
        return Math.log(((double) (Math.abs(f13) * 0.35f)) / ((double) f14));
    }

    /* JADX INFO: renamed from: b */
    public static C3722a m11560b(float f13) {
        float f14 = 0.0f;
        float f15 = 1.0f;
        float fM36283m = AbstractC12889b.m36283m(f13, 0.0f, 1.0f);
        float f16 = 100;
        int i13 = (int) (f16 * fM36283m);
        if (i13 < 100) {
            float f17 = i13 / f16;
            int i14 = i13 + 1;
            float f18 = i14 / f16;
            float[] fArr = f15209a;
            float f19 = fArr[i13];
            float f24 = (fArr[i14] - f19) / (f18 - f17);
            float fM8288a = AbstractC2875y.m8288a(fM36283m, f17, f24, f19);
            f14 = f24;
            f15 = fM8288a;
        }
        return new C3722a(f15, f14);
    }
}
