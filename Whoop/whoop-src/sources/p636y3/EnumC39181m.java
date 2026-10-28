package p636y3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: y3.m */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC39181m {

    /* JADX INFO: renamed from: w */
    public static final EnumC39181m f168423w;

    /* JADX INFO: renamed from: x */
    public static final EnumC39181m f168424x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC39181m[] f168425y;

    static {
        EnumC39181m enumC39181m = new EnumC39181m("Ltr", 0);
        f168423w = enumC39181m;
        EnumC39181m enumC39181m2 = new EnumC39181m("Rtl", 1);
        f168424x = enumC39181m2;
        EnumC39181m[] enumC39181mArr = {enumC39181m, enumC39181m2};
        f168425y = enumC39181mArr;
        AbstractC15751g.m44468u(enumC39181mArr);
    }

    public static EnumC39181m valueOf(String str) {
        return (EnumC39181m) Enum.valueOf(EnumC39181m.class, str);
    }

    public static EnumC39181m[] values() {
        return (EnumC39181m[]) f168425y.clone();
    }
}
