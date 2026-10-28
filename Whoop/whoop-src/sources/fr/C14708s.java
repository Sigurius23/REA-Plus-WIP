package fr;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: fr.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C14708s extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54381a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C14709t f54382b;

    public /* synthetic */ C14708s(C14709t c14709t, int i13) {
        this.f54381a = i13;
        this.f54382b = c14709t;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f54381a) {
            case 1:
                super.onAnimationEnd(animator);
                C14709t c14709t = this.f54382b;
                c14709t.mo7253f();
                C14692c c14692c = c14709t.f54393k;
                if (c14692c != null) {
                    c14692c.m42126a((C14705p) c14709t.f9291b);
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f54381a) {
            case 0:
                super.onAnimationRepeat(animator);
                C14709t c14709t = this.f54382b;
                c14709t.f54390h = (c14709t.f54390h + 1) % c14709t.f54389g.f54314c.length;
                c14709t.f54391i = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
