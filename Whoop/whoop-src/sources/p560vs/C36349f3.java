package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.f3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36349f3 extends AbstractC5184x {
    public static final int AEAD_FIELD_NUMBER = 3;
    private static final C36349f3 DEFAULT_INSTANCE;
    public static final int KDF_FIELD_NUMBER = 2;
    public static final int KEM_FIELD_NUMBER = 1;
    private static volatile InterfaceC5181v0 PARSER;
    private int aead_;
    private int kdf_;
    private int kem_;

    static {
        C36349f3 c36349f3 = new C36349f3();
        DEFAULT_INSTANCE = c36349f3;
        AbstractC5184x.m16359w(C36349f3.class, c36349f3);
    }

    /* JADX INFO: renamed from: A */
    public static void m116242A(C36349f3 c36349f3, EnumC36317a3 enumC36317a3) {
        c36349f3.getClass();
        if (enumC36317a3 == EnumC36317a3.UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        c36349f3.kdf_ = enumC36317a3.f155709w;
    }

    /* JADX INFO: renamed from: B */
    public static void m116243B(C36349f3 c36349f3, EnumC36468z2 enumC36468z2) {
        c36349f3.getClass();
        if (enumC36468z2 == EnumC36468z2.UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        c36349f3.aead_ = enumC36468z2.f155791w;
    }

    /* JADX INFO: renamed from: D */
    public static C36349f3 m116244D() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static C36343e3 m116245G() {
        return (C36343e3) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: z */
    public static void m116246z(C36349f3 c36349f3, EnumC36324b3 enumC36324b3) {
        c36349f3.getClass();
        if (enumC36324b3 == EnumC36324b3.UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        c36349f3.kem_ = enumC36324b3.f155717w;
    }

    /* JADX INFO: renamed from: C */
    public final EnumC36468z2 m116247C() {
        EnumC36468z2 enumC36468z2;
        int i13 = this.aead_;
        if (i13 == 0) {
            enumC36468z2 = EnumC36468z2.AEAD_UNKNOWN;
        } else if (i13 == 1) {
            enumC36468z2 = EnumC36468z2.AES_128_GCM;
        } else if (i13 != 2) {
            enumC36468z2 = i13 != 3 ? null : EnumC36468z2.CHACHA20_POLY1305;
        } else {
            enumC36468z2 = EnumC36468z2.AES_256_GCM;
        }
        return enumC36468z2 == null ? EnumC36468z2.UNRECOGNIZED : enumC36468z2;
    }

    /* JADX INFO: renamed from: E */
    public final EnumC36317a3 m116248E() {
        EnumC36317a3 enumC36317a3;
        int i13 = this.kdf_;
        if (i13 == 0) {
            enumC36317a3 = EnumC36317a3.KDF_UNKNOWN;
        } else if (i13 == 1) {
            enumC36317a3 = EnumC36317a3.HKDF_SHA256;
        } else if (i13 != 2) {
            enumC36317a3 = i13 != 3 ? null : EnumC36317a3.HKDF_SHA512;
        } else {
            enumC36317a3 = EnumC36317a3.HKDF_SHA384;
        }
        return enumC36317a3 == null ? EnumC36317a3.UNRECOGNIZED : enumC36317a3;
    }

    /* JADX INFO: renamed from: F */
    public final EnumC36324b3 m116249F() {
        EnumC36324b3 enumC36324b3;
        int i13 = this.kem_;
        if (i13 == 0) {
            enumC36324b3 = EnumC36324b3.KEM_UNKNOWN;
        } else if (i13 == 1) {
            enumC36324b3 = EnumC36324b3.DHKEM_X25519_HKDF_SHA256;
        } else if (i13 == 2) {
            enumC36324b3 = EnumC36324b3.DHKEM_P256_HKDF_SHA256;
        } else if (i13 != 3) {
            enumC36324b3 = i13 != 4 ? null : EnumC36324b3.DHKEM_P521_HKDF_SHA512;
        } else {
            enumC36324b3 = EnumC36324b3.DHKEM_P384_HKDF_SHA384;
        }
        return enumC36324b3 == null ? EnumC36324b3.UNRECOGNIZED : enumC36324b3;
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"kem_", "kdf_", "aead_"});
            case 3:
                return new C36349f3();
            case 4:
                return new C36343e3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36349f3.class) {
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
