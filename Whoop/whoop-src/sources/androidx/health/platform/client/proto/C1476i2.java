package androidx.health.platform.client.proto;

import java.util.ArrayList;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.i2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1476i2 extends AbstractC1534u0 {
    public static final int DATA_ORIGIN_FILTERS_FIELD_NUMBER = 2;
    public static final int DATA_TYPE_FIELD_NUMBER = 1;
    private static final C1476i2 DEFAULT_INSTANCE;
    private static volatile InterfaceC1525s1 PARSER;
    private InterfaceC1544w0 dataOriginFilters_;
    private InterfaceC1544w0 dataType_;

    static {
        C1476i2 c1476i2 = new C1476i2();
        DEFAULT_INSTANCE = c1476i2;
        AbstractC1534u0.m4869n(C1476i2.class, c1476i2);
    }

    public C1476i2() {
        C1558z1 c1558z1 = C1558z1.f6168z;
        this.dataType_ = c1558z1;
        this.dataOriginFilters_ = c1558z1;
    }

    /* JADX INFO: renamed from: p */
    public static void m4635p(C1476i2 c1476i2, ArrayList arrayList) {
        InterfaceC1544w0 interfaceC1544w0 = c1476i2.dataType_;
        if (!((AbstractC1438b) interfaceC1544w0).f6021w) {
            c1476i2.dataType_ = AbstractC1534u0.m4867k(interfaceC1544w0);
        }
        AbstractC1433a.m4562a(arrayList, c1476i2.dataType_);
    }

    /* JADX INFO: renamed from: q */
    public static void m4636q(C1476i2 c1476i2, ArrayList arrayList) {
        InterfaceC1544w0 interfaceC1544w0 = c1476i2.dataOriginFilters_;
        if (!((AbstractC1438b) interfaceC1544w0).f6021w) {
            c1476i2.dataOriginFilters_ = AbstractC1534u0.m4867k(interfaceC1544w0);
        }
        AbstractC1433a.m4562a(arrayList, c1476i2.dataOriginFilters_);
    }

    /* JADX INFO: renamed from: r */
    public static C1471h2 m4637r() {
        return (C1471h2) DEFAULT_INSTANCE.m4870d();
    }

    /* JADX INFO: renamed from: s */
    public static C1476i2 m4638s(byte[] bArr) {
        return (C1476i2) AbstractC1534u0.m4868m(DEFAULT_INSTANCE, bArr);
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
                return new C1436a2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"dataType_", C1543w.class, "dataOriginFilters_", C1503o.class});
            case 3:
                return new C1476i2();
            case 4:
                return new C1471h2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1525s1 interfaceC1525s1 = PARSER;
                if (interfaceC1525s1 != null) {
                    return interfaceC1525s1;
                }
                synchronized (C1476i2.class) {
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
