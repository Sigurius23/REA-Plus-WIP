package lg3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lg3.u */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC24059u {

    /* JADX INFO: renamed from: w */
    public static final EnumC24059u f95078w;

    /* JADX INFO: renamed from: x */
    public static final EnumC24059u f95079x;

    /* JADX INFO: renamed from: y */
    public static final EnumC24059u f95080y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC24059u[] f95081z;

    static {
        EnumC24059u enumC24059u = new EnumC24059u("STRICT", 0);
        f95078w = enumC24059u;
        EnumC24059u enumC24059u2 = new EnumC24059u("SMART", 1);
        f95079x = enumC24059u2;
        EnumC24059u enumC24059u3 = new EnumC24059u("LENIENT", 2);
        f95080y = enumC24059u3;
        f95081z = new EnumC24059u[]{enumC24059u, enumC24059u2, enumC24059u3};
    }

    public static EnumC24059u valueOf(String str) {
        return (EnumC24059u) Enum.valueOf(EnumC24059u.class, str);
    }

    public static EnumC24059u[] values() {
        return (EnumC24059u[]) f95081z.clone();
    }
}
