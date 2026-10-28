package p354o1;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o1.n */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC27375n {

    /* JADX INFO: renamed from: E */
    public static final EnumC27375n f109946E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ EnumC27375n[] f109947F;

    /* JADX INFO: renamed from: w */
    public static final EnumC27375n f109948w;

    /* JADX INFO: renamed from: x */
    public static final EnumC27375n f109949x;

    /* JADX INFO: renamed from: y */
    public static final EnumC27375n f109950y;

    /* JADX INFO: renamed from: z */
    public static final EnumC27375n f109951z;

    static {
        EnumC27375n enumC27375n = new EnumC27375n("DefaultSpatial", 0);
        f109948w = enumC27375n;
        EnumC27375n enumC27375n2 = new EnumC27375n("FastSpatial", 1);
        f109949x = enumC27375n2;
        EnumC27375n enumC27375n3 = new EnumC27375n("SlowSpatial", 2);
        EnumC27375n enumC27375n4 = new EnumC27375n("DefaultEffects", 3);
        f109950y = enumC27375n4;
        EnumC27375n enumC27375n5 = new EnumC27375n("FastEffects", 4);
        f109951z = enumC27375n5;
        EnumC27375n enumC27375n6 = new EnumC27375n("SlowEffects", 5);
        f109946E = enumC27375n6;
        EnumC27375n[] enumC27375nArr = {enumC27375n, enumC27375n2, enumC27375n3, enumC27375n4, enumC27375n5, enumC27375n6};
        f109947F = enumC27375nArr;
        AbstractC15751g.m44468u(enumC27375nArr);
    }

    public static EnumC27375n valueOf(String str) {
        return (EnumC27375n) Enum.valueOf(EnumC27375n.class, str);
    }

    public static EnumC27375n[] values() {
        return (EnumC27375n[]) f109947F.clone();
    }
}
