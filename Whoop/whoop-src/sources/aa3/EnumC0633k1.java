package aa3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: aa3.k1 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC0633k1 {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC0633k1[] f2208E;

    /* JADX INFO: renamed from: w */
    public static final EnumC0633k1 f2209w;

    /* JADX INFO: renamed from: x */
    public static final EnumC0633k1 f2210x;

    /* JADX INFO: renamed from: y */
    public static final EnumC0633k1 f2211y;

    /* JADX INFO: renamed from: z */
    public static final EnumC0633k1 f2212z;

    static {
        EnumC0633k1 enumC0633k1 = new EnumC0633k1("LANGUAGE_VERSION", 0);
        f2209w = enumC0633k1;
        EnumC0633k1 enumC0633k2 = new EnumC0633k1("COMPILER_VERSION", 1);
        f2210x = enumC0633k2;
        EnumC0633k1 enumC0633k3 = new EnumC0633k1("API_VERSION", 2);
        f2211y = enumC0633k3;
        EnumC0633k1 enumC0633k4 = new EnumC0633k1("UNKNOWN", 3);
        f2212z = enumC0633k4;
        EnumC0633k1[] enumC0633k1Arr = {enumC0633k1, enumC0633k2, enumC0633k3, enumC0633k4};
        f2208E = enumC0633k1Arr;
        AbstractC15751g.m44468u(enumC0633k1Arr);
    }

    public static EnumC0633k1 valueOf(String str) {
        return (EnumC0633k1) Enum.valueOf(EnumC0633k1.class, str);
    }

    public static EnumC0633k1[] values() {
        return (EnumC0633k1[]) f2208E.clone();
    }
}
