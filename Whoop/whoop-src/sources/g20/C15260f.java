package g20;

import c93.InterfaceC4339a;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: g20.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C15260f extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f57291w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ PaymentLauncherConfirmationActivity f57292x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15260f(PaymentLauncherConfirmationActivity paymentLauncherConfirmationActivity, int i13) {
        super(0);
        this.f57291w = i13;
        this.f57292x = paymentLauncherConfirmationActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f57291w) {
            case 0:
                return this.f57292x.getViewModelStore();
            default:
                return this.f57292x.getDefaultViewModelCreationExtras();
        }
    }
}
