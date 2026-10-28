package p026b2;

import m83.C25272z;
import p000.AbstractC30802r;
import p005a3.InterfaceC0186c0;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;

/* JADX INFO: renamed from: b2.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2295a0 extends AbstractC2316v implements InterfaceC0186c0 {

    /* JADX INFO: renamed from: O */
    public float f9096O;

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(j7);
        return interfaceC39133t0.mo86822W(abstractC39104j1Mo448T.f168211w, abstractC39104j1Mo448T.f168212x, C25272z.f99163w, new C2320z(0, abstractC39104j1Mo448T, this));
    }

    public final String toString() {
        return AbstractC30802r.m94763l(new StringBuilder("ZIndexModifier(zIndex="), this.f9096O, ')');
    }
}
