package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import p098dt.AbstractC12350b;
import p267k.AbstractC22081b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import w20.C36721k;
import w20.C36723m;
import w20.InterfaceC36725o;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionContract;", "Lk/b;", "Lw20/k;", "Lw20/o;", "<init>", "()V", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class CvcRecollectionContract extends AbstractC22081b {
    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        C36721k input = (C36721k) obj;
        AbstractC22676k.m65750j(input, "input");
        Intent intentPutExtra = new Intent(context, (Class<?>) CvcRecollectionActivity.class).putExtra("extra_activity_args", input);
        AbstractC22676k.m65749i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        Bundle extras;
        InterfaceC36725o interfaceC36725o = (intent == null || (extras = intent.getExtras()) == null) ? null : (InterfaceC36725o) AbstractC12350b.m34600u(extras, InterfaceC36725o.class, "extra_activity_result");
        return interfaceC36725o == null ? C36723m.f157212w : interfaceC36725o;
    }
}
