package p173gj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gj.e */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC15904e {

    /* JADX INFO: renamed from: E */
    public static final EnumC15904e f60144E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ EnumC15904e[] f60145F;

    /* JADX INFO: renamed from: w */
    public static final EnumC15904e f60146w;

    /* JADX INFO: renamed from: x */
    public static final EnumC15904e f60147x;

    /* JADX INFO: renamed from: y */
    public static final EnumC15904e f60148y;

    /* JADX INFO: renamed from: z */
    public static final EnumC15904e f60149z;

    static {
        EnumC15904e enumC15904e = new EnumC15904e("SESSIONS", 0);
        f60146w = enumC15904e;
        EnumC15904e enumC15904e2 = new EnumC15904e("APP_LIFECYCLES", 1);
        f60147x = enumC15904e2;
        EnumC15904e enumC15904e3 = new EnumC15904e("DEEP_LINKS", 2);
        f60148y = enumC15904e3;
        EnumC15904e enumC15904e4 = new EnumC15904e("SCREEN_VIEWS", 3);
        f60149z = enumC15904e4;
        EnumC15904e enumC15904e5 = new EnumC15904e("ELEMENT_INTERACTIONS", 4);
        f60144E = enumC15904e5;
        f60145F = new EnumC15904e[]{enumC15904e, enumC15904e2, enumC15904e3, enumC15904e4, enumC15904e5};
    }

    public static EnumC15904e valueOf(String str) {
        return (EnumC15904e) Enum.valueOf(EnumC15904e.class, str);
    }

    public static EnumC15904e[] values() {
        return (EnumC15904e[]) f60145F.clone();
    }
}
