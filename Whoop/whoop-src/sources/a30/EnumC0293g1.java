package a30;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a30.g1 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC0293g1 {

    /* JADX INFO: renamed from: w */
    public static final EnumC0293g1 f1026w;

    /* JADX INFO: renamed from: x */
    public static final EnumC0293g1 f1027x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC0293g1[] f1028y;

    static {
        EnumC0293g1 enumC0293g1 = new EnumC0293g1("HEADER", 0);
        f1026w = enumC0293g1;
        EnumC0293g1 enumC0293g2 = new EnumC0293g1("INLINE", 1);
        f1027x = enumC0293g2;
        EnumC0293g1[] enumC0293g1Arr = {enumC0293g1, enumC0293g2};
        f1028y = enumC0293g1Arr;
        AbstractC15751g.m44468u(enumC0293g1Arr);
    }

    public static EnumC0293g1 valueOf(String str) {
        return (EnumC0293g1) Enum.valueOf(EnumC0293g1.class, str);
    }

    public static EnumC0293g1[] values() {
        return (EnumC0293g1[]) f1028y.clone();
    }
}
