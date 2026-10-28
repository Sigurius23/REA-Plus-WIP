package cp0;

import c93.InterfaceC4339a;
import kd1.AbstractC22390d;
import p390p1.InterfaceC28601c1;
import p710im1.AbstractC18672h;
import p717lq2.AbstractC24680l;
import p717lq2.AbstractC24686r;
import w31.AbstractC36791e;
import wi0.AbstractC37313e;
import yn2.AbstractC39675b;

/* JADX INFO: renamed from: cp0.t0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C10999t0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f34397w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f34398x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f34399y;

    public /* synthetic */ C10999t0(InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1) {
        this.f34397w = 1;
        this.f34398x = interfaceC28601c1;
        this.f34399y = interfaceC4339a;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f34397w) {
            case 0:
                return AbstractC11009x0.m29446P0(this.f34399y, this.f34398x);
            case 1:
                return AbstractC18672h.m54210i(this.f34398x, this.f34399y);
            case 2:
                return AbstractC22390d.m64429u(this.f34399y, this.f34398x);
            case 3:
                return AbstractC24680l.m72118s(this.f34399y, this.f34398x);
            case 4:
                return AbstractC24686r.m72211d0(this.f34399y, this.f34398x);
            case 5:
                return AbstractC36791e.m117907s(this.f34399y, this.f34398x);
            case 6:
                return AbstractC37313e.m119529y(this.f34399y, this.f34398x);
            default:
                return AbstractC39675b.m126892p(this.f34399y, this.f34398x);
        }
    }

    public /* synthetic */ C10999t0(InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1, int i13) {
        this.f34397w = i13;
        this.f34399y = interfaceC4339a;
        this.f34398x = interfaceC28601c1;
    }
}
