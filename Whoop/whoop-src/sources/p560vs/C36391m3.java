package p560vs;

import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.AbstractC5184x;
import com.google.crypto.tink.shaded.protobuf.C5182w;
import com.google.crypto.tink.shaded.protobuf.C5189z0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC5181v0;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: vs.m3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C36391m3 extends AbstractC5184x {
    private static final C36391m3 DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile InterfaceC5181v0 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private AbstractC5146i value_ = AbstractC5146i.f21514x;

    static {
        C36391m3 c36391m3 = new C36391m3();
        DEFAULT_INSTANCE = c36391m3;
        AbstractC5184x.m16359w(C36391m3.class, c36391m3);
    }

    /* JADX INFO: renamed from: A */
    public static void m116429A(C36391m3 c36391m3, AbstractC5146i abstractC5146i) {
        c36391m3.getClass();
        abstractC5146i.getClass();
        c36391m3.value_ = abstractC5146i;
    }

    /* JADX INFO: renamed from: B */
    public static void m116430B(C36391m3 c36391m3, EnumC36385l3 enumC36385l3) {
        c36391m3.getClass();
        if (enumC36385l3 != EnumC36385l3.UNRECOGNIZED) {
            c36391m3.keyMaterialType_ = enumC36385l3.f155765w;
        } else {
            enumC36385l3.getClass();
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: renamed from: C */
    public static C36391m3 m116431C() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static C36379k3 m116432G() {
        return (C36379k3) DEFAULT_INSTANCE.m16360i();
    }

    /* JADX INFO: renamed from: z */
    public static void m116433z(C36391m3 c36391m3, String str) {
        c36391m3.getClass();
        str.getClass();
        c36391m3.typeUrl_ = str;
    }

    /* JADX INFO: renamed from: D */
    public final EnumC36385l3 m116434D() {
        EnumC36385l3 enumC36385l3;
        int i13 = this.keyMaterialType_;
        if (i13 == 0) {
            enumC36385l3 = EnumC36385l3.UNKNOWN_KEYMATERIAL;
        } else if (i13 == 1) {
            enumC36385l3 = EnumC36385l3.SYMMETRIC;
        } else if (i13 == 2) {
            enumC36385l3 = EnumC36385l3.ASYMMETRIC_PRIVATE;
        } else if (i13 != 3) {
            enumC36385l3 = i13 != 4 ? null : EnumC36385l3.REMOTE;
        } else {
            enumC36385l3 = EnumC36385l3.ASYMMETRIC_PUBLIC;
        }
        return enumC36385l3 == null ? EnumC36385l3.UNRECOGNIZED : enumC36385l3;
    }

    /* JADX INFO: renamed from: E */
    public final String m116435E() {
        return this.typeUrl_;
    }

    /* JADX INFO: renamed from: F */
    public final AbstractC5146i m116436F() {
        return this.value_;
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
                return new C5189z0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new C36391m3();
            case 4:
                return new C36379k3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5181v0 interfaceC5181v0 = PARSER;
                if (interfaceC5181v0 != null) {
                    return interfaceC5181v0;
                }
                synchronized (C36391m3.class) {
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
