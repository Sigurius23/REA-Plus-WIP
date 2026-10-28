package h20;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h20.g2 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC16660g2 {

    /* JADX INFO: renamed from: w */
    public static final EnumC16660g2 f64064w;

    /* JADX INFO: renamed from: x */
    public static final EnumC16660g2 f64065x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC16660g2[] f64066y;

    static {
        EnumC16660g2 enumC16660g2 = new EnumC16660g2("Production", 0);
        f64064w = enumC16660g2;
        EnumC16660g2 enumC16660g3 = new EnumC16660g2("Test", 1);
        f64065x = enumC16660g3;
        EnumC16660g2[] enumC16660g2Arr = {enumC16660g2, enumC16660g3};
        f64066y = enumC16660g2Arr;
        AbstractC15751g.m44468u(enumC16660g2Arr);
    }

    public static EnumC16660g2 valueOf(String str) {
        return (EnumC16660g2) Enum.valueOf(EnumC16660g2.class, str);
    }

    public static EnumC16660g2[] values() {
        return (EnumC16660g2[]) f64066y.clone();
    }
}
