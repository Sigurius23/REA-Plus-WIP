package gi;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gi.d */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC15873d {

    /* JADX INFO: renamed from: w */
    public static final EnumC15873d f59980w;

    /* JADX INFO: renamed from: x */
    public static final EnumC15873d f59981x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC15873d[] f59982y;

    static {
        EnumC15873d enumC15873d = new EnumC15873d("EXACT", 0);
        f59980w = enumC15873d;
        EnumC15873d enumC15873d2 = new EnumC15873d("INEXACT", 1);
        f59981x = enumC15873d2;
        EnumC15873d[] enumC15873dArr = {enumC15873d, enumC15873d2};
        f59982y = enumC15873dArr;
        AbstractC15751g.m44468u(enumC15873dArr);
    }

    public static EnumC15873d valueOf(String str) {
        return (EnumC15873d) Enum.valueOf(EnumC15873d.class, str);
    }

    public static EnumC15873d[] values() {
        return (EnumC15873d[]) f59982y.clone();
    }
}
