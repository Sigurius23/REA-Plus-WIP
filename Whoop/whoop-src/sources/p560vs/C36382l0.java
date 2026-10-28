package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36382l0 extends AbstractC5184x {
    public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
    private static final C36382l0 DEFAULT_INSTANCE;
    public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
    private static volatile InterfaceC5181v0 PARSER;
    private int ciphertextSegmentSize_;
    private int derivedKeySize_;
    private int hkdfHashType_;

    static {
        C36382l0 c36382l0 = new C36382l0();
        DEFAULT_INSTANCE = c36382l0;
        AbstractC5184x.m16359w(C36382l0.class, c36382l0);
    }

    /* JADX INFO: renamed from: A */
    public static void m116407A(C36382l0 c36382l0, int i13) {
        c36382l0.derivedKeySize_ = i13;
    }

    /* JADX INFO: renamed from: B */
    public static void m116408B(C36382l0 c36382l0, EnumC36354g2 enumC36354g2) {
        c36382l0.getClass();
        c36382l0.hkdfHashType_ = enumC36354g2.m116264b();
    }

    /* JADX INFO: renamed from: D */
    public static C36382l0 m116409D() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static C36376k0 m116410G() {
        return (C36376k0) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: z */
    public static void m116411z(C36382l0 c36382l0, int i13) {
        c36382l0.ciphertextSegmentSize_ = i13;
    }

    /* JADX INFO: renamed from: C */
    public final int m116412C() {
        return this.ciphertextSegmentSize_;
    }

    /* JADX INFO: renamed from: E */
    public final int m116413E() {
        return this.derivedKeySize_;
    }

    /* JADX INFO: renamed from: F */
    public final EnumC36354g2 m116414F() {
        EnumC36354g2 enumC36354g2M116263a = EnumC36354g2.m116263a(this.hkdfHashType_);
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f", new Object[]{"ciphertextSegmentSize_", "derivedKeySize_", "hkdfHashType_"});
            case 3:
                return new C36382l0();
            case 4:
                return new C36376k0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36382l0.class) {
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
