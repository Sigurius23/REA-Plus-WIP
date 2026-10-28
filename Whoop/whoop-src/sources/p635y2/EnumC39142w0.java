package p635y2;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: y2.w0 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC39142w0 {

    /* JADX INFO: renamed from: w */
    public static final EnumC39142w0 f168290w;

    /* JADX INFO: renamed from: x */
    public static final EnumC39142w0 f168291x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC39142w0[] f168292y;

    static {
        EnumC39142w0 enumC39142w0 = new EnumC39142w0("Min", 0);
        f168290w = enumC39142w0;
        EnumC39142w0 enumC39142w1 = new EnumC39142w0("Max", 1);
        f168291x = enumC39142w1;
        EnumC39142w0[] enumC39142w0Arr = {enumC39142w0, enumC39142w1};
        f168292y = enumC39142w0Arr;
        AbstractC15751g.m44468u(enumC39142w0Arr);
    }

    public static EnumC39142w0 valueOf(String str) {
        return (EnumC39142w0) Enum.valueOf(EnumC39142w0.class, str);
    }

    public static EnumC39142w0[] values() {
        return (EnumC39142w0[]) f168292y.clone();
    }
}
