package bp0;

import c93.InterfaceC4339a;
import cp0.C10998t;
import p390p1.InterfaceC28601c1;
import p702ch0.C4656v0;

/* JADX INFO: renamed from: bp0.u */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3533u implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14167w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f14168x;

    public /* synthetic */ C3533u(Object obj, int i13) {
        this.f14167w = i13;
        this.f14168x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f14167w) {
            case 0:
                return AbstractC3531s.r.m10544h((C10998t) this.f14168x);
            case 1:
                return AbstractC3531s.m10429K0((C4656v0) this.f14168x);
            default:
                return AbstractC3531s.m10529x0((InterfaceC28601c1) this.f14168x);
        }
    }
}
