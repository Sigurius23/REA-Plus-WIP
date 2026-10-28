package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5143h;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.h3 */
/* JADX INFO: loaded from: classes.dex */
public final class C36361h3 extends AbstractC5184x {
    private static final C36361h3 DEFAULT_INSTANCE;
    private static volatile InterfaceC5181v0 PARSER = null;
    public static final int PRIVATE_KEY_FIELD_NUMBER = 3;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private AbstractC5146i privateKey_ = AbstractC5146i.f21514x;
    private C36373j3 publicKey_;
    private int version_;

    static {
        C36361h3 c36361h3 = new C36361h3();
        DEFAULT_INSTANCE = c36361h3;
        AbstractC5184x.m16359w(C36361h3.class, c36361h3);
    }

    /* JADX INFO: renamed from: A */
    public static void m116295A(C36361h3 c36361h3) {
        c36361h3.version_ = 0;
    }

    /* JADX INFO: renamed from: B */
    public static void m116296B(C36361h3 c36361h3, C36373j3 c36373j3) {
        c36361h3.getClass();
        c36361h3.publicKey_ = c36373j3;
        c36361h3.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: C */
    public static void m116297C(C36361h3 c36361h3, C5143h c5143h) {
        c36361h3.getClass();
        c36361h3.privateKey_ = c5143h;
    }

    /* JADX INFO: renamed from: G */
    public static C36355g3 m116298G() {
        return (C36355g3) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: H */
    public static C36361h3 m116299H(AbstractC5146i abstractC5146i, C5167p c5167p) {
        return (C36361h3) AbstractC5184x.m16356t(DEFAULT_INSTANCE, abstractC5146i, c5167p);
    }

    /* JADX INFO: renamed from: I */
    public static InterfaceC5181v0 m116300I() {
        return DEFAULT_INSTANCE.m16363m();
    }

    /* JADX INFO: renamed from: D */
    public final AbstractC5146i m116302D() {
        return this.privateKey_;
    }

    /* JADX INFO: renamed from: E */
    public final C36373j3 m116303E() {
        C36373j3 c36373j3 = this.publicKey_;
        return c36373j3 == null ? C36373j3.m116352D() : c36373j3;
    }

    /* JADX INFO: renamed from: F */
    public final int m116304F() {
        return this.version_;
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "publicKey_", "privateKey_"});
            case 3:
                return new C36361h3();
            case 4:
                return new C36355g3();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36361h3.class) {
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
