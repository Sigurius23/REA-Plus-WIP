package p412q3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: q3.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC29861a0 {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC29861a0[] f122040E;

    /* JADX INFO: renamed from: w */
    public static final EnumC29861a0 f122041w;

    /* JADX INFO: renamed from: x */
    public static final EnumC29861a0 f122042x;

    /* JADX INFO: renamed from: y */
    public static final EnumC29861a0 f122043y;

    /* JADX INFO: renamed from: z */
    public static final EnumC29861a0 f122044z;

    static {
        EnumC29861a0 enumC29861a0 = new EnumC29861a0("StartInput", 0);
        f122041w = enumC29861a0;
        EnumC29861a0 enumC29861a1 = new EnumC29861a0("StopInput", 1);
        f122042x = enumC29861a1;
        EnumC29861a0 enumC29861a2 = new EnumC29861a0("ShowKeyboard", 2);
        f122043y = enumC29861a2;
        EnumC29861a0 enumC29861a3 = new EnumC29861a0("HideKeyboard", 3);
        f122044z = enumC29861a3;
        EnumC29861a0[] enumC29861a0Arr = {enumC29861a0, enumC29861a1, enumC29861a2, enumC29861a3};
        f122040E = enumC29861a0Arr;
        AbstractC15751g.m44468u(enumC29861a0Arr);
    }

    public static EnumC29861a0 valueOf(String str) {
        return (EnumC29861a0) Enum.valueOf(EnumC29861a0.class, str);
    }

    public static EnumC29861a0[] values() {
        return (EnumC29861a0[]) f122040E.clone();
    }
}
