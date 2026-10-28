package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.e1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36341e1 extends AbstractC5184x {
    private static final C36341e1 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC5181v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int bitField0_;
    private C36353g1 params_;
    private int version_;

    static {
        C36341e1 c36341e1 = new C36341e1();
        DEFAULT_INSTANCE = c36341e1;
        AbstractC5184x.m16359w(C36341e1.class, c36341e1);
    }

    /* JADX INFO: renamed from: B */
    public static C36335d1 m116212B() {
        return (C36335d1) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: C */
    public static C36341e1 m116213C(AbstractC5146i abstractC5146i, C5167p c5167p) {
        return (C36341e1) AbstractC5184x.m16356t(DEFAULT_INSTANCE, abstractC5146i, c5167p);
    }

    /* JADX INFO: renamed from: z */
    public static void m116214z(C36341e1 c36341e1, C36353g1 c36353g1) {
        c36341e1.getClass();
        c36341e1.params_ = c36353g1;
        c36341e1.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: A */
    public final C36353g1 m116215A() {
        C36353g1 c36353g1 = this.params_;
        return c36353g1 == null ? C36353g1.m116257D() : c36353g1;
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003\u000b", new Object[]{"bitField0_", "params_", "version_"});
            case 3:
                return new C36341e1();
            case 4:
                return new C36335d1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36341e1.class) {
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
