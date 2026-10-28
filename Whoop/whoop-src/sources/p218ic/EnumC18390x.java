package p218ic;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ic.x */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC18390x {

    /* JADX INFO: renamed from: E */
    public static final EnumC18390x f71557E;

    /* JADX INFO: renamed from: F */
    public static final EnumC18390x f71558F;

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ EnumC18390x[] f71559G;

    /* JADX INFO: renamed from: w */
    public static final EnumC18390x f71560w;

    /* JADX INFO: renamed from: x */
    public static final EnumC18390x f71561x;

    /* JADX INFO: renamed from: y */
    public static final EnumC18390x f71562y;

    /* JADX INFO: renamed from: z */
    public static final EnumC18390x f71563z;

    static {
        EnumC18390x enumC18390x = new EnumC18390x("NOT_REQUIRED", 0);
        f71560w = enumC18390x;
        EnumC18390x enumC18390x2 = new EnumC18390x("CONNECTED", 1);
        f71561x = enumC18390x2;
        EnumC18390x enumC18390x3 = new EnumC18390x("UNMETERED", 2);
        f71562y = enumC18390x3;
        EnumC18390x enumC18390x4 = new EnumC18390x("NOT_ROAMING", 3);
        f71563z = enumC18390x4;
        EnumC18390x enumC18390x5 = new EnumC18390x("METERED", 4);
        f71557E = enumC18390x5;
        EnumC18390x enumC18390x6 = new EnumC18390x("TEMPORARILY_UNMETERED", 5);
        f71558F = enumC18390x6;
        EnumC18390x[] enumC18390xArr = {enumC18390x, enumC18390x2, enumC18390x3, enumC18390x4, enumC18390x5, enumC18390x6};
        f71559G = enumC18390xArr;
        AbstractC15751g.m44468u(enumC18390xArr);
    }

    public static EnumC18390x valueOf(String str) {
        return (EnumC18390x) Enum.valueOf(EnumC18390x.class, str);
    }

    public static EnumC18390x[] values() {
        return (EnumC18390x[]) f71559G.clone();
    }
}
