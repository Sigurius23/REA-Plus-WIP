package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5143h;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.i2 */
/* JADX INFO: loaded from: classes.dex */
public final class C36366i2 extends AbstractC5184x {
    private static final C36366i2 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC5181v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private AbstractC5146i keyValue_ = AbstractC5146i.f21514x;
    private C36390m2 params_;
    private int version_;

    static {
        C36366i2 c36366i2 = new C36366i2();
        DEFAULT_INSTANCE = c36366i2;
        AbstractC5184x.m16359w(C36366i2.class, c36366i2);
    }

    /* JADX INFO: renamed from: A */
    public static void m116319A(C36366i2 c36366i2, C36390m2 c36390m2) {
        c36366i2.getClass();
        c36366i2.params_ = c36390m2;
        c36366i2.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: B */
    public static void m116320B(C36366i2 c36366i2, C5143h c5143h) {
        c36366i2.getClass();
        c36366i2.keyValue_ = c5143h;
    }

    /* JADX INFO: renamed from: F */
    public static C36360h2 m116321F() {
        return (C36360h2) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: G */
    public static C36366i2 m116322G(AbstractC5146i abstractC5146i, C5167p c5167p) {
        return (C36366i2) AbstractC5184x.m16356t(DEFAULT_INSTANCE, abstractC5146i, c5167p);
    }

    /* JADX INFO: renamed from: H */
    public static InterfaceC5181v0 m116323H() {
        return DEFAULT_INSTANCE.m16363m();
    }

    /* JADX INFO: renamed from: C */
    public final AbstractC5146i m116325C() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: D */
    public final C36390m2 m116326D() {
        C36390m2 c36390m2 = this.params_;
        return c36390m2 == null ? C36390m2.m116424B() : c36390m2;
    }

    /* JADX INFO: renamed from: E */
    public final int m116327E() {
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
                return new C36366i2();
            case 4:
                return new C36360h2();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36366i2.class) {
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
