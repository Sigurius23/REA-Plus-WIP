package p451r6;

import androidx.glance.appwidget.protobuf.AbstractC1368a0;
import androidx.glance.appwidget.protobuf.C1369a1;
import androidx.glance.appwidget.protobuf.C1431z;
import androidx.glance.appwidget.protobuf.InterfaceC1426w0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: r6.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C30953g extends AbstractC1368a0 {
    private static final C30953g DEFAULT_INSTANCE;
    private static volatile InterfaceC1426w0 PARSER;

    static {
        C30953g c30953g = new C30953g();
        DEFAULT_INSTANCE = c30953g;
        AbstractC1368a0.m4273k(C30953g.class, c30953g);
    }

    /* JADX INFO: renamed from: n */
    public static C30952f m95205n() {
        return (C30952f) DEFAULT_INSTANCE.m4274c();
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
                return new C1369a1(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new C30953g();
            case 4:
                return new C30952f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1426w0 interfaceC1426w0 = PARSER;
                if (interfaceC1426w0 != null) {
                    return interfaceC1426w0;
                }
                synchronized (C30953g.class) {
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
}
