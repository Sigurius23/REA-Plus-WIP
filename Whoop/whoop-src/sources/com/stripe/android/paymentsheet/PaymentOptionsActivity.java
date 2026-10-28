package com.stripe.android.paymentsheet;

import a20.C0168h;
import android.os.Bundle;
import androidx.lifecycle.C1643y1;
import b30.AbstractActivityC2546j;
import e10.C12566q0;
import g40.C15352f4;
import h20.C16652f0;
import h20.C16658g0;
import h20.C16676j0;
import h20.C16682k0;
import h20.C16754w0;
import l83.C23470p;
import p095dp.AbstractC12240d;
import p179h.AbstractC16348f;
import p522uf.AbstractC34870c0;
import p599wz.C37751r0;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import q83.AbstractC30060g;
import v10.C35540p;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;", "Lb30/j;", "Lh20/n0;", "<init>", "()V", "", "isProcessing", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class PaymentOptionsActivity extends AbstractActivityC2546j {

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ int f22366z = 0;

    /* JADX INFO: renamed from: w */
    public final C0168h f22367w = new C0168h(new C16658g0(this, 0), 4);

    /* JADX INFO: renamed from: x */
    public final C1643y1 f22368x = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C16754w0.class), new C16682k0(this, 0), new C16658g0(this, 1), new C16682k0(this, 1));

    /* JADX INFO: renamed from: y */
    public final C23470p f22369y = AbstractC30060g.m92088H(new C16658g0(this, 2));

    @Override // b30.AbstractActivityC2546j, androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C16652f0 c16652f0 = (C16652f0) this.f22369y.getValue();
        if (c16652f0 == null) {
            finish();
            return;
        }
        AbstractC34870c0.m109996f0(c16652f0.f64031x.f64405H);
        if (!AbstractC12240d.m34077n(this)) {
            mo7466o().f43021Y.m63401a();
        }
        C16754w0 c16754w0Mo7466o = mo7466o();
        c16754w0Mo7466o.f43006J.m51593a(this, this);
        C37751r0 c37751r0 = c16754w0Mo7466o.f64347f0;
        C15352f4 c15352f4 = new C15352f4(1, c16754w0Mo7466o, C16754w0.class, "onLinkAuthenticationResult", "onLinkAuthenticationResult(Lcom/stripe/android/link/LinkActivityResult;)V", 0, 4);
        c37751r0.getClass();
        c37751r0.f161719e = registerForActivityResult(c37751r0.f161716b, new C35540p(2, c37751r0, c15352f4));
        getLifecycle().mo4986a(new C12566q0(c16754w0Mo7466o, 3));
        AbstractC16348f.m46559a(this, new C37816b(new C16676j0(this, 2), true, -1719713842));
    }

    @Override // b30.AbstractActivityC2546j
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final C16754w0 mo7466o() {
        return (C16754w0) this.f22368x.getValue();
    }
}
