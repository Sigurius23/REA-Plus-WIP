package p163g1;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: g1.g3 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC15016g3 {

    /* JADX INFO: renamed from: w */
    public static final EnumC15016g3 f56185w;

    /* JADX INFO: renamed from: x */
    public static final EnumC15016g3 f56186x;

    /* JADX INFO: renamed from: y */
    public static final EnumC15016g3 f56187y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC15016g3[] f56188z;

    static {
        EnumC15016g3 enumC15016g3 = new EnumC15016g3("Focused", 0);
        f56185w = enumC15016g3;
        EnumC15016g3 enumC15016g4 = new EnumC15016g3("UnfocusedEmpty", 1);
        f56186x = enumC15016g4;
        EnumC15016g3 enumC15016g5 = new EnumC15016g3("UnfocusedNotEmpty", 2);
        f56187y = enumC15016g5;
        EnumC15016g3[] enumC15016g3Arr = {enumC15016g3, enumC15016g4, enumC15016g5};
        f56188z = enumC15016g3Arr;
        AbstractC15751g.m44468u(enumC15016g3Arr);
    }

    public static EnumC15016g3 valueOf(String str) {
        return (EnumC15016g3) Enum.valueOf(EnumC15016g3.class, str);
    }

    public static EnumC15016g3[] values() {
        return (EnumC15016g3[]) f56188z.clone();
    }
}
