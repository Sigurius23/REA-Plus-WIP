package p163g1;

import m83.C25272z;
import p005a3.AbstractC0201g;
import p005a3.InterfaceC0186c0;
import p005a3.InterfaceC0225m;
import p026b2.AbstractC2316v;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.C39176h;

/* JADX INFO: renamed from: g1.q3 */
/* JADX INFO: loaded from: classes.dex */
public final class C15119q3 extends AbstractC2316v implements InterfaceC0225m, InterfaceC0186c0 {
    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        boolean z4 = this.f9141N && ((Boolean) AbstractC0201g.m506f(this, AbstractC15027h3.f56241a)).booleanValue();
        long j13 = AbstractC15027h3.f56242b;
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(j7);
        int iMax = z4 ? Math.max(abstractC39104j1Mo448T.f168211w, interfaceC39133t0.mo724F(C39176h.m124787c(j13))) : abstractC39104j1Mo448T.f168211w;
        int iMax2 = z4 ? Math.max(abstractC39104j1Mo448T.f168212x, interfaceC39133t0.mo724F(C39176h.m124786b(j13))) : abstractC39104j1Mo448T.f168212x;
        return interfaceC39133t0.mo86822W(iMax, iMax2, C25272z.f99163w, new C15109p3(iMax, abstractC39104j1Mo448T, iMax2));
    }
}
