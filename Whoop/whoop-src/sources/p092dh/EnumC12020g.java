package p092dh;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: dh.g */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC12020g {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC12020g[] f39760E;

    /* JADX INFO: renamed from: w */
    public static final EnumC12020g f39761w;

    /* JADX INFO: renamed from: x */
    public static final EnumC12020g f39762x;

    /* JADX INFO: renamed from: y */
    public static final EnumC12020g f39763y;

    /* JADX INFO: renamed from: z */
    public static final EnumC12020g f39764z;

    static {
        EnumC12020g enumC12020g = new EnumC12020g("MEMORY_CACHE", 0);
        f39761w = enumC12020g;
        EnumC12020g enumC12020g2 = new EnumC12020g("MEMORY", 1);
        f39762x = enumC12020g2;
        EnumC12020g enumC12020g3 = new EnumC12020g("DISK", 2);
        f39763y = enumC12020g3;
        EnumC12020g enumC12020g4 = new EnumC12020g("NETWORK", 3);
        f39764z = enumC12020g4;
        EnumC12020g[] enumC12020gArr = {enumC12020g, enumC12020g2, enumC12020g3, enumC12020g4};
        f39760E = enumC12020gArr;
        AbstractC15751g.m44468u(enumC12020gArr);
    }

    public static EnumC12020g valueOf(String str) {
        return (EnumC12020g) Enum.valueOf(EnumC12020g.class, str);
    }

    public static EnumC12020g[] values() {
        return (EnumC12020g[]) f39760E.clone();
    }
}
