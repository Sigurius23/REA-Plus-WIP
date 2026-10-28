package bg;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: bg.m */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3218m {

    /* JADX INFO: renamed from: w */
    public static final EnumC3218m f12588w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC3218m[] f12589x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC3218m EF0;

    static {
        EnumC3218m enumC3218m = new EnumC3218m("TLS_1_0", 0);
        EnumC3218m enumC3218m2 = new EnumC3218m("TLS_1_1", 1);
        EnumC3218m enumC3218m3 = new EnumC3218m("TLS_1_2", 2);
        f12588w = enumC3218m3;
        EnumC3218m[] enumC3218mArr = {enumC3218m, enumC3218m2, enumC3218m3, new EnumC3218m("TLS_1_3", 3)};
        f12589x = enumC3218mArr;
        AbstractC15751g.m44468u(enumC3218mArr);
    }

    public static EnumC3218m valueOf(String str) {
        return (EnumC3218m) Enum.valueOf(EnumC3218m.class, str);
    }

    public static EnumC3218m[] values() {
        return (EnumC3218m[]) f12589x.clone();
    }
}
