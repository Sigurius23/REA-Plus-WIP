package p184h5;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: h5.c1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16863c1 {

    /* JADX INFO: renamed from: a */
    public final int f64785a;

    /* JADX INFO: renamed from: b */
    public float f64786b;

    /* JADX INFO: renamed from: c */
    public final Interpolator f64787c;

    /* JADX INFO: renamed from: d */
    public final long f64788d;

    public AbstractC16863c1(int i13, Interpolator interpolator, long j7) {
        this.f64785a = i13;
        this.f64787c = interpolator;
        this.f64788d = j7;
    }

    /* JADX INFO: renamed from: a */
    public long mo47488a() {
        return this.f64788d;
    }

    /* JADX INFO: renamed from: b */
    public float mo47489b() {
        Interpolator interpolator = this.f64787c;
        return interpolator != null ? interpolator.getInterpolation(this.f64786b) : this.f64786b;
    }

    /* JADX INFO: renamed from: c */
    public int mo47490c() {
        return this.f64785a;
    }

    /* JADX INFO: renamed from: d */
    public void mo47491d(float f13) {
        this.f64786b = f13;
    }
}
