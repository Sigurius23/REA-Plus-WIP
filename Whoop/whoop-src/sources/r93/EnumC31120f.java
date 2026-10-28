package r93;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: r93.f */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC31120f {

    /* JADX INFO: renamed from: E */
    public static final EnumC31120f f128325E;

    /* JADX INFO: renamed from: F */
    public static final EnumC31120f f128326F;

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ EnumC31120f[] f128327G;

    /* JADX INFO: renamed from: w */
    public static final EnumC31120f f128328w;

    /* JADX INFO: renamed from: x */
    public static final EnumC31120f f128329x;

    /* JADX INFO: renamed from: y */
    public static final EnumC31120f f128330y;

    /* JADX INFO: renamed from: z */
    public static final EnumC31120f f128331z;

    static {
        EnumC31120f enumC31120f = new EnumC31120f("CLASS", 0);
        f128328w = enumC31120f;
        EnumC31120f enumC31120f2 = new EnumC31120f("INTERFACE", 1);
        f128329x = enumC31120f2;
        EnumC31120f enumC31120f3 = new EnumC31120f("ENUM_CLASS", 2);
        f128330y = enumC31120f3;
        EnumC31120f enumC31120f4 = new EnumC31120f("ENUM_ENTRY", 3);
        f128331z = enumC31120f4;
        EnumC31120f enumC31120f5 = new EnumC31120f("ANNOTATION_CLASS", 4);
        f128325E = enumC31120f5;
        EnumC31120f enumC31120f6 = new EnumC31120f("OBJECT", 5);
        f128326F = enumC31120f6;
        EnumC31120f[] enumC31120fArr = {enumC31120f, enumC31120f2, enumC31120f3, enumC31120f4, enumC31120f5, enumC31120f6};
        f128327G = enumC31120fArr;
        AbstractC15751g.m44468u(enumC31120fArr);
    }

    public static EnumC31120f valueOf(String str) {
        return (EnumC31120f) Enum.valueOf(EnumC31120f.class, str);
    }

    public static EnumC31120f[] values() {
        return (EnumC31120f[]) f128327G.clone();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m95867a() {
        return this == f128326F || this == f128331z;
    }
}
