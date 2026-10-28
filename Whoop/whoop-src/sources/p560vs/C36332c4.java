package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.c4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36332c4 extends AbstractC5184x {
    private static final C36332c4 DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile InterfaceC5181v0 PARSER;
    private String keyUri_ = "";

    static {
        C36332c4 c36332c4 = new C36332c4();
        DEFAULT_INSTANCE = c36332c4;
        AbstractC5184x.m16359w(C36332c4.class, c36332c4);
    }

    /* JADX INFO: renamed from: A */
    public static C36332c4 m116185A() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static C36325b4 m116186C() {
        return (C36325b4) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: D */
    public static C36332c4 m116187D(AbstractC5146i abstractC5146i, C5167p c5167p) {
        return (C36332c4) AbstractC5184x.m16356t(DEFAULT_INSTANCE, abstractC5146i, c5167p);
    }

    /* JADX INFO: renamed from: z */
    public static void m116188z(C36332c4 c36332c4, String str) {
        c36332c4.getClass();
        str.getClass();
        c36332c4.keyUri_ = str;
    }

    /* JADX INFO: renamed from: B */
    public final String m116189B() {
        return this.keyUri_;
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
            case 3:
                return new C36332c4();
            case 4:
                return new C36325b4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36332c4.class) {
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
