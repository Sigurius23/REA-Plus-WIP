package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5125b;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5152k;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5187y0;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5123a0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.ByteArrayInputStream;
import java.util.List;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.u3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36439u3 extends AbstractC5184x {
    private static final C36439u3 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile InterfaceC5181v0 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private InterfaceC5123a0 key_ = C5187y0.f21598z;
    private int primaryKeyId_;

    static {
        C36439u3 c36439u3 = new C36439u3();
        DEFAULT_INSTANCE = c36439u3;
        AbstractC5184x.m16359w(C36439u3.class, c36439u3);
    }

    /* JADX INFO: renamed from: A */
    public static void m116669A(C36439u3 c36439u3, C36433t3 c36433t3) {
        c36439u3.getClass();
        InterfaceC5123a0 interfaceC5123a0 = c36439u3.key_;
        if (!((AbstractC5125b) interfaceC5123a0).f21478w) {
            int size = interfaceC5123a0.size();
            c36439u3.key_ = interfaceC5123a0.mo16111i(size == 0 ? 10 : size * 2);
        }
        c36439u3.key_.add(c36433t3);
    }

    /* JADX INFO: renamed from: F */
    public static C36421r3 m116670F() {
        return (C36421r3) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: G */
    public static C36439u3 m116671G(ByteArrayInputStream byteArrayInputStream, C5167p c5167p) throws InvalidProtocolBufferException {
        AbstractC5184x abstractC5184xM16358v = AbstractC5184x.m16358v(DEFAULT_INSTANCE, new C5152k(byteArrayInputStream), c5167p);
        AbstractC5184x.m16352h(abstractC5184xM16358v);
        return (C36439u3) abstractC5184xM16358v;
    }

    /* JADX INFO: renamed from: H */
    public static C36439u3 m116672H(byte[] bArr, C5167p c5167p) {
        return (C36439u3) AbstractC5184x.m16357u(DEFAULT_INSTANCE, bArr, c5167p);
    }

    /* JADX INFO: renamed from: z */
    public static void m116673z(C36439u3 c36439u3, int i13) {
        c36439u3.primaryKeyId_ = i13;
    }

    /* JADX INFO: renamed from: B */
    public final C36433t3 m116674B(int i13) {
        return (C36433t3) this.key_.get(i13);
    }

    /* JADX INFO: renamed from: C */
    public final int m116675C() {
        return this.key_.size();
    }

    /* JADX INFO: renamed from: D */
    public final List m116676D() {
        return this.key_;
    }

    /* JADX INFO: renamed from: E */
    public final int m116677E() {
        return this.primaryKeyId_;
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", C36433t3.class});
            case 3:
                return new C36439u3();
            case 4:
                return new C36421r3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36439u3.class) {
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
