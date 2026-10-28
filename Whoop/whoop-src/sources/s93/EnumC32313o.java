package s93;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: s93.o */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC32313o {

    /* JADX INFO: renamed from: w */
    public static final EnumC32313o f133694w;

    /* JADX INFO: renamed from: x */
    public static final EnumC32313o f133695x;

    /* JADX INFO: renamed from: y */
    public static final EnumC32313o f133696y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC32313o[] f133697z;

    static {
        EnumC32313o enumC32313o = new EnumC32313o("RUNTIME", 0);
        f133694w = enumC32313o;
        EnumC32313o enumC32313o2 = new EnumC32313o("BINARY", 1);
        f133695x = enumC32313o2;
        EnumC32313o enumC32313o3 = new EnumC32313o("SOURCE", 2);
        f133696y = enumC32313o3;
        EnumC32313o[] enumC32313oArr = {enumC32313o, enumC32313o2, enumC32313o3};
        f133697z = enumC32313oArr;
        AbstractC15751g.m44468u(enumC32313oArr);
    }

    public static EnumC32313o valueOf(String str) {
        return (EnumC32313o) Enum.valueOf(EnumC32313o.class, str);
    }

    public static EnumC32313o[] values() {
        return (EnumC32313o[]) f133697z.clone();
    }
}
