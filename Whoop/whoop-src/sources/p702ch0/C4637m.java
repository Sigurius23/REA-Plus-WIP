package p702ch0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import l83.InterfaceC23462h;
import nl0.C26805g;
import p163g1.C15199y3;
import p390p1.InterfaceC28670t2;
import p636y3.InterfaceC39171c;
import p734sl0.C32645n0;

/* JADX INFO: renamed from: ch0.m */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C4637m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18758w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f18759x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f18760y;

    public /* synthetic */ C4637m(int i13, Object obj, Object obj2) {
        this.f18758w = i13;
        this.f18759x = obj;
        this.f18760y = obj2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f18758w) {
            case 0:
                return AbstractC4639n.a.m14523h((C26805g) this.f18759x, (C4656v0) this.f18760y);
            case 1:
                return Float.valueOf(Function1.h.m14458h((InterfaceC28670t2) this.f18759x, (InterfaceC39171c) this.f18760y));
            case 2:
                return AbstractC4646q0.h.m14613h((C4642o0) this.f18759x, (InterfaceC28670t2) this.f18760y);
            case 3:
                return AbstractC4610c1.m.m14375l((C4656v0) this.f18760y, (InterfaceC4339a) this.f18759x);
            case 4:
                return AbstractC4658w0.m14722s((C32645n0) this.f18759x, (InterfaceC23462h) this.f18760y);
            default:
                return AbstractC4610c1.m14330A((InterfaceC2994c0) this.f18759x, (C15199y3) this.f18760y);
        }
    }

    public /* synthetic */ C4637m(C4656v0 c4656v0, InterfaceC4339a interfaceC4339a) {
        this.f18758w = 3;
        this.f18760y = c4656v0;
        this.f18759x = interfaceC4339a;
    }
}
