package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5143h;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.c2 */
/* JADX INFO: loaded from: classes.dex */
public final class C36330c2 extends AbstractC5184x {
    private static final C36330c2 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile InterfaceC5181v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC5146i keyValue_ = AbstractC5146i.f21514x;
    private int version_;

    static {
        C36330c2 c36330c2 = new C36330c2();
        DEFAULT_INSTANCE = c36330c2;
        AbstractC5184x.m16359w(C36330c2.class, c36330c2);
    }

    /* JADX INFO: renamed from: A */
    public static void m116176A(C36330c2 c36330c2, C5143h c5143h) {
        c36330c2.getClass();
        c36330c2.keyValue_ = c5143h;
    }

    /* JADX INFO: renamed from: B */
    public static C36330c2 m116177B() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static C36323b2 m116178E() {
        return (C36323b2) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: F */
    public static C36330c2 m116179F(AbstractC5146i abstractC5146i, C5167p c5167p) {
        return (C36330c2) AbstractC5184x.m16356t(DEFAULT_INSTANCE, abstractC5146i, c5167p);
    }

    /* JADX INFO: renamed from: G */
    public static InterfaceC5181v0 m116180G() {
        return DEFAULT_INSTANCE.m16363m();
    }

    /* JADX INFO: renamed from: C */
    public final AbstractC5146i m116182C() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: D */
    public final int m116183D() {
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new C36330c2();
            case 4:
                return new C36323b2();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36330c2.class) {
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
