package p451r6;

import androidx.glance.appwidget.protobuf.AbstractC1367a;
import androidx.glance.appwidget.protobuf.AbstractC1368a0;
import androidx.glance.appwidget.protobuf.AbstractC1370b;
import androidx.glance.appwidget.protobuf.C1369a1;
import androidx.glance.appwidget.protobuf.C1371b0;
import androidx.glance.appwidget.protobuf.C1431z;
import androidx.glance.appwidget.protobuf.InterfaceC1377d0;
import androidx.glance.appwidget.protobuf.InterfaceC1426w0;
import java.util.Arrays;
import java.util.List;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: r6.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C30959m extends AbstractC1368a0 {
    public static final int APP_WIDGET_IDS_FIELD_NUMBER = 2;
    private static final C30959m DEFAULT_INSTANCE;
    private static volatile InterfaceC1426w0 PARSER = null;
    public static final int RECEIVER_FIELD_NUMBER = 1;
    private int appWidgetIdsMemoizedSerializedSize = -1;
    private String receiver_ = "";
    private InterfaceC1377d0 appWidgetIds_ = C1371b0.f5868z;

    static {
        C30959m c30959m = new C30959m();
        DEFAULT_INSTANCE = c30959m;
        AbstractC1368a0.m4273k(C30959m.class, c30959m);
    }

    /* JADX INFO: renamed from: n */
    public static void m95221n(C30959m c30959m, String str) {
        c30959m.getClass();
        str.getClass();
        c30959m.receiver_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m95222o(C30959m c30959m, Iterable iterable) {
        List list = c30959m.appWidgetIds_;
        if (!((AbstractC1370b) list).f5867w) {
            int size = list.size();
            int i13 = size == 0 ? 10 : size * 2;
            C1371b0 c1371b0 = (C1371b0) list;
            if (i13 < c1371b0.f5870y) {
                throw new IllegalArgumentException();
            }
            c30959m.appWidgetIds_ = new C1371b0(Arrays.copyOf(c1371b0.f5869x, i13), c1371b0.f5870y, true);
        }
        AbstractC1367a.m4268a(iterable, c30959m.appWidgetIds_);
    }

    /* JADX INFO: renamed from: q */
    public static C30959m m95223q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static C30958l m95224s() {
        return (C30958l) DEFAULT_INSTANCE.m4274c();
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
                return new C1369a1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002'", new Object[]{"receiver_", "appWidgetIds_"});
            case 3:
                return new C30959m();
            case 4:
                return new C30958l(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1426w0 interfaceC1426w0 = PARSER;
                if (interfaceC1426w0 != null) {
                    return interfaceC1426w0;
                }
                synchronized (C30959m.class) {
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
    public final InterfaceC1377d0 m95225p() {
        return this.appWidgetIds_;
    }

    /* JADX INFO: renamed from: r */
    public final String m95226r() {
        return this.receiver_;
    }
}
