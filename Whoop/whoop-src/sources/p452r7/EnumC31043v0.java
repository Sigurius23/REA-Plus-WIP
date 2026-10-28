package p452r7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: r7.v0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class EnumC31043v0 {

    /* JADX INFO: renamed from: w */
    public static final C31039t0 f128026w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC31043v0[] f128027x;

    static {
        C31039t0 c31039t0 = new C31039t0();
        f128026w = c31039t0;
        f128027x = new EnumC31043v0[]{c31039t0, new EnumC31043v0() { // from class: r7.u0
            @Override // p452r7.EnumC31043v0
            /* JADX INFO: renamed from: a */
            public final double mo95564a() {
                return 0.001d;
            }

            @Override // p452r7.EnumC31043v0
            /* JADX INFO: renamed from: b */
            public final String mo95565b() {
                return "mL";
            }
        }, new EnumC31043v0() { // from class: r7.s0
            @Override // p452r7.EnumC31043v0
            /* JADX INFO: renamed from: a */
            public final double mo95564a() {
                return 0.02957353d;
            }

            @Override // p452r7.EnumC31043v0
            /* JADX INFO: renamed from: b */
            public final String mo95565b() {
                return "fl. oz (US)";
            }
        }};
    }

    public static EnumC31043v0 valueOf(String str) {
        return (EnumC31043v0) Enum.valueOf(EnumC31043v0.class, str);
    }

    public static EnumC31043v0[] values() {
        return (EnumC31043v0[]) f128027x.clone();
    }

    /* JADX INFO: renamed from: a */
    public abstract double mo95564a();

    /* JADX INFO: renamed from: b */
    public abstract String mo95565b();
}
