package me3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: me3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC25478a {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC25478a[] f99795E;

    /* JADX INFO: renamed from: w */
    public static final EnumC25478a f99796w;

    /* JADX INFO: renamed from: x */
    public static final EnumC25478a f99797x;

    /* JADX INFO: renamed from: y */
    public static final EnumC25478a f99798y;

    /* JADX INFO: renamed from: z */
    public static final EnumC25478a f99799z;

    static {
        EnumC25478a enumC25478a = new EnumC25478a("NONE", 0);
        f99796w = enumC25478a;
        EnumC25478a enumC25478a2 = new EnumC25478a("BASIC", 1);
        f99797x = enumC25478a2;
        EnumC25478a enumC25478a3 = new EnumC25478a("HEADERS", 2);
        f99798y = enumC25478a3;
        EnumC25478a enumC25478a4 = new EnumC25478a("BODY", 3);
        f99799z = enumC25478a4;
        EnumC25478a[] enumC25478aArr = {enumC25478a, enumC25478a2, enumC25478a3, enumC25478a4};
        f99795E = enumC25478aArr;
        AbstractC15751g.m44468u(enumC25478aArr);
    }

    public static EnumC25478a valueOf(String str) {
        return (EnumC25478a) Enum.valueOf(EnumC25478a.class, str);
    }

    public static EnumC25478a[] values() {
        return (EnumC25478a[]) f99795E.clone();
    }
}
