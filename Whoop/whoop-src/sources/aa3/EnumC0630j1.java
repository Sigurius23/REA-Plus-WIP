package aa3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: aa3.j1 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC0630j1 {

    /* JADX INFO: renamed from: w */
    public static final EnumC0630j1 f2202w;

    /* JADX INFO: renamed from: x */
    public static final EnumC0630j1 f2203x;

    /* JADX INFO: renamed from: y */
    public static final EnumC0630j1 f2204y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC0630j1[] f2205z;

    static {
        EnumC0630j1 enumC0630j1 = new EnumC0630j1("WARNING", 0);
        f2202w = enumC0630j1;
        EnumC0630j1 enumC0630j2 = new EnumC0630j1("ERROR", 1);
        f2203x = enumC0630j2;
        EnumC0630j1 enumC0630j3 = new EnumC0630j1("HIDDEN", 2);
        f2204y = enumC0630j3;
        EnumC0630j1[] enumC0630j1Arr = {enumC0630j1, enumC0630j2, enumC0630j3};
        f2205z = enumC0630j1Arr;
        AbstractC15751g.m44468u(enumC0630j1Arr);
    }

    public static EnumC0630j1 valueOf(String str) {
        return (EnumC0630j1) Enum.valueOf(EnumC0630j1.class, str);
    }

    public static EnumC0630j1[] values() {
        return (EnumC0630j1[]) f2205z.clone();
    }
}
