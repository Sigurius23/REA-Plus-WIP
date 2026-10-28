package p452r7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: r7.r */
/* JADX INFO: loaded from: classes5.dex */
public abstract class EnumC31034r {

    /* JADX INFO: renamed from: w */
    public static final C31030p f128020w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC31034r[] f128021x;

    static {
        C31030p c31030p = new C31030p();
        f128020w = c31030p;
        f128021x = new EnumC31034r[]{c31030p, new EnumC31034r() { // from class: r7.o
            @Override // p452r7.EnumC31034r
            /* JADX INFO: renamed from: a */
            public final double mo95558a() {
                return 1000.0d;
            }
        }, new EnumC31034r() { // from class: r7.q
            @Override // p452r7.EnumC31034r
            /* JADX INFO: renamed from: a */
            public final double mo95558a() {
                return 1609.34d;
            }
        }, new EnumC31034r() { // from class: r7.n
            @Override // p452r7.EnumC31034r
            /* JADX INFO: renamed from: a */
            public final double mo95558a() {
                return 0.0254d;
            }
        }, new EnumC31034r() { // from class: r7.m
            @Override // p452r7.EnumC31034r
            /* JADX INFO: renamed from: a */
            public final double mo95558a() {
                return 0.3048d;
            }
        }};
    }

    public static EnumC31034r valueOf(String str) {
        return (EnumC31034r) Enum.valueOf(EnumC31034r.class, str);
    }

    public static EnumC31034r[] values() {
        return (EnumC31034r[]) f128021x.clone();
    }

    /* JADX INFO: renamed from: a */
    public abstract double mo95558a();
}
