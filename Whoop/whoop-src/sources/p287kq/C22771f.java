package p287kq;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import ih0.AbstractC18489d0;

/* JADX INFO: renamed from: kq.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C22771f {

    /* JADX INFO: renamed from: a */
    public long f89681a;

    /* JADX INFO: renamed from: c */
    public TimeInterpolator f89683c = null;

    /* JADX INFO: renamed from: d */
    public int f89684d = 0;

    /* JADX INFO: renamed from: e */
    public int f89685e = 1;

    /* JADX INFO: renamed from: b */
    public long f89682b = 150;

    public C22771f(long j7) {
        this.f89681a = j7;
    }

    /* JADX INFO: renamed from: a */
    public final void m65976a(ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay(this.f89681a);
        objectAnimator.setDuration(this.f89682b);
        objectAnimator.setInterpolator(m65977b());
        objectAnimator.setRepeatCount(this.f89684d);
        objectAnimator.setRepeatMode(this.f89685e);
    }

    /* JADX INFO: renamed from: b */
    public final TimeInterpolator m65977b() {
        TimeInterpolator timeInterpolator = this.f89683c;
        return timeInterpolator != null ? timeInterpolator : AbstractC22766a.f89673b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22771f)) {
            return false;
        }
        C22771f c22771f = (C22771f) obj;
        if (this.f89681a == c22771f.f89681a && this.f89682b == c22771f.f89682b && this.f89684d == c22771f.f89684d && this.f89685e == c22771f.f89685e) {
            return m65977b().getClass().equals(c22771f.m65977b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f89681a;
        long j13 = this.f89682b;
        return ((((m65977b().getClass().hashCode() + (((((int) (j7 ^ (j7 >>> 32))) * 31) + ((int) ((j13 >>> 32) ^ j13))) * 31)) * 31) + this.f89684d) * 31) + this.f89685e;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("\n");
        sb4.append(C22771f.class.getName());
        sb4.append('{');
        sb4.append(Integer.toHexString(System.identityHashCode(this)));
        sb4.append(" delay: ");
        sb4.append(this.f89681a);
        sb4.append(" duration: ");
        sb4.append(this.f89682b);
        sb4.append(" interpolator: ");
        sb4.append(m65977b().getClass());
        sb4.append(" repeatCount: ");
        sb4.append(this.f89684d);
        sb4.append(" repeatMode: ");
        return AbstractC18489d0.m53371l(sb4, this.f89685e, "}\n");
    }
}
