package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C36417r extends AbstractC5184x {
    private static final C36417r DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC5181v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int bitField0_;
    private int keySize_;
    private C36429t params_;
    private int version_;

    static {
        C36417r c36417r = new C36417r();
        DEFAULT_INSTANCE = c36417r;
        AbstractC5184x.m16359w(C36417r.class, c36417r);
    }

    /* JADX INFO: renamed from: A */
    public static void m116565A(C36417r c36417r, int i13) {
        c36417r.keySize_ = i13;
    }

    /* JADX INFO: renamed from: D */
    public static C36411q m116566D() {
        return (C36411q) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: E */
    public static C36417r m116567E(AbstractC5146i abstractC5146i, C5167p c5167p) {
        return (C36417r) AbstractC5184x.m16356t(DEFAULT_INSTANCE, abstractC5146i, c5167p);
    }

    /* JADX INFO: renamed from: z */
    public static void m116568z(C36417r c36417r, C36429t c36429t) {
        c36417r.getClass();
        c36417r.params_ = c36429t;
        c36417r.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: B */
    public final int m116569B() {
        return this.keySize_;
    }

    /* JADX INFO: renamed from: C */
    public final C36429t m116570C() {
        C36429t c36429t = this.params_;
        return c36429t == null ? C36429t.m116616E() : c36429t;
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"bitField0_", "params_", "keySize_", "version_"});
            case 3:
                return new C36417r();
            case 4:
                return new C36411q(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36417r.class) {
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
