package p316m1;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: m1.m0 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC24915m0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC24915m0 f97586w;

    /* JADX INFO: renamed from: x */
    public static final EnumC24915m0 f97587x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC24915m0[] f97588y;

    static {
        EnumC24915m0 enumC24915m0 = new EnumC24915m0("Filled", 0);
        f97586w = enumC24915m0;
        EnumC24915m0 enumC24915m1 = new EnumC24915m0("Outlined", 1);
        f97587x = enumC24915m1;
        EnumC24915m0[] enumC24915m0Arr = {enumC24915m0, enumC24915m1};
        f97588y = enumC24915m0Arr;
        AbstractC15751g.m44468u(enumC24915m0Arr);
    }

    public static EnumC24915m0 valueOf(String str) {
        return (EnumC24915m0) Enum.valueOf(EnumC24915m0.class, str);
    }

    public static EnumC24915m0[] values() {
        return (EnumC24915m0[]) f97588y.clone();
    }
}
