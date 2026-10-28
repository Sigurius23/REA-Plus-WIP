package androidx.compose.p018ui.node;

import com.google.crypto.tink.internal.C5101l0;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0233o;
import p005a3.AbstractC0242q0;
import p005a3.AbstractC0247r1;
import p005a3.AbstractC0265x0;
import p005a3.C0193e;
import p005a3.C0203g1;
import p005a3.C0223l1;
import p005a3.C0224l2;
import p005a3.C0230n0;
import p005a3.C0234o0;
import p005a3.C0258v;
import p005a3.C0261w;
import p005a3.EnumC0206h0;
import p005a3.EnumC0214j0;
import p005a3.InterfaceC0200f2;
import p026b2.AbstractC2316v;
import p097ds.AbstractC12313p;
import p208i2.AbstractC17918w0;
import p208i2.C17887h;
import p208i2.C17919x;
import p208i2.InterfaceC17915v;
import p209i3.C18030l;
import p293l2.C23226c;
import p446r1.C30849c;
import p512u2.AbstractC34454d0;
import p603x2.AbstractC37831a;
import p635y2.AbstractC39071a;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: androidx.compose.ui.node.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1134a extends NodeCoordinator {

    /* JADX INFO: renamed from: r0 */
    public static final C17887h f4880r0;

    /* JADX INFO: renamed from: p0 */
    public final C0224l2 f4881p0;

    /* JADX INFO: renamed from: q0 */
    public C0261w f4882q0;

    static {
        C17887h c17887hM51522j = AbstractC17918w0.m51522j();
        c17887hM51522j.m51447e(C17919x.f69630g);
        c17887hM51522j.m51454l(1.0f);
        c17887hM51522j.m51455m(1);
        f4880r0 = c17887hM51522j;
    }

    public C1134a(C0230n0 c0230n0) {
        super(c0230n0);
        C0224l2 c0224l2 = new C0224l2();
        c0224l2.f9145z = 0;
        this.f4881p0 = c0224l2;
        c0224l2.f9135H = this;
        this.f4882q0 = c0230n0.f759G != null ? new C0261w(this) : null;
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: C */
    public final int mo438C(int i13) {
        C5101l0 c5101l0M585E = this.f4858O.m585E();
        InterfaceC39127r0 interfaceC39127r0M16038R = c5101l0M585E.m16038R();
        C0230n0 c0230n0 = (C0230n0) c5101l0M585E.f21443x;
        return interfaceC39127r0M16038R.mo537b((NodeCoordinator) c0230n0.f783e0.f741e, c0230n0.m635p(), i13);
    }

    @Override // p005a3.AbstractC0262w0
    /* JADX INFO: renamed from: F0 */
    public final int mo475F0(AbstractC39071a abstractC39071a) {
        C0261w c0261w = this.f4882q0;
        if (c0261w != null) {
            return c0261w.mo475F0(abstractC39071a);
        }
        C0203g1 c0203g1 = this.f4858O.m643t().f854p;
        C0234o0 c0234o0 = c0203g1.f672Y;
        if (!c0203g1.f660M) {
            if (c0203g1.f653F.f842d == EnumC0206h0.f691w) {
                c0234o0.f575f = true;
                if (c0234o0.f571b) {
                    c0203g1.f670W = true;
                    c0203g1.f671X = true;
                }
            } else {
                c0234o0.f576g = true;
            }
        }
        c0203g1.mo424J().f898K = true;
        c0203g1.mo429t();
        c0203g1.mo424J().f898K = false;
        Integer num = (Integer) c0234o0.f578i.get(abstractC39071a);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: O */
    public final int mo446O(int i13) {
        C5101l0 c5101l0M585E = this.f4858O.m585E();
        InterfaceC39127r0 interfaceC39127r0M16038R = c5101l0M585E.m16038R();
        C0230n0 c0230n0 = (C0230n0) c5101l0M585E.f21443x;
        return interfaceC39127r0M16038R.mo540e((NodeCoordinator) c0230n0.f783e0.f741e, c0230n0.m635p(), i13);
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: Q */
    public final int mo447Q(int i13) {
        C5101l0 c5101l0M585E = this.f4858O.m585E();
        InterfaceC39127r0 interfaceC39127r0M16038R = c5101l0M585E.m16038R();
        C0230n0 c0230n0 = (C0230n0) c5101l0M585E.f21443x;
        return interfaceC39127r0M16038R.mo538c((NodeCoordinator) c0230n0.f783e0.f741e, c0230n0.m635p(), i13);
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: T */
    public final AbstractC39104j1 mo448T(long j7) {
        m124636v0(j7);
        C0230n0 c0230n0 = this.f4858O;
        C30849c c30849cM595M = c0230n0.m595M();
        Object[] objArr = c30849cM595M.f127227w;
        int i13 = c30849cM595M.f127229y;
        for (int i14 = 0; i14 < i13; i14++) {
            ((C0230n0) objArr[i14]).m652z().f659L = EnumC0214j0.f715y;
        }
        m3557z1(c0230n0.f774V.mo521a(this, c0230n0.m635p(), j7));
        m3548r1();
        return this;
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: b */
    public final int mo449b(int i13) {
        C5101l0 c5101l0M585E = this.f4858O.m585E();
        InterfaceC39127r0 interfaceC39127r0M16038R = c5101l0M585E.m16038R();
        C0230n0 c0230n0 = (C0230n0) c5101l0M585E.f21443x;
        return interfaceC39127r0M16038R.mo539d((NodeCoordinator) c0230n0.f783e0.f741e, c0230n0.m635p(), i13);
    }

    @Override // androidx.compose.p018ui.node.NodeCoordinator
    /* JADX INFO: renamed from: b1 */
    public final void mo3526b1() {
        if (this.f4882q0 == null) {
            this.f4882q0 = new C0261w(this);
        }
    }

    @Override // androidx.compose.p018ui.node.NodeCoordinator
    /* JADX INFO: renamed from: e1 */
    public final AbstractC0265x0 mo3530e1() {
        return this.f4882q0;
    }

    @Override // androidx.compose.p018ui.node.NodeCoordinator
    /* JADX INFO: renamed from: g1 */
    public final AbstractC2316v mo3533g1() {
        return this.f4881p0;
    }

    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0073  */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    /* JADX WARN: Code duplicated, block: B:87:0x013a A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // androidx.compose.p018ui.node.NodeCoordinator
    /* JADX INFO: renamed from: m1 */
    public final void mo3540m1(C0193e c0193e, long j7, C0258v c0258v, int i13, boolean z4) {
        boolean z13;
        int i14;
        boolean z14;
        boolean z15;
        Object[] objArr;
        int i15;
        C0230n0 c0230n0;
        C0230n0 c0230n1;
        long jM774a;
        long j13 = j7;
        C0258v c0258v2 = c0258v;
        int i16 = c0193e.f623w;
        C0230n0 c0230n2 = this.f4858O;
        switch (i16) {
            case 1:
                z13 = true;
                break;
            default:
                C18030l c18030lM591I = c0230n2.m591I();
                z13 = !(c18030lM591I != null && c18030lM591I.f69983z);
                break;
        }
        if (z13) {
            if (m3514H1(j13)) {
                i14 = i13;
                z14 = z4;
                z15 = true;
            } else {
                i14 = i13;
                if (AbstractC34454d0.m108915f(i14, 1) && (Float.floatToRawIntBits(m3522Y0(j13, m3531f1())) & Integer.MAX_VALUE) < 2139095040) {
                    z15 = true;
                    z14 = false;
                }
            }
            if (z15) {
                int i17 = c0258v2.f883y;
                C30849c c30849cM594L = c0230n2.m594L();
                objArr = c30849cM594L.f127227w;
                i15 = c30849cM594L.f127229y - 1;
                while (i15 >= 0) {
                    c0230n0 = (C0230n0) objArr[i15];
                    if (c0230n0.m606Y()) {
                        switch (c0193e.f623w) {
                            case 1:
                                c0230n0.m596N(j13, c0258v2, i14, z14);
                                c0230n1 = c0230n0;
                                break;
                            default:
                                C0223l1 c0223l1 = c0230n0.f783e0;
                                ((NodeCoordinator) c0223l1.f741e).m3539l1(NodeCoordinator.f4857o0, ((NodeCoordinator) c0223l1.f741e).m3529d1(j13), c0258v2, 1, z14);
                                c0258v2 = c0258v;
                                c0230n1 = c0230n0;
                                break;
                        }
                        jM774a = c0258v2.m774a();
                        if (AbstractC12313p.m34256H(jM774a) < 0.0f && AbstractC12313p.m34260L(jM774a) && !AbstractC12313p.m34259K(jM774a)) {
                            NodeCoordinator nodeCoordinator = (NodeCoordinator) c0230n1.f783e0.f741e;
                            nodeCoordinator.getClass();
                            AbstractC2316v abstractC2316vM3535i1 = nodeCoordinator.m3535i1(AbstractC0247r1.m769g(16));
                            if (abstractC2316vM3535i1 != null && abstractC2316vM3535i1.f9141N) {
                                if (!abstractC2316vM3535i1.f9142w.f9141N) {
                                    AbstractC37831a.m121374b("visitLocalDescendants called on an unattached node");
                                }
                                AbstractC2316v abstractC2316v = abstractC2316vM3535i1.f9142w;
                                if ((abstractC2316v.f9145z & 16) != 0) {
                                    while (true) {
                                        if (abstractC2316v != null) {
                                            if ((abstractC2316v.f9144y & 16) != 0) {
                                                ?? M504d = abstractC2316v;
                                                ?? c30849c = 0;
                                                while (M504d != 0) {
                                                    if (M504d instanceof InterfaceC0200f2) {
                                                        if (((InterfaceC0200f2) M504d).mo458C0()) {
                                                            c0258v2.f883y = c0258v2.f881w.f137b - 1;
                                                            break;
                                                        }
                                                    } else if ((M504d.f9144y & 16) != 0 && (M504d instanceof AbstractC0233o)) {
                                                        AbstractC2316v abstractC2316v2 = ((AbstractC0233o) M504d).f804P;
                                                        int i18 = 0;
                                                        while (abstractC2316v2 != null) {
                                                            if ((abstractC2316v2.f9144y & 16) != 0) {
                                                                i18++;
                                                                if (i18 == 1) {
                                                                    M504d = M504d;
                                                                    c30849c = c30849c;
                                                                    c30849c = c30849c;
                                                                    M504d = abstractC2316v2;
                                                                } else {
                                                                    if (c30849c == 0) {
                                                                        c30849c = new C30849c(new AbstractC2316v[16]);
                                                                    }
                                                                    if (M504d != 0) {
                                                                        c30849c.m94885b(M504d);
                                                                        M504d = 0;
                                                                    }
                                                                    c30849c.m94885b(abstractC2316v2);
                                                                }
                                                            } else {
                                                                M504d = M504d;
                                                                c30849c = c30849c;
                                                            }
                                                            abstractC2316v2 = abstractC2316v2.f9133F;
                                                            M504d = M504d;
                                                            c30849c = c30849c;
                                                        }
                                                        if (i18 == 1) {
                                                            M504d = M504d;
                                                            c30849c = c30849c;
                                                        } else {
                                                            M504d = M504d;
                                                            c30849c = c30849c;
                                                        }
                                                    }
                                                    M504d = AbstractC0201g.m504d(c30849c);
                                                }
                                            }
                                            abstractC2316v = abstractC2316v.f9133F;
                                        }
                                    }
                                }
                            }
                            c0258v2.f883y = i17;
                        }
                    }
                    i15--;
                    j13 = j7;
                    i14 = i13;
                }
                c0258v2.f883y = i17;
            }
        }
        i14 = i13;
        z14 = z4;
        z15 = false;
        if (z15) {
            int i19 = c0258v2.f883y;
            C30849c c30849cM594L2 = c0230n2.m594L();
            objArr = c30849cM594L2.f127227w;
            i15 = c30849cM594L2.f127229y - 1;
            while (i15 >= 0) {
                c0230n0 = (C0230n0) objArr[i15];
                if (c0230n0.m606Y()) {
                    switch (c0193e.f623w) {
                        case 1:
                            c0230n0.m596N(j13, c0258v2, i14, z14);
                            c0230n1 = c0230n0;
                            break;
                        default:
                            C0223l1 c0223l2 = c0230n0.f783e0;
                            ((NodeCoordinator) c0223l2.f741e).m3539l1(NodeCoordinator.f4857o0, ((NodeCoordinator) c0223l2.f741e).m3529d1(j13), c0258v2, 1, z14);
                            c0258v2 = c0258v;
                            c0230n1 = c0230n0;
                            break;
                    }
                    jM774a = c0258v2.m774a();
                    if (AbstractC12313p.m34256H(jM774a) < 0.0f) {
                        continue;
                    }
                }
                i15--;
                j13 = j7;
                i14 = i13;
            }
            c0258v2.f883y = i19;
        }
    }

    @Override // p635y2.AbstractC39104j1
    /* JADX INFO: renamed from: o0 */
    public final void mo453o0(long j7, float f13, Function1 function1) {
        m3553w1(j7, f13, function1, null);
        if (this.f897J) {
            return;
        }
        this.f4858O.m652z().m527L0();
    }

    @Override // androidx.compose.p018ui.node.NodeCoordinator, p635y2.AbstractC39104j1
    /* JADX INFO: renamed from: p0 */
    public final void mo455p0(long j7, float f13, C23226c c23226c) {
        m3553w1(j7, f13, null, c23226c);
        if (this.f897J) {
            return;
        }
        this.f4858O.m652z().m527L0();
    }

    @Override // androidx.compose.p018ui.node.NodeCoordinator
    /* JADX INFO: renamed from: v1 */
    public final void mo3552v1(InterfaceC17915v interfaceC17915v, C23226c c23226c) throws Throwable {
        C0230n0 c0230n0 = this.f4858O;
        Owner ownerM750a = AbstractC0242q0.m750a(c0230n0);
        C30849c c30849cM594L = c0230n0.m594L();
        Object[] objArr = c30849cM594L.f127227w;
        int i13 = c30849cM594L.f127229y;
        for (int i14 = 0; i14 < i13; i14++) {
            C0230n0 c0230n1 = (C0230n0) objArr[i14];
            if (c0230n1.m606Y()) {
                c0230n1.m627k(interfaceC17915v, c23226c);
            }
        }
        if (ownerM750a.getShowLayoutBounds()) {
            long j7 = this.f168213y;
            interfaceC17915v.mo51412b(0.5f, 0.5f, ((int) (j7 >> 32)) - 0.5f, ((int) (j7 & 4294967295L)) - 0.5f, f4880r0);
        }
    }
}
