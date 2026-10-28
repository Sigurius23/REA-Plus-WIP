package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5143h;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.o2 */
/* JADX INFO: loaded from: classes.dex */
public final class C36402o2 extends AbstractC5184x {
    private static final C36402o2 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC5181v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private AbstractC5146i keyValue_ = AbstractC5146i.f21514x;
    private C36426s2 params_;
    private int version_;

    static {
        C36402o2 c36402o2 = new C36402o2();
        DEFAULT_INSTANCE = c36402o2;
        AbstractC5184x.m16359w(C36402o2.class, c36402o2);
    }

    /* JADX INFO: renamed from: A */
    public static void m116473A(C36402o2 c36402o2, C36426s2 c36426s2) {
        c36402o2.getClass();
        c36402o2.params_ = c36426s2;
        c36402o2.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: B */
    public static void m116474B(C36402o2 c36402o2, C5143h c5143h) {
        c36402o2.getClass();
        c36402o2.keyValue_ = c5143h;
    }

    /* JADX INFO: renamed from: C */
    public static C36402o2 m116475C() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static C36396n2 m116476G() {
        return (C36396n2) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: H */
    public static C36402o2 m116477H(AbstractC5146i abstractC5146i, C5167p c5167p) {
        return (C36402o2) AbstractC5184x.m16356t(DEFAULT_INSTANCE, abstractC5146i, c5167p);
    }

    /* JADX INFO: renamed from: I */
    public static InterfaceC5181v0 m116478I() {
        return DEFAULT_INSTANCE.m16363m();
    }

    /* JADX INFO: renamed from: D */
    public final AbstractC5146i m116480D() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: E */
    public final C36426s2 m116481E() {
        C36426s2 c36426s2 = this.params_;
        return c36426s2 == null ? C36426s2.m116600B() : c36426s2;
    }

    /* JADX INFO: renamed from: F */
    public final int m116482F() {
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
            case 3:
                return new C36402o2();
            case 4:
                return new C36396n2();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36402o2.class) {
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
