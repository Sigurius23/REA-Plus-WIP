package ki;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ki.g */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC22495g {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC22495g[] f88193w;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC22495g EF5;

    static {
        EnumC22495g[] enumC22495gArr = {new EnumC22495g("Verbose", 0), new EnumC22495g("Debug", 1), new EnumC22495g("Info", 2), new EnumC22495g("Warn", 3), new EnumC22495g("Error", 4)};
        f88193w = enumC22495gArr;
        AbstractC15751g.m44468u(enumC22495gArr);
    }

    public static EnumC22495g valueOf(String str) {
        return (EnumC22495g) Enum.valueOf(EnumC22495g.class, str);
    }

    public static EnumC22495g[] values() {
        return (EnumC22495g[]) f88193w.clone();
    }
}
