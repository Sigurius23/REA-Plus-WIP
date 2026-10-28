package pf;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: pf.n */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC29136n {

    /* JADX INFO: renamed from: w */
    public static final EnumC29136n f117925w;

    /* JADX INFO: renamed from: x */
    public static final EnumC29136n f117926x;

    /* JADX INFO: renamed from: y */
    public static final EnumC29136n f117927y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC29136n[] f117928z;

    static {
        EnumC29136n enumC29136n = new EnumC29136n("NOT_INITIALIZED", 0);
        f117925w = enumC29136n;
        EnumC29136n enumC29136n2 = new EnumC29136n("INITIALIZED", 1);
        f117926x = enumC29136n2;
        EnumC29136n enumC29136n3 = new EnumC29136n("EXPLICIT_CONFIG", 2);
        EnumC29136n enumC29136n4 = new EnumC29136n("EXPLICIT_ENGINE", 3);
        f117927y = enumC29136n4;
        EnumC29136n[] enumC29136nArr = {enumC29136n, enumC29136n2, enumC29136n3, enumC29136n4};
        f117928z = enumC29136nArr;
        AbstractC15751g.m44468u(enumC29136nArr);
    }

    public static EnumC29136n valueOf(String str) {
        return (EnumC29136n) Enum.valueOf(EnumC29136n.class, str);
    }

    public static EnumC29136n[] values() {
        return (EnumC29136n[]) f117928z.clone();
    }
}
