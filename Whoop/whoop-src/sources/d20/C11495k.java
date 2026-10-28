package d20;

import c93.InterfaceC4339a;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: d20.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C11495k extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f36959w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Stripe3ds2TransactionActivity f36960x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11495k(Stripe3ds2TransactionActivity stripe3ds2TransactionActivity, int i13) {
        super(0);
        this.f36959w = i13;
        this.f36960x = stripe3ds2TransactionActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f36959w) {
            case 0:
                return this.f36960x.getViewModelStore();
            default:
                return this.f36960x.getDefaultViewModelCreationExtras();
        }
    }
}
