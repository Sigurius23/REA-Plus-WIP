package p127ev;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ev.r */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC13677r {

    /* JADX INFO: renamed from: w */
    public static final EnumC13677r f48474w;

    /* JADX INFO: renamed from: x */
    public static final EnumC13677r f48475x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC13677r[] f48476y;

    static {
        EnumC13677r enumC13677r = new EnumC13677r("HEADING", 0);
        f48474w = enumC13677r;
        EnumC13677r enumC13677r2 = new EnumC13677r("COURSE", 1);
        f48475x = enumC13677r2;
        f48476y = new EnumC13677r[]{enumC13677r, enumC13677r2};
    }

    public static EnumC13677r valueOf(String str) {
        return (EnumC13677r) Enum.valueOf(EnumC13677r.class, str);
    }

    public static EnumC13677r[] values() {
        return (EnumC13677r[]) f48476y.clone();
    }
}
