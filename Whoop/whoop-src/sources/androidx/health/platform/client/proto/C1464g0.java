package androidx.health.platform.client.proto;

import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.g0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1464g0 extends AbstractC1534u0 {
    public static final int BOOLEAN_VAL_FIELD_NUMBER = 5;
    private static final C1464g0 DEFAULT_INSTANCE;
    public static final int DOUBLE_VAL_FIELD_NUMBER = 2;
    public static final int ENUM_VAL_FIELD_NUMBER = 4;
    public static final int LONG_VAL_FIELD_NUMBER = 1;
    private static volatile InterfaceC1525s1 PARSER = null;
    public static final int STRING_VAL_FIELD_NUMBER = 3;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        C1464g0 c1464g0 = new C1464g0();
        DEFAULT_INSTANCE = c1464g0;
        AbstractC1534u0.m4869n(C1464g0.class, c1464g0);
    }

    /* JADX INFO: renamed from: A */
    public static C1459f0 m4612A() {
        return (C1459f0) DEFAULT_INSTANCE.m4870d();
    }

    /* JADX INFO: renamed from: p */
    public static void m4613p(C1464g0 c1464g0, String str) {
        c1464g0.getClass();
        c1464g0.valueCase_ = 3;
        c1464g0.value_ = str;
    }

    /* JADX INFO: renamed from: q */
    public static void m4614q(C1464g0 c1464g0, String str) {
        c1464g0.getClass();
        c1464g0.valueCase_ = 4;
        c1464g0.value_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m4615r(C1464g0 c1464g0, boolean z4) {
        c1464g0.valueCase_ = 5;
        c1464g0.value_ = Boolean.valueOf(z4);
    }

    /* JADX INFO: renamed from: s */
    public static void m4616s(C1464g0 c1464g0, long j7) {
        c1464g0.valueCase_ = 1;
        c1464g0.value_ = Long.valueOf(j7);
    }

    /* JADX INFO: renamed from: t */
    public static void m4617t(C1464g0 c1464g0, double d3) {
        c1464g0.valueCase_ = 2;
        c1464g0.value_ = Double.valueOf(d3);
    }

    /* JADX INFO: renamed from: v */
    public static C1464g0 m4618v() {
        return DEFAULT_INSTANCE;
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
                return new C1436a2(DEFAULT_INSTANCE, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဵ\u0000\u0002ဳ\u0000\u0003ျ\u0000\u0004ျ\u0000\u0005်\u0000", new Object[]{"value_", "valueCase_", "bitField0_"});
            case 3:
                return new C1464g0();
            case 4:
                return new C1459f0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1525s1 interfaceC1525s1 = PARSER;
                if (interfaceC1525s1 != null) {
                    return interfaceC1525s1;
                }
                synchronized (C1464g0.class) {
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

    /* JADX INFO: renamed from: u */
    public final boolean m4619u() {
        if (this.valueCase_ == 5) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final double m4620w() {
        if (this.valueCase_ == 2) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: x */
    public final String m4621x() {
        return this.valueCase_ == 4 ? (String) this.value_ : "";
    }

    /* JADX INFO: renamed from: y */
    public final long m4622y() {
        if (this.valueCase_ == 1) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: z */
    public final String m4623z() {
        return this.valueCase_ == 3 ? (String) this.value_ : "";
    }
}
