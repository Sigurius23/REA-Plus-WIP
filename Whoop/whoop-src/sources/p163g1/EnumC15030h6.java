package p163g1;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: g1.h6 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC15030h6 {

    /* JADX INFO: renamed from: w */
    public static final EnumC15030h6 f56261w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC15030h6[] f56262x;

    static {
        EnumC15030h6 enumC15030h6 = new EnumC15030h6("Short", 0);
        f56261w = enumC15030h6;
        EnumC15030h6[] enumC15030h6Arr = {enumC15030h6, new EnumC15030h6("Long", 1), new EnumC15030h6("Indefinite", 2)};
        f56262x = enumC15030h6Arr;
        AbstractC15751g.m44468u(enumC15030h6Arr);
    }

    public static EnumC15030h6 valueOf(String str) {
        return (EnumC15030h6) Enum.valueOf(EnumC15030h6.class, str);
    }

    public static EnumC15030h6[] values() {
        return (EnumC15030h6[]) f56262x.clone();
    }
}
