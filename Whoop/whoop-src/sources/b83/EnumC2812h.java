package b83;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b83.h */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC2812h {

    /* JADX INFO: renamed from: w */
    public static final EnumC2812h f11003w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC2812h[] f11004x;

    static {
        EnumC2812h enumC2812h = new EnumC2812h("COMPLETE", 0);
        f11003w = enumC2812h;
        f11004x = new EnumC2812h[]{enumC2812h};
    }

    public static EnumC2812h valueOf(String str) {
        return (EnumC2812h) Enum.valueOf(EnumC2812h.class, str);
    }

    public static EnumC2812h[] values() {
        return (EnumC2812h[]) f11004x.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
