package p512u2;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: u2.l */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC34466l {

    /* JADX INFO: renamed from: w */
    public static final EnumC34466l f144806w;

    /* JADX INFO: renamed from: x */
    public static final EnumC34466l f144807x;

    /* JADX INFO: renamed from: y */
    public static final EnumC34466l f144808y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC34466l[] f144809z;

    static {
        EnumC34466l enumC34466l = new EnumC34466l("Initial", 0);
        f144806w = enumC34466l;
        EnumC34466l enumC34466l2 = new EnumC34466l("Main", 1);
        f144807x = enumC34466l2;
        EnumC34466l enumC34466l3 = new EnumC34466l("Final", 2);
        f144808y = enumC34466l3;
        EnumC34466l[] enumC34466lArr = {enumC34466l, enumC34466l2, enumC34466l3};
        f144809z = enumC34466lArr;
        AbstractC15751g.m44468u(enumC34466lArr);
    }

    public static EnumC34466l valueOf(String str) {
        return (EnumC34466l) Enum.valueOf(EnumC34466l.class, str);
    }

    public static EnumC34466l[] values() {
        return (EnumC34466l[]) f144809z.clone();
    }
}
