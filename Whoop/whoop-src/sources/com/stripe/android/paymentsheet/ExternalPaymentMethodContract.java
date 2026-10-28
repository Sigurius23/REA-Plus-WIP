package com.stripe.android.paymentsheet;

import android.content.Context;
import android.content.Intent;
import b20.C2326f;
import b20.EnumC2325e;
import com.stripe.android.core.exception.LocalStripeException;
import g20.C15273s;
import g20.C15274t;
import g20.C15275u;
import h20.C16693m;
import p267k.AbstractC22081b;
import p550vd.AbstractC35903f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/paymentsheet/ExternalPaymentMethodContract;", "Lk/b;", "Lh20/m;", "Lg20/v;", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class ExternalPaymentMethodContract extends AbstractC22081b {

    /* JADX INFO: renamed from: a */
    public final C2326f f22364a;

    public ExternalPaymentMethodContract(C2326f errorReporter) {
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        this.f22364a = errorReporter;
    }

    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        C16693m input = (C16693m) obj;
        AbstractC22676k.m65750j(input, "input");
        Intent intentPutExtra = new Intent().setClass(context, ExternalPaymentMethodProxyActivity.class).putExtra("external_payment_method_type", input.f64213b).putExtra("payment_element_identifier", input.f64212a).putExtra("external_payment_method_billing_details", input.f64214c);
        AbstractC22676k.m65749i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        if (i13 == -1) {
            return C15274t.f57360w;
        }
        if (i13 == 0) {
            return C15273s.f57359w;
        }
        if (i13 == 1) {
            return new C15275u(new LocalStripeException(intent != null ? intent.getStringExtra("external_payment_method_error_message") : null, "externalPaymentMethodFailure"));
        }
        AbstractC35903f.m113990H(this.f22364a, EnumC2325e.EXTERNAL_PAYMENT_METHOD_UNEXPECTED_RESULT_CODE, null, AbstractC31061c.m95645u("result_code", String.valueOf(i13)), 2);
        return new C15275u(new IllegalArgumentException("Invalid result code returned by external payment method activity"));
    }
}
