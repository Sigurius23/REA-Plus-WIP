package a30;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a30.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC0304k0 {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC0304k0[] f1044E;

    /* JADX INFO: renamed from: w */
    public static final EnumC0304k0 f1045w;

    /* JADX INFO: renamed from: x */
    public static final EnumC0304k0 f1046x;

    /* JADX INFO: renamed from: y */
    public static final EnumC0304k0 f1047y;

    /* JADX INFO: renamed from: z */
    public static final EnumC0304k0 f1048z;

    static {
        EnumC0304k0 enumC0304k0 = new EnumC0304k0("LoggedIn", 0);
        f1045w = enumC0304k0;
        EnumC0304k0 enumC0304k1 = new EnumC0304k0("NeedsVerification", 1);
        f1046x = enumC0304k1;
        EnumC0304k0 enumC0304k2 = new EnumC0304k0("NeedsWebVerification", 2);
        f1047y = enumC0304k2;
        EnumC0304k0 enumC0304k3 = new EnumC0304k0("LoggedOut", 3);
        f1048z = enumC0304k3;
        EnumC0304k0[] enumC0304k0Arr = {enumC0304k0, enumC0304k1, enumC0304k2, enumC0304k3};
        f1044E = enumC0304k0Arr;
        AbstractC15751g.m44468u(enumC0304k0Arr);
    }

    public static EnumC0304k0 valueOf(String str) {
        return (EnumC0304k0) Enum.valueOf(EnumC0304k0.class, str);
    }

    public static EnumC0304k0[] values() {
        return (EnumC0304k0[]) f1044E.clone();
    }
}
