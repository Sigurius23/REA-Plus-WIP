package androidx.health.platform.client.proto;

import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C1552y extends AbstractC1534u0 {
    private static final C1552y DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    public static final int MANUFACTURER_FIELD_NUMBER = 2;
    public static final int MODEL_FIELD_NUMBER = 3;
    private static volatile InterfaceC1525s1 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 4;
    private int bitField0_;
    private String identifier_ = "";
    private String manufacturer_ = "";
    private String model_ = "";
    private String type_ = "";

    static {
        C1552y c1552y = new C1552y();
        DEFAULT_INSTANCE = c1552y;
        AbstractC1534u0.m4869n(C1552y.class, c1552y);
    }

    /* JADX INFO: renamed from: p */
    public static void m4936p(C1552y c1552y, String str) {
        c1552y.getClass();
        str.getClass();
        c1552y.bitField0_ |= 2;
        c1552y.manufacturer_ = str;
    }

    /* JADX INFO: renamed from: q */
    public static void m4937q(C1552y c1552y, String str) {
        c1552y.getClass();
        str.getClass();
        c1552y.bitField0_ |= 4;
        c1552y.model_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m4938r(C1552y c1552y, String str) {
        c1552y.getClass();
        str.getClass();
        c1552y.bitField0_ |= 8;
        c1552y.type_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static C1552y m4939s() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static C1548x m4940y() {
        return (C1548x) DEFAULT_INSTANCE.m4870d();
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
                return new C1436a2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "identifier_", "manufacturer_", "model_", "type_"});
            case 3:
                return new C1552y();
            case 4:
                return new C1548x(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1525s1 interfaceC1525s1 = PARSER;
                if (interfaceC1525s1 != null) {
                    return interfaceC1525s1;
                }
                synchronized (C1552y.class) {
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

    /* JADX INFO: renamed from: t */
    public final String m4941t() {
        return this.manufacturer_;
    }

    /* JADX INFO: renamed from: u */
    public final String m4942u() {
        return this.model_;
    }

    /* JADX INFO: renamed from: v */
    public final String m4943v() {
        return this.type_;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m4944w() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m4945x() {
        return (this.bitField0_ & 4) != 0;
    }
}
