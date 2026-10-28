package p468rr;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: renamed from: rr.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C31760b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f131523a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f131524b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f131525c;

    public C31760b(boolean z4, View view, View view2) {
        this.f131523a = z4;
        this.f131524b = view;
        this.f131525c = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f131523a) {
            return;
        }
        this.f131524b.setVisibility(4);
        View view = this.f131525c;
        view.setAlpha(1.0f);
        view.setVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.f131523a) {
            this.f131524b.setVisibility(0);
            View view = this.f131525c;
            view.setAlpha(0.0f);
            view.setVisibility(4);
        }
    }
}
