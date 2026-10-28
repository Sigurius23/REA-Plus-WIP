package androidx.recyclerview.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.recyclerview.widget.h1 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC1688h1 {

    /* JADX INFO: renamed from: w */
    public static final EnumC1688h1 f6671w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC1688h1[] f6672x;

    static {
        EnumC1688h1 enumC1688h1 = new EnumC1688h1("ALLOW", 0);
        f6671w = enumC1688h1;
        f6672x = new EnumC1688h1[]{enumC1688h1, new EnumC1688h1("PREVENT_WHEN_EMPTY", 1), new EnumC1688h1("PREVENT", 2)};
    }

    public static EnumC1688h1 valueOf(String str) {
        return (EnumC1688h1) Enum.valueOf(EnumC1688h1.class, str);
    }

    public static EnumC1688h1[] values() {
        return (EnumC1688h1[]) f6672x.clone();
    }
}
