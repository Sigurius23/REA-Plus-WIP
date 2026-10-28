package p395p6;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: p6.d1 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC28872d1 {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC28872d1[] f116856E;

    /* JADX INFO: renamed from: w */
    public static final EnumC28872d1 f116857w;

    /* JADX INFO: renamed from: x */
    public static final EnumC28872d1 f116858x;

    /* JADX INFO: renamed from: y */
    public static final EnumC28872d1 f116859y;

    /* JADX INFO: renamed from: z */
    public static final EnumC28872d1 f116860z;

    static {
        EnumC28872d1 enumC28872d1 = new EnumC28872d1("Wrap", 0);
        f116857w = enumC28872d1;
        EnumC28872d1 enumC28872d2 = new EnumC28872d1("Fixed", 1);
        f116858x = enumC28872d2;
        EnumC28872d1 enumC28872d3 = new EnumC28872d1("Expand", 2);
        f116859y = enumC28872d3;
        EnumC28872d1 enumC28872d4 = new EnumC28872d1("MatchParent", 3);
        f116860z = enumC28872d4;
        EnumC28872d1[] enumC28872d1Arr = {enumC28872d1, enumC28872d2, enumC28872d3, enumC28872d4};
        f116856E = enumC28872d1Arr;
        AbstractC15751g.m44468u(enumC28872d1Arr);
    }

    public static EnumC28872d1 valueOf(String str) {
        return (EnumC28872d1) Enum.valueOf(EnumC28872d1.class, str);
    }

    public static EnumC28872d1[] values() {
        return (EnumC28872d1[]) f116856E.clone();
    }
}
