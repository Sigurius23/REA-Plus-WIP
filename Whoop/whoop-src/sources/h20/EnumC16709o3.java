package h20;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h20.o3 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC16709o3 {

    /* JADX INFO: renamed from: w */
    public static final EnumC16709o3 f64237w;

    /* JADX INFO: renamed from: x */
    public static final EnumC16709o3 f64238x;

    /* JADX INFO: renamed from: y */
    public static final EnumC16709o3 f64239y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC16709o3[] f64240z;

    static {
        EnumC16709o3 enumC16709o3 = new EnumC16709o3("Link", 0);
        f64237w = enumC16709o3;
        EnumC16709o3 enumC16709o4 = new EnumC16709o3("GooglePay", 1);
        f64238x = enumC16709o4;
        EnumC16709o3 enumC16709o5 = new EnumC16709o3("ShopPay", 2);
        f64239y = enumC16709o5;
        EnumC16709o3[] enumC16709o3Arr = {enumC16709o3, enumC16709o4, enumC16709o5};
        f64240z = enumC16709o3Arr;
        AbstractC15751g.m44468u(enumC16709o3Arr);
    }

    public static EnumC16709o3 valueOf(String str) {
        return (EnumC16709o3) Enum.valueOf(EnumC16709o3.class, str);
    }

    public static EnumC16709o3[] values() {
        return (EnumC16709o3[]) f64240z.clone();
    }
}
