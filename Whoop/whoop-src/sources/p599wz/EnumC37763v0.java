package p599wz;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: wz.v0 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC37763v0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC37763v0 f161743w;

    /* JADX INFO: renamed from: x */
    public static final EnumC37763v0 f161744x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC37763v0[] f161745y;

    static {
        EnumC37763v0 enumC37763v0 = new EnumC37763v0("Card", 0);
        f161743w = enumC37763v0;
        EnumC37763v0 enumC37763v1 = new EnumC37763v0("BankAccount", 1);
        f161744x = enumC37763v1;
        EnumC37763v0[] enumC37763v0Arr = {enumC37763v0, enumC37763v1};
        f161745y = enumC37763v0Arr;
        AbstractC15751g.m44468u(enumC37763v0Arr);
    }

    public static EnumC37763v0 valueOf(String str) {
        return (EnumC37763v0) Enum.valueOf(EnumC37763v0.class, str);
    }

    public static EnumC37763v0[] values() {
        return (EnumC37763v0[]) f161745y.clone();
    }
}
