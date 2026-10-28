package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5143h;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.x1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36455x1 extends AbstractC5184x {
    public static final int CURVE_TYPE_FIELD_NUMBER = 1;
    private static final C36455x1 DEFAULT_INSTANCE;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 2;
    public static final int HKDF_SALT_FIELD_NUMBER = 11;
    private static volatile InterfaceC5181v0 PARSER;
    private int curveType_;
    private int hkdfHashType_;
    private AbstractC5146i hkdfSalt_ = AbstractC5146i.f21514x;

    static {
        C36455x1 c36455x1 = new C36455x1();
        DEFAULT_INSTANCE = c36455x1;
        AbstractC5184x.m16359w(C36455x1.class, c36455x1);
    }

    /* JADX INFO: renamed from: A */
    public static void m116767A(C36455x1 c36455x1, EnumC36354g2 enumC36354g2) {
        c36455x1.getClass();
        c36455x1.hkdfHashType_ = enumC36354g2.m116264b();
    }

    /* JADX INFO: renamed from: B */
    public static void m116768B(C36455x1 c36455x1, C5143h c5143h) {
        c36455x1.getClass();
        c36455x1.hkdfSalt_ = c5143h;
    }

    /* JADX INFO: renamed from: D */
    public static C36455x1 m116769D() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static C36449w1 m116770G() {
        return (C36449w1) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: z */
    public static void m116771z(C36455x1 c36455x1, EnumC36336d2 enumC36336d2) {
        c36455x1.getClass();
        c36455x1.curveType_ = enumC36336d2.m116204b();
    }

    /* JADX INFO: renamed from: C */
    public final EnumC36336d2 m116772C() {
        EnumC36336d2 enumC36336d2M116203a = EnumC36336d2.m116203a(this.curveType_);
        return enumC36336d2M116203a == null ? EnumC36336d2.UNRECOGNIZED : enumC36336d2M116203a;
    }

    /* JADX INFO: renamed from: E */
    public final EnumC36354g2 m116773E() {
        EnumC36354g2 enumC36354g2M116263a = EnumC36354g2.m116263a(this.hkdfHashType_);
        return enumC36354g2M116263a == null ? EnumC36354g2.UNRECOGNIZED : enumC36354g2M116263a;
    }

    /* JADX INFO: renamed from: F */
    public final AbstractC5146i m116774F() {
        return this.hkdfSalt_;
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"curveType_", "hkdfHashType_", "hkdfSalt_"});
            case 3:
                return new C36455x1();
            case 4:
                return new C36449w1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36455x1.class) {
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
