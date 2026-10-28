package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.u4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36440u4 extends AbstractC5184x {
    private static final C36440u4 DEFAULT_INSTANCE;
    public static final int MGF1_HASH_FIELD_NUMBER = 2;
    private static volatile InterfaceC5181v0 PARSER = null;
    public static final int SALT_LENGTH_FIELD_NUMBER = 3;
    public static final int SIG_HASH_FIELD_NUMBER = 1;
    private int mgf1Hash_;
    private int saltLength_;
    private int sigHash_;

    static {
        C36440u4 c36440u4 = new C36440u4();
        DEFAULT_INSTANCE = c36440u4;
        AbstractC5184x.m16359w(C36440u4.class, c36440u4);
    }

    /* JADX INFO: renamed from: A */
    public static void m116678A(C36440u4 c36440u4, EnumC36354g2 enumC36354g2) {
        c36440u4.getClass();
        c36440u4.mgf1Hash_ = enumC36354g2.m116264b();
    }

    /* JADX INFO: renamed from: B */
    public static void m116679B(C36440u4 c36440u4, int i13) {
        c36440u4.saltLength_ = i13;
    }

    /* JADX INFO: renamed from: C */
    public static C36440u4 m116680C() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static C36434t4 m116681G() {
        return (C36434t4) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: z */
    public static void m116682z(C36440u4 c36440u4, EnumC36354g2 enumC36354g2) {
        c36440u4.getClass();
        c36440u4.sigHash_ = enumC36354g2.m116264b();
    }

    /* JADX INFO: renamed from: D */
    public final EnumC36354g2 m116683D() {
        EnumC36354g2 enumC36354g2M116263a = EnumC36354g2.m116263a(this.mgf1Hash_);
        return enumC36354g2M116263a == null ? EnumC36354g2.UNRECOGNIZED : enumC36354g2M116263a;
    }

    /* JADX INFO: renamed from: E */
    public final int m116684E() {
        return this.saltLength_;
    }

    /* JADX INFO: renamed from: F */
    public final EnumC36354g2 m116685F() {
        EnumC36354g2 enumC36354g2M116263a = EnumC36354g2.m116263a(this.sigHash_);
        return enumC36354g2M116263a == null ? EnumC36354g2.UNRECOGNIZED : enumC36354g2M116263a;
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"sigHash_", "mgf1Hash_", "saltLength_"});
            case 3:
                return new C36440u4();
            case 4:
                return new C36434t4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36440u4.class) {
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
