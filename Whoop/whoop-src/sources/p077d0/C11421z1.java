package p077d0;

import a11.C0132j;
import al.AbstractC0954a;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import bp0.C3526n;
import e93.AbstractC12889b;
import p390p1.AbstractC28683x;
import p390p1.C28612f0;
import p390p1.C28625i1;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28670t2;
import p668z1.C39967p;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d0.z1 */
/* JADX INFO: loaded from: classes.dex */
public final class C11421z1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0954a f36630a;

    /* JADX INFO: renamed from: b */
    public final C11421z1 f36631b;

    /* JADX INFO: renamed from: c */
    public final String f36632c;

    /* JADX INFO: renamed from: d */
    public final C28633k1 f36633d;

    /* JADX INFO: renamed from: e */
    public final C28633k1 f36634e;

    /* JADX INFO: renamed from: f */
    public final C28625i1 f36635f = new C28625i1(0);

    /* JADX INFO: renamed from: g */
    public final C28625i1 f36636g = new C28625i1(Long.MIN_VALUE);

    /* JADX INFO: renamed from: h */
    public final C28633k1 f36637h;

    /* JADX INFO: renamed from: i */
    public final C39967p f36638i;

    /* JADX INFO: renamed from: j */
    public final C39967p f36639j;

    /* JADX INFO: renamed from: k */
    public final C28633k1 f36640k;

    /* JADX INFO: renamed from: l */
    public final C28612f0 f36641l;

    public C11421z1(AbstractC0954a abstractC0954a, C11421z1 c11421z1, String str) {
        this.f36630a = abstractC0954a;
        this.f36631b = c11421z1;
        this.f36632c = str;
        this.f36633d = AbstractC28683x.m87272z(abstractC0954a.mo2428y0());
        this.f36634e = AbstractC28683x.m87272z(new C11406u1(abstractC0954a.mo2428y0(), abstractC0954a.mo2428y0()));
        Boolean bool = Boolean.FALSE;
        this.f36637h = AbstractC28683x.m87272z(bool);
        this.f36638i = new C39967p();
        this.f36639j = new C39967p();
        this.f36640k = AbstractC28683x.m87272z(bool);
        this.f36641l = AbstractC28683x.m87264r(new C11394q1(this, 1));
        abstractC0954a.mo2415C0(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m30659a(Object obj, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1493585151);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(obj) : c28655q.m87157i(obj) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(this) ? 32 : 16;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (m30665g()) {
            c28655q.m87150e0(467781377);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(466120769);
            m30674p(obj);
            int i15 = i14 & 112;
            boolean z4 = i15 == 32;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87264r(new C11394q1(this, 0));
                c28655q.m87172p0(objM87133R);
            }
            if (((Boolean) ((InterfaceC28670t2) objM87133R).getValue()).booleanValue()) {
                c28655q.m87150e0(466528884);
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | (i15 == 32);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87157i || objM87133R3 == c28676v0) {
                    objM87133R3 = new C3526n(9, interfaceC2994c0, this);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87250d(interfaceC2994c0, this, (Function1) objM87133R3, c28655q);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(467771457);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0132j(this, obj, i13, 2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m30660b() {
        C39967p c39967p = this.f36638i;
        int size = c39967p.size();
        long jMax = 0;
        for (int i13 = 0; i13 < size; i13++) {
            jMax = Math.max(jMax, ((C11409v1) c39967p.get(i13)).f36587L.m87032x());
        }
        C39967p c39967p2 = this.f36639j;
        int size2 = c39967p2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            jMax = Math.max(jMax, ((C11421z1) c39967p2.get(i14)).m30660b());
        }
        return jMax;
    }

    /* JADX INFO: renamed from: c */
    public final void m30661c() {
        C39967p c39967p = this.f36638i;
        int size = c39967p.size();
        for (int i13 = 0; i13 < size; i13++) {
            C11409v1 c11409v1 = (C11409v1) c39967p.get(i13);
            c11409v1.f36581F = null;
            c11409v1.f36580E = null;
            c11409v1.f36584I = false;
        }
        C39967p c39967p2 = this.f36639j;
        int size2 = c39967p2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            ((C11421z1) c39967p2.get(i14)).m30661c();
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m30662d() {
        C39967p c39967p = this.f36638i;
        int size = c39967p.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (((C11409v1) c39967p.get(i13)).f36580E != null) {
                return true;
            }
        }
        C39967p c39967p2 = this.f36639j;
        int size2 = c39967p2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            if (((C11421z1) c39967p2.get(i14)).m30662d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final long m30663e() {
        C11421z1 c11421z1 = this.f36631b;
        return c11421z1 != null ? c11421z1.m30663e() : this.f36635f.m87032x();
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC11403t1 m30664f() {
        return (InterfaceC11403t1) this.f36634e.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m30665g() {
        return ((Boolean) this.f36640k.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public final void m30666h(long j7, boolean z4) {
        C28625i1 c28625i1 = this.f36636g;
        long jM87032x = c28625i1.m87032x();
        AbstractC0954a abstractC0954a = this.f36630a;
        if (jM87032x == Long.MIN_VALUE) {
            c28625i1.m87033y(j7);
            ((C28633k1) abstractC0954a.f3536x).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((C28633k1) abstractC0954a.f3536x).getValue()).booleanValue()) {
            ((C28633k1) abstractC0954a.f3536x).setValue(Boolean.TRUE);
        }
        this.f36637h.setValue(Boolean.FALSE);
        C39967p c39967p = this.f36638i;
        int size = c39967p.size();
        boolean z13 = true;
        for (int i13 = 0; i13 < size; i13++) {
            C11409v1 c11409v1 = (C11409v1) c39967p.get(i13);
            C28633k1 c28633k1 = c11409v1.f36582G;
            C28633k1 c28633k2 = c11409v1.f36582G;
            if (!((Boolean) c28633k1.getValue()).booleanValue()) {
                long jMo30594d = z4 ? c11409v1.m30640a().mo30594d() : j7;
                c11409v1.m30642d(c11409v1.m30640a().mo30596f(jMo30594d));
                c11409v1.f36586K = c11409v1.m30640a().mo30592b(jMo30594d);
                if (c11409v1.m30640a().m30593c(jMo30594d)) {
                    c28633k2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) c28633k2.getValue()).booleanValue()) {
                z13 = false;
            }
        }
        C39967p c39967p2 = this.f36639j;
        int size2 = c39967p2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            C11421z1 c11421z1 = (C11421z1) c39967p2.get(i14);
            C28633k1 c28633k3 = c11421z1.f36633d;
            AbstractC0954a abstractC0954a2 = c11421z1.f36630a;
            if (!AbstractC22676k.m65745e(c28633k3.getValue(), abstractC0954a2.mo2428y0())) {
                c11421z1.m30666h(j7, z4);
            }
            if (!AbstractC22676k.m65745e(c11421z1.f36633d.getValue(), abstractC0954a2.mo2428y0())) {
                z13 = false;
            }
        }
        if (z13) {
            m30667i();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m30667i() {
        this.f36636g.m87033y(Long.MIN_VALUE);
        AbstractC0954a abstractC0954a = this.f36630a;
        if (abstractC0954a instanceof C11393q0) {
            ((C11393q0) abstractC0954a).mo2414B0(this.f36633d.getValue());
        }
        m30672n(0L);
        ((C28633k1) abstractC0954a.f3536x).setValue(Boolean.FALSE);
        C39967p c39967p = this.f36639j;
        int size = c39967p.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((C11421z1) c39967p.get(i13)).m30667i();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m30668j(float f13) {
        C39967p c39967p = this.f36638i;
        int size = c39967p.size();
        for (int i13 = 0; i13 < size; i13++) {
            C11409v1 c11409v1 = (C11409v1) c39967p.get(i13);
            c11409v1.getClass();
            if (f13 == -4.0f || f13 == -5.0f) {
                C11390p1 c11390p1 = c11409v1.f36581F;
                if (c11390p1 != null) {
                    c11409v1.m30640a().m30625h(c11390p1.f36522c);
                    c11409v1.f36580E = null;
                    c11409v1.f36581F = null;
                }
                Object obj = f13 == -4.0f ? c11409v1.m30640a().f36523d : c11409v1.m30640a().f36522c;
                c11409v1.m30640a().m30625h(obj);
                c11409v1.m30640a().m30626i(obj);
                c11409v1.m30642d(obj);
                c11409v1.f36587L.m87033y(c11409v1.m30640a().mo30594d());
            } else {
                c11409v1.f36583H.m87023y(f13);
            }
        }
        C39967p c39967p2 = this.f36639j;
        int size2 = c39967p2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            ((C11421z1) c39967p2.get(i14)).m30668j(f13);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m30669k(Object obj, Object obj2) {
        this.f36636g.m87033y(Long.MIN_VALUE);
        AbstractC0954a abstractC0954a = this.f36630a;
        ((C28633k1) abstractC0954a.f3536x).setValue(Boolean.FALSE);
        boolean zM30665g = m30665g();
        C28633k1 c28633k1 = this.f36633d;
        if (!zM30665g || !AbstractC22676k.m65745e(abstractC0954a.mo2428y0(), obj) || !AbstractC22676k.m65745e(c28633k1.getValue(), obj2)) {
            if (!AbstractC22676k.m65745e(abstractC0954a.mo2428y0(), obj) && (abstractC0954a instanceof C11393q0)) {
                ((C11393q0) abstractC0954a).mo2414B0(obj);
            }
            c28633k1.setValue(obj2);
            this.f36640k.setValue(Boolean.TRUE);
            this.f36634e.setValue(new C11406u1(obj, obj2));
        }
        C39967p c39967p = this.f36639j;
        int size = c39967p.size();
        for (int i13 = 0; i13 < size; i13++) {
            C11421z1 c11421z1 = (C11421z1) c39967p.get(i13);
            AbstractC22676k.m65748h(c11421z1, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (c11421z1.m30665g()) {
                c11421z1.m30669k(c11421z1.f36630a.mo2428y0(), c11421z1.f36633d.getValue());
            }
        }
        C39967p c39967p2 = this.f36638i;
        int size2 = c39967p2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            ((C11409v1) c39967p2.get(i14)).m30641c(0L);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m30670l(long j7) {
        C28625i1 c28625i1 = this.f36636g;
        if (c28625i1.m87032x() == Long.MIN_VALUE) {
            c28625i1.m87033y(j7);
        }
        m30672n(j7);
        this.f36637h.setValue(Boolean.FALSE);
        C39967p c39967p = this.f36638i;
        int size = c39967p.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((C11409v1) c39967p.get(i13)).m30641c(j7);
        }
        C39967p c39967p2 = this.f36639j;
        int size2 = c39967p2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            C11421z1 c11421z1 = (C11421z1) c39967p2.get(i14);
            if (!AbstractC22676k.m65745e(c11421z1.f36633d.getValue(), c11421z1.f36630a.mo2428y0())) {
                c11421z1.m30670l(j7);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m30671m(C11417y0 c11417y0) {
        C39967p c39967p = this.f36638i;
        int size = c39967p.size();
        for (int i13 = 0; i13 < size; i13++) {
            C11409v1 c11409v1 = (C11409v1) c39967p.get(i13);
            C28633k1 c28633k1 = c11409v1.f36585J;
            if (!AbstractC22676k.m65745e(c11409v1.m30640a().f36522c, c11409v1.m30640a().f36523d)) {
                c11409v1.f36581F = c11409v1.m30640a();
                c11409v1.f36580E = c11417y0;
            }
            c11409v1.f36594z.setValue(new C11390p1(c11409v1.f36589N, c11409v1.f36591w, c28633k1.getValue(), c28633k1.getValue(), c11409v1.f36586K.mo30609c()));
            c11409v1.f36587L.m87033y(c11409v1.m30640a().mo30594d());
            c11409v1.f36584I = true;
        }
        C39967p c39967p2 = this.f36639j;
        int size2 = c39967p2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            ((C11421z1) c39967p2.get(i14)).m30671m(c11417y0);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m30672n(long j7) {
        if (this.f36631b == null) {
            this.f36635f.m87033y(j7);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m30673o() {
        C11390p1 c11390p1;
        C39967p c39967p = this.f36638i;
        int size = c39967p.size();
        for (int i13 = 0; i13 < size; i13++) {
            C11409v1 c11409v1 = (C11409v1) c39967p.get(i13);
            C11417y0 c11417y0 = c11409v1.f36580E;
            if (c11417y0 != null && (c11390p1 = c11409v1.f36581F) != null) {
                long jM36259Y = AbstractC12889b.m36259Y(c11417y0.m30648c() * ((double) c11417y0.m30652g()));
                Object objMo30596f = c11390p1.mo30596f(jM36259Y);
                if (c11409v1.f36584I) {
                    c11409v1.m30640a().m30626i(objMo30596f);
                }
                c11409v1.m30640a().m30625h(objMo30596f);
                c11409v1.f36587L.m87033y(c11409v1.m30640a().mo30594d());
                if (c11409v1.f36583H.m87022x() == -2.0f || c11409v1.f36584I) {
                    c11409v1.m30642d(objMo30596f);
                } else {
                    c11409v1.m30641c(c11409v1.f36590O.m30663e());
                }
                if (jM36259Y >= c11417y0.m30648c()) {
                    c11409v1.f36580E = null;
                    c11409v1.f36581F = null;
                } else {
                    c11417y0.m30655j(false);
                }
            }
        }
        C39967p c39967p2 = this.f36639j;
        int size2 = c39967p2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            ((C11421z1) c39967p2.get(i14)).m30673o();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m30674p(Object obj) {
        C28633k1 c28633k1 = this.f36633d;
        if (AbstractC22676k.m65745e(c28633k1.getValue(), obj)) {
            return;
        }
        this.f36634e.setValue(new C11406u1(c28633k1.getValue(), obj));
        AbstractC0954a abstractC0954a = this.f36630a;
        if (!AbstractC22676k.m65745e(abstractC0954a.mo2428y0(), c28633k1.getValue())) {
            abstractC0954a.mo2414B0(c28633k1.getValue());
        }
        c28633k1.setValue(obj);
        if (this.f36636g.m87032x() == Long.MIN_VALUE) {
            this.f36637h.setValue(Boolean.TRUE);
        }
        C39967p c39967p = this.f36638i;
        int size = c39967p.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((C11409v1) c39967p.get(i13)).f36583H.m87023y(-2.0f);
        }
    }

    public final String toString() {
        C39967p c39967p = this.f36638i;
        int size = c39967p.size();
        String str = "Transition animation values: ";
        for (int i13 = 0; i13 < size; i13++) {
            str = str + ((C11409v1) c39967p.get(i13)) + ", ";
        }
        return str;
    }
}
