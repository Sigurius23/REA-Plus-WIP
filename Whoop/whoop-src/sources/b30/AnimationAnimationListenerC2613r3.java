package b30;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.Animation;
import p003a1.C0111j;
import p016an.C1053d;

/* JADX INFO: renamed from: b30.r3 */
/* JADX INFO: loaded from: classes6.dex */
public final class AnimationAnimationListenerC2613r3 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f10178a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1053d f10179b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f10180c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0111j f10181d;

    public AnimationAnimationListenerC2613r3(View view, C1053d c1053d, int i13, C0111j c0111j) {
        this.f10178a = view;
        this.f10179b = c1053d;
        this.f10180c = i13;
        this.f10181d = c0111j;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        View view = this.f10178a;
        view.setVisibility(0);
        C1053d c1053d = this.f10179b;
        c1053d.getClass();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", 0.0f, -((((view.getRight() - view.getLeft()) / 2.0f) + view.getLeft()) - (this.f10180c / 2.0f)));
        objectAnimatorOfFloat.setDuration(c1053d.f4098x);
        objectAnimatorOfFloat.addListener(new C2620s3(c1053d, view, this.f10181d));
        objectAnimatorOfFloat.start();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.f10178a.setVisibility(0);
    }
}
