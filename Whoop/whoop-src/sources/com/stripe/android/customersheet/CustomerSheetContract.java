package com.stripe.android.customersheet;

import android.content.Context;
import android.content.Intent;
import cz.AbstractC11239z0;
import cz.C11200g;
import cz.C11237y0;
import p267k.AbstractC22081b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/stripe/android/customersheet/CustomerSheetContract;", "Lk/b;", "Lcz/g;", "Lcz/z0;", "<init>", "()V", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class CustomerSheetContract extends AbstractC22081b {
    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        C11200g input = (C11200g) obj;
        AbstractC22676k.m65750j(input, "input");
        Intent intentPutExtra = new Intent(context, (Class<?>) CustomerSheetActivity.class).putExtra("args", input);
        AbstractC22676k.m65749i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        AbstractC11239z0 abstractC11239z0 = intent != null ? (AbstractC11239z0) intent.getParcelableExtra("extra_activity_result") : null;
        return abstractC11239z0 == null ? new C11237y0(new IllegalArgumentException("Failed to retrieve a CustomerSheetResult")) : abstractC11239z0;
    }
}
