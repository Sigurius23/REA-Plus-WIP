package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.bumptech.glide.d */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC4962d {

    /* JADX INFO: renamed from: w */
    public static final EnumC4962d f20311w;

    /* JADX INFO: renamed from: x */
    public static final EnumC4962d f20312x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC4962d[] f20313y;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC4962d EF0;

    static {
        EnumC4962d enumC4962d = new EnumC4962d("IMMEDIATE", 0);
        EnumC4962d enumC4962d2 = new EnumC4962d("HIGH", 1);
        EnumC4962d enumC4962d3 = new EnumC4962d("NORMAL", 2);
        f20311w = enumC4962d3;
        EnumC4962d enumC4962d4 = new EnumC4962d("LOW", 3);
        f20312x = enumC4962d4;
        f20313y = new EnumC4962d[]{enumC4962d, enumC4962d2, enumC4962d3, enumC4962d4};
    }

    public static EnumC4962d valueOf(String str) {
        return (EnumC4962d) Enum.valueOf(EnumC4962d.class, str);
    }

    public static EnumC4962d[] values() {
        return (EnumC4962d[]) f20313y.clone();
    }
}
