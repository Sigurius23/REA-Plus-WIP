package j93;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j93.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC21466f0 {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC21466f0[] f82430E;

    /* JADX INFO: renamed from: w */
    public static final EnumC21466f0 f82431w;

    /* JADX INFO: renamed from: x */
    public static final EnumC21466f0 f82432x;

    /* JADX INFO: renamed from: y */
    public static final EnumC21466f0 f82433y;

    /* JADX INFO: renamed from: z */
    public static final EnumC21466f0 f82434z;

    static {
        EnumC21466f0 enumC21466f0 = new EnumC21466f0("PUBLIC", 0);
        f82431w = enumC21466f0;
        EnumC21466f0 enumC21466f1 = new EnumC21466f0("PROTECTED", 1);
        f82432x = enumC21466f1;
        EnumC21466f0 enumC21466f2 = new EnumC21466f0("INTERNAL", 2);
        f82433y = enumC21466f2;
        EnumC21466f0 enumC21466f3 = new EnumC21466f0("PRIVATE", 3);
        f82434z = enumC21466f3;
        EnumC21466f0[] enumC21466f0Arr = {enumC21466f0, enumC21466f1, enumC21466f2, enumC21466f3};
        f82430E = enumC21466f0Arr;
        AbstractC15751g.m44468u(enumC21466f0Arr);
    }

    public static EnumC21466f0 valueOf(String str) {
        return (EnumC21466f0) Enum.valueOf(EnumC21466f0.class, str);
    }

    public static EnumC21466f0[] values() {
        return (EnumC21466f0[]) f82430E.clone();
    }
}
