package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5143h;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.y4 */
/* JADX INFO: loaded from: classes.dex */
public final class C36464y4 extends AbstractC5184x {
    private static final C36464y4 DEFAULT_INSTANCE;
    public static final int E_FIELD_NUMBER = 4;
    public static final int N_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC5181v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;

    /* JADX INFO: renamed from: e_ */
    private AbstractC5146i f155783e_;

    /* JADX INFO: renamed from: n_ */
    private AbstractC5146i f155784n_;
    private C36440u4 params_;
    private int version_;

    static {
        C36464y4 c36464y4 = new C36464y4();
        DEFAULT_INSTANCE = c36464y4;
        AbstractC5184x.m16359w(C36464y4.class, c36464y4);
    }

    public C36464y4() {
        C5143h c5143h = AbstractC5146i.f21514x;
        this.f155784n_ = c5143h;
        this.f155783e_ = c5143h;
    }

    /* JADX INFO: renamed from: A */
    public static void m116799A(C36464y4 c36464y4) {
        c36464y4.version_ = 0;
    }

    /* JADX INFO: renamed from: B */
    public static void m116800B(C36464y4 c36464y4, C36440u4 c36440u4) {
        c36464y4.getClass();
        c36464y4.params_ = c36440u4;
        c36464y4.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: C */
    public static void m116801C(C36464y4 c36464y4, C5143h c5143h) {
        c36464y4.getClass();
        c36464y4.f155784n_ = c5143h;
    }

    /* JADX INFO: renamed from: D */
    public static void m116802D(C36464y4 c36464y4, C5143h c5143h) {
        c36464y4.getClass();
        c36464y4.f155783e_ = c5143h;
    }

    /* JADX INFO: renamed from: E */
    public static C36464y4 m116803E() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public static C36458x4 m116804J() {
        return (C36458x4) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: K */
    public static C36464y4 m116805K(AbstractC5146i abstractC5146i, C5167p c5167p) {
        return (C36464y4) AbstractC5184x.m16356t(DEFAULT_INSTANCE, abstractC5146i, c5167p);
    }

    /* JADX INFO: renamed from: L */
    public static InterfaceC5181v0 m116806L() {
        return DEFAULT_INSTANCE.m16363m();
    }

    /* JADX INFO: renamed from: F */
    public final AbstractC5146i m116808F() {
        return this.f155783e_;
    }

    /* JADX INFO: renamed from: G */
    public final AbstractC5146i m116809G() {
        return this.f155784n_;
    }

    /* JADX INFO: renamed from: H */
    public final C36440u4 m116810H() {
        C36440u4 c36440u4 = this.params_;
        return c36440u4 == null ? C36440u4.m116680C() : c36440u4;
    }

    /* JADX INFO: renamed from: I */
    public final int m116811I() {
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"bitField0_", "version_", "params_", "n_", "e_"});
            case 3:
                return new C36464y4();
            case 4:
                return new C36458x4();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36464y4.class) {
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
