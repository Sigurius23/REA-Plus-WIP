package pk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: pk.d */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC29330d {

    /* JADX INFO: renamed from: w */
    public static final EnumC29330d f118789w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC29330d[] f118790x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC29330d EF0;

    static {
        EnumC29330d enumC29330d = new EnumC29330d("EVENT", 0);
        EnumC29330d enumC29330d2 = new EnumC29330d("IDENTIFY", 1);
        f118789w = enumC29330d2;
        f118790x = new EnumC29330d[]{enumC29330d, enumC29330d2};
    }

    public static EnumC29330d valueOf(String str) {
        return (EnumC29330d) Enum.valueOf(EnumC29330d.class, str);
    }

    public static EnumC29330d[] values() {
        return (EnumC29330d[]) f118790x.clone();
    }
}
