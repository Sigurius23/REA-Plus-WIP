package r83;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: r83.a */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC31071a {

    /* JADX INFO: renamed from: w */
    public static final EnumC31071a f128113w;

    /* JADX INFO: renamed from: x */
    public static final EnumC31071a f128114x;

    /* JADX INFO: renamed from: y */
    public static final EnumC31071a f128115y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC31071a[] f128116z;

    static {
        EnumC31071a enumC31071a = new EnumC31071a("COROUTINE_SUSPENDED", 0);
        f128113w = enumC31071a;
        EnumC31071a enumC31071a2 = new EnumC31071a("UNDECIDED", 1);
        f128114x = enumC31071a2;
        EnumC31071a enumC31071a3 = new EnumC31071a("RESUMED", 2);
        f128115y = enumC31071a3;
        EnumC31071a[] enumC31071aArr = {enumC31071a, enumC31071a2, enumC31071a3};
        f128116z = enumC31071aArr;
        AbstractC15751g.m44468u(enumC31071aArr);
    }

    public static EnumC31071a valueOf(String str) {
        return (EnumC31071a) Enum.valueOf(EnumC31071a.class, str);
    }

    public static EnumC31071a[] values() {
        return (EnumC31071a[]) f128116z.clone();
    }
}
