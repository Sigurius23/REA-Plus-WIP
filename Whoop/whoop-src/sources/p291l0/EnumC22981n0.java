package p291l0;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l0.n0 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC22981n0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC22981n0 f90670w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC22981n0[] f90671x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC22981n0 EF0;

    static {
        EnumC22981n0 enumC22981n0 = new EnumC22981n0("Visible", 0);
        EnumC22981n0 enumC22981n1 = new EnumC22981n0("Clip", 1);
        f90670w = enumC22981n1;
        EnumC22981n0[] enumC22981n0Arr = {enumC22981n0, enumC22981n1, new EnumC22981n0("ExpandIndicator", 2), new EnumC22981n0("ExpandOrCollapseIndicator", 3)};
        f90671x = enumC22981n0Arr;
        AbstractC15751g.m44468u(enumC22981n0Arr);
    }

    public static EnumC22981n0 valueOf(String str) {
        return (EnumC22981n0) Enum.valueOf(EnumC22981n0.class, str);
    }

    public static EnumC22981n0[] values() {
        return (EnumC22981n0[]) f90671x.clone();
    }
}
