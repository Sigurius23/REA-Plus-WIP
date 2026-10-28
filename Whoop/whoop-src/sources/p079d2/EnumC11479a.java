package p079d2;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: d2.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC11479a {

    /* JADX INFO: renamed from: w */
    public static final EnumC11479a f36892w;

    /* JADX INFO: renamed from: x */
    public static final EnumC11479a f36893x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC11479a[] f36894y;

    static {
        EnumC11479a enumC11479a = new EnumC11479a("SHOW_ORIGINAL", 0);
        f36892w = enumC11479a;
        EnumC11479a enumC11479a2 = new EnumC11479a("SHOW_TRANSLATED", 1);
        f36893x = enumC11479a2;
        EnumC11479a[] enumC11479aArr = {enumC11479a, enumC11479a2};
        f36894y = enumC11479aArr;
        AbstractC15751g.m44468u(enumC11479aArr);
    }

    public static EnumC11479a valueOf(String str) {
        return (EnumC11479a) Enum.valueOf(EnumC11479a.class, str);
    }

    public static EnumC11479a[] values() {
        return (EnumC11479a[]) f36894y.clone();
    }
}
