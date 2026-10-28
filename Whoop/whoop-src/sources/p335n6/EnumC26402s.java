package p335n6;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: n6.s */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC26402s {

    /* JADX INFO: renamed from: w */
    public static final EnumC26402s f104853w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC26402s[] f104854x;

    static {
        EnumC26402s enumC26402s = new EnumC26402s("Visible", 0);
        f104853w = enumC26402s;
        EnumC26402s[] enumC26402sArr = {enumC26402s, new EnumC26402s("Invisible", 1), new EnumC26402s("Gone", 2)};
        f104854x = enumC26402sArr;
        AbstractC15751g.m44468u(enumC26402sArr);
    }

    public static EnumC26402s valueOf(String str) {
        return (EnumC26402s) Enum.valueOf(EnumC26402s.class, str);
    }

    public static EnumC26402s[] values() {
        return (EnumC26402s[]) f104854x.clone();
    }
}
