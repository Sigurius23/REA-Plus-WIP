package com.stripe.android.auth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import e93.AbstractC12889b;
import l83.C23465k;
import p267k.AbstractC22081b;
import p663yx.C39838b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import v10.C35526b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/stripe/android/auth/PaymentBrowserAuthContract;", "Lk/b;", "Lyx/b;", "Lv10/b;", "<init>", "()V", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class PaymentBrowserAuthContract extends AbstractC22081b {
    /* JADX WARN: Code duplicated, block: B:9:0x0031  */
    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        boolean z4;
        Class cls;
        C39838b input = (C39838b) obj;
        AbstractC22676k.m65750j(input, "input");
        String packageName = context.getPackageName();
        AbstractC22676k.m65749i(packageName, "getPackageName(...)");
        if (input.f172025O) {
            z4 = false;
        } else {
            if (AbstractC22676k.m65745e(input.f172015E, "stripesdk://payment_return_url/" + packageName) || input.f172023M) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        Bundle bundleM36273g = AbstractC12889b.m36273g(new C23465k("extra_args", input));
        if (z4) {
            cls = StripeBrowserLauncherActivity.class;
        } else {
            if (z4) {
                throw new NoWhenBranchMatchedException();
            }
            cls = PaymentAuthWebViewActivity.class;
        }
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtras(bundleM36273g);
        return intent;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        C35526b c35526b;
        return (intent == null || (c35526b = (C35526b) intent.getParcelableExtra("extra_args")) == null) ? new C35526b((String) null, 0, (StripeException) null, false, (String) null, (String) null, 127) : c35526b;
    }
}
