package ve3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ve3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC35932c {

    /* JADX INFO: renamed from: w */
    public static final EnumC35932c f153008w;

    /* JADX INFO: renamed from: x */
    public static final EnumC35932c f153009x;

    /* JADX INFO: renamed from: y */
    public static final EnumC35932c f153010y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC35932c[] f153011z;

    static {
        EnumC35932c enumC35932c = new EnumC35932c("LEFT", 0);
        f153008w = enumC35932c;
        EnumC35932c enumC35932c2 = new EnumC35932c("CENTER", 1);
        f153009x = enumC35932c2;
        EnumC35932c enumC35932c3 = new EnumC35932c("RIGHT", 2);
        f153010y = enumC35932c3;
        f153011z = new EnumC35932c[]{enumC35932c, enumC35932c2, enumC35932c3};
    }

    public static EnumC35932c valueOf(String str) {
        return (EnumC35932c) Enum.valueOf(EnumC35932c.class, str);
    }

    public static EnumC35932c[] values() {
        return (EnumC35932c[]) f153011z.clone();
    }
}
