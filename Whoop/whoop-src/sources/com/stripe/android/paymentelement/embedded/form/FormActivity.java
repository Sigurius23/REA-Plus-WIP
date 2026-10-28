package com.stripe.android.paymentelement.embedded.form;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.C1643y1;
import cz.C11217o0;
import d30.C11566v;
import k20.C22136a;
import k20.C22146k;
import l83.C23470p;
import p027b3.AbstractC2378g1;
import p108e4.AbstractC12667a;
import p179h.AbstractC16348f;
import p314m.AbstractActivityC24852m;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import t10.C33282b;
import t10.C33284d;
import t10.C33285e;
import t10.C33287g;
import t10.C33288h;
import t10.C33289i;
import t10.C33294n;
import t10.C33296p;
import t10.C33297q;
import t10.InterfaceC33299s;
import v03.C35516c;
import v03.C35518e;
import v03.InterfaceC35521h;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/stripe/android/paymentelement/embedded/form/FormActivity;", "Lm/m;", "<init>", "()V", "Lt10/j;", "state", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class FormActivity extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ int f22336G = 0;

    /* JADX INFO: renamed from: E */
    public C33285e f22337E;

    /* JADX INFO: renamed from: F */
    public C33284d f22338F;

    /* JADX INFO: renamed from: w */
    public final C23470p f22339w = AbstractC30060g.m92088H(new C33287g(this, 0));

    /* JADX INFO: renamed from: x */
    public final C1643y1 f22340x = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33294n.class), new C33289i(this, 0), new C33287g(this, 1), new C33289i(this, 1));

    /* JADX INFO: renamed from: y */
    public C11566v f22341y;

    /* JADX INFO: renamed from: z */
    public C22136a f22342z;

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        AbstractC2378g1.m7328c(this);
    }

    /* JADX INFO: renamed from: o */
    public final void m16851o(InterfaceC33299s interfaceC33299s) {
        Intent intent = getIntent();
        AbstractC22676k.m65749i(intent, "getIntent(...)");
        Intent intentPutExtra = intent.putExtra("extra_activity_result", interfaceC33299s);
        AbstractC22676k.m65749i(intentPutExtra, "putExtra(...)");
        setResult(-1, intentPutExtra);
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (((C33296p) this.f22339w.getValue()) == null) {
            m16851o(C33297q.f138864w);
            finish();
            return;
        }
        AbstractC12667a.m35444P(this);
        C33282b c33282b = ((C33294n) this.f22340x.getValue()).f138853w.f138779a;
        InterfaceC35521h interfaceC35521hM112678b = C35516c.m112678b(new C11217o0(c33282b.f138787e, c33282b.f138778Z, c33282b.f138806x, c33282b.f138785d, c33282b.f138754B, c33282b.f138807y, c33282b.f138753A, C35518e.m112679a(this), C35518e.m112679a(this), c33282b.f138781b, c33282b.f138780a0));
        this.f22341y = (C11566v) c33282b.f138755C.get();
        this.f22342z = (C22136a) c33282b.f138753A.get();
        this.f22337E = (C33285e) c33282b.f138754B.get();
        this.f22338F = (C33284d) interfaceC35521hM112678b.get();
        AbstractC16348f.m46559a(this, new C37816b(new C33288h(this, 1), true, 134179455));
    }

    @Override // p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public final void onDestroy() {
        C22136a c22136a;
        super.onDestroy();
        if (!isFinishing() || (c22136a = this.f22342z) == null) {
            return;
        }
        if (c22136a != null) {
            C22136a.m63387i(c22136a, new C22146k(2));
        } else {
            AbstractC22676k.m65757q("eventReporter");
            throw null;
        }
    }
}
