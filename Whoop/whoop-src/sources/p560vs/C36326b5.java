package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.b5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36326b5 extends AbstractC5184x {
    private static final C36326b5 DEFAULT_INSTANCE;
    private static volatile InterfaceC5181v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;

    static {
        C36326b5 c36326b5 = new C36326b5();
        DEFAULT_INSTANCE = c36326b5;
        AbstractC5184x.m16359w(C36326b5.class, c36326b5);
    }

    /* JADX INFO: renamed from: B */
    public static C36326b5 m116169B(AbstractC5146i abstractC5146i, C5167p c5167p) {
        return (C36326b5) AbstractC5184x.m16356t(DEFAULT_INSTANCE, abstractC5146i, c5167p);
    }

    /* JADX INFO: renamed from: z */
    public static C36326b5 m116170z() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final int m116171A() {
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"version_"});
            case 3:
                return new C36326b5();
            case 4:
                return new C36315a1(DEFAULT_INSTANCE, 4);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36326b5.class) {
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
