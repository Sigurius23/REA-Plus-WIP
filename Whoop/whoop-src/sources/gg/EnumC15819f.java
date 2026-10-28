package gg;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gg.f */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC15819f {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC15819f[] f59710E;

    /* JADX INFO: renamed from: w */
    public static final EnumC15819f f59711w;

    /* JADX INFO: renamed from: x */
    public static final EnumC15819f f59712x;

    /* JADX INFO: renamed from: y */
    public static final EnumC15819f f59713y;

    /* JADX INFO: renamed from: z */
    public static final EnumC15819f f59714z;

    static {
        EnumC15819f enumC15819f = new EnumC15819f("ServerSide", 0);
        f59711w = enumC15819f;
        EnumC15819f enumC15819f2 = new EnumC15819f("ClientSide", 1);
        f59712x = enumC15819f2;
        EnumC15819f enumC15819f3 = new EnumC15819f("Throttling", 2);
        f59713y = enumC15819f3;
        EnumC15819f enumC15819f4 = new EnumC15819f("Transient", 3);
        f59714z = enumC15819f4;
        EnumC15819f[] enumC15819fArr = {enumC15819f, enumC15819f2, enumC15819f3, enumC15819f4};
        f59710E = enumC15819fArr;
        AbstractC15751g.m44468u(enumC15819fArr);
    }

    public static EnumC15819f valueOf(String str) {
        return (EnumC15819f) Enum.valueOf(EnumC15819f.class, str);
    }

    public static EnumC15819f[] values() {
        return (EnumC15819f[]) f59710E.clone();
    }
}
