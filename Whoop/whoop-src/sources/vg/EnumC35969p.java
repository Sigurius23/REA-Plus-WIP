package vg;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: vg.p */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC35969p {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC35969p[] f153150E;

    /* JADX INFO: renamed from: w */
    public static final EnumC35969p f153151w;

    /* JADX INFO: renamed from: x */
    public static final EnumC35969p f153152x;

    /* JADX INFO: renamed from: y */
    public static final EnumC35969p f153153y;

    /* JADX INFO: renamed from: z */
    public static final EnumC35969p f153154z;

    static {
        EnumC35969p enumC35969p = new EnumC35969p("NOT_INITIALIZED", 0);
        f153151w = enumC35969p;
        EnumC35969p enumC35969p2 = new EnumC35969p("INITIALIZED", 1);
        f153152x = enumC35969p2;
        EnumC35969p enumC35969p3 = new EnumC35969p("EXPLICIT_CONFIG", 2);
        f153153y = enumC35969p3;
        EnumC35969p enumC35969p4 = new EnumC35969p("EXPLICIT_INSTANCE", 3);
        f153154z = enumC35969p4;
        EnumC35969p[] enumC35969pArr = {enumC35969p, enumC35969p2, enumC35969p3, enumC35969p4};
        f153150E = enumC35969pArr;
        AbstractC15751g.m44468u(enumC35969pArr);
    }

    public static EnumC35969p valueOf(String str) {
        return (EnumC35969p) Enum.valueOf(EnumC35969p.class, str);
    }

    public static EnumC35969p[] values() {
        return (EnumC35969p[]) f153150E.clone();
    }
}
