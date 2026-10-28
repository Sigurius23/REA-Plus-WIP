package b30;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b30.p2 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC2597p2 {

    /* JADX INFO: renamed from: w */
    public static final EnumC2597p2 f10103w;

    /* JADX INFO: renamed from: x */
    public static final EnumC2597p2 f10104x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC2597p2[] f10105y;

    static {
        EnumC2597p2 enumC2597p2 = new EnumC2597p2("Complete", 0);
        f10103w = enumC2597p2;
        EnumC2597p2 enumC2597p3 = new EnumC2597p2("Custom", 1);
        f10104x = enumC2597p3;
        EnumC2597p2[] enumC2597p2Arr = {enumC2597p2, enumC2597p3};
        f10105y = enumC2597p2Arr;
        AbstractC15751g.m44468u(enumC2597p2Arr);
    }

    public static EnumC2597p2 valueOf(String str) {
        return (EnumC2597p2) Enum.valueOf(EnumC2597p2.class, str);
    }

    public static EnumC2597p2[] values() {
        return (EnumC2597p2[]) f10105y.clone();
    }
}
