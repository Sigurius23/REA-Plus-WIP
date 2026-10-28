package b33;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b33.a */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC2680a {

    /* JADX INFO: renamed from: E */
    public static final EnumC2680a f10545E;

    /* JADX INFO: renamed from: F */
    public static final EnumC2680a f10546F;

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ EnumC2680a[] f10547G;

    /* JADX INFO: renamed from: w */
    public static final EnumC2680a f10548w;

    /* JADX INFO: renamed from: x */
    public static final EnumC2680a f10549x;

    /* JADX INFO: renamed from: y */
    public static final EnumC2680a f10550y;

    /* JADX INFO: renamed from: z */
    public static final EnumC2680a f10551z;

    static {
        EnumC2680a enumC2680a = new EnumC2680a("CLIENT_ABORTED", 0);
        f10548w = enumC2680a;
        EnumC2680a enumC2680a2 = new EnumC2680a("BACKEND_LEAVE", 1);
        f10549x = enumC2680a2;
        EnumC2680a enumC2680a3 = new EnumC2680a("NETWORK_OFFLINE", 2);
        f10550y = enumC2680a3;
        EnumC2680a enumC2680a4 = new EnumC2680a("RETRY_EXHAUSTED", 3);
        f10551z = enumC2680a4;
        EnumC2680a enumC2680a5 = new EnumC2680a("SDK_DRIVEN_ANDROID", 4);
        f10545E = enumC2680a5;
        EnumC2680a enumC2680a6 = new EnumC2680a("REQUEST_TIMEOUT", 5);
        EnumC2680a enumC2680a7 = new EnumC2680a("SFU_ERROR", 6);
        EnumC2680a enumC2680a8 = new EnumC2680a("SERVER_ERROR", 7);
        EnumC2680a enumC2680a9 = new EnumC2680a("CUSTOM", 8);
        f10546F = enumC2680a9;
        EnumC2680a[] enumC2680aArr = {enumC2680a, enumC2680a2, enumC2680a3, enumC2680a4, enumC2680a5, enumC2680a6, enumC2680a7, enumC2680a8, enumC2680a9};
        f10547G = enumC2680aArr;
        AbstractC15751g.m44468u(enumC2680aArr);
    }

    public static EnumC2680a valueOf(String str) {
        return (EnumC2680a) Enum.valueOf(EnumC2680a.class, str);
    }

    public static EnumC2680a[] values() {
        return (EnumC2680a[]) f10547G.clone();
    }
}
