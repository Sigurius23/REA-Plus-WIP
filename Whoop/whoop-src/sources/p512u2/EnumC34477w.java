package p512u2;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: u2.w */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC34477w {

    /* JADX INFO: renamed from: w */
    public static final EnumC34477w f144844w;

    /* JADX INFO: renamed from: x */
    public static final EnumC34477w f144845x;

    /* JADX INFO: renamed from: y */
    public static final EnumC34477w f144846y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC34477w[] f144847z;

    static {
        EnumC34477w enumC34477w = new EnumC34477w("Unknown", 0);
        f144844w = enumC34477w;
        EnumC34477w enumC34477w2 = new EnumC34477w("Dispatching", 1);
        f144845x = enumC34477w2;
        EnumC34477w enumC34477w3 = new EnumC34477w("NotDispatching", 2);
        f144846y = enumC34477w3;
        EnumC34477w[] enumC34477wArr = {enumC34477w, enumC34477w2, enumC34477w3};
        f144847z = enumC34477wArr;
        AbstractC15751g.m44468u(enumC34477wArr);
    }

    public static EnumC34477w valueOf(String str) {
        return (EnumC34477w) Enum.valueOf(EnumC34477w.class, str);
    }

    public static EnumC34477w[] values() {
        return (EnumC34477w[]) f144847z.clone();
    }
}
