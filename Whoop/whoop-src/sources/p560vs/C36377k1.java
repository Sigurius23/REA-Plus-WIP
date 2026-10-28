package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5143h;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.k1 */
/* JADX INFO: loaded from: classes.dex */
public final class C36377k1 extends AbstractC5184x {
    private static final C36377k1 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC5181v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int X_FIELD_NUMBER = 3;
    public static final int Y_FIELD_NUMBER = 4;
    private int bitField0_;
    private C36353g1 params_;
    private int version_;

    /* JADX INFO: renamed from: x_ */
    private AbstractC5146i f155750x_;

    /* JADX INFO: renamed from: y_ */
    private AbstractC5146i f155751y_;

    static {
        C36377k1 c36377k1 = new C36377k1();
        DEFAULT_INSTANCE = c36377k1;
        AbstractC5184x.m16359w(C36377k1.class, c36377k1);
    }

    public C36377k1() {
        C5143h c5143h = AbstractC5146i.f21514x;
        this.f155750x_ = c5143h;
        this.f155751y_ = c5143h;
    }

    /* JADX INFO: renamed from: A */
    public static void m116368A(C36377k1 c36377k1, C36353g1 c36353g1) {
        c36377k1.getClass();
        c36377k1.params_ = c36353g1;
        c36377k1.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: B */
    public static void m116369B(C36377k1 c36377k1, C5143h c5143h) {
        c36377k1.getClass();
        c36377k1.f155750x_ = c5143h;
    }

    /* JADX INFO: renamed from: C */
    public static void m116370C(C36377k1 c36377k1, C5143h c5143h) {
        c36377k1.getClass();
        c36377k1.f155751y_ = c5143h;
    }

    /* JADX INFO: renamed from: D */
    public static C36377k1 m116371D() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static C36371j1 m116372I() {
        return (C36371j1) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: J */
    public static C36377k1 m116373J(AbstractC5146i abstractC5146i, C5167p c5167p) {
        return (C36377k1) AbstractC5184x.m16356t(DEFAULT_INSTANCE, abstractC5146i, c5167p);
    }

    /* JADX INFO: renamed from: K */
    public static InterfaceC5181v0 m116374K() {
        return DEFAULT_INSTANCE.m16363m();
    }

    /* JADX INFO: renamed from: E */
    public final C36353g1 m116376E() {
        C36353g1 c36353g1 = this.params_;
        return c36353g1 == null ? C36353g1.m116257D() : c36353g1;
    }

    /* JADX INFO: renamed from: F */
    public final int m116377F() {
        return this.version_;
    }

    /* JADX INFO: renamed from: G */
    public final AbstractC5146i m116378G() {
        return this.f155750x_;
    }

    /* JADX INFO: renamed from: H */
    public final AbstractC5146i m116379H() {
        return this.f155751y_;
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
                return new C36377k1();
            case 4:
                return new C36371j1();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36377k1.class) {
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
