package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C5178u implements InterfaceC5165o0 {

    /* JADX INFO: renamed from: b */
    public static final C5178u f21589b = new C5178u(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21590a;

    public /* synthetic */ C5178u(int i13) {
        this.f21590a = i13;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5165o0
    /* JADX INFO: renamed from: a */
    public final C5189z0 mo16184a(Class cls) {
        switch (this.f21590a) {
            case 0:
                if (!AbstractC5184x.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C5189z0) AbstractC5184x.m16353k(cls.asSubclass(AbstractC5184x.class)).mo16361j(3);
                } catch (Exception e5) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e5);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5165o0
    /* JADX INFO: renamed from: b */
    public final boolean mo16185b(Class cls) {
        switch (this.f21590a) {
            case 0:
                return AbstractC5184x.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
