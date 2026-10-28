package androidx.health.platform.client.proto;

import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.j0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1479j0 extends AbstractC1534u0 {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final C1479j0 DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile InterfaceC1525s1 PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 3;
    private int bitField0_;
    private int code_;
    private String message_ = "";
    private InterfaceC1544w0 permission_ = C1558z1.f6168z;

    static {
        C1479j0 c1479j0 = new C1479j0();
        DEFAULT_INSTANCE = c1479j0;
        AbstractC1534u0.m4869n(C1479j0.class, c1479j0);
    }

    /* JADX INFO: renamed from: p */
    public static void m4643p(C1479j0 c1479j0, int i13) {
        c1479j0.bitField0_ |= 1;
        c1479j0.code_ = i13;
    }

    /* JADX INFO: renamed from: q */
    public static void m4644q(C1479j0 c1479j0, String str) {
        c1479j0.getClass();
        str.getClass();
        c1479j0.bitField0_ |= 2;
        c1479j0.message_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static C1474i0 m4645u() {
        return (C1474i0) DEFAULT_INSTANCE.m4870d();
    }

    /* JADX INFO: renamed from: v */
    public static C1479j0 m4646v(byte[] bArr) {
        return (C1479j0) AbstractC1534u0.m4868m(DEFAULT_INSTANCE, bArr);
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
                return new C1436a2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"bitField0_", "code_", "message_", "permission_", C1545w1.class});
            case 3:
                return new C1479j0();
            case 4:
                return new C1474i0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1525s1 interfaceC1525s1 = PARSER;
                if (interfaceC1525s1 != null) {
                    return interfaceC1525s1;
                }
                synchronized (C1479j0.class) {
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

    /* JADX INFO: renamed from: r */
    public final int m4647r() {
        return this.code_;
    }

    /* JADX INFO: renamed from: s */
    public final String m4648s() {
        return this.message_;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m4649t() {
        return (this.bitField0_ & 2) != 0;
    }
}
