package androidx.health.platform.client.proto;

import java.util.ArrayList;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C1518r extends AbstractC1534u0 {
    private static final C1518r DEFAULT_INSTANCE;
    private static volatile InterfaceC1525s1 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private InterfaceC1544w0 values_ = C1558z1.f6168z;

    static {
        C1518r c1518r = new C1518r();
        DEFAULT_INSTANCE = c1518r;
        AbstractC1534u0.m4869n(C1518r.class, c1518r);
    }

    /* JADX INFO: renamed from: p */
    public static void m4808p(C1518r c1518r, ArrayList arrayList) {
        InterfaceC1544w0 interfaceC1544w0 = c1518r.values_;
        if (!((AbstractC1438b) interfaceC1544w0).f6021w) {
            c1518r.values_ = AbstractC1534u0.m4867k(interfaceC1544w0);
        }
        AbstractC1433a.m4562a(arrayList, c1518r.values_);
    }

    /* JADX INFO: renamed from: q */
    public static C1518r m4809q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static C1513q m4810s() {
        return (C1513q) DEFAULT_INSTANCE.m4870d();
    }

    /* JADX INFO: renamed from: t */
    public static C1518r m4811t(byte[] bArr) {
        return (C1518r) AbstractC1534u0.m4868m(DEFAULT_INSTANCE, bArr);
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
                return new C1436a2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", C1454e0.class});
            case 3:
                return new C1518r();
            case 4:
                return new C1513q(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1525s1 interfaceC1525s1 = PARSER;
                if (interfaceC1525s1 != null) {
                    return interfaceC1525s1;
                }
                synchronized (C1518r.class) {
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
    public final InterfaceC1544w0 m4812r() {
        return this.values_;
    }
}
