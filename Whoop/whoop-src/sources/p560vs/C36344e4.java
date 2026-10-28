package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C36344e4 extends AbstractC5184x {
    private static final C36344e4 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC5181v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private C36356g4 params_;
    private int version_;

    static {
        C36344e4 c36344e4 = new C36344e4();
        DEFAULT_INSTANCE = c36344e4;
        AbstractC5184x.m16359w(C36344e4.class, c36344e4);
    }

    /* JADX INFO: renamed from: A */
    public static void m116219A(C36344e4 c36344e4, C36356g4 c36356g4) {
        c36344e4.getClass();
        c36344e4.params_ = c36356g4;
        c36344e4.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: D */
    public static C36338d4 m116220D() {
        return (C36338d4) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: E */
    public static C36344e4 m116221E(AbstractC5146i abstractC5146i, C5167p c5167p) {
        return (C36344e4) AbstractC5184x.m16356t(DEFAULT_INSTANCE, abstractC5146i, c5167p);
    }

    /* JADX INFO: renamed from: F */
    public static InterfaceC5181v0 m116222F() {
        return DEFAULT_INSTANCE.m16363m();
    }

    /* JADX INFO: renamed from: B */
    public final C36356g4 m116224B() {
        C36356g4 c36356g4 = this.params_;
        return c36356g4 == null ? C36356g4.m116269B() : c36356g4;
    }

    /* JADX INFO: renamed from: C */
    public final int m116225C() {
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "version_", "params_"});
            case 3:
                return new C36344e4();
            case 4:
                return new C36338d4();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36344e4.class) {
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
