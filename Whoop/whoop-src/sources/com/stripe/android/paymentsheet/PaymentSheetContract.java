package com.stripe.android.paymentsheet;

import android.content.Context;
import android.content.Intent;
import h20.AbstractC16632b4;
import h20.C16626a4;
import h20.C16757w3;
import h20.C16763x3;
import p267k.AbstractC22081b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0002\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m65681d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContract;", "Lk/b;", "Lh20/w3;", "Lh20/b4;", "<init>", "()V", "h20/x3", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class PaymentSheetContract extends AbstractC22081b {
    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        C16757w3 input = (C16757w3) obj;
        AbstractC22676k.m65750j(input, "input");
        Intent intentPutExtra = new Intent(context, (Class<?>) PaymentSheetActivity.class).putExtra("com.stripe.android.paymentsheet.PaymentSheetContract.extra_args", input);
        AbstractC22676k.m65749i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        C16763x3 c16763x3;
        AbstractC16632b4 abstractC16632b4 = (intent == null || (c16763x3 = (C16763x3) intent.getParcelableExtra("com.stripe.android.paymentsheet.PaymentSheetContract.extra_result")) == null) ? null : c16763x3.f64431w;
        return abstractC16632b4 == null ? new C16626a4(new IllegalArgumentException("Failed to retrieve a PaymentSheetResult.")) : abstractC16632b4;
    }
}
