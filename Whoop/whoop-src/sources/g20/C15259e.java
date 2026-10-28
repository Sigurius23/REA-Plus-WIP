package g20;

import android.content.Intent;
import c93.InterfaceC4339a;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g20.e */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C15259e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f57289w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ PaymentLauncherConfirmationActivity f57290x;

    public /* synthetic */ C15259e(PaymentLauncherConfirmationActivity paymentLauncherConfirmationActivity, int i13) {
        this.f57289w = i13;
        this.f57290x = paymentLauncherConfirmationActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f57289w;
        PaymentLauncherConfirmationActivity paymentLauncherConfirmationActivity = this.f57290x;
        switch (i13) {
            case 0:
                int i14 = PaymentLauncherConfirmationActivity.f22360z;
                Intent intent = paymentLauncherConfirmationActivity.getIntent();
                AbstractC22676k.m65749i(intent, "getIntent(...)");
                return (AbstractC15266l) intent.getParcelableExtra("extra_args");
            case 1:
                int i15 = PaymentLauncherConfirmationActivity.f22360z;
                AbstractC15266l abstractC15266l = (AbstractC15266l) paymentLauncherConfirmationActivity.f22361w.getValue();
                if (abstractC15266l != null) {
                    return abstractC15266l;
                }
                throw new IllegalArgumentException("Required value was null.");
            default:
                return paymentLauncherConfirmationActivity.f22362x;
        }
    }
}
