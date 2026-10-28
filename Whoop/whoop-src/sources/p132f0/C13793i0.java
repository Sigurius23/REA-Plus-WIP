package p132f0;

import androidx.compose.p018ui.node.NodeCoordinator;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.C1832u;
import androidx.room.C1833u0;
import androidx.room.C1839w0;
import bc3.AbstractC3006f0;
import bc3.C3023j1;
import bc3.InterfaceC3027k1;
import com.whoop.profile.view.edit.C9790n;
import d30.C11546l;
import hc3.C17171d;
import j93.InterfaceC21493z;
import p003a1.C0109h;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0233o;
import p005a3.C0223l1;
import p005a3.C0224l2;
import p005a3.C0230n0;
import p005a3.InterfaceC0216j2;
import p005a3.InterfaceC0225m;
import p005a3.InterfaceC0240p2;
import p005a3.InterfaceC0249s;
import p005a3.InterfaceC0263w1;
import p026b2.AbstractC2316v;
import p164g2.C15252x;
import p209i3.AbstractC18029k;
import p209i3.AbstractC18039u;
import p209i3.AbstractC18041w;
import p209i3.C18017a;
import p209i3.C18030l;
import p209i3.C18043y;
import p209i3.InterfaceC18044z;
import p238j0.C21078d;
import p238j0.C21079e;
import p238j0.C21084j;
import p238j0.InterfaceC21082h;
import p238j0.InterfaceC21083i;
import p389p0.C28524g0;
import p446r1.C30849c;
import p603x2.AbstractC37831a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;

/* JADX INFO: renamed from: f0.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C13793i0 extends AbstractC0233o implements InterfaceC0216j2, InterfaceC0249s, InterfaceC0225m, InterfaceC0263w1, InterfaceC0240p2 {

    /* JADX INFO: renamed from: W */
    public static final C13771b f49219W = new C13771b();

    /* JADX INFO: renamed from: Q */
    public InterfaceC21083i f49220Q;

    /* JADX INFO: renamed from: R */
    public final Function1 f49221R;

    /* JADX INFO: renamed from: S */
    public C21078d f49222S;

    /* JADX INFO: renamed from: T */
    public C28524g0 f49223T;

    /* JADX INFO: renamed from: U */
    public NodeCoordinator f49224U;

    /* JADX INFO: renamed from: V */
    public final C15252x f49225V;

    public C13793i0(InterfaceC21083i interfaceC21083i, int i13, C1832u c1832u) {
        this.f49220Q = interfaceC21083i;
        this.f49221R = c1832u;
        C15252x c15252x = new C15252x(new C1839w0(2, this, C13793i0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 2), i13, 4);
        m665X0(c15252x);
        this.f49225V = c15252x;
    }

    @Override // p005a3.InterfaceC0263w1
    /* JADX INFO: renamed from: C */
    public final void mo796C() {
        C22669g0 c22669g0 = new C22669g0();
        AbstractC0201g.m512l(this, new C11546l(23, c22669g0, this));
        C28524g0 c28524g0 = (C28524g0) c22669g0.f89336w;
        if (this.f49225V.m43358Z0().m43354b()) {
            C28524g0 c28524g1 = this.f49223T;
            if (c28524g1 != null) {
                c28524g1.m86828b();
            }
            if (c28524g0 != null) {
                c28524g0.m86827a();
            } else {
                c28524g0 = null;
            }
            this.f49223T = c28524g0;
        }
    }

    @Override // p005a3.InterfaceC0249s
    /* JADX INFO: renamed from: I0 */
    public final void mo284I0(NodeCoordinator nodeCoordinator) {
        C13796j0 c13796j0M39158b1;
        this.f49224U = nodeCoordinator;
        if (this.f49225V.m43358Z0().m43354b()) {
            if (!nodeCoordinator.mo3533g1().f9141N) {
                C13796j0 c13796j0M39158b2 = m39158b1();
                if (c13796j0M39158b2 != null) {
                    c13796j0M39158b2.m39160X0(null);
                    return;
                }
                return;
            }
            NodeCoordinator nodeCoordinator2 = this.f49224U;
            if (nodeCoordinator2 == null || !nodeCoordinator2.mo3533g1().f9141N || (c13796j0M39158b1 = m39158b1()) == null) {
                return;
            }
            c13796j0M39158b1.m39160X0(this.f49224U);
        }
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: M0 */
    public final boolean mo3462M0() {
        return false;
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: R0 */
    public final void mo7159R0() {
        C28524g0 c28524g0 = this.f49223T;
        if (c28524g0 != null) {
            c28524g0.m86828b();
        }
        this.f49223T = null;
    }

    /* JADX INFO: renamed from: a1 */
    public final void m39157a1(InterfaceC21083i interfaceC21083i, InterfaceC21082h interfaceC21082h) {
        if (!this.f9141N) {
            ((C21084j) interfaceC21083i).m58922b(interfaceC21082h);
            return;
        }
        InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) ((C17171d) m7158L0()).f65971w.get(C3023j1.f12041w);
        AbstractC3006f0.m8732z(m7158L0(), null, null, new C0109h(interfaceC21083i, interfaceC21082h, interfaceC3027k1 != null ? interfaceC3027k1.invokeOnCompletion(new C9790n(23, interfaceC21083i, interfaceC21082h)) : null, null, 21), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
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
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX INFO: renamed from: b1 */
    public final C13796j0 m39158b1() {
        InterfaceC0240p2 interfaceC0240p2;
        C0223l1 c0223l1;
        if (this.f9141N) {
            if (!this.f9142w.f9141N) {
                AbstractC37831a.m121374b("visitAncestors called on an unattached node");
            }
            AbstractC2316v abstractC2316v = this.f9142w.f9132E;
            C0230n0 c0230n0M516p = AbstractC0201g.m516p(this);
            loop0: while (true) {
                if (c0230n0M516p == null) {
                    interfaceC0240p2 = null;
                    break;
                }
                if ((((AbstractC2316v) c0230n0M516p.f783e0.f743g).f9145z & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                    while (abstractC2316v != null) {
                        if ((abstractC2316v.f9144y & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                            ?? M504d = abstractC2316v;
                            ?? c30849c = 0;
                            while (M504d != 0) {
                                if (M504d instanceof InterfaceC0240p2) {
                                    interfaceC0240p2 = (InterfaceC0240p2) M504d;
                                    if (C13796j0.f49227P.equals(interfaceC0240p2.mo276f())) {
                                        break loop0;
                                    }
                                } else if ((M504d.f9144y & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 && (M504d instanceof AbstractC0233o)) {
                                    AbstractC2316v abstractC2316v2 = ((AbstractC0233o) M504d).f804P;
                                    int i13 = 0;
                                    M504d = M504d;
                                    c30849c = c30849c;
                                    while (abstractC2316v2 != null) {
                                        if ((abstractC2316v2.f9144y & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                                            i13++;
                                            if (i13 == 1) {
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
                                        }
                                        abstractC2316v2 = abstractC2316v2.f9133F;
                                        M504d = M504d;
                                        c30849c = c30849c;
                                    }
                                    if (i13 == 1) {
                                    }
                                }
                                M504d = AbstractC0201g.m504d(c30849c);
                            }
                        }
                        abstractC2316v = abstractC2316v.f9132E;
                    }
                }
                c0230n0M516p = c0230n0M516p.m588G();
                abstractC2316v = (c0230n0M516p == null || (c0223l1 = c0230n0M516p.f783e0) == null) ? null : (C0224l2) c0223l1.f742f;
            }
            if (interfaceC0240p2 instanceof C13796j0) {
                return (C13796j0) interfaceC0240p2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c1 */
    public final void m39159c1(InterfaceC21083i interfaceC21083i) {
        C21078d c21078d;
        if (AbstractC22676k.m65745e(this.f49220Q, interfaceC21083i)) {
            return;
        }
        InterfaceC21083i interfaceC21083i2 = this.f49220Q;
        if (interfaceC21083i2 != null && (c21078d = this.f49222S) != null) {
            ((C21084j) interfaceC21083i2).m58922b(new C21079e(c21078d));
        }
        this.f49222S = null;
        this.f49220Q = interfaceC21083i;
    }

    @Override // p005a3.InterfaceC0240p2
    /* JADX INFO: renamed from: f */
    public final Object mo276f() {
        return f49219W;
    }

    @Override // p005a3.InterfaceC0216j2
    /* JADX INFO: renamed from: n */
    public final void mo471n(InterfaceC18044z interfaceC18044z) {
        boolean zM43354b = this.f49225V.m43358Z0().m43354b();
        InterfaceC21493z[] interfaceC21493zArr = AbstractC18041w.f70062a;
        C18043y c18043y = AbstractC18039u.f70044k;
        InterfaceC21493z interfaceC21493z = AbstractC18041w.f70062a[4];
        c18043y.m51817a(interfaceC18044z, Boolean.valueOf(zM43354b));
        C18030l c18030l = (C18030l) interfaceC18044z;
        c18030l.m51772e(AbstractC18029k.f69975v, new C18017a(null, new C1833u0(0, this, C13793i0.class, "requestFocus", "requestFocus()Z", 0, 2)));
    }
}
