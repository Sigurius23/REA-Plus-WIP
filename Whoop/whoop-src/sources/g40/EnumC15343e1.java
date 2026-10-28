package g40;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: g40.e1 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC15343e1 {

    /* JADX INFO: renamed from: w */
    public static final EnumC15343e1 f57652w;

    /* JADX INFO: renamed from: x */
    public static final EnumC15343e1 f57653x;

    /* JADX INFO: renamed from: y */
    public static final EnumC15343e1 f57654y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC15343e1[] f57655z;

    static {
        EnumC15343e1 enumC15343e1 = new EnumC15343e1("NORMAL", 0);
        f57652w = enumC15343e1;
        EnumC15343e1 enumC15343e2 = new EnumC15343e1("ERROR", 1);
        f57653x = enumC15343e2;
        EnumC15343e1 enumC15343e3 = new EnumC15343e1("WARNING", 2);
        f57654y = enumC15343e3;
        EnumC15343e1[] enumC15343e1Arr = {enumC15343e1, enumC15343e2, enumC15343e3};
        f57655z = enumC15343e1Arr;
        AbstractC15751g.m44468u(enumC15343e1Arr);
    }

    public static EnumC15343e1 valueOf(String str) {
        return (EnumC15343e1) Enum.valueOf(EnumC15343e1.class, str);
    }

    public static EnumC15343e1[] values() {
        return (EnumC15343e1[]) f57655z.clone();
    }
}
