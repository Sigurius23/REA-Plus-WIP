package lg3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lg3.w */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC24061w {

    /* JADX INFO: renamed from: w */
    public static final EnumC24061w f95083w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC24061w[] f95084x;

    static {
        EnumC24061w enumC24061w = new EnumC24061w("FULL", 0);
        f95083w = enumC24061w;
        f95084x = new EnumC24061w[]{enumC24061w, new EnumC24061w("FULL_STANDALONE", 1), new EnumC24061w("SHORT", 2), new EnumC24061w("SHORT_STANDALONE", 3), new EnumC24061w("NARROW", 4), new EnumC24061w("NARROW_STANDALONE", 5)};
    }

    public static EnumC24061w valueOf(String str) {
        return (EnumC24061w) Enum.valueOf(EnumC24061w.class, str);
    }

    public static EnumC24061w[] values() {
        return (EnumC24061w[]) f95084x.clone();
    }
}
