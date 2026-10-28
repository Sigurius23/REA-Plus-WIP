package androidx.health.platform.client.proto;

import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.w1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1545w1 extends AbstractC1534u0 {
    public static final int ACCESS_TYPE_FIELD_NUMBER = 2;
    public static final int DATA_TYPE_FIELD_NUMBER = 1;
    private static final C1545w1 DEFAULT_INSTANCE;
    private static volatile InterfaceC1525s1 PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 3;
    private int accessType_;
    private int bitField0_;
    private C1543w dataType_;
    private String permission_ = "";

    static {
        C1545w1 c1545w1 = new C1545w1();
        DEFAULT_INSTANCE = c1545w1;
        AbstractC1534u0.m4869n(C1545w1.class, c1545w1);
    }

    /* JADX INFO: renamed from: p */
    public static void m4924p(C1545w1 c1545w1, String str) {
        c1545w1.getClass();
        str.getClass();
        c1545w1.bitField0_ |= 4;
        c1545w1.permission_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static C1540v1 m4925r() {
        return (C1540v1) DEFAULT_INSTANCE.m4870d();
    }

    /* JADX INFO: renamed from: s */
    public static C1545w1 m4926s(byte[] bArr) {
        return (C1545w1) AbstractC1534u0.m4868m(DEFAULT_INSTANCE, bArr);
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
                return new C1436a2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "dataType_", "accessType_", C1530t1.f6116a, "permission_"});
            case 3:
                return new C1545w1();
            case 4:
                return new C1540v1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1525s1 interfaceC1525s1 = PARSER;
                if (interfaceC1525s1 != null) {
                    return interfaceC1525s1;
                }
                synchronized (C1545w1.class) {
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
    public final String m4927q() {
        return this.permission_;
    }
}
