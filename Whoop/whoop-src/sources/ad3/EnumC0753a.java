package ad3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ad3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC0753a {

    /* JADX INFO: renamed from: w */
    public static final EnumC0753a f2754w;

    /* JADX INFO: renamed from: x */
    public static final EnumC0753a f2755x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC0753a[] f2756y;

    static {
        EnumC0753a enumC0753a = new EnumC0753a("NONE", 0);
        f2754w = enumC0753a;
        EnumC0753a enumC0753a2 = new EnumC0753a("ALL_JSON_OBJECTS", 1);
        EnumC0753a enumC0753a3 = new EnumC0753a("POLYMORPHIC", 2);
        f2755x = enumC0753a3;
        EnumC0753a[] enumC0753aArr = {enumC0753a, enumC0753a2, enumC0753a3};
        f2756y = enumC0753aArr;
        AbstractC15751g.m44468u(enumC0753aArr);
    }

    public static EnumC0753a valueOf(String str) {
        return (EnumC0753a) Enum.valueOf(EnumC0753a.class, str);
    }

    public static EnumC0753a[] values() {
        return (EnumC0753a[]) f2756y.clone();
    }
}
