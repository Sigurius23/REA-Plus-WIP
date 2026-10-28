package p635y2;

import p005a3.InterfaceC0186c0;
import p026b2.AbstractC2316v;
import p636y3.C39169a;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: y2.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C39084d0 extends AbstractC2316v implements InterfaceC0186c0 {

    /* JADX INFO: renamed from: O */
    public Function3 f168142O;

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        return (InterfaceC39130s0) this.f168142O.invoke(interfaceC39133t0, interfaceC39124q0, new C39169a(j7));
    }

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f168142O + ')';
    }
}
