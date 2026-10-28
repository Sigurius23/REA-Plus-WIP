package androidx.health.platform.client.proto;

import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.t2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1531t2 extends AbstractC1534u0 {
    public static final int DATA_POINT_FIELD_NUMBER = 1;
    private static final C1531t2 DEFAULT_INSTANCE;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 2;
    private static volatile InterfaceC1525s1 PARSER;
    private int bitField0_;
    private InterfaceC1544w0 dataPoint_ = C1558z1.f6168z;
    private String pageToken_ = "";

    static {
        C1531t2 c1531t2 = new C1531t2();
        DEFAULT_INSTANCE = c1531t2;
        AbstractC1534u0.m4869n(C1531t2.class, c1531t2);
    }

    /* JADX INFO: renamed from: q */
    public static C1531t2 m4820q(byte[] bArr) {
        return (C1531t2) AbstractC1534u0.m4868m(DEFAULT_INSTANCE, bArr);
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
                return new C1436a2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"bitField0_", "dataPoint_", C1533u.class, "pageToken_"});
            case 3:
                return new C1531t2();
            case 4:
                return new C1473i(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1525s1 interfaceC1525s1 = PARSER;
                if (interfaceC1525s1 != null) {
                    return interfaceC1525s1;
                }
                synchronized (C1531t2.class) {
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

    /* JADX INFO: renamed from: p */
    public final InterfaceC1544w0 m4821p() {
        return this.dataPoint_;
    }
}
