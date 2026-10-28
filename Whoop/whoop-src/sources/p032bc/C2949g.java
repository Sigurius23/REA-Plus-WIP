package p032bc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.whoop.android.R;

/* JADX INFO: renamed from: bc.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C2949g extends AnimatorListenerAdapter implements InterfaceC2972u {

    /* JADX INFO: renamed from: a */
    public final View f11852a;

    /* JADX INFO: renamed from: b */
    public boolean f11853b = false;

    public C2949g(View view) {
        this.f11852a = view;
    }

    @Override // p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: a */
    public final void mo8600a() {
        View view = this.f11852a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? AbstractC2950g0.f11854a.mo8633S(view) : 0.0f));
    }

    @Override // p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: b */
    public final void mo8571b(AbstractC2974w abstractC2974w) {
    }

    @Override // p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: c */
    public final void mo8572c(AbstractC2974w abstractC2974w) {
    }

    @Override // p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: d */
    public final void mo8573d(AbstractC2974w abstractC2974w) {
    }

    @Override // p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: e */
    public final void mo8601e() {
        this.f11852a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // p032bc.InterfaceC2972u
    /* JADX INFO: renamed from: f */
    public final void mo8608f(AbstractC2974w abstractC2974w) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC2950g0.f11854a.mo8634e0(this.f11852a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f11852a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f11853b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z4) {
        boolean z13 = this.f11853b;
        View view = this.f11852a;
        if (z13) {
            view.setLayerType(0, null);
        }
        if (z4) {
            return;
        }
        C2960l0 c2960l0 = AbstractC2950g0.f11854a;
        c2960l0.mo8634e0(view, 1.0f);
        c2960l0.getClass();
    }
}
