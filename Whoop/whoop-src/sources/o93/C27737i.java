package o93;

import c93.InterfaceC4339a;

/* JADX INFO: renamed from: o93.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C27737i implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f111794w;

    /* JADX INFO: renamed from: x */
    public final EnumC27738j f111795x;

    public /* synthetic */ C27737i(EnumC27738j enumC27738j, int i13) {
        this.f111794w = i13;
        this.f111795x = enumC27738j;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f111794w) {
            case 0:
                return AbstractC27742n.f111886k.m113788a(this.f111795x.f111806w);
            default:
                return AbstractC27742n.f111886k.m113788a(this.f111795x.f111807x);
        }
    }
}
