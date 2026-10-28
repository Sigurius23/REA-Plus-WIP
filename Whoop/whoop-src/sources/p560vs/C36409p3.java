package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5180v;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.p3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36409p3 extends AbstractC5184x {
    private static final C36409p3 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile InterfaceC5181v0 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private AbstractC5146i value_ = AbstractC5146i.f21514x;

    static {
        C36409p3 c36409p3 = new C36409p3();
        DEFAULT_INSTANCE = c36409p3;
        AbstractC5184x.m16359w(C36409p3.class, c36409p3);
    }

    /* JADX INFO: renamed from: A */
    public static void m116526A(C36409p3 c36409p3, AbstractC5146i abstractC5146i) {
        c36409p3.getClass();
        abstractC5146i.getClass();
        c36409p3.value_ = abstractC5146i;
    }

    /* JADX INFO: renamed from: B */
    public static void m116527B(C36409p3 c36409p3, EnumC36362h4 enumC36362h4) {
        c36409p3.getClass();
        c36409p3.outputPrefixType_ = enumC36362h4.m116306b();
    }

    /* JADX INFO: renamed from: C */
    public static C36409p3 m116528C() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static C36403o3 m116529G() {
        return (C36403o3) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: H */
    public static C36403o3 m116530H(C36409p3 c36409p3) {
        AbstractC5180v abstractC5180vM16360i = DEFAULT_INSTANCE.m16360i();
        abstractC5180vM16360i.m16351f(c36409p3);
        return (C36403o3) abstractC5180vM16360i;
    }

    /* JADX INFO: renamed from: I */
    public static C36409p3 m116531I(byte[] bArr, C5167p c5167p) {
        return (C36409p3) AbstractC5184x.m16357u(DEFAULT_INSTANCE, bArr, c5167p);
    }

    /* JADX INFO: renamed from: z */
    public static void m116532z(C36409p3 c36409p3, String str) {
        c36409p3.getClass();
        str.getClass();
        c36409p3.typeUrl_ = str;
    }

    /* JADX INFO: renamed from: D */
    public final EnumC36362h4 m116533D() {
        EnumC36362h4 enumC36362h4M116305a = EnumC36362h4.m116305a(this.outputPrefixType_);
        return enumC36362h4M116305a == null ? EnumC36362h4.UNRECOGNIZED : enumC36362h4M116305a;
    }

    /* JADX INFO: renamed from: E */
    public final String m116534E() {
        return this.typeUrl_;
    }

    /* JADX INFO: renamed from: F */
    public final AbstractC5146i m116535F() {
        return this.value_;
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new C36409p3();
            case 4:
                return new C36403o3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36409p3.class) {
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
