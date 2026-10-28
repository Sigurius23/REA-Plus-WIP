package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C36429t extends AbstractC5184x {
    public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
    private static final C36429t DEFAULT_INSTANCE;
    public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
    public static final int HMAC_PARAMS_FIELD_NUMBER = 4;
    private static volatile InterfaceC5181v0 PARSER;
    private int bitField0_;
    private int ciphertextSegmentSize_;
    private int derivedKeySize_;
    private int hkdfHashType_;
    private C36426s2 hmacParams_;

    static {
        C36429t c36429t = new C36429t();
        DEFAULT_INSTANCE = c36429t;
        AbstractC5184x.m16359w(C36429t.class, c36429t);
    }

    /* JADX INFO: renamed from: A */
    public static void m116613A(C36429t c36429t, int i13) {
        c36429t.derivedKeySize_ = i13;
    }

    /* JADX INFO: renamed from: B */
    public static void m116614B(C36429t c36429t, EnumC36354g2 enumC36354g2) {
        c36429t.getClass();
        c36429t.hkdfHashType_ = enumC36354g2.m116264b();
    }

    /* JADX INFO: renamed from: C */
    public static void m116615C(C36429t c36429t, C36426s2 c36426s2) {
        c36429t.getClass();
        c36429t.hmacParams_ = c36426s2;
        c36429t.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: E */
    public static C36429t m116616E() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static C36423s m116617I() {
        return (C36423s) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: z */
    public static void m116618z(C36429t c36429t, int i13) {
        c36429t.ciphertextSegmentSize_ = i13;
    }

    /* JADX INFO: renamed from: D */
    public final int m116619D() {
        return this.ciphertextSegmentSize_;
    }

    /* JADX INFO: renamed from: F */
    public final int m116620F() {
        return this.derivedKeySize_;
    }

    /* JADX INFO: renamed from: G */
    public final EnumC36354g2 m116621G() {
        EnumC36354g2 enumC36354g2M116263a = EnumC36354g2.m116263a(this.hkdfHashType_);
        return enumC36354g2M116263a == null ? EnumC36354g2.UNRECOGNIZED : enumC36354g2M116263a;
    }

    /* JADX INFO: renamed from: H */
    public final C36426s2 m116622H() {
        C36426s2 c36426s2 = this.hmacParams_;
        return c36426s2 == null ? C36426s2.m116600B() : c36426s2;
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f\u0004ဉ\u0000", new Object[]{"bitField0_", "ciphertextSegmentSize_", "derivedKeySize_", "hkdfHashType_", "hmacParams_"});
            case 3:
                return new C36429t();
            case 4:
                return new C36423s(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36429t.class) {
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
