package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36346f0 extends AbstractC5184x {
    private static final C36346f0 DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile InterfaceC5181v0 PARSER;
    private int ivSize_;

    static {
        C36346f0 c36346f0 = new C36346f0();
        DEFAULT_INSTANCE = c36346f0;
        AbstractC5184x.m16359w(C36346f0.class, c36346f0);
    }

    /* JADX INFO: renamed from: A */
    public static C36346f0 m116230A() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static C36340e0 m116231C() {
        return (C36340e0) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: z */
    public static void m116232z(C36346f0 c36346f0, int i13) {
        c36346f0.ivSize_ = i13;
    }

    /* JADX INFO: renamed from: B */
    public final int m116233B() {
        return this.ivSize_;
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 3:
                return new C36346f0();
            case 4:
                return new C36340e0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36346f0.class) {
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
