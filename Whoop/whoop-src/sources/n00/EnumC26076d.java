package n00;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: n00.d */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC26076d {

    /* JADX INFO: renamed from: w */
    public static final EnumC26076d f103266w;

    /* JADX INFO: renamed from: x */
    public static final EnumC26076d f103267x;

    /* JADX INFO: renamed from: y */
    public static final EnumC26076d f103268y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC26076d[] f103269z;

    static {
        EnumC26076d enumC26076d = new EnumC26076d("InputtingPrimaryField", 0);
        f103266w = enumC26076d;
        EnumC26076d enumC26076d2 = new EnumC26076d("VerifyingEmail", 1);
        f103267x = enumC26076d2;
        EnumC26076d enumC26076d3 = new EnumC26076d("InputtingRemainingFields", 2);
        f103268y = enumC26076d3;
        EnumC26076d[] enumC26076dArr = {enumC26076d, enumC26076d2, enumC26076d3};
        f103269z = enumC26076dArr;
        AbstractC15751g.m44468u(enumC26076dArr);
    }

    public static EnumC26076d valueOf(String str) {
        return (EnumC26076d) Enum.valueOf(EnumC26076d.class, str);
    }

    public static EnumC26076d[] values() {
        return (EnumC26076d[]) f103269z.clone();
    }
}
