package p005a3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a3.v1 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0260v1 {

    /* JADX INFO: renamed from: w */
    public static final EnumC0260v1 f890w;

    /* JADX INFO: renamed from: x */
    public static final EnumC0260v1 f891x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC0260v1[] f892y;

    static {
        EnumC0260v1 enumC0260v1 = new EnumC0260v1("Width", 0);
        f890w = enumC0260v1;
        EnumC0260v1 enumC0260v2 = new EnumC0260v1("Height", 1);
        f891x = enumC0260v2;
        EnumC0260v1[] enumC0260v1Arr = {enumC0260v1, enumC0260v2};
        f892y = enumC0260v1Arr;
        AbstractC15751g.m44468u(enumC0260v1Arr);
    }

    public static EnumC0260v1 valueOf(String str) {
        return (EnumC0260v1) Enum.valueOf(EnumC0260v1.class, str);
    }

    public static EnumC0260v1[] values() {
        return (EnumC0260v1[]) f892y.clone();
    }
}
