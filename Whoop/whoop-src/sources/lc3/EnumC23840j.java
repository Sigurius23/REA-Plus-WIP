package lc3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lc3.j */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC23840j {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC23840j[] f94295E;

    /* JADX INFO: renamed from: w */
    public static final EnumC23840j f94296w;

    /* JADX INFO: renamed from: x */
    public static final EnumC23840j f94297x;

    /* JADX INFO: renamed from: y */
    public static final EnumC23840j f94298y;

    /* JADX INFO: renamed from: z */
    public static final EnumC23840j f94299z;

    static {
        EnumC23840j enumC23840j = new EnumC23840j("SUCCESSFUL", 0);
        f94296w = enumC23840j;
        EnumC23840j enumC23840j2 = new EnumC23840j("REREGISTER", 1);
        f94297x = enumC23840j2;
        EnumC23840j enumC23840j3 = new EnumC23840j("CANCELLED", 2);
        f94298y = enumC23840j3;
        EnumC23840j enumC23840j4 = new EnumC23840j("ALREADY_SELECTED", 3);
        f94299z = enumC23840j4;
        EnumC23840j[] enumC23840jArr = {enumC23840j, enumC23840j2, enumC23840j3, enumC23840j4};
        f94295E = enumC23840jArr;
        AbstractC15751g.m44468u(enumC23840jArr);
    }

    public static EnumC23840j valueOf(String str) {
        return (EnumC23840j) Enum.valueOf(EnumC23840j.class, str);
    }

    public static EnumC23840j[] values() {
        return (EnumC23840j[]) f94295E.clone();
    }
}
