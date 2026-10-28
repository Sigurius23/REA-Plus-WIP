package p176gv;

import android.animation.Animator;
import b30.C2606q3;
import c93.InterfaceC4339a;
import java.util.concurrent.CopyOnWriteArraySet;
import l83.C23454a0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: gv.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C16216b extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f61596w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Animator.AnimatorListener f61597x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC16218d f61598y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16216b(Animator.AnimatorListener animatorListener, AbstractC16218d abstractC16218d) {
        super(0);
        this.f61597x = animatorListener;
        this.f61598y = abstractC16218d;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f61596w) {
            case 0:
                AbstractC16218d abstractC16218d = this.f61598y;
                C2606q3 c2606q3 = abstractC16218d.f61604G;
                Animator.AnimatorListener animatorListener = this.f61597x;
                if (c2606q3 != null) {
                    super/*android.animation.Animator*/.addListener(animatorListener);
                }
                abstractC16218d.f61606I.add(animatorListener);
                break;
            default:
                AbstractC16218d abstractC16218d2 = this.f61598y;
                C2606q3 c2606q4 = abstractC16218d2.f61604G;
                CopyOnWriteArraySet copyOnWriteArraySet = abstractC16218d2.f61606I;
                Animator.AnimatorListener animatorListener2 = this.f61597x;
                if (!AbstractC22676k.m65745e(animatorListener2, c2606q4)) {
                    super/*android.animation.Animator*/.removeListener(animatorListener2);
                }
                if (copyOnWriteArraySet.contains(animatorListener2)) {
                    copyOnWriteArraySet.remove(animatorListener2);
                }
                break;
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16216b(AbstractC16218d abstractC16218d, Animator.AnimatorListener animatorListener) {
        super(0);
        this.f61598y = abstractC16218d;
        this.f61597x = animatorListener;
    }
}
