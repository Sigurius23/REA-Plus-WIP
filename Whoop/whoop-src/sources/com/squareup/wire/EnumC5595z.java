package com.squareup.wire;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.squareup.wire.z */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC5595z {

    /* JADX INFO: renamed from: E */
    public static final EnumC5595z f22131E;

    /* JADX INFO: renamed from: F */
    public static final EnumC5595z f22132F;

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ EnumC5595z[] f22133G;

    /* JADX INFO: renamed from: w */
    public static final EnumC5595z f22134w;

    /* JADX INFO: renamed from: x */
    public static final EnumC5595z f22135x;

    /* JADX INFO: renamed from: y */
    public static final EnumC5595z f22136y;

    /* JADX INFO: renamed from: z */
    public static final EnumC5595z f22137z;

    static {
        EnumC5595z enumC5595z = new EnumC5595z("REQUIRED", 0);
        f22134w = enumC5595z;
        EnumC5595z enumC5595z2 = new EnumC5595z("OPTIONAL", 1);
        f22135x = enumC5595z2;
        EnumC5595z enumC5595z3 = new EnumC5595z("REPEATED", 2);
        f22136y = enumC5595z3;
        EnumC5595z enumC5595z4 = new EnumC5595z("ONE_OF", 3);
        f22137z = enumC5595z4;
        EnumC5595z enumC5595z5 = new EnumC5595z("PACKED", 4);
        f22131E = enumC5595z5;
        EnumC5595z enumC5595z6 = new EnumC5595z("OMIT_IDENTITY", 5);
        f22132F = enumC5595z6;
        f22133G = new EnumC5595z[]{enumC5595z, enumC5595z2, enumC5595z3, enumC5595z4, enumC5595z5, enumC5595z6};
    }

    public static EnumC5595z valueOf(String str) {
        return (EnumC5595z) Enum.valueOf(EnumC5595z.class, str);
    }

    public static EnumC5595z[] values() {
        return (EnumC5595z[]) f22133G.clone();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m16831a() {
        return this == f22136y || this == f22131E;
    }
}
