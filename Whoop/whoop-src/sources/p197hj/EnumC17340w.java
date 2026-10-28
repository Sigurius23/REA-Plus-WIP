package p197hj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: hj.w */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC17340w {

    /* JADX INFO: renamed from: w */
    public static final EnumC17340w f67151w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC17340w[] f67152x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC17340w EF0;

    static {
        EnumC17340w enumC17340w = new EnumC17340w("EU", 0);
        EnumC17340w enumC17340w2 = new EnumC17340w("US", 1);
        f67151w = enumC17340w2;
        f67152x = new EnumC17340w[]{enumC17340w, enumC17340w2};
    }

    public static EnumC17340w valueOf(String str) {
        return (EnumC17340w) Enum.valueOf(EnumC17340w.class, str);
    }

    public static EnumC17340w[] values() {
        return (EnumC17340w[]) f67152x.clone();
    }
}
