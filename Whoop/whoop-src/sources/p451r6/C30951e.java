package p451r6;

import androidx.glance.appwidget.protobuf.AbstractC1368a0;
import androidx.glance.appwidget.protobuf.C1369a1;
import androidx.glance.appwidget.protobuf.C1431z;
import androidx.glance.appwidget.protobuf.InterfaceC1426w0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: r6.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C30951e extends AbstractC1368a0 {
    public static final int ACTIONKEY_FIELD_NUMBER = 3;
    public static final int APP_WIDGET_ID_FIELD_NUMBER = 2;
    private static final C30951e DEFAULT_INSTANCE;
    private static volatile InterfaceC1426w0 PARSER = null;
    public static final int RECEIVER_FIELD_NUMBER = 1;
    private int appWidgetId_;
    private String receiver_ = "";
    private String actionKey_ = "";

    static {
        C30951e c30951e = new C30951e();
        DEFAULT_INSTANCE = c30951e;
        AbstractC1368a0.m4273k(C30951e.class, c30951e);
    }

    /* JADX INFO: renamed from: n */
    public static void m95197n(C30951e c30951e, String str) {
        c30951e.getClass();
        str.getClass();
        c30951e.receiver_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m95198o(C30951e c30951e, int i13) {
        c30951e.appWidgetId_ = i13;
    }

    /* JADX INFO: renamed from: p */
    public static void m95199p(C30951e c30951e, String str) {
        c30951e.getClass();
        c30951e.actionKey_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static C30951e m95200s() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static C30950d m95201u() {
        return (C30950d) DEFAULT_INSTANCE.m4274c();
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
                return new C1369a1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ", new Object[]{"receiver_", "appWidgetId_", "actionKey_"});
            case 3:
                return new C30951e();
            case 4:
                return new C30950d(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1426w0 interfaceC1426w0 = PARSER;
                if (interfaceC1426w0 != null) {
                    return interfaceC1426w0;
                }
                synchronized (C30951e.class) {
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
    public final String m95202q() {
        return this.actionKey_;
    }

    /* JADX INFO: renamed from: r */
    public final int m95203r() {
        return this.appWidgetId_;
    }

    /* JADX INFO: renamed from: t */
    public final String m95204t() {
        return this.receiver_;
    }
}
