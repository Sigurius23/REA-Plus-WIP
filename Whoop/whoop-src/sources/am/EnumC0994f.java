package am;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: am.f */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC0994f {

    /* JADX INFO: renamed from: w */
    public static final EnumC0994f f3743w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC0994f[] f3744x;

    static {
        EnumC0994f enumC0994f = new EnumC0994f("Horizontal", 0);
        f3743w = enumC0994f;
        EnumC0994f[] enumC0994fArr = {enumC0994f, new EnumC0994f("Vertical", 1)};
        f3744x = enumC0994fArr;
        AbstractC15751g.m44468u(enumC0994fArr);
    }

    public static EnumC0994f valueOf(String str) {
        return (EnumC0994f) Enum.valueOf(EnumC0994f.class, str);
    }

    public static EnumC0994f[] values() {
        return (EnumC0994f[]) f3744x.clone();
    }
}
