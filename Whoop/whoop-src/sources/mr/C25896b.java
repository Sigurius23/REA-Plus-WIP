package mr;

import android.animation.ValueAnimator;
import p186h8.C16999a;

/* JADX INFO: renamed from: mr.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C25896b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f102221a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC25906l f102222b;

    public /* synthetic */ C25896b(AbstractC25906l abstractC25906l, int i13, byte b) {
        this.f102221a = i13;
        this.f102222b = abstractC25906l;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i13 = this.f102221a;
        AbstractC25906l abstractC25906l = this.f102222b;
        switch (i13) {
            case 0:
                abstractC25906l.f102259i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                abstractC25906l.f102259i.setScaleX(fFloatValue);
                abstractC25906l.f102259i.setScaleY(fFloatValue);
                break;
            case 2:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                C16999a c16999a = AbstractC25906l.f102248x;
                abstractC25906l.f102259i.setTranslationY(iIntValue);
                break;
            default:
                int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                C16999a c16999a2 = AbstractC25906l.f102248x;
                abstractC25906l.f102259i.setTranslationY(iIntValue2);
                break;
        }
    }

    public C25896b(AbstractC25906l abstractC25906l, int i13) {
        this.f102221a = 2;
        this.f102222b = abstractC25906l;
    }
}
