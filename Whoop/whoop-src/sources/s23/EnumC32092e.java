package s23;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: s23.e */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC32092e {

    /* JADX INFO: renamed from: w */
    public static final EnumC32092e f133091w;

    /* JADX INFO: renamed from: x */
    public static final EnumC32092e f133092x;

    /* JADX INFO: renamed from: y */
    public static final EnumC32092e f133093y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC32092e[] f133094z;

    static {
        EnumC32092e enumC32092e = new EnumC32092e("UNINITIALIZED", 0);
        f133091w = enumC32092e;
        EnumC32092e enumC32092e2 = new EnumC32092e("PREPARED", 1);
        f133092x = enumC32092e2;
        EnumC32092e enumC32092e3 = new EnumC32092e("RECORDING", 2);
        f133093y = enumC32092e3;
        EnumC32092e[] enumC32092eArr = {enumC32092e, enumC32092e2, enumC32092e3};
        f133094z = enumC32092eArr;
        AbstractC15751g.m44468u(enumC32092eArr);
    }

    public static EnumC32092e valueOf(String str) {
        return (EnumC32092e) Enum.valueOf(EnumC32092e.class, str);
    }

    public static EnumC32092e[] values() {
        return (EnumC32092e[]) f133094z.clone();
    }
}
