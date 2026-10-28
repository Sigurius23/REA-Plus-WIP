package h20;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h20.m3 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC16697m3 {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC16697m3[] f64221w;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC16697m3 EF5;

    static {
        EnumC16697m3[] enumC16697m3Arr = {new EnumC16697m3("Automatic", 0), new EnumC16697m3("Always", 1), new EnumC16697m3("Never", 2)};
        f64221w = enumC16697m3Arr;
        AbstractC15751g.m44468u(enumC16697m3Arr);
    }

    public static EnumC16697m3 valueOf(String str) {
        return (EnumC16697m3) Enum.valueOf(EnumC16697m3.class, str);
    }

    public static EnumC16697m3[] values() {
        return (EnumC16697m3[]) f64221w.clone();
    }
}
