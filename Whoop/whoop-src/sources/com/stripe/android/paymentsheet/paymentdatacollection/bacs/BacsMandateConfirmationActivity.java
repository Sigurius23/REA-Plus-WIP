package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.C1643y1;
import l83.C23470p;
import o73.C27648a;
import p027b3.AbstractC2378g1;
import p098dt.AbstractC12350b;
import p108e4.AbstractC12667a;
import p179h.AbstractC16348f;
import p314m.AbstractActivityC24852m;
import p522uf.AbstractC34870c0;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import uo1.C35141b;
import v20.C35562b;
import v20.C35563c;
import v20.C35564d;
import v20.C35566f;
import v20.C35578r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationActivity;", "Lm/m;", "<init>", "()V", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class BacsMandateConfirmationActivity extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f22387y = 0;

    /* JADX INFO: renamed from: w */
    public final C23470p f22388w = AbstractC30060g.m92088H(new C35562b(this, 0));

    /* JADX INFO: renamed from: x */
    public final C1643y1 f22389x = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35578r.class), new C35564d(this, 0), new C35562b(this, 1), new C35564d(this, 1));

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        AbstractC2378g1.m7328c(this);
    }

    /* JADX INFO: renamed from: o */
    public final C35578r m16865o() {
        return (C35578r) this.f22389x.getValue();
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        AbstractC22676k.m65749i(intent, "getIntent(...)");
        Bundle extras = intent.getExtras();
        if ((extras != null ? (C35566f) AbstractC12350b.m34600u(extras, C35566f.class, "extra_activity_args") : null) == null) {
            finish();
            return;
        }
        AbstractC12667a.m35444P(this);
        C27648a.m83591n(getOnBackPressedDispatcher(), null, new C35141b(this, 5), 3);
        AbstractC34870c0.m109996f0(((C35566f) this.f22388w.getValue()).f151296E);
        AbstractC16348f.m46559a(this, new C37816b(new C35563c(this, 4), true, 1408942397));
    }
}
