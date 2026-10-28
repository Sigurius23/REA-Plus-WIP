package com.stripe.android.stripe3ds2.transaction;

import android.content.Context;
import android.content.Intent;
import com.stripe.android.stripe3ds2.views.ChallengeActivity;
import e93.AbstractC12889b;
import l83.C23465k;
import p267k.AbstractC22081b;
import p479s4.AbstractC32126g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.AbstractC29894a0;
import q30.C29920n0;
import q30.C29939x;
import t30.C33517s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeContract;", "Lk/b;", "Lt30/s;", "Lq30/a0;", "<init>", "()V", "3ds2sdk_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class ChallengeContract extends AbstractC22081b {
    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        C33517s input = (C33517s) obj;
        AbstractC22676k.m65750j(input, "input");
        Intent intentPutExtras = new Intent(context, (Class<?>) ChallengeActivity.class).putExtras(AbstractC12889b.m36273g(new C23465k("extra_args", input)));
        AbstractC22676k.m65749i(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        AbstractC29894a0 abstractC29894a0;
        return (intent == null || (abstractC29894a0 = (AbstractC29894a0) AbstractC32126g.m100043h(intent, "extra_result", AbstractC29894a0.class)) == null) ? new C29939x(new IllegalStateException("Intent extras did not contain a valid ChallengeResult."), null, C29920n0.f122215E) : abstractC29894a0;
    }
}
