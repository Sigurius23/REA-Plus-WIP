package androidx.datastore.preferences.protobuf;

import p108e4.AbstractC12682p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1257u {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC1257u[] f5478E;

    /* JADX INFO: renamed from: x */
    public static final EnumC1257u f5479x;

    /* JADX INFO: renamed from: y */
    public static final EnumC1257u f5480y;

    /* JADX INFO: renamed from: z */
    public static final EnumC1257u[] f5481z;

    /* JADX INFO: renamed from: w */
    public final int f5482w;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1257u EF0;

    static {
        EnumC1207d0 enumC1207d0 = EnumC1207d0.DOUBLE;
        EnumC1257u enumC1257u = new EnumC1257u("DOUBLE", 0, 0, 1, enumC1207d0);
        EnumC1207d0 enumC1207d1 = EnumC1207d0.FLOAT;
        EnumC1257u enumC1257u2 = new EnumC1257u("FLOAT", 1, 1, 1, enumC1207d1);
        EnumC1207d0 enumC1207d2 = EnumC1207d0.LONG;
        EnumC1257u enumC1257u3 = new EnumC1257u("INT64", 2, 2, 1, enumC1207d2);
        EnumC1257u enumC1257u4 = new EnumC1257u("UINT64", 3, 3, 1, enumC1207d2);
        EnumC1207d0 enumC1207d3 = EnumC1207d0.INT;
        EnumC1257u enumC1257u5 = new EnumC1257u("INT32", 4, 4, 1, enumC1207d3);
        EnumC1257u enumC1257u6 = new EnumC1257u("FIXED64", 5, 5, 1, enumC1207d2);
        EnumC1257u enumC1257u7 = new EnumC1257u("FIXED32", 6, 6, 1, enumC1207d3);
        EnumC1207d0 enumC1207d4 = EnumC1207d0.BOOLEAN;
        EnumC1257u enumC1257u8 = new EnumC1257u("BOOL", 7, 7, 1, enumC1207d4);
        EnumC1207d0 enumC1207d5 = EnumC1207d0.STRING;
        EnumC1257u enumC1257u9 = new EnumC1257u("STRING", 8, 8, 1, enumC1207d5);
        EnumC1207d0 enumC1207d6 = EnumC1207d0.MESSAGE;
        EnumC1257u enumC1257u10 = new EnumC1257u("MESSAGE", 9, 9, 1, enumC1207d6);
        EnumC1207d0 enumC1207d7 = EnumC1207d0.BYTE_STRING;
        EnumC1257u enumC1257u11 = new EnumC1257u("BYTES", 10, 10, 1, enumC1207d7);
        EnumC1257u enumC1257u12 = new EnumC1257u("UINT32", 11, 11, 1, enumC1207d3);
        EnumC1207d0 enumC1207d8 = EnumC1207d0.ENUM;
        EnumC1257u enumC1257u13 = new EnumC1257u("ENUM", 12, 12, 1, enumC1207d8);
        EnumC1257u enumC1257u14 = new EnumC1257u("SFIXED32", 13, 13, 1, enumC1207d3);
        EnumC1257u enumC1257u15 = new EnumC1257u("SFIXED64", 14, 14, 1, enumC1207d2);
        EnumC1257u enumC1257u16 = new EnumC1257u("SINT32", 15, 15, 1, enumC1207d3);
        EnumC1257u enumC1257u17 = new EnumC1257u("SINT64", 16, 16, 1, enumC1207d2);
        EnumC1257u enumC1257u18 = new EnumC1257u("GROUP", 17, 17, 1, enumC1207d6);
        EnumC1257u enumC1257u19 = new EnumC1257u("DOUBLE_LIST", 18, 18, 2, enumC1207d0);
        EnumC1257u enumC1257u20 = new EnumC1257u("FLOAT_LIST", 19, 19, 2, enumC1207d1);
        EnumC1257u enumC1257u21 = new EnumC1257u("INT64_LIST", 20, 20, 2, enumC1207d2);
        EnumC1257u enumC1257u22 = new EnumC1257u("UINT64_LIST", 21, 21, 2, enumC1207d2);
        EnumC1257u enumC1257u23 = new EnumC1257u("INT32_LIST", 22, 22, 2, enumC1207d3);
        EnumC1257u enumC1257u24 = new EnumC1257u("FIXED64_LIST", 23, 23, 2, enumC1207d2);
        EnumC1257u enumC1257u25 = new EnumC1257u("FIXED32_LIST", 24, 24, 2, enumC1207d3);
        EnumC1257u enumC1257u26 = new EnumC1257u("BOOL_LIST", 25, 25, 2, enumC1207d4);
        EnumC1257u enumC1257u27 = new EnumC1257u("STRING_LIST", 26, 26, 2, enumC1207d5);
        EnumC1257u enumC1257u28 = new EnumC1257u("MESSAGE_LIST", 27, 27, 2, enumC1207d6);
        EnumC1257u enumC1257u29 = new EnumC1257u("BYTES_LIST", 28, 28, 2, enumC1207d7);
        EnumC1257u enumC1257u30 = new EnumC1257u("UINT32_LIST", 29, 29, 2, enumC1207d3);
        EnumC1257u enumC1257u31 = new EnumC1257u("ENUM_LIST", 30, 30, 2, enumC1207d8);
        EnumC1257u enumC1257u32 = new EnumC1257u("SFIXED32_LIST", 31, 31, 2, enumC1207d3);
        EnumC1257u enumC1257u33 = new EnumC1257u("SFIXED64_LIST", 32, 32, 2, enumC1207d2);
        EnumC1257u enumC1257u34 = new EnumC1257u("SINT32_LIST", 33, 33, 2, enumC1207d3);
        EnumC1257u enumC1257u35 = new EnumC1257u("SINT64_LIST", 34, 34, 2, enumC1207d2);
        EnumC1257u enumC1257u36 = new EnumC1257u("DOUBLE_LIST_PACKED", 35, 35, 3, enumC1207d0);
        f5479x = enumC1257u36;
        EnumC1257u enumC1257u37 = new EnumC1257u("FLOAT_LIST_PACKED", 36, 36, 3, enumC1207d1);
        EnumC1257u enumC1257u38 = new EnumC1257u("INT64_LIST_PACKED", 37, 37, 3, enumC1207d2);
        EnumC1257u enumC1257u39 = new EnumC1257u("UINT64_LIST_PACKED", 38, 38, 3, enumC1207d2);
        EnumC1257u enumC1257u40 = new EnumC1257u("INT32_LIST_PACKED", 39, 39, 3, enumC1207d3);
        EnumC1257u enumC1257u41 = new EnumC1257u("FIXED64_LIST_PACKED", 40, 40, 3, enumC1207d2);
        EnumC1257u enumC1257u42 = new EnumC1257u("FIXED32_LIST_PACKED", 41, 41, 3, enumC1207d3);
        EnumC1257u enumC1257u43 = new EnumC1257u("BOOL_LIST_PACKED", 42, 42, 3, enumC1207d4);
        EnumC1257u enumC1257u44 = new EnumC1257u("UINT32_LIST_PACKED", 43, 43, 3, enumC1207d3);
        EnumC1257u enumC1257u45 = new EnumC1257u("ENUM_LIST_PACKED", 44, 44, 3, enumC1207d8);
        EnumC1257u enumC1257u46 = new EnumC1257u("SFIXED32_LIST_PACKED", 45, 45, 3, enumC1207d3);
        EnumC1257u enumC1257u47 = new EnumC1257u("SFIXED64_LIST_PACKED", 46, 46, 3, enumC1207d2);
        EnumC1257u enumC1257u48 = new EnumC1257u("SINT32_LIST_PACKED", 47, 47, 3, enumC1207d3);
        EnumC1257u enumC1257u49 = new EnumC1257u("SINT64_LIST_PACKED", 48, 48, 3, enumC1207d2);
        f5480y = enumC1257u49;
        f5478E = new EnumC1257u[]{enumC1257u, enumC1257u2, enumC1257u3, enumC1257u4, enumC1257u5, enumC1257u6, enumC1257u7, enumC1257u8, enumC1257u9, enumC1257u10, enumC1257u11, enumC1257u12, enumC1257u13, enumC1257u14, enumC1257u15, enumC1257u16, enumC1257u17, enumC1257u18, enumC1257u19, enumC1257u20, enumC1257u21, enumC1257u22, enumC1257u23, enumC1257u24, enumC1257u25, enumC1257u26, enumC1257u27, enumC1257u28, enumC1257u29, enumC1257u30, enumC1257u31, enumC1257u32, enumC1257u33, enumC1257u34, enumC1257u35, enumC1257u36, enumC1257u37, enumC1257u38, enumC1257u39, enumC1257u40, enumC1257u41, enumC1257u42, enumC1257u43, enumC1257u44, enumC1257u45, enumC1257u46, enumC1257u47, enumC1257u48, enumC1257u49, new EnumC1257u("GROUP_LIST", 49, 49, 2, enumC1207d6), new EnumC1257u("MAP", 50, 50, 4, EnumC1207d0.VOID)};
        EnumC1257u[] enumC1257uArrValues = values();
        f5481z = new EnumC1257u[enumC1257uArrValues.length];
        for (EnumC1257u enumC1257u50 : enumC1257uArrValues) {
            f5481z[enumC1257u50.f5482w] = enumC1257u50;
        }
    }

    public EnumC1257u(String str, int i13, int i14, int i15, EnumC1207d0 enumC1207d0) {
        super(str, i13);
        this.f5482w = i14;
        int iM35485e = AbstractC12682p.m35485e(i15);
        if (iM35485e == 1 || iM35485e == 3) {
            enumC1207d0.getClass();
        }
        if (i15 == 1) {
            enumC1207d0.ordinal();
        }
    }

    public static EnumC1257u valueOf(String str) {
        return (EnumC1257u) Enum.valueOf(EnumC1257u.class, str);
    }

    public static EnumC1257u[] values() {
        return (EnumC1257u[]) f5478E.clone();
    }
}
