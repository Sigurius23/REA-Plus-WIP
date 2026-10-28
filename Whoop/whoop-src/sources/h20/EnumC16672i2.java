package h20;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h20.i2 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC16672i2 {

    /* JADX INFO: renamed from: w */
    public static final C16735t f64118w;

    /* JADX INFO: renamed from: x */
    public static final EnumC16672i2 f64119x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC16672i2[] f64120y;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC16672i2 EF0;

    static {
        EnumC16672i2 enumC16672i2 = new EnumC16672i2("Filled", 0);
        EnumC16672i2[] enumC16672i2Arr = {enumC16672i2, new EnumC16672i2("Outlined", 1)};
        f64120y = enumC16672i2Arr;
        AbstractC15751g.m44468u(enumC16672i2Arr);
        f64118w = new C16735t();
        f64119x = enumC16672i2;
    }

    public static EnumC16672i2 valueOf(String str) {
        return (EnumC16672i2) Enum.valueOf(EnumC16672i2.class, str);
    }

    public static EnumC16672i2[] values() {
        return (EnumC16672i2[]) f64120y.clone();
    }
}
