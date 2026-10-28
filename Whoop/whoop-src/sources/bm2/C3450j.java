package bm2;

import c93.InterfaceC4339a;

/* JADX INFO: renamed from: bm2.j */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3450j implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13533w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f13534x;

    public /* synthetic */ C3450j(InterfaceC4339a interfaceC4339a, int i13) {
        this.f13533w = i13;
        this.f13534x = interfaceC4339a;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f13533w) {
            case 0:
                return AbstractC3459m.m10147o(this.f13534x);
            case 1:
                return AbstractC3459m.m10143k(this.f13534x);
            case 2:
                return AbstractC3442g0.m10062r(this.f13534x);
            default:
                return AbstractC3442g0.m10056l(this.f13534x);
        }
    }
}
