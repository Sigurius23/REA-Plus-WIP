package bs1;

import c93.InterfaceC4339a;
import p390p1.InterfaceC28601c1;
import v41.AbstractC35664f;

/* JADX INFO: renamed from: bs1.q */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C3598q implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14604w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f14605x;

    public /* synthetic */ C3598q(Object obj, int i13) {
        this.f14604w = i13;
        this.f14605x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f14604w) {
            case 0:
                return AbstractC3583c0.m10828d2((InterfaceC28601c1) this.f14605x);
            case 1:
                return AbstractC3583c0.m10749E1((InterfaceC28601c1) this.f14605x);
            default:
                return AbstractC3583c0.h.m10918h((AbstractC35664f.a) this.f14605x);
        }
    }
}
