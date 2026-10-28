package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C36393n extends AbstractC5184x {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final C36393n DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile InterfaceC5181v0 PARSER;
    private C36453x aesCtrKeyFormat_;
    private int bitField0_;
    private C36414q2 hmacKeyFormat_;

    static {
        C36393n c36393n = new C36393n();
        DEFAULT_INSTANCE = c36393n;
        AbstractC5184x.m16359w(C36393n.class, c36393n);
    }

    /* JADX INFO: renamed from: A */
    public static void m116441A(C36393n c36393n, C36414q2 c36414q2) {
        c36393n.getClass();
        c36393n.hmacKeyFormat_ = c36414q2;
        c36393n.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: D */
    public static C36387m m116442D() {
        return (C36387m) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: E */
    public static C36393n m116443E(AbstractC5146i abstractC5146i, C5167p c5167p) {
        return (C36393n) AbstractC5184x.m16356t(DEFAULT_INSTANCE, abstractC5146i, c5167p);
    }

    /* JADX INFO: renamed from: z */
    public static void m116444z(C36393n c36393n, C36453x c36453x) {
        c36393n.getClass();
        c36393n.aesCtrKeyFormat_ = c36453x;
        c36393n.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: B */
    public final C36453x m116445B() {
        C36453x c36453x = this.aesCtrKeyFormat_;
        return c36453x == null ? C36453x.m116757B() : c36453x;
    }

    /* JADX INFO: renamed from: C */
    public final C36414q2 m116446C() {
        C36414q2 c36414q2 = this.hmacKeyFormat_;
        return c36414q2 == null ? C36414q2.m116546B() : c36414q2;
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 3:
                return new C36393n();
            case 4:
                return new C36387m(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36393n.class) {
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
