package m30;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: m30.j */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC24994j {

    /* JADX INFO: renamed from: E */
    public static final EnumC24994j f97804E;

    /* JADX INFO: renamed from: F */
    public static final EnumC24994j f97805F;

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ EnumC24994j[] f97806G;

    /* JADX INFO: renamed from: w */
    public static final EnumC24994j f97807w;

    /* JADX INFO: renamed from: x */
    public static final EnumC24994j f97808x;

    /* JADX INFO: renamed from: y */
    public static final EnumC24994j f97809y;

    /* JADX INFO: renamed from: z */
    public static final EnumC24994j f97810z;

    static {
        EnumC24994j enumC24994j = new EnumC24994j("SUBMIT", 0);
        f97807w = enumC24994j;
        EnumC24994j enumC24994j2 = new EnumC24994j("CONTINUE", 1);
        f97808x = enumC24994j2;
        EnumC24994j enumC24994j3 = new EnumC24994j("NEXT", 2);
        f97809y = enumC24994j3;
        EnumC24994j enumC24994j4 = new EnumC24994j("CANCEL", 3);
        f97810z = enumC24994j4;
        EnumC24994j enumC24994j5 = new EnumC24994j("RESEND", 4);
        f97804E = enumC24994j5;
        EnumC24994j enumC24994j6 = new EnumC24994j("SELECT", 5);
        f97805F = enumC24994j6;
        f97806G = new EnumC24994j[]{enumC24994j, enumC24994j2, enumC24994j3, enumC24994j4, enumC24994j5, enumC24994j6};
    }

    public static EnumC24994j valueOf(String str) {
        return (EnumC24994j) Enum.valueOf(EnumC24994j.class, str);
    }

    public static EnumC24994j[] values() {
        return (EnumC24994j[]) f97806G.clone();
    }
}
