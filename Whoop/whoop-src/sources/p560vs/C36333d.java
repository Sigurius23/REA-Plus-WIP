package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C36333d extends AbstractC5184x {
    private static final C36333d DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC5181v0 PARSER;
    private int bitField0_;
    private int keySize_;
    private C36345f params_;

    static {
        C36333d c36333d = new C36333d();
        DEFAULT_INSTANCE = c36333d;
        AbstractC5184x.m16359w(C36333d.class, c36333d);
    }

    /* JADX INFO: renamed from: A */
    public static void m116190A(C36333d c36333d, C36345f c36345f) {
        c36333d.getClass();
        c36333d.params_ = c36345f;
        c36333d.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: D */
    public static C36327c m116191D() {
        return (C36327c) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: E */
    public static C36333d m116192E(AbstractC5146i abstractC5146i, C5167p c5167p) {
        return (C36333d) AbstractC5184x.m16356t(DEFAULT_INSTANCE, abstractC5146i, c5167p);
    }

    /* JADX INFO: renamed from: z */
    public static void m116193z(C36333d c36333d, int i13) {
        c36333d.keySize_ = i13;
    }

    /* JADX INFO: renamed from: B */
    public final int m116194B() {
        return this.keySize_;
    }

    /* JADX INFO: renamed from: C */
    public final C36345f m116195C() {
        C36345f c36345f = this.params_;
        return c36345f == null ? C36345f.m116226A() : c36345f;
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "keySize_", "params_"});
            case 3:
                return new C36333d();
            case 4:
                return new C36327c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36333d.class) {
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
