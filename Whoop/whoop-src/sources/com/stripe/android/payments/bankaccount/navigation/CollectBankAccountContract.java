package com.stripe.android.payments.bankaccount.navigation;

import android.content.Context;
import android.content.Intent;
import com.stripe.android.payments.bankaccount.p054ui.CollectBankAccountActivity;
import p267k.AbstractC22081b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import z10.AbstractC39982e;
import z10.AbstractC39995r;
import z10.C39983f;
import z10.C39994q;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0002\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m65681d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract;", "Lk/b;", "Lz10/e;", "Lz10/r;", "<init>", "()V", "z10/f", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class CollectBankAccountContract extends AbstractC22081b {
    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        AbstractC39982e input = (AbstractC39982e) obj;
        AbstractC22676k.m65750j(input, "input");
        Intent intentPutExtra = new Intent(context, (Class<?>) CollectBankAccountActivity.class).putExtra("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_args", input);
        AbstractC22676k.m65749i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        C39983f c39983f;
        AbstractC39995r abstractC39995r = (intent == null || (c39983f = (C39983f) intent.getParcelableExtra("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_result")) == null) ? null : c39983f.f172550w;
        return abstractC39995r == null ? new C39994q(new IllegalArgumentException("Failed to retrieve a CollectBankAccountResult.")) : abstractC39995r;
    }
}
