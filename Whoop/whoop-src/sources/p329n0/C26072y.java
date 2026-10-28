package p329n0;

import ch.C4592m;
import m83.C25272z;
import p005a3.InterfaceC0186c0;
import p026b2.AbstractC2316v;
import p390p1.InterfaceC28670t2;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.AbstractC39170b;
import p636y3.C39169a;

/* JADX INFO: renamed from: n0.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C26072y extends AbstractC2316v implements InterfaceC0186c0 {

    /* JADX INFO: renamed from: O */
    public float f103244O;

    /* JADX INFO: renamed from: P */
    public InterfaceC28670t2 f103245P;

    /* JADX INFO: renamed from: Q */
    public InterfaceC28670t2 f103246Q;

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        InterfaceC28670t2 interfaceC28670t2 = this.f103245P;
        int iRound = (interfaceC28670t2 == null || ((Number) interfaceC28670t2.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) interfaceC28670t2.getValue()).floatValue() * this.f103244O);
        InterfaceC28670t2 interfaceC28670t3 = this.f103246Q;
        int iRound2 = (interfaceC28670t3 == null || ((Number) interfaceC28670t3.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) interfaceC28670t3.getValue()).floatValue() * this.f103244O);
        int iM124767k = iRound != Integer.MAX_VALUE ? iRound : C39169a.m124767k(j7);
        int iM124766j = iRound2 != Integer.MAX_VALUE ? iRound2 : C39169a.m124766j(j7);
        if (iRound == Integer.MAX_VALUE) {
            iRound = C39169a.m124765i(j7);
        }
        if (iRound2 == Integer.MAX_VALUE) {
            iRound2 = C39169a.m124764h(j7);
        }
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(AbstractC39170b.m124769a(iM124767k, iRound, iM124766j, iRound2));
        return interfaceC39133t0.mo86822W(abstractC39104j1Mo448T.f168211w, abstractC39104j1Mo448T.f168212x, C25272z.f99163w, new C4592m(abstractC39104j1Mo448T, 6));
    }
}
