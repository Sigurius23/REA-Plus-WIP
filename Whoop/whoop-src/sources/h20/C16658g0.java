package h20;

import android.content.Intent;
import c93.InterfaceC4339a;
import com.stripe.android.paymentsheet.PaymentOptionsActivity;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.g0 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C16658g0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64057w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ PaymentOptionsActivity f64058x;

    public /* synthetic */ C16658g0(PaymentOptionsActivity paymentOptionsActivity, int i13) {
        this.f64057w = i13;
        this.f64058x = paymentOptionsActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f64057w;
        PaymentOptionsActivity paymentOptionsActivity = this.f64058x;
        switch (i13) {
            case 0:
                int i14 = PaymentOptionsActivity.f22366z;
                C16652f0 c16652f0 = (C16652f0) paymentOptionsActivity.f22369y.getValue();
                if (c16652f0 != null) {
                    return c16652f0;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 1:
                return paymentOptionsActivity.f22367w;
            default:
                int i15 = PaymentOptionsActivity.f22366z;
                Intent intent = paymentOptionsActivity.getIntent();
                AbstractC22676k.m65749i(intent, "getIntent(...)");
                return (C16652f0) intent.getParcelableExtra("extra_activity_args");
        }
    }
}
