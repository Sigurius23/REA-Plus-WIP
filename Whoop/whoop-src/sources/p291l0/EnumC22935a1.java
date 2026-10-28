package p291l0;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l0.a1 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC22935a1 {

    /* JADX INFO: renamed from: w */
    public static final EnumC22935a1 f90537w;

    /* JADX INFO: renamed from: x */
    public static final EnumC22935a1 f90538x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC22935a1[] f90539y;

    static {
        EnumC22935a1 enumC22935a1 = new EnumC22935a1("Min", 0);
        f90537w = enumC22935a1;
        EnumC22935a1 enumC22935a2 = new EnumC22935a1("Max", 1);
        f90538x = enumC22935a2;
        EnumC22935a1[] enumC22935a1Arr = {enumC22935a1, enumC22935a2};
        f90539y = enumC22935a1Arr;
        AbstractC15751g.m44468u(enumC22935a1Arr);
    }

    public static EnumC22935a1 valueOf(String str) {
        return (EnumC22935a1) Enum.valueOf(EnumC22935a1.class, str);
    }

    public static EnumC22935a1[] values() {
        return (EnumC22935a1[]) f90539y.clone();
    }
}
