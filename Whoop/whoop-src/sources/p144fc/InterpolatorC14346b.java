package p144fc;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: fc.b */
/* JADX INFO: loaded from: classes5.dex */
public final class InterpolatorC14346b implements Interpolator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52398a;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f13) {
        switch (this.f52398a) {
        }
        float f14 = f13 - 1.0f;
        return (f14 * f14 * f14 * f14 * f14) + 1.0f;
    }
}
