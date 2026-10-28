package com.stripe.android.challenge.passive.warmer.activity;

import android.content.Context;
import android.content.Intent;
import m83.AbstractC25265s;
import p159fy.C14858c;
import p159fy.C14859d;
import p159fy.C14860e;
import p267k.AbstractC22081b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerContract;", "Lk/b;", "Lfy/e;", "Lfy/d;", "<init>", "()V", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class PassiveChallengeWarmerContract extends AbstractC22081b {
    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        C14860e input = (C14860e) obj;
        AbstractC22676k.m65750j(input, "input");
        int i13 = PassiveChallengeWarmerActivity.f22147y;
        Intent intentPutExtra = new Intent(context, (Class<?>) PassiveChallengeWarmerActivity.class).putExtra("passive_challenge_warmer_args", new C14858c(input.f55486a, input.f55487b, AbstractC25265s.m74093D1(input.f55488c)));
        AbstractC22676k.m65749i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @Override // p267k.AbstractC22081b
    public final /* bridge */ /* synthetic */ Object parseResult(int i13, Intent intent) {
        return C14859d.f55485w;
    }
}
