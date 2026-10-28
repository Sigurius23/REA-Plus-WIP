package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5143h;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.o4 */
/* JADX INFO: loaded from: classes.dex */
public final class C36404o4 extends AbstractC5184x {
    public static final int CRT_FIELD_NUMBER = 8;
    private static final C36404o4 DEFAULT_INSTANCE;
    public static final int DP_FIELD_NUMBER = 6;
    public static final int DQ_FIELD_NUMBER = 7;
    public static final int D_FIELD_NUMBER = 3;
    private static volatile InterfaceC5181v0 PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int P_FIELD_NUMBER = 4;
    public static final int Q_FIELD_NUMBER = 5;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private AbstractC5146i crt_;

    /* JADX INFO: renamed from: d_ */
    private AbstractC5146i f155773d_;
    private AbstractC5146i dp_;
    private AbstractC5146i dq_;

    /* JADX INFO: renamed from: p_ */
    private AbstractC5146i f155774p_;
    private C36416q4 publicKey_;

    /* JADX INFO: renamed from: q_ */
    private AbstractC5146i f155775q_;
    private int version_;

    static {
        C36404o4 c36404o4 = new C36404o4();
        DEFAULT_INSTANCE = c36404o4;
        AbstractC5184x.m16359w(C36404o4.class, c36404o4);
    }

    public C36404o4() {
        C5143h c5143h = AbstractC5146i.f21514x;
        this.f155773d_ = c5143h;
        this.f155774p_ = c5143h;
        this.f155775q_ = c5143h;
        this.dp_ = c5143h;
        this.dq_ = c5143h;
        this.crt_ = c5143h;
    }

    /* JADX INFO: renamed from: A */
    public static void m116486A(C36404o4 c36404o4) {
        c36404o4.version_ = 0;
    }

    /* JADX INFO: renamed from: B */
    public static void m116487B(C36404o4 c36404o4, C5143h c5143h) {
        c36404o4.getClass();
        c36404o4.f155775q_ = c5143h;
    }

    /* JADX INFO: renamed from: C */
    public static void m116488C(C36404o4 c36404o4, C5143h c5143h) {
        c36404o4.getClass();
        c36404o4.dp_ = c5143h;
    }

    /* JADX INFO: renamed from: D */
    public static void m116489D(C36404o4 c36404o4, C5143h c5143h) {
        c36404o4.getClass();
        c36404o4.dq_ = c5143h;
    }

    /* JADX INFO: renamed from: E */
    public static void m116490E(C36404o4 c36404o4, C5143h c5143h) {
        c36404o4.getClass();
        c36404o4.crt_ = c5143h;
    }

    /* JADX INFO: renamed from: F */
    public static void m116491F(C36404o4 c36404o4, C36416q4 c36416q4) {
        c36404o4.getClass();
        c36404o4.publicKey_ = c36416q4;
        c36404o4.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: G */
    public static void m116492G(C36404o4 c36404o4, C5143h c5143h) {
        c36404o4.getClass();
        c36404o4.f155773d_ = c5143h;
    }

    /* JADX INFO: renamed from: H */
    public static void m116493H(C36404o4 c36404o4, C5143h c5143h) {
        c36404o4.getClass();
        c36404o4.f155774p_ = c5143h;
    }

    /* JADX INFO: renamed from: Q */
    public static C36398n4 m116494Q() {
        return (C36398n4) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: R */
    public static C36404o4 m116495R(AbstractC5146i abstractC5146i, C5167p c5167p) {
        return (C36404o4) AbstractC5184x.m16356t(DEFAULT_INSTANCE, abstractC5146i, c5167p);
    }

    /* JADX INFO: renamed from: S */
    public static InterfaceC5181v0 m116496S() {
        return DEFAULT_INSTANCE.m16363m();
    }

    /* JADX INFO: renamed from: I */
    public final AbstractC5146i m116498I() {
        return this.crt_;
    }

    /* JADX INFO: renamed from: J */
    public final AbstractC5146i m116499J() {
        return this.f155773d_;
    }

    /* JADX INFO: renamed from: K */
    public final AbstractC5146i m116500K() {
        return this.dp_;
    }

    /* JADX INFO: renamed from: L */
    public final AbstractC5146i m116501L() {
        return this.dq_;
    }

    /* JADX INFO: renamed from: M */
    public final AbstractC5146i m116502M() {
        return this.f155774p_;
    }

    /* JADX INFO: renamed from: N */
    public final C36416q4 m116503N() {
        C36416q4 c36416q4 = this.publicKey_;
        return c36416q4 == null ? C36416q4.m116556D() : c36416q4;
    }

    /* JADX INFO: renamed from: O */
    public final AbstractC5146i m116504O() {
        return this.f155775q_;
    }

    /* JADX INFO: renamed from: P */
    public final int m116505P() {
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"bitField0_", "version_", "publicKey_", "d_", "p_", "q_", "dp_", "dq_", "crt_"});
            case 3:
                return new C36404o4();
            case 4:
                return new C36398n4();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36404o4.class) {
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
