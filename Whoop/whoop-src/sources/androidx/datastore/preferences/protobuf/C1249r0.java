package androidx.datastore.preferences.protobuf;

import p000.AbstractC30802r;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.r0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1249r0 implements InterfaceC1270z0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC1197a f5468a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1211e1 f5469b;

    /* JADX INFO: renamed from: c */
    public final C1248r f5470c;

    public C1249r0(AbstractC1211e1 abstractC1211e1, C1248r c1248r, AbstractC1197a abstractC1197a) {
        this.f5469b = abstractC1211e1;
        c1248r.getClass();
        this.f5470c = c1248r;
        this.f5468a = abstractC1197a;
    }

    /* JADX INFO: renamed from: j */
    public static C1249r0 m4009j(AbstractC1211e1 abstractC1211e1, C1248r c1248r, AbstractC1197a abstractC1197a) {
        return new C1249r0(abstractC1211e1, c1248r, abstractC1197a);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1270z0
    /* JADX INFO: renamed from: a */
    public final void mo3988a(Object obj, Object obj2) {
        AbstractC1199a1.m3760k(this.f5469b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1270z0
    /* JADX INFO: renamed from: b */
    public final void mo3989b(Object obj) {
        ((C1217g1) this.f5469b).getClass();
        C1214f1 c1214f1 = ((AbstractC1269z) obj).unknownFields;
        if (c1214f1.f5395e) {
            c1214f1.f5395e = false;
        }
        this.f5470c.getClass();
        AbstractC30802r.m94771t(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1270z0
    /* JADX INFO: renamed from: c */
    public final boolean mo3990c(Object obj) {
        this.f5470c.getClass();
        AbstractC30802r.m94771t(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1270z0
    /* JADX INFO: renamed from: d */
    public final AbstractC1269z mo3991d() {
        AbstractC1197a abstractC1197a = this.f5468a;
        return abstractC1197a instanceof AbstractC1269z ? ((AbstractC1269z) abstractC1197a).m4027i() : ((AbstractC1265x) ((AbstractC1269z) abstractC1197a).mo4024c(5)).m4014b();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1270z0
    /* JADX INFO: renamed from: e */
    public final void mo3992e(Object obj, C1225j0 c1225j0) {
        this.f5470c.getClass();
        AbstractC30802r.m94771t(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1270z0
    /* JADX INFO: renamed from: f */
    public final void mo3993f(Object obj, C1233m c1233m, C1245q c1245q) {
        this.f5469b.mo3795a(obj);
        this.f5470c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1270z0
    /* JADX INFO: renamed from: g */
    public final int mo3994g(AbstractC1269z abstractC1269z) {
        ((C1217g1) this.f5469b).getClass();
        C1214f1 c1214f1 = abstractC1269z.unknownFields;
        int i13 = c1214f1.f5394d;
        if (i13 != -1) {
            return i13;
        }
        int iM3930q0 = 0;
        for (int i14 = 0; i14 < c1214f1.f5391a; i14++) {
            int i15 = c1214f1.f5392b[i14] >>> 3;
            iM3930q0 += C1236n.m3930q0(3, (C1218h) c1214f1.f5393c[i14]) + C1236n.m3933t0(i15) + C1236n.m3932s0(2) + (C1236n.m3932s0(1) * 2);
        }
        c1214f1.f5394d = iM3930q0;
        return iM3930q0;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1270z0
    /* JADX INFO: renamed from: h */
    public final int mo3995h(AbstractC1269z abstractC1269z) {
        ((C1217g1) this.f5469b).getClass();
        return abstractC1269z.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1270z0
    /* JADX INFO: renamed from: i */
    public final boolean mo3996i(AbstractC1269z abstractC1269z, AbstractC1269z abstractC1269z2) {
        C1217g1 c1217g1 = (C1217g1) this.f5469b;
        c1217g1.getClass();
        C1214f1 c1214f1 = abstractC1269z.unknownFields;
        c1217g1.getClass();
        return c1214f1.equals(abstractC1269z2.unknownFields);
    }
}
