package p209i3;

import androidx.compose.p018ui.node.C1134a;
import androidx.compose.p018ui.node.NodeCoordinator;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import p002a0.C0057v0;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0233o;
import p005a3.C0227m1;
import p005a3.C0230n0;
import p005a3.InterfaceC0216j2;
import p026b2.AbstractC2316v;
import p181h2.C16618c;
import p446r1.C30849c;
import p635y2.AbstractC39125q1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: i3.p */
/* JADX INFO: loaded from: classes.dex */
public final class C18034p {

    /* JADX INFO: renamed from: a */
    public final AbstractC2316v f69986a;

    /* JADX INFO: renamed from: b */
    public final boolean f69987b;

    /* JADX INFO: renamed from: c */
    public final C0230n0 f69988c;

    /* JADX INFO: renamed from: d */
    public final C18030l f69989d;

    /* JADX INFO: renamed from: e */
    public boolean f69990e;

    /* JADX INFO: renamed from: f */
    public C18034p f69991f;

    /* JADX INFO: renamed from: g */
    public final int f69992g;

    public C18034p(AbstractC2316v abstractC2316v, boolean z4, C0230n0 c0230n0, C18030l c18030l) {
        this.f69986a = abstractC2316v;
        this.f69987b = z4;
        this.f69988c = c0230n0;
        this.f69989d = c18030l;
        this.f69992g = c0230n0.f795x;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ List m51776j(int i13, C18034p c18034p) {
        return c18034p.m51785i((i13 & 1) != 0 ? !c18034p.f69987b : false, (i13 & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX INFO: renamed from: a */
    public final C16618c m51777a(NodeCoordinator nodeCoordinator) {
        ?? M504d;
        C18034p c18034pM51787l = m51787l();
        if (c18034pM51787l == null) {
            return C16618c.f63938e;
        }
        AbstractC2316v abstractC2316v = (AbstractC2316v) c18034pM51787l.f69988c.f783e0.f743g;
        if ((abstractC2316v.f9145z & 8) == 0) {
            M504d = 0;
            break;
        }
        loop0: while (true) {
            if (abstractC2316v != null) {
                if ((abstractC2316v.f9144y & 8) != 0) {
                    M504d = abstractC2316v;
                    ?? c30849c = 0;
                    while (M504d != 0) {
                        if (M504d instanceof InterfaceC0216j2) {
                            if (((InterfaceC0216j2) M504d).mo543e()) {
                                break loop0;
                            }
                        } else if ((M504d.f9144y & 8) != 0 && (M504d instanceof AbstractC0233o)) {
                            AbstractC2316v abstractC2316v2 = ((AbstractC0233o) M504d).f804P;
                            int i13 = 0;
                            while (abstractC2316v2 != null) {
                                if ((abstractC2316v2.f9144y & 8) != 0) {
                                    i13++;
                                    if (i13 == 1) {
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
                            if (i13 == 1) {
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
                if ((abstractC2316v.f9145z & 8) != 0) {
                    abstractC2316v = abstractC2316v.f9133F;
                }
            }
            M504d = 0;
            break;
        }
        InterfaceC0216j2 interfaceC0216j2 = (InterfaceC0216j2) M504d;
        NodeCoordinator nodeCoordinatorM514n = interfaceC0216j2 != null ? AbstractC0201g.m514n(interfaceC0216j2, 8) : null;
        return nodeCoordinatorM514n == null ? c18034pM51787l.m51777a(nodeCoordinator) : nodeCoordinatorM514n.mo3547r(nodeCoordinator, true);
    }

    /* JADX INFO: renamed from: b */
    public final C18034p m51778b(C18027i c18027i, Function1 function1) {
        C18030l c18030l = new C18030l();
        c18030l.f69982y = false;
        c18030l.f69983z = false;
        function1.invoke(c18030l);
        C18034p c18034p = new C18034p(new C18033o(function1), false, new C0230n0(true, this.f69992g + (c18027i != null ? 1000000000 : 2000000000)), c18030l);
        c18034p.f69990e = true;
        c18034p.f69991f = this;
        return c18034p;
    }

    /* JADX INFO: renamed from: c */
    public final void m51779c(C0230n0 c0230n0, ArrayList arrayList) {
        C30849c c30849cM594L = c0230n0.m594L();
        Object[] objArr = c30849cM594L.f127227w;
        int i13 = c30849cM594L.f127229y;
        for (int i14 = 0; i14 < i13; i14++) {
            C0230n0 c0230n1 = (C0230n0) objArr[i14];
            if (c0230n1.m605X() && !c0230n1.f793o0) {
                if (c0230n1.f783e0.m560j(8)) {
                    arrayList.add(AbstractC18037s.m51796a(c0230n1, this.f69987b));
                } else {
                    m51779c(c0230n1, arrayList);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final NodeCoordinator m51780d() {
        if (!this.f69990e) {
            InterfaceC0216j2 interfaceC0216j2M51782f = m51782f();
            return interfaceC0216j2M51782f != null ? AbstractC0201g.m514n(interfaceC0216j2M51782f, 8) : (C1134a) this.f69988c.f783e0.f740d;
        }
        C18034p c18034pM51787l = m51787l();
        if (c18034pM51787l != null) {
            return c18034pM51787l.m51780d();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m51781e(ArrayList arrayList, ArrayList arrayList2) {
        m51793r(false, arrayList);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            C18034p c18034p = (C18034p) arrayList.get(size2);
            if (c18034p.m51790o()) {
                arrayList2.add(c18034p);
            } else if (!c18034p.f69989d.f69983z) {
                c18034p.m51781e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX INFO: renamed from: f */
    public final InterfaceC0216j2 m51782f() {
        ?? M504d;
        boolean z4 = this.f69989d.f69982y;
        C0230n0 c0230n0 = this.f69988c;
        ?? r10 = 0;
        r10 = 0;
        r10 = 0;
        r10 = 0;
        if (!z4) {
            AbstractC2316v abstractC2316v = (AbstractC2316v) c0230n0.f783e0.f743g;
            if ((abstractC2316v.f9145z & 8) != 0) {
                loop3: while (abstractC2316v != null) {
                    if ((abstractC2316v.f9144y & 8) != 0) {
                        M504d = abstractC2316v;
                        ?? c30849c = 0;
                        while (true) {
                            if (M504d != 0) {
                                if (M504d instanceof InterfaceC0216j2) {
                                    if (((InterfaceC0216j2) M504d).mo543e()) {
                                        r10 = M504d;
                                    }
                                } else if ((M504d.f9144y & 8) != 0 && (M504d instanceof AbstractC0233o)) {
                                    AbstractC2316v abstractC2316v2 = ((AbstractC0233o) M504d).f804P;
                                    int i13 = 0;
                                    while (abstractC2316v2 != null) {
                                        if ((abstractC2316v2.f9144y & 8) != 0) {
                                            i13++;
                                            if (i13 == 1) {
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
                                    if (i13 == 1) {
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
                    }
                    if ((abstractC2316v.f9145z & 8) == 0) {
                        break;
                    }
                    abstractC2316v = abstractC2316v.f9133F;
                }
            }
        } else {
            AbstractC2316v abstractC2316v3 = (AbstractC2316v) c0230n0.f783e0.f743g;
            if ((abstractC2316v3.f9145z & 8) != 0) {
                M504d = 0;
                while (abstractC2316v3 != null) {
                    if ((abstractC2316v3.f9144y & 8) != 0) {
                        ?? M504d2 = abstractC2316v3;
                        ?? c30849c2 = 0;
                        while (M504d2 != 0) {
                            if (M504d2 instanceof InterfaceC0216j2) {
                                InterfaceC0216j2 interfaceC0216j2 = (InterfaceC0216j2) M504d2;
                                if (interfaceC0216j2.mo543e()) {
                                    if (interfaceC0216j2.mo542H0()) {
                                        return interfaceC0216j2;
                                    }
                                    if (M504d == 0) {
                                        M504d = interfaceC0216j2;
                                    }
                                }
                            } else if ((M504d2.f9144y & 8) != 0 && (M504d2 instanceof AbstractC0233o)) {
                                AbstractC2316v abstractC2316v4 = ((AbstractC0233o) M504d2).f804P;
                                int i14 = 0;
                                while (abstractC2316v4 != null) {
                                    if ((abstractC2316v4.f9144y & 8) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            M504d2 = M504d2;
                                            c30849c2 = c30849c2;
                                            c30849c2 = c30849c2;
                                            M504d2 = abstractC2316v4;
                                        } else {
                                            if (c30849c2 == 0) {
                                                c30849c2 = new C30849c(new AbstractC2316v[16]);
                                            }
                                            if (M504d2 != 0) {
                                                c30849c2.m94885b(M504d2);
                                                M504d2 = 0;
                                            }
                                            c30849c2.m94885b(abstractC2316v4);
                                        }
                                    } else {
                                        M504d2 = M504d2;
                                        c30849c2 = c30849c2;
                                    }
                                    abstractC2316v4 = abstractC2316v4.f9133F;
                                    M504d2 = M504d2;
                                    c30849c2 = c30849c2;
                                }
                                if (i14 == 1) {
                                    M504d2 = M504d2;
                                    c30849c2 = c30849c2;
                                } else {
                                    M504d2 = M504d2;
                                    c30849c2 = c30849c2;
                                }
                            }
                            M504d2 = AbstractC0201g.m504d(c30849c2);
                        }
                    }
                    if ((abstractC2316v3.f9145z & 8) == 0) {
                        break;
                    }
                    abstractC2316v3 = abstractC2316v3.f9133F;
                    M504d = M504d;
                }
                r10 = M504d;
            }
        }
        return (InterfaceC0216j2) r10;
    }

    /* JADX INFO: renamed from: g */
    public final C16618c m51783g() {
        NodeCoordinator nodeCoordinatorM51780d = m51780d();
        if (nodeCoordinatorM51780d != null) {
            if (!nodeCoordinatorM51780d.mo3533g1().f9141N) {
                nodeCoordinatorM51780d = null;
            }
            if (nodeCoordinatorM51780d != null) {
                return AbstractC39125q1.m124662h(nodeCoordinatorM51780d).mo3547r(nodeCoordinatorM51780d, true);
            }
        }
        return C16618c.f63938e;
    }

    /* JADX INFO: renamed from: h */
    public final C16618c m51784h() {
        NodeCoordinator nodeCoordinatorM51780d = m51780d();
        if (nodeCoordinatorM51780d != null) {
            if (!nodeCoordinatorM51780d.mo3533g1().f9141N) {
                nodeCoordinatorM51780d = null;
            }
            if (nodeCoordinatorM51780d != null) {
                return AbstractC39125q1.m124660f(nodeCoordinatorM51780d);
            }
        }
        return C16618c.f63938e;
    }

    /* JADX INFO: renamed from: i */
    public final List m51785i(boolean z4, boolean z13) {
        if (!z4 && this.f69989d.f69983z) {
            return C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList();
        if (!m51790o()) {
            return m51793r(z13, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        m51781e(arrayList, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: k */
    public final C18030l m51786k() {
        boolean zM51790o = m51790o();
        C18030l c18030l = this.f69989d;
        if (!zM51790o) {
            return c18030l;
        }
        C18030l c18030lM51769a = c18030l.m51769a();
        m51792q(new ArrayList(), c18030lM51769a);
        return c18030lM51769a;
    }

    /* JADX INFO: renamed from: l */
    public final C18034p m51787l() {
        C0230n0 c0230n0M588G;
        C18034p c18034p = this.f69991f;
        if (c18034p != null) {
            return c18034p;
        }
        C0230n0 c0230n0 = this.f69988c;
        boolean z4 = this.f69987b;
        if (!z4) {
            c0230n0M588G = null;
            break;
        }
        c0230n0M588G = c0230n0.m588G();
        while (true) {
            if (c0230n0M588G == null) {
                c0230n0M588G = null;
                break;
            }
            C18030l c18030lM591I = c0230n0M588G.m591I();
            if (c18030lM591I != null && c18030lM591I.f69982y) {
                break;
            }
            c0230n0M588G = c0230n0M588G.m588G();
        }
        if (c0230n0M588G == null) {
            for (C0230n0 c0230n0M588G2 = c0230n0.m588G(); c0230n0M588G2 != null; c0230n0M588G2 = c0230n0M588G2.m588G()) {
                if (c0230n0M588G2.f783e0.m560j(8)) {
                    c0230n0M588G = c0230n0M588G2;
                }
            }
            c0230n0M588G = null;
        }
        if (c0230n0M588G == null) {
            return null;
        }
        return AbstractC18037s.m51796a(c0230n0M588G, z4);
    }

    /* JADX INFO: renamed from: m */
    public final long m51788m() {
        NodeCoordinator nodeCoordinatorM51780d = m51780d();
        if (nodeCoordinatorM51780d != null) {
            if (!nodeCoordinatorM51780d.mo3533g1().f9141N) {
                nodeCoordinatorM51780d = null;
            }
            if (nodeCoordinatorM51780d != null) {
                return nodeCoordinatorM51780d.mo3510E(0L);
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: n */
    public final C18030l m51789n() {
        return this.f69989d;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m51790o() {
        return this.f69987b && this.f69989d.f69982y;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: p */
    public final boolean m51791p() {
        if (this.f69990e || !m51776j(4, this).isEmpty()) {
            return false;
        }
        C0230n0 c0230n0M588G = this.f69988c.m588G();
        while (c0230n0M588G != null) {
            C18030l c18030lM591I = c0230n0M588G.m591I();
            if (c18030lM591I != null && c18030lM591I.f69982y) {
                if (c0230n0M588G == null) {
                    return true;
                }
                return false;
            }
            c0230n0M588G = c0230n0M588G.m588G();
        }
        c0230n0M588G = null;
        if (c0230n0M588G == null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final void m51792q(ArrayList arrayList, C18030l c18030l) {
        if (this.f69989d.f69983z) {
            return;
        }
        m51793r(false, arrayList);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            C18034p c18034p = (C18034p) arrayList.get(size2);
            if (!c18034p.m51790o()) {
                c18030l.m51771d(c18034p.f69989d);
                c18034p.m51792q(arrayList, c18030l);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final List m51793r(boolean z4, ArrayList arrayList) {
        if (this.f69990e) {
            return C25271y.f99162w;
        }
        m51779c(this.f69988c, arrayList);
        if (z4) {
            C18030l c18030l = this.f69989d;
            C0057v0 c0057v0 = c18030l.f69980w;
            Object objM129g = c0057v0.m129g(AbstractC18039u.f70057x);
            if (objM129g == null) {
                objM129g = null;
            }
            C18027i c18027i = (C18027i) objM129g;
            if (c18027i != null && c18030l.f69982y && !arrayList.isEmpty()) {
                arrayList.add(m51778b(c18027i, new C0227m1(c18027i, 16)));
            }
            C18043y c18043y = AbstractC18039u.f70034a;
            if (c0057v0.m125c(c18043y) && !arrayList.isEmpty() && c18030l.f69982y) {
                Object objM129g2 = c0057v0.m129g(c18043y);
                if (objM129g2 == null) {
                    objM129g2 = null;
                }
                List list = (List) objM129g2;
                String str = list != null ? (String) AbstractC25265s.m74100H0(list) : null;
                if (str != null) {
                    arrayList.add(0, m51778b(null, new C0227m1(str, 17)));
                }
            }
        }
        return arrayList;
    }
}
