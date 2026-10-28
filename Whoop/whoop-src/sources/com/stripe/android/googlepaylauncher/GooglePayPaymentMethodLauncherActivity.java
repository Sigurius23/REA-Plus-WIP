package com.stripe.android.googlepaylauncher;

import a20.C0168h;
import al0.C0971f;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1643y1;
import aq0.C1904o;
import b10.C2222b;
import b20.C2326f;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import c93.InterfaceC4339a;
import com.google.android.gms.wallet.contract.TaskResultContracts$GetPaymentDataResult;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity;
import e93.AbstractC12889b;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23465k;
import l83.C23470p;
import m83.C25235a0;
import n43.C26285a;
import p027b3.AbstractC2378g1;
import p236j.AbstractC21065d;
import p314m.AbstractActivityC24852m;
import p442qy.C30766e;
import p664yy.C39865j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import s93.AbstractC32309k;
import sz.AbstractC33132g0;
import sz.C33130f0;
import sz.C33138j0;
import sz.C33140k0;
import sz.C33142l0;
import sz.C33150p0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity;", "Lm/m;", "<init>", "()V", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class GooglePayPaymentMethodLauncherActivity extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ int f22188z = 0;

    /* JADX INFO: renamed from: w */
    public final C1643y1 f22189w;

    /* JADX INFO: renamed from: x */
    public final C23470p f22190x;

    /* JADX INFO: renamed from: y */
    public C33142l0 f22191y;

    public GooglePayPaymentMethodLauncherActivity() {
        final int i13 = 0;
        this.f22189w = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33150p0.class), new C33140k0(this, 0), new InterfaceC4339a(this) { // from class: sz.i0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ GooglePayPaymentMethodLauncherActivity f138202x;

            {
                this.f138202x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i14 = i13;
                GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity = this.f138202x;
                switch (i14) {
                    case 0:
                        C33142l0 c33142l0 = googlePayPaymentMethodLauncherActivity.f22191y;
                        if (c33142l0 != null) {
                            return new C0168h(c33142l0);
                        }
                        AbstractC22676k.m65757q("args");
                        throw null;
                    default:
                        int i15 = GooglePayPaymentMethodLauncherActivity.f22188z;
                        Context applicationContext = googlePayPaymentMethodLauncherActivity.getApplicationContext();
                        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
                        C22365e c22365e = AbstractC3050q0.f12077a;
                        ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
                        AbstractC32309k.m100574c(executorC22364d);
                        return new C2326f(new C39865j(C30766e.f126697b, executorC22364d), new C2222b(applicationContext, C25235a0.f99113w, new C0971f(applicationContext, 1)));
                }
            }
        }, new C33140k0(this, 1));
        final int i14 = 1;
        this.f22190x = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: sz.i0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ GooglePayPaymentMethodLauncherActivity f138202x;

            {
                this.f138202x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i15 = i14;
                GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity = this.f138202x;
                switch (i15) {
                    case 0:
                        C33142l0 c33142l0 = googlePayPaymentMethodLauncherActivity.f22191y;
                        if (c33142l0 != null) {
                            return new C0168h(c33142l0);
                        }
                        AbstractC22676k.m65757q("args");
                        throw null;
                    default:
                        int i16 = GooglePayPaymentMethodLauncherActivity.f22188z;
                        Context applicationContext = googlePayPaymentMethodLauncherActivity.getApplicationContext();
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
    public final void m16843o(AbstractC33132g0 abstractC33132g0) {
        setResult(-1, new Intent().putExtras(AbstractC12889b.m36273g(new C23465k("extra_result", abstractC33132g0))));
        finish();
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC2378g1.m7328c(this);
        Intent intent = getIntent();
        AbstractC22676k.m65749i(intent, "getIntent(...)");
        C33142l0 c33142l0 = (C33142l0) intent.getParcelableExtra("extra_args");
        if (c33142l0 == null) {
            m16843o(new C33130f0(2, new RuntimeException("GooglePayPaymentMethodLauncherActivity was started without arguments.")));
            return;
        }
        this.f22191y = c33142l0;
        InterfaceC30057d interfaceC30057d = null;
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C33138j0(this, interfaceC30057d, 0), 3);
        AbstractC21065d abstractC21065dRegisterForActivityResult = registerForActivityResult(new TaskResultContracts$GetPaymentDataResult(), new C1904o(this, 15));
        if (AbstractC22676k.m65745e(m16844p().f138244G.m5001b("has_launched"), Boolean.TRUE)) {
            return;
        }
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C26285a(this, abstractC21065dRegisterForActivityResult, interfaceC30057d, 21), 3);
    }

    /* JADX INFO: renamed from: p */
    public final C33150p0 m16844p() {
        return (C33150p0) this.f22189w.getValue();
    }
}
