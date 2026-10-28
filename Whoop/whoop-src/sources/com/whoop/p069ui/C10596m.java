package com.whoop.p069ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.ui.m */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lcom/whoop/ui/m;", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "Ll83/a0;", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationCancel", "onAnimationEnd", "", "a", "Z", "canceled", "legacy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10596m extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean canceled;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ThrobberView f32196b;

    public C10596m(ThrobberView throbberView) {
        this.f32196b = throbberView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animation) {
        AbstractC22676k.m65750j(animation, "animation");
        this.canceled = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        AbstractC22676k.m65750j(animation, "animation");
        if (this.canceled || !this.f32196b.isAnimating) {
            return;
        }
        animation.start();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        AbstractC22676k.m65750j(animation, "animation");
        this.canceled = false;
    }
}
