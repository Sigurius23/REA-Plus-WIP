package h20;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h20.k2 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC16684k2 {

    /* JADX INFO: renamed from: w */
    public static final EnumC16684k2 f64153w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC16684k2[] f64154x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC16684k2 EF0;

    static {
        EnumC16684k2 enumC16684k2 = new EnumC16684k2("Automatic", 0);
        EnumC16684k2 enumC16684k3 = new EnumC16684k2("AutomaticAsync", 1);
        f64153w = enumC16684k3;
        EnumC16684k2[] enumC16684k2Arr = {enumC16684k2, enumC16684k3, new EnumC16684k2("Manual", 2)};
        f64154x = enumC16684k2Arr;
        AbstractC15751g.m44468u(enumC16684k2Arr);
    }

    public static EnumC16684k2 valueOf(String str) {
        return (EnumC16684k2) Enum.valueOf(EnumC16684k2.class, str);
    }

    public static EnumC16684k2[] values() {
        return (EnumC16684k2[]) f64154x.clone();
    }
}
