package kz;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: kz.i */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC22912i {

    /* JADX INFO: renamed from: w */
    public static final EnumC22912i f90461w;

    /* JADX INFO: renamed from: x */
    public static final EnumC22912i f90462x;

    /* JADX INFO: renamed from: y */
    public static final EnumC22912i f90463y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC22912i[] f90464z;

    static {
        EnumC22912i enumC22912i = new EnumC22912i("ForData", 0);
        f90461w = enumC22912i;
        EnumC22912i enumC22912i2 = new EnumC22912i("ForInstantDebits", 1);
        f90462x = enumC22912i2;
        EnumC22912i enumC22912i3 = new EnumC22912i("ForToken", 2);
        f90463y = enumC22912i3;
        EnumC22912i[] enumC22912iArr = {enumC22912i, enumC22912i2, enumC22912i3};
        f90464z = enumC22912iArr;
        AbstractC15751g.m44468u(enumC22912iArr);
    }

    public static EnumC22912i valueOf(String str) {
        return (EnumC22912i) Enum.valueOf(EnumC22912i.class, str);
    }

    public static EnumC22912i[] values() {
        return (EnumC22912i[]) f90464z.clone();
    }
}
