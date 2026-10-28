package androidx.health.platform.client.proto;

import java.util.Collections;
import java.util.Map;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1454e0 extends AbstractC1534u0 {
    private static final C1454e0 DEFAULT_INSTANCE;
    public static final int END_TIME_MILLIS_FIELD_NUMBER = 3;
    private static volatile InterfaceC1525s1 PARSER = null;
    public static final int START_TIME_MILLIS_FIELD_NUMBER = 2;
    public static final int VALUES_FIELD_NUMBER = 1;
    private int bitField0_;
    private long endTimeMillis_;
    private long startTimeMillis_;
    private C1480j1 values_ = C1480j1.f6054x;

    static {
        C1454e0 c1454e0 = new C1454e0();
        DEFAULT_INSTANCE = c1454e0;
        AbstractC1534u0.m4869n(C1454e0.class, c1454e0);
    }

    /* JADX INFO: renamed from: p */
    public static C1480j1 m4587p(C1454e0 c1454e0) {
        C1480j1 c1480j1 = c1454e0.values_;
        if (!c1480j1.f6055w) {
            c1454e0.values_ = c1480j1.m4652c();
        }
        return c1454e0.values_;
    }

    /* JADX INFO: renamed from: q */
    public static void m4588q(C1454e0 c1454e0, long j7) {
        c1454e0.bitField0_ |= 1;
        c1454e0.startTimeMillis_ = j7;
    }

    /* JADX INFO: renamed from: r */
    public static void m4589r(C1454e0 c1454e0, long j7) {
        c1454e0.bitField0_ |= 2;
        c1454e0.endTimeMillis_ = j7;
    }

    /* JADX INFO: renamed from: v */
    public static C1444c0 m4590v() {
        return (C1444c0) DEFAULT_INSTANCE.m4870d();
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
                return new C1436a2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u00012\u0002ဂ\u0000\u0003ဂ\u0001", new Object[]{"bitField0_", "values_", AbstractC1449d0.f6028a, "startTimeMillis_", "endTimeMillis_"});
            case 3:
                return new C1454e0();
            case 4:
                return new C1444c0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1525s1 interfaceC1525s1 = PARSER;
                if (interfaceC1525s1 != null) {
                    return interfaceC1525s1;
                }
                synchronized (C1454e0.class) {
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

    /* JADX INFO: renamed from: s */
    public final long m4591s() {
        return this.endTimeMillis_;
    }

    /* JADX INFO: renamed from: t */
    public final long m4592t() {
        return this.startTimeMillis_;
    }

    /* JADX INFO: renamed from: u */
    public final Map m4593u() {
        return Collections.unmodifiableMap(this.values_);
    }
}
