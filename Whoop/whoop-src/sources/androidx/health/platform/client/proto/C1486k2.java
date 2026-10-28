package androidx.health.platform.client.proto;

import java.util.ArrayList;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.k2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1486k2 extends AbstractC1534u0 {
    public static final int ASC_ORDERING_FIELD_NUMBER = 7;
    public static final int DATA_ORIGIN_FILTERS_FIELD_NUMBER = 3;
    public static final int DATA_TYPE_FIELD_NUMBER = 2;
    private static final C1486k2 DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 4;
    public static final int PAGE_SIZE_FIELD_NUMBER = 5;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 6;
    private static volatile InterfaceC1525s1 PARSER = null;
    public static final int TIME_SPEC_FIELD_NUMBER = 1;
    private int bitField0_;
    private C1543w dataType_;
    private int limit_;
    private int pageSize_;
    private C1447c3 timeSpec_;
    private InterfaceC1544w0 dataOriginFilters_ = C1558z1.f6168z;
    private boolean ascOrdering_ = true;
    private String pageToken_ = "";

    static {
        C1486k2 c1486k2 = new C1486k2();
        DEFAULT_INSTANCE = c1486k2;
        AbstractC1534u0.m4869n(C1486k2.class, c1486k2);
    }

    /* JADX INFO: renamed from: p */
    public static void m4679p(C1486k2 c1486k2, C1447c3 c1447c3) {
        c1486k2.getClass();
        c1486k2.timeSpec_ = c1447c3;
        c1486k2.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: q */
    public static void m4680q(C1486k2 c1486k2, C1543w c1543w) {
        c1486k2.getClass();
        c1486k2.dataType_ = c1543w;
        c1486k2.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: r */
    public static void m4681r(C1486k2 c1486k2, ArrayList arrayList) {
        InterfaceC1544w0 interfaceC1544w0 = c1486k2.dataOriginFilters_;
        if (!((AbstractC1438b) interfaceC1544w0).f6021w) {
            c1486k2.dataOriginFilters_ = AbstractC1534u0.m4867k(interfaceC1544w0);
        }
        AbstractC1433a.m4562a(arrayList, c1486k2.dataOriginFilters_);
    }

    /* JADX INFO: renamed from: s */
    public static void m4682s(C1486k2 c1486k2) {
        c1486k2.bitField0_ |= 4;
        c1486k2.ascOrdering_ = true;
    }

    /* JADX INFO: renamed from: t */
    public static void m4683t(C1486k2 c1486k2) {
        c1486k2.bitField0_ |= 16;
        c1486k2.pageSize_ = 1000;
    }

    /* JADX INFO: renamed from: u */
    public static C1481j2 m4684u() {
        return (C1481j2) DEFAULT_INSTANCE.m4870d();
    }

    /* JADX INFO: renamed from: v */
    public static C1486k2 m4685v(byte[] bArr) {
        return (C1486k2) AbstractC1534u0.m4868m(DEFAULT_INSTANCE, bArr);
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
                return new C1436a2(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004င\u0003\u0005င\u0004\u0006ဈ\u0005\u0007ဇ\u0002", new Object[]{"bitField0_", "timeSpec_", "dataType_", "dataOriginFilters_", C1503o.class, "limit_", "pageSize_", "pageToken_", "ascOrdering_"});
            case 3:
                return new C1486k2();
            case 4:
                return new C1481j2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1525s1 interfaceC1525s1 = PARSER;
                if (interfaceC1525s1 != null) {
                    return interfaceC1525s1;
                }
                synchronized (C1486k2.class) {
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
