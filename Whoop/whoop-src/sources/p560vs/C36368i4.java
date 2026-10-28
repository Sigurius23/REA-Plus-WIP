package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5187y0;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5123a0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.i4 */
/* JADX INFO: loaded from: classes.dex */
public final class C36368i4 extends AbstractC5184x {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final C36368i4 DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile InterfaceC5181v0 PARSER;
    private String configName_ = "";
    private InterfaceC5123a0 entry_ = C5187y0.f21598z;

    static {
        C36368i4 c36368i4 = new C36368i4();
        DEFAULT_INSTANCE = c36368i4;
        AbstractC5184x.m16359w(C36368i4.class, c36368i4);
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", C36415q3.class});
            case 3:
                return new C36368i4();
            case 4:
                return new C36315a1();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36368i4.class) {
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
