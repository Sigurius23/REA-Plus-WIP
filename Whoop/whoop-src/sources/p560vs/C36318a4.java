package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.a4 */
/* JADX INFO: loaded from: classes.dex */
public final class C36318a4 extends AbstractC5184x {
    private static final C36318a4 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC5181v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private C36332c4 params_;
    private int version_;

    static {
        C36318a4 c36318a4 = new C36318a4();
        DEFAULT_INSTANCE = c36318a4;
        AbstractC5184x.m16359w(C36318a4.class, c36318a4);
    }

    /* JADX INFO: renamed from: A */
    public static void m116133A(C36318a4 c36318a4, C36332c4 c36332c4) {
        c36318a4.getClass();
        c36318a4.params_ = c36332c4;
        c36318a4.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: D */
    public static C36469z3 m116134D() {
        return (C36469z3) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: E */
    public static C36318a4 m116135E(AbstractC5146i abstractC5146i, C5167p c5167p) {
        return (C36318a4) AbstractC5184x.m16356t(DEFAULT_INSTANCE, abstractC5146i, c5167p);
    }

    /* JADX INFO: renamed from: F */
    public static InterfaceC5181v0 m116136F() {
        return DEFAULT_INSTANCE.m16363m();
    }

    /* JADX INFO: renamed from: B */
    public final C36332c4 m116138B() {
        C36332c4 c36332c4 = this.params_;
        return c36332c4 == null ? C36332c4.m116185A() : c36332c4;
    }

    /* JADX INFO: renamed from: C */
    public final int m116139C() {
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
                return new C36318a4();
            case 4:
                return new C36469z3();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36318a4.class) {
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
