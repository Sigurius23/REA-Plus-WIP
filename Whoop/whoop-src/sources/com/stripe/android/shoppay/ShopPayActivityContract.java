package com.stripe.android.shoppay;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import h30.C16800e;
import h30.C16803h;
import h30.C16805j;
import h30.InterfaceC16804i;
import p098dt.AbstractC12350b;
import p267k.AbstractC22081b;
import p537ux.C35362x;
import p537ux.C35363y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0002¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/shoppay/ShopPayActivityContract;", "Lk/b;", "Lh30/e;", "Lh30/i;", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class ShopPayActivityContract extends AbstractC22081b {

    /* JADX INFO: renamed from: a */
    public final String f22418a;

    public ShopPayActivityContract(String paymentElementCallbackIdentifier) {
        AbstractC22676k.m65750j(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        this.f22418a = paymentElementCallbackIdentifier;
    }

    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        C16800e input = (C16800e) obj;
        AbstractC22676k.m65750j(input, "input");
        C35363y c35363y = C35363y.f150632y;
        if (c35363y == null) {
            SharedPreferences sharedPreferences = new C35362x(context).f150631a;
            String string = sharedPreferences.getString("key_publishable_key", null);
            c35363y = string != null ? new C35363y(string, sharedPreferences.getString("key_account_id", null)) : null;
            if (c35363y == null) {
                throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
            }
            C35363y.f150632y = c35363y;
        }
        int i13 = ShopPayActivity.f22413E;
        Intent intentPutExtra = new Intent(context, (Class<?>) ShopPayActivity.class).putExtra("shop_pay_args", new C16805j(input.f64560a, input.f64561b, c35363y.f150633w, c35363y.f150634x, this.f22418a, input.f64562c, input.f64563d));
        AbstractC22676k.m65749i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        Bundle extras;
        InterfaceC16804i interfaceC16804i = (intent == null || (extras = intent.getExtras()) == null) ? null : (InterfaceC16804i) AbstractC12350b.m34600u(extras, InterfaceC16804i.class, "com.stripe.android.shoppay.ShopPayActivityContract.extra_result");
        return interfaceC16804i == null ? new C16803h(new Throwable("No result")) : interfaceC16804i;
    }
}
