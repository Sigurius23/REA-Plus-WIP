package bm2;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import p163g1.C15199y3;
import p707gt1.AbstractC16200n;
import wo1.AbstractC37458l;

/* JADX INFO: renamed from: bm2.v */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3478v implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13658w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f13659x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC2994c0 f13660y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C15199y3 f13661z;

    public /* synthetic */ C3478v(InterfaceC2994c0 interfaceC2994c0, InterfaceC4339a interfaceC4339a, C15199y3 c15199y3) {
        this.f13658w = 3;
        this.f13660y = interfaceC2994c0;
        this.f13659x = interfaceC4339a;
        this.f13661z = c15199y3;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f13658w) {
            case 0:
                return AbstractC3436e0.m10008p0(this.f13660y, this.f13661z, this.f13659x);
            case 1:
                return AbstractC16200n.m45841w(this.f13659x, this.f13660y, this.f13661z);
            case 2:
                return AbstractC16200n.m45814E(this.f13660y, this.f13661z, this.f13659x);
            default:
                return AbstractC37458l.m120013k(this.f13660y, this.f13659x, this.f13661z);
        }
    }

    public /* synthetic */ C3478v(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC4339a interfaceC4339a, int i13) {
        this.f13658w = i13;
        this.f13660y = interfaceC2994c0;
        this.f13661z = c15199y3;
        this.f13659x = interfaceC4339a;
    }

    public /* synthetic */ C3478v(InterfaceC4339a interfaceC4339a, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3) {
        this.f13658w = 1;
        this.f13659x = interfaceC4339a;
        this.f13660y = interfaceC2994c0;
        this.f13661z = c15199y3;
    }
}
