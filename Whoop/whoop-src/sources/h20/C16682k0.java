package h20;

import c93.InterfaceC4339a;
import com.stripe.android.paymentsheet.PaymentOptionsActivity;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: h20.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16682k0 extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64147w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ PaymentOptionsActivity f64148x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16682k0(PaymentOptionsActivity paymentOptionsActivity, int i13) {
        super(0);
        this.f64147w = i13;
        this.f64148x = paymentOptionsActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f64147w) {
            case 0:
                return this.f64148x.getViewModelStore();
            default:
                return this.f64148x.getDefaultViewModelCreationExtras();
        }
    }
}
