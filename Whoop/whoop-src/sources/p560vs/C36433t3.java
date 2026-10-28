package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.t3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36433t3 extends AbstractC5184x {
    private static final C36433t3 DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile InterfaceC5181v0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int bitField0_;
    private C36391m3 keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        C36433t3 c36433t3 = new C36433t3();
        DEFAULT_INSTANCE = c36433t3;
        AbstractC5184x.m16359w(C36433t3.class, c36433t3);
    }

    /* JADX INFO: renamed from: A */
    public static void m116640A(C36433t3 c36433t3, EnumC36362h4 enumC36362h4) {
        c36433t3.getClass();
        c36433t3.outputPrefixType_ = enumC36362h4.m116306b();
    }

    /* JADX INFO: renamed from: B */
    public static void m116641B(C36433t3 c36433t3) {
        c36433t3.getClass();
        c36433t3.status_ = EnumC36397n3.ENABLED.m116460a();
    }

    /* JADX INFO: renamed from: C */
    public static void m116642C(C36433t3 c36433t3, int i13) {
        c36433t3.keyId_ = i13;
    }

    /* JADX INFO: renamed from: I */
    public static C36427s3 m116643I() {
        return (C36427s3) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: z */
    public static void m116644z(C36433t3 c36433t3, C36391m3 c36391m3) {
        c36433t3.getClass();
        c36433t3.keyData_ = c36391m3;
        c36433t3.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: D */
    public final C36391m3 m116645D() {
        C36391m3 c36391m3 = this.keyData_;
        return c36391m3 == null ? C36391m3.m116431C() : c36391m3;
    }

    /* JADX INFO: renamed from: E */
    public final int m116646E() {
        return this.keyId_;
    }

    /* JADX INFO: renamed from: F */
    public final EnumC36362h4 m116647F() {
        EnumC36362h4 enumC36362h4M116305a = EnumC36362h4.m116305a(this.outputPrefixType_);
        return enumC36362h4M116305a == null ? EnumC36362h4.UNRECOGNIZED : enumC36362h4M116305a;
    }

    /* JADX INFO: renamed from: G */
    public final EnumC36397n3 m116648G() {
        EnumC36397n3 enumC36397n3;
        int i13 = this.status_;
        if (i13 == 0) {
            enumC36397n3 = EnumC36397n3.UNKNOWN_STATUS;
        } else if (i13 == 1) {
            enumC36397n3 = EnumC36397n3.ENABLED;
        } else if (i13 != 2) {
            enumC36397n3 = i13 != 3 ? null : EnumC36397n3.DESTROYED;
        } else {
            enumC36397n3 = EnumC36397n3.DISABLED;
        }
        return enumC36397n3 == null ? EnumC36397n3.UNRECOGNIZED : enumC36397n3;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m116649H() {
        return (this.bitField0_ & 1) != 0;
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"bitField0_", "keyData_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new C36433t3();
            case 4:
                return new C36427s3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36433t3.class) {
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
