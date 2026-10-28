package androidx.lifecycle;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.w */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1635w {

    /* JADX INFO: renamed from: E */
    public static final EnumC1635w f6323E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ EnumC1635w[] f6324F;

    /* JADX INFO: renamed from: w */
    public static final EnumC1635w f6325w;

    /* JADX INFO: renamed from: x */
    public static final EnumC1635w f6326x;

    /* JADX INFO: renamed from: y */
    public static final EnumC1635w f6327y;

    /* JADX INFO: renamed from: z */
    public static final EnumC1635w f6328z;

    static {
        EnumC1635w enumC1635w = new EnumC1635w("DESTROYED", 0);
        f6325w = enumC1635w;
        EnumC1635w enumC1635w2 = new EnumC1635w("INITIALIZED", 1);
        f6326x = enumC1635w2;
        EnumC1635w enumC1635w3 = new EnumC1635w("CREATED", 2);
        f6327y = enumC1635w3;
        EnumC1635w enumC1635w4 = new EnumC1635w("STARTED", 3);
        f6328z = enumC1635w4;
        EnumC1635w enumC1635w5 = new EnumC1635w("RESUMED", 4);
        f6323E = enumC1635w5;
        EnumC1635w[] enumC1635wArr = {enumC1635w, enumC1635w2, enumC1635w3, enumC1635w4, enumC1635w5};
        f6324F = enumC1635wArr;
        AbstractC15751g.m44468u(enumC1635wArr);
    }

    public static EnumC1635w valueOf(String str) {
        return (EnumC1635w) Enum.valueOf(EnumC1635w.class, str);
    }

    public static EnumC1635w[] values() {
        return (EnumC1635w[]) f6324F.clone();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5040a(EnumC1635w enumC1635w) {
        return compareTo(enumC1635w) >= 0;
    }
}
