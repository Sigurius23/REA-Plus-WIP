package h20;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h20.v2 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC16750v2 {

    /* JADX INFO: renamed from: w */
    public static final EnumC16750v2 f64330w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC16750v2[] f64331x;

    static {
        EnumC16750v2 enumC16750v2 = new EnumC16750v2("Automatic", 0);
        f64330w = enumC16750v2;
        EnumC16750v2[] enumC16750v2Arr = {enumC16750v2, new EnumC16750v2("Never", 1)};
        f64331x = enumC16750v2Arr;
        AbstractC15751g.m44468u(enumC16750v2Arr);
    }

    public static EnumC16750v2 valueOf(String str) {
        return (EnumC16750v2) Enum.valueOf(EnumC16750v2.class, str);
    }

    public static EnumC16750v2[] values() {
        return (EnumC16750v2[]) f64331x.clone();
    }
}
