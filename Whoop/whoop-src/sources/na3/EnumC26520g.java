package na3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: na3.g */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC26520g {

    /* JADX INFO: renamed from: w */
    public static final EnumC26520g f105435w;

    /* JADX INFO: renamed from: x */
    public static final EnumC26520g f105436x;

    /* JADX INFO: renamed from: y */
    public static final EnumC26520g f105437y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC26520g[] f105438z;

    static {
        EnumC26520g enumC26520g = new EnumC26520g("FORCE_FLEXIBILITY", 0);
        f105435w = enumC26520g;
        EnumC26520g enumC26520g2 = new EnumC26520g("NULLABLE", 1);
        f105436x = enumC26520g2;
        EnumC26520g enumC26520g3 = new EnumC26520g("NOT_NULL", 2);
        f105437y = enumC26520g3;
        EnumC26520g[] enumC26520gArr = {enumC26520g, enumC26520g2, enumC26520g3};
        f105438z = enumC26520gArr;
        AbstractC15751g.m44468u(enumC26520gArr);
    }

    public static EnumC26520g valueOf(String str) {
        return (EnumC26520g) Enum.valueOf(EnumC26520g.class, str);
    }

    public static EnumC26520g[] values() {
        return (EnumC26520g[]) f105438z.clone();
    }
}
