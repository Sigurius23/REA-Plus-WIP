package androidx.health.platform.client.proto;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.c1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1445c1 extends AbstractC1450d1 {
    @Override // androidx.health.platform.client.proto.AbstractC1450d1
    /* JADX INFO: renamed from: a */
    public final void mo4576a(long j7, Object obj) {
        ((AbstractC1438b) ((InterfaceC1544w0) AbstractC1502n3.f6075c.m4711i(j7, obj))).f6021w = false;
    }

    @Override // androidx.health.platform.client.proto.AbstractC1450d1
    /* JADX INFO: renamed from: b */
    public final void mo4577b(long j7, Object obj, Object obj2) {
        AbstractC1497m3 abstractC1497m3 = AbstractC1502n3.f6075c;
        InterfaceC1544w0 interfaceC1544w0Mo4923i = (InterfaceC1544w0) abstractC1497m3.m4711i(j7, obj);
        InterfaceC1544w0 interfaceC1544w0 = (InterfaceC1544w0) abstractC1497m3.m4711i(j7, obj2);
        int size = interfaceC1544w0Mo4923i.size();
        int size2 = interfaceC1544w0.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC1438b) interfaceC1544w0Mo4923i).f6021w) {
                interfaceC1544w0Mo4923i = interfaceC1544w0Mo4923i.mo4923i(size2 + size);
            }
            interfaceC1544w0Mo4923i.addAll(interfaceC1544w0);
        }
        if (size > 0) {
            interfaceC1544w0 = interfaceC1544w0Mo4923i;
        }
        AbstractC1502n3.m4733o(j7, obj, interfaceC1544w0);
    }
}
