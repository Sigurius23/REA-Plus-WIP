package p426qi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: qi.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC30384g0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC30384g0 f124675w;

    /* JADX INFO: renamed from: x */
    public static final EnumC30384g0 f124676x;

    /* JADX INFO: renamed from: y */
    public static final EnumC30384g0 f124677y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC30384g0[] f124678z;

    static {
        EnumC30384g0 enumC30384g0 = new EnumC30384g0("AUTOMATIC", 0);
        f124675w = enumC30384g0;
        EnumC30384g0 enumC30384g1 = new EnumC30384g0("HARDWARE", 1);
        f124676x = enumC30384g1;
        EnumC30384g0 enumC30384g2 = new EnumC30384g0("SOFTWARE", 2);
        f124677y = enumC30384g2;
        f124678z = new EnumC30384g0[]{enumC30384g0, enumC30384g1, enumC30384g2};
    }

    public static EnumC30384g0 valueOf(String str) {
        return (EnumC30384g0) Enum.valueOf(EnumC30384g0.class, str);
    }

    public static EnumC30384g0[] values() {
        return (EnumC30384g0[]) f124678z.clone();
    }
}
