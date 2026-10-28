package com.stripe.android.challenge.passive;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import m83.AbstractC25265s;
import p098dt.AbstractC12350b;
import p102dy.C12434c;
import p102dy.C12435d;
import p102dy.C12438g;
import p102dy.InterfaceC12437f;
import p267k.AbstractC22081b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/stripe/android/challenge/passive/PassiveChallengeActivityContract;", "Lk/b;", "Ldy/c;", "Ldy/f;", "<init>", "()V", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class PassiveChallengeActivityContract extends AbstractC22081b {
    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        C12434c input = (C12434c) obj;
        AbstractC22676k.m65750j(input, "input");
        int i13 = PassiveChallengeActivity.f22144y;
        Intent intentPutExtra = new Intent(context, (Class<?>) PassiveChallengeActivity.class).putExtra("passive_challenge_args", new C12438g(input.f42365a, input.f42366b, AbstractC25265s.m74093D1(input.f42367c)));
        AbstractC22676k.m65749i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        Bundle extras;
        InterfaceC12437f interfaceC12437f = (intent == null || (extras = intent.getExtras()) == null) ? null : (InterfaceC12437f) AbstractC12350b.m34600u(extras, InterfaceC12437f.class, "com.stripe.android.challenge.PassiveChallengeActivityContract.extra_result");
        return interfaceC12437f == null ? new C12435d(new Throwable("No result")) : interfaceC12437f;
    }
}
