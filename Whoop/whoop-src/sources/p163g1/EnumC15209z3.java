package p163g1;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: g1.z3 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC15209z3 {

    /* JADX INFO: renamed from: w */
    public static final EnumC15209z3 f57106w;

    /* JADX INFO: renamed from: x */
    public static final EnumC15209z3 f57107x;

    /* JADX INFO: renamed from: y */
    public static final EnumC15209z3 f57108y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC15209z3[] f57109z;

    static {
        EnumC15209z3 enumC15209z3 = new EnumC15209z3("Hidden", 0);
        f57106w = enumC15209z3;
        EnumC15209z3 enumC15209z4 = new EnumC15209z3("Expanded", 1);
        f57107x = enumC15209z4;
        EnumC15209z3 enumC15209z5 = new EnumC15209z3("HalfExpanded", 2);
        f57108y = enumC15209z5;
        EnumC15209z3[] enumC15209z3Arr = {enumC15209z3, enumC15209z4, enumC15209z5};
        f57109z = enumC15209z3Arr;
        AbstractC15751g.m44468u(enumC15209z3Arr);
    }

    public static EnumC15209z3 valueOf(String str) {
        return (EnumC15209z3) Enum.valueOf(EnumC15209z3.class, str);
    }

    public static EnumC15209z3[] values() {
        return (EnumC15209z3[]) f57109z.clone();
    }
}
