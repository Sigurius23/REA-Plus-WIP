package j93;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j93.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC21464e0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC21464e0 f82426w;

    /* JADX INFO: renamed from: x */
    public static final EnumC21464e0 f82427x;

    /* JADX INFO: renamed from: y */
    public static final EnumC21464e0 f82428y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC21464e0[] f82429z;

    static {
        EnumC21464e0 enumC21464e0 = new EnumC21464e0("INVARIANT", 0);
        f82426w = enumC21464e0;
        EnumC21464e0 enumC21464e1 = new EnumC21464e0("IN", 1);
        f82427x = enumC21464e1;
        EnumC21464e0 enumC21464e2 = new EnumC21464e0("OUT", 2);
        f82428y = enumC21464e2;
        EnumC21464e0[] enumC21464e0Arr = {enumC21464e0, enumC21464e1, enumC21464e2};
        f82429z = enumC21464e0Arr;
        AbstractC15751g.m44468u(enumC21464e0Arr);
    }

    public static EnumC21464e0 valueOf(String str) {
        return (EnumC21464e0) Enum.valueOf(EnumC21464e0.class, str);
    }

    public static EnumC21464e0[] values() {
        return (EnumC21464e0[]) f82429z.clone();
    }
}
