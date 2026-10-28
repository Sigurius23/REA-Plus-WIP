package p005a3;

import androidx.compose.p018ui.node.NodeCoordinator;
import androidx.compose.p018ui.node.Owner;
import androidx.compose.p018ui.platform.AndroidComposeView;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import p026b2.AbstractC2316v;
import p031b9.AbstractC2875y;
import p042c2.C3858c;
import p042c2.C3859d;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p446r1.C30849c;
import p602x1.C37821g;
import p603x2.AbstractC37831a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a3.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0201g {

    /* JADX INFO: renamed from: a */
    public static final C0193e f651a = new C0193e(0);

    /* JADX INFO: renamed from: b */
    public static final C0269y1 f652b = new C0269y1(1);

    /* JADX INFO: renamed from: a */
    public static final void m501a(C30849c c30849c, AbstractC2316v abstractC2316v) {
        C30849c c30849cM595M = m516p(abstractC2316v).m595M();
        int i13 = c30849cM595M.f127229y - 1;
        Object[] objArr = c30849cM595M.f127227w;
        if (i13 < objArr.length) {
            while (i13 >= 0) {
                c30849c.m94885b((AbstractC2316v) ((C0230n0) objArr[i13]).f783e0.f743g);
                i13--;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m502b(C0189d c0189d) {
        C0224l2 c0224l2 = (C0224l2) m516p(c0189d).f783e0.f742f;
        AbstractC22676k.m65748h(c0224l2, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return c0224l2.f748O;
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC2316v m503c(InterfaceC0229n interfaceC0229n, int i13) {
        AbstractC2316v abstractC2316v = ((AbstractC2316v) interfaceC0229n).f9142w.f9133F;
        if (abstractC2316v == null || (abstractC2316v.f9145z & i13) == 0) {
            return null;
        }
        while (abstractC2316v != null) {
            int i14 = abstractC2316v.f9144y;
            if ((i14 & 2) != 0) {
                return null;
            }
            if ((i14 & i13) != 0) {
                return abstractC2316v;
            }
            abstractC2316v = abstractC2316v.f9133F;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final AbstractC2316v m504d(C30849c c30849c) {
        int i13;
        if (c30849c == null || (i13 = c30849c.f127229y) == 0) {
            return null;
        }
        return (AbstractC2316v) c30849c.m94894l(i13 - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static final InterfaceC0186c0 m505e(AbstractC2316v abstractC2316v) {
        if ((abstractC2316v.f9144y & 2) != 0) {
            if (abstractC2316v instanceof InterfaceC0186c0) {
                return (InterfaceC0186c0) abstractC2316v;
            }
            if (abstractC2316v instanceof AbstractC0233o) {
                AbstractC2316v abstractC2316v2 = ((AbstractC0233o) abstractC2316v).f804P;
                while (abstractC2316v2 != 0) {
                    if (abstractC2316v2 instanceof InterfaceC0186c0) {
                        return (InterfaceC0186c0) abstractC2316v2;
                    }
                    abstractC2316v2 = (!(abstractC2316v2 instanceof AbstractC0233o) || (abstractC2316v2.f9144y & 2) == 0) ? abstractC2316v2.f9133F : ((AbstractC0233o) abstractC2316v2).f804P;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final Object m506f(InterfaceC0225m interfaceC0225m, AbstractC28669t1 abstractC28669t1) {
        if (!((AbstractC2316v) interfaceC0225m).f9142w.f9141N) {
            AbstractC37831a.m121374b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        C37821g c37821g = (C37821g) m516p(interfaceC0225m).f779a0;
        c37821g.getClass();
        return AbstractC28683x.m87236D(c37821g, abstractC28669t1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [a3.n, a3.p2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX INFO: renamed from: g */
    public static final InterfaceC0240p2 m507g(InterfaceC0240p2 interfaceC0240p2) {
        C0223l1 c0223l1;
        AbstractC2316v abstractC2316v = (AbstractC2316v) interfaceC0240p2;
        if (!abstractC2316v.f9142w.f9141N) {
            AbstractC37831a.m121374b("visitAncestors called on an unattached node");
        }
        AbstractC2316v abstractC2316v2 = abstractC2316v.f9142w.f9132E;
        C0230n0 c0230n0M516p = m516p(interfaceC0240p2);
        while (c0230n0M516p != null) {
            if ((((AbstractC2316v) c0230n0M516p.f783e0.f743g).f9145z & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                while (abstractC2316v2 != null) {
                    if ((abstractC2316v2.f9144y & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                        ?? M504d = abstractC2316v2;
                        ?? c30849c = 0;
                        while (M504d != 0) {
                            if (M504d instanceof InterfaceC0240p2) {
                                InterfaceC0240p2 interfaceC0240p3 = (InterfaceC0240p2) M504d;
                                if (AbstractC22676k.m65745e(interfaceC0240p2.mo276f(), interfaceC0240p3.mo276f()) && interfaceC0240p2.getClass() == interfaceC0240p3.getClass()) {
                                    return interfaceC0240p3;
                                }
                            } else if ((M504d.f9144y & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 && (M504d instanceof AbstractC0233o)) {
                                AbstractC2316v abstractC2316v3 = ((AbstractC0233o) M504d).f804P;
                                int i13 = 0;
                                M504d = M504d;
                                c30849c = c30849c;
                                while (abstractC2316v3 != null) {
                                    if ((abstractC2316v3.f9144y & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            c30849c = c30849c;
                                            M504d = abstractC2316v3;
                                        } else {
                                            if (c30849c == 0) {
                                                c30849c = new C30849c(new AbstractC2316v[16]);
                                            }
                                            if (M504d != 0) {
                                                c30849c.m94885b(M504d);
                                                M504d = 0;
                                            }
                                            c30849c.m94885b(abstractC2316v3);
                                        }
                                    }
                                    abstractC2316v3 = abstractC2316v3.f9133F;
                                    M504d = M504d;
                                    c30849c = c30849c;
                                }
                                if (i13 == 1) {
                                }
                            }
                            M504d = m504d(c30849c);
                        }
                    }
                    abstractC2316v2 = abstractC2316v2.f9132E;
                }
            }
            c0230n0M516p = c0230n0M516p.m588G();
            abstractC2316v2 = (c0230n0M516p == null || (c0223l1 = c0230n0M516p.f783e0) == null) ? null : (C0224l2) c0223l1.f742f;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static final void m508h(InterfaceC0245r interfaceC0245r) {
        if (((AbstractC2316v) interfaceC0245r).f9142w.f9141N) {
            m514n(interfaceC0245r, 1).m3542n1();
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m509i(InterfaceC0186c0 interfaceC0186c0) {
        m516p(interfaceC0186c0).m600R();
    }

    /* JADX INFO: renamed from: j */
    public static final void m510j(InterfaceC0216j2 interfaceC0216j2) {
        m516p(interfaceC0216j2).m603V();
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m511k(C0230n0 c0230n0) {
        if (c0230n0.f759G == null) {
            return false;
        }
        C0230n0 c0230n0M588G = c0230n0.m588G();
        return (c0230n0M588G != null ? c0230n0M588G.f759G : null) == null || c0230n0.m643t().f840b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static final void m512l(AbstractC2316v abstractC2316v, InterfaceC4339a interfaceC4339a) {
        C0266x1 c0266x1 = abstractC2316v.f9134G;
        if (c0266x1 == null) {
            c0266x1 = new C0266x1((InterfaceC0263w1) abstractC2316v);
            abstractC2316v.f9134G = c0266x1;
        }
        m517q(abstractC2316v).getSnapshotObserver().m457a(c0266x1, C0197f.f637F, interfaceC4339a);
    }

    /* JADX INFO: renamed from: m */
    public static final void m513m(InterfaceC0229n interfaceC0229n) {
        C3859d c3859d;
        C0230n0 c0230n0M516p = m516p(interfaceC0229n);
        if (c0230n0M516p.f771S || (c3859d = ((AndroidComposeView) AbstractC0242q0.m750a(c0230n0M516p))._autofillManager) == null) {
            return;
        }
        c3859d.f15790d.f81183a.m1949g(c0230n0M516p.f795x, new C3858c(0, c3859d, c0230n0M516p));
    }

    /* JADX INFO: renamed from: n */
    public static final NodeCoordinator m514n(InterfaceC0229n interfaceC0229n, int i13) {
        NodeCoordinator nodeCoordinator = ((AbstractC2316v) interfaceC0229n).f9142w.f9135H;
        AbstractC22676k.m65747g(nodeCoordinator);
        if (nodeCoordinator.mo3533g1() != interfaceC0229n || !AbstractC0247r1.m769g(i13)) {
            return nodeCoordinator;
        }
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.f4859P;
        AbstractC22676k.m65747g(nodeCoordinator2);
        return nodeCoordinator2;
    }

    /* JADX INFO: renamed from: o */
    public static final NodeCoordinator m515o(InterfaceC0229n interfaceC0229n) {
        if (!((AbstractC2316v) interfaceC0229n).f9142w.f9141N) {
            AbstractC37831a.m121374b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        NodeCoordinator nodeCoordinatorM514n = m514n(interfaceC0229n, 2);
        if (!nodeCoordinatorM514n.mo3533g1().f9141N) {
            AbstractC37831a.m121374b("LayoutCoordinates is not attached.");
        }
        return nodeCoordinatorM514n;
    }

    /* JADX INFO: renamed from: p */
    public static final C0230n0 m516p(InterfaceC0229n interfaceC0229n) {
        NodeCoordinator nodeCoordinator = ((AbstractC2316v) interfaceC0229n).f9142w.f9135H;
        if (nodeCoordinator != null) {
            return nodeCoordinator.f4858O;
        }
        throw AbstractC2875y.m8310w("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    /* JADX INFO: renamed from: q */
    public static final Owner m517q(InterfaceC0229n interfaceC0229n) {
        Owner owner = m516p(interfaceC0229n).f765M;
        if (owner != null) {
            return owner;
        }
        throw AbstractC2875y.m8310w("This node does not have an owner.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v10, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX INFO: renamed from: r */
    public static final void m518r(InterfaceC0229n interfaceC0229n, Object obj, Function1 function1) {
        C0223l1 c0223l1;
        AbstractC2316v abstractC2316v = (AbstractC2316v) interfaceC0229n;
        if (!abstractC2316v.f9142w.f9141N) {
            AbstractC37831a.m121374b("visitAncestors called on an unattached node");
        }
        AbstractC2316v abstractC2316v2 = abstractC2316v.f9142w.f9132E;
        C0230n0 c0230n0M516p = m516p(interfaceC0229n);
        while (c0230n0M516p != null) {
            if ((((AbstractC2316v) c0230n0M516p.f783e0.f743g).f9145z & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                while (abstractC2316v2 != null) {
                    if ((abstractC2316v2.f9144y & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                        ?? M504d = abstractC2316v2;
                        ?? c30849c = 0;
                        while (M504d != 0) {
                            if (M504d instanceof InterfaceC0240p2) {
                                InterfaceC0240p2 interfaceC0240p2 = (InterfaceC0240p2) M504d;
                                if (!(obj.equals(interfaceC0240p2.mo276f()) ? ((Boolean) function1.invoke(interfaceC0240p2)).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((M504d.f9144y & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) && (M504d instanceof AbstractC0233o)) {
                                    AbstractC2316v abstractC2316v3 = ((AbstractC0233o) M504d).f804P;
                                    int i13 = 0;
                                    while (abstractC2316v3 != null) {
                                        if ((abstractC2316v3.f9144y & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                                            M504d = M504d;
                                            c30849c = c30849c;
                                            i13++;
                                            if (i13 == 1) {
                                                M504d = M504d;
                                                c30849c = c30849c;
                                                c30849c = c30849c;
                                                M504d = abstractC2316v3;
                                            } else {
                                                if (c30849c == 0) {
                                                    c30849c = new C30849c(new AbstractC2316v[16]);
                                                }
                                                if (M504d != 0) {
                                                    c30849c.m94885b(M504d);
                                                    M504d = 0;
                                                }
                                                c30849c.m94885b(abstractC2316v3);
                                            }
                                        } else {
                                            M504d = M504d;
                                            c30849c = c30849c;
                                            M504d = M504d;
                                            c30849c = c30849c;
                                        }
                                        abstractC2316v3 = abstractC2316v3.f9133F;
                                        M504d = M504d;
                                        c30849c = c30849c;
                                    }
                                    if (i13 == 1) {
                                        M504d = M504d;
                                        c30849c = c30849c;
                                    } else {
                                        M504d = M504d;
                                        c30849c = c30849c;
                                    }
                                }
                            }
                            M504d = m504d(c30849c);
                        }
                    }
                    abstractC2316v2 = abstractC2316v2.f9132E;
                }
            }
            c0230n0M516p = c0230n0M516p.m588G();
            abstractC2316v2 = (c0230n0M516p == null || (c0223l1 = c0230n0M516p.f783e0) == null) ? null : (C0224l2) c0223l1.f742f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [a3.n, a3.p2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX INFO: renamed from: s */
    public static final void m519s(InterfaceC0240p2 interfaceC0240p2, Function1 function1) {
        C0223l1 c0223l1;
        AbstractC2316v abstractC2316v = (AbstractC2316v) interfaceC0240p2;
        if (!abstractC2316v.f9142w.f9141N) {
            AbstractC37831a.m121374b("visitAncestors called on an unattached node");
        }
        AbstractC2316v abstractC2316v2 = abstractC2316v.f9142w.f9132E;
        C0230n0 c0230n0M516p = m516p(interfaceC0240p2);
        while (c0230n0M516p != null) {
            if ((((AbstractC2316v) c0230n0M516p.f783e0.f743g).f9145z & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                while (abstractC2316v2 != null) {
                    if ((abstractC2316v2.f9144y & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                        ?? M504d = abstractC2316v2;
                        ?? c30849c = 0;
                        while (M504d != 0) {
                            boolean zBooleanValue = true;
                            if (M504d instanceof InterfaceC0240p2) {
                                InterfaceC0240p2 interfaceC0240p3 = (InterfaceC0240p2) M504d;
                                if (AbstractC22676k.m65745e(interfaceC0240p2.mo276f(), interfaceC0240p3.mo276f()) && interfaceC0240p2.getClass() == interfaceC0240p3.getClass()) {
                                    zBooleanValue = ((Boolean) function1.invoke(interfaceC0240p3)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((M504d.f9144y & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) && (M504d instanceof AbstractC0233o)) {
                                    AbstractC2316v abstractC2316v3 = ((AbstractC0233o) M504d).f804P;
                                    int i13 = 0;
                                    while (abstractC2316v3 != null) {
                                        if ((abstractC2316v3.f9144y & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                                            M504d = M504d;
                                            c30849c = c30849c;
                                            i13++;
                                            if (i13 == 1) {
                                                M504d = M504d;
                                                c30849c = c30849c;
                                                c30849c = c30849c;
                                                M504d = abstractC2316v3;
                                            } else {
                                                if (c30849c == 0) {
                                                    c30849c = new C30849c(new AbstractC2316v[16]);
                                                }
                                                if (M504d != 0) {
                                                    c30849c.m94885b(M504d);
                                                    M504d = 0;
                                                }
                                                c30849c.m94885b(abstractC2316v3);
                                            }
                                        } else {
                                            M504d = M504d;
                                            c30849c = c30849c;
                                            M504d = M504d;
                                            c30849c = c30849c;
                                        }
                                        abstractC2316v3 = abstractC2316v3.f9133F;
                                        M504d = M504d;
                                        c30849c = c30849c;
                                    }
                                    if (i13 == 1) {
                                        M504d = M504d;
                                        c30849c = c30849c;
                                    } else {
                                        M504d = M504d;
                                        c30849c = c30849c;
                                    }
                                }
                            }
                            M504d = m504d(c30849c);
                        }
                    }
                    abstractC2316v2 = abstractC2316v2.f9132E;
                }
            }
            c0230n0M516p = c0230n0M516p.m588G();
            abstractC2316v2 = (c0230n0M516p == null || (c0223l1 = c0230n0M516p.f783e0) == null) ? null : (C0224l2) c0223l1.f742f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [a3.p2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: t */
    public static final void m520t(InterfaceC0240p2 interfaceC0240p2, Function1 function1) {
        AbstractC2316v abstractC2316v = (AbstractC2316v) interfaceC0240p2;
        if (!abstractC2316v.f9142w.f9141N) {
            AbstractC37831a.m121374b("visitSubtreeIf called on an unattached node");
        }
        C30849c c30849c = new C30849c(new AbstractC2316v[16]);
        AbstractC2316v abstractC2316v2 = abstractC2316v.f9142w;
        AbstractC2316v abstractC2316v3 = abstractC2316v2.f9133F;
        if (abstractC2316v3 == null) {
            m501a(c30849c, abstractC2316v2);
        } else {
            c30849c.m94885b(abstractC2316v3);
        }
        while (true) {
            int i13 = c30849c.f127229y;
            if (i13 == 0) {
                return;
            }
            AbstractC2316v abstractC2316v4 = (AbstractC2316v) c30849c.m94894l(i13 - 1);
            if ((abstractC2316v4.f9145z & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                AbstractC2316v abstractC2316v5 = abstractC2316v4;
                while (true) {
                    if (abstractC2316v5 != null) {
                        if ((abstractC2316v5.f9144y & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                            ?? M504d = abstractC2316v5;
                            ?? c30849c2 = 0;
                            while (M504d != 0) {
                                if (M504d instanceof InterfaceC0240p2) {
                                    InterfaceC0240p2 interfaceC0240p3 = (InterfaceC0240p2) M504d;
                                    EnumC0236o2 enumC0236o2 = (AbstractC22676k.m65745e(interfaceC0240p2.mo276f(), interfaceC0240p3.mo276f()) && interfaceC0240p2.getClass() == interfaceC0240p3.getClass()) ? (EnumC0236o2) function1.invoke(interfaceC0240p3) : EnumC0236o2.f807w;
                                    if (enumC0236o2 != EnumC0236o2.f809y) {
                                        if (enumC0236o2 == EnumC0236o2.f808x) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((M504d.f9144y & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 && (M504d instanceof AbstractC0233o)) {
                                    AbstractC2316v abstractC2316v6 = ((AbstractC0233o) M504d).f804P;
                                    int i14 = 0;
                                    M504d = M504d;
                                    c30849c2 = c30849c2;
                                    while (abstractC2316v6 != null) {
                                        if ((abstractC2316v6.f9144y & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                                            i14++;
                                            if (i14 == 1) {
                                                c30849c2 = c30849c2;
                                                M504d = abstractC2316v6;
                                            } else {
                                                if (c30849c2 == 0) {
                                                    c30849c2 = new C30849c(new AbstractC2316v[16]);
                                                }
                                                if (M504d != 0) {
                                                    c30849c2.m94885b(M504d);
                                                    M504d = 0;
                                                }
                                                c30849c2.m94885b(abstractC2316v6);
                                            }
                                        }
                                        abstractC2316v6 = abstractC2316v6.f9133F;
                                        M504d = M504d;
                                        c30849c2 = c30849c2;
                                    }
                                    if (i14 == 1) {
                                    }
                                }
                                M504d = m504d(c30849c2);
                            }
                        }
                        abstractC2316v5 = abstractC2316v5.f9133F;
                    }
                }
            }
            m501a(c30849c, abstractC2316v4);
        }
    }
}
