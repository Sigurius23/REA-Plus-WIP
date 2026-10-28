package p710im1;

import bm.C3396t;
import c93.InterfaceC4339a;
import p390p1.InterfaceC28601c1;

/* JADX INFO: renamed from: im1.b1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18660b1 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73220w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f73221x;

    public /* synthetic */ C18660b1(Object obj, int i13) {
        this.f73220w = i13;
        this.f73221x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f73220w) {
            case 0:
                return Integer.valueOf(AbstractC18657a1.c.m54114h((C3396t) this.f73221x));
            case 1:
                return AbstractC18682m.m54250m((InterfaceC4339a) this.f73221x);
            default:
                return AbstractC18697t0.m54304W0((InterfaceC28601c1) this.f73221x);
        }
    }
}
