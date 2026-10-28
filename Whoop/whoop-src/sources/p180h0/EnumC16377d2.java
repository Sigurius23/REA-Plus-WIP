package p180h0;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h0.d2 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC16377d2 {

    /* JADX INFO: renamed from: w */
    public static final EnumC16377d2 f62971w;

    /* JADX INFO: renamed from: x */
    public static final EnumC16377d2 f62972x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC16377d2[] f62973y;

    static {
        EnumC16377d2 enumC16377d2 = new EnumC16377d2("Vertical", 0);
        f62971w = enumC16377d2;
        EnumC16377d2 enumC16377d3 = new EnumC16377d2("Horizontal", 1);
        f62972x = enumC16377d3;
        EnumC16377d2[] enumC16377d2Arr = {enumC16377d2, enumC16377d3};
        f62973y = enumC16377d2Arr;
        AbstractC15751g.m44468u(enumC16377d2Arr);
    }

    public static EnumC16377d2 valueOf(String str) {
        return (EnumC16377d2) Enum.valueOf(EnumC16377d2.class, str);
    }

    public static EnumC16377d2[] values() {
        return (EnumC16377d2[]) f62973y.clone();
    }
}
