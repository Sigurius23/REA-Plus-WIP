package h20;

import c93.InterfaceC4339a;
import com.stripe.android.paymentsheet.PaymentSheetActivity;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: h20.v3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16751v3 extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64332w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ PaymentSheetActivity f64333x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16751v3(PaymentSheetActivity paymentSheetActivity, int i13) {
        super(0);
        this.f64332w = i13;
        this.f64333x = paymentSheetActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f64332w) {
            case 0:
                return this.f64333x.getViewModelStore();
            default:
                return this.f64333x.getDefaultViewModelCreationExtras();
        }
    }
}
