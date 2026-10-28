package aa3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: aa3.g1 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC0621g1 {

    /* JADX INFO: renamed from: w */
    public static final EnumC0621g1 f2183w;

    /* JADX INFO: renamed from: x */
    public static final EnumC0621g1 f2184x;

    /* JADX INFO: renamed from: y */
    public static final EnumC0621g1 f2185y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC0621g1[] f2186z;

    static {
        EnumC0621g1 enumC0621g1 = new EnumC0621g1("INVARIANT", 0);
        f2183w = enumC0621g1;
        EnumC0621g1 enumC0621g2 = new EnumC0621g1("IN", 1);
        f2184x = enumC0621g2;
        EnumC0621g1 enumC0621g3 = new EnumC0621g1("OUT", 2);
        f2185y = enumC0621g3;
        EnumC0621g1[] enumC0621g1Arr = {enumC0621g1, enumC0621g2, enumC0621g3};
        f2186z = enumC0621g1Arr;
        AbstractC15751g.m44468u(enumC0621g1Arr);
    }

    public static EnumC0621g1 valueOf(String str) {
        return (EnumC0621g1) Enum.valueOf(EnumC0621g1.class, str);
    }

    public static EnumC0621g1[] values() {
        return (EnumC0621g1[]) f2186z.clone();
    }
}
