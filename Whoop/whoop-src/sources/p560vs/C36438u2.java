package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5143h;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.u2 */
/* JADX INFO: loaded from: classes.dex */
public final class C36438u2 extends AbstractC5184x {
    private static final C36438u2 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC5181v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private AbstractC5146i keyValue_ = AbstractC5146i.f21514x;
    private C36462y2 params_;
    private int version_;

    static {
        C36438u2 c36438u2 = new C36438u2();
        DEFAULT_INSTANCE = c36438u2;
        AbstractC5184x.m16359w(C36438u2.class, c36438u2);
    }

    /* JADX INFO: renamed from: A */
    public static void m116660A(C36438u2 c36438u2, C36462y2 c36462y2) {
        c36438u2.getClass();
        c36438u2.params_ = c36462y2;
        c36438u2.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: B */
    public static void m116661B(C36438u2 c36438u2, C5143h c5143h) {
        c36438u2.getClass();
        c36438u2.keyValue_ = c5143h;
    }

    /* JADX INFO: renamed from: F */
    public static C36432t2 m116662F() {
        return (C36432t2) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: G */
    public static C36438u2 m116663G(AbstractC5146i abstractC5146i, C5167p c5167p) {
        return (C36438u2) AbstractC5184x.m16356t(DEFAULT_INSTANCE, abstractC5146i, c5167p);
    }

    /* JADX INFO: renamed from: H */
    public static InterfaceC5181v0 m116664H() {
        return DEFAULT_INSTANCE.m16363m();
    }

    /* JADX INFO: renamed from: C */
    public final AbstractC5146i m116666C() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: D */
    public final C36462y2 m116667D() {
        C36462y2 c36462y2 = this.params_;
        return c36462y2 == null ? C36462y2.m116791A() : c36462y2;
    }

    /* JADX INFO: renamed from: E */
    public final int m116668E() {
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
            case 3:
                return new C36438u2();
            case 4:
                return new C36432t2();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36438u2.class) {
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
