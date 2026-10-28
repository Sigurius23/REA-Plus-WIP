package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: com.google.android.material.textfield.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5041d0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TextInputLayout f21199a;

    public C5041d0(TextInputLayout textInputLayout) {
        this.f21199a = textInputLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f21199a.f21147V0.m29856p(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
