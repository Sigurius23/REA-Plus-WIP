package p580wd;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: wd.n */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC37161n {

    /* JADX INFO: renamed from: w */
    public static final EnumC37161n f158921w;

    /* JADX INFO: renamed from: x */
    public static final EnumC37161n f158922x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC37161n[] f158923y;

    static {
        EnumC37161n enumC37161n = new EnumC37161n("SOURCE_PROFILE", 0);
        f158921w = enumC37161n;
        EnumC37161n enumC37161n2 = new EnumC37161n("CREDENTIALS_SOURCE", 1);
        f158922x = enumC37161n2;
        EnumC37161n[] enumC37161nArr = {enumC37161n, enumC37161n2};
        f158923y = enumC37161nArr;
        AbstractC15751g.m44468u(enumC37161nArr);
    }

    public static EnumC37161n valueOf(String str) {
        return (EnumC37161n) Enum.valueOf(EnumC37161n.class, str);
    }

    public static EnumC37161n[] values() {
        return (EnumC37161n[]) f158923y.clone();
    }
}
