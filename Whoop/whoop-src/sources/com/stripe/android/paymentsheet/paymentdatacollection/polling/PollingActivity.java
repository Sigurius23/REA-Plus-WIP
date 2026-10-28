package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import a20.C0168h;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.C1643y1;
import l83.C23470p;
import p027b3.AbstractC2378g1;
import p179h.AbstractC16348f;
import p314m.AbstractActivityC24852m;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import x20.C37839g;
import x20.C37840h;
import x20.C37841i;
import x20.C37843k;
import x20.C37855w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;", "Lm/m;", "<init>", "()V", "Lx20/p;", "uiState", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class PollingActivity extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ int f22393z = 0;

    /* JADX INFO: renamed from: w */
    public final C23470p f22394w = AbstractC30060g.m92088H(new C37839g(this, 0));

    /* JADX INFO: renamed from: x */
    public final C0168h f22395x = new C0168h(new C37839g(this, 1), 13);

    /* JADX INFO: renamed from: y */
    public final C1643y1 f22396y = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37855w.class), new C37841i(this, 0), new C37839g(this, 2), new C37841i(this, 1));

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        AbstractC2378g1.m7328c(this);
    }

    /* JADX INFO: renamed from: o */
    public final C37843k m16866o() {
        return (C37843k) this.f22394w.getValue();
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        AbstractC22676k.m65749i(intent, "getIntent(...)");
        if (((C37843k) intent.getParcelableExtra("extra_args")) == null) {
            finish();
        } else {
            AbstractC29125c.m88513V(getWindow(), false);
            AbstractC16348f.m46559a(this, new C37816b(new C37840h(this, 1), true, -684927091));
        }
    }
}
