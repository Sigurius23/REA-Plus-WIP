package l30;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l30.n */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC23305n {

    /* JADX INFO: renamed from: w */
    public static final EnumC23305n f92349w;

    /* JADX INFO: renamed from: x */
    public static final EnumC23305n f92350x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC23305n[] f92351y;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC23305n EF0;

    static {
        EnumC23305n enumC23305n = new EnumC23305n("LOW", 0);
        EnumC23305n enumC23305n2 = new EnumC23305n("MEDIUM", 1);
        f92349w = enumC23305n2;
        EnumC23305n enumC23305n3 = new EnumC23305n("HIGH", 2);
        f92350x = enumC23305n3;
        EnumC23305n[] enumC23305nArr = {enumC23305n, enumC23305n2, enumC23305n3};
        f92351y = enumC23305nArr;
        AbstractC15751g.m44468u(enumC23305nArr);
    }

    public static EnumC23305n valueOf(String str) {
        return (EnumC23305n) Enum.valueOf(EnumC23305n.class, str);
    }

    public static EnumC23305n[] values() {
        return (EnumC23305n[]) f92351y.clone();
    }
}
