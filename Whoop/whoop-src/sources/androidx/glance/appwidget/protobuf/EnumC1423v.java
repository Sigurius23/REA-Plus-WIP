package androidx.glance.appwidget.protobuf;

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
/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.v */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC1423v {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC1423v[] f5982E;

    /* JADX INFO: renamed from: x */
    public static final EnumC1423v f5983x;

    /* JADX INFO: renamed from: y */
    public static final EnumC1423v f5984y;

    /* JADX INFO: renamed from: z */
    public static final EnumC1423v[] f5985z;

    /* JADX INFO: renamed from: w */
    public final int f5986w;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1423v EF0;

    static {
        EnumC1386g0 enumC1386g0 = EnumC1386g0.DOUBLE;
        EnumC1423v enumC1423v = new EnumC1423v("DOUBLE", 0, 0, 1, enumC1386g0);
        EnumC1386g0 enumC1386g1 = EnumC1386g0.FLOAT;
        EnumC1423v enumC1423v2 = new EnumC1423v("FLOAT", 1, 1, 1, enumC1386g1);
        EnumC1386g0 enumC1386g2 = EnumC1386g0.LONG;
        EnumC1423v enumC1423v3 = new EnumC1423v("INT64", 2, 2, 1, enumC1386g2);
        EnumC1423v enumC1423v4 = new EnumC1423v("UINT64", 3, 3, 1, enumC1386g2);
        EnumC1386g0 enumC1386g3 = EnumC1386g0.INT;
        EnumC1423v enumC1423v5 = new EnumC1423v("INT32", 4, 4, 1, enumC1386g3);
        EnumC1423v enumC1423v6 = new EnumC1423v("FIXED64", 5, 5, 1, enumC1386g2);
        EnumC1423v enumC1423v7 = new EnumC1423v("FIXED32", 6, 6, 1, enumC1386g3);
        EnumC1386g0 enumC1386g4 = EnumC1386g0.BOOLEAN;
        EnumC1423v enumC1423v8 = new EnumC1423v("BOOL", 7, 7, 1, enumC1386g4);
        EnumC1386g0 enumC1386g5 = EnumC1386g0.STRING;
        EnumC1423v enumC1423v9 = new EnumC1423v("STRING", 8, 8, 1, enumC1386g5);
        EnumC1386g0 enumC1386g6 = EnumC1386g0.MESSAGE;
        EnumC1423v enumC1423v10 = new EnumC1423v("MESSAGE", 9, 9, 1, enumC1386g6);
        EnumC1386g0 enumC1386g7 = EnumC1386g0.BYTE_STRING;
        EnumC1423v enumC1423v11 = new EnumC1423v("BYTES", 10, 10, 1, enumC1386g7);
        EnumC1423v enumC1423v12 = new EnumC1423v("UINT32", 11, 11, 1, enumC1386g3);
        EnumC1386g0 enumC1386g8 = EnumC1386g0.ENUM;
        EnumC1423v enumC1423v13 = new EnumC1423v("ENUM", 12, 12, 1, enumC1386g8);
        EnumC1423v enumC1423v14 = new EnumC1423v("SFIXED32", 13, 13, 1, enumC1386g3);
        EnumC1423v enumC1423v15 = new EnumC1423v("SFIXED64", 14, 14, 1, enumC1386g2);
        EnumC1423v enumC1423v16 = new EnumC1423v("SINT32", 15, 15, 1, enumC1386g3);
        EnumC1423v enumC1423v17 = new EnumC1423v("SINT64", 16, 16, 1, enumC1386g2);
        EnumC1423v enumC1423v18 = new EnumC1423v("GROUP", 17, 17, 1, enumC1386g6);
        EnumC1423v enumC1423v19 = new EnumC1423v("DOUBLE_LIST", 18, 18, 2, enumC1386g0);
        EnumC1423v enumC1423v20 = new EnumC1423v("FLOAT_LIST", 19, 19, 2, enumC1386g1);
        EnumC1423v enumC1423v21 = new EnumC1423v("INT64_LIST", 20, 20, 2, enumC1386g2);
        EnumC1423v enumC1423v22 = new EnumC1423v("UINT64_LIST", 21, 21, 2, enumC1386g2);
        EnumC1423v enumC1423v23 = new EnumC1423v("INT32_LIST", 22, 22, 2, enumC1386g3);
        EnumC1423v enumC1423v24 = new EnumC1423v("FIXED64_LIST", 23, 23, 2, enumC1386g2);
        EnumC1423v enumC1423v25 = new EnumC1423v("FIXED32_LIST", 24, 24, 2, enumC1386g3);
        EnumC1423v enumC1423v26 = new EnumC1423v("BOOL_LIST", 25, 25, 2, enumC1386g4);
        EnumC1423v enumC1423v27 = new EnumC1423v("STRING_LIST", 26, 26, 2, enumC1386g5);
        EnumC1423v enumC1423v28 = new EnumC1423v("MESSAGE_LIST", 27, 27, 2, enumC1386g6);
        EnumC1423v enumC1423v29 = new EnumC1423v("BYTES_LIST", 28, 28, 2, enumC1386g7);
        EnumC1423v enumC1423v30 = new EnumC1423v("UINT32_LIST", 29, 29, 2, enumC1386g3);
        EnumC1423v enumC1423v31 = new EnumC1423v("ENUM_LIST", 30, 30, 2, enumC1386g8);
        EnumC1423v enumC1423v32 = new EnumC1423v("SFIXED32_LIST", 31, 31, 2, enumC1386g3);
        EnumC1423v enumC1423v33 = new EnumC1423v("SFIXED64_LIST", 32, 32, 2, enumC1386g2);
        EnumC1423v enumC1423v34 = new EnumC1423v("SINT32_LIST", 33, 33, 2, enumC1386g3);
        EnumC1423v enumC1423v35 = new EnumC1423v("SINT64_LIST", 34, 34, 2, enumC1386g2);
        EnumC1423v enumC1423v36 = new EnumC1423v("DOUBLE_LIST_PACKED", 35, 35, 3, enumC1386g0);
        f5983x = enumC1423v36;
        EnumC1423v enumC1423v37 = new EnumC1423v("FLOAT_LIST_PACKED", 36, 36, 3, enumC1386g1);
        EnumC1423v enumC1423v38 = new EnumC1423v("INT64_LIST_PACKED", 37, 37, 3, enumC1386g2);
        EnumC1423v enumC1423v39 = new EnumC1423v("UINT64_LIST_PACKED", 38, 38, 3, enumC1386g2);
        EnumC1423v enumC1423v40 = new EnumC1423v("INT32_LIST_PACKED", 39, 39, 3, enumC1386g3);
        EnumC1423v enumC1423v41 = new EnumC1423v("FIXED64_LIST_PACKED", 40, 40, 3, enumC1386g2);
        EnumC1423v enumC1423v42 = new EnumC1423v("FIXED32_LIST_PACKED", 41, 41, 3, enumC1386g3);
        EnumC1423v enumC1423v43 = new EnumC1423v("BOOL_LIST_PACKED", 42, 42, 3, enumC1386g4);
        EnumC1423v enumC1423v44 = new EnumC1423v("UINT32_LIST_PACKED", 43, 43, 3, enumC1386g3);
        EnumC1423v enumC1423v45 = new EnumC1423v("ENUM_LIST_PACKED", 44, 44, 3, enumC1386g8);
        EnumC1423v enumC1423v46 = new EnumC1423v("SFIXED32_LIST_PACKED", 45, 45, 3, enumC1386g3);
        EnumC1423v enumC1423v47 = new EnumC1423v("SFIXED64_LIST_PACKED", 46, 46, 3, enumC1386g2);
        EnumC1423v enumC1423v48 = new EnumC1423v("SINT32_LIST_PACKED", 47, 47, 3, enumC1386g3);
        EnumC1423v enumC1423v49 = new EnumC1423v("SINT64_LIST_PACKED", 48, 48, 3, enumC1386g2);
        f5984y = enumC1423v49;
        f5982E = new EnumC1423v[]{enumC1423v, enumC1423v2, enumC1423v3, enumC1423v4, enumC1423v5, enumC1423v6, enumC1423v7, enumC1423v8, enumC1423v9, enumC1423v10, enumC1423v11, enumC1423v12, enumC1423v13, enumC1423v14, enumC1423v15, enumC1423v16, enumC1423v17, enumC1423v18, enumC1423v19, enumC1423v20, enumC1423v21, enumC1423v22, enumC1423v23, enumC1423v24, enumC1423v25, enumC1423v26, enumC1423v27, enumC1423v28, enumC1423v29, enumC1423v30, enumC1423v31, enumC1423v32, enumC1423v33, enumC1423v34, enumC1423v35, enumC1423v36, enumC1423v37, enumC1423v38, enumC1423v39, enumC1423v40, enumC1423v41, enumC1423v42, enumC1423v43, enumC1423v44, enumC1423v45, enumC1423v46, enumC1423v47, enumC1423v48, enumC1423v49, new EnumC1423v("GROUP_LIST", 49, 49, 2, enumC1386g6), new EnumC1423v("MAP", 50, 50, 4, EnumC1386g0.VOID)};
        EnumC1423v[] enumC1423vArrValues = values();
        f5985z = new EnumC1423v[enumC1423vArrValues.length];
        for (EnumC1423v enumC1423v50 : enumC1423vArrValues) {
            f5985z[enumC1423v50.f5986w] = enumC1423v50;
        }
    }

    public EnumC1423v(String str, int i13, int i14, int i15, EnumC1386g0 enumC1386g0) {
        super(str, i13);
        this.f5986w = i14;
        int iM35485e = AbstractC12682p.m35485e(i15);
        if (iM35485e == 1 || iM35485e == 3) {
            enumC1386g0.getClass();
        }
        if (i15 == 1) {
            enumC1386g0.ordinal();
        }
    }

    public static EnumC1423v valueOf(String str) {
        return (EnumC1423v) Enum.valueOf(EnumC1423v.class, str);
    }

    public static EnumC1423v[] values() {
        return (EnumC1423v[]) f5982E.clone();
    }
}
