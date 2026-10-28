package p282kk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: kk.d */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC22535d {

    /* JADX INFO: renamed from: E */
    public static final EnumC22535d f88571E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ EnumC22535d[] f88572F;

    /* JADX INFO: renamed from: w */
    public static final EnumC22535d f88573w;

    /* JADX INFO: renamed from: x */
    public static final EnumC22535d f88574x;

    /* JADX INFO: renamed from: y */
    public static final EnumC22535d f88575y;

    /* JADX INFO: renamed from: z */
    public static final EnumC22535d f88576z;

    static {
        EnumC22535d enumC22535d = new EnumC22535d("Before", 0);
        f88573w = enumC22535d;
        EnumC22535d enumC22535d2 = new EnumC22535d("Enrichment", 1);
        f88574x = enumC22535d2;
        EnumC22535d enumC22535d3 = new EnumC22535d("Destination", 2);
        f88575y = enumC22535d3;
        EnumC22535d enumC22535d4 = new EnumC22535d("Utility", 3);
        f88576z = enumC22535d4;
        EnumC22535d enumC22535d5 = new EnumC22535d("Observe", 4);
        f88571E = enumC22535d5;
        f88572F = new EnumC22535d[]{enumC22535d, enumC22535d2, enumC22535d3, enumC22535d4, enumC22535d5};
    }

    public static EnumC22535d valueOf(String str) {
        return (EnumC22535d) Enum.valueOf(EnumC22535d.class, str);
    }

    public static EnumC22535d[] values() {
        return (EnumC22535d[]) f88572F.clone();
    }
}
