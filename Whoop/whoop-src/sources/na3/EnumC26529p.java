package na3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: na3.p */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC26529p {

    /* JADX INFO: renamed from: w */
    public static final EnumC26529p f105464w;

    /* JADX INFO: renamed from: x */
    public static final EnumC26529p f105465x;

    /* JADX INFO: renamed from: y */
    public static final EnumC26529p f105466y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC26529p[] f105467z;

    static {
        EnumC26529p enumC26529p = new EnumC26529p("FLEXIBLE_LOWER", 0);
        f105464w = enumC26529p;
        EnumC26529p enumC26529p2 = new EnumC26529p("FLEXIBLE_UPPER", 1);
        f105465x = enumC26529p2;
        EnumC26529p enumC26529p3 = new EnumC26529p("INFLEXIBLE", 2);
        f105466y = enumC26529p3;
        EnumC26529p[] enumC26529pArr = {enumC26529p, enumC26529p2, enumC26529p3};
        f105467z = enumC26529pArr;
        AbstractC15751g.m44468u(enumC26529pArr);
    }

    public static EnumC26529p valueOf(String str) {
        return (EnumC26529p) Enum.valueOf(EnumC26529p.class, str);
    }

    public static EnumC26529p[] values() {
        return (EnumC26529p[]) f105467z.clone();
    }
}
