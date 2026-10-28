package com.stripe.android.payments.bankaccount.p054ui;

import a20.C0161a;
import a20.C0162b;
import a20.C0163c;
import a20.C0170j;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1565b0;
import androidx.lifecycle.C1643y1;
import aq0.C1904o;
import bc3.AbstractC3006f0;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataContract;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForInstantDebitsContract;
import e93.AbstractC12889b;
import f20.AbstractC14024c;
import f20.EnumC14023b;
import g20.C15271q;
import kz.C22913j;
import kz.InterfaceC22918o;
import l83.C23465k;
import l83.C23470p;
import p000.C12473e;
import p003a1.C0106e;
import p023ay.C2151y;
import p236j.AbstractC21065d;
import p314m.AbstractActivityC24852m;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import w10.C36689a;
import w10.C36690b;
import w10.C36691c;
import w10.InterfaceC36692d;
import y10.C39042d;
import z10.AbstractC39982e;
import z10.C39983f;
import z10.C39994q;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;", "Lm/m;", "<init>", "()V", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class CollectBankAccountActivity extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ int f22352z = 0;

    /* JADX INFO: renamed from: x */
    public InterfaceC22918o f22354x;

    /* JADX INFO: renamed from: w */
    public final C23470p f22353w = AbstractC30060g.m92088H(new C0161a(this, 0));

    /* JADX INFO: renamed from: y */
    public final C1643y1 f22355y = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C0170j.class), new C0163c(this, 0), new C0161a(this, 1), new C0163c(this, 1));

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        InterfaceC22918o c22913j;
        super.onCreate(bundle);
        C23470p c23470p = this.f22353w;
        AbstractC39982e abstractC39982e = (AbstractC39982e) c23470p.getValue();
        InterfaceC30057d interfaceC30057d = null;
        if ((abstractC39982e != null ? abstractC39982e.mo128207f() : null) == null) {
            setResult(-1, new Intent().putExtras(AbstractC12889b.m36273g(new C23465k("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_result", new C39983f(new C39994q(new IllegalStateException("Configuration not provided")))))));
            finish();
            return;
        }
        AbstractC39982e abstractC39982e2 = (AbstractC39982e) c23470p.getValue();
        if (abstractC39982e2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        EnumC14023b enumC14023bMo128208h = abstractC39982e2.mo128208h();
        if (enumC14023bMo128208h == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        InterfaceC36692d configuration = abstractC39982e2.mo128207f();
        C1643y1 c1643y1 = this.f22355y;
        C0106e c0106e = new C0106e(1, (C0170j) c1643y1.getValue(), C0170j.class, "onConnectionsForInstantDebitsResult", "onConnectionsForInstantDebitsResult(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult;)V", 0, 2);
        C0106e c0106e2 = new C0106e(1, (C0170j) c1643y1.getValue(), C0170j.class, "onConnectionsForACHResult", "onConnectionsForACHResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;)V", 0, 3);
        AbstractC22676k.m65750j(configuration, "configuration");
        if (configuration instanceof C36689a) {
            Function1 intentBuilder = AbstractC14024c.m39913a(enumC14023bMo128208h, this);
            AbstractC22676k.m65750j(intentBuilder, "intentBuilder");
            AbstractC21065d activityResultLauncher = registerForActivityResult(new FinancialConnectionsSheetForInstantDebitsContract(intentBuilder), new C15271q(c0106e, 1));
            AbstractC22676k.m65750j(activityResultLauncher, "activityResultLauncher");
            C2151y c2151y = new C2151y();
            c2151y.f8558a = activityResultLauncher;
            c22913j = c2151y;
        } else {
            if (!(configuration instanceof C36690b) && !(configuration instanceof C36691c)) {
                throw new NoWhenBranchMatchedException();
            }
            C39042d c39042d = new C39042d(c0106e2);
            Function1 intentBuilder2 = AbstractC14024c.m39913a(enumC14023bMo128208h, this);
            AbstractC22676k.m65750j(intentBuilder2, "intentBuilder");
            c22913j = new C22913j(registerForActivityResult(new FinancialConnectionsSheetForDataContract(intentBuilder2), new C1904o(c39042d, 9)));
        }
        this.f22354x = c22913j;
        C1565b0 c1565b0M5020j = AbstractC1613o1.m5020j(this);
        AbstractC3006f0.m8732z(c1565b0M5020j, null, null, new C12473e(c1565b0M5020j, new C0162b(this, interfaceC30057d, 0), (InterfaceC30057d) null), 3);
    }
}
