package androidx.health.platform.client.proto;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.r0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1519r0 implements InterfaceC1495m1 {

    /* JADX INFO: renamed from: b */
    public static final C1519r0 f6108b = new C1519r0(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6109a;

    public /* synthetic */ C1519r0(int i13) {
        this.f6109a = i13;
    }

    @Override // androidx.health.platform.client.proto.InterfaceC1495m1
    /* JADX INFO: renamed from: a */
    public final C1436a2 mo4607a(Class cls) {
        switch (this.f6109a) {
            case 0:
                if (!AbstractC1534u0.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C1436a2) AbstractC1534u0.m4864f(cls.asSubclass(AbstractC1534u0.class)).mo4573e(3);
                } catch (Exception e5) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e5);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.health.platform.client.proto.InterfaceC1495m1
    /* JADX INFO: renamed from: b */
    public final boolean mo4608b(Class cls) {
        switch (this.f6109a) {
            case 0:
                return AbstractC1534u0.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
