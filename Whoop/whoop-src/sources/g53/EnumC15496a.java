package g53;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: g53.a */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC15496a {

    /* JADX INFO: renamed from: w */
    public static final EnumC15496a f58161w;

    /* JADX INFO: renamed from: x */
    public static final EnumC15496a f58162x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC15496a[] f58163y;

    static {
        EnumC15496a enumC15496a = new EnumC15496a("LIFECYCLE_RESUME", 0);
        f58161w = enumC15496a;
        EnumC15496a enumC15496a2 = new EnumC15496a("NETWORK_AVAILABLE", 1);
        f58162x = enumC15496a2;
        EnumC15496a[] enumC15496aArr = {enumC15496a, enumC15496a2};
        f58163y = enumC15496aArr;
        AbstractC15751g.m44468u(enumC15496aArr);
    }

    public static EnumC15496a valueOf(String str) {
        return (EnumC15496a) Enum.valueOf(EnumC15496a.class, str);
    }

    public static EnumC15496a[] values() {
        return (EnumC15496a[]) f58163y.clone();
    }
}
