package p452r7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: r7.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class EnumC31004c {

    /* JADX INFO: renamed from: w */
    public static final C31002b f127990w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC31004c[] f127991x;

    static {
        C31002b c31002b = new C31002b();
        f127990w = c31002b;
        f127991x = new EnumC31004c[]{c31002b, new EnumC31004c() { // from class: r7.a
            @Override // p452r7.EnumC31004c
            /* JADX INFO: renamed from: a */
            public final double mo95536a() {
                return 0.05555555555555555d;
            }

            @Override // p452r7.EnumC31004c
            /* JADX INFO: renamed from: b */
            public final String mo95537b() {
                return "mg/dL";
            }
        }};
    }

    public static EnumC31004c valueOf(String str) {
        return (EnumC31004c) Enum.valueOf(EnumC31004c.class, str);
    }

    public static EnumC31004c[] values() {
        return (EnumC31004c[]) f127991x.clone();
    }

    /* JADX INFO: renamed from: a */
    public abstract double mo95536a();

    /* JADX INFO: renamed from: b */
    public abstract String mo95537b();
}
