package p291l0;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l0.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC22954f0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC22954f0 f90593w;

    /* JADX INFO: renamed from: x */
    public static final EnumC22954f0 f90594x;

    /* JADX INFO: renamed from: y */
    public static final EnumC22954f0 f90595y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC22954f0[] f90596z;

    static {
        EnumC22954f0 enumC22954f0 = new EnumC22954f0("Vertical", 0);
        f90593w = enumC22954f0;
        EnumC22954f0 enumC22954f1 = new EnumC22954f0("Horizontal", 1);
        f90594x = enumC22954f1;
        EnumC22954f0 enumC22954f2 = new EnumC22954f0("Both", 2);
        f90595y = enumC22954f2;
        EnumC22954f0[] enumC22954f0Arr = {enumC22954f0, enumC22954f1, enumC22954f2};
        f90596z = enumC22954f0Arr;
        AbstractC15751g.m44468u(enumC22954f0Arr);
    }

    public static EnumC22954f0 valueOf(String str) {
        return (EnumC22954f0) Enum.valueOf(EnumC22954f0.class, str);
    }

    public static EnumC22954f0[] values() {
        return (EnumC22954f0[]) f90596z.clone();
    }
}
