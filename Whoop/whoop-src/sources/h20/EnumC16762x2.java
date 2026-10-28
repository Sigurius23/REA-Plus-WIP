package h20;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h20.x2 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC16762x2 {

    /* JADX INFO: renamed from: w */
    public static final EnumC16762x2 f64427w;

    /* JADX INFO: renamed from: x */
    public static final EnumC16762x2 f64428x;

    /* JADX INFO: renamed from: y */
    public static final EnumC16762x2 f64429y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC16762x2[] f64430z;

    static {
        EnumC16762x2 enumC16762x2 = new EnumC16762x2("Horizontal", 0);
        f64427w = enumC16762x2;
        EnumC16762x2 enumC16762x3 = new EnumC16762x2("Vertical", 1);
        f64428x = enumC16762x3;
        EnumC16762x2 enumC16762x4 = new EnumC16762x2("Automatic", 2);
        f64429y = enumC16762x4;
        EnumC16762x2[] enumC16762x2Arr = {enumC16762x2, enumC16762x3, enumC16762x4};
        f64430z = enumC16762x2Arr;
        AbstractC15751g.m44468u(enumC16762x2Arr);
    }

    public static EnumC16762x2 valueOf(String str) {
        return (EnumC16762x2) Enum.valueOf(EnumC16762x2.class, str);
    }

    public static EnumC16762x2[] values() {
        return (EnumC16762x2[]) f64430z.clone();
    }
}
