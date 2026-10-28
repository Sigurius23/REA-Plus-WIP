package j43;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j43.h */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC21324h {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC21324h[] f81535E;

    /* JADX INFO: renamed from: w */
    public static final EnumC21324h f81536w;

    /* JADX INFO: renamed from: x */
    public static final EnumC21324h f81537x;

    /* JADX INFO: renamed from: y */
    public static final EnumC21324h f81538y;

    /* JADX INFO: renamed from: z */
    public static final EnumC21324h f81539z;

    static {
        EnumC21324h enumC21324h = new EnumC21324h("FG_SERVICE", 0);
        f81536w = enumC21324h;
        EnumC21324h enumC21324h2 = new EnumC21324h("SERVICE", 1);
        f81537x = enumC21324h2;
        EnumC21324h enumC21324h3 = new EnumC21324h("ONLY_NOTIFICATION", 2);
        f81538y = enumC21324h3;
        EnumC21324h enumC21324h4 = new EnumC21324h("ERROR", 3);
        f81539z = enumC21324h4;
        EnumC21324h[] enumC21324hArr = {enumC21324h, enumC21324h2, enumC21324h3, enumC21324h4};
        f81535E = enumC21324hArr;
        AbstractC15751g.m44468u(enumC21324hArr);
    }

    public static EnumC21324h valueOf(String str) {
        return (EnumC21324h) Enum.valueOf(EnumC21324h.class, str);
    }

    public static EnumC21324h[] values() {
        return (EnumC21324h[]) f81535E.clone();
    }
}
