package androidx.health.platform.client.proto;

import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.p2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1511p2 extends AbstractC1534u0 {
    public static final int CHANGES_FIELD_NUMBER = 1;
    public static final int CHANGES_TOKEN_EXPIRED_FIELD_NUMBER = 4;
    private static final C1511p2 DEFAULT_INSTANCE;
    public static final int HAS_MORE_FIELD_NUMBER = 2;
    public static final int NEXT_CHANGES_TOKEN_FIELD_NUMBER = 3;
    private static volatile InterfaceC1525s1 PARSER;
    private int bitField0_;
    private boolean changesTokenExpired_;
    private boolean hasMore_;
    private InterfaceC1544w0 changes_ = C1558z1.f6168z;
    private String nextChangesToken_ = "";

    static {
        C1511p2 c1511p2 = new C1511p2();
        DEFAULT_INSTANCE = c1511p2;
        AbstractC1534u0.m4869n(C1511p2.class, c1511p2);
    }

    /* JADX INFO: renamed from: t */
    public static C1511p2 m4796t(byte[] bArr) {
        return (C1511p2) AbstractC1534u0.m4868m(DEFAULT_INSTANCE, bArr);
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
                return new C1436a2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဈ\u0001\u0004ဇ\u0002", new Object[]{"bitField0_", "changes_", C1478j.class, "hasMore_", "nextChangesToken_", "changesTokenExpired_"});
            case 3:
                return new C1511p2();
            case 4:
                return new C1473i(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1525s1 interfaceC1525s1 = PARSER;
                if (interfaceC1525s1 != null) {
                    return interfaceC1525s1;
                }
                synchronized (C1511p2.class) {
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
    public final InterfaceC1544w0 m4797p() {
        return this.changes_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m4798q() {
        return this.changesTokenExpired_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m4799r() {
        return this.hasMore_;
    }

    /* JADX INFO: renamed from: s */
    public final String m4800s() {
        return this.nextChangesToken_;
    }
}
