package androidx.health.platform.client.proto;

import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.c2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1446c2 extends AbstractC1534u0 {
    public static final int DATA_TYPE_FIELD_NUMBER = 1;
    private static final C1446c2 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 2;
    private static volatile InterfaceC1525s1 PARSER;
    private int bitField0_;
    private C1543w dataType_;
    private String id_ = "";

    static {
        C1446c2 c1446c2 = new C1446c2();
        DEFAULT_INSTANCE = c1446c2;
        AbstractC1534u0.m4869n(C1446c2.class, c1446c2);
    }

    /* JADX INFO: renamed from: p */
    public static void m4580p(C1446c2 c1446c2, C1543w c1543w) {
        c1446c2.getClass();
        c1446c2.dataType_ = c1543w;
        c1446c2.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: q */
    public static void m4581q(C1446c2 c1446c2, String str) {
        c1446c2.getClass();
        str.getClass();
        c1446c2.bitField0_ |= 2;
        c1446c2.id_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static C1441b2 m4582r() {
        return (C1441b2) DEFAULT_INSTANCE.m4870d();
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
                return new C1436a2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "dataType_", "id_"});
            case 3:
                return new C1446c2();
            case 4:
                return new C1441b2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1525s1 interfaceC1525s1 = PARSER;
                if (interfaceC1525s1 != null) {
                    return interfaceC1525s1;
                }
                synchronized (C1446c2.class) {
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
