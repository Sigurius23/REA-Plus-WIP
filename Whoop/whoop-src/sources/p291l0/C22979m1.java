package p291l0;

import m83.C25272z;
import p005a3.InterfaceC0186c0;
import p026b2.AbstractC2316v;
import p163g1.C15109p3;
import p315m0.AbstractC24868a;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.AbstractC39170b;

/* JADX INFO: renamed from: l0.m1 */
/* JADX INFO: loaded from: classes.dex */
public final class C22979m1 extends AbstractC2316v implements InterfaceC0186c0 {

    /* JADX INFO: renamed from: O */
    public InterfaceC22973k1 f90667O;

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        float fMo43110b = this.f90667O.mo43110b(interfaceC39133t0.getLayoutDirection());
        float fMo43112d = this.f90667O.mo43112d();
        float fMo43111c = this.f90667O.mo43111c(interfaceC39133t0.getLayoutDirection());
        float fMo43109a = this.f90667O.mo43109a();
        float f13 = 0;
        if (!((Float.compare(fMo43109a, f13) >= 0) & (Float.compare(fMo43110b, f13) >= 0) & (Float.compare(fMo43112d, f13) >= 0) & (Float.compare(fMo43111c, f13) >= 0))) {
            AbstractC24868a.m72899a("Padding must be non-negative");
        }
        int iMo724F = interfaceC39133t0.mo724F(fMo43110b);
        int iMo724F2 = interfaceC39133t0.mo724F(fMo43111c) + iMo724F;
        int iMo724F3 = interfaceC39133t0.mo724F(fMo43112d);
        int iMo724F4 = interfaceC39133t0.mo724F(fMo43109a) + iMo724F3;
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(AbstractC39170b.m124777i(-iMo724F2, j7, -iMo724F4));
        return interfaceC39133t0.mo86822W(AbstractC39170b.m124775g(abstractC39104j1Mo448T.f168211w + iMo724F2, j7), AbstractC39170b.m124774f(abstractC39104j1Mo448T.f168212x + iMo724F4, j7), C25272z.f99163w, new C15109p3(abstractC39104j1Mo448T, iMo724F, iMo724F3, 2));
    }
}
