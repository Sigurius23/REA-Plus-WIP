package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C1427x implements InterfaceC1414q0 {

    /* JADX INFO: renamed from: b */
    public static final C1427x f5989b = new C1427x(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5990a;

    public /* synthetic */ C1427x(int i13) {
        this.f5990a = i13;
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC1414q0
    /* JADX INFO: renamed from: a */
    public final C1369a1 mo4434a(Class cls) {
        switch (this.f5990a) {
            case 0:
                if (!AbstractC1368a0.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C1369a1) AbstractC1368a0.m4270e(cls.asSubclass(AbstractC1368a0.class)).mo4275d(3);
                } catch (Exception e5) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e5);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.glance.appwidget.protobuf.InterfaceC1414q0
    /* JADX INFO: renamed from: b */
    public final boolean mo4435b(Class cls) {
        switch (this.f5990a) {
            case 0:
                return AbstractC1368a0.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
