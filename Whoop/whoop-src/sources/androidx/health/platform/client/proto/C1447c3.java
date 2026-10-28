package androidx.health.platform.client.proto;

import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.c3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1447c3 extends AbstractC1534u0 {
    private static final C1447c3 DEFAULT_INSTANCE;
    public static final int END_LOCAL_DATE_TIME_FIELD_NUMBER = 4;
    public static final int END_TIME_EPOCH_MS_FIELD_NUMBER = 2;
    private static volatile InterfaceC1525s1 PARSER = null;
    public static final int START_LOCAL_DATE_TIME_FIELD_NUMBER = 3;
    public static final int START_TIME_EPOCH_MS_FIELD_NUMBER = 1;
    private int bitField0_;
    private long endTimeEpochMs_;
    private long startTimeEpochMs_;
    private String startLocalDateTime_ = "";
    private String endLocalDateTime_ = "";

    static {
        C1447c3 c1447c3 = new C1447c3();
        DEFAULT_INSTANCE = c1447c3;
        AbstractC1534u0.m4869n(C1447c3.class, c1447c3);
    }

    /* JADX INFO: renamed from: p */
    public static void m4583p(C1447c3 c1447c3, long j7) {
        c1447c3.bitField0_ |= 1;
        c1447c3.startTimeEpochMs_ = j7;
    }

    /* JADX INFO: renamed from: q */
    public static void m4584q(C1447c3 c1447c3, long j7) {
        c1447c3.bitField0_ |= 2;
        c1447c3.endTimeEpochMs_ = j7;
    }

    /* JADX INFO: renamed from: r */
    public static C1442b3 m4585r() {
        return (C1442b3) DEFAULT_INSTANCE.m4870d();
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
                return new C1436a2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "startTimeEpochMs_", "endTimeEpochMs_", "startLocalDateTime_", "endLocalDateTime_"});
            case 3:
                return new C1447c3();
            case 4:
                return new C1442b3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1525s1 interfaceC1525s1 = PARSER;
                if (interfaceC1525s1 != null) {
                    return interfaceC1525s1;
                }
                synchronized (C1447c3.class) {
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
