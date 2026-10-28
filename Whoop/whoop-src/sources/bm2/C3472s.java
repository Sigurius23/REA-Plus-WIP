package bm2;

import c93.InterfaceC4339a;
import p390p1.InterfaceC28601c1;
import p748zc1.AbstractC40529z1;
import vp1.AbstractC36272h;

/* JADX INFO: renamed from: bm2.s */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3472s implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13640w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f13641x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f13642y;

    public /* synthetic */ C3472s(int i13, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        this.f13640w = i13;
        this.f13641x = interfaceC28601c1;
        this.f13642y = interfaceC28601c2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f13640w) {
            case 0:
                return AbstractC3436e0.m9984d0(this.f13641x, this.f13642y);
            case 1:
                return AbstractC36272h.m115862n1(this.f13641x, this.f13642y);
            case 2:
                return AbstractC36272h.m115871q1(this.f13641x, this.f13642y);
            case 3:
                return AbstractC40529z1.m131264F(this.f13641x, this.f13642y);
            case 4:
                return AbstractC40529z1.m131260B(this.f13641x, this.f13642y);
            case 5:
                return AbstractC40529z1.m131261C(this.f13641x, this.f13642y);
            case 6:
                return AbstractC40529z1.m131262D(this.f13641x, this.f13642y);
            default:
                return AbstractC40529z1.m131263E(this.f13641x, this.f13642y);
        }
    }
}
