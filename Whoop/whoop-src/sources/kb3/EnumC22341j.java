package kb3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: kb3.j */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC22341j {

    /* JADX INFO: renamed from: w */
    public static final EnumC22341j f87178w;

    /* JADX INFO: renamed from: x */
    public static final EnumC22341j f87179x;

    /* JADX INFO: renamed from: y */
    public static final EnumC22341j f87180y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC22341j[] f87181z;

    static {
        EnumC22341j enumC22341j = new EnumC22341j("NOT_COMPUTED", 0);
        f87178w = enumC22341j;
        EnumC22341j enumC22341j2 = new EnumC22341j("COMPUTING", 1);
        f87179x = enumC22341j2;
        EnumC22341j enumC22341j3 = new EnumC22341j("RECURSION_WAS_DETECTED", 2);
        f87180y = enumC22341j3;
        f87181z = new EnumC22341j[]{enumC22341j, enumC22341j2, enumC22341j3};
    }

    public static EnumC22341j valueOf(String str) {
        return (EnumC22341j) Enum.valueOf(EnumC22341j.class, str);
    }

    public static EnumC22341j[] values() {
        return (EnumC22341j[]) f87181z.clone();
    }
}
