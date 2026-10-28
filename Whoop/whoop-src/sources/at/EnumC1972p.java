package at;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: at.p */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC1972p {

    /* JADX INFO: renamed from: w */
    public static final EnumC1972p f7802w;

    /* JADX INFO: renamed from: x */
    public static final EnumC1972p f7803x;

    /* JADX INFO: renamed from: y */
    public static final EnumC1972p f7804y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC1972p[] f7805z;

    static {
        EnumC1972p enumC1972p = new EnumC1972p("NIST_P256", 0);
        f7802w = enumC1972p;
        EnumC1972p enumC1972p2 = new EnumC1972p("NIST_P384", 1);
        f7803x = enumC1972p2;
        EnumC1972p enumC1972p3 = new EnumC1972p("NIST_P521", 2);
        f7804y = enumC1972p3;
        f7805z = new EnumC1972p[]{enumC1972p, enumC1972p2, enumC1972p3};
    }

    public static EnumC1972p valueOf(String str) {
        return (EnumC1972p) Enum.valueOf(EnumC1972p.class, str);
    }

    public static EnumC1972p[] values() {
        return (EnumC1972p[]) f7805z.clone();
    }
}
