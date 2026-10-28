package ma3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ma3.g */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC25378g {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC25378g[] f99454w;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC25378g EF5;

    static {
        EnumC25378g[] enumC25378gArr = {new EnumC25378g("SOURCE", 0), new EnumC25378g("BINARY", 1)};
        f99454w = enumC25378gArr;
        AbstractC15751g.m44468u(enumC25378gArr);
    }

    public static EnumC25378g valueOf(String str) {
        return (EnumC25378g) Enum.valueOf(EnumC25378g.class, str);
    }

    public static EnumC25378g[] values() {
        return (EnumC25378g[]) f99454w.clone();
    }
}
