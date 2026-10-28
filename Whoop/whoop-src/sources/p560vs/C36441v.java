package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5143h;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C36441v extends AbstractC5184x {
    private static final C36441v DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC5181v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private AbstractC5146i keyValue_ = AbstractC5146i.f21514x;
    private C36465z params_;
    private int version_;

    static {
        C36441v c36441v = new C36441v();
        DEFAULT_INSTANCE = c36441v;
        AbstractC5184x.m16359w(C36441v.class, c36441v);
    }

    /* JADX INFO: renamed from: A */
    public static void m116686A(C36441v c36441v, C5143h c5143h) {
        c36441v.getClass();
        c36441v.keyValue_ = c5143h;
    }

    /* JADX INFO: renamed from: B */
    public static C36441v m116687B() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static C36435u m116688F() {
        return (C36435u) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: z */
    public static void m116689z(C36441v c36441v, C36465z c36465z) {
        c36441v.getClass();
        c36441v.params_ = c36465z;
        c36441v.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: C */
    public final AbstractC5146i m116690C() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: D */
    public final C36465z m116691D() {
        C36465z c36465z = this.params_;
        return c36465z == null ? C36465z.m116812A() : c36465z;
    }

    /* JADX INFO: renamed from: E */
    public final int m116692E() {
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
                return new C36441v();
            case 4:
                return new C36435u(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36441v.class) {
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
