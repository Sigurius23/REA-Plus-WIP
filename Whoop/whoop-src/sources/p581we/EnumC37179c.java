package p581we;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: we.c */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC37179c {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC37179c[] f158973E;

    /* JADX INFO: renamed from: w */
    public static final EnumC37179c f158974w;

    /* JADX INFO: renamed from: x */
    public static final EnumC37179c f158975x;

    /* JADX INFO: renamed from: y */
    public static final EnumC37179c f158976y;

    /* JADX INFO: renamed from: z */
    public static final EnumC37179c f158977z;

    static {
        EnumC37179c enumC37179c = new EnumC37179c("HTTP_REQUEST_VIA_HEADERS", 0);
        f158974w = enumC37179c;
        EnumC37179c enumC37179c2 = new EnumC37179c("HTTP_REQUEST_VIA_QUERY_PARAMS", 1);
        f158975x = enumC37179c2;
        EnumC37179c enumC37179c3 = new EnumC37179c("HTTP_REQUEST_CHUNK", 2);
        f158976y = enumC37179c3;
        EnumC37179c enumC37179c4 = new EnumC37179c("HTTP_REQUEST_TRAILING_HEADERS", 3);
        f158977z = enumC37179c4;
        EnumC37179c[] enumC37179cArr = {enumC37179c, enumC37179c2, enumC37179c3, enumC37179c4, new EnumC37179c("HTTP_REQUEST_EVENT", 4)};
        f158973E = enumC37179cArr;
        AbstractC15751g.m44468u(enumC37179cArr);
    }

    public static EnumC37179c valueOf(String str) {
        return (EnumC37179c) Enum.valueOf(EnumC37179c.class, str);
    }

    public static EnumC37179c[] values() {
        return (EnumC37179c[]) f158973E.clone();
    }
}
