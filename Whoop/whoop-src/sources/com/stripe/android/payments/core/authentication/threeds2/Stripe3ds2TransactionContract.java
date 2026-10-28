package com.stripe.android.payments.core.authentication.threeds2;

import android.content.Context;
import android.content.Intent;
import com.stripe.android.core.exception.StripeException;
import d20.C11496l;
import e93.AbstractC12889b;
import l83.C23465k;
import p267k.AbstractC22081b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import v10.C35526b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract;", "Lk/b;", "Ld20/l;", "Lv10/b;", "<init>", "()V", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class Stripe3ds2TransactionContract extends AbstractC22081b {
    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        C11496l input = (C11496l) obj;
        AbstractC22676k.m65750j(input, "input");
        Intent intentPutExtras = new Intent(context, (Class<?>) Stripe3ds2TransactionActivity.class).putExtras(AbstractC12889b.m36273g(new C23465k("extra_args", input)));
        AbstractC22676k.m65749i(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        C35526b c35526b;
        return (intent == null || (c35526b = (C35526b) intent.getParcelableExtra("extra_args")) == null) ? new C35526b((String) null, 0, (StripeException) null, false, (String) null, (String) null, 127) : c35526b;
    }
}
