package p005a3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a3.u1 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0257u1 {

    /* JADX INFO: renamed from: w */
    public static final EnumC0257u1 f878w;

    /* JADX INFO: renamed from: x */
    public static final EnumC0257u1 f879x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC0257u1[] f880y;

    static {
        EnumC0257u1 enumC0257u1 = new EnumC0257u1("Min", 0);
        f878w = enumC0257u1;
        EnumC0257u1 enumC0257u2 = new EnumC0257u1("Max", 1);
        f879x = enumC0257u2;
        EnumC0257u1[] enumC0257u1Arr = {enumC0257u1, enumC0257u2};
        f880y = enumC0257u1Arr;
        AbstractC15751g.m44468u(enumC0257u1Arr);
    }

    public static EnumC0257u1 valueOf(String str) {
        return (EnumC0257u1) Enum.valueOf(EnumC0257u1.class, str);
    }

    public static EnumC0257u1[] values() {
        return (EnumC0257u1[]) f880y.clone();
    }
}
