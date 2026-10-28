package p717lq2;

import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import p390p1.InterfaceC28601c1;
import p409q0.C29690n;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lq2.q */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C24685q implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f96577w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f96578x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f96579y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f96580z;

    public /* synthetic */ C24685q(InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        this.f96580z = interfaceC4339a;
        this.f96578x = interfaceC28601c1;
        this.f96579y = interfaceC28601c2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f96577w) {
            case 0:
                return AbstractC24686r.m72205a0(this.f96580z, this.f96578x, this.f96579y);
            default:
                return new C29690n((InterfaceC4352n) this.f96578x.getValue(), (Function1) this.f96579y.getValue(), ((Number) this.f96580z.invoke()).intValue());
        }
    }

    public /* synthetic */ C24685q(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC4339a interfaceC4339a) {
        this.f96578x = interfaceC28601c1;
        this.f96579y = interfaceC28601c2;
        this.f96580z = interfaceC4339a;
    }
}
