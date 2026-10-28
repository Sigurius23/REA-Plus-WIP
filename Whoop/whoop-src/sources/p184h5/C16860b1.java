package p184h5;

import android.view.View;
import android.view.WindowInsetsAnimation;
import androidx.datastore.preferences.protobuf.AbstractC1230l;
import p543v4.C35643b;

/* JADX INFO: renamed from: h5.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C16860b1 extends AbstractC16863c1 {

    /* JADX INFO: renamed from: e */
    public final WindowInsetsAnimation f64784e;

    public C16860b1(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f64784e = windowInsetsAnimation;
    }

    /* JADX INFO: renamed from: e */
    public static C35643b m47485e(WindowInsetsAnimation.Bounds bounds) {
        return C35643b.m112841c(bounds.getUpperBound());
    }

    /* JADX INFO: renamed from: f */
    public static C35643b m47486f(WindowInsetsAnimation.Bounds bounds) {
        return C35643b.m112841c(bounds.getLowerBound());
    }

    /* JADX INFO: renamed from: g */
    public static void m47487g(View view, AbstractC1230l abstractC1230l) {
        view.setWindowInsetsAnimationCallback(abstractC1230l != null ? new C16857a1(abstractC1230l) : null);
    }

    @Override // p184h5.AbstractC16863c1
    /* JADX INFO: renamed from: a */
    public final long mo47488a() {
        return this.f64784e.getDurationMillis();
    }

    @Override // p184h5.AbstractC16863c1
    /* JADX INFO: renamed from: b */
    public final float mo47489b() {
        return this.f64784e.getInterpolatedFraction();
    }

    @Override // p184h5.AbstractC16863c1
    /* JADX INFO: renamed from: c */
    public final int mo47490c() {
        return this.f64784e.getTypeMask();
    }

    @Override // p184h5.AbstractC16863c1
    /* JADX INFO: renamed from: d */
    public final void mo47491d(float f13) {
        this.f64784e.setFraction(f13);
    }
}
