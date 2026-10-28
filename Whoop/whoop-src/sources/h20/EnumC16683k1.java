package h20;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h20.k1 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC16683k1 {

    /* JADX INFO: renamed from: w */
    public static final EnumC16683k1 f64149w;

    /* JADX INFO: renamed from: x */
    public static final EnumC16683k1 f64150x;

    /* JADX INFO: renamed from: y */
    public static final EnumC16683k1 f64151y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC16683k1[] f64152z;

    static {
        EnumC16683k1 enumC16683k1 = new EnumC16683k1("Automatic", 0);
        f64149w = enumC16683k1;
        EnumC16683k1 enumC16683k2 = new EnumC16683k1("Never", 1);
        f64150x = enumC16683k2;
        EnumC16683k1 enumC16683k3 = new EnumC16683k1("Always", 2);
        f64151y = enumC16683k3;
        EnumC16683k1[] enumC16683k1Arr = {enumC16683k1, enumC16683k2, enumC16683k3};
        f64152z = enumC16683k1Arr;
        AbstractC15751g.m44468u(enumC16683k1Arr);
    }

    public static EnumC16683k1 valueOf(String str) {
        return (EnumC16683k1) Enum.valueOf(EnumC16683k1.class, str);
    }

    public static EnumC16683k1[] values() {
        return (EnumC16683k1[]) f64152z.clone();
    }
}
