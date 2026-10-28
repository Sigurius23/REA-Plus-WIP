package p164g2;

import android.os.Trace;
import c93.InterfaceC4351m;
import no.nordicsemi.android.dfu.DfuBaseService;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0233o;
import p005a3.C0223l1;
import p005a3.C0224l2;
import p005a3.C0230n0;
import p005a3.C0271z0;
import p005a3.InterfaceC0225m;
import p005a3.InterfaceC0229n;
import p005a3.InterfaceC0263w1;
import p026b2.AbstractC2316v;
import p027b3.AbstractC2453v1;
import p446r1.C30849c;
import p447r2.C30860a;
import p447r2.C30862c;
import p447r2.InterfaceC30861b;
import p603x2.AbstractC37831a;
import p669z2.InterfaceC40002e;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;

/* JADX INFO: renamed from: g2.x */
/* JADX INFO: loaded from: classes.dex */
public final class C15252x extends AbstractC2316v implements InterfaceC0225m, InterfaceC0263w1, InterfaceC40002e, InterfaceC0229n {

    /* JADX INFO: renamed from: O */
    public final InterfaceC4351m f57275O;

    /* JADX INFO: renamed from: P */
    public boolean f57276P;

    /* JADX INFO: renamed from: Q */
    public boolean f57277Q;

    /* JADX INFO: renamed from: R */
    public final int f57278R;

    public C15252x(InterfaceC4351m interfaceC4351m, int i13, int i14) {
        i13 = (i14 & 1) != 0 ? 1 : i13;
        this.f57275O = (i14 & 2) != 0 ? null : interfaceC4351m;
        this.f57278R = i13;
    }

    @Override // p005a3.InterfaceC0263w1
    /* JADX INFO: renamed from: C */
    public final void mo796C() {
        m43359a1();
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: M0 */
    public final boolean mo3462M0() {
        return false;
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: Q0 */
    public final void mo286Q0() {
        int iOrdinal = m43358Z0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        C15240l c15240l = (C15240l) AbstractC0201g.m517q(this).getFocusOwner();
        c15240l.m43341d(8, true, false);
        c15240l.f57242d.m43337a();
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: R0 */
    public final void mo7159R0() {
        if (m43358Z0().m43354b()) {
            ((C15240l) AbstractC0201g.m517q(this).getFocusOwner()).m43341d(8, true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX INFO: renamed from: X0 */
    public final void m43356X0(EnumC15251w enumC15251w, EnumC15251w enumC15251w2) {
        C0223l1 c0223l1;
        InterfaceC4351m interfaceC4351m;
        C15240l c15240l = (C15240l) AbstractC0201g.m517q(this).getFocusOwner();
        C15252x c15252x = c15240l.f57246h;
        if (!enumC15251w.equals(enumC15251w2) && (interfaceC4351m = this.f57275O) != null) {
            interfaceC4351m.invoke(enumC15251w, enumC15251w2);
        }
        AbstractC2316v abstractC2316v = this.f9142w;
        if (!abstractC2316v.f9141N) {
            AbstractC37831a.m121374b("visitAncestors called on an unattached node");
        }
        AbstractC2316v abstractC2316v2 = this.f9142w;
        C0230n0 c0230n0M516p = AbstractC0201g.m516p(this);
        while (c0230n0M516p != null) {
            if ((((AbstractC2316v) c0230n0M516p.f783e0.f743g).f9145z & 5120) != 0) {
                while (abstractC2316v2 != null) {
                    int i13 = abstractC2316v2.f9144y;
                    if ((i13 & 5120) != 0) {
                        if (abstractC2316v2 != abstractC2316v && (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            return;
                        }
                        if ((i13 & 4096) != 0) {
                            ?? M504d = abstractC2316v2;
                            ?? c30849c = 0;
                            while (M504d != 0) {
                                if (M504d instanceof InterfaceC15233e) {
                                    InterfaceC15233e interfaceC15233e = (InterfaceC15233e) M504d;
                                    if (c15252x == c15240l.f57246h) {
                                        interfaceC15233e.mo470k(enumC15251w2);
                                    }
                                } else if ((M504d.f9144y & 4096) != 0 && (M504d instanceof AbstractC0233o)) {
                                    AbstractC2316v abstractC2316v3 = ((AbstractC0233o) M504d).f804P;
                                    int i14 = 0;
                                    M504d = M504d;
                                    c30849c = c30849c;
                                    while (abstractC2316v3 != null) {
                                        if ((abstractC2316v3.f9144y & 4096) != 0) {
                                            i14++;
                                            if (i14 == 1) {
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
                                    if (i14 == 1) {
                                    }
                                }
                                M504d = AbstractC0201g.m504d(c30849c);
                            }
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
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [r1.c] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX INFO: renamed from: Y0 */
    public final C15243o m43357Y0() {
        boolean z4;
        C0223l1 c0223l1;
        C15243o c15243o = new C15243o();
        int i13 = this.f57278R;
        if (i13 == 1) {
            z4 = true;
        } else if (i13 == 0) {
            z4 = !(((C30860a) ((C30862c) ((InterfaceC30861b) AbstractC0201g.m506f(this, AbstractC2453v1.f9574m))).f127257a.getValue()).f127256a == 1);
        } else {
            if (i13 != 2) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z4 = false;
        }
        c15243o.mo534b(z4);
        AbstractC2316v abstractC2316v = this.f9142w;
        if (!abstractC2316v.f9141N) {
            AbstractC37831a.m121374b("visitAncestors called on an unattached node");
        }
        AbstractC2316v abstractC2316v2 = this.f9142w;
        C0230n0 c0230n0M516p = AbstractC0201g.m516p(this);
        loop0: while (c0230n0M516p != null) {
            if ((((AbstractC2316v) c0230n0M516p.f783e0.f743g).f9145z & 3072) != 0) {
                while (abstractC2316v2 != null) {
                    int i14 = abstractC2316v2.f9144y;
                    if ((i14 & 3072) != 0) {
                        if (abstractC2316v2 != abstractC2316v && (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            break loop0;
                        }
                        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                            ?? M504d = abstractC2316v2;
                            ?? c30849c = 0;
                            while (M504d != 0) {
                                if (M504d instanceof InterfaceC15245q) {
                                    ((InterfaceC15245q) M504d).mo469j0(c15243o);
                                } else if ((M504d.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 && (M504d instanceof AbstractC0233o)) {
                                    AbstractC2316v abstractC2316v3 = ((AbstractC0233o) M504d).f804P;
                                    int i15 = 0;
                                    while (abstractC2316v3 != null) {
                                        if ((abstractC2316v3.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                                            i15++;
                                            if (i15 == 1) {
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
                                        }
                                        abstractC2316v3 = abstractC2316v3.f9133F;
                                        M504d = M504d;
                                        c30849c = c30849c;
                                    }
                                    if (i15 == 1) {
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
                    abstractC2316v2 = abstractC2316v2.f9132E;
                }
            }
            c0230n0M516p = c0230n0M516p.m588G();
            abstractC2316v2 = (c0230n0M516p == null || (c0223l1 = c0230n0M516p.f783e0) == null) ? null : (C0224l2) c0223l1.f742f;
        }
        return c15243o;
    }

    /* JADX INFO: renamed from: Z0 */
    public final EnumC15251w m43358Z0() {
        C15240l c15240l;
        C15252x c15252x;
        C0223l1 c0223l1;
        if (this.f9141N && (c15252x = (c15240l = (C15240l) AbstractC0201g.m517q(this).getFocusOwner()).f57246h) != null) {
            if (this == c15252x) {
                return c15240l.f57247i ? EnumC15251w.f57273y : EnumC15251w.f57271w;
            }
            if (c15252x.f9141N) {
                if (!c15252x.f9142w.f9141N) {
                    AbstractC37831a.m121374b("visitAncestors called on an unattached node");
                }
                AbstractC2316v abstractC2316v = c15252x.f9142w.f9132E;
                C0230n0 c0230n0M516p = AbstractC0201g.m516p(c15252x);
                while (c0230n0M516p != null) {
                    if ((((AbstractC2316v) c0230n0M516p.f783e0.f743g).f9145z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        while (abstractC2316v != null) {
                            if ((abstractC2316v.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                AbstractC2316v abstractC2316vM504d = abstractC2316v;
                                C30849c c30849c = null;
                                while (abstractC2316vM504d != null) {
                                    if (abstractC2316vM504d instanceof C15252x) {
                                        if (this == ((C15252x) abstractC2316vM504d)) {
                                            return EnumC15251w.f57272x;
                                        }
                                    } else if ((abstractC2316vM504d.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 && (abstractC2316vM504d instanceof AbstractC0233o)) {
                                        int i13 = 0;
                                        for (AbstractC2316v abstractC2316v2 = ((AbstractC0233o) abstractC2316vM504d).f804P; abstractC2316v2 != null; abstractC2316v2 = abstractC2316v2.f9133F) {
                                            if ((abstractC2316v2.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                                i13++;
                                                if (i13 == 1) {
                                                    abstractC2316vM504d = abstractC2316v2;
                                                } else {
                                                    if (c30849c == null) {
                                                        c30849c = new C30849c(new AbstractC2316v[16]);
                                                    }
                                                    if (abstractC2316vM504d != null) {
                                                        c30849c.m94885b(abstractC2316vM504d);
                                                        abstractC2316vM504d = null;
                                                    }
                                                    c30849c.m94885b(abstractC2316v2);
                                                }
                                            }
                                        }
                                        if (i13 == 1) {
                                        }
                                    }
                                    abstractC2316vM504d = AbstractC0201g.m504d(c30849c);
                                }
                            }
                            abstractC2316v = abstractC2316v.f9132E;
                        }
                    }
                    c0230n0M516p = c0230n0M516p.m588G();
                    abstractC2316v = (c0230n0M516p == null || (c0223l1 = c0230n0M516p.f783e0) == null) ? null : (C0224l2) c0223l1.f742f;
                }
            }
            return EnumC15251w.f57274z;
        }
        return EnumC15251w.f57274z;
    }

    /* JADX INFO: renamed from: a1 */
    public final void m43359a1() {
        int iOrdinal = m43358Z0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        C22669g0 c22669g0 = new C22669g0();
        AbstractC0201g.m512l(this, new C0271z0(9, c22669g0, this));
        Object obj = c22669g0.f89336w;
        if (obj == null) {
            AbstractC22676k.m65757q("focusProperties");
            throw null;
        }
        if (((InterfaceC15241m) obj).mo535c()) {
            return;
        }
        ((C15240l) AbstractC0201g.m517q(this).getFocusOwner()).m43339b(true);
    }

    /* JADX INFO: renamed from: b1 */
    public final boolean m43360b1(int i13) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zM43304D = false;
            if (!m43357Y0().mo535c()) {
                Trace.endSection();
                return false;
            }
            int iOrdinal = AbstractC15235g.m43303C(this, i13).ordinal();
            if (iOrdinal == 0) {
                zM43304D = AbstractC15235g.m43304D(this);
            } else if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    zM43304D = true;
                } else if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            Trace.endSection();
            return zM43304D;
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
