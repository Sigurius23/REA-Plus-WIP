package androidx.recyclerview.widget;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.l0 */
/* JADX INFO: loaded from: classes5.dex */
public final class InterpolatorC1703l0 implements Interpolator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6740a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f13) {
        switch (this.f6740a) {
            case 0:
                return f13 * f13 * f13 * f13 * f13;
            case 1:
            default:
                float f14 = f13 - 1.0f;
                return (f14 * f14 * f14 * f14 * f14) + 1.0f;
        }
    }
}
