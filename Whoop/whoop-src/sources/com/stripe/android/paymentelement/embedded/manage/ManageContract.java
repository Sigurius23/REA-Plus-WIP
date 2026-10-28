package com.stripe.android.paymentelement.embedded.manage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import p098dt.AbstractC12350b;
import p267k.AbstractC22081b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import u10.C34421i;
import u10.C34431s;
import u10.InterfaceC34432t;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/stripe/android/paymentelement/embedded/manage/ManageContract;", "Lk/b;", "Lu10/i;", "Lu10/t;", "<init>", "()V", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class ManageContract extends AbstractC22081b {
    static {
        new ManageContract();
    }

    private ManageContract() {
    }

    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        C34421i input = (C34421i) obj;
        AbstractC22676k.m65750j(input, "input");
        Intent intentPutExtra = new Intent(context, (Class<?>) ManageActivity.class).putExtra("extra_activity_args", input);
        AbstractC22676k.m65749i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        Bundle extras;
        InterfaceC34432t interfaceC34432t = (intent == null || (extras = intent.getExtras()) == null) ? null : (InterfaceC34432t) AbstractC12350b.m34600u(extras, InterfaceC34432t.class, "extra_activity_result");
        return interfaceC34432t == null ? C34431s.f144674w : interfaceC34432t;
    }
}
