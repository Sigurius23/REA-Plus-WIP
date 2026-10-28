package androidx.health.platform.client.proto;

import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.q2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1516q2 extends AbstractC1534u0 {
    public static final int CHANGES_TOKEN_FIELD_NUMBER = 1;
    private static final C1516q2 DEFAULT_INSTANCE;
    private static volatile InterfaceC1525s1 PARSER;
    private int bitField0_;
    private String changesToken_ = "";

    static {
        C1516q2 c1516q2 = new C1516q2();
        DEFAULT_INSTANCE = c1516q2;
        AbstractC1534u0.m4869n(C1516q2.class, c1516q2);
    }

    /* JADX INFO: renamed from: q */
    public static C1516q2 m4802q(byte[] bArr) {
        return (C1516q2) AbstractC1534u0.m4868m(DEFAULT_INSTANCE, bArr);
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
                return new C1436a2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "changesToken_"});
            case 3:
                return new C1516q2();
            case 4:
                return new C1473i(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1525s1 interfaceC1525s1 = PARSER;
                if (interfaceC1525s1 != null) {
                    return interfaceC1525s1;
                }
                synchronized (C1516q2.class) {
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
    public final String m4803p() {
        return this.changesToken_;
    }
}
