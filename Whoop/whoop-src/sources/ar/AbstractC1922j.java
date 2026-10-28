package ar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import kr.C22788g;

/* JADX INFO: renamed from: ar.j */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC1922j extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public boolean f7602a;

    /* JADX INFO: renamed from: b */
    public float f7603b;

    /* JADX INFO: renamed from: c */
    public float f7604c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1925m f7605d;

    public AbstractC1922j(C1925m c1925m) {
        this.f7605d = c1925m;
    }

    /* JADX INFO: renamed from: a */
    public abstract float mo5875a();

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f13 = (int) this.f7604c;
        C22788g c22788g = this.f7605d.f7618b;
        if (c22788g != null) {
            c22788g.m66010l(f13);
        }
        this.f7602a = false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z4 = this.f7602a;
        C1925m c1925m = this.f7605d;
        if (!z4) {
            C22788g c22788g = c1925m.f7618b;
            this.f7603b = c22788g == null ? 0.0f : c22788g.f89748w.f89723n;
            this.f7604c = mo5875a();
            this.f7602a = true;
        }
        float f13 = this.f7603b;
        float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.f7604c - f13)) + f13);
        C22788g c22788g2 = c1925m.f7618b;
        if (c22788g2 != null) {
            c22788g2.m66010l(animatedFraction);
        }
    }
}
