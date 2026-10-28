package com.stripe.android.googlepaylauncher;

import al0.C0971f;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1643y1;
import aq0.C1904o;
import b10.C2222b;
import b20.C2326f;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import c93.InterfaceC4339a;
import com.google.android.gms.wallet.contract.TaskResultContracts$GetPaymentDataResult;
import com.stripe.android.googlepaylauncher.GooglePayLauncherActivity;
import e93.AbstractC12889b;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23465k;
import l83.C23468n;
import l83.C23470p;
import m83.C25235a0;
import n20.C26185t;
import p027b3.AbstractC2378g1;
import p314m.AbstractActivityC24852m;
import p328mj.C25595b;
import p442qy.C30766e;
import p505ts.AbstractC34132o;
import p664yy.C39865j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import s93.AbstractC32309k;
import sz.AbstractC33147o;
import sz.AbstractC33155t;
import sz.C33145n;
import sz.C33151q;
import sz.C33153r;
import sz.C33154s;
import sz.C33161z;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;", "Lm/m;", "<init>", "()V", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class GooglePayLauncherActivity extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ int f22184z = 0;

    /* JADX INFO: renamed from: w */
    public final C1643y1 f22185w;

    /* JADX INFO: renamed from: x */
    public final C23470p f22186x;

    /* JADX INFO: renamed from: y */
    public AbstractC33155t f22187y;

    public GooglePayLauncherActivity() {
        final int i13 = 0;
        this.f22185w = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33161z.class), new C33154s(this, 0), new InterfaceC4339a(this) { // from class: sz.p

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ GooglePayLauncherActivity f138241x;

            {
                this.f138241x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i14 = i13;
                GooglePayLauncherActivity googlePayLauncherActivity = this.f138241x;
                switch (i14) {
                    case 0:
                        AbstractC33155t abstractC33155t = googlePayLauncherActivity.f22187y;
                        if (abstractC33155t != null) {
                            return new C26185t(abstractC33155t);
                        }
                        AbstractC22676k.m65757q("args");
                        throw null;
                    default:
                        int i15 = GooglePayLauncherActivity.f22184z;
                        Context applicationContext = googlePayLauncherActivity.getApplicationContext();
                        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
                        C22365e c22365e = AbstractC3050q0.f12077a;
                        ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
                        AbstractC32309k.m100574c(executorC22364d);
                        return new C2326f(new C39865j(C30766e.f126697b, executorC22364d), new C2222b(applicationContext, C25235a0.f99113w, new C0971f(applicationContext, 1)));
                }
            }
        }, new C33154s(this, 1));
        final int i14 = 1;
        this.f22186x = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: sz.p

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ GooglePayLauncherActivity f138241x;

            {
                this.f138241x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i15 = i14;
                GooglePayLauncherActivity googlePayLauncherActivity = this.f138241x;
                switch (i15) {
                    case 0:
                        AbstractC33155t abstractC33155t = googlePayLauncherActivity.f22187y;
                        if (abstractC33155t != null) {
                            return new C26185t(abstractC33155t);
                        }
                        AbstractC22676k.m65757q("args");
                        throw null;
                    default:
                        int i16 = GooglePayLauncherActivity.f22184z;
                        Context applicationContext = googlePayLauncherActivity.getApplicationContext();
                        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
                        C22365e c22365e = AbstractC3050q0.f12077a;
                        ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
                        AbstractC32309k.m100574c(executorC22364d);
                        return new C2326f(new C39865j(C30766e.f126697b, executorC22364d), new C2222b(applicationContext, C25235a0.f99113w, new C0971f(applicationContext, 1)));
                }
            }
        });
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        AbstractC2378g1.m7328c(this);
    }

    /* JADX INFO: renamed from: o */
    public final void m16841o(AbstractC33147o abstractC33147o) {
        setResult(-1, new Intent().putExtras(AbstractC12889b.m36273g(new C23465k("extra_result", abstractC33147o))));
        finish();
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, android.app.Activity
    public final void onActivityResult(int i13, int i14, Intent intent) {
        super.onActivityResult(i13, i14, intent);
        switch (i13) {
            case 50000:
            case 50001:
                C33161z c33161zM16842p = m16842p();
                if (intent == null) {
                    intent = new Intent();
                }
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c33161zM16842p), c33161zM16842p.f138285J, null, new C25595b(c33161zM16842p, i13, intent, null, 2), 2);
                break;
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object objM107888l;
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            AbstractC22676k.m65749i(intent, "getIntent(...)");
            objM107888l = (AbstractC33155t) intent.getParcelableExtra("extra_args");
            if (objM107888l == null) {
                throw new IllegalArgumentException("GooglePayLauncherActivity was started without arguments.");
            }
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            m16841o(new C33145n(thM68037a));
            return;
        }
        this.f22187y = (AbstractC33155t) objM107888l;
        InterfaceC30057d interfaceC30057d = null;
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C33151q(this, interfaceC30057d, 0), 3);
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C33153r(this, registerForActivityResult(new TaskResultContracts$GetPaymentDataResult(), new C1904o(this, 14)), interfaceC30057d, 1), 3);
    }

    /* JADX INFO: renamed from: p */
    public final C33161z m16842p() {
        return (C33161z) this.f22185w.getValue();
    }
}
