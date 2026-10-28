package com.stripe.android.challenge.confirmation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import e93.AbstractC12889b;
import l83.C23465k;
import m83.AbstractC25265s;
import p023ay.C2142p;
import p023ay.C2143q;
import p023ay.C2146t;
import p023ay.InterfaceC2145s;
import p098dt.AbstractC12350b;
import p267k.AbstractC22081b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivityContract;", "Lk/b;", "Lay/p;", "Lay/s;", "<init>", "()V", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class IntentConfirmationChallengeActivityContract extends AbstractC22081b {
    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        C2142p input = (C2142p) obj;
        AbstractC22676k.m65750j(input, "input");
        int i13 = IntentConfirmationChallengeActivity.f22141y;
        Intent intentPutExtras = new Intent(context, (Class<?>) IntentConfirmationChallengeActivity.class).putExtras(AbstractC12889b.m36273g(new C23465k("intent_confirmation_challenge_args", new C2146t(input.f8536a, AbstractC25265s.m74093D1(input.f8537b), input.f8538c))));
        AbstractC22676k.m65749i(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        Bundle extras;
        InterfaceC2145s interfaceC2145s = (intent == null || (extras = intent.getExtras()) == null) ? null : (InterfaceC2145s) AbstractC12350b.m34600u(extras, InterfaceC2145s.class, "com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivityContract.extra_result");
        return interfaceC2145s == null ? new C2143q(new Throwable("No result")) : interfaceC2145s;
    }
}
