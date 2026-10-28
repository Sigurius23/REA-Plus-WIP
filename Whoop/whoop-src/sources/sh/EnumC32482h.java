package sh;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: sh.h */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC32482h {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC32482h[] f134506E;

    /* JADX INFO: renamed from: w */
    public static final EnumC32482h f134507w;

    /* JADX INFO: renamed from: x */
    public static final EnumC32482h f134508x;

    /* JADX INFO: renamed from: y */
    public static final EnumC32482h f134509y;

    /* JADX INFO: renamed from: z */
    public static final EnumC32482h f134510z;

    static {
        EnumC32482h enumC32482h = new EnumC32482h("MEMORY_CACHE", 0);
        f134507w = enumC32482h;
        EnumC32482h enumC32482h2 = new EnumC32482h("MEMORY", 1);
        f134508x = enumC32482h2;
        EnumC32482h enumC32482h3 = new EnumC32482h("DISK", 2);
        f134509y = enumC32482h3;
        EnumC32482h enumC32482h4 = new EnumC32482h("NETWORK", 3);
        f134510z = enumC32482h4;
        EnumC32482h[] enumC32482hArr = {enumC32482h, enumC32482h2, enumC32482h3, enumC32482h4};
        f134506E = enumC32482hArr;
        AbstractC15751g.m44468u(enumC32482hArr);
    }

    public static EnumC32482h valueOf(String str) {
        return (EnumC32482h) Enum.valueOf(EnumC32482h.class, str);
    }

    public static EnumC32482h[] values() {
        return (EnumC32482h[]) f134506E.clone();
    }
}
