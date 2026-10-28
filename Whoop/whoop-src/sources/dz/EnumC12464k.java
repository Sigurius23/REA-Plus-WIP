package dz;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: dz.k */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC12464k {

    /* JADX INFO: renamed from: w */
    public static final EnumC12464k f42537w;

    /* JADX INFO: renamed from: x */
    public static final EnumC12464k f42538x;

    /* JADX INFO: renamed from: y */
    public static final EnumC12464k f42539y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC12464k[] f42540z;

    static {
        EnumC12464k enumC12464k = new EnumC12464k("AddPaymentMethod", 0);
        f42537w = enumC12464k;
        EnumC12464k enumC12464k2 = new EnumC12464k("SelectPaymentMethod", 1);
        f42538x = enumC12464k2;
        EnumC12464k enumC12464k3 = new EnumC12464k("EditPaymentMethod", 2);
        f42539y = enumC12464k3;
        EnumC12464k[] enumC12464kArr = {enumC12464k, enumC12464k2, enumC12464k3};
        f42540z = enumC12464kArr;
        AbstractC15751g.m44468u(enumC12464kArr);
    }

    public static EnumC12464k valueOf(String str) {
        return (EnumC12464k) Enum.valueOf(EnumC12464k.class, str);
    }

    public static EnumC12464k[] values() {
        return (EnumC12464k[]) f42540z.clone();
    }
}
