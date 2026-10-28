package p326mf;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: mf.p */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC25496p {

    /* JADX INFO: renamed from: E */
    public static final EnumC25496p f99833E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ EnumC25496p[] f99834F;

    /* JADX INFO: renamed from: w */
    public static final EnumC25496p f99835w;

    /* JADX INFO: renamed from: x */
    public static final EnumC25496p f99836x;

    /* JADX INFO: renamed from: y */
    public static final EnumC25496p f99837y;

    /* JADX INFO: renamed from: z */
    public static final EnumC25496p f99838z;

    static {
        EnumC25496p enumC25496p = new EnumC25496p("CONNECT_TIMEOUT", 0);
        f99835w = enumC25496p;
        EnumC25496p enumC25496p2 = new EnumC25496p("CONNECTION_ACQUIRE_TIMEOUT", 1);
        EnumC25496p enumC25496p3 = new EnumC25496p("TLS_NEGOTIATION_TIMEOUT", 2);
        EnumC25496p enumC25496p4 = new EnumC25496p("TLS_NEGOTIATION_ERROR", 3);
        f99836x = enumC25496p4;
        EnumC25496p enumC25496p5 = new EnumC25496p("CONNECTION_CLOSED", 4);
        f99837y = enumC25496p5;
        EnumC25496p enumC25496p6 = new EnumC25496p("SOCKET_TIMEOUT", 5);
        f99838z = enumC25496p6;
        EnumC25496p enumC25496p7 = new EnumC25496p("PROTOCOL_NEGOTIATION_ERROR", 6);
        EnumC25496p enumC25496p8 = new EnumC25496p("SDK_UNKNOWN", 7);
        f99833E = enumC25496p8;
        EnumC25496p[] enumC25496pArr = {enumC25496p, enumC25496p2, enumC25496p3, enumC25496p4, enumC25496p5, enumC25496p6, enumC25496p7, enumC25496p8};
        f99834F = enumC25496pArr;
        AbstractC15751g.m44468u(enumC25496pArr);
    }

    public static EnumC25496p valueOf(String str) {
        return (EnumC25496p) Enum.valueOf(EnumC25496p.class, str);
    }

    public static EnumC25496p[] values() {
        return (EnumC25496p[]) f99834F.clone();
    }
}
