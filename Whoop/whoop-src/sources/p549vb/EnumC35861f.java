package p549vb;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: vb.f */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC35861f {

    /* JADX INFO: renamed from: E */
    public static final EnumC35861f f152673E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ EnumC35861f[] f152674F;

    /* JADX INFO: renamed from: w */
    public static final EnumC35861f f152675w;

    /* JADX INFO: renamed from: x */
    public static final EnumC35861f f152676x;

    /* JADX INFO: renamed from: y */
    public static final EnumC35861f f152677y;

    /* JADX INFO: renamed from: z */
    public static final EnumC35861f f152678z;

    static {
        EnumC35861f enumC35861f = new EnumC35861f("ON_CONFIGURE", 0);
        f152675w = enumC35861f;
        EnumC35861f enumC35861f2 = new EnumC35861f("ON_CREATE", 1);
        f152676x = enumC35861f2;
        EnumC35861f enumC35861f3 = new EnumC35861f("ON_UPGRADE", 2);
        f152677y = enumC35861f3;
        EnumC35861f enumC35861f4 = new EnumC35861f("ON_DOWNGRADE", 3);
        f152678z = enumC35861f4;
        EnumC35861f enumC35861f5 = new EnumC35861f("ON_OPEN", 4);
        f152673E = enumC35861f5;
        EnumC35861f[] enumC35861fArr = {enumC35861f, enumC35861f2, enumC35861f3, enumC35861f4, enumC35861f5};
        f152674F = enumC35861fArr;
        AbstractC15751g.m44468u(enumC35861fArr);
    }

    public static EnumC35861f valueOf(String str) {
        return (EnumC35861f) Enum.valueOf(EnumC35861f.class, str);
    }

    public static EnumC35861f[] values() {
        return (EnumC35861f[]) f152674F.clone();
    }
}
