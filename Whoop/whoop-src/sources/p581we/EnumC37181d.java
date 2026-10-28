package p581we;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: we.d */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC37181d {

    /* JADX INFO: renamed from: w */
    public static final EnumC37181d f158979w;

    /* JADX INFO: renamed from: x */
    public static final EnumC37181d f158980x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC37181d[] f158981y;

    static {
        EnumC37181d enumC37181d = new EnumC37181d("NONE", 0);
        f158979w = enumC37181d;
        EnumC37181d enumC37181d2 = new EnumC37181d("X_AMZ_CONTENT_SHA256", 1);
        f158980x = enumC37181d2;
        EnumC37181d[] enumC37181dArr = {enumC37181d, enumC37181d2};
        f158981y = enumC37181dArr;
        AbstractC15751g.m44468u(enumC37181dArr);
    }

    public static EnumC37181d valueOf(String str) {
        return (EnumC37181d) Enum.valueOf(EnumC37181d.class, str);
    }

    public static EnumC37181d[] values() {
        return (EnumC37181d[]) f158981y.clone();
    }
}
