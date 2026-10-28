package x20;

import ge3.AbstractC15751g;
import y82.EnumC39339b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x20.o */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC37847o {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC37847o[] f162018E;

    /* JADX INFO: renamed from: w */
    public static final EnumC37847o f162019w;

    /* JADX INFO: renamed from: x */
    public static final EnumC37847o f162020x;

    /* JADX INFO: renamed from: y */
    public static final EnumC37847o f162021y;

    /* JADX INFO: renamed from: z */
    public static final EnumC37847o f162022z;

    static {
        EnumC37847o enumC37847o = new EnumC37847o("Active", 0);
        f162019w = enumC37847o;
        EnumC37847o enumC37847o2 = new EnumC37847o(EnumC39339b.RESULT_SUCCESS, 1);
        f162020x = enumC37847o2;
        EnumC37847o enumC37847o3 = new EnumC37847o(EnumC39339b.RESULT_FAILURE, 2);
        f162021y = enumC37847o3;
        EnumC37847o enumC37847o4 = new EnumC37847o("Canceled", 3);
        f162022z = enumC37847o4;
        EnumC37847o[] enumC37847oArr = {enumC37847o, enumC37847o2, enumC37847o3, enumC37847o4};
        f162018E = enumC37847oArr;
        AbstractC15751g.m44468u(enumC37847oArr);
    }

    public static EnumC37847o valueOf(String str) {
        return (EnumC37847o) Enum.valueOf(EnumC37847o.class, str);
    }

    public static EnumC37847o[] values() {
        return (EnumC37847o[]) f162018E.clone();
    }
}
