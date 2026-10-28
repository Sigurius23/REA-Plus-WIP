package androidx.health.platform.client.proto;

import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C1543w extends AbstractC1534u0 {
    private static final C1543w DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC1525s1 PARSER;
    private int bitField0_;
    private String name_ = "";

    static {
        C1543w c1543w = new C1543w();
        DEFAULT_INSTANCE = c1543w;
        AbstractC1534u0.m4869n(C1543w.class, c1543w);
    }

    /* JADX INFO: renamed from: p */
    public static void m4919p(C1543w c1543w, String str) {
        c1543w.getClass();
        c1543w.bitField0_ |= 1;
        c1543w.name_ = str;
    }

    /* JADX INFO: renamed from: q */
    public static C1543w m4920q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static C1538v m4921s() {
        return (C1538v) DEFAULT_INSTANCE.m4870d();
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
                return new C1436a2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "name_"});
            case 3:
                return new C1543w();
            case 4:
                return new C1538v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1525s1 interfaceC1525s1 = PARSER;
                if (interfaceC1525s1 != null) {
                    return interfaceC1525s1;
                }
                synchronized (C1543w.class) {
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
    public final String m4922r() {
        return this.name_;
    }
}
