package lb3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lb3.m0 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC23788m0 {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC23788m0[] f94170w;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC23788m0 EF5;

    static {
        EnumC23788m0[] enumC23788m0Arr = {new EnumC23788m0("CHECK_ONLY_LOWER", 0), new EnumC23788m0("CHECK_SUBTYPE_AND_LOWER", 1), new EnumC23788m0("SKIP_LOWER", 2)};
        f94170w = enumC23788m0Arr;
        AbstractC15751g.m44468u(enumC23788m0Arr);
    }

    public static EnumC23788m0 valueOf(String str) {
        return (EnumC23788m0) Enum.valueOf(EnumC23788m0.class, str);
    }

    public static EnumC23788m0[] values() {
        return (EnumC23788m0[]) f94170w.clone();
    }
}
