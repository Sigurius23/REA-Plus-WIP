package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.l */
/* JADX INFO: loaded from: classes.dex */
public final class C36381l extends AbstractC5184x {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final C36381l DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile InterfaceC5181v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C36441v aesCtrKey_;
    private int bitField0_;
    private C36402o2 hmacKey_;
    private int version_;

    static {
        C36381l c36381l = new C36381l();
        DEFAULT_INSTANCE = c36381l;
        AbstractC5184x.m16359w(C36381l.class, c36381l);
    }

    /* JADX INFO: renamed from: A */
    public static void m116398A(C36381l c36381l, C36441v c36441v) {
        c36381l.getClass();
        c36381l.aesCtrKey_ = c36441v;
        c36381l.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: B */
    public static void m116399B(C36381l c36381l, C36402o2 c36402o2) {
        c36381l.getClass();
        c36381l.hmacKey_ = c36402o2;
        c36381l.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: F */
    public static C36375k m116400F() {
        return (C36375k) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: G */
    public static C36381l m116401G(AbstractC5146i abstractC5146i, C5167p c5167p) {
        return (C36381l) AbstractC5184x.m16356t(DEFAULT_INSTANCE, abstractC5146i, c5167p);
    }

    /* JADX INFO: renamed from: H */
    public static InterfaceC5181v0 m116402H() {
        return DEFAULT_INSTANCE.m16363m();
    }

    /* JADX INFO: renamed from: C */
    public final C36441v m116404C() {
        C36441v c36441v = this.aesCtrKey_;
        return c36441v == null ? C36441v.m116687B() : c36441v;
    }

    /* JADX INFO: renamed from: D */
    public final C36402o2 m116405D() {
        C36402o2 c36402o2 = this.hmacKey_;
        return c36402o2 == null ? C36402o2.m116475C() : c36402o2;
    }

    /* JADX INFO: renamed from: E */
    public final int m116406E() {
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "version_", "aesCtrKey_", "hmacKey_"});
            case 3:
                return new C36381l();
            case 4:
                return new C36375k();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36381l.class) {
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
