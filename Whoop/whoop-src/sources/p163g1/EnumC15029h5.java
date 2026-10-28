package p163g1;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: g1.h5 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC15029h5 {

    /* JADX INFO: renamed from: E */
    public static final EnumC15029h5 f56255E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ EnumC15029h5[] f56256F;

    /* JADX INFO: renamed from: w */
    public static final EnumC15029h5 f56257w;

    /* JADX INFO: renamed from: x */
    public static final EnumC15029h5 f56258x;

    /* JADX INFO: renamed from: y */
    public static final EnumC15029h5 f56259y;

    /* JADX INFO: renamed from: z */
    public static final EnumC15029h5 f56260z;

    static {
        EnumC15029h5 enumC15029h5 = new EnumC15029h5("TopBar", 0);
        f56257w = enumC15029h5;
        EnumC15029h5 enumC15029h6 = new EnumC15029h5("MainContent", 1);
        f56258x = enumC15029h6;
        EnumC15029h5 enumC15029h7 = new EnumC15029h5("Snackbar", 2);
        f56259y = enumC15029h7;
        EnumC15029h5 enumC15029h8 = new EnumC15029h5("Fab", 3);
        f56260z = enumC15029h8;
        EnumC15029h5 enumC15029h9 = new EnumC15029h5("BottomBar", 4);
        f56255E = enumC15029h9;
        EnumC15029h5[] enumC15029h5Arr = {enumC15029h5, enumC15029h6, enumC15029h7, enumC15029h8, enumC15029h9};
        f56256F = enumC15029h5Arr;
        AbstractC15751g.m44468u(enumC15029h5Arr);
    }

    public static EnumC15029h5 valueOf(String str) {
        return (EnumC15029h5) Enum.valueOf(EnumC15029h5.class, str);
    }

    public static EnumC15029h5[] values() {
        return (EnumC15029h5[]) f56256F.clone();
    }
}
