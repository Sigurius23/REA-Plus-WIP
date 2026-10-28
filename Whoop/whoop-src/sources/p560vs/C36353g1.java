package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.g1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36353g1 extends AbstractC5184x {
    public static final int CURVE_FIELD_NUMBER = 2;
    private static final C36353g1 DEFAULT_INSTANCE;
    public static final int ENCODING_FIELD_NUMBER = 3;
    public static final int HASH_TYPE_FIELD_NUMBER = 1;
    private static volatile InterfaceC5181v0 PARSER;
    private int curve_;
    private int encoding_;
    private int hashType_;

    static {
        C36353g1 c36353g1 = new C36353g1();
        DEFAULT_INSTANCE = c36353g1;
        AbstractC5184x.m16359w(C36353g1.class, c36353g1);
    }

    /* JADX INFO: renamed from: A */
    public static void m116255A(C36353g1 c36353g1, EnumC36336d2 enumC36336d2) {
        c36353g1.getClass();
        c36353g1.curve_ = enumC36336d2.m116204b();
    }

    /* JADX INFO: renamed from: B */
    public static void m116256B(C36353g1 c36353g1, EnumC36383l1 enumC36383l1) {
        c36353g1.getClass();
        c36353g1.encoding_ = enumC36383l1.m116415a();
    }

    /* JADX INFO: renamed from: D */
    public static C36353g1 m116257D() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static C36347f1 m116258G() {
        return (C36347f1) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: z */
    public static void m116259z(C36353g1 c36353g1, EnumC36354g2 enumC36354g2) {
        c36353g1.getClass();
        c36353g1.hashType_ = enumC36354g2.m116264b();
    }

    /* JADX INFO: renamed from: C */
    public final EnumC36336d2 m116260C() {
        EnumC36336d2 enumC36336d2M116203a = EnumC36336d2.m116203a(this.curve_);
        return enumC36336d2M116203a == null ? EnumC36336d2.UNRECOGNIZED : enumC36336d2M116203a;
    }

    /* JADX INFO: renamed from: E */
    public final EnumC36383l1 m116261E() {
        EnumC36383l1 enumC36383l1;
        int i13 = this.encoding_;
        if (i13 == 0) {
            enumC36383l1 = EnumC36383l1.UNKNOWN_ENCODING;
        } else if (i13 != 1) {
            enumC36383l1 = i13 != 2 ? null : EnumC36383l1.DER;
        } else {
            enumC36383l1 = EnumC36383l1.IEEE_P1363;
        }
        return enumC36383l1 == null ? EnumC36383l1.UNRECOGNIZED : enumC36383l1;
    }

    /* JADX INFO: renamed from: F */
    public final EnumC36354g2 m116262F() {
        EnumC36354g2 enumC36354g2M116263a = EnumC36354g2.m116263a(this.hashType_);
        return enumC36354g2M116263a == null ? EnumC36354g2.UNRECOGNIZED : enumC36354g2M116263a;
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"hashType_", "curve_", "encoding_"});
            case 3:
                return new C36353g1();
            case 4:
                return new C36347f1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36353g1.class) {
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
