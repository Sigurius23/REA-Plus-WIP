package h20;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h20.j1 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC16677j1 {

    /* JADX INFO: renamed from: w */
    public static final EnumC16677j1 f64131w;

    /* JADX INFO: renamed from: x */
    public static final EnumC16677j1 f64132x;

    /* JADX INFO: renamed from: y */
    public static final EnumC16677j1 f64133y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC16677j1[] f64134z;

    static {
        EnumC16677j1 enumC16677j1 = new EnumC16677j1("Automatic", 0);
        f64131w = enumC16677j1;
        EnumC16677j1 enumC16677j2 = new EnumC16677j1("Never", 1);
        f64132x = enumC16677j2;
        EnumC16677j1 enumC16677j3 = new EnumC16677j1("Full", 2);
        f64133y = enumC16677j3;
        EnumC16677j1[] enumC16677j1Arr = {enumC16677j1, enumC16677j2, enumC16677j3};
        f64134z = enumC16677j1Arr;
        AbstractC15751g.m44468u(enumC16677j1Arr);
    }

    public static EnumC16677j1 valueOf(String str) {
        return (EnumC16677j1) Enum.valueOf(EnumC16677j1.class, str);
    }

    public static EnumC16677j1[] values() {
        return (EnumC16677j1[]) f64134z.clone();
    }
}
