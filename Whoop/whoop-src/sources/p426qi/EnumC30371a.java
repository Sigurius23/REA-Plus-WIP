package p426qi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: qi.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC30371a {

    /* JADX INFO: renamed from: w */
    public static final EnumC30371a f124606w;

    /* JADX INFO: renamed from: x */
    public static final EnumC30371a f124607x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC30371a[] f124608y;

    static {
        EnumC30371a enumC30371a = new EnumC30371a("AUTOMATIC", 0);
        f124606w = enumC30371a;
        EnumC30371a enumC30371a2 = new EnumC30371a("ENABLED", 1);
        f124607x = enumC30371a2;
        f124608y = new EnumC30371a[]{enumC30371a, enumC30371a2, new EnumC30371a("DISABLED", 2)};
    }

    public static EnumC30371a valueOf(String str) {
        return (EnumC30371a) Enum.valueOf(EnumC30371a.class, str);
    }

    public static EnumC30371a[] values() {
        return (EnumC30371a[]) f124608y.clone();
    }
}
