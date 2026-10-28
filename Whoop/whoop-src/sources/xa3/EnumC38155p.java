package xa3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: xa3.p */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC38155p {

    /* JADX INFO: renamed from: w */
    public static final EnumC38155p f163397w;

    /* JADX INFO: renamed from: x */
    public static final EnumC38155p f163398x;

    /* JADX INFO: renamed from: y */
    public static final EnumC38155p f163399y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC38155p[] f163400z;

    static {
        EnumC38155p enumC38155p = new EnumC38155p("ALL", 0);
        f163397w = enumC38155p;
        EnumC38155p enumC38155p2 = new EnumC38155p("ONLY_NON_SYNTHESIZED", 1);
        f163398x = enumC38155p2;
        EnumC38155p enumC38155p3 = new EnumC38155p("NONE", 2);
        f163399y = enumC38155p3;
        EnumC38155p[] enumC38155pArr = {enumC38155p, enumC38155p2, enumC38155p3};
        f163400z = enumC38155pArr;
        AbstractC15751g.m44468u(enumC38155pArr);
    }

    public static EnumC38155p valueOf(String str) {
        return (EnumC38155p) Enum.valueOf(EnumC38155p.class, str);
    }

    public static EnumC38155p[] values() {
        return (EnumC38155p[]) f163400z.clone();
    }
}
