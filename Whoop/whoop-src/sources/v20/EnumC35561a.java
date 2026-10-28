package v20;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: v20.a */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC35561a {

    /* JADX INFO: renamed from: w */
    public static final EnumC35561a f151286w;

    /* JADX INFO: renamed from: x */
    public static final EnumC35561a f151287x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC35561a[] f151288y;

    static {
        EnumC35561a enumC35561a = new EnumC35561a("Primary", 0);
        f151286w = enumC35561a;
        EnumC35561a enumC35561a2 = new EnumC35561a("Secondary", 1);
        f151287x = enumC35561a2;
        EnumC35561a[] enumC35561aArr = {enumC35561a, enumC35561a2};
        f151288y = enumC35561aArr;
        AbstractC15751g.m44468u(enumC35561aArr);
    }

    public static EnumC35561a valueOf(String str) {
        return (EnumC35561a) Enum.valueOf(EnumC35561a.class, str);
    }

    public static EnumC35561a[] values() {
        return (EnumC35561a[]) f151288y.clone();
    }
}
