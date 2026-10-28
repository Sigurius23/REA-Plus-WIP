package ag;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ag.f */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC0856f {

    /* JADX INFO: renamed from: w */
    public static final EnumC0856f f3061w;

    /* JADX INFO: renamed from: x */
    public static final EnumC0856f f3062x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC0856f[] f3063y;

    static {
        EnumC0856f enumC0856f = new EnumC0856f("Before", 0);
        f3061w = enumC0856f;
        EnumC0856f enumC0856f2 = new EnumC0856f("After", 1);
        f3062x = enumC0856f2;
        EnumC0856f[] enumC0856fArr = {enumC0856f, enumC0856f2};
        f3063y = enumC0856fArr;
        AbstractC15751g.m44468u(enumC0856fArr);
    }

    public static EnumC0856f valueOf(String str) {
        return (EnumC0856f) Enum.valueOf(EnumC0856f.class, str);
    }

    public static EnumC0856f[] values() {
        return (EnumC0856f[]) f3063y.clone();
    }
}
