package d30;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: d30.o0 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC11553o0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC11553o0 f37266w;

    /* JADX INFO: renamed from: x */
    public static final EnumC11553o0 f37267x;

    /* JADX INFO: renamed from: y */
    public static final EnumC11553o0 f37268y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC11553o0[] f37269z;

    static {
        EnumC11553o0 enumC11553o0 = new EnumC11553o0("NONE", 0);
        f37266w = enumC11553o0;
        EnumC11553o0 enumC11553o1 = new EnumC11553o0("MANAGE_ONE", 1);
        f37267x = enumC11553o1;
        EnumC11553o0 enumC11553o2 = new EnumC11553o0("MANAGE_ALL", 2);
        f37268y = enumC11553o2;
        EnumC11553o0[] enumC11553o0Arr = {enumC11553o0, enumC11553o1, enumC11553o2};
        f37269z = enumC11553o0Arr;
        AbstractC15751g.m44468u(enumC11553o0Arr);
    }

    public static EnumC11553o0 valueOf(String str) {
        return (EnumC11553o0) Enum.valueOf(EnumC11553o0.class, str);
    }

    public static EnumC11553o0[] values() {
        return (EnumC11553o0[]) f37269z.clone();
    }
}
