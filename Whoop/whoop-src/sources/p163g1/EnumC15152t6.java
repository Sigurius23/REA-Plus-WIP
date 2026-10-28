package p163g1;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: g1.t6 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC15152t6 {

    /* JADX INFO: renamed from: w */
    public static final EnumC15152t6 f56832w;

    /* JADX INFO: renamed from: x */
    public static final EnumC15152t6 f56833x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC15152t6[] f56834y;

    static {
        EnumC15152t6 enumC15152t6 = new EnumC15152t6("Dismissed", 0);
        f56832w = enumC15152t6;
        EnumC15152t6 enumC15152t7 = new EnumC15152t6("ActionPerformed", 1);
        f56833x = enumC15152t7;
        EnumC15152t6[] enumC15152t6Arr = {enumC15152t6, enumC15152t7};
        f56834y = enumC15152t6Arr;
        AbstractC15751g.m44468u(enumC15152t6Arr);
    }

    public static EnumC15152t6 valueOf(String str) {
        return (EnumC15152t6) Enum.valueOf(EnumC15152t6.class, str);
    }

    public static EnumC15152t6[] values() {
        return (EnumC15152t6[]) f56834y.clone();
    }
}
