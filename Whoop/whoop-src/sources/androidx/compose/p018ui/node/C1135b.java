package androidx.compose.p018ui.node;

import p002a0.C0039m0;
import p005a3.AbstractC0242q0;
import p005a3.AbstractC0265x0;
import p005a3.C0190d0;
import p005a3.C0230n0;
import p005a3.InterfaceC0186c0;
import p026b2.AbstractC2316v;
import p108e4.AbstractC12667a;
import p208i2.AbstractC17918w0;
import p208i2.C17887h;
import p208i2.C17919x;
import p208i2.InterfaceC17915v;
import p293l2.C23226c;
import p635y2.AbstractC39071a;
import p635y2.AbstractC39104j1;
import p636y3.C39178j;
import p636y3.C39180l;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.compose.ui.node.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1135b extends NodeCoordinator {

    /* JADX INFO: renamed from: r0 */
    public static final C17887h f4883r0;

    /* JADX INFO: renamed from: p0 */
    public InterfaceC0186c0 f4884p0;

    /* JADX INFO: renamed from: q0 */
    public C0190d0 f4885q0;

    static {
        C17887h c17887hM51522j = AbstractC17918w0.m51522j();
        c17887hM51522j.m51447e(C17919x.f69632i);
        c17887hM51522j.m51454l(1.0f);
        c17887hM51522j.m51455m(1);
        f4883r0 = c17887hM51522j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1135b(C0230n0 c0230n0, InterfaceC0186c0 interfaceC0186c0) {
        super(c0230n0);
        this.f4884p0 = interfaceC0186c0;
        this.f4885q0 = c0230n0.f759G != null ? new C0190d0(this) : null;
        if ((((AbstractC2316v) interfaceC0186c0).f9142w.f9144y & 512) != 0) {
            throw new ClassCastException();
        }
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: C */
    public final int mo438C(int i13) {
        InterfaceC0186c0 interfaceC0186c0 = this.f4884p0;
        NodeCoordinator nodeCoordinator = this.f4859P;
        AbstractC22676k.m65747g(nodeCoordinator);
        return interfaceC0186c0.mo437y(this, nodeCoordinator, i13);
    }

    @Override // p005a3.AbstractC0262w0
    /* JADX INFO: renamed from: F0 */
    public final int mo475F0(AbstractC39071a abstractC39071a) {
        C0190d0 c0190d0 = this.f4885q0;
        if (c0190d0 == null) {
            return AbstractC12667a.m35461m(this, abstractC39071a);
        }
        C0039m0 c0039m0 = c0190d0.f909T;
        int iM91d = c0039m0.m91d(abstractC39071a);
        if (iM91d >= 0) {
            return c0039m0.f116c[iM91d];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: I1 */
    public final void m3558I1() {
        if (this.f897J) {
            return;
        }
        m3549s1();
        mo789O0().mo777b();
        AbstractC22676k.m65747g(this.f4859P);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J1 */
    public final void m3559J1(InterfaceC0186c0 interfaceC0186c0) {
        if (!interfaceC0186c0.equals(this.f4884p0) && (((AbstractC2316v) interfaceC0186c0).f9142w.f9144y & 512) != 0) {
            throw new ClassCastException();
        }
        this.f4884p0 = interfaceC0186c0;
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: O */
    public final int mo446O(int i13) {
        InterfaceC0186c0 interfaceC0186c0 = this.f4884p0;
        NodeCoordinator nodeCoordinator = this.f4859P;
        AbstractC22676k.m65747g(nodeCoordinator);
        return interfaceC0186c0.mo435g0(this, nodeCoordinator, i13);
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: Q */
    public final int mo447Q(int i13) {
        InterfaceC0186c0 interfaceC0186c0 = this.f4884p0;
        NodeCoordinator nodeCoordinator = this.f4859P;
        AbstractC22676k.m65747g(nodeCoordinator);
        return interfaceC0186c0.mo436o(this, nodeCoordinator, i13);
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: T */
    public final AbstractC39104j1 mo448T(long j7) {
        m124636v0(j7);
        InterfaceC0186c0 interfaceC0186c0 = this.f4884p0;
        NodeCoordinator nodeCoordinator = this.f4859P;
        AbstractC22676k.m65747g(nodeCoordinator);
        m3557z1(interfaceC0186c0.mo434b(this, nodeCoordinator, j7));
        m3548r1();
        return this;
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: b */
    public final int mo449b(int i13) {
        InterfaceC0186c0 interfaceC0186c0 = this.f4884p0;
        NodeCoordinator nodeCoordinator = this.f4859P;
        AbstractC22676k.m65747g(nodeCoordinator);
        return interfaceC0186c0.mo433E(this, nodeCoordinator, i13);
    }

    @Override // androidx.compose.p018ui.node.NodeCoordinator
    /* JADX INFO: renamed from: b1 */
    public final void mo3526b1() {
        if (this.f4885q0 == null) {
            this.f4885q0 = new C0190d0(this);
        }
    }

    @Override // androidx.compose.p018ui.node.NodeCoordinator
    /* JADX INFO: renamed from: e1 */
    public final AbstractC0265x0 mo3530e1() {
        return this.f4885q0;
    }

    @Override // androidx.compose.p018ui.node.NodeCoordinator
    /* JADX INFO: renamed from: g1 */
    public final AbstractC2316v mo3533g1() {
        return ((AbstractC2316v) this.f4884p0).f9142w;
    }

    @Override // p635y2.AbstractC39104j1
    /* JADX INFO: renamed from: o0 */
    public final void mo453o0(long j7, float f13, Function1 function1) {
        m3553w1(j7, f13, function1, null);
        m3558I1();
    }

    @Override // androidx.compose.p018ui.node.NodeCoordinator, p635y2.AbstractC39104j1
    /* JADX INFO: renamed from: p0 */
    public final void mo455p0(long j7, float f13, C23226c c23226c) {
        m3553w1(j7, f13, null, c23226c);
        m3558I1();
    }

    @Override // androidx.compose.p018ui.node.NodeCoordinator
    /* JADX INFO: renamed from: v1 */
    public final void mo3552v1(InterfaceC17915v interfaceC17915v, C23226c c23226c) {
        NodeCoordinator nodeCoordinator;
        NodeCoordinator nodeCoordinator2 = this.f4859P;
        AbstractC22676k.m65747g(nodeCoordinator2);
        nodeCoordinator2.m3524Z0(interfaceC17915v, c23226c);
        if (!AbstractC0242q0.m750a(this.f4858O).getShowLayoutBounds() || (nodeCoordinator = this.f4859P) == null) {
            return;
        }
        if (C39180l.m124799a(this.f168213y, nodeCoordinator.f168213y) && C39178j.m124792b(nodeCoordinator.f4869Z, 0L)) {
            return;
        }
        long j7 = this.f168213y;
        interfaceC17915v.mo51412b(0.5f, 0.5f, ((int) (j7 >> 32)) - 0.5f, ((int) (j7 & 4294967295L)) - 0.5f, f4883r0);
    }
}
