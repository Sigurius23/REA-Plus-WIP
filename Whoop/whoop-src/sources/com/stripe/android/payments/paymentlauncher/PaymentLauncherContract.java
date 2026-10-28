package com.stripe.android.payments.paymentlauncher;

import android.content.Context;
import android.content.Intent;
import e93.AbstractC12889b;
import g20.AbstractC15258d;
import g20.AbstractC15266l;
import g20.C15257c;
import l83.C23465k;
import p267k.AbstractC22081b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract;", "Lk/b;", "Lg20/l;", "Lg20/d;", "<init>", "()V", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class PaymentLauncherContract extends AbstractC22081b {
    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        AbstractC15266l input = (AbstractC15266l) obj;
        AbstractC22676k.m65750j(input, "input");
        Intent intentPutExtras = new Intent(context, (Class<?>) PaymentLauncherConfirmationActivity.class).putExtras(AbstractC12889b.m36273g(new C23465k("extra_args", input)));
        AbstractC22676k.m65749i(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        AbstractC15258d abstractC15258d;
        return (intent == null || (abstractC15258d = (AbstractC15258d) intent.getParcelableExtra("extra_args")) == null) ? new C15257c(new IllegalStateException("Failed to get PaymentSheetResult from Intent")) : abstractC15258d;
    }
}
