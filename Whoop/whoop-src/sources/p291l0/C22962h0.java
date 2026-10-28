package p291l0;

import m83.C25272z;
import p005a3.InterfaceC0186c0;
import p026b2.AbstractC2316v;
import p105e1.C12526m;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.AbstractC39170b;
import p636y3.C39169a;

/* JADX INFO: renamed from: l0.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C22962h0 extends AbstractC2316v implements InterfaceC0186c0 {

    /* JADX INFO: renamed from: O */
    public EnumC22954f0 f90614O;

    /* JADX INFO: renamed from: P */
    public float f90615P;

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        int iM124767k;
        int iM124765i;
        int iM124764h;
        int iM124764h2;
        if (!C39169a.m124761e(j7) || this.f90614O == EnumC22954f0.f90593w) {
            iM124767k = C39169a.m124767k(j7);
            iM124765i = C39169a.m124765i(j7);
        } else {
            int iRound = Math.round(C39169a.m124765i(j7) * this.f90615P);
            int iM124767k2 = C39169a.m124767k(j7);
            iM124767k = C39169a.m124765i(j7);
            if (iRound < iM124767k2) {
                iRound = iM124767k2;
            }
            if (iRound <= iM124767k) {
                iM124767k = iRound;
            }
            iM124765i = iM124767k;
        }
        if (!C39169a.m124760d(j7) || this.f90614O == EnumC22954f0.f90594x) {
            int iM124766j = C39169a.m124766j(j7);
            iM124764h = C39169a.m124764h(j7);
            iM124764h2 = iM124766j;
        } else {
            int iRound2 = Math.round(C39169a.m124764h(j7) * this.f90615P);
            int iM124766j2 = C39169a.m124766j(j7);
            iM124764h2 = C39169a.m124764h(j7);
            if (iRound2 < iM124766j2) {
                iRound2 = iM124766j2;
            }
            if (iRound2 <= iM124764h2) {
                iM124764h2 = iRound2;
            }
            iM124764h = iM124764h2;
        }
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(AbstractC39170b.m124769a(iM124767k, iM124765i, iM124764h2, iM124764h));
        return interfaceC39133t0.mo86822W(abstractC39104j1Mo448T.f168211w, abstractC39104j1Mo448T.f168212x, C25272z.f99163w, new C12526m(abstractC39104j1Mo448T, 3));
    }
}
