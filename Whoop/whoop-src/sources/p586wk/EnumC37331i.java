package p586wk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: wk.i */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC37331i {

    /* JADX INFO: renamed from: w */
    public static final EnumC37331i f159596w;

    /* JADX INFO: renamed from: x */
    public static final EnumC37331i f159597x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC37331i[] f159598y;

    static {
        EnumC37331i enumC37331i = new EnumC37331i("SRGB", 0);
        f159596w = enumC37331i;
        EnumC37331i enumC37331i2 = new EnumC37331i("DISPLAY_P3", 1);
        f159597x = enumC37331i2;
        f159598y = new EnumC37331i[]{enumC37331i, enumC37331i2};
    }

    public static EnumC37331i valueOf(String str) {
        return (EnumC37331i) Enum.valueOf(EnumC37331i.class, str);
    }

    public static EnumC37331i[] values() {
        return (EnumC37331i[]) f159598y.clone();
    }
}
