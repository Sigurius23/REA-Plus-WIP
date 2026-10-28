package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5143h;
import com.google.crypto.tink.shaded.protobuf.C5152k;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.ByteArrayInputStream;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.f2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36348f2 extends AbstractC5184x {
    private static final C36348f2 DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile InterfaceC5181v0 PARSER;
    private int bitField0_;
    private AbstractC5146i encryptedKeyset_ = AbstractC5146i.f21514x;
    private C36463y3 keysetInfo_;

    static {
        C36348f2 c36348f2 = new C36348f2();
        DEFAULT_INSTANCE = c36348f2;
        AbstractC5184x.m16359w(C36348f2.class, c36348f2);
    }

    /* JADX INFO: renamed from: A */
    public static void m116237A(C36348f2 c36348f2, C36463y3 c36463y3) {
        c36348f2.getClass();
        c36348f2.keysetInfo_ = c36463y3;
        c36348f2.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: C */
    public static C36342e2 m116238C() {
        return (C36342e2) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: D */
    public static C36348f2 m116239D(ByteArrayInputStream byteArrayInputStream, C5167p c5167p) throws InvalidProtocolBufferException {
        AbstractC5184x abstractC5184xM16358v = AbstractC5184x.m16358v(DEFAULT_INSTANCE, new C5152k(byteArrayInputStream), c5167p);
        AbstractC5184x.m16352h(abstractC5184xM16358v);
        return (C36348f2) abstractC5184xM16358v;
    }

    /* JADX INFO: renamed from: z */
    public static void m116240z(C36348f2 c36348f2, C5143h c5143h) {
        c36348f2.getClass();
        c36348f2.encryptedKeyset_ = c5143h;
    }

    /* JADX INFO: renamed from: B */
    public final AbstractC5146i m116241B() {
        return this.encryptedKeyset_;
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"bitField0_", "encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new C36348f2();
            case 4:
                return new C36342e2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36348f2.class) {
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
