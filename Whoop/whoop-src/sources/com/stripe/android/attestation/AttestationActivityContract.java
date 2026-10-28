package com.stripe.android.attestation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import m83.AbstractC25265s;
import p098dt.AbstractC12350b;
import p267k.AbstractC22081b;
import p597wx.C37673b;
import p597wx.C37674c;
import p597wx.C37678g;
import p597wx.InterfaceC37676e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/stripe/android/attestation/AttestationActivityContract;", "Lk/b;", "Lwx/b;", "Lwx/e;", "<init>", "()V", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class AttestationActivityContract extends AbstractC22081b {
    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        C37673b input = (C37673b) obj;
        AbstractC22676k.m65750j(input, "input");
        int i13 = AttestationActivity.f22138y;
        Intent intentPutExtra = new Intent(context, (Class<?>) AttestationActivity.class).putExtra("attestation_args", new C37678g(input.f161425a, AbstractC25265s.m74093D1(input.f161426b)));
        AbstractC22676k.m65749i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        Bundle extras;
        InterfaceC37676e interfaceC37676e = (intent == null || (extras = intent.getExtras()) == null) ? null : (InterfaceC37676e) AbstractC12350b.m34600u(extras, InterfaceC37676e.class, "com.stripe.android.attestation.AttestationActivityContract.extra_result");
        return interfaceC37676e == null ? new C37674c(new IllegalStateException("No result received from AttestationActivity")) : interfaceC37676e;
    }
}
