package p541v2;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: v2.b */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC35559b {

    /* JADX INFO: renamed from: w */
    public static final EnumC35559b f151280w;

    /* JADX INFO: renamed from: x */
    public static final EnumC35559b f151281x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC35559b[] f151282y;

    static {
        EnumC35559b enumC35559b = new EnumC35559b("Lsq2", 0);
        f151280w = enumC35559b;
        EnumC35559b enumC35559b2 = new EnumC35559b("Impulse", 1);
        f151281x = enumC35559b2;
        EnumC35559b[] enumC35559bArr = {enumC35559b, enumC35559b2};
        f151282y = enumC35559bArr;
        AbstractC15751g.m44468u(enumC35559bArr);
    }

    public static EnumC35559b valueOf(String str) {
        return (EnumC35559b) Enum.valueOf(EnumC35559b.class, str);
    }

    public static EnumC35559b[] values() {
        return (EnumC35559b[]) f151282y.clone();
    }
}
