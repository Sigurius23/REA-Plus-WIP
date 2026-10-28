package p341nh;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: nh.d */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC26710d {

    /* JADX INFO: renamed from: w */
    public static final EnumC26710d f106208w;

    /* JADX INFO: renamed from: x */
    public static final EnumC26710d f106209x;

    /* JADX INFO: renamed from: y */
    public static final EnumC26710d f106210y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC26710d[] f106211z;

    static {
        EnumC26710d enumC26710d = new EnumC26710d("EXACT", 0);
        f106208w = enumC26710d;
        EnumC26710d enumC26710d2 = new EnumC26710d("INEXACT", 1);
        f106209x = enumC26710d2;
        EnumC26710d enumC26710d3 = new EnumC26710d("AUTOMATIC", 2);
        f106210y = enumC26710d3;
        EnumC26710d[] enumC26710dArr = {enumC26710d, enumC26710d2, enumC26710d3};
        f106211z = enumC26710dArr;
        AbstractC15751g.m44468u(enumC26710dArr);
    }

    public static EnumC26710d valueOf(String str) {
        return (EnumC26710d) Enum.valueOf(EnumC26710d.class, str);
    }

    public static EnumC26710d[] values() {
        return (EnumC26710d[]) f106211z.clone();
    }
}
