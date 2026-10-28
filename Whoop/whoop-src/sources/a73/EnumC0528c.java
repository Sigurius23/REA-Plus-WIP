package a73;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a73.c */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC0528c {

    /* JADX INFO: renamed from: w */
    public static final EnumC0528c f1823w;

    /* JADX INFO: renamed from: x */
    public static final EnumC0528c f1824x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC0528c[] f1825y;

    static {
        EnumC0528c enumC0528c = new EnumC0528c("BULLET", 0);
        f1823w = enumC0528c;
        EnumC0528c enumC0528c2 = new EnumC0528c("ORDERED", 1);
        f1824x = enumC0528c2;
        f1825y = new EnumC0528c[]{enumC0528c, enumC0528c2};
    }

    public static EnumC0528c valueOf(String str) {
        return (EnumC0528c) Enum.valueOf(EnumC0528c.class, str);
    }

    public static EnumC0528c[] values() {
        return (EnumC0528c[]) f1825y.clone();
    }
}
