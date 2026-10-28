package p635y2;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: y2.s */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC39129s {

    /* JADX INFO: renamed from: w */
    public static final EnumC39129s f168267w;

    /* JADX INFO: renamed from: x */
    public static final EnumC39129s f168268x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC39129s[] f168269y;

    static {
        EnumC39129s enumC39129s = new EnumC39129s("Min", 0);
        f168267w = enumC39129s;
        EnumC39129s enumC39129s2 = new EnumC39129s("Max", 1);
        f168268x = enumC39129s2;
        EnumC39129s[] enumC39129sArr = {enumC39129s, enumC39129s2};
        f168269y = enumC39129sArr;
        AbstractC15751g.m44468u(enumC39129sArr);
    }

    public static EnumC39129s valueOf(String str) {
        return (EnumC39129s) Enum.valueOf(EnumC39129s.class, str);
    }

    public static EnumC39129s[] values() {
        return (EnumC39129s[]) f168269y.clone();
    }
}
