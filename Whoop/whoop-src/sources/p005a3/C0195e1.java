package p005a3;

import androidx.compose.p018ui.node.C1134a;
import androidx.compose.p018ui.node.NodeCoordinator;
import com.google.crypto.tink.internal.C5101l0;
import m83.AbstractC25260n;
import p014aj.C0928c;
import p026b2.AbstractC2316v;
import p027b3.C2456w;
import p208i2.C17920x0;
import p446r1.C30849c;
import p603x2.AbstractC37831a;
import p636y3.C39169a;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a3.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0195e1 {

    /* JADX INFO: renamed from: a */
    public final C0230n0 f625a;

    /* JADX INFO: renamed from: c */
    public boolean f627c;

    /* JADX INFO: renamed from: d */
    public boolean f628d;

    /* JADX INFO: renamed from: i */
    public C39169a f633i;

    /* JADX INFO: renamed from: b */
    public final C0237p f626b = new C0237p(0);

    /* JADX INFO: renamed from: e */
    public final C5101l0 f629e = new C5101l0(2);

    /* JADX INFO: renamed from: f */
    public final C30849c f630f = new C30849c(new C0230n0[16]);

    /* JADX INFO: renamed from: g */
    public final long f631g = 1;

    /* JADX INFO: renamed from: h */
    public final C30849c f632h = new C30849c(new C0191d1[16]);

    public C0195e1(C0230n0 c0230n0) {
        this.f625a = c0230n0;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m477b(C0230n0 c0230n0, C39169a c39169a) {
        if (c0230n0.f759G == null) {
            return false;
        }
        boolean zM611b0 = c39169a != null ? c0230n0.m611b0(c39169a) : C0230n0.m571c0(c0230n0);
        C0230n0 c0230n0M588G = c0230n0.m588G();
        if (zM611b0 && c0230n0M588G != null) {
            if (c0230n0M588G.f759G == null) {
                C0230n0.m575v0(c0230n0M588G, false, 3);
                return zM611b0;
            }
            if (c0230n0.m581C() == EnumC0214j0.f713w) {
                C0230n0.m574t0(c0230n0M588G, false, 3);
                return zM611b0;
            }
            if (c0230n0.m581C() == EnumC0214j0.f714x) {
                c0230n0M588G.m642s0(false);
            }
        }
        return zM611b0;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m478c(C0230n0 c0230n0, C39169a c39169a) {
        boolean zM633n0 = c39169a != null ? c0230n0.m633n0(c39169a) : C0230n0.m573o0(c0230n0);
        C0230n0 c0230n0M588G = c0230n0.m588G();
        if (zM633n0 && c0230n0M588G != null) {
            if (c0230n0.m579B() == EnumC0214j0.f713w) {
                C0230n0.m575v0(c0230n0M588G, false, 3);
                return zM633n0;
            }
            if (c0230n0.m579B() == EnumC0214j0.f714x) {
                c0230n0M588G.m645u0(false);
            }
        }
        return zM633n0;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m479h(C0230n0 c0230n0) {
        C0187c1 c0187c1;
        C0250s0 c0250s0;
        if (c0230n0.m648x()) {
            return (c0230n0.m581C() == EnumC0214j0.f715y && ((c0187c1 = c0230n0.m643t().f855q) == null || (c0250s0 = c0187c1.f601S) == null || !c0250s0.m418f())) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m480i(C0230n0 c0230n0) {
        if (!c0230n0.m577A()) {
            return false;
        }
        do {
            if (c0230n0.m579B() == EnumC0214j0.f715y && !c0230n0.m643t().f854p.f672Y.m418f()) {
                C0230n0 c0230n0M588G = c0230n0.m588G();
                if ((c0230n0M588G != null ? c0230n0M588G.m646v() : null) != EnumC0206h0.f691w) {
                    return false;
                }
            }
            c0230n0 = c0230n0.m588G();
            if (c0230n0 == null) {
                return false;
            }
        } while (!c0230n0.m606Y());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m481a(boolean z4) {
        Object[] objArr;
        C5101l0 c5101l0 = this.f629e;
        if (z4) {
            C30849c c30849c = (C30849c) c5101l0.f21443x;
            C0230n0 c0230n0 = this.f625a;
            if (c0230n0.f792n0 > 0) {
                c30849c.m94890g();
                c30849c.m94885b(c0230n0);
                c0230n0.f791m0 = true;
            }
        }
        C30849c c30849c2 = (C30849c) c5101l0.f21443x;
        int i13 = c30849c2.f127229y;
        if (i13 != 0) {
            AbstractC25260n.m74040P0(c30849c2.f127227w, C0269y1.f920x, 0, i13);
            int i14 = c30849c2.f127229y;
            C0230n0[] c0230n0Arr = (C0230n0[]) c5101l0.f21444y;
            if (c0230n0Arr == null || c0230n0Arr.length < i14) {
                objArr = c0230n0Arr;
                objArr = new C0230n0[Math.max(16, i14)];
            }
            objArr = c0230n0Arr;
            c5101l0.f21444y = null;
            for (int i15 = 0; i15 < i14; i15++) {
                objArr[i15] = c30849c2.f127227w[i15];
            }
            c30849c2.m94890g();
            for (int i16 = i14 - 1; -1 < i16; i16--) {
                C0230n0 c0230n1 = objArr[i16];
                AbstractC22676k.m65747g(c0230n1);
                if (c0230n1.f791m0) {
                    C5101l0.m16024J(c0230n1);
                }
                objArr[i16] = 0;
            }
            c5101l0.f21444y = objArr;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m482d() {
        C30849c c30849c = this.f632h;
        int i13 = c30849c.f127229y;
        if (i13 != 0) {
            Object[] objArr = c30849c.f127227w;
            for (int i14 = 0; i14 < i13; i14++) {
                C0191d1 c0191d1 = (C0191d1) objArr[i14];
                C0230n0 c0230n0 = c0191d1.f620a;
                boolean z4 = c0191d1.f622c;
                C0230n0 c0230n1 = c0191d1.f620a;
                if (c0230n0.m605X()) {
                    if (c0191d1.f621b) {
                        C0230n0.m574t0(c0230n1, z4, 2);
                    } else {
                        C0230n0.m575v0(c0230n1, z4, 2);
                    }
                }
            }
            c30849c.m94890g();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m483e(C0230n0 c0230n0) {
        C30849c c30849cM595M = c0230n0.m595M();
        Object[] objArr = c30849cM595M.f127227w;
        int i13 = c30849cM595M.f127229y;
        for (int i14 = 0; i14 < i13; i14++) {
            C0230n0 c0230n1 = (C0230n0) objArr[i14];
            if (AbstractC22676k.m65745e(c0230n1.m609a0(), Boolean.TRUE) && !c0230n1.f793o0) {
                if (this.f626b.m713s(c0230n1)) {
                    c0230n1.m614d0();
                }
                m483e(c0230n1);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m484f(C0230n0 c0230n0, boolean z4) {
        if (!this.f627c) {
            AbstractC37831a.m121374b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z4 ? c0230n0.m648x() : c0230n0.m577A()) {
            AbstractC37831a.m121373a("node not yet measured");
        }
        m485g(c0230n0, z4);
    }

    /* JADX INFO: renamed from: g */
    public final void m485g(C0230n0 c0230n0, boolean z4) {
        C0187c1 c0187c1;
        C0250s0 c0250s0;
        C30849c c30849cM595M = c0230n0.m595M();
        Object[] objArr = c30849cM595M.f127227w;
        int i13 = c30849cM595M.f127229y;
        for (int i14 = 0; i14 < i13; i14++) {
            C0230n0 c0230n1 = (C0230n0) objArr[i14];
            if ((!z4 && (c0230n1.m579B() == EnumC0214j0.f713w || c0230n1.m643t().f854p.f672Y.m418f())) || (z4 && (c0230n1.m581C() == EnumC0214j0.f713w || ((c0187c1 = c0230n1.m643t().f855q) != null && (c0250s0 = c0187c1.f601S) != null && c0250s0.m418f())))) {
                if (AbstractC0201g.m511k(c0230n1) && !z4) {
                    if (c0230n1.m648x() && this.f626b.m713s(c0230n1)) {
                        m489m(c0230n1, true, false);
                    } else {
                        m484f(c0230n1, true);
                    }
                }
                if (z4 ? c0230n1.m648x() : c0230n1.m577A()) {
                    m489m(c0230n1, z4, false);
                }
                if (!(z4 ? c0230n1.m648x() : c0230n1.m577A())) {
                    m485g(c0230n1, z4);
                }
            }
        }
        if (z4 ? c0230n0.m648x() : c0230n0.m577A()) {
            m489m(c0230n0, z4, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX INFO: renamed from: j */
    public final boolean m486j(C2456w c2456w) {
        boolean z4;
        AbstractC2316v abstractC2316v;
        ?? M504d;
        boolean z13;
        C0230n0 c0230n0;
        boolean z14;
        C0237p c0237p = this.f626b;
        C0230n0 c0230n1 = this.f625a;
        if (!c0230n1.m605X()) {
            AbstractC37831a.m121373a("performMeasureAndLayout called with unattached root");
        }
        if (!c0230n1.m606Y()) {
            AbstractC37831a.m121373a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f627c) {
            AbstractC37831a.m121373a("performMeasureAndLayout called during measure layout");
        }
        int i13 = 0;
        if (this.f633i != null) {
            this.f627c = true;
            this.f628d = true;
            try {
                boolean zM673D = c0237p.m673D();
                C0928c c0928c = (C0928c) c0237p.f812x;
                if (zM673D) {
                    z4 = false;
                    while (true) {
                        C0928c c0928c2 = (C0928c) c0237p.f814z;
                        C0928c c0928c3 = (C0928c) c0237p.f813y;
                        if (!((C0220k2) c0928c.f3421x).isEmpty()) {
                            c0230n0 = (C0230n0) ((C0220k2) c0928c.f3421x).first();
                            c0928c.m2308R(c0230n0);
                            z14 = c0230n0.f759G != null;
                            z13 = false;
                        } else if (!((C0220k2) c0928c3.f3421x).isEmpty()) {
                            c0230n0 = (C0230n0) ((C0220k2) c0928c3.f3421x).first();
                            c0928c3.m2308R(c0230n0);
                            z14 = c0230n0.f759G != null;
                            z13 = true;
                        } else {
                            if (((C0220k2) c0928c2.f3421x).isEmpty()) {
                                break;
                            }
                            C0230n0 c0230n2 = (C0230n0) ((C0220k2) c0928c2.f3421x).first();
                            c0928c2.m2308R(c0230n2);
                            z13 = true;
                            c0230n0 = c0230n2;
                            z14 = false;
                        }
                        boolean zM489m = m489m(c0230n0, z14, z13);
                        if (!z13) {
                            if (c0230n0.m647w()) {
                                c0237p.m697b(c0230n0, EnumC0267y.f913x);
                            }
                            if (c0230n0.m644u()) {
                                c0237p.m697b(c0230n0, EnumC0267y.f915z);
                            }
                        }
                        if (c0230n0 == c0230n1 && zM489m) {
                            z4 = true;
                        }
                    }
                    if (c2456w != null) {
                        c2456w.invoke();
                    }
                } else {
                    z4 = false;
                }
                this.f627c = false;
                this.f628d = false;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    this.f627c = false;
                    this.f628d = false;
                    throw th4;
                }
            }
        } else {
            z4 = false;
        }
        C30849c c30849c = this.f630f;
        Object[] objArr = c30849c.f127227w;
        int i14 = c30849c.f127229y;
        int i15 = 0;
        while (i15 < i14) {
            C0223l1 c0223l1 = ((C0230n0) objArr[i15]).f783e0;
            C1134a c1134a = (C1134a) c0223l1.f740d;
            boolean zM769g = AbstractC0247r1.m769g(128);
            if (zM769g) {
                abstractC2316v = c1134a.f4881p0;
            } else {
                abstractC2316v = c1134a.f4881p0.f9132E;
                if (abstractC2316v == null) {
                }
                i15++;
                i13 = 0;
            }
            C17920x0 c17920x0 = NodeCoordinator.f4853k0;
            AbstractC2316v abstractC2316vM3535i1 = c1134a.m3535i1(zM769g);
            while (abstractC2316vM3535i1 != null && (abstractC2316vM3535i1.f9145z & 128) != 0) {
                if ((abstractC2316vM3535i1.f9144y & 128) != 0) {
                    ?? r14 = abstractC2316vM3535i1;
                    ?? c30849c2 = 0;
                    while (r14 != 0) {
                        if (r14 instanceof InterfaceC0178a0) {
                            ((InterfaceC0178a0) r14).mo422N((C1134a) c0223l1.f740d);
                        } else {
                            if ((r14.f9144y & 128) != 0 && (r14 instanceof AbstractC0233o)) {
                                AbstractC2316v abstractC2316v2 = ((AbstractC0233o) r14).f804P;
                                while (abstractC2316v2 != null) {
                                    if ((abstractC2316v2.f9144y & 128) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            M504d = r14;
                                            c30849c2 = c30849c2;
                                            c30849c2 = c30849c2;
                                            M504d = abstractC2316v2;
                                        } else {
                                            if (c30849c2 == 0) {
                                                c30849c2 = new C30849c(new AbstractC2316v[16]);
                                            }
                                            if (M504d != 0) {
                                                c30849c2.m94885b(M504d);
                                                M504d = 0;
                                            }
                                            c30849c2.m94885b(abstractC2316v2);
                                        }
                                    } else {
                                        M504d = r14;
                                        c30849c2 = c30849c2;
                                    }
                                    abstractC2316v2 = abstractC2316v2.f9133F;
                                    M504d = M504d;
                                    c30849c2 = c30849c2;
                                }
                                if (i13 == 1) {
                                    M504d = r14;
                                    c30849c2 = c30849c2;
                                }
                            }
                            i13 = 0;
                            r14 = M504d;
                            c30849c2 = c30849c2;
                        }
                        M504d = r14;
                        c30849c2 = c30849c2;
                        M504d = AbstractC0201g.m504d(c30849c2);
                        i13 = 0;
                        r14 = M504d;
                        c30849c2 = c30849c2;
                    }
                }
                if (abstractC2316vM3535i1 == abstractC2316v) {
                    break;
                }
                abstractC2316vM3535i1 = abstractC2316vM3535i1.f9133F;
                i13 = 0;
            }
            i15++;
            i13 = 0;
        }
        c30849c.m94890g();
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [a3.n0, java.lang.Object] */
    /* JADX INFO: renamed from: k */
    public final void m487k(C0230n0 c0230n0, long j7) {
        AbstractC2316v abstractC2316v;
        ?? M504d;
        if (c0230n0.f793o0) {
            return;
        }
        C0230n0 c0230n1 = this.f625a;
        if (c0230n0.equals(c0230n1)) {
            AbstractC37831a.m121373a("measureAndLayout called on root");
        }
        if (!c0230n1.m605X()) {
            AbstractC37831a.m121373a("performMeasureAndLayout called with unattached root");
        }
        if (!c0230n1.m606Y()) {
            AbstractC37831a.m121373a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f627c) {
            AbstractC37831a.m121373a("performMeasureAndLayout called during measure layout");
        }
        int i13 = 0;
        if (this.f633i != null) {
            this.f627c = true;
            this.f628d = false;
            try {
                C0237p c0237p = this.f626b;
                ((C0928c) c0237p.f812x).m2308R(c0230n0);
                ((C0928c) c0237p.f813y).m2308R(c0230n0);
                ((C0928c) c0237p.f814z).m2308R(c0230n0);
                if (m477b(c0230n0, new C39169a(j7)) || c0230n0.m647w()) {
                    if (AbstractC22676k.m65745e(c0230n0.m609a0(), Boolean.TRUE)) {
                        c0230n0.m614d0();
                    }
                }
                m483e(c0230n0);
                m478c(c0230n0, new C39169a(j7));
                if (c0230n0.m644u() && c0230n0.m606Y()) {
                    c0230n0.m640r0();
                    C5101l0 c5101l0 = this.f629e;
                    c5101l0.getClass();
                    if (c0230n0.f792n0 > 0) {
                        ((C30849c) c5101l0.f21443x).m94885b(c0230n0);
                        c0230n0.f791m0 = true;
                    }
                }
                m482d();
                this.f627c = false;
                this.f628d = false;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    this.f627c = false;
                    this.f628d = false;
                    throw th4;
                }
            }
        }
        C30849c c30849c = this.f630f;
        Object[] objArr = c30849c.f127227w;
        int i14 = c30849c.f127229y;
        int i15 = 0;
        while (i15 < i14) {
            C0223l1 c0223l1 = ((C0230n0) objArr[i15]).f783e0;
            C1134a c1134a = (C1134a) c0223l1.f740d;
            boolean zM769g = AbstractC0247r1.m769g(128);
            if (zM769g) {
                abstractC2316v = c1134a.f4881p0;
            } else {
                abstractC2316v = c1134a.f4881p0.f9132E;
                if (abstractC2316v == null) {
                }
                i15++;
                i13 = 0;
            }
            C17920x0 c17920x0 = NodeCoordinator.f4853k0;
            AbstractC2316v abstractC2316vM3535i1 = c1134a.m3535i1(zM769g);
            while (abstractC2316vM3535i1 != null && (abstractC2316vM3535i1.f9145z & 128) != 0) {
                if ((abstractC2316vM3535i1.f9144y & 128) != 0) {
                    ?? r14 = abstractC2316vM3535i1;
                    ?? c30849c2 = 0;
                    while (r14 != 0) {
                        if (r14 instanceof InterfaceC0178a0) {
                            ((InterfaceC0178a0) r14).mo422N((C1134a) c0223l1.f740d);
                        } else {
                            if ((r14.f9144y & 128) != 0 && (r14 instanceof AbstractC0233o)) {
                                AbstractC2316v abstractC2316v2 = ((AbstractC0233o) r14).f804P;
                                int i16 = i13;
                                while (abstractC2316v2 != null) {
                                    if ((abstractC2316v2.f9144y & 128) != 0) {
                                        i16++;
                                        if (i16 == 1) {
                                            M504d = r14;
                                            c30849c2 = c30849c2;
                                            c30849c2 = c30849c2;
                                            M504d = abstractC2316v2;
                                        } else {
                                            if (c30849c2 == 0) {
                                                c30849c2 = new C30849c(new AbstractC2316v[16]);
                                            }
                                            if (M504d != 0) {
                                                c30849c2.m94885b(M504d);
                                                M504d = 0;
                                            }
                                            c30849c2.m94885b(abstractC2316v2);
                                        }
                                    } else {
                                        M504d = r14;
                                        c30849c2 = c30849c2;
                                    }
                                    abstractC2316v2 = abstractC2316v2.f9133F;
                                    M504d = M504d;
                                    c30849c2 = c30849c2;
                                }
                                if (i16 == 1) {
                                    M504d = r14;
                                    c30849c2 = c30849c2;
                                }
                            }
                            i13 = 0;
                            r14 = M504d;
                            c30849c2 = c30849c2;
                        }
                        M504d = r14;
                        c30849c2 = c30849c2;
                        M504d = AbstractC0201g.m504d(c30849c2);
                        i13 = 0;
                        r14 = M504d;
                        c30849c2 = c30849c2;
                    }
                }
                if (abstractC2316vM3535i1 == abstractC2316v) {
                    break;
                }
                abstractC2316vM3535i1 = abstractC2316vM3535i1.f9133F;
                i13 = 0;
            }
            i15++;
            i13 = 0;
        }
        c30849c.m94890g();
    }

    /* JADX INFO: renamed from: l */
    public final void m488l() {
        C0237p c0237p = this.f626b;
        if (c0237p.m673D()) {
            C0230n0 c0230n0 = this.f625a;
            if (!c0230n0.m605X()) {
                AbstractC37831a.m121373a("performMeasureAndLayout called with unattached root");
            }
            if (!c0230n0.m606Y()) {
                AbstractC37831a.m121373a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f627c) {
                AbstractC37831a.m121373a("performMeasureAndLayout called during measure layout");
            }
            if (this.f633i != null) {
                this.f627c = true;
                this.f628d = false;
                try {
                    if (!((C0220k2) ((C0928c) c0237p.f814z).f3421x).isEmpty() && !((C0220k2) ((C0928c) c0237p.f812x).f3421x).isEmpty()) {
                        if (c0230n0.f759G != null) {
                            m491o(c0230n0, true);
                        } else {
                            m490n(c0230n0);
                        }
                    }
                    m491o(c0230n0, false);
                    this.f627c = false;
                    this.f628d = false;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        this.f627c = false;
                        this.f628d = false;
                        throw th4;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m489m(C0230n0 c0230n0, boolean z4, boolean z13) {
        C39169a c39169a;
        boolean zM478c;
        C0230n0 c0230n0M588G;
        if (c0230n0.f793o0 || (!c0230n0.m606Y() && !c0230n0.m607Z() && !m480i(c0230n0) && !AbstractC22676k.m65745e(c0230n0.m609a0(), Boolean.TRUE) && !m479h(c0230n0) && !c0230n0.m632n())) {
            return false;
        }
        C0230n0 c0230n1 = this.f625a;
        if (c0230n0 == c0230n1) {
            c39169a = this.f633i;
            AbstractC22676k.m65747g(c39169a);
        } else {
            c39169a = null;
        }
        if (z4) {
            zM478c = c0230n0.m648x() ? m477b(c0230n0, c39169a) : false;
            if (z13 && ((zM478c || c0230n0.m647w()) && AbstractC22676k.m65745e(c0230n0.m609a0(), Boolean.TRUE))) {
                c0230n0.m614d0();
            }
        } else {
            zM478c = c0230n0.m577A() ? m478c(c0230n0, c39169a) : false;
            if (z13 && c0230n0.m644u() && (c0230n0 == c0230n1 || ((c0230n0M588G = c0230n0.m588G()) != null && c0230n0M588G.m606Y() && c0230n0.m607Z()))) {
                if (c0230n0 == c0230n1) {
                    c0230n0.m631m0();
                } else {
                    c0230n0.m640r0();
                }
                C5101l0 c5101l0 = this.f629e;
                c5101l0.getClass();
                if (c0230n0.f792n0 > 0) {
                    ((C30849c) c5101l0.f21443x).m94885b(c0230n0);
                    c0230n0.f791m0 = true;
                }
                AbstractC0242q0.m750a(c0230n0).getRectManager().m59671e(c0230n0);
            }
        }
        m482d();
        return zM478c;
    }

    /* JADX INFO: renamed from: n */
    public final void m490n(C0230n0 c0230n0) {
        C30849c c30849cM595M = c0230n0.m595M();
        Object[] objArr = c30849cM595M.f127227w;
        int i13 = c30849cM595M.f127229y;
        for (int i14 = 0; i14 < i13; i14++) {
            C0230n0 c0230n1 = (C0230n0) objArr[i14];
            if (c0230n1.m579B() == EnumC0214j0.f713w || c0230n1.m643t().f854p.f672Y.m418f()) {
                if (AbstractC0201g.m511k(c0230n1)) {
                    m491o(c0230n1, true);
                } else {
                    m490n(c0230n1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m491o(C0230n0 c0230n0, boolean z4) {
        C39169a c39169a;
        if (c0230n0.f793o0) {
            return;
        }
        if (c0230n0 == this.f625a) {
            c39169a = this.f633i;
            AbstractC22676k.m65747g(c39169a);
        } else {
            c39169a = null;
        }
        if (z4) {
            m477b(c0230n0, c39169a);
        } else {
            m478c(c0230n0, c39169a);
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m492p(C0230n0 c0230n0, boolean z4) {
        int iOrdinal = c0230n0.m646v().ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.f632h.m94885b(new C0191d1(c0230n0, false, z4));
            } else {
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!c0230n0.m577A() || z4) {
                    c0230n0.m622h0();
                    if (!c0230n0.f793o0 && (c0230n0.m606Y() || m480i(c0230n0))) {
                        C0230n0 c0230n0M588G = c0230n0.m588G();
                        if (c0230n0M588G == null || !c0230n0M588G.m577A()) {
                            this.f626b.m697b(c0230n0, EnumC0267y.f914y);
                        }
                        if (!this.f628d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final void m493q(long j7) {
        C39169a c39169a = this.f633i;
        if (c39169a == null ? false : C39169a.m124759c(c39169a.f168407a, j7)) {
            return;
        }
        if (this.f627c) {
            AbstractC37831a.m121373a("updateRootConstraints called while measuring");
        }
        this.f633i = new C39169a(j7);
        C0230n0 c0230n0 = this.f625a;
        if (c0230n0.f759G != null) {
            c0230n0.m620g0();
        }
        c0230n0.m622h0();
        this.f626b.m697b(c0230n0, c0230n0.f759G != null ? EnumC0267y.f912w : EnumC0267y.f914y);
    }
}
