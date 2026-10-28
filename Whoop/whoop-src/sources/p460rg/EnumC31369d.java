package p460rg;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: rg.d */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC31369d {

    /* JADX INFO: renamed from: w */
    public static final EnumC31369d f129029w;

    /* JADX INFO: renamed from: x */
    public static final EnumC31369d f129030x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC31369d[] f129031y;

    static {
        EnumC31369d enumC31369d = new EnumC31369d("INTERNAL", 0);
        f129029w = enumC31369d;
        EnumC31369d enumC31369d2 = new EnumC31369d("CLIENT", 1);
        f129030x = enumC31369d2;
        EnumC31369d[] enumC31369dArr = {enumC31369d, enumC31369d2, new EnumC31369d("SERVER", 2)};
        f129031y = enumC31369dArr;
        AbstractC15751g.m44468u(enumC31369dArr);
    }

    public static EnumC31369d valueOf(String str) {
        return (EnumC31369d) Enum.valueOf(EnumC31369d.class, str);
    }

    public static EnumC31369d[] values() {
        return (EnumC31369d[]) f129031y.clone();
    }
}
