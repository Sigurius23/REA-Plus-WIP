package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5125b;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5187y0;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5123a0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.y3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36463y3 extends AbstractC5184x {
    private static final C36463y3 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile InterfaceC5181v0 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private InterfaceC5123a0 keyInfo_ = C5187y0.f21598z;
    private int primaryKeyId_;

    static {
        C36463y3 c36463y3 = new C36463y3();
        DEFAULT_INSTANCE = c36463y3;
        AbstractC5184x.m16359w(C36463y3.class, c36463y3);
    }

    /* JADX INFO: renamed from: A */
    public static void m116795A(C36463y3 c36463y3, C36457x3 c36457x3) {
        c36463y3.getClass();
        InterfaceC5123a0 interfaceC5123a0 = c36463y3.keyInfo_;
        if (!((AbstractC5125b) interfaceC5123a0).f21478w) {
            int size = interfaceC5123a0.size();
            c36463y3.keyInfo_ = interfaceC5123a0.mo16111i(size == 0 ? 10 : size * 2);
        }
        c36463y3.keyInfo_.add(c36457x3);
    }

    /* JADX INFO: renamed from: C */
    public static C36445v3 m116796C() {
        return (C36445v3) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: z */
    public static void m116797z(C36463y3 c36463y3, int i13) {
        c36463y3.primaryKeyId_ = i13;
    }

    /* JADX INFO: renamed from: B */
    public final C36457x3 m116798B() {
        return (C36457x3) this.keyInfo_.get(0);
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", C36457x3.class});
            case 3:
                return new C36463y3();
            case 4:
                return new C36445v3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36463y3.class) {
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
