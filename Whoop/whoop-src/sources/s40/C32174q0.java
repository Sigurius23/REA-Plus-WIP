package s40;

import c93.InterfaceC4339a;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: s40.q0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32174q0 extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f133255w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ PaymentAuthWebViewActivity f133256x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C32174q0(PaymentAuthWebViewActivity paymentAuthWebViewActivity, int i13) {
        super(0);
        this.f133255w = i13;
        this.f133256x = paymentAuthWebViewActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f133255w) {
            case 0:
                return this.f133256x.getViewModelStore();
            default:
                return this.f133256x.getDefaultViewModelCreationExtras();
        }
    }
}
