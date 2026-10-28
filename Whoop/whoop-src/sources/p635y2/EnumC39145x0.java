package p635y2;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: y2.x0 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC39145x0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC39145x0 f168298w;

    /* JADX INFO: renamed from: x */
    public static final EnumC39145x0 f168299x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC39145x0[] f168300y;

    static {
        EnumC39145x0 enumC39145x0 = new EnumC39145x0("Width", 0);
        f168298w = enumC39145x0;
        EnumC39145x0 enumC39145x1 = new EnumC39145x0("Height", 1);
        f168299x = enumC39145x1;
        EnumC39145x0[] enumC39145x0Arr = {enumC39145x0, enumC39145x1};
        f168300y = enumC39145x0Arr;
        AbstractC15751g.m44468u(enumC39145x0Arr);
    }

    public static EnumC39145x0 valueOf(String str) {
        return (EnumC39145x0) Enum.valueOf(EnumC39145x0.class, str);
    }

    public static EnumC39145x0[] values() {
        return (EnumC39145x0[]) f168300y.clone();
    }
}
