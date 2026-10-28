package p032bc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.whoop.android.R;

/* JADX INFO: renamed from: bc.o0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2966o0 extends AnimatorListenerAdapter implements InterfaceC2972u {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f11880a;

    /* JADX INFO: renamed from: b */
    public final View f11881b;

    /* JADX INFO: renamed from: c */
    public final View f11882c;

    /* JADX INFO: renamed from: d */
    public boolean f11883d = true;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2951h f11884e;

    public C2966o0(C2951h c2951h, ViewGroup viewGroup, View view, View view2) {
        this.f11884e = c2951h;
        this.f11880a = viewGroup;
        this.f11881b = view;
        this.f11882c = view2;
    }

    @Override // p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: a */
    public final void mo8600a() {
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
        if (this.f11883d) {
            m8638g();
        }
    }

    @Override // p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: e */
    public final void mo8601e() {
    }

    /* JADX INFO: renamed from: g */
    public final void m8638g() {
        this.f11882c.setTag(R.id.save_overlay_view, null);
        this.f11880a.getOverlay().remove(this.f11881b);
        this.f11883d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m8638g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f11880a.getOverlay().remove(this.f11881b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f11881b;
        if (view.getParent() == null) {
            this.f11880a.getOverlay().add(view);
        } else {
            this.f11884e.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z4) {
        if (z4) {
            View view = this.f11882c;
            View view2 = this.f11881b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f11880a.getOverlay().add(view2);
            this.f11883d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z4) {
        if (z4) {
            return;
        }
        m8638g();
    }
}
