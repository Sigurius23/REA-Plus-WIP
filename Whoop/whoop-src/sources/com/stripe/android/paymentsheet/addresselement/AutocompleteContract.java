package com.stripe.android.paymentsheet.addresselement;

import android.content.Context;
import android.content.Intent;
import i20.AbstractC17941f0;
import i20.C17932c0;
import p267k.AbstractC22081b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0002\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract;", "Lk/b;", "Li20/c0;", "Li20/f0;", "<init>", "()V", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class AutocompleteContract extends AbstractC22081b {

    /* JADX INFO: renamed from: a */
    public static final AutocompleteContract f22381a = new AutocompleteContract();

    private AutocompleteContract() {
    }

    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        C17932c0 input = (C17932c0) obj;
        AbstractC22676k.m65750j(input, "input");
        Intent intentPutExtra = new Intent(context, (Class<?>) AutocompleteActivity.class).putExtra("com.stripe.android.paymentsheet.addresselement.AutocompleteContract.extra_args", input);
        AbstractC22676k.m65749i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        AbstractC17941f0 abstractC17941f0;
        if (intent == null || (abstractC17941f0 = (AbstractC17941f0) intent.getParcelableExtra("com.stripe.android.paymentsheet.addresselement.AutocompleteContract.extra_result")) == null) {
            throw new IllegalStateException("Unknown MPE address autocomplete result!");
        }
        return abstractC17941f0;
    }
}
