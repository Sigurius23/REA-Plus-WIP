package p291l0;

import p005a3.InterfaceC0192d2;
import p026b2.AbstractC2316v;
import p636y3.InterfaceC39171c;

/* JADX INFO: renamed from: l0.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C22947d1 extends AbstractC2316v implements InterfaceC0192d2 {

    /* JADX INFO: renamed from: O */
    public float f90578O;

    /* JADX INFO: renamed from: P */
    public boolean f90579P;

    @Override // p005a3.InterfaceC0192d2
    /* JADX INFO: renamed from: Y */
    public final Object mo461Y(InterfaceC39171c interfaceC39171c, Object obj) {
        C22985o1 c22985o1 = obj instanceof C22985o1 ? (C22985o1) obj : null;
        if (c22985o1 == null) {
            c22985o1 = new C22985o1();
        }
        c22985o1.f90674a = this.f90578O;
        c22985o1.f90675b = this.f90579P;
        return c22985o1;
    }
}
