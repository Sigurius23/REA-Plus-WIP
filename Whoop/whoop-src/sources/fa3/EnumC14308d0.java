package fa3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: fa3.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC14308d0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC14308d0 f52246w;

    /* JADX INFO: renamed from: x */
    public static final EnumC14308d0 f52247x;

    /* JADX INFO: renamed from: y */
    public static final EnumC14308d0 f52248y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC14308d0[] f52249z;

    static {
        EnumC14308d0 enumC14308d0 = new EnumC14308d0("ONE_COLLECTION_PARAMETER", 0);
        f52246w = enumC14308d0;
        EnumC14308d0 enumC14308d1 = new EnumC14308d0("OBJECT_PARAMETER_NON_GENERIC", 1);
        f52247x = enumC14308d1;
        EnumC14308d0 enumC14308d2 = new EnumC14308d0("OBJECT_PARAMETER_GENERIC", 2);
        f52248y = enumC14308d2;
        EnumC14308d0[] enumC14308d0Arr = {enumC14308d0, enumC14308d1, enumC14308d2};
        f52249z = enumC14308d0Arr;
        AbstractC15751g.m44468u(enumC14308d0Arr);
    }

    public static EnumC14308d0 valueOf(String str) {
        return (EnumC14308d0) Enum.valueOf(EnumC14308d0.class, str);
    }

    public static EnumC14308d0[] values() {
        return (EnumC14308d0[]) f52249z.clone();
    }
}
