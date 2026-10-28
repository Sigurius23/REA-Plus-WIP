package com.iterable.iterableapi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.iterable.iterableapi.k0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class EnumC5342k0 {

    /* JADX INFO: renamed from: w */
    public static final C5330h0 f21760w;

    /* JADX INFO: renamed from: x */
    public static final C5334i0 f21761x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC5342k0[] f21762y;

    static {
        C5330h0 c5330h0 = new C5330h0();
        f21760w = c5330h0;
        C5334i0 c5334i0 = new C5334i0();
        f21761x = c5334i0;
        f21762y = new EnumC5342k0[]{c5330h0, c5334i0, new EnumC5342k0() { // from class: com.iterable.iterableapi.j0
            @Override // java.lang.Enum
            public final String toString() {
                return "other";
            }
        }};
    }

    public static EnumC5342k0 valueOf(String str) {
        return (EnumC5342k0) Enum.valueOf(EnumC5342k0.class, str);
    }

    public static EnumC5342k0[] values() {
        return (EnumC5342k0[]) f21762y.clone();
    }
}
