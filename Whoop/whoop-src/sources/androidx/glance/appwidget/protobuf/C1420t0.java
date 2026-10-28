package androidx.glance.appwidget.protobuf;

import nh3.AbstractC26725a;
import p000.AbstractC30802r;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.t0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1420t0 implements InterfaceC1372b1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC1367a f5977a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1378d1 f5978b;

    /* JADX INFO: renamed from: c */
    public final C1419t f5979c;

    public C1420t0(AbstractC1378d1 abstractC1378d1, C1419t c1419t, AbstractC1367a abstractC1367a) {
        this.f5978b = abstractC1378d1;
        c1419t.getClass();
        this.f5979c = c1419t;
        this.f5977a = abstractC1367a;
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC1372b1
    /* JADX INFO: renamed from: a */
    public final void mo4287a(Object obj, Object obj2) {
        AbstractC1375c1.m4308k(this.f5978b, obj, obj2);
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC1372b1
    /* JADX INFO: renamed from: b */
    public final void mo4288b(Object obj) {
        ((C1384f1) this.f5978b).getClass();
        C1381e1 c1381e1 = ((AbstractC1368a0) obj).unknownFields;
        if (c1381e1.f5885e) {
            c1381e1.f5885e = false;
        }
        this.f5979c.getClass();
        AbstractC30802r.m94771t(obj);
        throw null;
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC1372b1
    /* JADX INFO: renamed from: c */
    public final boolean mo4289c(Object obj) {
        this.f5979c.getClass();
        AbstractC30802r.m94771t(obj);
        throw null;
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC1372b1
    /* JADX INFO: renamed from: d */
    public final AbstractC1368a0 mo4290d() {
        AbstractC1367a abstractC1367a = this.f5977a;
        return abstractC1367a instanceof AbstractC1368a0 ? ((AbstractC1368a0) abstractC1367a).m4278j() : ((AbstractC1429y) ((AbstractC1368a0) abstractC1367a).mo4275d(5)).m4553b();
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC1372b1
    /* JADX INFO: renamed from: e */
    public final void mo4291e(Object obj, C1403m c1403m, C1417s c1417s) {
        this.f5978b.mo4324a(obj);
        this.f5979c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC1372b1
    /* JADX INFO: renamed from: f */
    public final int mo4292f(AbstractC1368a0 abstractC1368a0) {
        ((C1384f1) this.f5978b).getClass();
        return abstractC1368a0.unknownFields.hashCode();
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC1372b1
    /* JADX INFO: renamed from: g */
    public final void mo4293g(Object obj, byte[] bArr, int i13, int i14, C1376d c1376d) {
        AbstractC1368a0 abstractC1368a0 = (AbstractC1368a0) obj;
        if (abstractC1368a0.unknownFields == C1381e1.f5880f) {
            abstractC1368a0.unknownFields = C1381e1.m4328c();
        }
        throw AbstractC26725a.m79500d(obj);
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC1372b1
    /* JADX INFO: renamed from: h */
    public final int mo4294h(AbstractC1368a0 abstractC1368a0) {
        ((C1384f1) this.f5978b).getClass();
        C1381e1 c1381e1 = abstractC1368a0.unknownFields;
        int i13 = c1381e1.f5884d;
        if (i13 != -1) {
            return i13;
        }
        int iM4499e0 = 0;
        for (int i14 = 0; i14 < c1381e1.f5881a; i14++) {
            int i15 = c1381e1.f5882b[i14] >>> 3;
            iM4499e0 += AbstractC1411p.m4499e0(3, (AbstractC1391i) c1381e1.f5883c[i14]) + AbstractC1411p.m4504j0(i15) + AbstractC1411p.m4503i0(2) + (AbstractC1411p.m4503i0(1) * 2);
        }
        c1381e1.f5884d = iM4499e0;
        return iM4499e0;
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC1372b1
    /* JADX INFO: renamed from: i */
    public final void mo4295i(Object obj, C1404m0 c1404m0) {
        this.f5979c.getClass();
        AbstractC30802r.m94771t(obj);
        throw null;
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC1372b1
    /* JADX INFO: renamed from: j */
    public final boolean mo4296j(AbstractC1368a0 abstractC1368a0, AbstractC1368a0 abstractC1368a1) {
        C1384f1 c1384f1 = (C1384f1) this.f5978b;
        c1384f1.getClass();
        C1381e1 c1381e1 = abstractC1368a0.unknownFields;
        c1384f1.getClass();
        return c1381e1.equals(abstractC1368a1.unknownFields);
    }
}
