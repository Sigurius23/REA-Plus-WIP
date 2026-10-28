package p163g1;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: g1.d8 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC14988d8 {

    /* JADX INFO: renamed from: w */
    public static final EnumC14988d8 f56026w;

    /* JADX INFO: renamed from: x */
    public static final EnumC14988d8 f56027x;

    /* JADX INFO: renamed from: y */
    public static final EnumC14988d8 f56028y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC14988d8[] f56029z;

    static {
        EnumC14988d8 enumC14988d8 = new EnumC14988d8("Tabs", 0);
        f56026w = enumC14988d8;
        EnumC14988d8 enumC14988d9 = new EnumC14988d8("Divider", 1);
        f56027x = enumC14988d9;
        EnumC14988d8 enumC14988d10 = new EnumC14988d8("Indicator", 2);
        f56028y = enumC14988d10;
        EnumC14988d8[] enumC14988d8Arr = {enumC14988d8, enumC14988d9, enumC14988d10};
        f56029z = enumC14988d8Arr;
        AbstractC15751g.m44468u(enumC14988d8Arr);
    }

    public static EnumC14988d8 valueOf(String str) {
        return (EnumC14988d8) Enum.valueOf(EnumC14988d8.class, str);
    }

    public static EnumC14988d8[] values() {
        return (EnumC14988d8[]) f56029z.clone();
    }
}
