package p452r7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: r7.j */
/* JADX INFO: loaded from: classes5.dex */
public abstract class EnumC31018j {

    /* JADX INFO: renamed from: w */
    public static final C31010f f128003w;

    /* JADX INFO: renamed from: x */
    public static final C31014h f128004x;

    /* JADX INFO: renamed from: y */
    public static final C31016i f128005y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC31018j[] f128006z;

    static {
        C31010f c31010f = new C31010f();
        f128003w = c31010f;
        C31014h c31014h = new C31014h();
        f128004x = c31014h;
        EnumC31018j enumC31018j = new EnumC31018j() { // from class: r7.g
            @Override // p452r7.EnumC31018j
            /* JADX INFO: renamed from: a */
            public final double mo95549a() {
                return 0.2390057361d;
            }

            @Override // p452r7.EnumC31018j
            /* JADX INFO: renamed from: b */
            public final String mo95550b() {
                return "J";
            }
        };
        C31016i c31016i = new C31016i();
        f128005y = c31016i;
        f128006z = new EnumC31018j[]{c31010f, c31014h, enumC31018j, c31016i};
    }

    public static EnumC31018j valueOf(String str) {
        return (EnumC31018j) Enum.valueOf(EnumC31018j.class, str);
    }

    public static EnumC31018j[] values() {
        return (EnumC31018j[]) f128006z.clone();
    }

    /* JADX INFO: renamed from: a */
    public abstract double mo95549a();

    /* JADX INFO: renamed from: b */
    public abstract String mo95550b();
}
