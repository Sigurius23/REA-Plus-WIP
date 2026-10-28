package p291l0;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l0.c1 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC22943c1 {

    /* JADX INFO: renamed from: w */
    public static final EnumC22943c1 f90551w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC22943c1[] f90552x;

    static {
        EnumC22943c1 enumC22943c1 = new EnumC22943c1("Horizontal", 0);
        f90551w = enumC22943c1;
        EnumC22943c1[] enumC22943c1Arr = {enumC22943c1, new EnumC22943c1("Vertical", 1)};
        f90552x = enumC22943c1Arr;
        AbstractC15751g.m44468u(enumC22943c1Arr);
    }

    public static EnumC22943c1 valueOf(String str) {
        return (EnumC22943c1) Enum.valueOf(EnumC22943c1.class, str);
    }

    public static EnumC22943c1[] values() {
        return (EnumC22943c1[]) f90552x.clone();
    }
}
