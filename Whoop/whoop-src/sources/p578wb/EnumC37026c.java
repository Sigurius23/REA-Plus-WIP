package p578wb;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: wb.c */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC37026c {

    /* JADX INFO: renamed from: E */
    public static final EnumC37026c f158401E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ EnumC37026c[] f158402F;

    /* JADX INFO: renamed from: w */
    public static final EnumC37026c f158403w;

    /* JADX INFO: renamed from: x */
    public static final EnumC37026c f158404x;

    /* JADX INFO: renamed from: y */
    public static final EnumC37026c f158405y;

    /* JADX INFO: renamed from: z */
    public static final EnumC37026c f158406z;

    static {
        EnumC37026c enumC37026c = new EnumC37026c("END", 0);
        f158403w = enumC37026c;
        EnumC37026c enumC37026c2 = new EnumC37026c("ROLLBACK", 1);
        f158404x = enumC37026c2;
        EnumC37026c enumC37026c3 = new EnumC37026c("BEGIN_EXCLUSIVE", 2);
        f158405y = enumC37026c3;
        EnumC37026c enumC37026c4 = new EnumC37026c("BEGIN_IMMEDIATE", 3);
        f158406z = enumC37026c4;
        EnumC37026c enumC37026c5 = new EnumC37026c("BEGIN_DEFERRED", 4);
        f158401E = enumC37026c5;
        EnumC37026c[] enumC37026cArr = {enumC37026c, enumC37026c2, enumC37026c3, enumC37026c4, enumC37026c5};
        f158402F = enumC37026cArr;
        AbstractC15751g.m44468u(enumC37026cArr);
    }

    public static EnumC37026c valueOf(String str) {
        return (EnumC37026c) Enum.valueOf(EnumC37026c.class, str);
    }

    public static EnumC37026c[] values() {
        return (EnumC37026c[]) f158402F.clone();
    }
}
