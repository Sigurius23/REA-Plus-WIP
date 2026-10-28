package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.l0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1401l0 implements InterfaceC1414q0 {

    /* JADX INFO: renamed from: a */
    public InterfaceC1414q0[] f5935a;

    @Override // androidx.glance.appwidget.protobuf.InterfaceC1414q0
    /* JADX INFO: renamed from: a */
    public final C1369a1 mo4434a(Class cls) {
        for (InterfaceC1414q0 interfaceC1414q0 : this.f5935a) {
            if (interfaceC1414q0.mo4435b(cls)) {
                return interfaceC1414q0.mo4434a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC1414q0
    /* JADX INFO: renamed from: b */
    public final boolean mo4435b(Class cls) {
        for (InterfaceC1414q0 interfaceC1414q0 : this.f5935a) {
            if (interfaceC1414q0.mo4435b(cls)) {
                return true;
            }
        }
        return false;
    }
}
