package gi;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gi.g */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC15876g {

    /* JADX INFO: renamed from: w */
    public static final EnumC15876g f59984w;

    /* JADX INFO: renamed from: x */
    public static final EnumC15876g f59985x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC15876g[] f59986y;

    static {
        EnumC15876g enumC15876g = new EnumC15876g("FILL", 0);
        f59984w = enumC15876g;
        EnumC15876g enumC15876g2 = new EnumC15876g("FIT", 1);
        f59985x = enumC15876g2;
        EnumC15876g[] enumC15876gArr = {enumC15876g, enumC15876g2};
        f59986y = enumC15876gArr;
        AbstractC15751g.m44468u(enumC15876gArr);
    }

    public static EnumC15876g valueOf(String str) {
        return (EnumC15876g) Enum.valueOf(EnumC15876g.class, str);
    }

    public static EnumC15876g[] values() {
        return (EnumC15876g[]) f59986y.clone();
    }
}
