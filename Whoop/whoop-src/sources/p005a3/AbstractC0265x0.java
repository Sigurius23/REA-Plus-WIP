package p005a3;

import androidx.compose.p018ui.node.NodeCoordinator;
import java.util.LinkedHashMap;
import p002a0.AbstractC0065z0;
import p002a0.C0039m0;
import p031b9.AbstractC2875y;
import p635y2.C39121p0;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39147y;
import p636y3.C39178j;
import p636y3.EnumC39181m;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a3.x0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0265x0 extends AbstractC0262w0 implements InterfaceC39124q0 {

    /* JADX INFO: renamed from: O */
    public final NodeCoordinator f904O;

    /* JADX INFO: renamed from: Q */
    public LinkedHashMap f906Q;

    /* JADX INFO: renamed from: S */
    public InterfaceC39130s0 f908S;

    /* JADX INFO: renamed from: T */
    public final C0039m0 f909T;

    /* JADX INFO: renamed from: P */
    public long f905P = 0;

    /* JADX INFO: renamed from: R */
    public final C39121p0 f907R = new C39121p0(this);

    public AbstractC0265x0(NodeCoordinator nodeCoordinator) {
        this.f904O = nodeCoordinator;
        C0039m0 c0039m0 = AbstractC0065z0.f204a;
        this.f909T = new C0039m0();
    }

    /* JADX INFO: renamed from: V0 */
    public static final void m804V0(AbstractC0265x0 abstractC0265x0, InterfaceC39130s0 interfaceC39130s0) {
        LinkedHashMap linkedHashMap;
        if (interfaceC39130s0 != null) {
            abstractC0265x0.m124635r0((((long) interfaceC39130s0.getHeight()) & 4294967295L) | (((long) interfaceC39130s0.getWidth()) << 32));
        } else {
            abstractC0265x0.m124635r0(0L);
        }
        if (!AbstractC22676k.m65745e(abstractC0265x0.f908S, interfaceC39130s0) && interfaceC39130s0 != null && ((((linkedHashMap = abstractC0265x0.f906Q) != null && !linkedHashMap.isEmpty()) || !interfaceC39130s0.mo776a().isEmpty()) && !AbstractC22676k.m65745e(interfaceC39130s0.mo776a(), abstractC0265x0.f906Q))) {
            C0187c1 c0187c1 = abstractC0265x0.f904O.f4858O.m643t().f855q;
            AbstractC22676k.m65747g(c0187c1);
            c0187c1.f601S.m419g();
            LinkedHashMap linkedHashMap2 = abstractC0265x0.f906Q;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                abstractC0265x0.f906Q = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(interfaceC39130s0.mo776a());
        }
        abstractC0265x0.f908S = interfaceC39130s0;
    }

    @Override // p005a3.AbstractC0262w0, p635y2.InterfaceC39126r
    /* JADX INFO: renamed from: A */
    public final boolean mo781A() {
        return true;
    }

    @Override // p005a3.AbstractC0262w0
    /* JADX INFO: renamed from: I0 */
    public final AbstractC0262w0 mo785I0() {
        NodeCoordinator nodeCoordinator = this.f904O.f4859P;
        if (nodeCoordinator != null) {
            return nodeCoordinator.mo3530e1();
        }
        return null;
    }

    @Override // p005a3.AbstractC0262w0
    /* JADX INFO: renamed from: L0 */
    public final InterfaceC39147y mo786L0() {
        return this.f907R;
    }

    @Override // p005a3.AbstractC0262w0
    /* JADX INFO: renamed from: M0 */
    public final boolean mo787M0() {
        return this.f908S != null;
    }

    @Override // p005a3.AbstractC0262w0
    /* JADX INFO: renamed from: N0 */
    public final C0230n0 mo788N0() {
        return this.f904O.f4858O;
    }

    @Override // p005a3.AbstractC0262w0
    /* JADX INFO: renamed from: O0 */
    public final InterfaceC39130s0 mo789O0() {
        InterfaceC39130s0 interfaceC39130s0 = this.f908S;
        if (interfaceC39130s0 != null) {
            return interfaceC39130s0;
        }
        throw AbstractC2875y.m8310w("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // p005a3.AbstractC0262w0
    /* JADX INFO: renamed from: P0 */
    public final AbstractC0262w0 mo790P0() {
        NodeCoordinator nodeCoordinator = this.f904O.f4860Q;
        if (nodeCoordinator != null) {
            return nodeCoordinator.mo3530e1();
        }
        return null;
    }

    @Override // p005a3.AbstractC0262w0
    /* JADX INFO: renamed from: Q0 */
    public final long mo791Q0() {
        return this.f905P;
    }

    @Override // p005a3.AbstractC0262w0
    /* JADX INFO: renamed from: U0 */
    public final void mo794U0() {
        mo453o0(this.f905P, 0.0f, null);
    }

    /* JADX INFO: renamed from: W0 */
    public void mo779W0() {
        mo789O0().mo777b();
    }

    /* JADX INFO: renamed from: X0 */
    public final void m805X0(long j7) {
        if (!C39178j.m124792b(this.f905P, j7)) {
            this.f905P = j7;
            NodeCoordinator nodeCoordinator = this.f904O;
            C0187c1 c0187c1 = nodeCoordinator.f4858O.m643t().f855q;
            if (c0187c1 != null) {
                c0187c1.m441G0();
            }
            AbstractC0262w0.m780S0(nodeCoordinator);
        }
        if (this.f898K) {
            return;
        }
        m784H0(mo789O0());
    }

    /* JADX INFO: renamed from: Y0 */
    public final long m806Y0(AbstractC0265x0 abstractC0265x0, boolean z4) {
        long jM124794d = 0;
        AbstractC0265x0 abstractC0265x0Mo3530e1 = this;
        while (!abstractC0265x0Mo3530e1.equals(abstractC0265x0)) {
            if (!abstractC0265x0Mo3530e1.f896I || !z4) {
                jM124794d = C39178j.m124794d(jM124794d, abstractC0265x0Mo3530e1.f905P);
            }
            NodeCoordinator nodeCoordinator = abstractC0265x0Mo3530e1.f904O.f4860Q;
            AbstractC22676k.m65747g(nodeCoordinator);
            abstractC0265x0Mo3530e1 = nodeCoordinator.mo3530e1();
            AbstractC22676k.m65747g(abstractC0265x0Mo3530e1);
        }
        return jM124794d;
    }

    @Override // p636y3.InterfaceC39171c
    public final float getDensity() {
        return this.f904O.getDensity();
    }

    @Override // p635y2.InterfaceC39126r
    public final EnumC39181m getLayoutDirection() {
        return this.f904O.f4858O.f777Y;
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: m0 */
    public final float getFontScale() {
        return this.f904O.getFontScale();
    }

    @Override // p635y2.AbstractC39104j1
    /* JADX INFO: renamed from: o0 */
    public final void mo453o0(long j7, float f13, Function1 function1) {
        m805X0(j7);
        if (this.f897J) {
            return;
        }
        mo779W0();
    }

    @Override // p635y2.AbstractC39104j1, p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: p */
    public final Object mo454p() {
        return this.f904O.mo454p();
    }
}
