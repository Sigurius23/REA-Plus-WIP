package p586wk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: wk.a */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC37323a {

    /* JADX INFO: renamed from: E */
    public static final EnumC37323a f159579E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ EnumC37323a[] f159580F;

    /* JADX INFO: renamed from: w */
    public static final EnumC37323a f159581w;

    /* JADX INFO: renamed from: x */
    public static final EnumC37323a f159582x;

    /* JADX INFO: renamed from: y */
    public static final EnumC37323a f159583y;

    /* JADX INFO: renamed from: z */
    public static final EnumC37323a f159584z;

    static {
        EnumC37323a enumC37323a = new EnumC37323a("LOCAL", 0);
        f159581w = enumC37323a;
        EnumC37323a enumC37323a2 = new EnumC37323a("REMOTE", 1);
        f159582x = enumC37323a2;
        EnumC37323a enumC37323a3 = new EnumC37323a("DATA_DISK_CACHE", 2);
        f159583y = enumC37323a3;
        EnumC37323a enumC37323a4 = new EnumC37323a("RESOURCE_DISK_CACHE", 3);
        f159584z = enumC37323a4;
        EnumC37323a enumC37323a5 = new EnumC37323a("MEMORY_CACHE", 4);
        f159579E = enumC37323a5;
        f159580F = new EnumC37323a[]{enumC37323a, enumC37323a2, enumC37323a3, enumC37323a4, enumC37323a5};
    }

    public static EnumC37323a valueOf(String str) {
        return (EnumC37323a) Enum.valueOf(EnumC37323a.class, str);
    }

    public static EnumC37323a[] values() {
        return (EnumC37323a[]) f159580F.clone();
    }
}
