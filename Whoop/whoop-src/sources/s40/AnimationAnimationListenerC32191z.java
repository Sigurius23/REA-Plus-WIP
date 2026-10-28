package s40;

import android.view.View;
import android.view.animation.Animation;

/* JADX INFO: renamed from: s40.z */
/* JADX INFO: loaded from: classes6.dex */
public final class AnimationAnimationListenerC32191z implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f133313a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f133314b;

    public /* synthetic */ AnimationAnimationListenerC32191z(View view, int i13) {
        this.f133313a = i13;
        this.f133314b = view;
    }

    /* JADX INFO: renamed from: a */
    private final void m100110a(Animation animation) {
    }

    /* JADX INFO: renamed from: b */
    private final void m100111b(Animation animation) {
    }

    /* JADX INFO: renamed from: c */
    private final void m100112c(Animation animation) {
    }

    /* JADX INFO: renamed from: d */
    private final void m100113d(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.f133313a) {
            case 0:
                break;
            case 1:
                ((C32133a0) this.f133314b).setVisibility(4);
                break;
            default:
                this.f133314b.setVisibility(4);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i13 = this.f133313a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.f133313a) {
            case 0:
                ((C32133a0) this.f133314b).setVisibility(0);
                break;
            case 1:
                ((C32133a0) this.f133314b).setVisibility(0);
                break;
            default:
                this.f133314b.setVisibility(0);
                break;
        }
    }
}
