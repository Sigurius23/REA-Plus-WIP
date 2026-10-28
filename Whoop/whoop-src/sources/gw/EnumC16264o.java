package gw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gw.o */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC16264o {

    /* JADX INFO: renamed from: w */
    public static final EnumC16264o f61867w;

    /* JADX INFO: renamed from: x */
    public static final EnumC16264o f61868x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC16264o[] f61869y;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC16264o EF0;

    static {
        EnumC16264o enumC16264o = new EnumC16264o("UNSIGNED", 0);
        EnumC16264o enumC16264o2 = new EnumC16264o("SIGNED", 1);
        f61867w = enumC16264o2;
        EnumC16264o enumC16264o3 = new EnumC16264o("VERIFIED", 2);
        f61868x = enumC16264o3;
        f61869y = new EnumC16264o[]{enumC16264o, enumC16264o2, enumC16264o3};
    }

    public static EnumC16264o valueOf(String str) {
        return (EnumC16264o) Enum.valueOf(EnumC16264o.class, str);
    }

    public static EnumC16264o[] values() {
        return (EnumC16264o[]) f61869y.clone();
    }
}
