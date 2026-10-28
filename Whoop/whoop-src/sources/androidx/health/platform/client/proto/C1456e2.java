package androidx.health.platform.client.proto;

import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.e2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1456e2 extends AbstractC1534u0 {
    public static final int CLIENT_IDS_FIELD_NUMBER = 2;
    private static final C1456e2 DEFAULT_INSTANCE;
    private static volatile InterfaceC1525s1 PARSER = null;
    public static final int UIDS_FIELD_NUMBER = 1;
    private InterfaceC1544w0 clientIds_;
    private InterfaceC1544w0 uids_;

    static {
        C1456e2 c1456e2 = new C1456e2();
        DEFAULT_INSTANCE = c1456e2;
        AbstractC1534u0.m4869n(C1456e2.class, c1456e2);
    }

    public C1456e2() {
        C1558z1 c1558z1 = C1558z1.f6168z;
        this.uids_ = c1558z1;
        this.clientIds_ = c1558z1;
    }

    /* JADX INFO: renamed from: p */
    public static void m4596p(C1456e2 c1456e2, Iterable iterable) {
        InterfaceC1544w0 interfaceC1544w0 = c1456e2.uids_;
        if (!((AbstractC1438b) interfaceC1544w0).f6021w) {
            c1456e2.uids_ = AbstractC1534u0.m4867k(interfaceC1544w0);
        }
        AbstractC1433a.m4562a(iterable, c1456e2.uids_);
    }

    /* JADX INFO: renamed from: q */
    public static void m4597q(C1456e2 c1456e2, Iterable iterable) {
        InterfaceC1544w0 interfaceC1544w0 = c1456e2.clientIds_;
        if (!((AbstractC1438b) interfaceC1544w0).f6021w) {
            c1456e2.clientIds_ = AbstractC1534u0.m4867k(interfaceC1544w0);
        }
        AbstractC1433a.m4562a(iterable, c1456e2.clientIds_);
    }

    /* JADX INFO: renamed from: t */
    public static C1451d2 m4598t() {
        return (C1451d2) DEFAULT_INSTANCE.m4870d();
    }

    /* JADX INFO: renamed from: u */
    public static C1456e2 m4599u(byte[] bArr) {
        return (C1456e2) AbstractC1534u0.m4868m(DEFAULT_INSTANCE, bArr);
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
                return new C1436a2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"uids_", C1446c2.class, "clientIds_", C1446c2.class});
            case 3:
                return new C1456e2();
            case 4:
                return new C1451d2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1525s1 interfaceC1525s1 = PARSER;
                if (interfaceC1525s1 != null) {
                    return interfaceC1525s1;
                }
                synchronized (C1456e2.class) {
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
    public final InterfaceC1544w0 m4600r() {
        return this.clientIds_;
    }

    /* JADX INFO: renamed from: s */
    public final InterfaceC1544w0 m4601s() {
        return this.uids_;
    }
}
