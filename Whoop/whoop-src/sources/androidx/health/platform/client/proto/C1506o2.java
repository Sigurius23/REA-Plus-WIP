package androidx.health.platform.client.proto;

import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.o2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1506o2 extends AbstractC1534u0 {
    public static final int DATA_POINT_FIELD_NUMBER = 1;
    private static final C1506o2 DEFAULT_INSTANCE;
    private static volatile InterfaceC1525s1 PARSER;
    private InterfaceC1544w0 dataPoint_ = C1558z1.f6168z;

    static {
        C1506o2 c1506o2 = new C1506o2();
        DEFAULT_INSTANCE = c1506o2;
        AbstractC1534u0.m4869n(C1506o2.class, c1506o2);
    }

    /* JADX INFO: renamed from: p */
    public static void m4785p(C1506o2 c1506o2, Iterable iterable) {
        InterfaceC1544w0 interfaceC1544w0 = c1506o2.dataPoint_;
        if (!((AbstractC1438b) interfaceC1544w0).f6021w) {
            c1506o2.dataPoint_ = AbstractC1534u0.m4867k(interfaceC1544w0);
        }
        AbstractC1433a.m4562a(iterable, c1506o2.dataPoint_);
    }

    /* JADX INFO: renamed from: r */
    public static C1501n2 m4786r() {
        return (C1501n2) DEFAULT_INSTANCE.m4870d();
    }

    /* JADX INFO: renamed from: s */
    public static C1506o2 m4787s(byte[] bArr) {
        return (C1506o2) AbstractC1534u0.m4868m(DEFAULT_INSTANCE, bArr);
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
                return new C1436a2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"dataPoint_", C1533u.class});
            case 3:
                return new C1506o2();
            case 4:
                return new C1501n2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1525s1 interfaceC1525s1 = PARSER;
                if (interfaceC1525s1 != null) {
                    return interfaceC1525s1;
                }
                synchronized (C1506o2.class) {
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

    /* JADX INFO: renamed from: q */
    public final InterfaceC1544w0 m4788q() {
        return this.dataPoint_;
    }
}
