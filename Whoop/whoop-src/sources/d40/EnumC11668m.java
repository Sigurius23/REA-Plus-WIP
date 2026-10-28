package d40;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: d40.m */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC11668m {

    /* JADX INFO: renamed from: w */
    public static final EnumC11668m f37665w;

    /* JADX INFO: renamed from: x */
    public static final EnumC11668m f37666x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC11668m[] f37667y;

    static {
        EnumC11668m enumC11668m = new EnumC11668m("Bordered", 0);
        f37665w = enumC11668m;
        EnumC11668m enumC11668m2 = new EnumC11668m("Borderless", 1);
        f37666x = enumC11668m2;
        EnumC11668m[] enumC11668mArr = {enumC11668m, enumC11668m2};
        f37667y = enumC11668mArr;
        AbstractC15751g.m44468u(enumC11668mArr);
    }

    public static EnumC11668m valueOf(String str) {
        return (EnumC11668m) Enum.valueOf(EnumC11668m.class, str);
    }

    public static EnumC11668m[] values() {
        return (EnumC11668m[]) f37667y.clone();
    }
}
