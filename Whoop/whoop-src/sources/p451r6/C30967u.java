package p451r6;

import androidx.glance.appwidget.protobuf.AbstractC1368a0;
import androidx.glance.appwidget.protobuf.C1369a1;
import androidx.glance.appwidget.protobuf.C1431z;
import androidx.glance.appwidget.protobuf.InterfaceC1426w0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: r6.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C30967u extends AbstractC1368a0 {
    private static final C30967u DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int LAYOUT_INDEX_FIELD_NUMBER = 2;
    private static volatile InterfaceC1426w0 PARSER;
    private int bitField0_;
    private int layoutIndex_;
    private C30969w layout_;

    static {
        C30967u c30967u = new C30967u();
        DEFAULT_INSTANCE = c30967u;
        AbstractC1368a0.m4273k(C30967u.class, c30967u);
    }

    /* JADX INFO: renamed from: n */
    public static void m95254n(C30967u c30967u, C30969w c30969w) {
        c30967u.getClass();
        c30969w.getClass();
        c30967u.layout_ = c30969w;
        c30967u.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m95255o(C30967u c30967u, int i13) {
        c30967u.layoutIndex_ = i13;
    }

    /* JADX INFO: renamed from: r */
    public static C30966t m95256r() {
        return (C30966t) DEFAULT_INSTANCE.m4274c();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1368a0
    /* JADX INFO: renamed from: d */
    public final Object mo4275d(int i13) {
        InterfaceC1426w0 c1431z;
        switch (AbstractC12682p.m35485e(i13)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C1369a1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "layout_", "layoutIndex_"});
            case 3:
                return new C30967u();
            case 4:
                return new C30966t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1426w0 interfaceC1426w0 = PARSER;
                if (interfaceC1426w0 != null) {
                    return interfaceC1426w0;
                }
                synchronized (C30967u.class) {
                    try {
                        c1431z = PARSER;
                        if (c1431z == null) {
                            c1431z = new C1431z();
                            PARSER = c1431z;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return c1431z;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: p */
    public final C30969w m95257p() {
        C30969w c30969w = this.layout_;
        return c30969w == null ? C30969w.m95272z() : c30969w;
    }

    /* JADX INFO: renamed from: q */
    public final int m95258q() {
        return this.layoutIndex_;
    }
}
