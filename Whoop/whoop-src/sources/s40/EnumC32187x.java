package s40;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: s40.x */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC32187x {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC32187x[] f133300E;

    /* JADX INFO: renamed from: w */
    public static final EnumC32187x f133301w;

    /* JADX INFO: renamed from: x */
    public static final EnumC32187x f133302x;

    /* JADX INFO: renamed from: y */
    public static final EnumC32187x f133303y;

    /* JADX INFO: renamed from: z */
    public static final EnumC32187x f133304z;

    static {
        EnumC32187x enumC32187x = new EnumC32187x("Number", 0);
        f133301w = enumC32187x;
        EnumC32187x enumC32187x2 = new EnumC32187x("Expiry", 1);
        f133302x = enumC32187x2;
        EnumC32187x enumC32187x3 = new EnumC32187x("Cvc", 2);
        f133303y = enumC32187x3;
        EnumC32187x enumC32187x4 = new EnumC32187x("Postal", 3);
        f133304z = enumC32187x4;
        EnumC32187x[] enumC32187xArr = {enumC32187x, enumC32187x2, enumC32187x3, enumC32187x4};
        f133300E = enumC32187xArr;
        AbstractC15751g.m44468u(enumC32187xArr);
    }

    public static EnumC32187x valueOf(String str) {
        return (EnumC32187x) Enum.valueOf(EnumC32187x.class, str);
    }

    public static EnumC32187x[] values() {
        return (EnumC32187x[]) f133300E.clone();
    }
}
