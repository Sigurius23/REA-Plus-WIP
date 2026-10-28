package p005a3;

import androidx.compose.p018ui.node.C1134a;
import androidx.compose.p018ui.node.C1135b;
import androidx.compose.p018ui.node.NodeCoordinator;
import androidx.compose.p018ui.node.Owner;
import androidx.compose.p018ui.platform.AndroidComposeView;
import java.util.List;
import p002a0.C0006a1;
import p026b2.AbstractC2316v;
import p293l2.C23226c;
import p446r1.C30848b;
import p446r1.C30849c;
import p603x2.AbstractC37831a;
import p635y2.AbstractC39071a;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p636y3.AbstractC39170b;
import p636y3.C39169a;
import p636y3.C39178j;
import p636y3.C39180l;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a3.g1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0203g1 extends AbstractC39104j1 implements InterfaceC39124q0, InterfaceC0181b, InterfaceC0211i1 {

    /* JADX INFO: renamed from: F */
    public final C0246r0 f653F;

    /* JADX INFO: renamed from: G */
    public boolean f654G;

    /* JADX INFO: renamed from: J */
    public boolean f657J;

    /* JADX INFO: renamed from: K */
    public boolean f658K;

    /* JADX INFO: renamed from: M */
    public boolean f660M;

    /* JADX INFO: renamed from: O */
    public Function1 f662O;

    /* JADX INFO: renamed from: P */
    public C23226c f663P;

    /* JADX INFO: renamed from: Q */
    public float f664Q;

    /* JADX INFO: renamed from: S */
    public Object f666S;

    /* JADX INFO: renamed from: T */
    public boolean f667T;

    /* JADX INFO: renamed from: U */
    public boolean f668U;

    /* JADX INFO: renamed from: V */
    public boolean f669V;

    /* JADX INFO: renamed from: W */
    public boolean f670W;

    /* JADX INFO: renamed from: X */
    public boolean f671X;

    /* JADX INFO: renamed from: b0 */
    public boolean f675b0;

    /* JADX INFO: renamed from: f0 */
    public float f679f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f680g0;

    /* JADX INFO: renamed from: h0 */
    public Function1 f681h0;

    /* JADX INFO: renamed from: i0 */
    public C23226c f682i0;

    /* JADX INFO: renamed from: k0 */
    public float f684k0;

    /* JADX INFO: renamed from: m0 */
    public boolean f686m0;

    /* JADX INFO: renamed from: H */
    public int f655H = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: I */
    public int f656I = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: L */
    public EnumC0214j0 f659L = EnumC0214j0.f715y;

    /* JADX INFO: renamed from: N */
    public long f661N = 0;

    /* JADX INFO: renamed from: R */
    public boolean f665R = true;

    /* JADX INFO: renamed from: Y */
    public final C0234o0 f672Y = new C0234o0(this);

    /* JADX INFO: renamed from: Z */
    public final C30849c f673Z = new C30849c(new C0203g1[16]);

    /* JADX INFO: renamed from: a0 */
    public boolean f674a0 = true;

    /* JADX INFO: renamed from: c0 */
    public long f676c0 = AbstractC39170b.m124770b(0, 0, 15);

    /* JADX INFO: renamed from: d0 */
    public final C0199f1 f677d0 = new C0199f1(this, 1);

    /* JADX INFO: renamed from: e0 */
    public final C0199f1 f678e0 = new C0199f1(this, 0);

    /* JADX INFO: renamed from: j0 */
    public long f683j0 = 0;

    /* JADX INFO: renamed from: l0 */
    public final C0199f1 f685l0 = new C0199f1(this, 2);

    public C0203g1(C0246r0 c0246r0) {
        this.f653F = c0246r0;
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: C */
    public final int mo438C(int i13) {
        C0246r0 c0246r0 = this.f653F;
        if (!AbstractC0201g.m511k(c0246r0.f839a)) {
            m526I0();
            return c0246r0.m753a().mo438C(i13);
        }
        C0187c1 c0187c1 = c0246r0.f855q;
        AbstractC22676k.m65747g(c0187c1);
        return c0187c1.mo438C(i13);
    }

    /* JADX INFO: renamed from: C0 */
    public final List m522C0() {
        C0246r0 c0246r0 = this.f653F;
        c0246r0.f839a.m589G0();
        boolean z4 = this.f674a0;
        C30849c c30849c = this.f673Z;
        if (!z4) {
            return c30849c.m94889f();
        }
        C0230n0 c0230n0 = c0246r0.f839a;
        C30849c c30849cM595M = c0230n0.m595M();
        Object[] objArr = c30849cM595M.f127227w;
        int i13 = c30849cM595M.f127229y;
        for (int i14 = 0; i14 < i13; i14++) {
            C0230n0 c0230n1 = (C0230n0) objArr[i14];
            if (c30849c.f127229y <= i14) {
                c30849c.m94885b(c0230n1.m643t().f854p);
            } else {
                C0203g1 c0203g1 = c0230n1.m643t().f854p;
                Object[] objArr2 = c30849c.f127227w;
                Object obj = objArr2[i14];
                objArr2[i14] = c0203g1;
            }
        }
        c30849c.m94895m(((C30848b) c0230n0.m637q()).f127226w.f127229y, c30849c.f127229y);
        this.f674a0 = false;
        return c30849c.m94889f();
    }

    /* JADX INFO: renamed from: F0 */
    public final void m523F0() {
        boolean z4 = this.f667T;
        this.f667T = true;
        C0230n0 c0230n0 = this.f653F.f839a;
        C0223l1 c0223l1 = c0230n0.f783e0;
        if (!z4) {
            ((C1134a) c0223l1.f740d).m3549s1();
            if (c0230n0.m577A()) {
                C0230n0.m575v0(c0230n0, true, 6);
            } else if (c0230n0.m648x()) {
                C0230n0.m574t0(c0230n0, true, 6);
            }
        }
        NodeCoordinator nodeCoordinator = ((C1134a) c0223l1.f740d).f4859P;
        for (NodeCoordinator nodeCoordinator2 = (NodeCoordinator) c0223l1.f741e; !AbstractC22676k.m65745e(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.f4859P) {
            if (nodeCoordinator2.f4877h0) {
                nodeCoordinator2.m3542n1();
            }
        }
        C30849c c30849cM595M = c0230n0.m595M();
        Object[] objArr = c30849cM595M.f127227w;
        int i13 = c30849cM595M.f127229y;
        for (int i14 = 0; i14 < i13; i14++) {
            C0230n0 c0230n1 = (C0230n0) objArr[i14];
            if (c0230n1.m590H() != Integer.MAX_VALUE) {
                c0230n1.m652z().m523F0();
                C0230n0.m576w0(c0230n1);
            }
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m524G0() {
        if (this.f667T) {
            this.f667T = false;
            C0246r0 c0246r0 = this.f653F;
            C0223l1 c0223l1 = c0246r0.f839a.f783e0;
            NodeCoordinator nodeCoordinator = ((C1134a) c0223l1.f740d).f4859P;
            for (NodeCoordinator nodeCoordinator2 = (NodeCoordinator) c0223l1.f741e; !AbstractC22676k.m65745e(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.f4859P) {
                AbstractC2316v abstractC2316vM3535i1 = nodeCoordinator2.m3535i1(AbstractC0247r1.m769g(1048576));
                if (abstractC2316vM3535i1 != null && (abstractC2316vM3535i1.f9142w.f9145z & 1048576) != 0) {
                    boolean zM769g = AbstractC0247r1.m769g(1048576);
                    AbstractC2316v abstractC2316vMo3533g1 = nodeCoordinator2.mo3533g1();
                    if (zM769g || (abstractC2316vMo3533g1 = abstractC2316vMo3533g1.f9132E) != null) {
                        for (AbstractC2316v abstractC2316vM3535i2 = nodeCoordinator2.m3535i1(zM769g); abstractC2316vM3535i2 != null && (abstractC2316vM3535i2.f9145z & 1048576) != 0; abstractC2316vM3535i2 = abstractC2316vM3535i2.f9133F) {
                            if ((abstractC2316vM3535i2.f9144y & 1048576) != 0) {
                                AbstractC2316v abstractC2316vM504d = abstractC2316vM3535i2;
                                C30849c c30849c = null;
                                while (abstractC2316vM504d != null) {
                                    if ((abstractC2316vM504d.f9144y & 1048576) != 0 && (abstractC2316vM504d instanceof AbstractC0233o)) {
                                        int i13 = 0;
                                        for (AbstractC2316v abstractC2316v = ((AbstractC0233o) abstractC2316vM504d).f804P; abstractC2316v != null; abstractC2316v = abstractC2316v.f9133F) {
                                            if ((abstractC2316v.f9144y & 1048576) != 0) {
                                                i13++;
                                                if (i13 == 1) {
                                                    abstractC2316vM504d = abstractC2316v;
                                                } else {
                                                    if (c30849c == null) {
                                                        c30849c = new C30849c(new AbstractC2316v[16]);
                                                    }
                                                    if (abstractC2316vM504d != null) {
                                                        c30849c.m94885b(abstractC2316vM504d);
                                                        abstractC2316vM504d = null;
                                                    }
                                                    c30849c.m94885b(abstractC2316v);
                                                }
                                            }
                                        }
                                        if (i13 == 1) {
                                        }
                                    }
                                    abstractC2316vM504d = AbstractC0201g.m504d(c30849c);
                                }
                            }
                            if (abstractC2316vM3535i2 == abstractC2316vMo3533g1) {
                                break;
                            }
                        }
                    }
                }
                nodeCoordinator2.m3556y1();
            }
            C30849c c30849cM595M = c0246r0.f839a.m595M();
            Object[] objArr = c30849cM595M.f127227w;
            int i14 = c30849cM595M.f127229y;
            for (int i15 = 0; i15 < i14; i15++) {
                ((C0230n0) objArr[i15]).m652z().m524G0();
            }
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m525H0() {
        C0246r0 c0246r0 = this.f653F;
        if (c0246r0.f850l > 0) {
            C30849c c30849cM595M = c0246r0.f839a.m595M();
            Object[] objArr = c30849cM595M.f127227w;
            int i13 = c30849cM595M.f127229y;
            for (int i14 = 0; i14 < i13; i14++) {
                C0230n0 c0230n0 = (C0230n0) objArr[i14];
                C0246r0 c0246r0M643t = c0230n0.m643t();
                boolean z4 = c0246r0M643t.f848j;
                C0203g1 c0203g1 = c0246r0M643t.f854p;
                if ((z4 || c0246r0M643t.f849k) && !c0203g1.f670W) {
                    c0230n0.m645u0(false);
                }
                c0203g1.m525H0();
            }
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final void m526I0() {
        EnumC0214j0 enumC0214j0;
        C0246r0 c0246r0 = this.f653F;
        C0230n0.m575v0(c0246r0.f839a, false, 7);
        C0230n0 c0230n0 = c0246r0.f839a;
        C0230n0 c0230n0M588G = c0230n0.m588G();
        if (c0230n0M588G == null || c0230n0.f780b0 != EnumC0214j0.f715y) {
            return;
        }
        int iOrdinal = c0230n0M588G.m646v().ordinal();
        if (iOrdinal != 0) {
            enumC0214j0 = iOrdinal != 2 ? c0230n0M588G.f780b0 : EnumC0214j0.f714x;
        } else {
            enumC0214j0 = EnumC0214j0.f713w;
        }
        c0230n0.f780b0 = enumC0214j0;
    }

    @Override // p005a3.InterfaceC0181b
    /* JADX INFO: renamed from: J */
    public final C1134a mo424J() {
        return (C1134a) this.f653F.f839a.f783e0.f740d;
    }

    /* JADX INFO: renamed from: L0 */
    public final void m527L0() {
        this.f680g0 = true;
        C0246r0 c0246r0 = this.f653F;
        C0230n0 c0230n0M588G = c0246r0.f839a.m588G();
        float f13 = mo424J().f4870a0;
        C0230n0 c0230n0 = c0246r0.f839a;
        C0223l1 c0223l1 = c0230n0.f783e0;
        NodeCoordinator nodeCoordinator = (NodeCoordinator) c0223l1.f741e;
        C1134a c1134a = (C1134a) c0223l1.f740d;
        while (nodeCoordinator != c1134a) {
            AbstractC22676k.m65748h(nodeCoordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C1135b c1135b = (C1135b) nodeCoordinator;
            f13 += c1135b.f4870a0;
            nodeCoordinator = c1135b.f4859P;
        }
        if (f13 != this.f679f0) {
            this.f679f0 = f13;
            if (c0230n0M588G != null) {
                c0230n0M588G.m629l0();
            }
            if (c0230n0M588G != null) {
                c0230n0M588G.m598P();
            }
        }
        if (this.f667T) {
            ((C1134a) c0230n0.f783e0.f740d).m3549s1();
        } else {
            if (c0230n0M588G != null) {
                c0230n0M588G.m598P();
            }
            m523F0();
            if (this.f654G && c0230n0M588G != null) {
                c0230n0M588G.m645u0(false);
            }
        }
        if (c0230n0M588G == null) {
            this.f656I = 0;
        } else if (!this.f654G && c0230n0M588G.m646v() == EnumC0206h0.f693y) {
            if (this.f656I != Integer.MAX_VALUE) {
                AbstractC37831a.m121374b("Place was called on a node which was placed already");
            }
            this.f656I = c0230n0M588G.m643t().f847i;
            c0230n0M588G.m643t().f847i++;
        }
        mo429t();
    }

    /* JADX INFO: renamed from: M0 */
    public final void m528M0(long j7) {
        C0246r0 c0246r0 = this.f653F;
        EnumC0206h0 enumC0206h0 = c0246r0.f842d;
        C0230n0 c0230n0 = c0246r0.f839a;
        EnumC0206h0 enumC0206h1 = EnumC0206h0.f689E;
        if (enumC0206h0 != enumC0206h1) {
            AbstractC37831a.m121374b("layout state is not idle before measure starts");
        }
        this.f676c0 = j7;
        EnumC0206h0 enumC0206h2 = EnumC0206h0.f691w;
        c0246r0.f842d = enumC0206h2;
        this.f669V = false;
        C0188c2 snapshotObserver = AbstractC0242q0.m750a(c0230n0).getSnapshotObserver();
        snapshotObserver.m457a(c0230n0, snapshotObserver.f610c, this.f677d0);
        if (c0246r0.f842d == enumC0206h2) {
            this.f670W = true;
            this.f671X = true;
            c0246r0.f842d = enumC0206h1;
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m529N0(long j7, float f13, Function1 function1, C23226c c23226c) {
        C0246r0 c0246r0 = this.f653F;
        C0230n0 c0230n0 = c0246r0.f839a;
        C0230n0 c0230n1 = c0246r0.f839a;
        if (c0230n0.f793o0) {
            AbstractC37831a.m121373a("place is called on a deactivated node");
        }
        c0246r0.f842d = EnumC0206h0.f693y;
        this.f661N = j7;
        this.f664Q = f13;
        this.f662O = function1;
        this.f663P = c23226c;
        this.f680g0 = false;
        Owner ownerM750a = AbstractC0242q0.m750a(c0230n1);
        if (this.f670W || !this.f667T) {
            this.f672Y.f576g = false;
            c0246r0.m758f(false);
            this.f681h0 = function1;
            this.f683j0 = j7;
            this.f684k0 = f13;
            this.f682i0 = c23226c;
            C0188c2 snapshotObserver = ownerM750a.getSnapshotObserver();
            snapshotObserver.m457a(c0230n1, snapshotObserver.f613f, this.f685l0);
        } else {
            NodeCoordinator nodeCoordinatorM753a = c0246r0.m753a();
            nodeCoordinatorM753a.m3553w1(C39178j.m124794d(j7, nodeCoordinatorM753a.f168210E), f13, function1, c23226c);
            m527L0();
        }
        c0246r0.f842d = EnumC0206h0.f689E;
        this.f658K = true;
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: O */
    public final int mo446O(int i13) {
        C0246r0 c0246r0 = this.f653F;
        if (!AbstractC0201g.m511k(c0246r0.f839a)) {
            m526I0();
            return c0246r0.m753a().mo446O(i13);
        }
        C0187c1 c0187c1 = c0246r0.f855q;
        AbstractC22676k.m65747g(c0187c1);
        return c0187c1.mo446O(i13);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m530O0(long j7, float f13, Function1 function1, C23226c c23226c) throws Throwable {
        boolean z4;
        AbstractC39101i1 placementScope;
        C0246r0 c0246r0 = this.f653F;
        C0230n0 c0230n0 = c0246r0.f839a;
        C0230n0 c0230n1 = c0246r0.f839a;
        boolean z13 = true;
        try {
            this.f668U = true;
            if (!C39178j.m124792b(j7, this.f661N) || this.f686m0) {
                if (c0246r0.f849k || c0246r0.f848j || this.f686m0) {
                    this.f670W = true;
                    this.f686m0 = false;
                }
                m525H0();
            }
            C0187c1 c0187c1 = c0246r0.f855q;
            if (c0187c1 != null) {
                C0246r0 c0246r1 = c0187c1.f588F;
                if (AbstractC0201g.m511k(c0246r1.f839a)) {
                    z4 = true;
                } else {
                    if (c0187c1.f600R == EnumC0268y0.f918y && !c0246r1.f840b) {
                        c0246r1.f841c = true;
                    }
                    z4 = c0246r1.f841c;
                }
                if (z4) {
                    NodeCoordinator nodeCoordinator = c0246r0.m753a().f4860Q;
                    if (nodeCoordinator == null || (placementScope = nodeCoordinator.f899L) == null) {
                        placementScope = AbstractC0242q0.m750a(c0230n1).getPlacementScope();
                    }
                    C0187c1 c0187c2 = c0246r0.f855q;
                    AbstractC22676k.m65747g(c0187c2);
                    C0230n0 c0230n0M588G = c0230n1.m588G();
                    if (c0230n0M588G != null) {
                        c0230n0M588G.m643t().f846h = 0;
                    }
                    c0187c2.f591I = Integer.MAX_VALUE;
                    placementScope.m124632f(c0187c2, (int) (j7 >> 32), (int) (4294967295L & j7), 0.0f);
                }
            }
            C0187c1 c0187c3 = c0246r0.f855q;
            if (c0187c3 == null || c0187c3.f594L) {
                z13 = false;
            }
            if (z13) {
                AbstractC37831a.m121374b("Error: Placement happened before lookahead.");
            }
            m529N0(j7, f13, function1, c23226c);
        } catch (Throwable th3) {
            c0230n0.m651y0(th3);
            throw null;
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final boolean m531P0(long j7) throws Throwable {
        C0246r0 c0246r0 = this.f653F;
        C0230n0 c0230n0 = c0246r0.f839a;
        C0230n0 c0230n1 = c0246r0.f839a;
        try {
            if (c0230n0.f793o0) {
                AbstractC37831a.m121373a("measure is called on a deactivated node");
            }
            Owner ownerM750a = AbstractC0242q0.m750a(c0230n1);
            C0230n0 c0230n0M588G = c0230n1.m588G();
            boolean z4 = true;
            c0230n1.f782d0 = c0230n1.f782d0 || (c0230n0M588G != null && c0230n0M588G.f782d0);
            if (!c0230n1.m577A() && C39169a.m124759c(this.f168214z, j7)) {
                ((AndroidComposeView) ownerM750a).m3585l(c0230n1, false);
                c0230n1.m649x0();
                return false;
            }
            this.f672Y.f575f = false;
            C30849c c30849cM595M = c0230n1.m595M();
            Object[] objArr = c30849cM595M.f127227w;
            int i13 = c30849cM595M.f127229y;
            for (int i14 = 0; i14 < i13; i14++) {
                ((C0230n0) objArr[i14]).m643t().f854p.f672Y.f572c = false;
            }
            this.f657J = true;
            long j13 = c0246r0.m753a().f168213y;
            m124636v0(j7);
            m528M0(j7);
            if (C39180l.m124799a(c0246r0.m753a().f168213y, j13) && c0246r0.m753a().f168211w == this.f168211w && c0246r0.m753a().f168212x == this.f168212x) {
                z4 = false;
            }
            m124635r0((((long) c0246r0.m753a().f168212x) & 4294967295L) | (((long) c0246r0.m753a().f168211w) << 32));
            return z4;
        } catch (Throwable th3) {
            c0230n0.m651y0(th3);
            throw null;
        }
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: Q */
    public final int mo447Q(int i13) {
        C0246r0 c0246r0 = this.f653F;
        if (!AbstractC0201g.m511k(c0246r0.f839a)) {
            m526I0();
            return c0246r0.m753a().mo447Q(i13);
        }
        C0187c1 c0187c1 = c0246r0.f855q;
        AbstractC22676k.m65747g(c0187c1);
        return c0187c1.mo447Q(i13);
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: T */
    public final AbstractC39104j1 mo448T(long j7) throws Throwable {
        EnumC0214j0 enumC0214j0;
        C0246r0 c0246r0 = this.f653F;
        C0230n0 c0230n0 = c0246r0.f839a;
        EnumC0214j0 enumC0214j1 = c0230n0.f780b0;
        EnumC0214j0 enumC0214j2 = EnumC0214j0.f715y;
        if (enumC0214j1 == enumC0214j2) {
            c0230n0.m613d();
        }
        if (AbstractC0201g.m511k(c0246r0.f839a)) {
            C0187c1 c0187c1 = c0246r0.f855q;
            AbstractC22676k.m65747g(c0187c1);
            c0187c1.f592J = enumC0214j2;
            c0187c1.mo448T(j7);
        }
        C0230n0 c0230n1 = c0246r0.f839a;
        C0230n0 c0230n0M588G = c0230n1.m588G();
        if (c0230n0M588G != null) {
            if (this.f659L != enumC0214j2 && !c0230n1.f782d0) {
                AbstractC37831a.m121374b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = c0230n0M588G.m646v().ordinal();
            if (iOrdinal == 0) {
                enumC0214j0 = EnumC0214j0.f713w;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + c0230n0M588G.m646v());
                }
                enumC0214j0 = EnumC0214j0.f714x;
            }
            this.f659L = enumC0214j0;
        } else {
            this.f659L = enumC0214j2;
        }
        m531P0(j7);
        return this;
    }

    @Override // p005a3.InterfaceC0181b
    /* JADX INFO: renamed from: a */
    public final AbstractC0177a mo425a() {
        return this.f672Y;
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: b */
    public final int mo449b(int i13) {
        C0246r0 c0246r0 = this.f653F;
        if (!AbstractC0201g.m511k(c0246r0.f839a)) {
            m526I0();
            return c0246r0.m753a().mo449b(i13);
        }
        C0187c1 c0187c1 = c0246r0.f855q;
        AbstractC22676k.m65747g(c0187c1);
        return c0187c1.mo449b(i13);
    }

    @Override // p005a3.InterfaceC0181b
    /* JADX INFO: renamed from: b0 */
    public final void mo426b0() {
        C0230n0.m575v0(this.f653F.f839a, false, 7);
    }

    @Override // p635y2.AbstractC39104j1
    /* JADX INFO: renamed from: c0 */
    public final int mo450c0(AbstractC39071a abstractC39071a) {
        C0246r0 c0246r0 = this.f653F;
        C0230n0 c0230n0M588G = c0246r0.f839a.m588G();
        EnumC0206h0 enumC0206h0M646v = c0230n0M588G != null ? c0230n0M588G.m646v() : null;
        EnumC0206h0 enumC0206h0 = EnumC0206h0.f691w;
        C0234o0 c0234o0 = this.f672Y;
        if (enumC0206h0M646v == enumC0206h0) {
            c0234o0.f572c = true;
        } else {
            C0230n0 c0230n0M588G2 = c0246r0.f839a.m588G();
            if ((c0230n0M588G2 != null ? c0230n0M588G2.m646v() : null) == EnumC0206h0.f693y) {
                c0234o0.f573d = true;
            }
        }
        this.f660M = true;
        int iMo450c0 = c0246r0.m753a().mo450c0(abstractC39071a);
        this.f660M = false;
        return iMo450c0;
    }

    @Override // p005a3.InterfaceC0181b
    /* JADX INFO: renamed from: e */
    public final void mo427e(C0006a1 c0006a1) {
        C30849c c30849cM595M = this.f653F.f839a.m595M();
        Object[] objArr = c30849cM595M.f127227w;
        int i13 = c30849cM595M.f127229y;
        for (int i14 = 0; i14 < i13; i14++) {
            c0006a1.invoke(((C0230n0) objArr[i14]).m643t().f854p);
        }
    }

    @Override // p005a3.InterfaceC0181b
    /* JADX INFO: renamed from: f */
    public final InterfaceC0181b mo428f() {
        C0246r0 c0246r0M643t;
        C0230n0 c0230n0M588G = this.f653F.f839a.m588G();
        if (c0230n0M588G == null || (c0246r0M643t = c0230n0M588G.m643t()) == null) {
            return null;
        }
        return c0246r0M643t.f854p;
    }

    @Override // p635y2.AbstractC39104j1
    /* JADX INFO: renamed from: g0 */
    public final int mo451g0() {
        return this.f653F.m753a().mo451g0();
    }

    @Override // p635y2.AbstractC39104j1
    /* JADX INFO: renamed from: j0 */
    public final int mo452j0() {
        return this.f653F.m753a().mo452j0();
    }

    @Override // p635y2.AbstractC39104j1
    /* JADX INFO: renamed from: o0 */
    public final void mo453o0(long j7, float f13, Function1 function1) throws Throwable {
        m530O0(j7, f13, function1, null);
    }

    @Override // p635y2.AbstractC39104j1, p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: p */
    public final Object mo454p() {
        return this.f666S;
    }

    @Override // p635y2.AbstractC39104j1
    /* JADX INFO: renamed from: p0 */
    public final void mo455p0(long j7, float f13, C23226c c23226c) throws Throwable {
        m530O0(j7, f13, null, c23226c);
    }

    @Override // p005a3.InterfaceC0181b
    public final void requestLayout() {
        this.f653F.f839a.m645u0(false);
    }

    @Override // p005a3.InterfaceC0211i1
    /* JADX INFO: renamed from: s */
    public final void mo456s(boolean z4) {
        C0246r0 c0246r0 = this.f653F;
        if (z4 != c0246r0.m753a().f896I) {
            c0246r0.m753a().f896I = z4;
            this.f686m0 = true;
        }
    }

    @Override // p005a3.InterfaceC0181b
    /* JADX INFO: renamed from: t */
    public final void mo429t() {
        this.f675b0 = true;
        C0234o0 c0234o0 = this.f672Y;
        c0234o0.m421i();
        boolean z4 = this.f670W;
        C0246r0 c0246r0 = this.f653F;
        if (z4) {
            C30849c c30849cM595M = c0246r0.f839a.m595M();
            Object[] objArr = c30849cM595M.f127227w;
            int i13 = c30849cM595M.f127229y;
            for (int i14 = 0; i14 < i13; i14++) {
                C0230n0 c0230n0 = (C0230n0) objArr[i14];
                if (c0230n0.m577A() && c0230n0.m579B() == EnumC0214j0.f713w && C0230n0.m573o0(c0230n0)) {
                    C0230n0.m575v0(c0246r0.f839a, false, 7);
                }
            }
        }
        if (this.f671X || (!this.f660M && !mo424J().f898K && this.f670W)) {
            this.f670W = false;
            EnumC0206h0 enumC0206h0 = c0246r0.f842d;
            c0246r0.f842d = EnumC0206h0.f693y;
            c0246r0.m759g(false);
            C0230n0 c0230n1 = c0246r0.f839a;
            C0188c2 snapshotObserver = AbstractC0242q0.m750a(c0230n1).getSnapshotObserver();
            snapshotObserver.m457a(c0230n1, snapshotObserver.f612e, this.f678e0);
            c0246r0.f842d = enumC0206h0;
            if (mo424J().f898K && c0246r0.f848j) {
                requestLayout();
            }
            this.f671X = false;
        }
        if (c0234o0.f573d) {
            c0234o0.f574e = true;
        }
        if (c0234o0.f571b && c0234o0.m418f()) {
            c0234o0.m420h();
        }
        this.f675b0 = false;
    }

    @Override // p005a3.InterfaceC0181b
    /* JADX INFO: renamed from: v */
    public final boolean mo430v() {
        return this.f667T;
    }
}
