package na3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: na3.e */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC26518e {

    /* JADX INFO: renamed from: w */
    public static final EnumC26518e f105431w;

    /* JADX INFO: renamed from: x */
    public static final EnumC26518e f105432x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC26518e[] f105433y;

    static {
        EnumC26518e enumC26518e = new EnumC26518e("READ_ONLY", 0);
        f105431w = enumC26518e;
        EnumC26518e enumC26518e2 = new EnumC26518e("MUTABLE", 1);
        f105432x = enumC26518e2;
        EnumC26518e[] enumC26518eArr = {enumC26518e, enumC26518e2};
        f105433y = enumC26518eArr;
        AbstractC15751g.m44468u(enumC26518eArr);
    }

    public static EnumC26518e valueOf(String str) {
        return (EnumC26518e) Enum.valueOf(EnumC26518e.class, str);
    }

    public static EnumC26518e[] values() {
        return (EnumC26518e[]) f105433y.clone();
    }
}
