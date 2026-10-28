package p218ic;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ic.k */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC18366k {

    /* JADX INFO: renamed from: w */
    public static final EnumC18366k f71499w;

    /* JADX INFO: renamed from: x */
    public static final EnumC18366k f71500x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC18366k[] f71501y;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC18366k EF0;

    static {
        EnumC18366k enumC18366k = new EnumC18366k("REPLACE", 0);
        EnumC18366k enumC18366k2 = new EnumC18366k("KEEP", 1);
        f71499w = enumC18366k2;
        EnumC18366k enumC18366k3 = new EnumC18366k("UPDATE", 2);
        f71500x = enumC18366k3;
        EnumC18366k[] enumC18366kArr = {enumC18366k, enumC18366k2, enumC18366k3, new EnumC18366k("CANCEL_AND_REENQUEUE", 3)};
        f71501y = enumC18366kArr;
        AbstractC15751g.m44468u(enumC18366kArr);
    }

    public static EnumC18366k valueOf(String str) {
        return (EnumC18366k) Enum.valueOf(EnumC18366k.class, str);
    }

    public static EnumC18366k[] values() {
        return (EnumC18366k[]) f71501y.clone();
    }
}
