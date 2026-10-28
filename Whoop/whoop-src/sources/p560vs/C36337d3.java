package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.d3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36337d3 extends AbstractC5184x {
    private static final C36337d3 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC5181v0 PARSER;
    private int bitField0_;
    private C36349f3 params_;

    static {
        C36337d3 c36337d3 = new C36337d3();
        DEFAULT_INSTANCE = c36337d3;
        AbstractC5184x.m16359w(C36337d3.class, c36337d3);
    }

    /* JADX INFO: renamed from: B */
    public static C36331c3 m116205B() {
        return (C36331c3) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: C */
    public static C36337d3 m116206C(AbstractC5146i abstractC5146i, C5167p c5167p) {
        return (C36337d3) AbstractC5184x.m16356t(DEFAULT_INSTANCE, abstractC5146i, c5167p);
    }

    /* JADX INFO: renamed from: z */
    public static void m116207z(C36337d3 c36337d3, C36349f3 c36349f3) {
        c36337d3.getClass();
        c36337d3.params_ = c36349f3;
        c36337d3.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: A */
    public final C36349f3 m116208A() {
        C36349f3 c36349f3 = this.params_;
        return c36349f3 == null ? C36349f3.m116244D() : c36349f3;
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "params_"});
            case 3:
                return new C36337d3();
            case 4:
                return new C36331c3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36337d3.class) {
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
