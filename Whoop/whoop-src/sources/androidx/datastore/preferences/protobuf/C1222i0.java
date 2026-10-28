package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1222i0 implements InterfaceC1240o0 {

    /* JADX INFO: renamed from: a */
    public InterfaceC1240o0[] f5402a;

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1240o0
    /* JADX INFO: renamed from: a */
    public final C1268y0 mo3810a(Class cls) {
        for (InterfaceC1240o0 interfaceC1240o0 : this.f5402a) {
            if (interfaceC1240o0.mo3811b(cls)) {
                return interfaceC1240o0.mo3810a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1240o0
    /* JADX INFO: renamed from: b */
    public final boolean mo3811b(Class cls) {
        for (InterfaceC1240o0 interfaceC1240o0 : this.f5402a) {
            if (interfaceC1240o0.mo3811b(cls)) {
                return true;
            }
        }
        return false;
    }
}
