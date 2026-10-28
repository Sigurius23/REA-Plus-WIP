package p163g1;

import bc3.C3033m;
import c93.InterfaceC4339a;
import l83.C23454a0;

/* JADX INFO: renamed from: g1.i6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15041i6 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56307w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15072l6 f56308x;

    public /* synthetic */ C15041i6(C15072l6 c15072l6, int i13) {
        this.f56307w = i13;
        this.f56308x = c15072l6;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f56307w) {
            case 0:
                C3033m c3033m = this.f56308x.f56433d;
                if (c3033m.isActive()) {
                    c3033m.resumeWith(EnumC15152t6.f56832w);
                }
                return Boolean.TRUE;
            default:
                C3033m c3033m2 = this.f56308x.f56433d;
                if (c3033m2.isActive()) {
                    c3033m2.resumeWith(EnumC15152t6.f56833x);
                }
                return C23454a0.f92919a;
        }
    }
}
