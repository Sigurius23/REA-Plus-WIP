package e10;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: e10.m */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC12557m {

    /* JADX INFO: renamed from: w */
    public static final EnumC12557m f42884w;

    /* JADX INFO: renamed from: x */
    public static final EnumC12557m f42885x;

    /* JADX INFO: renamed from: y */
    public static final EnumC12557m f42886y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC12557m[] f42887z;

    static {
        EnumC12557m enumC12557m = new EnumC12557m("InformCancellation", 0);
        f42884w = enumC12557m;
        EnumC12557m enumC12557m2 = new EnumC12557m("ModifyPaymentDetails", 1);
        f42885x = enumC12557m2;
        EnumC12557m enumC12557m3 = new EnumC12557m("None", 2);
        f42886y = enumC12557m3;
        EnumC12557m[] enumC12557mArr = {enumC12557m, enumC12557m2, enumC12557m3};
        f42887z = enumC12557mArr;
        AbstractC15751g.m44468u(enumC12557mArr);
    }

    public static EnumC12557m valueOf(String str) {
        return (EnumC12557m) Enum.valueOf(EnumC12557m.class, str);
    }

    public static EnumC12557m[] values() {
        return (EnumC12557m[]) f42887z.clone();
    }
}
