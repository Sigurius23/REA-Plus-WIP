package p208i2;

import m83.C25272z;
import p005a3.InterfaceC0186c0;
import p005a3.InterfaceC0216j2;
import p026b2.AbstractC2316v;
import p027b3.C2442t0;
import p209i3.InterfaceC18044z;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: i2.q */
/* JADX INFO: loaded from: classes.dex */
public final class C17905q extends AbstractC2316v implements InterfaceC0186c0, InterfaceC0216j2 {

    /* JADX INFO: renamed from: O */
    public Function1 f69606O;

    public C17905q(Function1 function1) {
        this.f69606O = function1;
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: M0 */
    public final boolean mo3462M0() {
        return false;
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(j7);
        return interfaceC39133t0.mo86822W(abstractC39104j1Mo448T.f168211w, abstractC39104j1Mo448T.f168212x, C25272z.f99163w, new C2442t0(8, abstractC39104j1Mo448T, this));
    }

    @Override // p005a3.InterfaceC0216j2
    /* JADX INFO: renamed from: e */
    public final boolean mo543e() {
        return false;
    }

    @Override // p005a3.InterfaceC0216j2
    /* JADX INFO: renamed from: n */
    public final void mo471n(InterfaceC18044z interfaceC18044z) {
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f69606O + ')';
    }
}
