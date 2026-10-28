package p291l0;

import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import m83.C25272z;
import p005a3.InterfaceC0186c0;
import p026b2.AbstractC2316v;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.AbstractC39170b;
import p636y3.C39169a;

/* JADX INFO: renamed from: l0.h2 */
/* JADX INFO: loaded from: classes.dex */
public final class C22964h2 extends AbstractC2316v implements InterfaceC0186c0 {

    /* JADX INFO: renamed from: O */
    public EnumC22954f0 f90618O;

    /* JADX INFO: renamed from: P */
    public boolean f90619P;

    /* JADX INFO: renamed from: Q */
    public InterfaceC4351m f90620Q;

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        EnumC22954f0 enumC22954f0 = this.f90618O;
        EnumC22954f0 enumC22954f1 = EnumC22954f0.f90593w;
        int iM124767k = enumC22954f0 != enumC22954f1 ? 0 : C39169a.m124767k(j7);
        EnumC22954f0 enumC22954f2 = this.f90618O;
        EnumC22954f0 enumC22954f3 = EnumC22954f0.f90594x;
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(AbstractC39170b.m124769a(iM124767k, (this.f90618O == enumC22954f1 || !this.f90619P) ? C39169a.m124765i(j7) : Integer.MAX_VALUE, enumC22954f2 == enumC22954f3 ? C39169a.m124766j(j7) : 0, (this.f90618O == enumC22954f3 || !this.f90619P) ? C39169a.m124764h(j7) : Integer.MAX_VALUE));
        int iM36284n = AbstractC12889b.m36284n(abstractC39104j1Mo448T.f168211w, C39169a.m124767k(j7), C39169a.m124765i(j7));
        int iM36284n2 = AbstractC12889b.m36284n(abstractC39104j1Mo448T.f168212x, C39169a.m124766j(j7), C39169a.m124764h(j7));
        return interfaceC39133t0.mo86822W(iM36284n, iM36284n2, C25272z.f99163w, new C22991q1(this, iM36284n, abstractC39104j1Mo448T, iM36284n2, interfaceC39133t0));
    }
}
