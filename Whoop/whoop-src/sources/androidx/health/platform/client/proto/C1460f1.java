package androidx.health.platform.client.proto;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.f1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1460f1 implements InterfaceC1495m1 {

    /* JADX INFO: renamed from: a */
    public InterfaceC1495m1[] f6038a;

    @Override // androidx.health.platform.client.proto.InterfaceC1495m1
    /* JADX INFO: renamed from: a */
    public final C1436a2 mo4607a(Class cls) {
        for (InterfaceC1495m1 interfaceC1495m1 : this.f6038a) {
            if (interfaceC1495m1.mo4608b(cls)) {
                return interfaceC1495m1.mo4607a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.health.platform.client.proto.InterfaceC1495m1
    /* JADX INFO: renamed from: b */
    public final boolean mo4608b(Class cls) {
        for (InterfaceC1495m1 interfaceC1495m1 : this.f6038a) {
            if (interfaceC1495m1.mo4608b(cls)) {
                return true;
            }
        }
        return false;
    }
}
