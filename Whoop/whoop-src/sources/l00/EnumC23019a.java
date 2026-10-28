package l00;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l00.a */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC23019a {

    /* JADX INFO: renamed from: w */
    public static final EnumC23019a f90762w;

    /* JADX INFO: renamed from: x */
    public static final EnumC23019a f90763x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC23019a[] f90764y;

    static {
        EnumC23019a enumC23019a = new EnumC23019a("Secondary", 0);
        f90762w = enumC23019a;
        EnumC23019a enumC23019a2 = new EnumC23019a("Primary", 1);
        f90763x = enumC23019a2;
        EnumC23019a[] enumC23019aArr = {enumC23019a, enumC23019a2};
        f90764y = enumC23019aArr;
        AbstractC15751g.m44468u(enumC23019aArr);
    }

    public static EnumC23019a valueOf(String str) {
        return (EnumC23019a) Enum.valueOf(EnumC23019a.class, str);
    }

    public static EnumC23019a[] values() {
        return (EnumC23019a[]) f90764y.clone();
    }
}
