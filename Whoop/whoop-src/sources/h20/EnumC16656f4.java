package h20;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h20.f4 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC16656f4 {

    /* JADX INFO: renamed from: w */
    public static final EnumC16656f4 f64038w;

    /* JADX INFO: renamed from: x */
    public static final EnumC16656f4 f64039x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC16656f4[] f64040y;

    static {
        EnumC16656f4 enumC16656f4 = new EnumC16656f4("SheetTopWallet", 0);
        f64038w = enumC16656f4;
        EnumC16656f4 enumC16656f5 = new EnumC16656f4("SheetBottomBuy", 1);
        f64039x = enumC16656f5;
        EnumC16656f4[] enumC16656f4Arr = {enumC16656f4, enumC16656f5, new EnumC16656f4("None", 2)};
        f64040y = enumC16656f4Arr;
        AbstractC15751g.m44468u(enumC16656f4Arr);
    }

    public static EnumC16656f4 valueOf(String str) {
        return (EnumC16656f4) Enum.valueOf(EnumC16656f4.class, str);
    }

    public static EnumC16656f4[] values() {
        return (EnumC16656f4[]) f64040y.clone();
    }
}
