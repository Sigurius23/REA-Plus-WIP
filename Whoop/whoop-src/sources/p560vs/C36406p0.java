package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.p0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36406p0 extends AbstractC5184x {
    private static final C36406p0 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile InterfaceC5181v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private int version_;

    static {
        C36406p0 c36406p0 = new C36406p0();
        DEFAULT_INSTANCE = c36406p0;
        AbstractC5184x.m16359w(C36406p0.class, c36406p0);
    }

    /* JADX INFO: renamed from: C */
    public static C36400o0 m116515C() {
        return (C36400o0) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: D */
    public static C36406p0 m116516D(AbstractC5146i abstractC5146i, C5167p c5167p) {
        return (C36406p0) AbstractC5184x.m16356t(DEFAULT_INSTANCE, abstractC5146i, c5167p);
    }

    /* JADX INFO: renamed from: z */
    public static void m116517z(C36406p0 c36406p0, int i13) {
        c36406p0.keySize_ = i13;
    }

    /* JADX INFO: renamed from: A */
    public final int m116518A() {
        return this.keySize_;
    }

    /* JADX INFO: renamed from: B */
    public final int m116519B() {
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"keySize_", "version_"});
            case 3:
                return new C36406p0();
            case 4:
                return new C36400o0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36406p0.class) {
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
