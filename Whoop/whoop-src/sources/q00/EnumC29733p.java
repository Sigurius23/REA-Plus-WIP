package q00;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: q00.p */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC29733p {

    /* JADX INFO: renamed from: w */
    public static final EnumC29733p f121596w;

    /* JADX INFO: renamed from: x */
    public static final EnumC29733p f121597x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC29733p[] f121598y;

    static {
        EnumC29733p enumC29733p = new EnumC29733p("Filled", 0);
        f121596w = enumC29733p;
        EnumC29733p enumC29733p2 = new EnumC29733p("Outlined", 1);
        f121597x = enumC29733p2;
        EnumC29733p[] enumC29733pArr = {enumC29733p, enumC29733p2};
        f121598y = enumC29733pArr;
        AbstractC15751g.m44468u(enumC29733pArr);
    }

    public static EnumC29733p valueOf(String str) {
        return (EnumC29733p) Enum.valueOf(EnumC29733p.class, str);
    }

    public static EnumC29733p[] values() {
        return (EnumC29733p[]) f121598y.clone();
    }
}
