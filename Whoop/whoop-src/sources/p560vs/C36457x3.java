package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.x3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36457x3 extends AbstractC5184x {
    private static final C36457x3 DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile InterfaceC5181v0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        C36457x3 c36457x3 = new C36457x3();
        DEFAULT_INSTANCE = c36457x3;
        AbstractC5184x.m16359w(C36457x3.class, c36457x3);
    }

    /* JADX INFO: renamed from: A */
    public static void m116776A(C36457x3 c36457x3, EnumC36362h4 enumC36362h4) {
        c36457x3.getClass();
        c36457x3.outputPrefixType_ = enumC36362h4.m116306b();
    }

    /* JADX INFO: renamed from: B */
    public static void m116777B(C36457x3 c36457x3, EnumC36397n3 enumC36397n3) {
        c36457x3.getClass();
        c36457x3.status_ = enumC36397n3.m116460a();
    }

    /* JADX INFO: renamed from: C */
    public static void m116778C(C36457x3 c36457x3, int i13) {
        c36457x3.keyId_ = i13;
    }

    /* JADX INFO: renamed from: E */
    public static C36451w3 m116779E() {
        return (C36451w3) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: z */
    public static void m116780z(C36457x3 c36457x3, String str) {
        c36457x3.getClass();
        str.getClass();
        c36457x3.typeUrl_ = str;
    }

    /* JADX INFO: renamed from: D */
    public final int m116781D() {
        return this.keyId_;
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new C36457x3();
            case 4:
                return new C36451w3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36457x3.class) {
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
