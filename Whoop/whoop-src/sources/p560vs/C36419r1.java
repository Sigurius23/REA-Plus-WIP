package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.r1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36419r1 extends AbstractC5184x {
    private static final C36419r1 DEFAULT_INSTANCE;
    public static final int DEM_PARAMS_FIELD_NUMBER = 2;
    public static final int EC_POINT_FORMAT_FIELD_NUMBER = 3;
    public static final int KEM_PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC5181v0 PARSER;
    private int bitField0_;
    private C36395n1 demParams_;
    private int ecPointFormat_;
    private C36455x1 kemParams_;

    static {
        C36419r1 c36419r1 = new C36419r1();
        DEFAULT_INSTANCE = c36419r1;
        AbstractC5184x.m16359w(C36419r1.class, c36419r1);
    }

    /* JADX INFO: renamed from: A */
    public static void m116578A(C36419r1 c36419r1, C36395n1 c36395n1) {
        c36419r1.getClass();
        c36419r1.demParams_ = c36395n1;
        c36419r1.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: B */
    public static void m116579B(C36419r1 c36419r1, EnumC36329c1 enumC36329c1) {
        c36419r1.getClass();
        if (enumC36329c1 == EnumC36329c1.UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        c36419r1.ecPointFormat_ = enumC36329c1.f155724w;
    }

    /* JADX INFO: renamed from: C */
    public static C36419r1 m116580C() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static C36413q1 m116581G() {
        return (C36413q1) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: z */
    public static void m116582z(C36419r1 c36419r1, C36455x1 c36455x1) {
        c36419r1.getClass();
        c36419r1.kemParams_ = c36455x1;
        c36419r1.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: D */
    public final C36395n1 m116583D() {
        C36395n1 c36395n1 = this.demParams_;
        return c36395n1 == null ? C36395n1.m116454B() : c36395n1;
    }

    /* JADX INFO: renamed from: E */
    public final EnumC36329c1 m116584E() {
        EnumC36329c1 enumC36329c1;
        int i13 = this.ecPointFormat_;
        if (i13 == 0) {
            enumC36329c1 = EnumC36329c1.UNKNOWN_FORMAT;
        } else if (i13 == 1) {
            enumC36329c1 = EnumC36329c1.UNCOMPRESSED;
        } else if (i13 != 2) {
            enumC36329c1 = i13 != 3 ? null : EnumC36329c1.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        } else {
            enumC36329c1 = EnumC36329c1.COMPRESSED;
        }
        return enumC36329c1 == null ? EnumC36329c1.UNRECOGNIZED : enumC36329c1;
    }

    /* JADX INFO: renamed from: F */
    public final C36455x1 m116585F() {
        C36455x1 c36455x1 = this.kemParams_;
        return c36455x1 == null ? C36455x1.m116769D() : c36455x1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5184x
    /* JADX INFO: renamed from: j */
    public final Object mo16361j(int i13) {
        InterfaceC5181v0 c5182w;
        switch (AbstractC12682p.m35485e(i13)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"bitField0_", "kemParams_", "demParams_", "ecPointFormat_"});
            case 3:
                return new C36419r1();
            case 4:
                return new C36413q1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36419r1.class) {
                    try {
                        c5182w = PARSER;
                        if (c5182w == null) {
                            c5182w = new C5182w();
                            PARSER = c5182w;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return c5182w;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
