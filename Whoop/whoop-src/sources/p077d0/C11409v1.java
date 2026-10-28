package p077d0;

import p390p1.AbstractC28683x;
import p390p1.C28617g1;
import p390p1.C28625i1;
import p390p1.C28633k1;
import p390p1.InterfaceC28670t2;
import p668z1.C39967p;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d0.v1 */
/* JADX INFO: loaded from: classes.dex */
public final class C11409v1 implements InterfaceC28670t2 {

    /* JADX INFO: renamed from: E */
    public C11417y0 f36580E;

    /* JADX INFO: renamed from: F */
    public C11390p1 f36581F;

    /* JADX INFO: renamed from: G */
    public final C28633k1 f36582G;

    /* JADX INFO: renamed from: H */
    public final C28617g1 f36583H;

    /* JADX INFO: renamed from: I */
    public boolean f36584I;

    /* JADX INFO: renamed from: J */
    public final C28633k1 f36585J;

    /* JADX INFO: renamed from: K */
    public AbstractC11395r f36586K;

    /* JADX INFO: renamed from: L */
    public final C28625i1 f36587L;

    /* JADX INFO: renamed from: M */
    public boolean f36588M;

    /* JADX INFO: renamed from: N */
    public final C11362i1 f36589N;

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ C11421z1 f36590O;

    /* JADX INFO: renamed from: w */
    public final C11351f2 f36591w;

    /* JADX INFO: renamed from: x */
    public final C28633k1 f36592x;

    /* JADX INFO: renamed from: y */
    public final C28633k1 f36593y;

    /* JADX INFO: renamed from: z */
    public final C28633k1 f36594z;

    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, java.util.Map] */
    public C11409v1(C11421z1 c11421z1, Object obj, AbstractC11395r abstractC11395r, C11351f2 c11351f2) {
        this.f36590O = c11421z1;
        this.f36591w = c11351f2;
        C28633k1 c28633k1M87272z = AbstractC28683x.m87272z(obj);
        this.f36592x = c28633k1M87272z;
        Object objInvoke = null;
        C28633k1 c28633k1M87272z2 = AbstractC28683x.m87272z(AbstractC11348f.m30573u(0.0f, 0.0f, 7, null));
        this.f36593y = c28633k1M87272z2;
        this.f36594z = AbstractC28683x.m87272z(new C11390p1((InterfaceC11337c0) c28633k1M87272z2.getValue(), c11351f2, obj, c28633k1M87272z.getValue(), abstractC11395r));
        this.f36582G = AbstractC28683x.m87272z(Boolean.TRUE);
        this.f36583H = new C28617g1(-1.0f);
        this.f36585J = AbstractC28683x.m87272z(obj);
        this.f36586K = abstractC11395r;
        this.f36587L = new C28625i1(m30640a().mo30594d());
        Float f13 = (Float) AbstractC11391p2.f36529a.get(c11351f2);
        if (f13 != null) {
            float fFloatValue = f13.floatValue();
            AbstractC11395r abstractC11395r2 = (AbstractC11395r) c11351f2.f36396a.invoke(obj);
            int iMo30608b = abstractC11395r2.mo30608b();
            for (int i13 = 0; i13 < iMo30608b; i13++) {
                abstractC11395r2.mo30611e(fFloatValue, i13);
            }
            objInvoke = this.f36591w.f36397b.invoke(abstractC11395r2);
        }
        this.f36589N = AbstractC11348f.m30573u(0.0f, 0.0f, 3, objInvoke);
    }

    /* JADX INFO: renamed from: a */
    public final C11390p1 m30640a() {
        return (C11390p1) this.f36594z.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final void m30641c(long j7) {
        if (this.f36583H.m87022x() == -1.0f) {
            this.f36588M = true;
            if (AbstractC22676k.m65745e(m30640a().f36522c, m30640a().f36523d)) {
                m30642d(m30640a().f36522c);
            } else {
                m30642d(m30640a().mo30596f(j7));
                this.f36586K = m30640a().mo30592b(j7);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m30642d(Object obj) {
        this.f36585J.setValue(obj);
    }

    /* JADX INFO: renamed from: e */
    public final void m30643e(Object obj, boolean z4) {
        C11390p1 c11390p1 = this.f36581F;
        Object obj2 = c11390p1 != null ? c11390p1.f36522c : null;
        C28633k1 c28633k1 = this.f36592x;
        boolean zM65745e = AbstractC22676k.m65745e(obj2, c28633k1.getValue());
        C28625i1 c28625i1 = this.f36587L;
        C28633k1 c28633k2 = this.f36594z;
        if (zM65745e) {
            c28633k2.setValue(new C11390p1(this.f36589N, this.f36591w, obj, obj, this.f36586K.mo30609c()));
            this.f36584I = true;
            c28625i1.m87033y(m30640a().mo30594d());
            return;
        }
        C28633k1 c28633k3 = this.f36593y;
        InterfaceC11337c0 interfaceC11337c0 = (!z4 || this.f36588M || (((InterfaceC11337c0) c28633k3.getValue()) instanceof C11362i1)) ? (InterfaceC11337c0) c28633k3.getValue() : this.f36589N;
        C11421z1 c11421z1 = this.f36590O;
        long jM30663e = c11421z1.m30663e();
        C28633k1 c28633k4 = c11421z1.f36637h;
        c28633k2.setValue(new C11390p1(jM30663e <= 0 ? interfaceC11337c0 : new C11366j1(interfaceC11337c0, c11421z1.m30663e()), this.f36591w, obj, c28633k1.getValue(), this.f36586K));
        c28625i1.m87033y(m30640a().mo30594d());
        this.f36584I = false;
        c28633k4.setValue(Boolean.TRUE);
        if (c11421z1.m30665g()) {
            C39967p c39967p = c11421z1.f36638i;
            int size = c39967p.size();
            long jMax = 0;
            for (int i13 = 0; i13 < size; i13++) {
                C11409v1 c11409v1 = (C11409v1) c39967p.get(i13);
                jMax = Math.max(jMax, c11409v1.f36587L.m87032x());
                c11409v1.m30641c(0L);
            }
            c28633k4.setValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m30644g(Object obj, Object obj2, InterfaceC11337c0 interfaceC11337c0) {
        this.f36592x.setValue(obj2);
        this.f36593y.setValue(interfaceC11337c0);
        if (AbstractC22676k.m65745e(m30640a().f36523d, obj) && AbstractC22676k.m65745e(m30640a().f36522c, obj2)) {
            return;
        }
        m30643e(obj, false);
    }

    @Override // p390p1.InterfaceC28670t2
    public final Object getValue() {
        return this.f36585J.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final void m30645j(Object obj, InterfaceC11337c0 interfaceC11337c0) {
        if (this.f36584I) {
            C11390p1 c11390p1 = this.f36581F;
            if (AbstractC22676k.m65745e(obj, c11390p1 != null ? c11390p1.f36522c : null)) {
                return;
            }
        }
        C28633k1 c28633k1 = this.f36592x;
        boolean zM65745e = AbstractC22676k.m65745e(c28633k1.getValue(), obj);
        C28617g1 c28617g1 = this.f36583H;
        if (zM65745e && c28617g1.m87022x() == -1.0f) {
            return;
        }
        c28633k1.setValue(obj);
        this.f36593y.setValue(interfaceC11337c0);
        Object value = c28617g1.m87022x() == -3.0f ? obj : this.f36585J.getValue();
        C28633k1 c28633k2 = this.f36582G;
        m30643e(value, !((Boolean) c28633k2.getValue()).booleanValue());
        c28633k2.setValue(Boolean.valueOf(c28617g1.m87022x() == -3.0f));
        if (c28617g1.m87022x() >= 0.0f) {
            m30642d(m30640a().mo30596f((long) (c28617g1.m87022x() * m30640a().mo30594d())));
        } else if (c28617g1.m87022x() == -3.0f) {
            m30642d(obj);
        }
        this.f36584I = false;
        c28617g1.m87023y(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.f36585J.getValue() + ", target: " + this.f36592x.getValue() + ", spec: " + ((InterfaceC11337c0) this.f36593y.getValue());
    }
}
