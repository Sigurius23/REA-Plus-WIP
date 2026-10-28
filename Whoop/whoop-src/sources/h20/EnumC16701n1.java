package h20;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h20.n1 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC16701n1 {

    /* JADX INFO: renamed from: w */
    public static final EnumC16701n1 f64226w;

    /* JADX INFO: renamed from: x */
    public static final EnumC16701n1 f64227x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC16701n1[] f64228y;

    static {
        EnumC16701n1 enumC16701n1 = new EnumC16701n1("DEFAULT", 0);
        f64226w = enumC16701n1;
        EnumC16701n1 enumC16701n2 = new EnumC16701n1("WHITE", 1);
        f64227x = enumC16701n2;
        EnumC16701n1[] enumC16701n1Arr = {enumC16701n1, enumC16701n2};
        f64228y = enumC16701n1Arr;
        AbstractC15751g.m44468u(enumC16701n1Arr);
    }

    public static EnumC16701n1 valueOf(String str) {
        return (EnumC16701n1) Enum.valueOf(EnumC16701n1.class, str);
    }

    public static EnumC16701n1[] values() {
        return (EnumC16701n1[]) f64228y.clone();
    }
}
