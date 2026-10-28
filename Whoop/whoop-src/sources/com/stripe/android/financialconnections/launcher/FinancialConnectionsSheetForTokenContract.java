package com.stripe.android.financialconnections.launcher;

import android.content.Context;
import android.content.Intent;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import kz.AbstractC22911h;
import kz.C22906c;
import kz.C22908e;
import kz.C22909f;
import kz.C22910g;
import p266jz.C22059g;
import p266jz.C22061i;
import p266jz.C22062j;
import p267k.AbstractC22081b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38842g8;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenContract;", "Lk/b;", "Lkz/c;", "Ljz/k;", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class FinancialConnectionsSheetForTokenContract extends AbstractC22081b {
    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        C22906c input = (C22906c) obj;
        AbstractC22676k.m65750j(input, "input");
        throw null;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        AbstractC22911h abstractC22911h;
        if (intent == null || (abstractC22911h = (AbstractC22911h) intent.getParcelableExtra("com.stripe.android.financialconnections.ConnectionsSheetContract.extra_result")) == null) {
            return new C22062j(new IllegalArgumentException("Failed to retrieve a ConnectionsSheetResult."));
        }
        if (abstractC22911h instanceof C22908e) {
            return C22059g.f85571w;
        }
        if (abstractC22911h instanceof C22910g) {
            return new C22062j(((C22910g) abstractC22911h).f90460w);
        }
        if (!(abstractC22911h instanceof C22909f)) {
            throw new NoWhenBranchMatchedException();
        }
        C22909f c22909f = (C22909f) abstractC22911h;
        FinancialConnectionsSession financialConnectionsSession = c22909f.f90458x;
        if (financialConnectionsSession == null) {
            return new C22062j(new IllegalArgumentException("FinancialConnectionsSession is not set"));
        }
        C38842g8 c38842g8 = c22909f.f90459y;
        return c38842g8 == null ? new C22062j(new IllegalArgumentException("PaymentAccount is not set on FinancialConnectionsSession")) : new C22061i(financialConnectionsSession, c38842g8);
    }
}
