package b30;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import p003a1.C0111j;
import p016an.C1053d;

/* JADX INFO: renamed from: b30.s3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2620s3 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1053d f10202a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f10203b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0111j f10204c;

    public C2620s3(C1053d c1053d, View view, C0111j c0111j) {
        this.f10202a = c1053d;
        this.f10203b = view;
        this.f10204c = c0111j;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f10202a.getClass();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f10203b, "rotation", 0.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(1500L);
        objectAnimatorOfFloat.addListener(new C2606q3(this.f10204c, 0));
        objectAnimatorOfFloat.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
