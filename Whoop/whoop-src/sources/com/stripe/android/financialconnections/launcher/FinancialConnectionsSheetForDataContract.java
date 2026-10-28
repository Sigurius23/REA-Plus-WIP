package com.stripe.android.financialconnections.launcher;

import android.content.Context;
import android.content.Intent;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import kz.AbstractC22911h;
import kz.C22904a;
import kz.C22908e;
import kz.C22909f;
import kz.C22910g;
import p266jz.C22064l;
import p266jz.C22065m;
import p266jz.C22066n;
import p267k.AbstractC22081b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForDataContract;", "Lk/b;", "Lkz/a;", "Ljz/o;", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class FinancialConnectionsSheetForDataContract extends AbstractC22081b {

    /* JADX INFO: renamed from: a */
    public final Function1 f22168a;

    public FinancialConnectionsSheetForDataContract(Function1 intentBuilder) {
        AbstractC22676k.m65750j(intentBuilder, "intentBuilder");
        this.f22168a = intentBuilder;
    }

    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        C22904a input = (C22904a) obj;
        AbstractC22676k.m65750j(input, "input");
        return (Intent) this.f22168a.invoke(input);
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        AbstractC22911h abstractC22911h;
        if (i13 != 0) {
            if (intent == null || (abstractC22911h = (AbstractC22911h) intent.getParcelableExtra("com.stripe.android.financialconnections.ConnectionsSheetContract.extra_result")) == null) {
                return new C22066n(new IllegalArgumentException("Failed to retrieve a ConnectionsSheetResult."));
            }
            if (!(abstractC22911h instanceof C22908e)) {
                if (abstractC22911h instanceof C22910g) {
                    return new C22066n(((C22910g) abstractC22911h).f90460w);
                }
                if (!(abstractC22911h instanceof C22909f)) {
                    throw new NoWhenBranchMatchedException();
                }
                FinancialConnectionsSession financialConnectionsSession = ((C22909f) abstractC22911h).f90458x;
                return financialConnectionsSession == null ? new C22066n(new IllegalArgumentException("financialConnectionsSession not set.")) : new C22065m(financialConnectionsSession);
            }
        }
        return C22064l.f85576w;
    }
}
