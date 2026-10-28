package r93;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: r93.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC31106a0 {

    /* JADX INFO: renamed from: E */
    public static final EnumC31106a0 f128307E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ EnumC31106a0[] f128308F;

    /* JADX INFO: renamed from: w */
    public static final C31161v0 f128309w;

    /* JADX INFO: renamed from: x */
    public static final EnumC31106a0 f128310x;

    /* JADX INFO: renamed from: y */
    public static final EnumC31106a0 f128311y;

    /* JADX INFO: renamed from: z */
    public static final EnumC31106a0 f128312z;

    static {
        EnumC31106a0 enumC31106a0 = new EnumC31106a0("FINAL", 0);
        f128310x = enumC31106a0;
        EnumC31106a0 enumC31106a1 = new EnumC31106a0("SEALED", 1);
        f128311y = enumC31106a1;
        EnumC31106a0 enumC31106a2 = new EnumC31106a0("OPEN", 2);
        f128312z = enumC31106a2;
        EnumC31106a0 enumC31106a3 = new EnumC31106a0("ABSTRACT", 3);
        f128307E = enumC31106a3;
        EnumC31106a0[] enumC31106a0Arr = {enumC31106a0, enumC31106a1, enumC31106a2, enumC31106a3};
        f128308F = enumC31106a0Arr;
        AbstractC15751g.m44468u(enumC31106a0Arr);
        f128309w = new C31161v0(4);
    }

    public static EnumC31106a0 valueOf(String str) {
        return (EnumC31106a0) Enum.valueOf(EnumC31106a0.class, str);
    }

    public static EnumC31106a0[] values() {
        return (EnumC31106a0[]) f128308F.clone();
    }
}
