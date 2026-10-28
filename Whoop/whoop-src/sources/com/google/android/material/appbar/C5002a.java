package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: com.google.android.material.appbar.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C5002a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CoordinatorLayout f20746a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppBarLayout f20747b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AppBarLayout.BaseBehavior f20748c;

    public C5002a(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f20748c = baseBehavior;
        this.f20746a = coordinatorLayout;
        this.f20747b = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f20748c.m71999M(this.f20746a, this.f20747b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
