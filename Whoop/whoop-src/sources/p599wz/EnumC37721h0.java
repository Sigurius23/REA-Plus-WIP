package p599wz;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: wz.h0 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC37721h0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC37721h0 f161649w;

    /* JADX INFO: renamed from: x */
    public static final EnumC37721h0 f161650x;

    /* JADX INFO: renamed from: y */
    public static final EnumC37721h0 f161651y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC37721h0[] f161652z;

    static {
        EnumC37721h0 enumC37721h0 = new EnumC37721h0("DISABLED", 0);
        f161649w = enumC37721h0;
        EnumC37721h0 enumC37721h1 = new EnumC37721h0("ENABLED", 1);
        f161650x = enumC37721h1;
        EnumC37721h0 enumC37721h2 = new EnumC37721h0("ENABLED_NO_WEB_FALLBACK", 2);
        f161651y = enumC37721h2;
        EnumC37721h0[] enumC37721h0Arr = {enumC37721h0, enumC37721h1, enumC37721h2};
        f161652z = enumC37721h0Arr;
        AbstractC15751g.m44468u(enumC37721h0Arr);
    }

    public static EnumC37721h0 valueOf(String str) {
        return (EnumC37721h0) Enum.valueOf(EnumC37721h0.class, str);
    }

    public static EnumC37721h0[] values() {
        return (EnumC37721h0[]) f161652z.clone();
    }
}
