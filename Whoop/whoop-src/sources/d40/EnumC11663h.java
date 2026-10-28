package d40;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: d40.h */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC11663h {

    /* JADX INFO: renamed from: w */
    public static final EnumC11663h f37648w;

    /* JADX INFO: renamed from: x */
    public static final EnumC11663h f37649x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC11663h[] f37650y;

    static {
        EnumC11663h enumC11663h = new EnumC11663h("Filled", 0);
        f37648w = enumC11663h;
        EnumC11663h enumC11663h2 = new EnumC11663h("Outlined", 1);
        f37649x = enumC11663h2;
        EnumC11663h[] enumC11663hArr = {enumC11663h, enumC11663h2};
        f37650y = enumC11663hArr;
        AbstractC15751g.m44468u(enumC11663hArr);
    }

    public static EnumC11663h valueOf(String str) {
        return (EnumC11663h) Enum.valueOf(EnumC11663h.class, str);
    }

    public static EnumC11663h[] values() {
        return (EnumC11663h[]) f37650y.clone();
    }
}
