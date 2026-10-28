package dm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: dm.d */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC12174d {

    /* JADX INFO: renamed from: w */
    public static final EnumC12174d f40479w;

    /* JADX INFO: renamed from: x */
    public static final EnumC12174d f40480x;

    /* JADX INFO: renamed from: y */
    public static final EnumC12174d f40481y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC12174d[] f40482z;

    static {
        EnumC12174d enumC12174d = new EnumC12174d("DEFAULT", 0);
        f40479w = enumC12174d;
        EnumC12174d enumC12174d2 = new EnumC12174d("VERY_LOW", 1);
        f40480x = enumC12174d2;
        EnumC12174d enumC12174d3 = new EnumC12174d("HIGHEST", 2);
        f40481y = enumC12174d3;
        f40482z = new EnumC12174d[]{enumC12174d, enumC12174d2, enumC12174d3};
    }

    public static EnumC12174d valueOf(String str) {
        return (EnumC12174d) Enum.valueOf(EnumC12174d.class, str);
    }

    public static EnumC12174d[] values() {
        return (EnumC12174d[]) f40482z.clone();
    }
}
