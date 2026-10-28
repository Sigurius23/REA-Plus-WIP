package p005a3;

import androidx.compose.p018ui.node.C1135b;
import androidx.compose.p018ui.node.NodeCoordinator;
import androidx.compose.p018ui.platform.AndroidComposeView;
import java.util.ArrayList;
import java.util.HashSet;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p000.AbstractC30802r;
import p002a0.C0047q0;
import p002a0.C0057v0;
import p026b2.AbstractC2316v;
import p026b2.InterfaceC2315u;
import p027b3.C2374f2;
import p132f0.C13826t0;
import p134f2.InterfaceC14013b;
import p134f2.InterfaceC14017f;
import p164g2.EnumC15251w;
import p164g2.InterfaceC15233e;
import p164g2.InterfaceC15241m;
import p164g2.InterfaceC15245q;
import p164g2.InterfaceC15248t;
import p209i3.C18017a;
import p209i3.C18030l;
import p209i3.C18043y;
import p209i3.InterfaceC18031m;
import p209i3.InterfaceC18044z;
import p389p0.C28514d;
import p446r1.C30849c;
import p479s4.AbstractC32121b;
import p512u2.C34465k;
import p512u2.C34479y;
import p512u2.EnumC34466l;
import p512u2.InterfaceC34475u;
import p603x2.AbstractC37831a;
import p635y2.InterfaceC39080c0;
import p635y2.InterfaceC39095g1;
import p635y2.InterfaceC39113m1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p635y2.InterfaceC39147y;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p669z2.C39998a;
import p669z2.C39999b;
import p669z2.C40001d;
import p669z2.C40005h;
import p669z2.InterfaceC40000c;
import p669z2.InterfaceC40002e;
import p669z2.InterfaceC40003f;
import p669z2.InterfaceC40004g;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import v63.AbstractC35744b;
import v63.AbstractC35745c;

/* JADX INFO: renamed from: a3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0189d extends AbstractC2316v implements InterfaceC0186c0, InterfaceC0245r, InterfaceC0216j2, InterfaceC0200f2, InterfaceC40002e, InterfaceC40004g, InterfaceC0192d2, InterfaceC0178a0, InterfaceC0249s, InterfaceC15233e, InterfaceC15245q, InterfaceC15248t, InterfaceC0184b2, InterfaceC14013b {

    /* JADX INFO: renamed from: O */
    public InterfaceC2315u f616O;

    /* JADX INFO: renamed from: P */
    public C39998a f617P;

    /* JADX INFO: renamed from: Q */
    public HashSet f618Q;

    @Override // p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: C0 */
    public final boolean mo458C0() {
        InterfaceC2315u interfaceC2315u = this.f616O;
        AbstractC22676k.m65748h(interfaceC2315u, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((C34479y) ((InterfaceC34475u) interfaceC2315u)).m108970j().getClass();
        return true;
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: E */
    public final int mo433E(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        InterfaceC2315u interfaceC2315u = this.f616O;
        AbstractC22676k.m65748h(interfaceC2315u, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return AbstractC32121b.m100014t((InterfaceC39080c0) interfaceC2315u, abstractC0262w0, interfaceC39124q0, i13);
    }

    @Override // p005a3.InterfaceC0249s
    /* JADX INFO: renamed from: I0 */
    public final void mo284I0(NodeCoordinator nodeCoordinator) {
        InterfaceC2315u interfaceC2315u = this.f616O;
        AbstractC22676k.m65748h(interfaceC2315u, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        C28514d c28514d = (C28514d) interfaceC2315u;
        ArrayList arrayList = c28514d.f115411x;
        if (c28514d.f115410w) {
            return;
        }
        c28514d.f115410w = true;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((InterfaceC30057d) arrayList.get(i13)).resumeWith(C23454a0.f92919a);
        }
        arrayList.clear();
    }

    @Override // p005a3.InterfaceC0178a0
    /* JADX INFO: renamed from: N */
    public final void mo422N(InterfaceC39147y interfaceC39147y) {
    }

    @Override // p005a3.InterfaceC0245r
    /* JADX INFO: renamed from: O */
    public final void mo459O(C0238p0 c0238p0) {
        InterfaceC2315u interfaceC2315u = this.f616O;
        AbstractC22676k.m65748h(interfaceC2315u, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((C13826t0) ((InterfaceC14017f) interfaceC2315u)).m39189j(c0238p0);
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: P0 */
    public final void mo285P0() {
        m460X0(true);
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: Q0 */
    public final void mo286Q0() {
        m462Y0();
    }

    @Override // p005a3.InterfaceC0184b2
    /* JADX INFO: renamed from: U */
    public final boolean mo432U() {
        return this.f9141N;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m460X0(boolean z4) {
        if (!this.f9141N) {
            AbstractC37831a.m121374b("initializeModifier called on unattached node");
        }
        InterfaceC2315u interfaceC2315u = this.f616O;
        if ((this.f9144y & 32) != 0) {
            if (interfaceC2315u instanceof InterfaceC40000c) {
                C0185c c0185c = new C0185c(this, 0);
                C0047q0 c0047q0 = ((AndroidComposeView) AbstractC0201g.m517q(this)).f4931V0;
                if (c0047q0.m103f(c0185c) < 0) {
                    c0047q0.m98a(c0185c);
                }
            }
            if (interfaceC2315u instanceof InterfaceC40003f) {
                InterfaceC40003f interfaceC40003f = (InterfaceC40003f) interfaceC2315u;
                C39998a c39998a = this.f617P;
                if (c39998a == null || !c39998a.mo113251c(interfaceC40003f.getKey())) {
                    C39998a c39998a2 = new C39998a();
                    c39998a2.f172583a = interfaceC40003f;
                    this.f617P = c39998a2;
                    if (AbstractC0201g.m502b(this)) {
                        C40001d modifierLocalManager = AbstractC0201g.m517q(this).getModifierLocalManager();
                        C40005h key = interfaceC40003f.getKey();
                        modifierLocalManager.f172586b.m94885b(this);
                        modifierLocalManager.f172587c.m94885b(key);
                        modifierLocalManager.m128238a();
                    }
                } else {
                    c39998a.f172583a = interfaceC40003f;
                    C40001d modifierLocalManager2 = AbstractC0201g.m517q(this).getModifierLocalManager();
                    C40005h key2 = interfaceC40003f.getKey();
                    modifierLocalManager2.f172586b.m94885b(this);
                    modifierLocalManager2.f172587c.m94885b(key2);
                    modifierLocalManager2.m128238a();
                }
            }
        }
        if ((this.f9144y & 4) != 0 && !z4) {
            AbstractC0201g.m514n(this, 2).m3542n1();
        }
        if ((this.f9144y & 2) != 0) {
            if (AbstractC0201g.m502b(this)) {
                NodeCoordinator nodeCoordinator = this.f9135H;
                AbstractC22676k.m65747g(nodeCoordinator);
                ((C1135b) nodeCoordinator).m3559J1(this);
                InterfaceC0180a2 interfaceC0180a2 = nodeCoordinator.f4878i0;
                if (interfaceC0180a2 != null) {
                    ((C2374f2) interfaceC0180a2).invalidate();
                }
            }
            if (!z4) {
                AbstractC0201g.m514n(this, 2).m3542n1();
                AbstractC0201g.m516p(this).m600R();
            }
        }
        if (interfaceC2315u instanceof InterfaceC39113m1) {
            ((InterfaceC39113m1) interfaceC2315u).mo77562f(AbstractC0201g.m516p(this));
        }
        if ((this.f9144y & 256) != 0 && (interfaceC2315u instanceof C28514d) && AbstractC0201g.m502b(this)) {
            AbstractC0201g.m516p(this).m600R();
        }
        if ((this.f9144y & 16) != 0 && (interfaceC2315u instanceof InterfaceC34475u)) {
            ((C34479y) ((InterfaceC34475u) interfaceC2315u)).m108970j().m91093N0(this.f9135H);
        }
        if ((this.f9144y & 8) != 0) {
            ((AndroidComposeView) AbstractC0201g.m517q(this)).m3573E();
        }
    }

    @Override // p005a3.InterfaceC0192d2
    /* JADX INFO: renamed from: Y */
    public final Object mo461Y(InterfaceC39171c interfaceC39171c, Object obj) {
        InterfaceC2315u interfaceC2315u = this.f616O;
        AbstractC22676k.m65748h(interfaceC2315u, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((InterfaceC39095g1) interfaceC2315u).mo11571g();
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m462Y0() {
        if (!this.f9141N) {
            AbstractC37831a.m121374b("unInitializeModifier called on unattached node");
        }
        InterfaceC2315u interfaceC2315u = this.f616O;
        if ((this.f9144y & 32) != 0) {
            if (interfaceC2315u instanceof InterfaceC40003f) {
                C40001d modifierLocalManager = AbstractC0201g.m517q(this).getModifierLocalManager();
                C40005h key = ((InterfaceC40003f) interfaceC2315u).getKey();
                modifierLocalManager.f172588d.m94885b(AbstractC0201g.m516p(this));
                modifierLocalManager.f172589e.m94885b(key);
                modifierLocalManager.m128238a();
            }
            if (interfaceC2315u instanceof InterfaceC40000c) {
                ((InterfaceC40000c) interfaceC2315u).mo66704h(AbstractC0201g.f651a);
            }
        }
        if ((this.f9144y & 8) != 0) {
            ((AndroidComposeView) AbstractC0201g.m517q(this)).m3573E();
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m463Z0() {
        if (this.f9141N) {
            this.f618Q.clear();
            AbstractC0201g.m517q(this).getSnapshotObserver().m457a(this, C0197f.f645x, new C0185c(this, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [b2.v] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [b2.v] */
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
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // p669z2.InterfaceC40002e, p669z2.InterfaceC40004g
    /* JADX INFO: renamed from: a */
    public final Object mo464a(C40005h c40005h) {
        C0223l1 c0223l1;
        this.f618Q.add(c40005h);
        if (!this.f9142w.f9141N) {
            AbstractC37831a.m121374b("visitAncestors called on an unattached node");
        }
        AbstractC2316v abstractC2316v = this.f9142w.f9132E;
        C0230n0 c0230n0M516p = AbstractC0201g.m516p(this);
        while (c0230n0M516p != null) {
            if ((((AbstractC2316v) c0230n0M516p.f783e0.f743g).f9145z & 32) != 0) {
                while (abstractC2316v != null) {
                    if ((abstractC2316v.f9144y & 32) != 0) {
                        ?? M504d = abstractC2316v;
                        ?? c30849c = 0;
                        while (M504d != 0) {
                            if (M504d instanceof InterfaceC40002e) {
                                InterfaceC40002e interfaceC40002e = (InterfaceC40002e) M504d;
                                if (interfaceC40002e.mo474v().mo113251c(c40005h)) {
                                    return interfaceC40002e.mo474v().mo113253e(c40005h);
                                }
                            } else if ((M504d.f9144y & 32) != 0 && (M504d instanceof AbstractC0233o)) {
                                AbstractC2316v abstractC2316v2 = ((AbstractC0233o) M504d).f804P;
                                int i13 = 0;
                                M504d = M504d;
                                c30849c = c30849c;
                                while (abstractC2316v2 != null) {
                                    if ((abstractC2316v2.f9144y & 32) != 0) {
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
        return c40005h.f172591a.invoke();
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        InterfaceC2315u interfaceC2315u = this.f616O;
        AbstractC22676k.m65748h(interfaceC2315u, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC39080c0) interfaceC2315u).mo14262b(interfaceC39133t0, interfaceC39124q0, j7);
    }

    @Override // p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: b0 */
    public final void mo465b0() {
        InterfaceC2315u interfaceC2315u = this.f616O;
        AbstractC22676k.m65748h(interfaceC2315u, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((C34479y) ((InterfaceC34475u) interfaceC2315u)).m108970j().m91076A0();
    }

    @Override // p005a3.InterfaceC0229n, p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: c */
    public final void mo466c() {
        if (this.f616O instanceof InterfaceC34475u) {
            mo465b0();
        }
    }

    @Override // p005a3.InterfaceC0245r
    /* JADX INFO: renamed from: c0 */
    public final void mo467c0() {
        AbstractC0201g.m508h(this);
    }

    @Override // p134f2.InterfaceC14013b
    /* JADX INFO: renamed from: d */
    public final long mo468d() {
        return AbstractC35744b.m113239l(AbstractC0201g.m514n(this, 128).f168213y);
    }

    @Override // p005a3.InterfaceC0178a0
    /* JADX INFO: renamed from: g */
    public final void mo423g(long j7) {
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: g0 */
    public final int mo435g0(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        InterfaceC2315u interfaceC2315u = this.f616O;
        AbstractC22676k.m65748h(interfaceC2315u, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return AbstractC32121b.m100017w((InterfaceC39080c0) interfaceC2315u, abstractC0262w0, interfaceC39124q0, i13);
    }

    @Override // p134f2.InterfaceC14013b
    public final InterfaceC39171c getDensity() {
        return AbstractC0201g.m516p(this).f776X;
    }

    @Override // p134f2.InterfaceC14013b
    public final EnumC39181m getLayoutDirection() {
        return AbstractC0201g.m516p(this).f777Y;
    }

    @Override // p164g2.InterfaceC15245q
    /* JADX INFO: renamed from: j0 */
    public final void mo469j0(InterfaceC15241m interfaceC15241m) {
        InterfaceC2315u interfaceC2315u = this.f616O;
        AbstractC37831a.m121374b("applyFocusProperties called on wrong node");
        AbstractC30802r.m94771t(interfaceC2315u);
        throw null;
    }

    @Override // p164g2.InterfaceC15233e
    /* JADX INFO: renamed from: k */
    public final void mo470k(EnumC15251w enumC15251w) {
        InterfaceC2315u interfaceC2315u = this.f616O;
        AbstractC37831a.m121374b("onFocusEvent called on wrong node");
        AbstractC30802r.m94771t(interfaceC2315u);
        throw null;
    }

    @Override // p005a3.InterfaceC0216j2
    /* JADX INFO: renamed from: n */
    public final void mo471n(InterfaceC18044z interfaceC18044z) {
        InterfaceC2315u interfaceC2315u = this.f616O;
        AbstractC22676k.m65748h(interfaceC2315u, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        C18030l c18030lMo3600i = ((InterfaceC18031m) interfaceC2315u).mo3600i();
        AbstractC22676k.m65748h(interfaceC18044z, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        C18030l c18030l = (C18030l) interfaceC18044z;
        C0057v0 c0057v0 = c18030l.f69980w;
        if (c18030lMo3600i.f69982y) {
            c18030l.f69982y = true;
        }
        if (c18030lMo3600i.f69983z) {
            c18030l.f69983z = true;
        }
        C0057v0 c0057v1 = c18030lMo3600i.f69980w;
        Object[] objArr = c0057v1.f171b;
        Object[] objArr2 = c0057v1.f172c;
        long[] jArr = c0057v1.f170a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j7 = jArr[i13];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8;
                int i15 = 8 - ((~(i13 - length)) >>> 31);
                int i16 = 0;
                while (i16 < i15) {
                    if ((255 & j7) < 128) {
                        int i17 = (i13 << 3) + i16;
                        Object obj = objArr[i17];
                        Object obj2 = objArr2[i17];
                        C18043y c18043y = (C18043y) obj;
                        if (!c0057v0.m124b(c18043y)) {
                            c0057v0.m135m(c18043y, obj2);
                        } else if (obj2 instanceof C18017a) {
                            Object objM129g = c0057v0.m129g(c18043y);
                            AbstractC22676k.m65748h(objM129g, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            C18017a c18017a = (C18017a) objM129g;
                            String str = c18017a.f69928a;
                            if (str == null) {
                                str = ((C18017a) obj2).f69928a;
                            }
                            InterfaceC23459e interfaceC23459e = c18017a.f69929b;
                            if (interfaceC23459e == null) {
                                interfaceC23459e = ((C18017a) obj2).f69929b;
                            }
                            c0057v0.m135m(c18043y, new C18017a(str, interfaceC23459e));
                        }
                    }
                    j7 >>= i14;
                    i16++;
                    i14 = i14;
                }
                if (i15 != i14) {
                    return;
                }
            }
            if (i13 == length) {
                return;
            } else {
                i13++;
            }
        }
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: o */
    public final int mo436o(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        InterfaceC2315u interfaceC2315u = this.f616O;
        AbstractC22676k.m65748h(interfaceC2315u, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return AbstractC32121b.m100015u((InterfaceC39080c0) interfaceC2315u, abstractC0262w0, interfaceC39124q0, i13);
    }

    @Override // p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: r */
    public final void mo472r() {
        InterfaceC2315u interfaceC2315u = this.f616O;
        AbstractC22676k.m65748h(interfaceC2315u, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((C34479y) ((InterfaceC34475u) interfaceC2315u)).m108970j().getClass();
    }

    @Override // p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: r0 */
    public final void mo473r0(C34465k c34465k, EnumC34466l enumC34466l, long j7) {
        InterfaceC2315u interfaceC2315u = this.f616O;
        AbstractC22676k.m65748h(interfaceC2315u, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((C34479y) ((InterfaceC34475u) interfaceC2315u)).m108970j().m91077B0(c34465k, enumC34466l);
    }

    public final String toString() {
        return this.f616O.toString();
    }

    @Override // p669z2.InterfaceC40002e
    /* JADX INFO: renamed from: v */
    public final AbstractC35745c mo474v() {
        C39998a c39998a = this.f617P;
        return c39998a != null ? c39998a : C39999b.f172584a;
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: y */
    public final int mo437y(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        InterfaceC2315u interfaceC2315u = this.f616O;
        AbstractC22676k.m65748h(interfaceC2315u, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return AbstractC32121b.m100016v((InterfaceC39080c0) interfaceC2315u, abstractC0262w0, interfaceC39124q0, i13);
    }
}
