package com.stripe.android.customersheet;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.C1643y1;
import cz.AbstractC11239z0;
import cz.C11192c;
import cz.C11196e;
import cz.C11198f;
import cz.C11200g;
import cz.C11215n0;
import cz.C11237y0;
import e93.AbstractC12889b;
import l83.C23465k;
import l83.C23470p;
import p027b3.AbstractC2378g1;
import p179h.AbstractC16348f;
import p314m.AbstractActivityC24852m;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import pf.AbstractC29125c;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/stripe/android/customersheet/CustomerSheetActivity;", "Lm/m;", "<init>", "()V", "Lcz/z0;", "result", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class CustomerSheetActivity extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ int f22164z = 0;

    /* JADX INFO: renamed from: w */
    public final C23470p f22165w = AbstractC30060g.m92088H(new C11192c(this, 0));

    /* JADX INFO: renamed from: x */
    public final C11192c f22166x = new C11192c(this, 1);

    /* JADX INFO: renamed from: y */
    public final C1643y1 f22167y = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C11215n0.class), new C11198f(this, 0), new C11192c(this, 2), new C11198f(this, 1));

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        AbstractC2378g1.m7328c(this);
    }

    /* JADX INFO: renamed from: o */
    public final void m16836o(AbstractC11239z0 abstractC11239z0) {
        Intent intent = new Intent();
        abstractC11239z0.getClass();
        setResult(-1, intent.putExtras(AbstractC12889b.m36273g(new C23465k("extra_activity_result", abstractC11239z0))));
        finish();
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC29125c.m88513V(getWindow(), false);
        if (((C11200g) this.f22165w.getValue()) == null) {
            m16836o(new C11237y0(new IllegalStateException("No CustomerSheetContract.Args provided")));
        } else {
            m16837p().f35967P.m35250f(this, this);
            AbstractC16348f.m46559a(this, new C37816b(new C11196e(this, 2), true, 602239828));
        }
    }

    /* JADX INFO: renamed from: p */
    public final C11215n0 m16837p() {
        return (C11215n0) this.f22167y.getValue();
    }
}
