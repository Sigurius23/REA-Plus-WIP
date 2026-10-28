package cp0;

import c93.InterfaceC4339a;

/* JADX INFO: renamed from: cp0.j */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C10968j implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f34072w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f34073x;

    public /* synthetic */ C10968j(InterfaceC4339a interfaceC4339a, int i13) {
        this.f34072w = i13;
        this.f34073x = interfaceC4339a;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f34072w) {
            case 0:
                return AbstractC10971k.m29227i(this.f34073x);
            case 1:
                return AbstractC10971k.m29230l(this.f34073x);
            case 2:
                return AbstractC11009x0.m29519r0(this.f34073x);
            default:
                return AbstractC11009x0.m29445P(this.f34073x);
        }
    }
}
