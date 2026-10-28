package com.iterable.iterableapi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.iterable.iterableapi.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class EnumC5353n {

    /* JADX INFO: renamed from: w */
    public static final C5345l f21774w;

    /* JADX INFO: renamed from: x */
    public static final C5349m f21775x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC5353n[] f21776y;

    static {
        C5345l c5345l = new C5345l();
        f21774w = c5345l;
        C5349m c5349m = new C5349m();
        f21775x = c5349m;
        f21776y = new EnumC5353n[]{c5345l, c5349m};
    }

    public static EnumC5353n valueOf(String str) {
        return (EnumC5353n) Enum.valueOf(EnumC5353n.class, str);
    }

    public static EnumC5353n[] values() {
        return (EnumC5353n[]) f21776y.clone();
    }
}
