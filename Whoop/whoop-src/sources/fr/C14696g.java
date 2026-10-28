package fr;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: fr.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C14696g extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54324a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C14697h f54325b;

    public /* synthetic */ C14696g(C14697h c14697h, int i13) {
        this.f54324a = i13;
        this.f54325b = c14697h;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f54324a) {
            case 1:
                super.onAnimationEnd(animator);
                C14697h c14697h = this.f54325b;
                c14697h.mo7253f();
                C14692c c14692c = c14697h.f54338k;
                if (c14692c != null) {
                    c14692c.m42126a((C14705p) c14697h.f9291b);
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f54324a) {
            case 0:
                super.onAnimationRepeat(animator);
                C14697h c14697h = this.f54325b;
                c14697h.f54335h = (c14697h.f54335h + 4) % c14697h.f54334g.f54314c.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
