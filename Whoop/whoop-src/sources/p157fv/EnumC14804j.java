package p157fv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: fv.j */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC14804j {

    /* JADX INFO: renamed from: E */
    public static final EnumC14804j f54957E;

    /* JADX INFO: renamed from: F */
    public static final EnumC14804j f54958F;

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ EnumC14804j[] f54959G;

    /* JADX INFO: renamed from: w */
    public static final EnumC14804j f54960w;

    /* JADX INFO: renamed from: x */
    public static final EnumC14804j f54961x;

    /* JADX INFO: renamed from: y */
    public static final EnumC14804j f54962y;

    /* JADX INFO: renamed from: z */
    public static final EnumC14804j f54963z;

    static {
        EnumC14804j enumC14804j = new EnumC14804j("CENTER", 0);
        f54960w = enumC14804j;
        EnumC14804j enumC14804j2 = new EnumC14804j("ZOOM", 1);
        f54961x = enumC14804j2;
        EnumC14804j enumC14804j3 = new EnumC14804j("BEARING", 2);
        f54962y = enumC14804j3;
        EnumC14804j enumC14804j4 = new EnumC14804j("PITCH", 3);
        f54963z = enumC14804j4;
        EnumC14804j enumC14804j5 = new EnumC14804j("ANCHOR", 4);
        f54957E = enumC14804j5;
        EnumC14804j enumC14804j6 = new EnumC14804j("PADDING", 5);
        f54958F = enumC14804j6;
        f54959G = new EnumC14804j[]{enumC14804j, enumC14804j2, enumC14804j3, enumC14804j4, enumC14804j5, enumC14804j6};
    }

    public static EnumC14804j valueOf(String str) {
        return (EnumC14804j) Enum.valueOf(EnumC14804j.class, str);
    }

    public static EnumC14804j[] values() {
        return (EnumC14804j[]) f54959G.clone();
    }
}
