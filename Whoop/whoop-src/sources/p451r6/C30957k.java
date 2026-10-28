package p451r6;

import androidx.glance.appwidget.protobuf.AbstractC1368a0;
import androidx.glance.appwidget.protobuf.AbstractC1391i;
import androidx.glance.appwidget.protobuf.C1369a1;
import androidx.glance.appwidget.protobuf.C1388h;
import androidx.glance.appwidget.protobuf.C1431z;
import androidx.glance.appwidget.protobuf.InterfaceC1426w0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: r6.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C30957k extends AbstractC1368a0 {
    public static final int ACTION_PARAMETERS_FIELD_NUMBER = 3;
    public static final int APP_WIDGET_ID_FIELD_NUMBER = 2;
    public static final int CLASS_NAME_FIELD_NUMBER = 1;
    private static final C30957k DEFAULT_INSTANCE;
    private static volatile InterfaceC1426w0 PARSER;
    private int appWidgetId_;
    private String className_ = "";
    private AbstractC1391i actionParameters_ = AbstractC1391i.f5905x;

    static {
        C30957k c30957k = new C30957k();
        DEFAULT_INSTANCE = c30957k;
        AbstractC1368a0.m4273k(C30957k.class, c30957k);
    }

    /* JADX INFO: renamed from: n */
    public static void m95214n(C30957k c30957k, String str) {
        c30957k.getClass();
        c30957k.className_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m95215o(C30957k c30957k, int i13) {
        c30957k.appWidgetId_ = i13;
    }

    /* JADX INFO: renamed from: p */
    public static void m95216p(C30957k c30957k, C1388h c1388h) {
        c30957k.getClass();
        c30957k.actionParameters_ = c1388h;
    }

    /* JADX INFO: renamed from: s */
    public static C30957k m95217s() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static C30956j m95218t() {
        return (C30956j) DEFAULT_INSTANCE.m4274c();
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
                return new C1369a1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\n", new Object[]{"className_", "appWidgetId_", "actionParameters_"});
            case 3:
                return new C30957k();
            case 4:
                return new C30956j(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1426w0 interfaceC1426w0 = PARSER;
                if (interfaceC1426w0 != null) {
                    return interfaceC1426w0;
                }
                synchronized (C30957k.class) {
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
    public final AbstractC1391i m95219q() {
        return this.actionParameters_;
    }

    /* JADX INFO: renamed from: r */
    public final String m95220r() {
        return this.className_;
    }
}
