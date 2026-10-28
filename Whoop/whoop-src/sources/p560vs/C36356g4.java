package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.g4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36356g4 extends AbstractC5184x {
    private static final C36356g4 DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile InterfaceC5181v0 PARSER;
    private int bitField0_;
    private C36409p3 dekTemplate_;
    private String kekUri_ = "";

    static {
        C36356g4 c36356g4 = new C36356g4();
        DEFAULT_INSTANCE = c36356g4;
        AbstractC5184x.m16359w(C36356g4.class, c36356g4);
    }

    /* JADX INFO: renamed from: A */
    public static void m116268A(C36356g4 c36356g4, C36409p3 c36409p3) {
        c36356g4.getClass();
        c36356g4.dekTemplate_ = c36409p3;
        c36356g4.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: B */
    public static C36356g4 m116269B() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static C36350f4 m116270E() {
        return (C36350f4) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: F */
    public static C36356g4 m116271F(AbstractC5146i abstractC5146i, C5167p c5167p) {
        return (C36356g4) AbstractC5184x.m16356t(DEFAULT_INSTANCE, abstractC5146i, c5167p);
    }

    /* JADX INFO: renamed from: z */
    public static void m116272z(C36356g4 c36356g4, String str) {
        c36356g4.getClass();
        str.getClass();
        c36356g4.kekUri_ = str;
    }

    /* JADX INFO: renamed from: C */
    public final C36409p3 m116273C() {
        C36409p3 c36409p3 = this.dekTemplate_;
        return c36409p3 == null ? C36409p3.m116528C() : c36409p3;
    }

    /* JADX INFO: renamed from: D */
    public final String m116274D() {
        return this.kekUri_;
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "kekUri_", "dekTemplate_"});
            case 3:
                return new C36356g4();
            case 4:
                return new C36350f4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36356g4.class) {
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
