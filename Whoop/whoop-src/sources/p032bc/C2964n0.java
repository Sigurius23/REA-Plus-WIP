package p032bc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p035bp.AbstractC3511b;

/* JADX INFO: renamed from: bc.n0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2964n0 extends AnimatorListenerAdapter implements InterfaceC2972u {

    /* JADX INFO: renamed from: a */
    public final View f11874a;

    /* JADX INFO: renamed from: b */
    public final int f11875b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f11876c;

    /* JADX INFO: renamed from: e */
    public boolean f11878e;

    /* JADX INFO: renamed from: f */
    public boolean f11879f = false;

    /* JADX INFO: renamed from: d */
    public final boolean f11877d = true;

    public C2964n0(View view, int i13) {
        this.f11874a = view;
        this.f11875b = i13;
        this.f11876c = (ViewGroup) view.getParent();
        m8636g(true);
    }

    @Override // p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: a */
    public final void mo8600a() {
        m8636g(false);
        if (this.f11879f) {
            return;
        }
        AbstractC2950g0.m8610b(this.f11874a, this.f11875b);
    }

    @Override // p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: b */
    public final void mo8571b(AbstractC2974w abstractC2974w) {
    }

    @Override // p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: c */
    public final void mo8572c(AbstractC2974w abstractC2974w) {
        abstractC2974w.mo8576C(this);
    }

    @Override // p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: d */
    public final void mo8573d(AbstractC2974w abstractC2974w) {
    }

    @Override // p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: e */
    public final void mo8601e() {
        m8636g(true);
        if (this.f11879f) {
            return;
        }
        AbstractC2950g0.m8610b(this.f11874a, 0);
    }

    /* JADX INFO: renamed from: g */
    public final void m8636g(boolean z4) {
        ViewGroup viewGroup;
        if (!this.f11877d || this.f11878e == z4 || (viewGroup = this.f11876c) == null) {
            return;
        }
        this.f11878e = z4;
        AbstractC3511b.m10370J(viewGroup, z4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f11879f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f11879f) {
            AbstractC2950g0.m8610b(this.f11874a, this.f11875b);
            ViewGroup viewGroup = this.f11876c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m8636g(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z4) {
        if (z4) {
            AbstractC2950g0.m8610b(this.f11874a, 0);
            ViewGroup viewGroup = this.f11876c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z4) {
        if (z4) {
            return;
        }
        if (!this.f11879f) {
            AbstractC2950g0.m8610b(this.f11874a, this.f11875b);
            ViewGroup viewGroup = this.f11876c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m8636g(false);
    }
}
