package m93;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: m93.a */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC25328a {

    /* JADX INFO: renamed from: w */
    public static final EnumC25328a f99335w;

    /* JADX INFO: renamed from: x */
    public static final EnumC25328a f99336x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC25328a[] f99337y;

    static {
        EnumC25328a enumC25328a = new EnumC25328a("CALL_BY_NAME", 0);
        f99335w = enumC25328a;
        EnumC25328a enumC25328a2 = new EnumC25328a("POSITIONAL_CALL", 1);
        f99336x = enumC25328a2;
        EnumC25328a[] enumC25328aArr = {enumC25328a, enumC25328a2};
        f99337y = enumC25328aArr;
        AbstractC15751g.m44468u(enumC25328aArr);
    }

    public static EnumC25328a valueOf(String str) {
        return (EnumC25328a) Enum.valueOf(EnumC25328a.class, str);
    }

    public static EnumC25328a[] values() {
        return (EnumC25328a[]) f99337y.clone();
    }
}
