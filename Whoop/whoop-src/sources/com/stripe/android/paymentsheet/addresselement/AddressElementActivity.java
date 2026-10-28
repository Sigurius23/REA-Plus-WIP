package com.stripe.android.paymentsheet.addresselement;

import a01.C0084d;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.C1643y1;
import d40.AbstractC11673r;
import h20.C16665h1;
import h40.C16845k;
import i20.C17931c;
import i20.C17943g;
import i20.C17946h;
import i20.C17967o;
import i20.C17969p;
import i20.C17975s;
import l83.C23470p;
import p023ay.C2140n;
import p027b3.AbstractC2378g1;
import p114eb.C12991u0;
import p161g.AbstractActivityC14909l;
import p163g1.C15001f;
import p179h.AbstractC16348f;
import p390p1.C28655q;
import p390p1.C28677v1;
import p522uf.AbstractC34870c0;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import pf.AbstractC29125c;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;", "Lg/l;", "<init>", "()V", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class AddressElementActivity extends AbstractActivityC14909l {

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ int f22374z = 0;

    /* JADX INFO: renamed from: w */
    public final C17967o f22375w = new C17967o(new C17931c(this, 0), new C17931c(this, 1));

    /* JADX INFO: renamed from: x */
    public final C1643y1 f22376x = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17969p.class), new C17943g(this, 0), new C17931c(this, 2), new C17943g(this, 1));

    /* JADX INFO: renamed from: y */
    public final C23470p f22377y = AbstractC30060g.m92088H(new C17931c(this, 3));

    /* JADX INFO: renamed from: n */
    public static final C17969p m16862n(AddressElementActivity addressElementActivity) {
        return (C17969p) addressElementActivity.f22376x.getValue();
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        AbstractC2378g1.m7328c(this);
    }

    /* JADX INFO: renamed from: m */
    public final void m16863m(C16845k c16845k, C12991u0 c12991u0, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1137646869);
        if ((((c28655q.m87157i(c16845k) ? 4 : 2) | i13 | (c28655q.m87157i(c12991u0) ? 32 : 16) | (c28655q.m87157i(this) ? 256 : 128)) & 147) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            AbstractC11673r.m31072a(null, null, null, null, null, null, null, AbstractC37817c.m121344e(-1539938881, c28655q, new C15001f(c16845k, this, c12991u0, 4)), c28655q, 12582912, 127);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0084d(this, c16845k, c12991u0, i13, 24);
        }
    }

    @Override // p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C16665h1 c16665h1;
        super.onCreate(bundle);
        C17946h c17946h = (C17946h) this.f22377y.getValue();
        if (c17946h == null) {
            finish();
            return;
        }
        AbstractC29125c.m88513V(getWindow(), false);
        C17975s c17975s = c17946h.f69728x;
        if (c17975s != null && (c16665h1 = c17975s.f69804w) != null) {
            AbstractC34870c0.m109996f0(c16665h1);
        }
        AbstractC16348f.m46559a(this, new C37816b(new C2140n(this, 5), true, 1953035352));
    }
}
