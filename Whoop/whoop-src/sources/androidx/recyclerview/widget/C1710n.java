package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C1710n extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6747a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1714o f6748b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f6749c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ View f6750d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1722q f6751e;

    public /* synthetic */ C1710n(C1722q c1722q, C1714o c1714o, ViewPropertyAnimator viewPropertyAnimator, View view, int i13) {
        this.f6747a = i13;
        this.f6751e = c1722q;
        this.f6748b = c1714o;
        this.f6749c = viewPropertyAnimator;
        this.f6750d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6747a) {
            case 0:
                this.f6749c.setListener(null);
                View view = this.f6750d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C1714o c1714o = this.f6748b;
                AbstractC1717o2 abstractC1717o2 = c1714o.f6761a;
                C1722q c1722q = this.f6751e;
                c1722q.m5297c(abstractC1717o2);
                c1722q.f6822r.remove(c1714o.f6761a);
                c1722q.m5312i();
                break;
            default:
                this.f6749c.setListener(null);
                View view2 = this.f6750d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C1714o c1714o2 = this.f6748b;
                AbstractC1717o2 abstractC1717o3 = c1714o2.f6762b;
                C1722q c1722q2 = this.f6751e;
                c1722q2.m5297c(abstractC1717o3);
                c1722q2.f6822r.remove(c1714o2.f6762b);
                c1722q2.m5312i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f6747a) {
            case 0:
                AbstractC1717o2 abstractC1717o2 = this.f6748b.f6761a;
                this.f6751e.getClass();
                break;
            default:
                AbstractC1717o2 abstractC1717o3 = this.f6748b.f6762b;
                this.f6751e.getClass();
                break;
        }
    }
}
