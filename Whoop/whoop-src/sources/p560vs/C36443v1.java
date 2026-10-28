package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5143h;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.v1 */
/* JADX INFO: loaded from: classes.dex */
public final class C36443v1 extends AbstractC5184x {
    private static final C36443v1 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC5181v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int X_FIELD_NUMBER = 3;
    public static final int Y_FIELD_NUMBER = 4;
    private int bitField0_;
    private C36419r1 params_;
    private int version_;

    /* JADX INFO: renamed from: x_ */
    private AbstractC5146i f155778x_;

    /* JADX INFO: renamed from: y_ */
    private AbstractC5146i f155779y_;

    static {
        C36443v1 c36443v1 = new C36443v1();
        DEFAULT_INSTANCE = c36443v1;
        AbstractC5184x.m16359w(C36443v1.class, c36443v1);
    }

    public C36443v1() {
        C5143h c5143h = AbstractC5146i.f21514x;
        this.f155778x_ = c5143h;
        this.f155779y_ = c5143h;
    }

    /* JADX INFO: renamed from: A */
    public static void m116700A(C36443v1 c36443v1) {
        c36443v1.version_ = 0;
    }

    /* JADX INFO: renamed from: B */
    public static void m116701B(C36443v1 c36443v1, C36419r1 c36419r1) {
        c36443v1.getClass();
        c36443v1.params_ = c36419r1;
        c36443v1.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: C */
    public static void m116702C(C36443v1 c36443v1, C5143h c5143h) {
        c36443v1.getClass();
        c36443v1.f155778x_ = c5143h;
    }

    /* JADX INFO: renamed from: D */
    public static void m116703D(C36443v1 c36443v1, AbstractC5146i abstractC5146i) {
        c36443v1.getClass();
        abstractC5146i.getClass();
        c36443v1.f155779y_ = abstractC5146i;
    }

    /* JADX INFO: renamed from: E */
    public static C36443v1 m116704E() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public static C36437u1 m116705J() {
        return (C36437u1) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: K */
    public static C36443v1 m116706K(AbstractC5146i abstractC5146i, C5167p c5167p) {
        return (C36443v1) AbstractC5184x.m16356t(DEFAULT_INSTANCE, abstractC5146i, c5167p);
    }

    /* JADX INFO: renamed from: L */
    public static InterfaceC5181v0 m116707L() {
        return DEFAULT_INSTANCE.m16363m();
    }

    /* JADX INFO: renamed from: F */
    public final C36419r1 m116709F() {
        C36419r1 c36419r1 = this.params_;
        return c36419r1 == null ? C36419r1.m116580C() : c36419r1;
    }

    /* JADX INFO: renamed from: G */
    public final int m116710G() {
        return this.version_;
    }

    /* JADX INFO: renamed from: H */
    public final AbstractC5146i m116711H() {
        return this.f155778x_;
    }

    /* JADX INFO: renamed from: I */
    public final AbstractC5146i m116712I() {
        return this.f155779y_;
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"bitField0_", "version_", "params_", "x_", "y_"});
            case 3:
                return new C36443v1();
            case 4:
                return new C36437u1();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36443v1.class) {
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
