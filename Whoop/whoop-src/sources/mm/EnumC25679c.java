package mm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: mm.c */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC25679c {

    /* JADX INFO: renamed from: w */
    public static final EnumC25679c f101010w;

    /* JADX INFO: renamed from: x */
    public static final EnumC25679c f101011x;

    /* JADX INFO: renamed from: y */
    public static final EnumC25679c f101012y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC25679c[] f101013z;

    static {
        EnumC25679c enumC25679c = new EnumC25679c("NETWORK_UNMETERED", 0);
        f101010w = enumC25679c;
        EnumC25679c enumC25679c2 = new EnumC25679c("DEVICE_IDLE", 1);
        f101011x = enumC25679c2;
        EnumC25679c enumC25679c3 = new EnumC25679c("DEVICE_CHARGING", 2);
        f101012y = enumC25679c3;
        f101013z = new EnumC25679c[]{enumC25679c, enumC25679c2, enumC25679c3};
    }

    public static EnumC25679c valueOf(String str) {
        return (EnumC25679c) Enum.valueOf(EnumC25679c.class, str);
    }

    public static EnumC25679c[] values() {
        return (EnumC25679c[]) f101013z.clone();
    }
}
