package h20;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h20.t2 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC16738t2 {

    /* JADX INFO: renamed from: w */
    public static final EnumC16738t2 f64291w;

    /* JADX INFO: renamed from: x */
    public static final EnumC16738t2 f64292x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC16738t2[] f64293y;

    static {
        EnumC16738t2 enumC16738t2 = new EnumC16738t2("OnSession", 0);
        f64291w = enumC16738t2;
        EnumC16738t2 enumC16738t3 = new EnumC16738t2("OffSession", 1);
        f64292x = enumC16738t3;
        EnumC16738t2[] enumC16738t2Arr = {enumC16738t2, enumC16738t3, new EnumC16738t2("None", 2)};
        f64293y = enumC16738t2Arr;
        AbstractC15751g.m44468u(enumC16738t2Arr);
    }

    public static EnumC16738t2 valueOf(String str) {
        return (EnumC16738t2) Enum.valueOf(EnumC16738t2.class, str);
    }

    public static EnumC16738t2[] values() {
        return (EnumC16738t2[]) f64293y.clone();
    }
}
