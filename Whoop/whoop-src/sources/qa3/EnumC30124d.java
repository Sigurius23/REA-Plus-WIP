package qa3;

import wa3.InterfaceC37014q;

/* JADX INFO: renamed from: qa3.d */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC30124d implements InterfaceC37014q {
    BYTE(0),
    CHAR(1),
    SHORT(2),
    INT(3),
    LONG(4),
    FLOAT(5),
    DOUBLE(6),
    BOOLEAN(7),
    STRING(8),
    CLASS(9),
    ENUM(10),
    ANNOTATION(11),
    ARRAY(12);


    /* JADX INFO: renamed from: w */
    public final int f123081w;

    EnumC30124d(int i13) {
        this.f123081w = i13;
    }

    /* JADX INFO: renamed from: b */
    public static EnumC30124d m92294b(int i13) {
        switch (i13) {
            case 0:
                return BYTE;
            case 1:
                return CHAR;
            case 2:
                return SHORT;
            case 3:
                return INT;
            case 4:
                return LONG;
            case 5:
                return FLOAT;
            case 6:
                return DOUBLE;
            case 7:
                return BOOLEAN;
            case 8:
                return STRING;
            case 9:
                return CLASS;
            case 10:
                return ENUM;
            case 11:
                return ANNOTATION;
            case 12:
                return ARRAY;
            default:
                return null;
        }
    }

    @Override // wa3.InterfaceC37014q
    /* JADX INFO: renamed from: a */
    public final int mo92274a() {
        return this.f123081w;
    }
}
