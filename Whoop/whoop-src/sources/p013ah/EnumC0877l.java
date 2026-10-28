package p013ah;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ah.l */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC0877l {

    /* JADX INFO: renamed from: E */
    public static final EnumC0877l f3176E;

    /* JADX INFO: renamed from: F */
    public static final EnumC0877l f3177F;

    /* JADX INFO: renamed from: G */
    public static final EnumC0877l f3178G;

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ EnumC0877l[] f3179H;

    /* JADX INFO: renamed from: w */
    public static final EnumC0877l f3180w;

    /* JADX INFO: renamed from: x */
    public static final EnumC0877l f3181x;

    /* JADX INFO: renamed from: y */
    public static final EnumC0877l f3182y;

    /* JADX INFO: renamed from: z */
    public static final EnumC0877l f3183z;

    static {
        EnumC0877l enumC0877l = new EnumC0877l("SIMPLE_VALUE", 0);
        f3180w = enumC0877l;
        EnumC0877l enumC0877l2 = new EnumC0877l("SIMPLE_VALUE_NEXT_BYTE", 1);
        f3181x = enumC0877l2;
        EnumC0877l enumC0877l3 = new EnumC0877l("IEEE_754_HALF_PRECISION_FLOAT", 2);
        f3182y = enumC0877l3;
        EnumC0877l enumC0877l4 = new EnumC0877l("IEEE_754_SINGLE_PRECISION_FLOAT", 3);
        f3183z = enumC0877l4;
        EnumC0877l enumC0877l5 = new EnumC0877l("IEEE_754_DOUBLE_PRECISION_FLOAT", 4);
        f3176E = enumC0877l5;
        EnumC0877l enumC0877l6 = new EnumC0877l("UNALLOCATED", 5);
        f3177F = enumC0877l6;
        EnumC0877l enumC0877l7 = new EnumC0877l("BREAK", 6);
        f3178G = enumC0877l7;
        f3179H = new EnumC0877l[]{enumC0877l, enumC0877l2, enumC0877l3, enumC0877l4, enumC0877l5, enumC0877l6, enumC0877l7};
    }

    public static EnumC0877l valueOf(String str) {
        return (EnumC0877l) Enum.valueOf(EnumC0877l.class, str);
    }

    public static EnumC0877l[] values() {
        return (EnumC0877l[]) f3179H.clone();
    }
}
