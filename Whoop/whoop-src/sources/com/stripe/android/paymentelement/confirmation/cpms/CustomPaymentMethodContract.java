package com.stripe.android.paymentelement.confirmation.cpms;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import i10.AbstractC17857g;
import i10.C17853c;
import i10.C17856f;
import p098dt.AbstractC12350b;
import p267k.AbstractC22081b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodContract;", "Lk/b;", "Li10/c;", "Li10/g;", "<init>", "()V", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class CustomPaymentMethodContract extends AbstractC22081b {
    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        C17853c input = (C17853c) obj;
        AbstractC22676k.m65750j(input, "input");
        Intent intentPutExtra = new Intent().setClass(context, CustomPaymentMethodProxyActivity.class).putExtra("payment_element_identifier", input.f69473a).putExtra("extra_custom_method_type", input.f69474b).putExtra("extra_payment_method_billing_details", input.f69475c);
        AbstractC22676k.m65749i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        Bundle extras;
        AbstractC17857g abstractC17857g;
        return (intent == null || (extras = intent.getExtras()) == null || (abstractC17857g = (AbstractC17857g) AbstractC12350b.m34600u(extras, AbstractC17857g.class, "CUSTOM_PAYMENT_METHOD_RESULT")) == null) ? new C17856f(new IllegalStateException("Failed to find custom payment method result!")) : abstractC17857g;
    }
}
