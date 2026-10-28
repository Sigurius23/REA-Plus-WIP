package p571w3;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: w3.j */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC36774j {

    /* JADX INFO: renamed from: w */
    public static final EnumC36774j f157347w;

    /* JADX INFO: renamed from: x */
    public static final EnumC36774j f157348x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC36774j[] f157349y;

    static {
        EnumC36774j enumC36774j = new EnumC36774j("Ltr", 0);
        f157347w = enumC36774j;
        EnumC36774j enumC36774j2 = new EnumC36774j("Rtl", 1);
        f157348x = enumC36774j2;
        EnumC36774j[] enumC36774jArr = {enumC36774j, enumC36774j2};
        f157349y = enumC36774jArr;
        AbstractC15751g.m44468u(enumC36774jArr);
    }

    public static EnumC36774j valueOf(String str) {
        return (EnumC36774j) Enum.valueOf(EnumC36774j.class, str);
    }

    public static EnumC36774j[] values() {
        return (EnumC36774j[]) f157349y.clone();
    }
}
