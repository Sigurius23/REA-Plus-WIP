package p271k3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: k3.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC22167a {

    /* JADX INFO: renamed from: w */
    public static final EnumC22167a f85977w;

    /* JADX INFO: renamed from: x */
    public static final EnumC22167a f85978x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC22167a[] f85979y;

    static {
        EnumC22167a enumC22167a = new EnumC22167a("On", 0);
        f85977w = enumC22167a;
        EnumC22167a enumC22167a2 = new EnumC22167a("Off", 1);
        f85978x = enumC22167a2;
        EnumC22167a[] enumC22167aArr = {enumC22167a, enumC22167a2, new EnumC22167a("Indeterminate", 2)};
        f85979y = enumC22167aArr;
        AbstractC15751g.m44468u(enumC22167aArr);
    }

    public static EnumC22167a valueOf(String str) {
        return (EnumC22167a) Enum.valueOf(EnumC22167a.class, str);
    }

    public static EnumC22167a[] values() {
        return (EnumC22167a[]) f85979y.clone();
    }
}
