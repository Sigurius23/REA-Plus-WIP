package p092dh;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: dh.m */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC12026m {

    /* JADX INFO: renamed from: w */
    public static final EnumC12026m f39772w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC12026m[] f39773x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC12026m EF0;

    static {
        EnumC12026m enumC12026m = new EnumC12026m("IGNORE", 0);
        EnumC12026m enumC12026m2 = new EnumC12026m("RESPECT_PERFORMANCE", 1);
        f39772w = enumC12026m2;
        EnumC12026m[] enumC12026mArr = {enumC12026m, enumC12026m2, new EnumC12026m("RESPECT_ALL", 2)};
        f39773x = enumC12026mArr;
        AbstractC15751g.m44468u(enumC12026mArr);
    }

    public static EnumC12026m valueOf(String str) {
        return (EnumC12026m) Enum.valueOf(EnumC12026m.class, str);
    }

    public static EnumC12026m[] values() {
        return (EnumC12026m[]) f39773x.clone();
    }
}
