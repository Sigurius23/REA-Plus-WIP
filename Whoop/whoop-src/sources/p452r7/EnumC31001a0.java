package p452r7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: r7.a0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class EnumC31001a0 {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC31001a0[] f127981E;

    /* JADX INFO: renamed from: w */
    public static final C31040u f127982w;

    /* JADX INFO: renamed from: x */
    public static final C31042v f127983x;

    /* JADX INFO: renamed from: y */
    public static final C31046x f127984y;

    /* JADX INFO: renamed from: z */
    public static final C31048z f127985z;

    static {
        C31040u c31040u = new C31040u();
        f127982w = c31040u;
        C31042v c31042v = new C31042v();
        f127983x = c31042v;
        C31046x c31046x = new C31046x();
        f127984y = c31046x;
        EnumC31001a0 enumC31001a0 = new EnumC31001a0() { // from class: r7.w
            @Override // p452r7.EnumC31001a0
            /* JADX INFO: renamed from: a */
            public final double mo95538a() {
                return 1.0E-6d;
            }
        };
        EnumC31001a0 enumC31001a1 = new EnumC31001a0() { // from class: r7.y
            @Override // p452r7.EnumC31001a0
            /* JADX INFO: renamed from: a */
            public final double mo95538a() {
                return 28.34952d;
            }
        };
        C31048z c31048z = new C31048z();
        f127985z = c31048z;
        f127981E = new EnumC31001a0[]{c31040u, c31042v, c31046x, enumC31001a0, enumC31001a1, c31048z};
    }

    public static EnumC31001a0 valueOf(String str) {
        return (EnumC31001a0) Enum.valueOf(EnumC31001a0.class, str);
    }

    public static EnumC31001a0[] values() {
        return (EnumC31001a0[]) f127981E.clone();
    }

    /* JADX INFO: renamed from: a */
    public abstract double mo95538a();
}
