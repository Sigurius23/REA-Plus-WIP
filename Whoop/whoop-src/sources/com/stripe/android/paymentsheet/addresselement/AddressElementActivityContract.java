package com.stripe.android.paymentsheet.addresselement;

import android.content.Context;
import android.content.Intent;
import i20.AbstractC17981v;
import i20.C17946h;
import i20.C17949i;
import i20.C17977t;
import p267k.AbstractC22081b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0002\u0006B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m65681d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract;", "Lk/b;", "Li20/h;", "Li20/v;", "<init>", "()V", "i20/i", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class AddressElementActivityContract extends AbstractC22081b {
    static {
        new AddressElementActivityContract();
    }

    private AddressElementActivityContract() {
    }

    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        C17946h input = (C17946h) obj;
        AbstractC22676k.m65750j(input, "input");
        Intent intentPutExtra = new Intent(context, (Class<?>) AddressElementActivity.class).putExtra("com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract.extra_args", input);
        AbstractC22676k.m65749i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        C17949i c17949i;
        AbstractC17981v abstractC17981v;
        return (intent == null || (c17949i = (C17949i) intent.getParcelableExtra("com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract.extra_result")) == null || (abstractC17981v = c17949i.f69731w) == null) ? new C17977t(true) : abstractC17981v;
    }
}
