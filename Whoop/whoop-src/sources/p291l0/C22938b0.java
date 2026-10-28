package p291l0;

import p635y2.AbstractC39104j1;
import p636y3.EnumC39181m;

/* JADX INFO: renamed from: l0.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22938b0 extends AbstractC22953f {

    /* JADX INFO: renamed from: e */
    public final C22933a f90545e;

    public C22938b0(C22933a c22933a) {
        this.f90545e = c22933a;
    }

    @Override // p291l0.AbstractC22953f
    /* JADX INFO: renamed from: d */
    public final int mo66707d(int i13, EnumC39181m enumC39181m, AbstractC39104j1 abstractC39104j1, int i14) {
        int iMo450c0 = abstractC39104j1.mo450c0(this.f90545e.f90534a);
        if (iMo450c0 == Integer.MIN_VALUE) {
            return 0;
        }
        int i15 = i14 - iMo450c0;
        return enumC39181m == EnumC39181m.f168424x ? i13 - i15 : i15;
    }

    @Override // p291l0.AbstractC22953f
    /* JADX INFO: renamed from: f */
    public final Integer mo66708f(AbstractC39104j1 abstractC39104j1) {
        return Integer.valueOf(abstractC39104j1.mo450c0(this.f90545e.f90534a));
    }
}
