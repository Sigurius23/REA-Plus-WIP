package p354o1;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o1.t */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC27381t {

    /* JADX INFO: renamed from: E */
    public static final EnumC27381t f110040E;

    /* JADX INFO: renamed from: F */
    public static final EnumC27381t f110041F;

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ EnumC27381t[] f110042G;

    /* JADX INFO: renamed from: w */
    public static final EnumC27381t f110043w;

    /* JADX INFO: renamed from: x */
    public static final EnumC27381t f110044x;

    /* JADX INFO: renamed from: y */
    public static final EnumC27381t f110045y;

    /* JADX INFO: renamed from: z */
    public static final EnumC27381t f110046z;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC27381t EF0;

    static {
        EnumC27381t enumC27381t = new EnumC27381t("CornerExtraExtraLarge", 0);
        EnumC27381t enumC27381t2 = new EnumC27381t("CornerExtraLarge", 1);
        f110043w = enumC27381t2;
        EnumC27381t enumC27381t3 = new EnumC27381t("CornerExtraLargeIncreased", 2);
        EnumC27381t enumC27381t4 = new EnumC27381t("CornerExtraLargeTop", 3);
        f110044x = enumC27381t4;
        EnumC27381t enumC27381t5 = new EnumC27381t("CornerExtraSmall", 4);
        f110045y = enumC27381t5;
        EnumC27381t enumC27381t6 = new EnumC27381t("CornerExtraSmallTop", 5);
        f110046z = enumC27381t6;
        EnumC27381t enumC27381t7 = new EnumC27381t("CornerFull", 6);
        f110040E = enumC27381t7;
        EnumC27381t enumC27381t8 = new EnumC27381t("CornerLarge", 7);
        EnumC27381t enumC27381t9 = new EnumC27381t("CornerLargeEnd", 8);
        EnumC27381t enumC27381t10 = new EnumC27381t("CornerLargeIncreased", 9);
        EnumC27381t enumC27381t11 = new EnumC27381t("CornerLargeStart", 10);
        EnumC27381t enumC27381t12 = new EnumC27381t("CornerLargeTop", 11);
        EnumC27381t enumC27381t13 = new EnumC27381t("CornerMedium", 12);
        f110041F = enumC27381t13;
        EnumC27381t[] enumC27381tArr = {enumC27381t, enumC27381t2, enumC27381t3, enumC27381t4, enumC27381t5, enumC27381t6, enumC27381t7, enumC27381t8, enumC27381t9, enumC27381t10, enumC27381t11, enumC27381t12, enumC27381t13, new EnumC27381t("CornerNone", 13), new EnumC27381t("CornerSmall", 14)};
        f110042G = enumC27381tArr;
        AbstractC15751g.m44468u(enumC27381tArr);
    }

    public static EnumC27381t valueOf(String str) {
        return (EnumC27381t) Enum.valueOf(EnumC27381t.class, str);
    }

    public static EnumC27381t[] values() {
        return (EnumC27381t[]) f110042G.clone();
    }
}
