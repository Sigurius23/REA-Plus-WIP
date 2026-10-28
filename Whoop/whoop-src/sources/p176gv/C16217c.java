package p176gv;

import android.animation.ValueAnimator;
import c93.InterfaceC4339a;
import java.util.concurrent.CopyOnWriteArraySet;
import l83.C23454a0;
import p157fv.C14796b;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: gv.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C16217c extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f61599w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ValueAnimator.AnimatorUpdateListener f61600x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC16218d f61601y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16217c(ValueAnimator.AnimatorUpdateListener animatorUpdateListener, AbstractC16218d abstractC16218d) {
        super(0);
        this.f61600x = animatorUpdateListener;
        this.f61601y = abstractC16218d;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f61599w) {
            case 0:
                AbstractC16218d abstractC16218d = this.f61601y;
                C14796b c14796b = abstractC16218d.f61603F;
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f61600x;
                if (c14796b != null) {
                    super/*android.animation.ValueAnimator*/.addUpdateListener(animatorUpdateListener);
                }
                abstractC16218d.f61605H.add(animatorUpdateListener);
                break;
            default:
                AbstractC16218d abstractC16218d2 = this.f61601y;
                C14796b c14796b2 = abstractC16218d2.f61603F;
                CopyOnWriteArraySet copyOnWriteArraySet = abstractC16218d2.f61605H;
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener2 = this.f61600x;
                if (!AbstractC22676k.m65745e(animatorUpdateListener2, c14796b2)) {
                    super/*android.animation.ValueAnimator*/.removeUpdateListener(animatorUpdateListener2);
                }
                if (copyOnWriteArraySet.contains(animatorUpdateListener2)) {
                    copyOnWriteArraySet.remove(animatorUpdateListener2);
                }
                break;
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16217c(AbstractC16218d abstractC16218d, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        super(0);
        this.f61601y = abstractC16218d;
        this.f61600x = animatorUpdateListener;
    }
}
