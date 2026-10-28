package h20;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h20.p3 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC16715p3 {

    /* JADX INFO: renamed from: w */
    public static final EnumC16715p3 f64251w;

    /* JADX INFO: renamed from: x */
    public static final EnumC16715p3 f64252x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC16715p3[] f64253y;

    static {
        EnumC16715p3 enumC16715p3 = new EnumC16715p3("Always", 0);
        f64251w = enumC16715p3;
        EnumC16715p3 enumC16715p4 = new EnumC16715p3("Never", 1);
        f64252x = enumC16715p4;
        EnumC16715p3[] enumC16715p3Arr = {enumC16715p3, enumC16715p4};
        f64253y = enumC16715p3Arr;
        AbstractC15751g.m44468u(enumC16715p3Arr);
    }

    public static EnumC16715p3 valueOf(String str) {
        return (EnumC16715p3) Enum.valueOf(EnumC16715p3.class, str);
    }

    public static EnumC16715p3[] values() {
        return (EnumC16715p3[]) f64253y.clone();
    }
}
