package p079d2;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: d2.f */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC11484f {

    /* JADX INFO: renamed from: w */
    public static final EnumC11484f f36918w;

    /* JADX INFO: renamed from: x */
    public static final EnumC11484f f36919x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC11484f[] f36920y;

    static {
        EnumC11484f enumC11484f = new EnumC11484f("VIEW_APPEAR", 0);
        f36918w = enumC11484f;
        EnumC11484f enumC11484f2 = new EnumC11484f("VIEW_DISAPPEAR", 1);
        f36919x = enumC11484f2;
        EnumC11484f[] enumC11484fArr = {enumC11484f, enumC11484f2};
        f36920y = enumC11484fArr;
        AbstractC15751g.m44468u(enumC11484fArr);
    }

    public static EnumC11484f valueOf(String str) {
        return (EnumC11484f) Enum.valueOf(EnumC11484f.class, str);
    }

    public static EnumC11484f[] values() {
        return (EnumC11484f[]) f36920y.clone();
    }
}
