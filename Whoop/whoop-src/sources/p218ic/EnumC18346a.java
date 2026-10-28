package p218ic;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ic.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC18346a {

    /* JADX INFO: renamed from: w */
    public static final EnumC18346a f71443w;

    /* JADX INFO: renamed from: x */
    public static final EnumC18346a f71444x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC18346a[] f71445y;

    static {
        EnumC18346a enumC18346a = new EnumC18346a("EXPONENTIAL", 0);
        f71443w = enumC18346a;
        EnumC18346a enumC18346a2 = new EnumC18346a("LINEAR", 1);
        f71444x = enumC18346a2;
        EnumC18346a[] enumC18346aArr = {enumC18346a, enumC18346a2};
        f71445y = enumC18346aArr;
        AbstractC15751g.m44468u(enumC18346aArr);
    }

    public static EnumC18346a valueOf(String str) {
        return (EnumC18346a) Enum.valueOf(EnumC18346a.class, str);
    }

    public static EnumC18346a[] values() {
        return (EnumC18346a[]) f71445y.clone();
    }
}
