package a13;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a13.e */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC0147e {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC0147e[] f458E;

    /* JADX INFO: renamed from: w */
    public static final EnumC0147e f459w;

    /* JADX INFO: renamed from: x */
    public static final EnumC0147e f460x;

    /* JADX INFO: renamed from: y */
    public static final EnumC0147e f461y;

    /* JADX INFO: renamed from: z */
    public static final EnumC0147e f462z;

    static {
        EnumC0147e enumC0147e = new EnumC0147e("REQUESTED", 0);
        f459w = enumC0147e;
        EnumC0147e enumC0147e2 = new EnumC0147e("GRANTED", 1);
        f460x = enumC0147e2;
        EnumC0147e enumC0147e3 = new EnumC0147e("DENIED", 2);
        f461y = enumC0147e3;
        EnumC0147e enumC0147e4 = new EnumC0147e("RATIONALE_NEEDED", 3);
        f462z = enumC0147e4;
        EnumC0147e[] enumC0147eArr = {enumC0147e, enumC0147e2, enumC0147e3, enumC0147e4};
        f458E = enumC0147eArr;
        AbstractC15751g.m44468u(enumC0147eArr);
    }

    public static EnumC0147e valueOf(String str) {
        return (EnumC0147e) Enum.valueOf(EnumC0147e.class, str);
    }

    public static EnumC0147e[] values() {
        return (EnumC0147e[]) f458E.clone();
    }
}
