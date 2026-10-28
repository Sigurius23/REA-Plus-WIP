package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5143h;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.s4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36428s4 extends AbstractC5184x {
    private static final C36428s4 DEFAULT_INSTANCE;
    public static final int MODULUS_SIZE_IN_BITS_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC5181v0 PARSER = null;
    public static final int PUBLIC_EXPONENT_FIELD_NUMBER = 3;
    private int bitField0_;
    private int modulusSizeInBits_;
    private C36440u4 params_;
    private AbstractC5146i publicExponent_ = AbstractC5146i.f21514x;

    static {
        C36428s4 c36428s4 = new C36428s4();
        DEFAULT_INSTANCE = c36428s4;
        AbstractC5184x.m16359w(C36428s4.class, c36428s4);
    }

    /* JADX INFO: renamed from: A */
    public static void m116605A(C36428s4 c36428s4, int i13) {
        c36428s4.modulusSizeInBits_ = i13;
    }

    /* JADX INFO: renamed from: B */
    public static void m116606B(C36428s4 c36428s4, C5143h c5143h) {
        c36428s4.getClass();
        c36428s4.publicExponent_ = c5143h;
    }

    /* JADX INFO: renamed from: F */
    public static C36422r4 m116607F() {
        return (C36422r4) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: G */
    public static C36428s4 m116608G(AbstractC5146i abstractC5146i, C5167p c5167p) {
        return (C36428s4) AbstractC5184x.m16356t(DEFAULT_INSTANCE, abstractC5146i, c5167p);
    }

    /* JADX INFO: renamed from: z */
    public static void m116609z(C36428s4 c36428s4, C36440u4 c36440u4) {
        c36428s4.getClass();
        c36428s4.params_ = c36440u4;
        c36428s4.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: C */
    public final int m116610C() {
        return this.modulusSizeInBits_;
    }

    /* JADX INFO: renamed from: D */
    public final C36440u4 m116611D() {
        C36440u4 c36440u4 = this.params_;
        return c36440u4 == null ? C36440u4.m116680C() : c36440u4;
    }

    /* JADX INFO: renamed from: E */
    public final AbstractC5146i m116612E() {
        return this.publicExponent_;
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"bitField0_", "params_", "modulusSizeInBits_", "publicExponent_"});
            case 3:
                return new C36428s4();
            case 4:
                return new C36422r4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36428s4.class) {
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
