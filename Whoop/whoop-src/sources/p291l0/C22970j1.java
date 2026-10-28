package p291l0;

import bp0.C3526n;
import m83.C25272z;
import p005a3.InterfaceC0186c0;
import p026b2.AbstractC2316v;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.AbstractC39170b;

/* JADX INFO: renamed from: l0.j1 */
/* JADX INFO: loaded from: classes.dex */
public final class C22970j1 extends AbstractC2316v implements InterfaceC0186c0 {

    /* JADX INFO: renamed from: O */
    public float f90630O;

    /* JADX INFO: renamed from: P */
    public float f90631P;

    /* JADX INFO: renamed from: Q */
    public float f90632Q;

    /* JADX INFO: renamed from: R */
    public float f90633R;

    /* JADX INFO: renamed from: S */
    public boolean f90634S;

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        int iMo724F = interfaceC39133t0.mo724F(this.f90632Q) + interfaceC39133t0.mo724F(this.f90630O);
        int iMo724F2 = interfaceC39133t0.mo724F(this.f90633R) + interfaceC39133t0.mo724F(this.f90631P);
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(AbstractC39170b.m124777i(-iMo724F, j7, -iMo724F2));
        return interfaceC39133t0.mo86822W(AbstractC39170b.m124775g(abstractC39104j1Mo448T.f168211w + iMo724F, j7), AbstractC39170b.m124774f(abstractC39104j1Mo448T.f168212x + iMo724F2, j7), C25272z.f99163w, new C3526n(25, this, abstractC39104j1Mo448T));
    }
}
