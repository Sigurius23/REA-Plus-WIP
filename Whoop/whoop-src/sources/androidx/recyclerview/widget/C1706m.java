package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C1706m extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC1717o2 f6741a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f6742b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f6743c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6744d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f6745e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1722q f6746f;

    public C1706m(C1722q c1722q, AbstractC1717o2 abstractC1717o2, int i13, View view, int i14, ViewPropertyAnimator viewPropertyAnimator) {
        this.f6746f = c1722q;
        this.f6741a = abstractC1717o2;
        this.f6742b = i13;
        this.f6743c = view;
        this.f6744d = i14;
        this.f6745e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i13 = this.f6742b;
        View view = this.f6743c;
        if (i13 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f6744d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f6745e.setListener(null);
        C1722q c1722q = this.f6746f;
        AbstractC1717o2 abstractC1717o2 = this.f6741a;
        c1722q.m5297c(abstractC1717o2);
        c1722q.f6820p.remove(abstractC1717o2);
        c1722q.m5312i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f6746f.getClass();
    }
}
