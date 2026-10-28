package com.iterable.iterableapi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.iterable.iterableapi.w0 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC5382w0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC5382w0 f21883w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC5382w0[] f21884x;

    static {
        EnumC5382w0 enumC5382w0 = new EnumC5382w0("SHOW", 0);
        f21883w = enumC5382w0;
        f21884x = new EnumC5382w0[]{enumC5382w0, new EnumC5382w0("SKIP", 1)};
    }

    public static EnumC5382w0 valueOf(String str) {
        return (EnumC5382w0) Enum.valueOf(EnumC5382w0.class, str);
    }

    public static EnumC5382w0[] values() {
        return (EnumC5382w0[]) f21884x.clone();
    }
}
