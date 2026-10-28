package p218ic;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ic.l */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC18368l {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC18368l[] f71502E;

    /* JADX INFO: renamed from: w */
    public static final EnumC18368l f71503w;

    /* JADX INFO: renamed from: x */
    public static final EnumC18368l f71504x;

    /* JADX INFO: renamed from: y */
    public static final EnumC18368l f71505y;

    /* JADX INFO: renamed from: z */
    public static final EnumC18368l f71506z;

    static {
        EnumC18368l enumC18368l = new EnumC18368l("REPLACE", 0);
        f71503w = enumC18368l;
        EnumC18368l enumC18368l2 = new EnumC18368l("KEEP", 1);
        f71504x = enumC18368l2;
        EnumC18368l enumC18368l3 = new EnumC18368l("APPEND", 2);
        f71505y = enumC18368l3;
        EnumC18368l enumC18368l4 = new EnumC18368l("APPEND_OR_REPLACE", 3);
        f71506z = enumC18368l4;
        EnumC18368l[] enumC18368lArr = {enumC18368l, enumC18368l2, enumC18368l3, enumC18368l4};
        f71502E = enumC18368lArr;
        AbstractC15751g.m44468u(enumC18368lArr);
    }

    public static EnumC18368l valueOf(String str) {
        return (EnumC18368l) Enum.valueOf(EnumC18368l.class, str);
    }

    public static EnumC18368l[] values() {
        return (EnumC18368l[]) f71502E.clone();
    }
}
