package p132f0;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: f0.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC13840z0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC13840z0 f49374w;

    /* JADX INFO: renamed from: x */
    public static final EnumC13840z0 f49375x;

    /* JADX INFO: renamed from: y */
    public static final EnumC13840z0 f49376y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC13840z0[] f49377z;

    static {
        EnumC13840z0 enumC13840z0 = new EnumC13840z0("Default", 0);
        f49374w = enumC13840z0;
        EnumC13840z0 enumC13840z1 = new EnumC13840z0("UserInput", 1);
        f49375x = enumC13840z1;
        EnumC13840z0 enumC13840z2 = new EnumC13840z0("PreventUserInput", 2);
        f49376y = enumC13840z2;
        EnumC13840z0[] enumC13840z0Arr = {enumC13840z0, enumC13840z1, enumC13840z2};
        f49377z = enumC13840z0Arr;
        AbstractC15751g.m44468u(enumC13840z0Arr);
    }

    public static EnumC13840z0 valueOf(String str) {
        return (EnumC13840z0) Enum.valueOf(EnumC13840z0.class, str);
    }

    public static EnumC13840z0[] values() {
        return (EnumC13840z0[]) f49377z.clone();
    }
}
