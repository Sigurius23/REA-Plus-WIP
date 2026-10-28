package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1263w implements InterfaceC1240o0 {

    /* JADX INFO: renamed from: b */
    public static final C1263w f5500b = new C1263w(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5501a;

    public /* synthetic */ C1263w(int i13) {
        this.f5501a = i13;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1240o0
    /* JADX INFO: renamed from: a */
    public final C1268y0 mo3810a(Class cls) {
        switch (this.f5501a) {
            case 0:
                if (!AbstractC1269z.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C1268y0) AbstractC1269z.m4020d(cls.asSubclass(AbstractC1269z.class)).mo4024c(3);
                } catch (Exception e5) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e5);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1240o0
    /* JADX INFO: renamed from: b */
    public final boolean mo3811b(Class cls) {
        switch (this.f5501a) {
            case 0:
                return AbstractC1269z.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
