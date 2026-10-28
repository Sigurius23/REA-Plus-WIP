package androidx.health.platform.client.proto;

import nh3.AbstractC26725a;
import p000.AbstractC30802r;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.p1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1510p1 implements InterfaceC1536u2 {

    /* JADX INFO: renamed from: a */
    public final AbstractC1433a f6104a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1452d3 f6105b;

    /* JADX INFO: renamed from: c */
    public final C1494m0 f6106c;

    public C1510p1(AbstractC1452d3 abstractC1452d3, C1494m0 c1494m0, AbstractC1433a abstractC1433a) {
        this.f6105b = abstractC1452d3;
        c1494m0.getClass();
        this.f6106c = c1494m0;
        this.f6104a = abstractC1433a;
    }

    @Override // androidx.health.platform.client.proto.InterfaceC1536u2
    /* JADX INFO: renamed from: a */
    public final void mo4764a(Object obj, Object obj2) {
        AbstractC1541v2.m4915w(this.f6105b, obj, obj2);
    }

    @Override // androidx.health.platform.client.proto.InterfaceC1536u2
    /* JADX INFO: renamed from: b */
    public final void mo4765b(Object obj) {
        ((C1462f3) this.f6105b).getClass();
        ((AbstractC1534u0) obj).unknownFields.f6036e = false;
        this.f6106c.getClass();
        AbstractC30802r.m94771t(obj);
        throw null;
    }

    @Override // androidx.health.platform.client.proto.InterfaceC1536u2
    /* JADX INFO: renamed from: c */
    public final boolean mo4766c(Object obj) {
        this.f6106c.getClass();
        AbstractC30802r.m94771t(obj);
        throw null;
    }

    @Override // androidx.health.platform.client.proto.InterfaceC1536u2
    /* JADX INFO: renamed from: d */
    public final AbstractC1534u0 mo4767d() {
        AbstractC1433a abstractC1433a = this.f6104a;
        return abstractC1433a instanceof AbstractC1534u0 ? ((AbstractC1534u0) abstractC1433a).m4873l() : ((AbstractC1524s0) ((AbstractC1534u0) abstractC1433a).mo4573e(5)).m4814b();
    }

    @Override // androidx.health.platform.client.proto.InterfaceC1536u2
    /* JADX INFO: renamed from: e */
    public final void mo4768e(Object obj, byte[] bArr, int i13, int i14, C1448d c1448d) {
        AbstractC1534u0 abstractC1534u0 = (AbstractC1534u0) obj;
        if (abstractC1534u0.unknownFields == C1457e3.f6031f) {
            abstractC1534u0.unknownFields = C1457e3.m4602c();
        }
        throw AbstractC26725a.m79500d(obj);
    }

    @Override // androidx.health.platform.client.proto.InterfaceC1536u2
    /* JADX INFO: renamed from: f */
    public final int mo4769f(AbstractC1534u0 abstractC1534u0) {
        ((C1462f3) this.f6105b).getClass();
        return abstractC1534u0.unknownFields.hashCode();
    }

    @Override // androidx.health.platform.client.proto.InterfaceC1536u2
    /* JADX INFO: renamed from: g */
    public final boolean mo4770g(AbstractC1534u0 abstractC1534u0, AbstractC1534u0 abstractC1534u1) {
        C1462f3 c1462f3 = (C1462f3) this.f6105b;
        c1462f3.getClass();
        C1457e3 c1457e3 = abstractC1534u0.unknownFields;
        c1462f3.getClass();
        return c1457e3.equals(abstractC1534u1.unknownFields);
    }

    @Override // androidx.health.platform.client.proto.InterfaceC1536u2
    /* JADX INFO: renamed from: h */
    public final void mo4771h(Object obj, C1465g1 c1465g1) {
        this.f6106c.getClass();
        AbstractC30802r.m94771t(obj);
        throw null;
    }

    @Override // androidx.health.platform.client.proto.InterfaceC1536u2
    /* JADX INFO: renamed from: i */
    public final int mo4772i(AbstractC1534u0 abstractC1534u0) {
        ((C1462f3) this.f6105b).getClass();
        C1457e3 c1457e3 = abstractC1534u0.unknownFields;
        int i13 = c1457e3.f6035d;
        if (i13 != -1) {
            return i13;
        }
        int iM4659v = 0;
        for (int i14 = 0; i14 < c1457e3.f6032a; i14++) {
            int i15 = c1457e3.f6033b[i14] >>> 3;
            iM4659v += C1483k.m4659v(3, (C1468h) c1457e3.f6034c[i14]) + C1483k.m4657D(i15) + C1483k.m4656C(2) + (C1483k.m4656C(1) * 2);
        }
        c1457e3.f6035d = iM4659v;
        return iM4659v;
    }
}
