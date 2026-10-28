package ab3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ab3.n */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC0722n {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC0722n[] f2701w;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0722n EF5;

    static {
        EnumC0722n[] enumC0722nArr = {new EnumC0722n("COMMON_SUPER_TYPE", 0), new EnumC0722n("INTERSECTION_TYPE", 1)};
        f2701w = enumC0722nArr;
        AbstractC15751g.m44468u(enumC0722nArr);
    }

    public static EnumC0722n valueOf(String str) {
        return (EnumC0722n) Enum.valueOf(EnumC0722n.class, str);
    }

    public static EnumC0722n[] values() {
        return (EnumC0722n[]) f2701w.clone();
    }
}
