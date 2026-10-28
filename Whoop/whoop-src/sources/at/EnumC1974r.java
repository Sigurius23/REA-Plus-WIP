package at;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: at.r */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC1974r {

    /* JADX INFO: renamed from: w */
    public static final EnumC1974r f7809w;

    /* JADX INFO: renamed from: x */
    public static final EnumC1974r f7810x;

    /* JADX INFO: renamed from: y */
    public static final EnumC1974r f7811y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC1974r[] f7812z;

    static {
        EnumC1974r enumC1974r = new EnumC1974r("UNCOMPRESSED", 0);
        f7809w = enumC1974r;
        EnumC1974r enumC1974r2 = new EnumC1974r("COMPRESSED", 1);
        f7810x = enumC1974r2;
        EnumC1974r enumC1974r3 = new EnumC1974r("DO_NOT_USE_CRUNCHY_UNCOMPRESSED", 2);
        f7811y = enumC1974r3;
        f7812z = new EnumC1974r[]{enumC1974r, enumC1974r2, enumC1974r3};
    }

    public static EnumC1974r valueOf(String str) {
        return (EnumC1974r) Enum.valueOf(EnumC1974r.class, str);
    }

    public static EnumC1974r[] values() {
        return (EnumC1974r[]) f7812z.clone();
    }
}
