package p027b3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b3.a3 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2350a3 {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC2350a3[] f9290w;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2350a3 EF5;

    static {
        EnumC2350a3[] enumC2350a3Arr = {new EnumC2350a3("Shown", 0), new EnumC2350a3("Hidden", 1)};
        f9290w = enumC2350a3Arr;
        AbstractC15751g.m44468u(enumC2350a3Arr);
    }

    public static EnumC2350a3 valueOf(String str) {
        return (EnumC2350a3) Enum.valueOf(EnumC2350a3.class, str);
    }

    public static EnumC2350a3[] values() {
        return (EnumC2350a3[]) f9290w.clone();
    }
}
