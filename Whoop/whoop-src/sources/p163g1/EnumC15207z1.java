package p163g1;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: g1.z1 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC15207z1 {

    /* JADX INFO: renamed from: w */
    public static final EnumC15207z1 f57096w;

    /* JADX INFO: renamed from: x */
    public static final EnumC15207z1 f57097x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC15207z1[] f57098y;

    static {
        EnumC15207z1 enumC15207z1 = new EnumC15207z1("StartToEnd", 0);
        f57096w = enumC15207z1;
        EnumC15207z1 enumC15207z2 = new EnumC15207z1("EndToStart", 1);
        f57097x = enumC15207z2;
        EnumC15207z1[] enumC15207z1Arr = {enumC15207z1, enumC15207z2};
        f57098y = enumC15207z1Arr;
        AbstractC15751g.m44468u(enumC15207z1Arr);
    }

    public static EnumC15207z1 valueOf(String str) {
        return (EnumC15207z1) Enum.valueOf(EnumC15207z1.class, str);
    }

    public static EnumC15207z1[] values() {
        return (EnumC15207z1[]) f57098y.clone();
    }
}
