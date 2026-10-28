package ed3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ed3.p */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC13132p {

    /* JADX INFO: renamed from: E */
    public static final EnumC13132p f45426E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ EnumC13132p[] f45427F;

    /* JADX INFO: renamed from: w */
    public static final EnumC13132p f45428w;

    /* JADX INFO: renamed from: x */
    public static final EnumC13132p f45429x;

    /* JADX INFO: renamed from: y */
    public static final EnumC13132p f45430y;

    /* JADX INFO: renamed from: z */
    public static final EnumC13132p f45431z;

    static {
        EnumC13132p enumC13132p = new EnumC13132p("ACCEPTABLE", 0);
        f45428w = enumC13132p;
        EnumC13132p enumC13132p2 = new EnumC13132p("OPTIONAL", 1);
        f45429x = enumC13132p2;
        EnumC13132p enumC13132p3 = new EnumC13132p("COLLECTION", 2);
        f45430y = enumC13132p3;
        EnumC13132p enumC13132p4 = new EnumC13132p("LIST_ELEMENT", 3);
        f45431z = enumC13132p4;
        EnumC13132p enumC13132p5 = new EnumC13132p("NOT_NULL", 4);
        f45426E = enumC13132p5;
        EnumC13132p[] enumC13132pArr = {enumC13132p, enumC13132p2, enumC13132p3, enumC13132p4, enumC13132p5};
        f45427F = enumC13132pArr;
        AbstractC15751g.m44468u(enumC13132pArr);
    }

    public static EnumC13132p valueOf(String str) {
        return (EnumC13132p) Enum.valueOf(EnumC13132p.class, str);
    }

    public static EnumC13132p[] values() {
        return (EnumC13132p[]) f45427F.clone();
    }
}
