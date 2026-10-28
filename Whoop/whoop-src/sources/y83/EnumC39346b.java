package y83;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: y83.b */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC39346b {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC39346b[] f169343E;

    /* JADX INFO: renamed from: w */
    public static final EnumC39346b f169344w;

    /* JADX INFO: renamed from: x */
    public static final EnumC39346b f169345x;

    /* JADX INFO: renamed from: y */
    public static final EnumC39346b f169346y;

    /* JADX INFO: renamed from: z */
    public static final EnumC39346b f169347z;

    static {
        EnumC39346b enumC39346b = new EnumC39346b("PRESENT", 0);
        f169344w = enumC39346b;
        EnumC39346b enumC39346b2 = new EnumC39346b("ABSENT", 1);
        f169345x = enumC39346b2;
        EnumC39346b enumC39346b3 = new EnumC39346b("PRESENT_OPTIONAL", 2);
        f169346y = enumC39346b3;
        EnumC39346b enumC39346b4 = new EnumC39346b("ABSENT_OPTIONAL", 3);
        f169347z = enumC39346b4;
        EnumC39346b[] enumC39346bArr = {enumC39346b, enumC39346b2, enumC39346b3, enumC39346b4};
        f169343E = enumC39346bArr;
        AbstractC15751g.m44468u(enumC39346bArr);
    }

    public static EnumC39346b valueOf(String str) {
        return (EnumC39346b) Enum.valueOf(EnumC39346b.class, str);
    }

    public static EnumC39346b[] values() {
        return (EnumC39346b[]) f169343E.clone();
    }
}
