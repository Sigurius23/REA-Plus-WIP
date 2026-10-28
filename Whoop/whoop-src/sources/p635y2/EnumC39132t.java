package p635y2;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: y2.t */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC39132t {

    /* JADX INFO: renamed from: w */
    public static final EnumC39132t f168270w;

    /* JADX INFO: renamed from: x */
    public static final EnumC39132t f168271x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC39132t[] f168272y;

    static {
        EnumC39132t enumC39132t = new EnumC39132t("Width", 0);
        f168270w = enumC39132t;
        EnumC39132t enumC39132t2 = new EnumC39132t("Height", 1);
        f168271x = enumC39132t2;
        EnumC39132t[] enumC39132tArr = {enumC39132t, enumC39132t2};
        f168272y = enumC39132tArr;
        AbstractC15751g.m44468u(enumC39132tArr);
    }

    public static EnumC39132t valueOf(String str) {
        return (EnumC39132t) Enum.valueOf(EnumC39132t.class, str);
    }

    public static EnumC39132t[] values() {
        return (EnumC39132t[]) f168272y.clone();
    }
}
