package p043c4;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: c4.k0 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC3968k0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC3968k0 f16173w;

    /* JADX INFO: renamed from: x */
    public static final EnumC3968k0 f16174x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC3968k0[] f16175y;

    static {
        EnumC3968k0 enumC3968k0 = new EnumC3968k0("Inherit", 0);
        f16173w = enumC3968k0;
        EnumC3968k0 enumC3968k1 = new EnumC3968k0("SecureOn", 1);
        f16174x = enumC3968k1;
        EnumC3968k0[] enumC3968k0Arr = {enumC3968k0, enumC3968k1, new EnumC3968k0("SecureOff", 2)};
        f16175y = enumC3968k0Arr;
        AbstractC15751g.m44468u(enumC3968k0Arr);
    }

    public static EnumC3968k0 valueOf(String str) {
        return (EnumC3968k0) Enum.valueOf(EnumC3968k0.class, str);
    }

    public static EnumC3968k0[] values() {
        return (EnumC3968k0[]) f16175y.clone();
    }
}
