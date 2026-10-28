package p186h8;

import android.view.animation.Interpolator;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: h8.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractInterpolatorC17000b implements Interpolator {

    /* JADX INFO: renamed from: a */
    public final float[] f65310a;

    /* JADX INFO: renamed from: b */
    public final float f65311b;

    public AbstractInterpolatorC17000b(float[] fArr) {
        this.f65310a = fArr;
        this.f65311b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f13) {
        if (f13 >= 1.0f) {
            return 1.0f;
        }
        if (f13 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f65310a;
        int iMin = Math.min((int) ((fArr.length - 1) * f13), fArr.length - 2);
        float f14 = this.f65311b;
        float f15 = (f13 - (iMin * f14)) / f14;
        float f16 = fArr[iMin];
        return AbstractC2875y.m8288a(fArr[iMin + 1], f16, f15, f16);
    }
}
