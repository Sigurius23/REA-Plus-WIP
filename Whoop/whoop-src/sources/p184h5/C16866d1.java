package p184h5;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: h5.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C16866d1 {

    /* JADX INFO: renamed from: a */
    public AbstractC16863c1 f64800a;

    public C16866d1(int i13, Interpolator interpolator, long j7) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f64800a = new C16860b1(AbstractC16928z0.m47623b(i13, interpolator, j7));
        } else {
            this.f64800a = new C16926y0(i13, interpolator, j7);
        }
    }
}
