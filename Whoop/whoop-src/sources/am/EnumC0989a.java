package am;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: am.a */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC0989a {

    /* JADX INFO: renamed from: w */
    public static final EnumC0989a f3709w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC0989a[] f3710x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0989a EF0;

    static {
        EnumC0989a enumC0989a = new EnumC0989a("Center", 0);
        EnumC0989a enumC0989a2 = new EnumC0989a("Start", 1);
        f3709w = enumC0989a2;
        EnumC0989a[] enumC0989aArr = {enumC0989a, enumC0989a2, new EnumC0989a("End", 2)};
        f3710x = enumC0989aArr;
        AbstractC15751g.m44468u(enumC0989aArr);
    }

    public static EnumC0989a valueOf(String str) {
        return (EnumC0989a) Enum.valueOf(EnumC0989a.class, str);
    }

    public static EnumC0989a[] values() {
        return (EnumC0989a[]) f3710x.clone();
    }
}
