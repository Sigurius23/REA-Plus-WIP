package androidx.health.platform.client.proto;

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
/* JADX INFO: renamed from: androidx.health.platform.client.proto.p0 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC1509p0 {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC1509p0[] f6099E;

    /* JADX INFO: renamed from: x */
    public static final EnumC1509p0 f6100x;

    /* JADX INFO: renamed from: y */
    public static final EnumC1509p0 f6101y;

    /* JADX INFO: renamed from: z */
    public static final EnumC1509p0[] f6102z;

    /* JADX INFO: renamed from: w */
    public final int f6103w;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1509p0 EF0;

    static {
        EnumC1553y0 enumC1553y0 = EnumC1553y0.DOUBLE;
        EnumC1509p0 enumC1509p0 = new EnumC1509p0("DOUBLE", 0, 0, 1, enumC1553y0);
        EnumC1553y0 enumC1553y1 = EnumC1553y0.FLOAT;
        EnumC1509p0 enumC1509p1 = new EnumC1509p0("FLOAT", 1, 1, 1, enumC1553y1);
        EnumC1553y0 enumC1553y2 = EnumC1553y0.LONG;
        EnumC1509p0 enumC1509p2 = new EnumC1509p0("INT64", 2, 2, 1, enumC1553y2);
        EnumC1509p0 enumC1509p3 = new EnumC1509p0("UINT64", 3, 3, 1, enumC1553y2);
        EnumC1553y0 enumC1553y3 = EnumC1553y0.INT;
        EnumC1509p0 enumC1509p4 = new EnumC1509p0("INT32", 4, 4, 1, enumC1553y3);
        EnumC1509p0 enumC1509p5 = new EnumC1509p0("FIXED64", 5, 5, 1, enumC1553y2);
        EnumC1509p0 enumC1509p6 = new EnumC1509p0("FIXED32", 6, 6, 1, enumC1553y3);
        EnumC1553y0 enumC1553y4 = EnumC1553y0.BOOLEAN;
        EnumC1509p0 enumC1509p7 = new EnumC1509p0("BOOL", 7, 7, 1, enumC1553y4);
        EnumC1553y0 enumC1553y5 = EnumC1553y0.STRING;
        EnumC1509p0 enumC1509p8 = new EnumC1509p0("STRING", 8, 8, 1, enumC1553y5);
        EnumC1553y0 enumC1553y6 = EnumC1553y0.MESSAGE;
        EnumC1509p0 enumC1509p9 = new EnumC1509p0("MESSAGE", 9, 9, 1, enumC1553y6);
        EnumC1553y0 enumC1553y7 = EnumC1553y0.BYTE_STRING;
        EnumC1509p0 enumC1509p10 = new EnumC1509p0("BYTES", 10, 10, 1, enumC1553y7);
        EnumC1509p0 enumC1509p11 = new EnumC1509p0("UINT32", 11, 11, 1, enumC1553y3);
        EnumC1553y0 enumC1553y8 = EnumC1553y0.ENUM;
        EnumC1509p0 enumC1509p12 = new EnumC1509p0("ENUM", 12, 12, 1, enumC1553y8);
        EnumC1509p0 enumC1509p13 = new EnumC1509p0("SFIXED32", 13, 13, 1, enumC1553y3);
        EnumC1509p0 enumC1509p14 = new EnumC1509p0("SFIXED64", 14, 14, 1, enumC1553y2);
        EnumC1509p0 enumC1509p15 = new EnumC1509p0("SINT32", 15, 15, 1, enumC1553y3);
        EnumC1509p0 enumC1509p16 = new EnumC1509p0("SINT64", 16, 16, 1, enumC1553y2);
        EnumC1509p0 enumC1509p17 = new EnumC1509p0("GROUP", 17, 17, 1, enumC1553y6);
        EnumC1509p0 enumC1509p18 = new EnumC1509p0("DOUBLE_LIST", 18, 18, 2, enumC1553y0);
        EnumC1509p0 enumC1509p19 = new EnumC1509p0("FLOAT_LIST", 19, 19, 2, enumC1553y1);
        EnumC1509p0 enumC1509p20 = new EnumC1509p0("INT64_LIST", 20, 20, 2, enumC1553y2);
        EnumC1509p0 enumC1509p21 = new EnumC1509p0("UINT64_LIST", 21, 21, 2, enumC1553y2);
        EnumC1509p0 enumC1509p22 = new EnumC1509p0("INT32_LIST", 22, 22, 2, enumC1553y3);
        EnumC1509p0 enumC1509p23 = new EnumC1509p0("FIXED64_LIST", 23, 23, 2, enumC1553y2);
        EnumC1509p0 enumC1509p24 = new EnumC1509p0("FIXED32_LIST", 24, 24, 2, enumC1553y3);
        EnumC1509p0 enumC1509p25 = new EnumC1509p0("BOOL_LIST", 25, 25, 2, enumC1553y4);
        EnumC1509p0 enumC1509p26 = new EnumC1509p0("STRING_LIST", 26, 26, 2, enumC1553y5);
        EnumC1509p0 enumC1509p27 = new EnumC1509p0("MESSAGE_LIST", 27, 27, 2, enumC1553y6);
        EnumC1509p0 enumC1509p28 = new EnumC1509p0("BYTES_LIST", 28, 28, 2, enumC1553y7);
        EnumC1509p0 enumC1509p29 = new EnumC1509p0("UINT32_LIST", 29, 29, 2, enumC1553y3);
        EnumC1509p0 enumC1509p30 = new EnumC1509p0("ENUM_LIST", 30, 30, 2, enumC1553y8);
        EnumC1509p0 enumC1509p31 = new EnumC1509p0("SFIXED32_LIST", 31, 31, 2, enumC1553y3);
        EnumC1509p0 enumC1509p32 = new EnumC1509p0("SFIXED64_LIST", 32, 32, 2, enumC1553y2);
        EnumC1509p0 enumC1509p33 = new EnumC1509p0("SINT32_LIST", 33, 33, 2, enumC1553y3);
        EnumC1509p0 enumC1509p34 = new EnumC1509p0("SINT64_LIST", 34, 34, 2, enumC1553y2);
        EnumC1509p0 enumC1509p35 = new EnumC1509p0("DOUBLE_LIST_PACKED", 35, 35, 3, enumC1553y0);
        f6100x = enumC1509p35;
        EnumC1509p0 enumC1509p36 = new EnumC1509p0("FLOAT_LIST_PACKED", 36, 36, 3, enumC1553y1);
        EnumC1509p0 enumC1509p37 = new EnumC1509p0("INT64_LIST_PACKED", 37, 37, 3, enumC1553y2);
        EnumC1509p0 enumC1509p38 = new EnumC1509p0("UINT64_LIST_PACKED", 38, 38, 3, enumC1553y2);
        EnumC1509p0 enumC1509p39 = new EnumC1509p0("INT32_LIST_PACKED", 39, 39, 3, enumC1553y3);
        EnumC1509p0 enumC1509p40 = new EnumC1509p0("FIXED64_LIST_PACKED", 40, 40, 3, enumC1553y2);
        EnumC1509p0 enumC1509p41 = new EnumC1509p0("FIXED32_LIST_PACKED", 41, 41, 3, enumC1553y3);
        EnumC1509p0 enumC1509p42 = new EnumC1509p0("BOOL_LIST_PACKED", 42, 42, 3, enumC1553y4);
        EnumC1509p0 enumC1509p43 = new EnumC1509p0("UINT32_LIST_PACKED", 43, 43, 3, enumC1553y3);
        EnumC1509p0 enumC1509p44 = new EnumC1509p0("ENUM_LIST_PACKED", 44, 44, 3, enumC1553y8);
        EnumC1509p0 enumC1509p45 = new EnumC1509p0("SFIXED32_LIST_PACKED", 45, 45, 3, enumC1553y3);
        EnumC1509p0 enumC1509p46 = new EnumC1509p0("SFIXED64_LIST_PACKED", 46, 46, 3, enumC1553y2);
        EnumC1509p0 enumC1509p47 = new EnumC1509p0("SINT32_LIST_PACKED", 47, 47, 3, enumC1553y3);
        EnumC1509p0 enumC1509p48 = new EnumC1509p0("SINT64_LIST_PACKED", 48, 48, 3, enumC1553y2);
        f6101y = enumC1509p48;
        f6099E = new EnumC1509p0[]{enumC1509p0, enumC1509p1, enumC1509p2, enumC1509p3, enumC1509p4, enumC1509p5, enumC1509p6, enumC1509p7, enumC1509p8, enumC1509p9, enumC1509p10, enumC1509p11, enumC1509p12, enumC1509p13, enumC1509p14, enumC1509p15, enumC1509p16, enumC1509p17, enumC1509p18, enumC1509p19, enumC1509p20, enumC1509p21, enumC1509p22, enumC1509p23, enumC1509p24, enumC1509p25, enumC1509p26, enumC1509p27, enumC1509p28, enumC1509p29, enumC1509p30, enumC1509p31, enumC1509p32, enumC1509p33, enumC1509p34, enumC1509p35, enumC1509p36, enumC1509p37, enumC1509p38, enumC1509p39, enumC1509p40, enumC1509p41, enumC1509p42, enumC1509p43, enumC1509p44, enumC1509p45, enumC1509p46, enumC1509p47, enumC1509p48, new EnumC1509p0("GROUP_LIST", 49, 49, 2, enumC1553y6), new EnumC1509p0("MAP", 50, 50, 4, EnumC1553y0.VOID)};
        EnumC1509p0[] enumC1509p0ArrValues = values();
        f6102z = new EnumC1509p0[enumC1509p0ArrValues.length];
        for (EnumC1509p0 enumC1509p49 : enumC1509p0ArrValues) {
            f6102z[enumC1509p49.f6103w] = enumC1509p49;
        }
    }

    public EnumC1509p0(String str, int i13, int i14, int i15, EnumC1553y0 enumC1553y0) {
        super(str, i13);
        this.f6103w = i14;
        int iM35485e = AbstractC12682p.m35485e(i15);
        if (iM35485e == 1 || iM35485e == 3) {
            enumC1553y0.getClass();
        }
        if (i15 == 1) {
            enumC1553y0.ordinal();
        }
    }

    public static EnumC1509p0 valueOf(String str) {
        return (EnumC1509p0) Enum.valueOf(EnumC1509p0.class, str);
    }

    public static EnumC1509p0[] values() {
        return (EnumC1509p0[]) f6099E.clone();
    }
}
