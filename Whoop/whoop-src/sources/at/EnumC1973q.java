package at;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: at.q */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC1973q {

    /* JADX INFO: renamed from: w */
    public static final EnumC1973q f7806w;

    /* JADX INFO: renamed from: x */
    public static final EnumC1973q f7807x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC1973q[] f7808y;

    static {
        EnumC1973q enumC1973q = new EnumC1973q("IEEE_P1363", 0);
        f7806w = enumC1973q;
        EnumC1973q enumC1973q2 = new EnumC1973q("DER", 1);
        f7807x = enumC1973q2;
        f7808y = new EnumC1973q[]{enumC1973q, enumC1973q2};
    }

    public static EnumC1973q valueOf(String str) {
        return (EnumC1973q) Enum.valueOf(EnumC1973q.class, str);
    }

    public static EnumC1973q[] values() {
        return (EnumC1973q[]) f7808y.clone();
    }
}
