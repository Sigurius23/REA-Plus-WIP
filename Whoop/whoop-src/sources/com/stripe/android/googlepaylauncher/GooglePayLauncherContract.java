package com.stripe.android.googlepaylauncher;

import android.content.Context;
import android.content.Intent;
import e93.AbstractC12889b;
import l83.C23465k;
import p267k.AbstractC22081b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import sz.AbstractC33147o;
import sz.AbstractC33155t;
import sz.C33145n;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0007\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m65681d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract;", "Lk/b;", "Lsz/t;", "Lsz/o;", "<init>", "()V", "sz/u", "sz/v", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class GooglePayLauncherContract extends AbstractC22081b {
    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        AbstractC33155t input = (AbstractC33155t) obj;
        AbstractC22676k.m65750j(input, "input");
        Intent intentPutExtras = new Intent(context, (Class<?>) GooglePayLauncherActivity.class).putExtras(AbstractC12889b.m36273g(new C23465k("extra_args", input)));
        AbstractC22676k.m65749i(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        AbstractC33147o abstractC33147o;
        return (intent == null || (abstractC33147o = (AbstractC33147o) intent.getParcelableExtra("extra_result")) == null) ? new C33145n(new IllegalStateException("Error while processing result from Google Pay.")) : abstractC33147o;
    }
}
