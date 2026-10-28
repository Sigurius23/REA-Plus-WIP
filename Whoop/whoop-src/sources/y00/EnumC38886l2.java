package y00;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: y00.l2 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC38886l2 {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC38886l2[] f167369w;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC38886l2 EF5;

    static {
        EnumC38886l2[] enumC38886l2Arr = {new EnumC38886l2("Created", 0), new EnumC38886l2("Authenticated", 1), new EnumC38886l2("Consented", 2), new EnumC38886l2("Rejected", 3), new EnumC38886l2("Expired", 4)};
        f167369w = enumC38886l2Arr;
        AbstractC15751g.m44468u(enumC38886l2Arr);
    }

    public static EnumC38886l2 valueOf(String str) {
        return (EnumC38886l2) Enum.valueOf(EnumC38886l2.class, str);
    }

    public static EnumC38886l2[] values() {
        return (EnumC38886l2[]) f167369w.clone();
    }
}
