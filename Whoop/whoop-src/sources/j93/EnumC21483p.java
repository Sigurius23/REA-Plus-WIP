package j93;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j93.p */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC21483p {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC21483p[] f82445E;

    /* JADX INFO: renamed from: w */
    public static final EnumC21483p f82446w;

    /* JADX INFO: renamed from: x */
    public static final EnumC21483p f82447x;

    /* JADX INFO: renamed from: y */
    public static final EnumC21483p f82448y;

    /* JADX INFO: renamed from: z */
    public static final EnumC21483p f82449z;

    static {
        EnumC21483p enumC21483p = new EnumC21483p("INSTANCE", 0);
        f82446w = enumC21483p;
        EnumC21483p enumC21483p2 = new EnumC21483p("CONTEXT", 1);
        f82447x = enumC21483p2;
        EnumC21483p enumC21483p3 = new EnumC21483p("EXTENSION_RECEIVER", 2);
        f82448y = enumC21483p3;
        EnumC21483p enumC21483p4 = new EnumC21483p("VALUE", 3);
        f82449z = enumC21483p4;
        EnumC21483p[] enumC21483pArr = {enumC21483p, enumC21483p2, enumC21483p3, enumC21483p4};
        f82445E = enumC21483pArr;
        AbstractC15751g.m44468u(enumC21483pArr);
    }

    public static EnumC21483p valueOf(String str) {
        return (EnumC21483p) Enum.valueOf(EnumC21483p.class, str);
    }

    public static EnumC21483p[] values() {
        return (EnumC21483p[]) f82445E.clone();
    }
}
