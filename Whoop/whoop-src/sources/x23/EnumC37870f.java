package x23;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x23.f */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC37870f {

    /* JADX INFO: renamed from: w */
    public static final EnumC37870f f162183w;

    /* JADX INFO: renamed from: x */
    public static final EnumC37870f f162184x;

    /* JADX INFO: renamed from: y */
    public static final EnumC37870f f162185y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC37870f[] f162186z;

    static {
        EnumC37870f enumC37870f = new EnumC37870f("NOT_STARTED", 0);
        f162183w = enumC37870f;
        EnumC37870f enumC37870f2 = new EnumC37870f("IN_PROGRESS", 1);
        f162184x = enumC37870f2;
        EnumC37870f enumC37870f3 = new EnumC37870f("COMPLETED", 2);
        f162185y = enumC37870f3;
        EnumC37870f[] enumC37870fArr = {enumC37870f, enumC37870f2, enumC37870f3};
        f162186z = enumC37870fArr;
        AbstractC15751g.m44468u(enumC37870fArr);
    }

    public static EnumC37870f valueOf(String str) {
        return (EnumC37870f) Enum.valueOf(EnumC37870f.class, str);
    }

    public static EnumC37870f[] values() {
        return (EnumC37870f[]) f162186z.clone();
    }
}
