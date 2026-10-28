package p341nh;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: nh.g */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC26713g {

    /* JADX INFO: renamed from: w */
    public static final EnumC26713g f106213w;

    /* JADX INFO: renamed from: x */
    public static final EnumC26713g f106214x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC26713g[] f106215y;

    static {
        EnumC26713g enumC26713g = new EnumC26713g("FILL", 0);
        f106213w = enumC26713g;
        EnumC26713g enumC26713g2 = new EnumC26713g("FIT", 1);
        f106214x = enumC26713g2;
        EnumC26713g[] enumC26713gArr = {enumC26713g, enumC26713g2};
        f106215y = enumC26713gArr;
        AbstractC15751g.m44468u(enumC26713gArr);
    }

    public static EnumC26713g valueOf(String str) {
        return (EnumC26713g) Enum.valueOf(EnumC26713g.class, str);
    }

    public static EnumC26713g[] values() {
        return (EnumC26713g[]) f106215y.clone();
    }
}
