package p586wk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: wk.b */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC37324b {

    /* JADX INFO: renamed from: w */
    public static final EnumC37324b f159585w;

    /* JADX INFO: renamed from: x */
    public static final EnumC37324b f159586x;

    /* JADX INFO: renamed from: y */
    public static final EnumC37324b f159587y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC37324b[] f159588z;

    static {
        EnumC37324b enumC37324b = new EnumC37324b("PREFER_ARGB_8888", 0);
        f159585w = enumC37324b;
        EnumC37324b enumC37324b2 = new EnumC37324b("PREFER_RGB_565", 1);
        f159586x = enumC37324b2;
        f159588z = new EnumC37324b[]{enumC37324b, enumC37324b2};
        f159587y = enumC37324b;
    }

    public static EnumC37324b valueOf(String str) {
        return (EnumC37324b) Enum.valueOf(EnumC37324b.class, str);
    }

    public static EnumC37324b[] values() {
        return (EnumC37324b[]) f159588z.clone();
    }
}
