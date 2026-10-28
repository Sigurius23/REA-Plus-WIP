package kf0;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p292l1.C23117j2;
import p292l1.C23123k2;
import p292l1.C23196w3;
import p292l1.EnumC23202x3;
import tg2.AbstractC33790d;

/* JADX INFO: renamed from: kf0.g */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C22432g implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f87763w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC2994c0 f87764x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f87765y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C23196w3 f87766z;

    public /* synthetic */ C22432g(InterfaceC2994c0 interfaceC2994c0, InterfaceC4339a interfaceC4339a, C23196w3 c23196w3, int i13) {
        this.f87763w = i13;
        this.f87764x = interfaceC2994c0;
        this.f87765y = interfaceC4339a;
        this.f87766z = c23196w3;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f87763w) {
            case 0:
                return AbstractC22433h.m64685D(this.f87764x, this.f87765y, this.f87766z);
            case 1:
                return AbstractC22433h.m64683B(this.f87764x, this.f87765y, this.f87766z);
            case 2:
                C23196w3 c23196w3 = this.f87766z;
                if (((Boolean) c23196w3.f91787e.f97544d.invoke(EnumC23202x3.f91820w)).booleanValue()) {
                    AbstractC3006f0.m8732z(this.f87764x, null, null, new C23123k2(c23196w3, null, 3), 3).invokeOnCompletion(new C23117j2(c23196w3, this.f87765y, 0));
                }
                return C23454a0.f92919a;
            case 3:
                C23196w3 c23196w4 = this.f87766z;
                int iOrdinal = c23196w4.m67151c().ordinal();
                if (iOrdinal != 1) {
                    InterfaceC2994c0 interfaceC2994c0 = this.f87764x;
                    if (iOrdinal != 2) {
                        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C23123k2(c23196w4, null, 5), 3);
                    } else {
                        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C23123k2(c23196w4, null, 4), 3);
                    }
                } else {
                    this.f87765y.invoke();
                }
                return C23454a0.f92919a;
            case 4:
                return AbstractC33790d.m106866m(this.f87764x, this.f87766z, this.f87765y);
            default:
                return AbstractC33790d.m106870q(this.f87764x, this.f87766z, this.f87765y);
        }
    }

    public /* synthetic */ C22432g(InterfaceC2994c0 interfaceC2994c0, C23196w3 c23196w3, InterfaceC4339a interfaceC4339a, int i13) {
        this.f87763w = i13;
        this.f87764x = interfaceC2994c0;
        this.f87766z = c23196w3;
        this.f87765y = interfaceC4339a;
    }

    public /* synthetic */ C22432g(C23196w3 c23196w3, InterfaceC2994c0 interfaceC2994c0, InterfaceC4339a interfaceC4339a) {
        this.f87763w = 2;
        this.f87766z = c23196w3;
        this.f87764x = interfaceC2994c0;
        this.f87765y = interfaceC4339a;
    }

    public /* synthetic */ C22432g(C23196w3 c23196w3, InterfaceC4339a interfaceC4339a, InterfaceC2994c0 interfaceC2994c0) {
        this.f87763w = 3;
        this.f87766z = c23196w3;
        this.f87765y = interfaceC4339a;
        this.f87764x = interfaceC2994c0;
    }
}
