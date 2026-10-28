package l83;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l83.d */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC23458d {

    /* JADX INFO: renamed from: w */
    public static final EnumC23458d f92925w;

    /* JADX INFO: renamed from: x */
    public static final EnumC23458d f92926x;

    /* JADX INFO: renamed from: y */
    public static final EnumC23458d f92927y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC23458d[] f92928z;

    static {
        EnumC23458d enumC23458d = new EnumC23458d("WARNING", 0);
        f92925w = enumC23458d;
        EnumC23458d enumC23458d2 = new EnumC23458d("ERROR", 1);
        f92926x = enumC23458d2;
        EnumC23458d enumC23458d3 = new EnumC23458d("HIDDEN", 2);
        f92927y = enumC23458d3;
        EnumC23458d[] enumC23458dArr = {enumC23458d, enumC23458d2, enumC23458d3};
        f92928z = enumC23458dArr;
        AbstractC15751g.m44468u(enumC23458dArr);
    }

    public static EnumC23458d valueOf(String str) {
        return (EnumC23458d) Enum.valueOf(EnumC23458d.class, str);
    }

    public static EnumC23458d[] values() {
        return (EnumC23458d[]) f92928z.clone();
    }
}
