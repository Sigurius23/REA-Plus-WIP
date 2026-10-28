package com.stripe.android.paymentsheet.p055ui;

import android.content.Context;
import android.content.Intent;
import b30.C2657x5;
import b30.C2671z5;
import b30.InterfaceC2481a6;
import p267k.AbstractC22081b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/stripe/android/paymentsheet/ui/SepaMandateContract;", "Lk/b;", "Lb30/x5;", "Lb30/a6;", "<init>", "()V", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class SepaMandateContract extends AbstractC22081b {
    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        C2657x5 input = (C2657x5) obj;
        AbstractC22676k.m65750j(input, "input");
        Intent intentPutExtra = new Intent(context, (Class<?>) SepaMandateActivity.class).putExtra("extra_activity_args", input);
        AbstractC22676k.m65749i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        InterfaceC2481a6 interfaceC2481a6;
        return (intent == null || (interfaceC2481a6 = (InterfaceC2481a6) intent.getParcelableExtra("extra_activity_result")) == null) ? C2671z5.f10463w : interfaceC2481a6;
    }
}
