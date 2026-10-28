package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36370j0 extends AbstractC5184x {
    private static final C36370j0 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC5181v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int bitField0_;
    private int keySize_;
    private C36382l0 params_;
    private int version_;

    static {
        C36370j0 c36370j0 = new C36370j0();
        DEFAULT_INSTANCE = c36370j0;
        AbstractC5184x.m16359w(C36370j0.class, c36370j0);
    }

    /* JADX INFO: renamed from: A */
    public static void m116337A(C36370j0 c36370j0, int i13) {
        c36370j0.keySize_ = i13;
    }

    /* JADX INFO: renamed from: E */
    public static C36364i0 m116338E() {
        return (C36364i0) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: F */
    public static C36370j0 m116339F(AbstractC5146i abstractC5146i, C5167p c5167p) {
        return (C36370j0) AbstractC5184x.m16356t(DEFAULT_INSTANCE, abstractC5146i, c5167p);
    }

    /* JADX INFO: renamed from: z */
    public static void m116340z(C36370j0 c36370j0, C36382l0 c36382l0) {
        c36370j0.getClass();
        c36370j0.params_ = c36382l0;
        c36370j0.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: B */
    public final int m116341B() {
        return this.keySize_;
    }

    /* JADX INFO: renamed from: C */
    public final C36382l0 m116342C() {
        C36382l0 c36382l0 = this.params_;
        return c36382l0 == null ? C36382l0.m116409D() : c36382l0;
    }

    /* JADX INFO: renamed from: D */
    public final int m116343D() {
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"bitField0_", "params_", "keySize_", "version_"});
            case 3:
                return new C36370j0();
            case 4:
                return new C36364i0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36370j0.class) {
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
