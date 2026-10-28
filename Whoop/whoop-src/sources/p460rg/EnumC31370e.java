package p460rg;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: rg.e */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC31370e {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC31370e[] f129032w;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC31370e EF5;

    static {
        EnumC31370e[] enumC31370eArr = {new EnumC31370e("UNSET", 0), new EnumC31370e("OK", 1), new EnumC31370e("ERROR", 2)};
        f129032w = enumC31370eArr;
        AbstractC15751g.m44468u(enumC31370eArr);
    }

    public static EnumC31370e valueOf(String str) {
        return (EnumC31370e) Enum.valueOf(EnumC31370e.class, str);
    }

    public static EnumC31370e[] values() {
        return (EnumC31370e[]) f129032w.clone();
    }
}
