package q93;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: q93.n */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC30090n {

    /* JADX INFO: renamed from: E */
    public static final EnumC30090n f122791E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ EnumC30090n[] f122792F;

    /* JADX INFO: renamed from: w */
    public static final EnumC30090n f122793w;

    /* JADX INFO: renamed from: x */
    public static final EnumC30090n f122794x;

    /* JADX INFO: renamed from: y */
    public static final EnumC30090n f122795y;

    /* JADX INFO: renamed from: z */
    public static final EnumC30090n f122796z;

    static {
        EnumC30090n enumC30090n = new EnumC30090n("HIDDEN", 0);
        f122793w = enumC30090n;
        EnumC30090n enumC30090n2 = new EnumC30090n("VISIBLE", 1);
        f122794x = enumC30090n2;
        EnumC30090n enumC30090n3 = new EnumC30090n("DEPRECATED_LIST_METHODS", 2);
        f122795y = enumC30090n3;
        EnumC30090n enumC30090n4 = new EnumC30090n("NOT_CONSIDERED", 3);
        f122796z = enumC30090n4;
        EnumC30090n enumC30090n5 = new EnumC30090n("DROP", 4);
        f122791E = enumC30090n5;
        EnumC30090n[] enumC30090nArr = {enumC30090n, enumC30090n2, enumC30090n3, enumC30090n4, enumC30090n5};
        f122792F = enumC30090nArr;
        AbstractC15751g.m44468u(enumC30090nArr);
    }

    public static EnumC30090n valueOf(String str) {
        return (EnumC30090n) Enum.valueOf(EnumC30090n.class, str);
    }

    public static EnumC30090n[] values() {
        return (EnumC30090n[]) f122792F.clone();
    }
}
