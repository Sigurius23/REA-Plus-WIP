package dc3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: dc3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC11916a {

    /* JADX INFO: renamed from: w */
    public static final EnumC11916a f38982w;

    /* JADX INFO: renamed from: x */
    public static final EnumC11916a f38983x;

    /* JADX INFO: renamed from: y */
    public static final EnumC11916a f38984y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC11916a[] f38985z;

    static {
        EnumC11916a enumC11916a = new EnumC11916a("SUSPEND", 0);
        f38982w = enumC11916a;
        EnumC11916a enumC11916a2 = new EnumC11916a("DROP_OLDEST", 1);
        f38983x = enumC11916a2;
        EnumC11916a enumC11916a3 = new EnumC11916a("DROP_LATEST", 2);
        f38984y = enumC11916a3;
        EnumC11916a[] enumC11916aArr = {enumC11916a, enumC11916a2, enumC11916a3};
        f38985z = enumC11916aArr;
        AbstractC15751g.m44468u(enumC11916aArr);
    }

    public static EnumC11916a valueOf(String str) {
        return (EnumC11916a) Enum.valueOf(EnumC11916a.class, str);
    }

    public static EnumC11916a[] values() {
        return (EnumC11916a[]) f38985z.clone();
    }
}
