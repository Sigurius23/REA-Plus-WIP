package p109e6;

import androidx.datastore.preferences.protobuf.AbstractC1265x;
import androidx.datastore.preferences.protobuf.AbstractC1269z;
import androidx.datastore.preferences.protobuf.C1218h;
import androidx.datastore.preferences.protobuf.C1267y;
import androidx.datastore.preferences.protobuf.C1268y0;
import androidx.datastore.preferences.protobuf.InterfaceC1258u0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: e6.h */
/* JADX INFO: loaded from: classes.dex */
public final class C12753h extends AbstractC1269z {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final C12753h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile InterfaceC1258u0 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        C12753h c12753h = new C12753h();
        DEFAULT_INSTANCE = c12753h;
        AbstractC1269z.m4023j(C12753h.class, c12753h);
    }

    /* JADX INFO: renamed from: D */
    public static C12752g m35681D() {
        return (C12752g) ((AbstractC1265x) DEFAULT_INSTANCE.mo4024c(5));
    }

    /* JADX INFO: renamed from: l */
    public static void m35682l(C12753h c12753h, long j7) {
        c12753h.valueCase_ = 4;
        c12753h.value_ = Long.valueOf(j7);
    }

    /* JADX INFO: renamed from: m */
    public static void m35683m(C12753h c12753h, String str) {
        c12753h.getClass();
        c12753h.valueCase_ = 5;
        c12753h.value_ = str;
    }

    /* JADX INFO: renamed from: n */
    public static void m35684n(C12753h c12753h, C12751f c12751f) {
        c12753h.getClass();
        c12753h.value_ = c12751f;
        c12753h.valueCase_ = 6;
    }

    /* JADX INFO: renamed from: o */
    public static void m35685o(C12753h c12753h, double d3) {
        c12753h.valueCase_ = 7;
        c12753h.value_ = Double.valueOf(d3);
    }

    /* JADX INFO: renamed from: p */
    public static void m35686p(C12753h c12753h, C1218h c1218h) {
        c12753h.getClass();
        c12753h.valueCase_ = 8;
        c12753h.value_ = c1218h;
    }

    /* JADX INFO: renamed from: q */
    public static void m35687q(C12753h c12753h, boolean z4) {
        c12753h.valueCase_ = 1;
        c12753h.value_ = Boolean.valueOf(z4);
    }

    /* JADX INFO: renamed from: r */
    public static void m35688r(C12753h c12753h, float f13) {
        c12753h.valueCase_ = 2;
        c12753h.value_ = Float.valueOf(f13);
    }

    /* JADX INFO: renamed from: s */
    public static void m35689s(C12753h c12753h, int i13) {
        c12753h.valueCase_ = 3;
        c12753h.value_ = Integer.valueOf(i13);
    }

    /* JADX INFO: renamed from: v */
    public static C12753h m35690v() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final String m35691A() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    /* JADX INFO: renamed from: B */
    public final C12751f m35692B() {
        return this.valueCase_ == 6 ? (C12751f) this.value_ : C12751f.m35678n();
    }

    /* JADX INFO: renamed from: C */
    public final int m35693C() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1269z
    /* JADX INFO: renamed from: c */
    public final Object mo4024c(int i13) {
        InterfaceC1258u0 c1267y;
        switch (AbstractC12682p.m35485e(i13)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C1268y0(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", C12751f.class});
            case 3:
                return new C12753h();
            case 4:
                return new C12752g(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1258u0 interfaceC1258u0 = PARSER;
                if (interfaceC1258u0 != null) {
                    return interfaceC1258u0;
                }
                synchronized (C12753h.class) {
                    try {
                        c1267y = PARSER;
                        if (c1267y == null) {
                            c1267y = new C1267y();
                            PARSER = c1267y;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return c1267y;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m35694t() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final C1218h m35695u() {
        return this.valueCase_ == 8 ? (C1218h) this.value_ : C1218h.f5398y;
    }

    /* JADX INFO: renamed from: w */
    public final double m35696w() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: x */
    public final float m35697x() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: y */
    public final int m35698y() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: z */
    public final long m35699z() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }
}
