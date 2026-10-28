package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.n1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36395n1 extends AbstractC5184x {
    public static final int AEAD_DEM_FIELD_NUMBER = 2;
    private static final C36395n1 DEFAULT_INSTANCE;
    private static volatile InterfaceC5181v0 PARSER;
    private C36409p3 aeadDem_;
    private int bitField0_;

    static {
        C36395n1 c36395n1 = new C36395n1();
        DEFAULT_INSTANCE = c36395n1;
        AbstractC5184x.m16359w(C36395n1.class, c36395n1);
    }

    /* JADX INFO: renamed from: B */
    public static C36395n1 m116454B() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static C36389m1 m116455C() {
        return (C36389m1) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: z */
    public static void m116456z(C36395n1 c36395n1, C36409p3 c36409p3) {
        c36395n1.getClass();
        c36395n1.aeadDem_ = c36409p3;
        c36395n1.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: A */
    public final C36409p3 m116457A() {
        C36409p3 c36409p3 = this.aeadDem_;
        return c36409p3 == null ? C36409p3.m116528C() : c36409p3;
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"bitField0_", "aeadDem_"});
            case 3:
                return new C36395n1();
            case 4:
                return new C36389m1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36395n1.class) {
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
