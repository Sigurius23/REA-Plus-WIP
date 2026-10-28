package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1666c0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6586a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f6587b;

    public /* synthetic */ C1666c0(Object obj, int i13) {
        this.f6586a = i13;
        this.f6587b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6586a) {
            case 0:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C1671d0 c1671d0 = (C1671d0) this.f6587b;
                c1671d0.f6610c.setAlpha(iFloatValue);
                c1671d0.f6611d.setAlpha(iFloatValue);
                c1671d0.f6626s.invalidate();
                break;
            default:
                ((C1695j0) this.f6587b).f6703m = valueAnimator.getAnimatedFraction();
                break;
        }
    }
}
