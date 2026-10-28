package j43;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j43.d */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC21320d {

    /* JADX INFO: renamed from: w */
    public static final EnumC21320d f81527w;

    /* JADX INFO: renamed from: x */
    public static final EnumC21320d f81528x;

    /* JADX INFO: renamed from: y */
    public static final EnumC21320d f81529y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC21320d[] f81530z;

    static {
        EnumC21320d enumC21320d = new EnumC21320d("START", 0);
        f81527w = enumC21320d;
        EnumC21320d enumC21320d2 = new EnumC21320d("START_NO_CHANGE", 1);
        f81528x = enumC21320d2;
        EnumC21320d enumC21320d3 = new EnumC21320d("REDELIVER", 2);
        f81529y = enumC21320d3;
        EnumC21320d[] enumC21320dArr = {enumC21320d, enumC21320d2, enumC21320d3};
        f81530z = enumC21320dArr;
        AbstractC15751g.m44468u(enumC21320dArr);
    }

    public static EnumC21320d valueOf(String str) {
        return (EnumC21320d) Enum.valueOf(EnumC21320d.class, str);
    }

    public static EnumC21320d[] values() {
        return (EnumC21320d[]) f81530z.clone();
    }
}
