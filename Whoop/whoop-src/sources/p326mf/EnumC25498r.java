package p326mf;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: mf.r */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC25498r {

    /* JADX INFO: renamed from: w */
    public static final EnumC25498r f99840w;

    /* JADX INFO: renamed from: x */
    public static final EnumC25498r f99841x;

    /* JADX INFO: renamed from: y */
    public static final EnumC25498r f99842y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC25498r[] f99843z;

    static {
        EnumC25498r enumC25498r = new EnumC25498r("GET", 0);
        f99840w = enumC25498r;
        EnumC25498r enumC25498r2 = new EnumC25498r("POST", 1);
        f99841x = enumC25498r2;
        EnumC25498r enumC25498r3 = new EnumC25498r("PUT", 2);
        f99842y = enumC25498r3;
        EnumC25498r[] enumC25498rArr = {enumC25498r, enumC25498r2, enumC25498r3, new EnumC25498r("PATCH", 3), new EnumC25498r("DELETE", 4), new EnumC25498r("HEAD", 5), new EnumC25498r("OPTIONS", 6)};
        f99843z = enumC25498rArr;
        AbstractC15751g.m44468u(enumC25498rArr);
    }

    public static EnumC25498r valueOf(String str) {
        return (EnumC25498r) Enum.valueOf(EnumC25498r.class, str);
    }

    public static EnumC25498r[] values() {
        return (EnumC25498r[]) f99843z.clone();
    }
}
