package p635y2;

import androidx.compose.p018ui.node.NodeCoordinator;
import p005a3.AbstractC0265x0;
import p181h2.C16617b;
import p181h2.C16618c;
import p479s4.AbstractC32120a;
import p557vo.AbstractC36220b;
import p603x2.AbstractC37831a;
import p636y3.C39178j;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y2.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C39121p0 implements InterfaceC39147y {

    /* JADX INFO: renamed from: w */
    public final AbstractC0265x0 f168257w;

    public C39121p0(AbstractC0265x0 abstractC0265x0) {
        this.f168257w = abstractC0265x0;
    }

    @Override // p635y2.InterfaceC39147y
    /* JADX INFO: renamed from: E */
    public final long mo3510E(long j7) {
        return this.f168257w.f904O.mo3510E(C16617b.m47192h(j7, m124652a()));
    }

    @Override // p635y2.InterfaceC39147y
    /* JADX INFO: renamed from: N */
    public final void mo3515N(float[] fArr) {
        this.f168257w.f904O.mo3515N(fArr);
    }

    @Override // p635y2.InterfaceC39147y
    /* JADX INFO: renamed from: S */
    public final long mo3516S(long j7) {
        return this.f168257w.f904O.mo3516S(C16617b.m47192h(0L, m124652a()));
    }

    @Override // p635y2.InterfaceC39147y
    /* JADX INFO: renamed from: V */
    public final InterfaceC39147y mo3517V() {
        AbstractC0265x0 abstractC0265x0Mo3530e1;
        if (!mo3532g()) {
            AbstractC37831a.m121374b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        NodeCoordinator nodeCoordinator = ((NodeCoordinator) this.f168257w.f904O.f4858O.f783e0.f741e).f4860Q;
        if (nodeCoordinator == null || (abstractC0265x0Mo3530e1 = nodeCoordinator.mo3530e1()) == null) {
            return null;
        }
        return abstractC0265x0Mo3530e1.f907R;
    }

    @Override // p635y2.InterfaceC39147y
    /* JADX INFO: renamed from: Y */
    public final void mo3521Y(InterfaceC39147y interfaceC39147y, float[] fArr) {
        this.f168257w.f904O.mo3521Y(interfaceC39147y, fArr);
    }

    @Override // p635y2.InterfaceC39147y
    /* JADX INFO: renamed from: Z */
    public final long mo3523Z(long j7) {
        return this.f168257w.f904O.mo3523Z(C16617b.m47192h(j7, m124652a()));
    }

    /* JADX INFO: renamed from: a */
    public final long m124652a() {
        AbstractC0265x0 abstractC0265x0 = this.f168257w;
        AbstractC0265x0 abstractC0265x0M99980f = AbstractC32120a.m99980f(abstractC0265x0);
        return C16617b.m47191g(m124653b(abstractC0265x0M99980f.f907R, 0L), abstractC0265x0.f904O.m3545p1(abstractC0265x0M99980f.f904O, 0L));
    }

    /* JADX INFO: renamed from: b */
    public final long m124653b(InterfaceC39147y interfaceC39147y, long j7) {
        boolean z4 = interfaceC39147y instanceof C39121p0;
        AbstractC0265x0 abstractC0265x0 = this.f168257w;
        if (!z4) {
            AbstractC0265x0 abstractC0265x0M99980f = AbstractC32120a.m99980f(abstractC0265x0);
            InterfaceC39147y interfaceC39147y2 = abstractC0265x0M99980f.f904O;
            long jM124653b = m124653b(abstractC0265x0M99980f.f907R, j7);
            long j13 = abstractC0265x0M99980f.f905P;
            long jM47191g = C16617b.m47191g(jM124653b, (4294967295L & ((long) Float.floatToRawIntBits((int) (j13 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j13 >> 32)) << 32));
            InterfaceC39147y interfaceC39147yMo3527c = interfaceC39147y2.mo3527c();
            if (interfaceC39147yMo3527c != null) {
                interfaceC39147y2 = interfaceC39147yMo3527c;
            }
            return C16617b.m47192h(jM47191g, ((NodeCoordinator) interfaceC39147y2).m3545p1(interfaceC39147y, 0L));
        }
        AbstractC0265x0 abstractC0265x1 = ((C39121p0) interfaceC39147y).f168257w;
        NodeCoordinator nodeCoordinator = abstractC0265x1.f904O;
        nodeCoordinator.m3546q1();
        AbstractC0265x0 abstractC0265x0Mo3530e1 = abstractC0265x0.f904O.m3528c1(nodeCoordinator).mo3530e1();
        if (abstractC0265x0Mo3530e1 != null) {
            long jM124793c = C39178j.m124793c(C39178j.m124794d(abstractC0265x1.m806Y0(abstractC0265x0Mo3530e1, false), AbstractC36220b.m115291C(j7)), abstractC0265x0.m806Y0(abstractC0265x0Mo3530e1, false));
            return (((long) Float.floatToRawIntBits((int) (jM124793c >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jM124793c & 4294967295L))) & 4294967295L);
        }
        AbstractC0265x0 abstractC0265x0M99980f2 = AbstractC32120a.m99980f(abstractC0265x1);
        long jM124794d = C39178j.m124794d(C39178j.m124794d(abstractC0265x1.m806Y0(abstractC0265x0M99980f2, false), abstractC0265x0M99980f2.f905P), AbstractC36220b.m115291C(j7));
        AbstractC0265x0 abstractC0265x0M99980f3 = AbstractC32120a.m99980f(abstractC0265x0);
        long jM124793c2 = C39178j.m124793c(jM124794d, C39178j.m124794d(abstractC0265x0.m806Y0(abstractC0265x0M99980f3, false), abstractC0265x0M99980f3.f905P));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jM124793c2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jM124793c2 & 4294967295L))) & 4294967295L;
        NodeCoordinator nodeCoordinator2 = abstractC0265x0M99980f3.f904O.f4860Q;
        AbstractC22676k.m65747g(nodeCoordinator2);
        NodeCoordinator nodeCoordinator3 = abstractC0265x0M99980f2.f904O.f4860Q;
        AbstractC22676k.m65747g(nodeCoordinator3);
        return nodeCoordinator2.m3545p1(nodeCoordinator3, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // p635y2.InterfaceC39147y
    /* JADX INFO: renamed from: c */
    public final InterfaceC39147y mo3527c() {
        AbstractC0265x0 abstractC0265x0Mo3530e1;
        if (!mo3532g()) {
            AbstractC37831a.m121374b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        NodeCoordinator nodeCoordinator = this.f168257w.f904O.f4860Q;
        if (nodeCoordinator == null || (abstractC0265x0Mo3530e1 = nodeCoordinator.mo3530e1()) == null) {
            return null;
        }
        return abstractC0265x0Mo3530e1.f907R;
    }

    @Override // p635y2.InterfaceC39147y
    /* JADX INFO: renamed from: g */
    public final boolean mo3532g() {
        return this.f168257w.f904O.mo3533g1().f9141N;
    }

    @Override // p635y2.InterfaceC39147y
    /* JADX INFO: renamed from: k */
    public final long mo3537k(InterfaceC39147y interfaceC39147y, long j7) {
        return m124653b(interfaceC39147y, j7);
    }

    @Override // p635y2.InterfaceC39147y
    /* JADX INFO: renamed from: n */
    public final long mo3541n() {
        AbstractC0265x0 abstractC0265x0 = this.f168257w;
        return (((long) abstractC0265x0.f168211w) << 32) | (((long) abstractC0265x0.f168212x) & 4294967295L);
    }

    @Override // p635y2.InterfaceC39147y
    /* JADX INFO: renamed from: o */
    public final long mo3543o(long j7) {
        return C16617b.m47192h(this.f168257w.f904O.mo3543o(j7), m124652a());
    }

    @Override // p635y2.InterfaceC39147y
    /* JADX INFO: renamed from: r */
    public final C16618c mo3547r(InterfaceC39147y interfaceC39147y, boolean z4) {
        return this.f168257w.f904O.mo3547r(interfaceC39147y, z4);
    }

    @Override // p635y2.InterfaceC39147y
    /* JADX INFO: renamed from: y */
    public final long mo3555y(long j7) {
        return C16617b.m47192h(this.f168257w.f904O.mo3555y(j7), m124652a());
    }
}
