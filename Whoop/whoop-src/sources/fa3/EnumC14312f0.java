package fa3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: fa3.f0 */
/* JADX INFO: loaded from: classes5.dex */
public class EnumC14312f0 {

    /* JADX INFO: renamed from: E */
    public static final C14310e0 f52255E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ EnumC14312f0[] f52256F;

    /* JADX INFO: renamed from: x */
    public static final EnumC14312f0 f52257x;

    /* JADX INFO: renamed from: y */
    public static final EnumC14312f0 f52258y;

    /* JADX INFO: renamed from: z */
    public static final EnumC14312f0 f52259z;

    /* JADX INFO: renamed from: w */
    public final Object f52260w;

    static {
        EnumC14312f0 enumC14312f0 = new EnumC14312f0("NULL", 0, null);
        f52257x = enumC14312f0;
        EnumC14312f0 enumC14312f1 = new EnumC14312f0("INDEX", 1, -1);
        f52258y = enumC14312f1;
        EnumC14312f0 enumC14312f2 = new EnumC14312f0("FALSE", 2, Boolean.FALSE);
        f52259z = enumC14312f2;
        C14310e0 c14310e0 = new C14310e0("MAP_GET_OR_DEFAULT", 3, null);
        f52255E = c14310e0;
        EnumC14312f0[] enumC14312f0Arr = {enumC14312f0, enumC14312f1, enumC14312f2, c14310e0};
        f52256F = enumC14312f0Arr;
        AbstractC15751g.m44468u(enumC14312f0Arr);
    }

    public EnumC14312f0(String str, int i13, Object obj) {
        super(str, i13);
        this.f52260w = obj;
    }

    public static EnumC14312f0 valueOf(String str) {
        return (EnumC14312f0) Enum.valueOf(EnumC14312f0.class, str);
    }

    public static EnumC14312f0[] values() {
        return (EnumC14312f0[]) f52256F.clone();
    }
}
