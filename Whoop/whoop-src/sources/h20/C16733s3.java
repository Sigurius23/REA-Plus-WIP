package h20;

import android.content.Intent;
import c93.InterfaceC4339a;
import com.stripe.android.paymentsheet.PaymentSheetActivity;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.s3 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C16733s3 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64285w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ PaymentSheetActivity f64286x;

    public /* synthetic */ C16733s3(PaymentSheetActivity paymentSheetActivity, int i13) {
        this.f64285w = i13;
        this.f64286x = paymentSheetActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f64285w;
        PaymentSheetActivity paymentSheetActivity = this.f64286x;
        switch (i13) {
            case 0:
                int i14 = PaymentSheetActivity.f22370z;
                C16757w3 c16757w3 = (C16757w3) paymentSheetActivity.f22373y.getValue();
                if (c16757w3 != null) {
                    return c16757w3;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 1:
                return paymentSheetActivity.f22371w;
            default:
                int i15 = PaymentSheetActivity.f22370z;
                Intent intent = paymentSheetActivity.getIntent();
                AbstractC22676k.m65749i(intent, "getIntent(...)");
                return (C16757w3) intent.getParcelableExtra("com.stripe.android.paymentsheet.PaymentSheetContract.extra_args");
        }
    }
}
