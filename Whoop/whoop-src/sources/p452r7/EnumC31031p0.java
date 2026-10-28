package p452r7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: r7.p0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class EnumC31031p0 {

    /* JADX INFO: renamed from: w */
    public static final C31027n0 f128014w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC31031p0[] f128015x;

    static {
        C31027n0 c31027n0 = new C31027n0();
        f128014w = c31027n0;
        f128015x = new EnumC31031p0[]{c31027n0, new EnumC31031p0() { // from class: r7.m0
            @Override // p452r7.EnumC31031p0
            /* JADX INFO: renamed from: a */
            public final double mo95559a() {
                return 0.2777777777777778d;
            }

            @Override // p452r7.EnumC31031p0
            /* JADX INFO: renamed from: b */
            public final String mo95560b() {
                return "km/h";
            }
        }, new EnumC31031p0() { // from class: r7.o0
            @Override // p452r7.EnumC31031p0
            /* JADX INFO: renamed from: a */
            public final double mo95559a() {
                return 0.447040357632d;
            }

            @Override // p452r7.EnumC31031p0
            /* JADX INFO: renamed from: b */
            public final String mo95560b() {
                return "miles/h";
            }
        }};
    }

    public static EnumC31031p0 valueOf(String str) {
        return (EnumC31031p0) Enum.valueOf(EnumC31031p0.class, str);
    }

    public static EnumC31031p0[] values() {
        return (EnumC31031p0[]) f128015x.clone();
    }

    /* JADX INFO: renamed from: a */
    public abstract double mo95559a();

    /* JADX INFO: renamed from: b */
    public abstract String mo95560b();
}
