package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36334d0 extends AbstractC5184x {
    private static final C36334d0 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC5181v0 PARSER;
    private int bitField0_;
    private int keySize_;
    private C36346f0 params_;

    static {
        C36334d0 c36334d0 = new C36334d0();
        DEFAULT_INSTANCE = c36334d0;
        AbstractC5184x.m16359w(C36334d0.class, c36334d0);
    }

    /* JADX INFO: renamed from: A */
    public static void m116196A(C36334d0 c36334d0, int i13) {
        c36334d0.keySize_ = i13;
    }

    /* JADX INFO: renamed from: D */
    public static C36328c0 m116197D() {
        return (C36328c0) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: E */
    public static C36334d0 m116198E(AbstractC5146i abstractC5146i, C5167p c5167p) {
        return (C36334d0) AbstractC5184x.m16356t(DEFAULT_INSTANCE, abstractC5146i, c5167p);
    }

    /* JADX INFO: renamed from: z */
    public static void m116199z(C36334d0 c36334d0, C36346f0 c36346f0) {
        c36334d0.getClass();
        c36334d0.params_ = c36346f0;
        c36334d0.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: B */
    public final int m116200B() {
        return this.keySize_;
    }

    /* JADX INFO: renamed from: C */
    public final C36346f0 m116201C() {
        C36346f0 c36346f0 = this.params_;
        return c36346f0 == null ? C36346f0.m116230A() : c36346f0;
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
                return new C36334d0();
            case 4:
                return new C36328c0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36334d0.class) {
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
