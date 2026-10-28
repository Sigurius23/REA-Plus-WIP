package h20;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h20.s0 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC16730s0 {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC16730s0[] f64276E;

    /* JADX INFO: renamed from: w */
    public static final EnumC16730s0 f64277w;

    /* JADX INFO: renamed from: x */
    public static final EnumC16730s0 f64278x;

    /* JADX INFO: renamed from: y */
    public static final EnumC16730s0 f64279y;

    /* JADX INFO: renamed from: z */
    public static final EnumC16730s0 f64280z;

    static {
        EnumC16730s0 enumC16730s0 = new EnumC16730s0("SavedPaymentMethod", 0);
        f64277w = enumC16730s0;
        EnumC16730s0 enumC16730s1 = new EnumC16730s0("AddCard", 1);
        f64278x = enumC16730s1;
        EnumC16730s0 enumC16730s2 = new EnumC16730s0("GooglePay", 2);
        f64279y = enumC16730s2;
        EnumC16730s0 enumC16730s3 = new EnumC16730s0("Link", 3);
        f64280z = enumC16730s3;
        EnumC16730s0[] enumC16730s0Arr = {enumC16730s0, enumC16730s1, enumC16730s2, enumC16730s3};
        f64276E = enumC16730s0Arr;
        AbstractC15751g.m44468u(enumC16730s0Arr);
    }

    public static EnumC16730s0 valueOf(String str) {
        return (EnumC16730s0) Enum.valueOf(EnumC16730s0.class, str);
    }

    public static EnumC16730s0[] values() {
        return (EnumC16730s0[]) f64276E.clone();
    }
}
