package ya3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ya3.q */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC39374q {

    /* JADX INFO: renamed from: w */
    public static final EnumC39374q f169426w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC39374q[] f169427x;

    static {
        EnumC39374q enumC39374q = new EnumC39374q("MustUse", 0);
        f169426w = enumC39374q;
        EnumC39374q[] enumC39374qArr = {enumC39374q, new EnumC39374q("ExplicitlyIgnorable", 1), new EnumC39374q("Unspecified", 2)};
        f169427x = enumC39374qArr;
        AbstractC15751g.m44468u(enumC39374qArr);
    }

    public static EnumC39374q valueOf(String str) {
        return (EnumC39374q) Enum.valueOf(EnumC39374q.class, str);
    }

    public static EnumC39374q[] values() {
        return (EnumC39374q[]) f169427x.clone();
    }
}
