package com.stripe.android.financialconnections.launcher;

import android.content.Context;
import android.content.Intent;
import kz.AbstractC22911h;
import kz.C22905b;
import kz.C22908e;
import kz.C22909f;
import kz.C22910g;
import kz.C22914k;
import kz.C22915l;
import kz.C22916m;
import kz.C22919p;
import p267k.AbstractC22081b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForInstantDebitsContract;", "Lk/b;", "Lkz/b;", "Lkz/n;", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class FinancialConnectionsSheetForInstantDebitsContract extends AbstractC22081b {

    /* JADX INFO: renamed from: a */
    public final Function1 f22169a;

    public FinancialConnectionsSheetForInstantDebitsContract(Function1 intentBuilder) {
        AbstractC22676k.m65750j(intentBuilder, "intentBuilder");
        this.f22169a = intentBuilder;
    }

    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        C22905b input = (C22905b) obj;
        AbstractC22676k.m65750j(input, "input");
        return (Intent) this.f22169a.invoke(input);
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        AbstractC22911h abstractC22911h;
        if (intent == null || (abstractC22911h = (AbstractC22911h) intent.getParcelableExtra("com.stripe.android.financialconnections.ConnectionsSheetContract.extra_result")) == null) {
            return new C22916m(new IllegalArgumentException("Failed to retrieve a ConnectionsSheetResult."));
        }
        if (abstractC22911h instanceof C22908e) {
            return C22914k.f90466w;
        }
        if (abstractC22911h instanceof C22910g) {
            return new C22916m(((C22910g) abstractC22911h).f90460w);
        }
        if (!(abstractC22911h instanceof C22909f)) {
            throw new NoWhenBranchMatchedException();
        }
        C22919p c22919p = ((C22909f) abstractC22911h).f90457w;
        return c22919p == null ? new C22916m(new IllegalArgumentException("Instant debits result is missing")) : new C22915l(c22919p.f90472w, c22919p.f90473x, c22919p.f90474y, c22919p.f90475z);
    }
}
