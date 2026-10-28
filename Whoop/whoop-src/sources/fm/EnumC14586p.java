package fm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: fm.p */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC14586p {

    /* JADX INFO: renamed from: w */
    public static final EnumC14586p f53661w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC14586p[] f53662x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC14586p EF0;

    static {
        EnumC14586p enumC14586p = new EnumC14586p("UNKNOWN", 0);
        EnumC14586p enumC14586p2 = new EnumC14586p("ANDROID_FIREBASE", 1);
        f53661w = enumC14586p2;
        f53662x = new EnumC14586p[]{enumC14586p, enumC14586p2};
    }

    public static EnumC14586p valueOf(String str) {
        return (EnumC14586p) Enum.valueOf(EnumC14586p.class, str);
    }

    public static EnumC14586p[] values() {
        return (EnumC14586p[]) f53662x.clone();
    }
}
