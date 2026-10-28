package androidx.health.platform.client.proto;

import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C1503o extends AbstractC1534u0 {
    public static final int APPLICATION_ID_FIELD_NUMBER = 1;
    private static final C1503o DEFAULT_INSTANCE;
    private static volatile InterfaceC1525s1 PARSER;
    private String applicationId_ = "";
    private int bitField0_;

    static {
        C1503o c1503o = new C1503o();
        DEFAULT_INSTANCE = c1503o;
        AbstractC1534u0.m4869n(C1503o.class, c1503o);
    }

    /* JADX INFO: renamed from: p */
    public static void m4734p(C1503o c1503o, String str) {
        c1503o.getClass();
        c1503o.bitField0_ |= 1;
        c1503o.applicationId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static C1503o m4735r() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static C1498n m4736s() {
        return (C1498n) DEFAULT_INSTANCE.m4870d();
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
                return new C1436a2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "applicationId_"});
            case 3:
                return new C1503o();
            case 4:
                return new C1498n(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1525s1 interfaceC1525s1 = PARSER;
                if (interfaceC1525s1 != null) {
                    return interfaceC1525s1;
                }
                synchronized (C1503o.class) {
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
    public final String m4737q() {
        return this.applicationId_;
    }
}
