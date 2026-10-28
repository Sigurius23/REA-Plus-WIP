package p157fv;

import android.animation.ValueAnimator;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: fv.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C14807m extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public static final C14807m f54979E;

    /* JADX INFO: renamed from: F */
    public static final C14807m f54980F;

    /* JADX INFO: renamed from: G */
    public static final C14807m f54981G;

    /* JADX INFO: renamed from: x */
    public static final C14807m f54982x;

    /* JADX INFO: renamed from: y */
    public static final C14807m f54983y;

    /* JADX INFO: renamed from: z */
    public static final C14807m f54984z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f54985w;

    static {
        int i13 = 1;
        f54982x = new C14807m(i13, 0);
        f54983y = new C14807m(i13, 1);
        f54984z = new C14807m(i13, 2);
        f54979E = new C14807m(i13, 3);
        f54980F = new C14807m(i13, 4);
        f54981G = new C14807m(i13, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14807m(int i13, int i14) {
        super(i13);
        this.f54985w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f54985w) {
            case 0:
                ValueAnimator put = (ValueAnimator) obj;
                AbstractC22676k.m65750j(put, "$this$put");
                put.setDuration(300L);
                put.setInterpolator(C14808n.f54986d);
                break;
            case 1:
                ValueAnimator put2 = (ValueAnimator) obj;
                AbstractC22676k.m65750j(put2, "$this$put");
                put2.setDuration(300L);
                put2.setInterpolator(C14808n.f54986d);
                break;
            case 2:
                ValueAnimator put3 = (ValueAnimator) obj;
                AbstractC22676k.m65750j(put3, "$this$put");
                put3.setDuration(300L);
                put3.setInterpolator(C14808n.f54986d);
                break;
            case 3:
                ValueAnimator put4 = (ValueAnimator) obj;
                AbstractC22676k.m65750j(put4, "$this$put");
                put4.setDuration(300L);
                put4.setInterpolator(C14808n.f54986d);
                break;
            case 4:
                ValueAnimator put5 = (ValueAnimator) obj;
                AbstractC22676k.m65750j(put5, "$this$put");
                put5.setDuration(300L);
                put5.setInterpolator(C14808n.f54986d);
                break;
            default:
                ValueAnimator put6 = (ValueAnimator) obj;
                AbstractC22676k.m65750j(put6, "$this$put");
                put6.setDuration(300L);
                put6.setInterpolator(C14808n.f54986d);
                break;
        }
        return C23454a0.f92919a;
    }
}
