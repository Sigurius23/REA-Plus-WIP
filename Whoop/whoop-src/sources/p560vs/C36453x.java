package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C36453x extends AbstractC5184x {
    private static final C36453x DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC5181v0 PARSER;
    private int bitField0_;
    private int keySize_;
    private C36465z params_;

    static {
        C36453x c36453x = new C36453x();
        DEFAULT_INSTANCE = c36453x;
        AbstractC5184x.m16359w(C36453x.class, c36453x);
    }

    /* JADX INFO: renamed from: A */
    public static void m116756A(C36453x c36453x, int i13) {
        c36453x.keySize_ = i13;
    }

    /* JADX INFO: renamed from: B */
    public static C36453x m116757B() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static C36447w m116758E() {
        return (C36447w) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: z */
    public static void m116759z(C36453x c36453x, C36465z c36465z) {
        c36453x.getClass();
        c36453x.params_ = c36465z;
        c36453x.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: C */
    public final int m116760C() {
        return this.keySize_;
    }

    /* JADX INFO: renamed from: D */
    public final C36465z m116761D() {
        C36465z c36465z = this.params_;
        return c36465z == null ? C36465z.m116812A() : c36465z;
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"bitField0_", "params_", "keySize_"});
            case 3:
                return new C36453x();
            case 4:
                return new C36447w(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36453x.class) {
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
