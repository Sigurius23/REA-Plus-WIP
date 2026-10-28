package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C36465z extends AbstractC5184x {
    private static final C36465z DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile InterfaceC5181v0 PARSER;
    private int ivSize_;

    static {
        C36465z c36465z = new C36465z();
        DEFAULT_INSTANCE = c36465z;
        AbstractC5184x.m16359w(C36465z.class, c36465z);
    }

    /* JADX INFO: renamed from: A */
    public static C36465z m116812A() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static C36459y m116813C() {
        return (C36459y) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: z */
    public static void m116814z(C36465z c36465z, int i13) {
        c36465z.ivSize_ = i13;
    }

    /* JADX INFO: renamed from: B */
    public final int m116815B() {
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
                return new C36465z();
            case 4:
                return new C36459y(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36465z.class) {
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
