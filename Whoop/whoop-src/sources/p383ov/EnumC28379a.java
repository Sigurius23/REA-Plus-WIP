package p383ov;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ov.a */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC28379a {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC28379a[] f114488E;

    /* JADX INFO: renamed from: w */
    public static final EnumC28379a f114489w;

    /* JADX INFO: renamed from: x */
    public static final EnumC28379a f114490x;

    /* JADX INFO: renamed from: y */
    public static final EnumC28379a f114491y;

    /* JADX INFO: renamed from: z */
    public static final EnumC28379a f114492z;

    static {
        EnumC28379a enumC28379a = new EnumC28379a("DoubleTap", 0);
        f114489w = enumC28379a;
        EnumC28379a enumC28379a2 = new EnumC28379a("Scale", 1);
        f114490x = enumC28379a2;
        EnumC28379a enumC28379a3 = new EnumC28379a("ScaleQuickZoom", 2);
        f114491y = enumC28379a3;
        EnumC28379a enumC28379a4 = new EnumC28379a("Shove", 3);
        f114492z = enumC28379a4;
        f114488E = new EnumC28379a[]{enumC28379a, enumC28379a2, enumC28379a3, enumC28379a4};
    }

    public static EnumC28379a valueOf(String str) {
        return (EnumC28379a) Enum.valueOf(EnumC28379a.class, str);
    }

    public static EnumC28379a[] values() {
        return (EnumC28379a[]) f114488E.clone();
    }
}
