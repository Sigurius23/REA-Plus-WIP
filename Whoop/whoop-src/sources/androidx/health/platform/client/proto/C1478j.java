package androidx.health.platform.client.proto;

import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C1478j extends AbstractC1534u0 {
    private static final C1478j DEFAULT_INSTANCE;
    public static final int DELETE_UID_FIELD_NUMBER = 2;
    private static volatile InterfaceC1525s1 PARSER = null;
    public static final int UPSERT_DATA_POINT_FIELD_NUMBER = 1;
    private int bitField0_;
    private int changeCase_ = 0;
    private Object change_;

    static {
        C1478j c1478j = new C1478j();
        DEFAULT_INSTANCE = c1478j;
        AbstractC1534u0.m4869n(C1478j.class, c1478j);
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
                return new C1436a2(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ျ\u0000", new Object[]{"change_", "changeCase_", "bitField0_", C1533u.class});
            case 3:
                return new C1478j();
            case 4:
                return new C1473i(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1525s1 interfaceC1525s1 = PARSER;
                if (interfaceC1525s1 != null) {
                    return interfaceC1525s1;
                }
                synchronized (C1478j.class) {
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
    public final String m4639p() {
        return this.changeCase_ == 2 ? (String) this.change_ : "";
    }

    /* JADX INFO: renamed from: q */
    public final C1533u m4640q() {
        return this.changeCase_ == 1 ? (C1533u) this.change_ : C1533u.m4828K();
    }

    /* JADX INFO: renamed from: r */
    public final boolean m4641r() {
        return this.changeCase_ == 2;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m4642s() {
        return this.changeCase_ == 1;
    }
}
