package p163g1;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: g1.b2 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC14960b2 {

    /* JADX INFO: renamed from: w */
    public static final EnumC14960b2 f55823w;

    /* JADX INFO: renamed from: x */
    public static final EnumC14960b2 f55824x;

    /* JADX INFO: renamed from: y */
    public static final EnumC14960b2 f55825y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC14960b2[] f55826z;

    static {
        EnumC14960b2 enumC14960b2 = new EnumC14960b2("Default", 0);
        f55823w = enumC14960b2;
        EnumC14960b2 enumC14960b3 = new EnumC14960b2("DismissedToEnd", 1);
        f55824x = enumC14960b3;
        EnumC14960b2 enumC14960b4 = new EnumC14960b2("DismissedToStart", 2);
        f55825y = enumC14960b4;
        EnumC14960b2[] enumC14960b2Arr = {enumC14960b2, enumC14960b3, enumC14960b4};
        f55826z = enumC14960b2Arr;
        AbstractC15751g.m44468u(enumC14960b2Arr);
    }

    public static EnumC14960b2 valueOf(String str) {
        return (EnumC14960b2) Enum.valueOf(EnumC14960b2.class, str);
    }

    public static EnumC14960b2[] values() {
        return (EnumC14960b2[]) f55826z.clone();
    }
}
