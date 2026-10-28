package p383ov;

import android.animation.ValueAnimator;
import l83.C23454a0;
import p186h8.C16999a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: ov.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C28390l extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f114505w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C16999a f114506x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f114507y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28390l(C16999a c16999a, long j7, int i13) {
        super(1);
        this.f114505w = i13;
        this.f114506x = c16999a;
        this.f114507y = j7;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f114505w) {
            case 0:
                ValueAnimator createAnchorAnimator = (ValueAnimator) obj;
                AbstractC22676k.m65750j(createAnchorAnimator, "$this$createAnchorAnimator");
                createAnchorAnimator.setInterpolator(this.f114506x);
                createAnchorAnimator.setDuration(this.f114507y);
                break;
            case 1:
                ValueAnimator createBearingAnimator = (ValueAnimator) obj;
                AbstractC22676k.m65750j(createBearingAnimator, "$this$createBearingAnimator");
                createBearingAnimator.setInterpolator(this.f114506x);
                createBearingAnimator.setDuration(this.f114507y);
                break;
            case 2:
                ValueAnimator createAnchorAnimator2 = (ValueAnimator) obj;
                AbstractC22676k.m65750j(createAnchorAnimator2, "$this$createAnchorAnimator");
                createAnchorAnimator2.setInterpolator(this.f114506x);
                createAnchorAnimator2.setDuration(this.f114507y);
                break;
            default:
                ValueAnimator createZoomAnimator = (ValueAnimator) obj;
                AbstractC22676k.m65750j(createZoomAnimator, "$this$createZoomAnimator");
                createZoomAnimator.setInterpolator(this.f114506x);
                createZoomAnimator.setDuration(this.f114507y);
                break;
        }
        return C23454a0.f92919a;
    }
}
