package p451r6;

import androidx.glance.appwidget.protobuf.AbstractC1368a0;
import androidx.glance.appwidget.protobuf.AbstractC1391i;
import androidx.glance.appwidget.protobuf.C1369a1;
import androidx.glance.appwidget.protobuf.C1388h;
import androidx.glance.appwidget.protobuf.C1431z;
import androidx.glance.appwidget.protobuf.InterfaceC1426w0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: r6.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C30955i extends AbstractC1368a0 {
    public static final int APP_WIDGET_ID_FIELD_NUMBER = 2;
    public static final int BUNDLE_FIELD_NUMBER = 3;
    private static final C30955i DEFAULT_INSTANCE;
    private static volatile InterfaceC1426w0 PARSER = null;
    public static final int RECEIVER_FIELD_NUMBER = 1;
    private int appWidgetId_;
    private String receiver_ = "";
    private AbstractC1391i bundle_ = AbstractC1391i.f5905x;

    static {
        C30955i c30955i = new C30955i();
        DEFAULT_INSTANCE = c30955i;
        AbstractC1368a0.m4273k(C30955i.class, c30955i);
    }

    /* JADX INFO: renamed from: n */
    public static void m95206n(C30955i c30955i, String str) {
        c30955i.getClass();
        str.getClass();
        c30955i.receiver_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m95207o(C30955i c30955i, int i13) {
        c30955i.appWidgetId_ = i13;
    }

    /* JADX INFO: renamed from: p */
    public static void m95208p(C30955i c30955i, C1388h c1388h) {
        c30955i.getClass();
        c30955i.bundle_ = c1388h;
    }

    /* JADX INFO: renamed from: s */
    public static C30955i m95209s() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static C30954h m95210u() {
        return (C30954h) DEFAULT_INSTANCE.m4274c();
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
                return new C1369a1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\n", new Object[]{"receiver_", "appWidgetId_", "bundle_"});
            case 3:
                return new C30955i();
            case 4:
                return new C30954h(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1426w0 interfaceC1426w0 = PARSER;
                if (interfaceC1426w0 != null) {
                    return interfaceC1426w0;
                }
                synchronized (C30955i.class) {
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

    /* JADX INFO: renamed from: q */
    public final int m95211q() {
        return this.appWidgetId_;
    }

    /* JADX INFO: renamed from: r */
    public final AbstractC1391i m95212r() {
        return this.bundle_;
    }

    /* JADX INFO: renamed from: t */
    public final String m95213t() {
        return this.receiver_;
    }
}
