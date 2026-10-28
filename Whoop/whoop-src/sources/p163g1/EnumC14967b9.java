package p163g1;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: g1.b9 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC14967b9 {

    /* JADX INFO: renamed from: w */
    public static final EnumC14967b9 f55875w;

    /* JADX INFO: renamed from: x */
    public static final EnumC14967b9 f55876x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC14967b9[] f55877y;

    static {
        EnumC14967b9 enumC14967b9 = new EnumC14967b9("Filled", 0);
        f55875w = enumC14967b9;
        EnumC14967b9 enumC14967b10 = new EnumC14967b9("Outlined", 1);
        f55876x = enumC14967b10;
        EnumC14967b9[] enumC14967b9Arr = {enumC14967b9, enumC14967b10};
        f55877y = enumC14967b9Arr;
        AbstractC15751g.m44468u(enumC14967b9Arr);
    }

    public static EnumC14967b9 valueOf(String str) {
        return (EnumC14967b9) Enum.valueOf(EnumC14967b9.class, str);
    }

    public static EnumC14967b9[] values() {
        return (EnumC14967b9[]) f55877y.clone();
    }
}
