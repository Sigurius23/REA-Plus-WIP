package com.stripe.android.paymentsheet.addresselement;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.C1643y1;
import e93.AbstractC12889b;
import i20.AbstractC17941f0;
import i20.C17932c0;
import i20.C17935d0;
import i20.C17982v0;
import i20.C17983w;
import i20.C17987y;
import i20.InterfaceC17929b0;
import l83.C23465k;
import l83.C23470p;
import p163g1.C15001f;
import p179h.AbstractC16348f;
import p314m.AbstractActivityC24852m;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import pf.AbstractC29125c;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;", "Lm/m;", "<init>", "()V", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class AutocompleteActivity extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f22378y = 0;

    /* JADX INFO: renamed from: w */
    public final C23470p f22379w = AbstractC30060g.m92088H(new C17983w(this, 0));

    /* JADX INFO: renamed from: x */
    public final C1643y1 f22380x = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17982v0.class), new C17987y(this, 0), new C17983w(this, 1), new C17987y(this, 1));

    /* JADX INFO: renamed from: o */
    public final void m16864o(AbstractC17941f0 abstractC17941f0) {
        setResult(-1, new Intent().putExtras(AbstractC12889b.m36273g(new C23465k("com.stripe.android.paymentsheet.addresselement.AutocompleteContract.extra_result", abstractC17941f0))));
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C17932c0 c17932c0 = (C17932c0) this.f22379w.getValue();
        if (c17932c0 == null) {
            finish();
            return;
        }
        AbstractC29125c.m88513V(getWindow(), false);
        InterfaceC17929b0 interfaceC17929b0 = c17932c0.f69695z;
        interfaceC17929b0.mo51569e0();
        AbstractC16348f.m46559a(this, new C37816b(new C15001f(this, c17932c0, interfaceC17929b0, 6), true, -854911592));
    }

    @Override // p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public final void onStop() {
        String str;
        super.onStop();
        if (isFinishing() || isChangingConfigurations()) {
            return;
        }
        C17932c0 c17932c0 = (C17932c0) this.f22379w.getValue();
        if (c17932c0 == null || (str = c17932c0.f69692w) == null) {
            str = "";
        }
        m16864o(new C17935d0(str, null));
        finish();
    }
}
