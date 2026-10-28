package va3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: va3.m */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC35855m {

    /* JADX INFO: renamed from: w */
    public static final EnumC35855m f152658w;

    /* JADX INFO: renamed from: x */
    public static final EnumC35855m f152659x;

    /* JADX INFO: renamed from: y */
    public static final EnumC35855m f152660y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC35855m[] f152661z;

    static {
        EnumC35855m enumC35855m = new EnumC35855m("BEGINNING", 0);
        f152658w = enumC35855m;
        EnumC35855m enumC35855m2 = new EnumC35855m("MIDDLE", 1);
        f152659x = enumC35855m2;
        EnumC35855m enumC35855m3 = new EnumC35855m("AFTER_DOT", 2);
        f152660y = enumC35855m3;
        EnumC35855m[] enumC35855mArr = {enumC35855m, enumC35855m2, enumC35855m3};
        f152661z = enumC35855mArr;
        AbstractC15751g.m44468u(enumC35855mArr);
    }

    public static EnumC35855m valueOf(String str) {
        return (EnumC35855m) Enum.valueOf(EnumC35855m.class, str);
    }

    public static EnumC35855m[] values() {
        return (EnumC35855m[]) f152661z.clone();
    }
}
