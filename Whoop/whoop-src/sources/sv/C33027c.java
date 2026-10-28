package sv;

import android.animation.ValueAnimator;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: sv.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C33027c extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f137564w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC33028d f137565x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33027c(AbstractC33028d abstractC33028d, int i13) {
        super(0);
        this.f137564w = i13;
        this.f137565x = abstractC33028d;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f137564w) {
            case 0:
                this.f137565x.start();
                break;
            case 1:
                this.f137565x.f137568x.start();
                break;
            default:
                AbstractC33028d abstractC33028d = this.f137565x;
                boolean zIsRunning = abstractC33028d.isRunning();
                ValueAnimator valueAnimator = abstractC33028d.f137568x;
                if (zIsRunning) {
                    abstractC33028d.cancel();
                }
                if (valueAnimator.isRunning()) {
                    valueAnimator.cancel();
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
