package at;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: at.w */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC1979w {

    /* JADX INFO: renamed from: E */
    public static final EnumC1979w f7826E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ EnumC1979w[] f7827F;

    /* JADX INFO: renamed from: w */
    public static final EnumC1979w f7828w;

    /* JADX INFO: renamed from: x */
    public static final EnumC1979w f7829x;

    /* JADX INFO: renamed from: y */
    public static final EnumC1979w f7830y;

    /* JADX INFO: renamed from: z */
    public static final EnumC1979w f7831z;

    static {
        EnumC1979w enumC1979w = new EnumC1979w("SHA1", 0);
        f7828w = enumC1979w;
        EnumC1979w enumC1979w2 = new EnumC1979w("SHA224", 1);
        f7829x = enumC1979w2;
        EnumC1979w enumC1979w3 = new EnumC1979w("SHA256", 2);
        f7830y = enumC1979w3;
        EnumC1979w enumC1979w4 = new EnumC1979w("SHA384", 3);
        f7831z = enumC1979w4;
        EnumC1979w enumC1979w5 = new EnumC1979w("SHA512", 4);
        f7826E = enumC1979w5;
        f7827F = new EnumC1979w[]{enumC1979w, enumC1979w2, enumC1979w3, enumC1979w4, enumC1979w5};
    }

    public static EnumC1979w valueOf(String str) {
        return (EnumC1979w) Enum.valueOf(EnumC1979w.class, str);
    }

    public static EnumC1979w[] values() {
        return (EnumC1979w[]) f7827F.clone();
    }
}
