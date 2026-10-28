package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.C1643y1;
import l83.C23470p;
import p027b3.AbstractC2378g1;
import p098dt.AbstractC12350b;
import p179h.AbstractC16348f;
import p314m.AbstractActivityC24852m;
import p522uf.AbstractC34870c0;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import w20.C36717g;
import w20.C36718h;
import w20.C36719i;
import w20.C36721k;
import w20.C36734x;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionActivity;", "Lm/m;", "<init>", "()V", "Lw20/y;", "state", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class CvcRecollectionActivity extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f22390y = 0;

    /* JADX INFO: renamed from: w */
    public final C23470p f22391w = AbstractC30060g.m92088H(new C36717g(this, 0));

    /* JADX INFO: renamed from: x */
    public final C1643y1 f22392x = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C36734x.class), new C36719i(this, 0), new C36717g(this, 1), new C36719i(this, 1));

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        AbstractC2378g1.m7328c(this);
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        AbstractC22676k.m65749i(intent, "getIntent(...)");
        Bundle extras = intent.getExtras();
        if ((extras != null ? (C36721k) AbstractC12350b.m34600u(extras, C36721k.class, "extra_activity_args") : null) == null) {
            finish();
        } else {
            AbstractC34870c0.m109996f0(((C36721k) this.f22391w.getValue()).f157208y);
            AbstractC16348f.m46559a(this, new C37816b(new C36718h(this, 1), true, 1759306475));
        }
    }
}
