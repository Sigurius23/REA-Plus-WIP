package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import ar.AbstractC1923k;

/* JADX INFO: renamed from: androidx.recyclerview.widget.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1661b0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6578a;

    /* JADX INFO: renamed from: b */
    public boolean f6579b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f6580c;

    public C1661b0(View view, boolean z4) {
        this.f6578a = 2;
        this.f6579b = z4;
        this.f6580c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f6578a) {
            case 0:
                this.f6579b = true;
                break;
            case 1:
                this.f6579b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6578a) {
            case 0:
                C1671d0 c1671d0 = (C1671d0) this.f6580c;
                if (this.f6579b) {
                    this.f6579b = false;
                } else if (((Float) c1671d0.f6633z.getAnimatedValue()).floatValue() != 0.0f) {
                    c1671d0.f6606A = 2;
                    c1671d0.f6626s.invalidate();
                } else {
                    c1671d0.f6606A = 0;
                    c1671d0.m5226h(0);
                }
                break;
            case 1:
                AbstractC1923k abstractC1923k = (AbstractC1923k) this.f6580c;
                abstractC1923k.f7634r = 0;
                abstractC1923k.f7628l = null;
                if (!this.f6579b) {
                    abstractC1923k.f7635s.m29875a(4, false);
                }
                break;
            default:
                if (!this.f6579b) {
                    ((View) this.f6580c).setVisibility(4);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f6578a) {
            case 1:
                AbstractC1923k abstractC1923k = (AbstractC1923k) this.f6580c;
                abstractC1923k.f7635s.m29875a(0, false);
                abstractC1923k.f7634r = 1;
                abstractC1923k.f7628l = animator;
                this.f6579b = false;
                break;
            case 2:
                if (this.f6579b) {
                    ((View) this.f6580c).setVisibility(0);
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C1661b0(AbstractC1923k abstractC1923k) {
        this.f6578a = 1;
        this.f6580c = abstractC1923k;
    }

    public C1661b0(C1671d0 c1671d0) {
        this.f6578a = 0;
        this.f6580c = c1671d0;
        this.f6579b = false;
    }
}
