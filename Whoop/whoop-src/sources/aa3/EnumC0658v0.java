package aa3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: aa3.v0 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC0658v0 {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC0658v0[] f2288w;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0658v0 EF5;

    static {
        EnumC0658v0[] enumC0658v0Arr = {new EnumC0658v0("AT_MOST_ONCE", 0), new EnumC0658v0("EXACTLY_ONCE", 1), new EnumC0658v0("AT_LEAST_ONCE", 2)};
        f2288w = enumC0658v0Arr;
        AbstractC15751g.m44468u(enumC0658v0Arr);
    }

    public static EnumC0658v0 valueOf(String str) {
        return (EnumC0658v0) Enum.valueOf(EnumC0658v0.class, str);
    }

    public static EnumC0658v0[] values() {
        return (EnumC0658v0[]) f2288w.clone();
    }
}
