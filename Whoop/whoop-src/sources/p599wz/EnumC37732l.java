package p599wz;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: wz.l */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC37732l {

    /* JADX INFO: renamed from: w */
    public static final EnumC37732l f161680w;

    /* JADX INFO: renamed from: x */
    public static final EnumC37732l f161681x;

    /* JADX INFO: renamed from: y */
    public static final EnumC37732l f161682y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC37732l[] f161683z;

    static {
        EnumC37732l enumC37732l = new EnumC37732l("BackPressed", 0);
        f161680w = enumC37732l;
        EnumC37732l enumC37732l2 = new EnumC37732l("LoggedOut", 1);
        f161681x = enumC37732l2;
        EnumC37732l enumC37732l3 = new EnumC37732l("PayAnotherWay", 2);
        f161682y = enumC37732l3;
        EnumC37732l[] enumC37732lArr = {enumC37732l, enumC37732l2, enumC37732l3};
        f161683z = enumC37732lArr;
        AbstractC15751g.m44468u(enumC37732lArr);
    }

    public static EnumC37732l valueOf(String str) {
        return (EnumC37732l) Enum.valueOf(EnumC37732l.class, str);
    }

    public static EnumC37732l[] values() {
        return (EnumC37732l[]) f161683z.clone();
    }
}
