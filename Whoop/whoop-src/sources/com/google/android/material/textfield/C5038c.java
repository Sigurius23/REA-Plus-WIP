package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: renamed from: com.google.android.material.textfield.c */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C5038c implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21194a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC5059r f21195b;

    public /* synthetic */ C5038c(AbstractC5059r abstractC5059r, int i13) {
        this.f21194a = i13;
        this.f21195b = abstractC5059r;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21194a) {
            case 0:
                C5042e c5042e = (C5042e) this.f21195b;
                c5042e.getClass();
                c5042e.f21266d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                C5042e c5042e2 = (C5042e) this.f21195b;
                c5042e2.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = c5042e2.f21266d;
                checkableImageButton.setScaleX(fFloatValue);
                checkableImageButton.setScaleY(fFloatValue);
                break;
            default:
                C5053l c5053l = (C5053l) this.f21195b;
                c5053l.getClass();
                c5053l.f21266d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
