package com.google.crypto.tink.shaded.protobuf;

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
/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.s */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC5174s {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC5174s[] f21581E;

    /* JADX INFO: renamed from: x */
    public static final EnumC5174s f21582x;

    /* JADX INFO: renamed from: y */
    public static final EnumC5174s f21583y;

    /* JADX INFO: renamed from: z */
    public static final EnumC5174s[] f21584z;

    /* JADX INFO: renamed from: w */
    public final int f21585w;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC5174s EF0;

    static {
        EnumC5129c0 enumC5129c0 = EnumC5129c0.DOUBLE;
        EnumC5174s enumC5174s = new EnumC5174s("DOUBLE", 0, 0, 1, enumC5129c0);
        EnumC5129c0 enumC5129c1 = EnumC5129c0.FLOAT;
        EnumC5174s enumC5174s2 = new EnumC5174s("FLOAT", 1, 1, 1, enumC5129c1);
        EnumC5129c0 enumC5129c2 = EnumC5129c0.LONG;
        EnumC5174s enumC5174s3 = new EnumC5174s("INT64", 2, 2, 1, enumC5129c2);
        EnumC5174s enumC5174s4 = new EnumC5174s("UINT64", 3, 3, 1, enumC5129c2);
        EnumC5129c0 enumC5129c3 = EnumC5129c0.INT;
        EnumC5174s enumC5174s5 = new EnumC5174s("INT32", 4, 4, 1, enumC5129c3);
        EnumC5174s enumC5174s6 = new EnumC5174s("FIXED64", 5, 5, 1, enumC5129c2);
        EnumC5174s enumC5174s7 = new EnumC5174s("FIXED32", 6, 6, 1, enumC5129c3);
        EnumC5129c0 enumC5129c4 = EnumC5129c0.BOOLEAN;
        EnumC5174s enumC5174s8 = new EnumC5174s("BOOL", 7, 7, 1, enumC5129c4);
        EnumC5129c0 enumC5129c5 = EnumC5129c0.STRING;
        EnumC5174s enumC5174s9 = new EnumC5174s("STRING", 8, 8, 1, enumC5129c5);
        EnumC5129c0 enumC5129c6 = EnumC5129c0.MESSAGE;
        EnumC5174s enumC5174s10 = new EnumC5174s("MESSAGE", 9, 9, 1, enumC5129c6);
        EnumC5129c0 enumC5129c7 = EnumC5129c0.BYTE_STRING;
        EnumC5174s enumC5174s11 = new EnumC5174s("BYTES", 10, 10, 1, enumC5129c7);
        EnumC5174s enumC5174s12 = new EnumC5174s("UINT32", 11, 11, 1, enumC5129c3);
        EnumC5129c0 enumC5129c8 = EnumC5129c0.ENUM;
        EnumC5174s enumC5174s13 = new EnumC5174s("ENUM", 12, 12, 1, enumC5129c8);
        EnumC5174s enumC5174s14 = new EnumC5174s("SFIXED32", 13, 13, 1, enumC5129c3);
        EnumC5174s enumC5174s15 = new EnumC5174s("SFIXED64", 14, 14, 1, enumC5129c2);
        EnumC5174s enumC5174s16 = new EnumC5174s("SINT32", 15, 15, 1, enumC5129c3);
        EnumC5174s enumC5174s17 = new EnumC5174s("SINT64", 16, 16, 1, enumC5129c2);
        EnumC5174s enumC5174s18 = new EnumC5174s("GROUP", 17, 17, 1, enumC5129c6);
        EnumC5174s enumC5174s19 = new EnumC5174s("DOUBLE_LIST", 18, 18, 2, enumC5129c0);
        EnumC5174s enumC5174s20 = new EnumC5174s("FLOAT_LIST", 19, 19, 2, enumC5129c1);
        EnumC5174s enumC5174s21 = new EnumC5174s("INT64_LIST", 20, 20, 2, enumC5129c2);
        EnumC5174s enumC5174s22 = new EnumC5174s("UINT64_LIST", 21, 21, 2, enumC5129c2);
        EnumC5174s enumC5174s23 = new EnumC5174s("INT32_LIST", 22, 22, 2, enumC5129c3);
        EnumC5174s enumC5174s24 = new EnumC5174s("FIXED64_LIST", 23, 23, 2, enumC5129c2);
        EnumC5174s enumC5174s25 = new EnumC5174s("FIXED32_LIST", 24, 24, 2, enumC5129c3);
        EnumC5174s enumC5174s26 = new EnumC5174s("BOOL_LIST", 25, 25, 2, enumC5129c4);
        EnumC5174s enumC5174s27 = new EnumC5174s("STRING_LIST", 26, 26, 2, enumC5129c5);
        EnumC5174s enumC5174s28 = new EnumC5174s("MESSAGE_LIST", 27, 27, 2, enumC5129c6);
        EnumC5174s enumC5174s29 = new EnumC5174s("BYTES_LIST", 28, 28, 2, enumC5129c7);
        EnumC5174s enumC5174s30 = new EnumC5174s("UINT32_LIST", 29, 29, 2, enumC5129c3);
        EnumC5174s enumC5174s31 = new EnumC5174s("ENUM_LIST", 30, 30, 2, enumC5129c8);
        EnumC5174s enumC5174s32 = new EnumC5174s("SFIXED32_LIST", 31, 31, 2, enumC5129c3);
        EnumC5174s enumC5174s33 = new EnumC5174s("SFIXED64_LIST", 32, 32, 2, enumC5129c2);
        EnumC5174s enumC5174s34 = new EnumC5174s("SINT32_LIST", 33, 33, 2, enumC5129c3);
        EnumC5174s enumC5174s35 = new EnumC5174s("SINT64_LIST", 34, 34, 2, enumC5129c2);
        EnumC5174s enumC5174s36 = new EnumC5174s("DOUBLE_LIST_PACKED", 35, 35, 3, enumC5129c0);
        f21582x = enumC5174s36;
        EnumC5174s enumC5174s37 = new EnumC5174s("FLOAT_LIST_PACKED", 36, 36, 3, enumC5129c1);
        EnumC5174s enumC5174s38 = new EnumC5174s("INT64_LIST_PACKED", 37, 37, 3, enumC5129c2);
        EnumC5174s enumC5174s39 = new EnumC5174s("UINT64_LIST_PACKED", 38, 38, 3, enumC5129c2);
        EnumC5174s enumC5174s40 = new EnumC5174s("INT32_LIST_PACKED", 39, 39, 3, enumC5129c3);
        EnumC5174s enumC5174s41 = new EnumC5174s("FIXED64_LIST_PACKED", 40, 40, 3, enumC5129c2);
        EnumC5174s enumC5174s42 = new EnumC5174s("FIXED32_LIST_PACKED", 41, 41, 3, enumC5129c3);
        EnumC5174s enumC5174s43 = new EnumC5174s("BOOL_LIST_PACKED", 42, 42, 3, enumC5129c4);
        EnumC5174s enumC5174s44 = new EnumC5174s("UINT32_LIST_PACKED", 43, 43, 3, enumC5129c3);
        EnumC5174s enumC5174s45 = new EnumC5174s("ENUM_LIST_PACKED", 44, 44, 3, enumC5129c8);
        EnumC5174s enumC5174s46 = new EnumC5174s("SFIXED32_LIST_PACKED", 45, 45, 3, enumC5129c3);
        EnumC5174s enumC5174s47 = new EnumC5174s("SFIXED64_LIST_PACKED", 46, 46, 3, enumC5129c2);
        EnumC5174s enumC5174s48 = new EnumC5174s("SINT32_LIST_PACKED", 47, 47, 3, enumC5129c3);
        EnumC5174s enumC5174s49 = new EnumC5174s("SINT64_LIST_PACKED", 48, 48, 3, enumC5129c2);
        f21583y = enumC5174s49;
        f21581E = new EnumC5174s[]{enumC5174s, enumC5174s2, enumC5174s3, enumC5174s4, enumC5174s5, enumC5174s6, enumC5174s7, enumC5174s8, enumC5174s9, enumC5174s10, enumC5174s11, enumC5174s12, enumC5174s13, enumC5174s14, enumC5174s15, enumC5174s16, enumC5174s17, enumC5174s18, enumC5174s19, enumC5174s20, enumC5174s21, enumC5174s22, enumC5174s23, enumC5174s24, enumC5174s25, enumC5174s26, enumC5174s27, enumC5174s28, enumC5174s29, enumC5174s30, enumC5174s31, enumC5174s32, enumC5174s33, enumC5174s34, enumC5174s35, enumC5174s36, enumC5174s37, enumC5174s38, enumC5174s39, enumC5174s40, enumC5174s41, enumC5174s42, enumC5174s43, enumC5174s44, enumC5174s45, enumC5174s46, enumC5174s47, enumC5174s48, enumC5174s49, new EnumC5174s("GROUP_LIST", 49, 49, 2, enumC5129c6), new EnumC5174s("MAP", 50, 50, 4, EnumC5129c0.VOID)};
        EnumC5174s[] enumC5174sArrValues = values();
        f21584z = new EnumC5174s[enumC5174sArrValues.length];
        for (EnumC5174s enumC5174s50 : enumC5174sArrValues) {
            f21584z[enumC5174s50.f21585w] = enumC5174s50;
        }
    }

    public EnumC5174s(String str, int i13, int i14, int i15, EnumC5129c0 enumC5129c0) {
        super(str, i13);
        this.f21585w = i14;
        int iM35485e = AbstractC12682p.m35485e(i15);
        if (iM35485e == 1 || iM35485e == 3) {
            enumC5129c0.getClass();
        }
        if (i15 == 1) {
            enumC5129c0.ordinal();
        }
    }

    public static EnumC5174s valueOf(String str) {
        return (EnumC5174s) Enum.valueOf(EnumC5174s.class, str);
    }

    public static EnumC5174s[] values() {
        return (EnumC5174s[]) f21581E.clone();
    }
}
