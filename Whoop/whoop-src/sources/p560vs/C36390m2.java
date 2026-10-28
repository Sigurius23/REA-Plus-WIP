package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5143h;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.m2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36390m2 extends AbstractC5184x {
    private static final C36390m2 DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile InterfaceC5181v0 PARSER = null;
    public static final int SALT_FIELD_NUMBER = 2;
    private int hash_;
    private AbstractC5146i salt_ = AbstractC5146i.f21514x;

    static {
        C36390m2 c36390m2 = new C36390m2();
        DEFAULT_INSTANCE = c36390m2;
        AbstractC5184x.m16359w(C36390m2.class, c36390m2);
    }

    /* JADX INFO: renamed from: A */
    public static void m116423A(C36390m2 c36390m2, C5143h c5143h) {
        c36390m2.getClass();
        c36390m2.salt_ = c5143h;
    }

    /* JADX INFO: renamed from: B */
    public static C36390m2 m116424B() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static C36384l2 m116425E() {
        return (C36384l2) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: z */
    public static void m116426z(C36390m2 c36390m2, EnumC36354g2 enumC36354g2) {
        c36390m2.getClass();
        c36390m2.hash_ = enumC36354g2.m116264b();
    }

    /* JADX INFO: renamed from: C */
    public final EnumC36354g2 m116427C() {
        EnumC36354g2 enumC36354g2M116263a = EnumC36354g2.m116263a(this.hash_);
        return enumC36354g2M116263a == null ? EnumC36354g2.UNRECOGNIZED : enumC36354g2M116263a;
    }

    /* JADX INFO: renamed from: D */
    public final AbstractC5146i m116428D() {
        return this.salt_;
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\n", new Object[]{"hash_", "salt_"});
            case 3:
                return new C36390m2();
            case 4:
                return new C36384l2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36390m2.class) {
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
