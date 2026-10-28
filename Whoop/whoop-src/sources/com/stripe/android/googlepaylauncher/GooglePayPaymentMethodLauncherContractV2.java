package com.stripe.android.googlepaylauncher;

import android.content.Context;
import android.content.Intent;
import e93.AbstractC12889b;
import l83.C23465k;
import p267k.AbstractC22081b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import sz.AbstractC33132g0;
import sz.C33130f0;
import sz.C33142l0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2;", "Lk/b;", "Lsz/l0;", "Lsz/g0;", "<init>", "()V", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class GooglePayPaymentMethodLauncherContractV2 extends AbstractC22081b {
    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        C33142l0 input = (C33142l0) obj;
        AbstractC22676k.m65750j(input, "input");
        Intent intentPutExtras = new Intent(context, (Class<?>) GooglePayPaymentMethodLauncherActivity.class).putExtras(AbstractC12889b.m36273g(new C23465k("extra_args", input)));
        AbstractC22676k.m65749i(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        AbstractC33132g0 abstractC33132g0;
        return (intent == null || (abstractC33132g0 = (AbstractC33132g0) intent.getParcelableExtra("extra_result")) == null) ? new C33130f0(1, new IllegalArgumentException("Could not parse a valid result.")) : abstractC33132g0;
    }
}
