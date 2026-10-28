package p383ov;

import android.animation.ValueAnimator;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: ov.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C28391m extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public static final C28391m f114508E;

    /* JADX INFO: renamed from: x */
    public static final C28391m f114509x;

    /* JADX INFO: renamed from: y */
    public static final C28391m f114510y;

    /* JADX INFO: renamed from: z */
    public static final C28391m f114511z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f114512w;

    static {
        int i13 = 1;
        f114509x = new C28391m(i13, 0);
        f114510y = new C28391m(i13, 1);
        f114511z = new C28391m(i13, 2);
        f114508E = new C28391m(i13, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28391m(int i13, int i14) {
        super(i13);
        this.f114512w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f114512w) {
            case 0:
                ValueAnimator createAnchorAnimator = (ValueAnimator) obj;
                AbstractC22676k.m65750j(createAnchorAnimator, "$this$createAnchorAnimator");
                createAnchorAnimator.setDuration(0L);
                break;
            case 1:
                ValueAnimator createBearingAnimator = (ValueAnimator) obj;
                AbstractC22676k.m65750j(createBearingAnimator, "$this$createBearingAnimator");
                createBearingAnimator.setDuration(0L);
                break;
            case 2:
                ValueAnimator createAnchorAnimator2 = (ValueAnimator) obj;
                AbstractC22676k.m65750j(createAnchorAnimator2, "$this$createAnchorAnimator");
                createAnchorAnimator2.setDuration(0L);
                break;
            default:
                ValueAnimator createZoomAnimator = (ValueAnimator) obj;
                AbstractC22676k.m65750j(createZoomAnimator, "$this$createZoomAnimator");
                createZoomAnimator.setDuration(0L);
                break;
        }
        return C23454a0.f92919a;
    }
}
