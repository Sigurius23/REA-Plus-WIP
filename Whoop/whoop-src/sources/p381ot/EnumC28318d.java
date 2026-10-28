package p381ot;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ot.d */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC28318d {

    /* JADX INFO: renamed from: w */
    public static final EnumC28318d f114200w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC28318d[] f114201x;

    static {
        EnumC28318d enumC28318d = new EnumC28318d("DEFAULT", 0);
        f114200w = enumC28318d;
        f114201x = new EnumC28318d[]{enumC28318d, new EnumC28318d("SIGNED", 1), new EnumC28318d("FIXED", 2)};
    }

    public static EnumC28318d valueOf(String str) {
        return (EnumC28318d) Enum.valueOf(EnumC28318d.class, str);
    }

    public static EnumC28318d[] values() {
        return (EnumC28318d[]) f114201x.clone();
    }
}
