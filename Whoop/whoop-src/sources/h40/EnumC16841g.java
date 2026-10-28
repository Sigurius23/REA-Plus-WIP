package h40;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h40.g */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC16841g {

    /* JADX INFO: renamed from: w */
    public static final EnumC16841g f64714w;

    /* JADX INFO: renamed from: x */
    public static final EnumC16841g f64715x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC16841g[] f64716y;

    static {
        EnumC16841g enumC16841g = new EnumC16841g("Programmatically", 0);
        f64714w = enumC16841g;
        EnumC16841g enumC16841g2 = new EnumC16841g("SwipedDownByUser", 1);
        f64715x = enumC16841g2;
        EnumC16841g[] enumC16841gArr = {enumC16841g, enumC16841g2};
        f64716y = enumC16841gArr;
        AbstractC15751g.m44468u(enumC16841gArr);
    }

    public static EnumC16841g valueOf(String str) {
        return (EnumC16841g) Enum.valueOf(EnumC16841g.class, str);
    }

    public static EnumC16841g[] values() {
        return (EnumC16841g[]) f64716y.clone();
    }
}
