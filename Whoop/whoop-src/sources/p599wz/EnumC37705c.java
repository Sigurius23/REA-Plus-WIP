package p599wz;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: wz.c */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC37705c {

    /* JADX INFO: renamed from: w */
    public static final EnumC37705c f161563w;

    /* JADX INFO: renamed from: x */
    public static final EnumC37705c f161564x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC37705c[] f161565y;

    static {
        EnumC37705c enumC37705c = new EnumC37705c("LoggedOut", 0);
        f161563w = enumC37705c;
        EnumC37705c enumC37705c2 = new EnumC37705c("PaymentConfirmed", 1);
        f161564x = enumC37705c2;
        EnumC37705c[] enumC37705cArr = {enumC37705c, enumC37705c2};
        f161565y = enumC37705cArr;
        AbstractC15751g.m44468u(enumC37705cArr);
    }

    public static EnumC37705c valueOf(String str) {
        return (EnumC37705c) Enum.valueOf(EnumC37705c.class, str);
    }

    public static EnumC37705c[] values() {
        return (EnumC37705c[]) f161565y.clone();
    }
}
