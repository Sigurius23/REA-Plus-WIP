package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C1702l extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6735a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC1717o2 f6736b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f6737c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ViewPropertyAnimator f6738d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1722q f6739e;

    public C1702l(C1722q c1722q, AbstractC1717o2 abstractC1717o2, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f6739e = c1722q;
        this.f6736b = abstractC1717o2;
        this.f6738d = viewPropertyAnimator;
        this.f6737c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f6735a) {
            case 1:
                this.f6737c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6735a) {
            case 0:
                this.f6738d.setListener(null);
                this.f6737c.setAlpha(1.0f);
                C1722q c1722q = this.f6739e;
                AbstractC1717o2 abstractC1717o2 = this.f6736b;
                c1722q.m5297c(abstractC1717o2);
                c1722q.f6821q.remove(abstractC1717o2);
                c1722q.m5312i();
                break;
            default:
                this.f6738d.setListener(null);
                C1722q c1722q2 = this.f6739e;
                AbstractC1717o2 abstractC1717o3 = this.f6736b;
                c1722q2.m5297c(abstractC1717o3);
                c1722q2.f6819o.remove(abstractC1717o3);
                c1722q2.m5312i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f6735a) {
            case 0:
                this.f6739e.getClass();
                break;
            default:
                this.f6739e.getClass();
                break;
        }
    }

    public C1702l(C1722q c1722q, AbstractC1717o2 abstractC1717o2, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f6739e = c1722q;
        this.f6736b = abstractC1717o2;
        this.f6737c = view;
        this.f6738d = viewPropertyAnimator;
    }
}
