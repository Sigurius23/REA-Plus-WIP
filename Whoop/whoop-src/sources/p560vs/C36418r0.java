package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5143h;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C36418r0 extends AbstractC5184x {
    private static final C36418r0 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile InterfaceC5181v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC5146i keyValue_ = AbstractC5146i.f21514x;
    private int version_;

    static {
        C36418r0 c36418r0 = new C36418r0();
        DEFAULT_INSTANCE = c36418r0;
        AbstractC5184x.m16359w(C36418r0.class, c36418r0);
    }

    /* JADX INFO: renamed from: A */
    public static void m116571A(C36418r0 c36418r0, C5143h c5143h) {
        c36418r0.getClass();
        c36418r0.keyValue_ = c5143h;
    }

    /* JADX INFO: renamed from: D */
    public static C36412q0 m116572D() {
        return (C36412q0) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: E */
    public static C36418r0 m116573E(AbstractC5146i abstractC5146i, C5167p c5167p) {
        return (C36418r0) AbstractC5184x.m16356t(DEFAULT_INSTANCE, abstractC5146i, c5167p);
    }

    /* JADX INFO: renamed from: F */
    public static InterfaceC5181v0 m116574F() {
        return DEFAULT_INSTANCE.m16363m();
    }

    /* JADX INFO: renamed from: B */
    public final AbstractC5146i m116576B() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: C */
    public final int m116577C() {
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new C36418r0();
            case 4:
                return new C36412q0();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36418r0.class) {
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
