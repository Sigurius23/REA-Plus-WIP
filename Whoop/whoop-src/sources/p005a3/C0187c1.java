package p005a3;

import androidx.compose.p018ui.node.C1134a;
import androidx.compose.p018ui.node.Owner;
import androidx.compose.p018ui.platform.AndroidComposeView;
import p002a0.C0006a1;
import p293l2.C23226c;
import p446r1.C30849c;
import p603x2.AbstractC37831a;
import p635y2.AbstractC39071a;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p636y3.C39169a;
import p636y3.C39178j;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a3.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0187c1 extends AbstractC39104j1 implements InterfaceC39124q0, InterfaceC0181b, InterfaceC0211i1 {

    /* JADX INFO: renamed from: F */
    public final C0246r0 f588F;

    /* JADX INFO: renamed from: G */
    public boolean f589G;

    /* JADX INFO: renamed from: K */
    public boolean f593K;

    /* JADX INFO: renamed from: L */
    public boolean f594L;

    /* JADX INFO: renamed from: M */
    public boolean f595M;

    /* JADX INFO: renamed from: N */
    public C39169a f596N;

    /* JADX INFO: renamed from: P */
    public Function1 f598P;

    /* JADX INFO: renamed from: Q */
    public C23226c f599Q;

    /* JADX INFO: renamed from: V */
    public boolean f604V;

    /* JADX INFO: renamed from: X */
    public Object f606X;

    /* JADX INFO: renamed from: Y */
    public boolean f607Y;

    /* JADX INFO: renamed from: H */
    public int f590H = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: I */
    public int f591I = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: J */
    public EnumC0214j0 f592J = EnumC0214j0.f715y;

    /* JADX INFO: renamed from: O */
    public long f597O = 0;

    /* JADX INFO: renamed from: R */
    public EnumC0268y0 f600R = EnumC0268y0.f918y;

    /* JADX INFO: renamed from: S */
    public final C0250s0 f601S = new C0250s0(this);

    /* JADX INFO: renamed from: T */
    public final C30849c f602T = new C30849c(new C0187c1[16]);

    /* JADX INFO: renamed from: U */
    public boolean f603U = true;

    /* JADX INFO: renamed from: W */
    public boolean f605W = true;

    public C0187c1(C0246r0 c0246r0) {
        this.f588F = c0246r0;
        this.f606X = c0246r0.f854p.f666S;
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: C */
    public final int mo438C(int i13) {
        m442H0();
        AbstractC0265x0 abstractC0265x0Mo3530e1 = this.f588F.m753a().mo3530e1();
        AbstractC22676k.m65747g(abstractC0265x0Mo3530e1);
        return abstractC0265x0Mo3530e1.mo438C(i13);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m439C0(boolean z4) {
        C0246r0 c0246r0 = this.f588F;
        if (z4 && c0246r0.f841c) {
            return;
        }
        if (z4 || c0246r0.f841c) {
            this.f600R = EnumC0268y0.f918y;
            C30849c c30849cM595M = c0246r0.f839a.m595M();
            Object[] objArr = c30849cM595M.f127227w;
            int i13 = c30849cM595M.f127229y;
            for (int i14 = 0; i14 < i13; i14++) {
                C0187c1 c0187c1 = ((C0230n0) objArr[i14]).m643t().f855q;
                AbstractC22676k.m65747g(c0187c1);
                c0187c1.m439C0(true);
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m440F0() {
        EnumC0268y0 enumC0268y0 = this.f600R;
        C0246r0 c0246r0 = this.f588F;
        boolean z4 = c0246r0.f841c;
        C0230n0 c0230n0 = c0246r0.f839a;
        if (z4) {
            this.f600R = EnumC0268y0.f917x;
        } else {
            this.f600R = EnumC0268y0.f916w;
        }
        if (enumC0268y0 != EnumC0268y0.f916w && c0246r0.f843e) {
            C0230n0.m574t0(c0230n0, true, 6);
        }
        C30849c c30849cM595M = c0230n0.m595M();
        Object[] objArr = c30849cM595M.f127227w;
        int i13 = c30849cM595M.f127229y;
        for (int i14 = 0; i14 < i13; i14++) {
            C0230n0 c0230n1 = (C0230n0) objArr[i14];
            C0187c1 c0187c1M650y = c0230n1.m650y();
            if (c0187c1M650y == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (c0187c1M650y.f591I != Integer.MAX_VALUE) {
                c0187c1M650y.m440F0();
                C0230n0.m576w0(c0230n1);
            }
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m441G0() {
        C0246r0 c0246r0 = this.f588F;
        if (c0246r0.f853o > 0) {
            C30849c c30849cM595M = c0246r0.f839a.m595M();
            Object[] objArr = c30849cM595M.f127227w;
            int i13 = c30849cM595M.f127229y;
            for (int i14 = 0; i14 < i13; i14++) {
                C0230n0 c0230n0 = (C0230n0) objArr[i14];
                C0246r0 c0246r0M643t = c0230n0.m643t();
                if ((c0246r0M643t.f851m || c0246r0M643t.f852n) && !c0246r0M643t.f844f) {
                    c0230n0.m642s0(false);
                }
                C0187c1 c0187c1 = c0246r0M643t.f855q;
                if (c0187c1 != null) {
                    c0187c1.m441G0();
                }
            }
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m442H0() {
        EnumC0214j0 enumC0214j0;
        C0246r0 c0246r0 = this.f588F;
        C0230n0.m574t0(c0246r0.f839a, false, 7);
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

    /* JADX INFO: renamed from: I0 */
    public final void m443I0() {
        this.f607Y = true;
        C0246r0 c0246r0 = this.f588F;
        C0230n0 c0230n0M588G = c0246r0.f839a.m588G();
        EnumC0268y0 enumC0268y0 = this.f600R;
        if ((enumC0268y0 != EnumC0268y0.f916w && !c0246r0.f841c) || (enumC0268y0 != EnumC0268y0.f917x && c0246r0.f841c)) {
            m440F0();
            if (this.f589G && c0230n0M588G != null) {
                c0230n0M588G.m642s0(false);
            }
        }
        if (c0230n0M588G == null) {
            this.f591I = 0;
        } else if (!this.f589G && (c0230n0M588G.m646v() == EnumC0206h0.f693y || c0230n0M588G.m646v() == EnumC0206h0.f694z)) {
            if (this.f591I != Integer.MAX_VALUE) {
                AbstractC37831a.m121374b("Place was called on a node which was placed already");
            }
            this.f591I = c0230n0M588G.m643t().f846h;
            c0230n0M588G.m643t().f846h++;
        }
        mo429t();
    }

    @Override // p005a3.InterfaceC0181b
    /* JADX INFO: renamed from: J */
    public final C1134a mo424J() {
        return (C1134a) this.f588F.f839a.f783e0.f740d;
    }

    /* JADX INFO: renamed from: L0 */
    public final void m444L0(long j7, Function1 function1, C23226c c23226c) throws Throwable {
        C0246r0 c0246r0 = this.f588F;
        C0230n0 c0230n0 = c0246r0.f839a;
        C0230n0 c0230n1 = c0246r0.f839a;
        try {
            C0230n0 c0230n0M588G = c0230n0.m588G();
            EnumC0206h0 enumC0206h0M646v = c0230n0M588G != null ? c0230n0M588G.m646v() : null;
            EnumC0206h0 enumC0206h0 = EnumC0206h0.f694z;
            if (enumC0206h0M646v == enumC0206h0) {
                c0246r0.f841c = false;
            }
            if (c0230n1.f793o0) {
                AbstractC37831a.m121373a("place is called on a deactivated node");
            }
            c0246r0.f842d = enumC0206h0;
            this.f594L = true;
            this.f607Y = false;
            if (!C39178j.m124792b(j7, this.f597O)) {
                if (c0246r0.f852n || c0246r0.f851m) {
                    c0246r0.f844f = true;
                }
                m441G0();
            }
            Owner ownerM750a = AbstractC0242q0.m750a(c0230n1);
            if (c0246r0.f844f || !mo430v()) {
                c0246r0.m760h(false);
                this.f601S.f576g = false;
                C0188c2 snapshotObserver = ownerM750a.getSnapshotObserver();
                C0183b1 c0183b1 = new C0183b1(this, ownerM750a, j7);
                snapshotObserver.getClass();
                if (c0230n1.f759G != null) {
                    snapshotObserver.m457a(c0230n1, snapshotObserver.f614g, c0183b1);
                } else {
                    snapshotObserver.m457a(c0230n1, snapshotObserver.f613f, c0183b1);
                }
            } else {
                AbstractC0265x0 abstractC0265x0Mo3530e1 = c0246r0.m753a().mo3530e1();
                AbstractC22676k.m65747g(abstractC0265x0Mo3530e1);
                abstractC0265x0Mo3530e1.m805X0(C39178j.m124794d(j7, abstractC0265x0Mo3530e1.f168210E));
                m443I0();
            }
            this.f597O = j7;
            this.f598P = function1;
            this.f599Q = c23226c;
            c0246r0.f842d = EnumC0206h0.f689E;
        } catch (Throwable th3) {
            c0230n0.m651y0(th3);
            throw null;
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final boolean m445M0(long j7) throws Throwable {
        long j13;
        C0246r0 c0246r0 = this.f588F;
        C0230n0 c0230n0 = c0246r0.f839a;
        C0230n0 c0230n1 = c0246r0.f839a;
        try {
            if (c0230n0.f793o0) {
                AbstractC37831a.m121373a("measure is called on a deactivated node");
            }
            C0230n0 c0230n0M588G = c0230n1.m588G();
            c0230n1.f782d0 = c0230n1.f782d0 || (c0230n0M588G != null && c0230n0M588G.f782d0);
            if (!c0230n1.m648x()) {
                C39169a c39169a = this.f596N;
                if (c39169a == null ? false : C39169a.m124759c(c39169a.f168407a, j7)) {
                    Owner owner = c0230n1.f765M;
                    if (owner != null) {
                        ((AndroidComposeView) owner).m3585l(c0230n1, true);
                    }
                    c0230n1.m649x0();
                    return false;
                }
            }
            this.f596N = new C39169a(j7);
            m124636v0(j7);
            this.f601S.f575f = false;
            C30849c c30849cM595M = c0230n1.m595M();
            Object[] objArr = c30849cM595M.f127227w;
            int i13 = c30849cM595M.f127229y;
            for (int i14 = 0; i14 < i13; i14++) {
                C0187c1 c0187c1 = ((C0230n0) objArr[i14]).m643t().f855q;
                AbstractC22676k.m65747g(c0187c1);
                c0187c1.f601S.f572c = false;
            }
            if (this.f595M) {
                j13 = this.f168213y;
            } else {
                long j14 = Integer.MIN_VALUE;
                j13 = (j14 & 4294967295L) | (j14 << 32);
            }
            this.f595M = true;
            AbstractC0265x0 abstractC0265x0Mo3530e1 = c0246r0.m753a().mo3530e1();
            if (!(abstractC0265x0Mo3530e1 != null)) {
                AbstractC37831a.m121374b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            c0246r0.m755c(j7);
            m124635r0((((long) abstractC0265x0Mo3530e1.f168212x) & 4294967295L) | (((long) abstractC0265x0Mo3530e1.f168211w) << 32));
            return (((int) (j13 >> 32)) == abstractC0265x0Mo3530e1.f168211w && ((int) (j13 & 4294967295L)) == abstractC0265x0Mo3530e1.f168212x) ? false : true;
        } catch (Throwable th3) {
            c0230n0.m651y0(th3);
            throw null;
        }
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: O */
    public final int mo446O(int i13) {
        m442H0();
        AbstractC0265x0 abstractC0265x0Mo3530e1 = this.f588F.m753a().mo3530e1();
        AbstractC22676k.m65747g(abstractC0265x0Mo3530e1);
        return abstractC0265x0Mo3530e1.mo446O(i13);
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: Q */
    public final int mo447Q(int i13) {
        m442H0();
        AbstractC0265x0 abstractC0265x0Mo3530e1 = this.f588F.m753a().mo3530e1();
        AbstractC22676k.m65747g(abstractC0265x0Mo3530e1);
        return abstractC0265x0Mo3530e1.mo447Q(i13);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: T */
    public final AbstractC39104j1 mo448T(long j7) {
        EnumC0214j0 enumC0214j0;
        C0246r0 c0246r0 = this.f588F;
        C0230n0 c0230n0M588G = c0246r0.f839a.m588G();
        if ((c0230n0M588G != null ? c0230n0M588G.m646v() : null) == EnumC0206h0.f692x) {
            c0246r0.f840b = false;
        } else {
            C0230n0 c0230n0M588G2 = c0246r0.f839a.m588G();
            if ((c0230n0M588G2 != null ? c0230n0M588G2.m646v() : null) == EnumC0206h0.f694z) {
                c0246r0.f840b = false;
            }
        }
        C0230n0 c0230n0 = c0246r0.f839a;
        C0230n0 c0230n0M588G3 = c0230n0.m588G();
        if (c0230n0M588G3 != null) {
            if (this.f592J != EnumC0214j0.f715y && !c0230n0.f782d0) {
                AbstractC37831a.m121374b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = c0230n0M588G3.m646v().ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                enumC0214j0 = EnumC0214j0.f713w;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + c0230n0M588G3.m646v());
                }
                enumC0214j0 = EnumC0214j0.f714x;
            }
            this.f592J = enumC0214j0;
        } else {
            this.f592J = EnumC0214j0.f715y;
        }
        C0230n0 c0230n1 = c0246r0.f839a;
        if (c0230n1.f780b0 == EnumC0214j0.f715y) {
            c0230n1.m613d();
        }
        m445M0(j7);
        return this;
    }

    @Override // p005a3.InterfaceC0181b
    /* JADX INFO: renamed from: a */
    public final AbstractC0177a mo425a() {
        return this.f601S;
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: b */
    public final int mo449b(int i13) {
        m442H0();
        AbstractC0265x0 abstractC0265x0Mo3530e1 = this.f588F.m753a().mo3530e1();
        AbstractC22676k.m65747g(abstractC0265x0Mo3530e1);
        return abstractC0265x0Mo3530e1.mo449b(i13);
    }

    @Override // p005a3.InterfaceC0181b
    /* JADX INFO: renamed from: b0 */
    public final void mo426b0() {
        C0230n0.m574t0(this.f588F.f839a, false, 7);
    }

    @Override // p635y2.AbstractC39104j1
    /* JADX INFO: renamed from: c0 */
    public final int mo450c0(AbstractC39071a abstractC39071a) {
        C0246r0 c0246r0 = this.f588F;
        C0230n0 c0230n0M588G = c0246r0.f839a.m588G();
        EnumC0206h0 enumC0206h0M646v = c0230n0M588G != null ? c0230n0M588G.m646v() : null;
        EnumC0206h0 enumC0206h0 = EnumC0206h0.f692x;
        C0250s0 c0250s0 = this.f601S;
        if (enumC0206h0M646v == enumC0206h0) {
            c0250s0.f572c = true;
        } else {
            C0230n0 c0230n0M588G2 = c0246r0.f839a.m588G();
            if ((c0230n0M588G2 != null ? c0230n0M588G2.m646v() : null) == EnumC0206h0.f694z) {
                c0250s0.f573d = true;
            }
        }
        this.f593K = true;
        AbstractC0265x0 abstractC0265x0Mo3530e1 = c0246r0.m753a().mo3530e1();
        AbstractC22676k.m65747g(abstractC0265x0Mo3530e1);
        int iMo450c0 = abstractC0265x0Mo3530e1.mo450c0(abstractC39071a);
        this.f593K = false;
        return iMo450c0;
    }

    @Override // p005a3.InterfaceC0181b
    /* JADX INFO: renamed from: e */
    public final void mo427e(C0006a1 c0006a1) {
        C30849c c30849cM595M = this.f588F.f839a.m595M();
        Object[] objArr = c30849cM595M.f127227w;
        int i13 = c30849cM595M.f127229y;
        for (int i14 = 0; i14 < i13; i14++) {
            C0187c1 c0187c1 = ((C0230n0) objArr[i14]).m643t().f855q;
            AbstractC22676k.m65747g(c0187c1);
            c0006a1.invoke(c0187c1);
        }
    }

    @Override // p005a3.InterfaceC0181b
    /* JADX INFO: renamed from: f */
    public final InterfaceC0181b mo428f() {
        C0246r0 c0246r0M643t;
        C0230n0 c0230n0M588G = this.f588F.f839a.m588G();
        if (c0230n0M588G == null || (c0246r0M643t = c0230n0M588G.m643t()) == null) {
            return null;
        }
        return c0246r0M643t.f855q;
    }

    @Override // p635y2.AbstractC39104j1
    /* JADX INFO: renamed from: g0 */
    public final int mo451g0() {
        AbstractC0265x0 abstractC0265x0Mo3530e1 = this.f588F.m753a().mo3530e1();
        AbstractC22676k.m65747g(abstractC0265x0Mo3530e1);
        return abstractC0265x0Mo3530e1.mo451g0();
    }

    @Override // p635y2.AbstractC39104j1
    /* JADX INFO: renamed from: j0 */
    public final int mo452j0() {
        AbstractC0265x0 abstractC0265x0Mo3530e1 = this.f588F.m753a().mo3530e1();
        AbstractC22676k.m65747g(abstractC0265x0Mo3530e1);
        return abstractC0265x0Mo3530e1.mo452j0();
    }

    @Override // p635y2.AbstractC39104j1
    /* JADX INFO: renamed from: o0 */
    public final void mo453o0(long j7, float f13, Function1 function1) throws Throwable {
        m444L0(j7, function1, null);
    }

    @Override // p635y2.AbstractC39104j1, p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: p */
    public final Object mo454p() {
        return this.f606X;
    }

    @Override // p635y2.AbstractC39104j1
    /* JADX INFO: renamed from: p0 */
    public final void mo455p0(long j7, float f13, C23226c c23226c) throws Throwable {
        m444L0(j7, null, c23226c);
    }

    @Override // p005a3.InterfaceC0181b
    public final void requestLayout() {
        this.f588F.f839a.m642s0(false);
    }

    @Override // p005a3.InterfaceC0211i1
    /* JADX INFO: renamed from: s */
    public final void mo456s(boolean z4) {
        AbstractC0265x0 abstractC0265x0Mo3530e1;
        C0246r0 c0246r0 = this.f588F;
        AbstractC0265x0 abstractC0265x0Mo3530e2 = c0246r0.m753a().mo3530e1();
        if (Boolean.valueOf(z4).equals(abstractC0265x0Mo3530e2 != null ? Boolean.valueOf(abstractC0265x0Mo3530e2.f896I) : null) || (abstractC0265x0Mo3530e1 = c0246r0.m753a().mo3530e1()) == null) {
            return;
        }
        abstractC0265x0Mo3530e1.f896I = z4;
    }

    @Override // p005a3.InterfaceC0181b
    /* JADX INFO: renamed from: t */
    public final void mo429t() {
        this.f604V = true;
        C0250s0 c0250s0 = this.f601S;
        c0250s0.m421i();
        C0246r0 c0246r0 = this.f588F;
        boolean z4 = c0246r0.f844f;
        C0230n0 c0230n0 = c0246r0.f839a;
        if (z4) {
            C30849c c30849cM595M = c0230n0.m595M();
            Object[] objArr = c30849cM595M.f127227w;
            int i13 = c30849cM595M.f127229y;
            for (int i14 = 0; i14 < i13; i14++) {
                C0230n0 c0230n1 = (C0230n0) objArr[i14];
                if (c0230n1.m648x() && c0230n1.m581C() == EnumC0214j0.f713w) {
                    C0187c1 c0187c1 = c0230n1.m643t().f855q;
                    AbstractC22676k.m65747g(c0187c1);
                    C0187c1 c0187c2 = c0230n1.m643t().f855q;
                    C39169a c39169a = c0187c2 != null ? c0187c2.f596N : null;
                    AbstractC22676k.m65747g(c39169a);
                    if (c0187c1.m445M0(c39169a.f168407a)) {
                        C0230n0.m574t0(c0230n0, false, 7);
                    }
                }
            }
        }
        C0261w c0261w = mo424J().f4882q0;
        AbstractC22676k.m65747g(c0261w);
        if (c0246r0.f845g || (!this.f593K && !c0261w.f898K && c0246r0.f844f)) {
            c0246r0.f844f = false;
            EnumC0206h0 enumC0206h0 = c0246r0.f842d;
            c0246r0.f842d = EnumC0206h0.f694z;
            Owner ownerM750a = AbstractC0242q0.m750a(c0230n0);
            c0246r0.m761i(false);
            C0188c2 snapshotObserver = ownerM750a.getSnapshotObserver();
            C0271z0 c0271z0 = new C0271z0(0, this, c0261w);
            snapshotObserver.getClass();
            if (c0230n0.f759G != null) {
                snapshotObserver.m457a(c0230n0, snapshotObserver.f615h, c0271z0);
            } else {
                snapshotObserver.m457a(c0230n0, snapshotObserver.f612e, c0271z0);
            }
            c0246r0.f842d = enumC0206h0;
            if (c0246r0.f851m && c0261w.f898K) {
                requestLayout();
            }
            c0246r0.f845g = false;
        }
        if (c0250s0.f573d) {
            c0250s0.f574e = true;
        }
        if (c0250s0.f571b && c0250s0.m418f()) {
            c0250s0.m420h();
        }
        this.f604V = false;
    }

    @Override // p005a3.InterfaceC0181b
    /* JADX INFO: renamed from: v */
    public final boolean mo430v() {
        return this.f600R != EnumC0268y0.f918y;
    }
}
