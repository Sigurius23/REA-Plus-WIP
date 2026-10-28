package z93;

import ge3.AbstractC15751g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: z93.c */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC40212c implements InterfaceC40210a {

    /* JADX INFO: renamed from: E */
    public static final EnumC40212c f173632E;

    /* JADX INFO: renamed from: F */
    public static final EnumC40212c f173633F;

    /* JADX INFO: renamed from: G */
    public static final EnumC40212c f173634G;

    /* JADX INFO: renamed from: H */
    public static final EnumC40212c f173635H;

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ EnumC40212c[] f173636I;

    /* JADX INFO: renamed from: w */
    public static final EnumC40212c f173637w;

    /* JADX INFO: renamed from: x */
    public static final EnumC40212c f173638x;

    /* JADX INFO: renamed from: y */
    public static final EnumC40212c f173639y;

    /* JADX INFO: renamed from: z */
    public static final EnumC40212c f173640z;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC40212c EF1;

    static {
        EnumC40212c enumC40212c = new EnumC40212c("FROM_IDE", 0);
        EnumC40212c enumC40212c2 = new EnumC40212c("FROM_BACKEND", 1);
        EnumC40212c enumC40212c3 = new EnumC40212c("FROM_TEST", 2);
        EnumC40212c enumC40212c4 = new EnumC40212c("FROM_BUILTINS", 3);
        f173637w = enumC40212c4;
        EnumC40212c enumC40212c5 = new EnumC40212c("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
        EnumC40212c enumC40212c6 = new EnumC40212c("WHEN_CHECK_OVERRIDES", 5);
        EnumC40212c enumC40212c7 = new EnumC40212c("FOR_SCRIPT", 6);
        EnumC40212c enumC40212c8 = new EnumC40212c("FROM_REFLECTION", 7);
        f173638x = enumC40212c8;
        EnumC40212c enumC40212c9 = new EnumC40212c("WHEN_RESOLVE_DECLARATION", 8);
        EnumC40212c enumC40212c10 = new EnumC40212c("WHEN_GET_DECLARATION_SCOPE", 9);
        EnumC40212c enumC40212c11 = new EnumC40212c("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
        EnumC40212c enumC40212c12 = new EnumC40212c("FOR_ALREADY_TRACKED", 11);
        f173639y = enumC40212c12;
        EnumC40212c enumC40212c13 = new EnumC40212c("WHEN_GET_ALL_DESCRIPTORS", 12);
        f173640z = enumC40212c13;
        EnumC40212c enumC40212c14 = new EnumC40212c("WHEN_TYPING", 13);
        EnumC40212c enumC40212c15 = new EnumC40212c("WHEN_GET_SUPER_MEMBERS", 14);
        f173632E = enumC40212c15;
        EnumC40212c enumC40212c16 = new EnumC40212c("FOR_NON_TRACKED_SCOPE", 15);
        f173633F = enumC40212c16;
        EnumC40212c enumC40212c17 = new EnumC40212c("FROM_SYNTHETIC_SCOPE", 16);
        EnumC40212c enumC40212c18 = new EnumC40212c("FROM_DESERIALIZATION", 17);
        f173634G = enumC40212c18;
        EnumC40212c enumC40212c19 = new EnumC40212c("FROM_JAVA_LOADER", 18);
        f173635H = enumC40212c19;
        EnumC40212c[] enumC40212cArr = {enumC40212c, enumC40212c2, enumC40212c3, enumC40212c4, enumC40212c5, enumC40212c6, enumC40212c7, enumC40212c8, enumC40212c9, enumC40212c10, enumC40212c11, enumC40212c12, enumC40212c13, enumC40212c14, enumC40212c15, enumC40212c16, enumC40212c17, enumC40212c18, enumC40212c19, new EnumC40212c("WHEN_GET_LOCAL_VARIABLE", 19), new EnumC40212c("WHEN_FIND_BY_FQNAME", 20), new EnumC40212c("WHEN_GET_COMPANION_OBJECT", 21), new EnumC40212c("FOR_DEFAULT_IMPORTS", 22)};
        f173636I = enumC40212cArr;
        AbstractC15751g.m44468u(enumC40212cArr);
    }

    public static EnumC40212c valueOf(String str) {
        return (EnumC40212c) Enum.valueOf(EnumC40212c.class, str);
    }

    public static EnumC40212c[] values() {
        return (EnumC40212c[]) f173636I.clone();
    }
}
