package androidx.health.platform.client.proto;

import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C1493m extends AbstractC1534u0 {
    private static final C1493m DEFAULT_INSTANCE;
    private static volatile InterfaceC1525s1 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private C1480j1 values_ = C1480j1.f6054x;

    static {
        C1493m c1493m = new C1493m();
        DEFAULT_INSTANCE = c1493m;
        AbstractC1534u0.m4869n(C1493m.class, c1493m);
    }

    @Override // androidx.health.platform.client.proto.AbstractC1534u0
    /* JADX INFO: renamed from: e */
    public final Object mo4573e(int i13) {
        InterfaceC1525s1 c1529t0;
        switch (AbstractC12682p.m35485e(i13)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C1436a2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"values_", AbstractC1488l.f6064a});
            case 3:
                return new C1493m();
            case 4:
                return new C1473i(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1525s1 interfaceC1525s1 = PARSER;
                if (interfaceC1525s1 != null) {
                    return interfaceC1525s1;
                }
                synchronized (C1493m.class) {
                    try {
                        c1529t0 = PARSER;
                        if (c1529t0 == null) {
                            c1529t0 = new C1529t0();
                            PARSER = c1529t0;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return c1529t0;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
