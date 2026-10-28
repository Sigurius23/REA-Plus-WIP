package androidx.health.platform.client.proto;

import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.m2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1496m2 extends AbstractC1534u0 {
    public static final int CALLING_PACKAGE_FIELD_NUMBER = 1;
    private static final C1496m2 DEFAULT_INSTANCE;
    public static final int IS_IN_FOREGROUND_FIELD_NUMBER = 4;
    private static volatile InterfaceC1525s1 PARSER = null;
    public static final int PERMISSION_TOKEN_FIELD_NUMBER = 3;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isInForeground_;
    private int sdkVersion_;
    private String callingPackage_ = "";
    private String permissionToken_ = "";

    static {
        C1496m2 c1496m2 = new C1496m2();
        DEFAULT_INSTANCE = c1496m2;
        AbstractC1534u0.m4869n(C1496m2.class, c1496m2);
    }

    /* JADX INFO: renamed from: p */
    public static void m4697p(C1496m2 c1496m2, String str) {
        c1496m2.getClass();
        str.getClass();
        c1496m2.bitField0_ |= 1;
        c1496m2.callingPackage_ = str;
    }

    /* JADX INFO: renamed from: q */
    public static void m4698q(C1496m2 c1496m2, int i13) {
        c1496m2.bitField0_ |= 2;
        c1496m2.sdkVersion_ = i13;
    }

    /* JADX INFO: renamed from: r */
    public static void m4699r(C1496m2 c1496m2, String str) {
        c1496m2.getClass();
        str.getClass();
        c1496m2.bitField0_ |= 4;
        c1496m2.permissionToken_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m4700s(C1496m2 c1496m2, boolean z4) {
        c1496m2.bitField0_ |= 8;
        c1496m2.isInForeground_ = z4;
    }

    /* JADX INFO: renamed from: x */
    public static C1491l2 m4701x() {
        return (C1491l2) DEFAULT_INSTANCE.m4870d();
    }

    /* JADX INFO: renamed from: y */
    public static C1496m2 m4702y(byte[] bArr) {
        return (C1496m2) AbstractC1534u0.m4868m(DEFAULT_INSTANCE, bArr);
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
                return new C1436a2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "callingPackage_", "sdkVersion_", "permissionToken_", "isInForeground_"});
            case 3:
                return new C1496m2();
            case 4:
                return new C1491l2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1525s1 interfaceC1525s1 = PARSER;
                if (interfaceC1525s1 != null) {
                    return interfaceC1525s1;
                }
                synchronized (C1496m2.class) {
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

    /* JADX INFO: renamed from: t */
    public final String m4703t() {
        return this.callingPackage_;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m4704u() {
        return this.isInForeground_;
    }

    /* JADX INFO: renamed from: v */
    public final String m4705v() {
        return this.permissionToken_;
    }

    /* JADX INFO: renamed from: w */
    public final int m4706w() {
        return this.sdkVersion_;
    }
}
