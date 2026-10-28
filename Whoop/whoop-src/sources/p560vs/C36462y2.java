package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.y2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36462y2 extends AbstractC5184x {
    private static final C36462y2 DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile InterfaceC5181v0 PARSER;
    private int hash_;

    static {
        C36462y2 c36462y2 = new C36462y2();
        DEFAULT_INSTANCE = c36462y2;
        AbstractC5184x.m16359w(C36462y2.class, c36462y2);
    }

    /* JADX INFO: renamed from: A */
    public static C36462y2 m116791A() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static C36456x2 m116792C() {
        return (C36456x2) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: z */
    public static void m116793z(C36462y2 c36462y2, EnumC36354g2 enumC36354g2) {
        c36462y2.getClass();
        c36462y2.hash_ = enumC36354g2.m116264b();
    }

    /* JADX INFO: renamed from: B */
    public final EnumC36354g2 m116794B() {
        EnumC36354g2 enumC36354g2M116263a = EnumC36354g2.m116263a(this.hash_);
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"hash_"});
            case 3:
                return new C36462y2();
            case 4:
                return new C36456x2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36462y2.class) {
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
