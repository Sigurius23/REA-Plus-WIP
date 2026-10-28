package p292l1;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l1.x3 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC23202x3 {

    /* JADX INFO: renamed from: w */
    public static final EnumC23202x3 f91820w;

    /* JADX INFO: renamed from: x */
    public static final EnumC23202x3 f91821x;

    /* JADX INFO: renamed from: y */
    public static final EnumC23202x3 f91822y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC23202x3[] f91823z;

    static {
        EnumC23202x3 enumC23202x3 = new EnumC23202x3("Hidden", 0);
        f91820w = enumC23202x3;
        EnumC23202x3 enumC23202x4 = new EnumC23202x3("Expanded", 1);
        f91821x = enumC23202x4;
        EnumC23202x3 enumC23202x5 = new EnumC23202x3("PartiallyExpanded", 2);
        f91822y = enumC23202x5;
        EnumC23202x3[] enumC23202x3Arr = {enumC23202x3, enumC23202x4, enumC23202x5};
        f91823z = enumC23202x3Arr;
        AbstractC15751g.m44468u(enumC23202x3Arr);
    }

    public static EnumC23202x3 valueOf(String str) {
        return (EnumC23202x3) Enum.valueOf(EnumC23202x3.class, str);
    }

    public static EnumC23202x3[] values() {
        return (EnumC23202x3[]) f91823z.clone();
    }
}
