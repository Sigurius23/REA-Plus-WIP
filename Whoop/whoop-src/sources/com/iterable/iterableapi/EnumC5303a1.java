package com.iterable.iterableapi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.iterable.iterableapi.a1 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class EnumC5303a1 {

    /* JADX INFO: renamed from: w */
    public static final C5388y0 f21630w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC5303a1[] f21631x;

    static {
        C5388y0 c5388y0 = new C5388y0();
        f21630w = c5388y0;
        f21631x = new EnumC5303a1[]{c5388y0, new EnumC5303a1() { // from class: com.iterable.iterableapi.z0
            @Override // java.lang.Enum
            public final String toString() {
                return "inbox";
            }
        }};
    }

    public static EnumC5303a1 valueOf(String str) {
        return (EnumC5303a1) Enum.valueOf(EnumC5303a1.class, str);
    }

    public static EnumC5303a1[] values() {
        return (EnumC5303a1[]) f21631x.clone();
    }
}
