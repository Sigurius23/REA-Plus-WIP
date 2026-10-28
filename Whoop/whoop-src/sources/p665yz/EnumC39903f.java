package p665yz;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: yz.f */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC39903f {

    /* JADX INFO: renamed from: w */
    public static final EnumC39903f f172298w;

    /* JADX INFO: renamed from: x */
    public static final EnumC39903f f172299x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC39903f[] f172300y;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC39903f EF0;

    static {
        EnumC39903f enumC39903f = new EnumC39903f("RequiresSignUp", 0);
        EnumC39903f enumC39903f2 = new EnumC39903f("RequiresVerification", 1);
        f172298w = enumC39903f2;
        EnumC39903f enumC39903f3 = new EnumC39903f("Verified", 2);
        f172299x = enumC39903f3;
        EnumC39903f[] enumC39903fArr = {enumC39903f, enumC39903f2, enumC39903f3};
        f172300y = enumC39903fArr;
        AbstractC15751g.m44468u(enumC39903fArr);
    }

    public static EnumC39903f valueOf(String str) {
        return (EnumC39903f) Enum.valueOf(EnumC39903f.class, str);
    }

    public static EnumC39903f[] values() {
        return (EnumC39903f[]) f172300y.clone();
    }
}
