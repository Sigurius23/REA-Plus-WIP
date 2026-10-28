package p048ce;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ce.l */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC4471l {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC4471l[] f17997E;

    /* JADX INFO: renamed from: w */
    public static final EnumC4471l f17998w;

    /* JADX INFO: renamed from: x */
    public static final EnumC4471l f17999x;

    /* JADX INFO: renamed from: y */
    public static final EnumC4471l f18000y;

    /* JADX INFO: renamed from: z */
    public static final EnumC4471l f18001z;

    static {
        EnumC4471l enumC4471l = new EnumC4471l("PROFILE", 0);
        f17998w = enumC4471l;
        EnumC4471l enumC4471l2 = new EnumC4471l("SSO_SESSION", 1);
        f17999x = enumC4471l2;
        EnumC4471l enumC4471l3 = new EnumC4471l("SERVICES", 2);
        f18000y = enumC4471l3;
        EnumC4471l enumC4471l4 = new EnumC4471l("UNKNOWN", 3);
        f18001z = enumC4471l4;
        EnumC4471l[] enumC4471lArr = {enumC4471l, enumC4471l2, enumC4471l3, enumC4471l4};
        f17997E = enumC4471lArr;
        AbstractC15751g.m44468u(enumC4471lArr);
    }

    public static EnumC4471l valueOf(String str) {
        return (EnumC4471l) Enum.valueOf(EnumC4471l.class, str);
    }

    public static EnumC4471l[] values() {
        return (EnumC4471l[]) f17997E.clone();
    }
}
