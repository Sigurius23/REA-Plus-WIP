package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: com.google.android.material.textfield.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C5040d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21197a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C5042e f21198b;

    public /* synthetic */ C5040d(C5042e c5042e, int i13) {
        this.f21197a = i13;
        this.f21198b = c5042e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f21197a) {
            case 1:
                this.f21198b.f21264b.m15879h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f21197a) {
            case 0:
                this.f21198b.f21264b.m15879h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
