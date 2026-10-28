package db3;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import o93.EnumC27738j;
import p000.AbstractC11266d;
import va3.C35847e;

/* JADX INFO: renamed from: db3.c */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC11891c {
    BOOLEAN(EnumC27738j.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(EnumC27738j.CHAR, "char", "C", "java.lang.Character"),
    BYTE(EnumC27738j.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(EnumC27738j.SHORT, "short", "S", "java.lang.Short"),
    INT(EnumC27738j.INT, "int", "I", "java.lang.Integer"),
    FLOAT(EnumC27738j.FLOAT, "float", "F", "java.lang.Float"),
    LONG(EnumC27738j.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(EnumC27738j.DOUBLE, "double", "D", "java.lang.Double");


    /* JADX INFO: renamed from: M */
    public static final HashMap f38870M = new HashMap();

    /* JADX INFO: renamed from: N */
    public static final EnumMap f38871N = new EnumMap(EnumC27738j.class);

    /* JADX INFO: renamed from: O */
    public static final HashMap f38872O = new HashMap();

    /* JADX INFO: renamed from: P */
    public static final HashSet f38873P = new HashSet();

    /* JADX INFO: renamed from: Q */
    public static final HashMap f38874Q = new HashMap();

    /* JADX INFO: renamed from: w */
    public final EnumC27738j f38876w;

    /* JADX INFO: renamed from: x */
    public final String f38877x;

    /* JADX INFO: renamed from: y */
    public final String f38878y;

    /* JADX INFO: renamed from: z */
    public final C35847e f38879z;

    static {
        for (EnumC11891c enumC11891c : values()) {
            f38870M.put(enumC11891c.f38877x, enumC11891c);
            f38871N.put(enumC11891c.m31932d(), enumC11891c);
            f38872O.put(enumC11891c.m31931c(), enumC11891c);
            String strReplace = enumC11891c.f38879z.f152613a.f152616a.replace('.', '/');
            f38873P.add(strReplace);
            f38874Q.put(strReplace, AbstractC11266d.m30464r(new StringBuilder("("), enumC11891c.f38878y, ")L", strReplace, ";"));
        }
    }

    EnumC11891c(EnumC27738j enumC27738j, String str, String str2, String str3) {
        if (enumC27738j == null) {
            m31929a(8);
            throw null;
        }
        this.f38876w = enumC27738j;
        this.f38877x = str;
        this.f38878y = str2;
        this.f38879z = new C35847e(str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m31929a(int i13) {
        String str;
        int i14;
        if (i13 != 4 && i13 != 6) {
            switch (i13) {
                case 12:
                case 13:
                case 14:
                case 15:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i13 != 4 && i13 != 6) {
            switch (i13) {
                case 12:
                case 13:
                case 14:
                case 15:
                    i14 = 2;
                    break;
                default:
                    i14 = 3;
                    break;
            }
        } else {
            i14 = 2;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "methodDescriptor";
                break;
            case 3:
            case 9:
                objArr[0] = "name";
                break;
            case 4:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            case 5:
                objArr[0] = "type";
                break;
            case 7:
            case 10:
                objArr[0] = "desc";
                break;
            case 8:
                objArr[0] = "primitiveType";
                break;
            case 11:
                objArr[0] = "wrapperClassName";
                break;
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i13 != 4 && i13 != 6) {
            switch (i13) {
                case 12:
                    objArr[1] = "getPrimitiveType";
                    break;
                case 13:
                    objArr[1] = "getJavaKeywordName";
                    break;
                case 14:
                    objArr[1] = "getDesc";
                    break;
                case 15:
                    objArr[1] = "getWrapperFqName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
            }
        } else {
            objArr[1] = "get";
        }
        switch (i13) {
            case 1:
            case 2:
                objArr[2] = "isBoxingMethodDescriptor";
                break;
            case 3:
            case 5:
                objArr[2] = "get";
                break;
            case 4:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "getByDesc";
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "isWrapperClassInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 4 && i13 != 6) {
            switch (i13) {
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public static EnumC11891c m31930b(String str) {
        EnumC11891c enumC11891c = (EnumC11891c) f38870M.get(str);
        if (enumC11891c != null) {
            return enumC11891c;
        }
        throw new AssertionError("Non-primitive type name passed: ".concat(str));
    }

    /* JADX INFO: renamed from: c */
    public final String m31931c() {
        String str = this.f38878y;
        if (str != null) {
            return str;
        }
        m31929a(14);
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final EnumC27738j m31932d() {
        EnumC27738j enumC27738j = this.f38876w;
        if (enumC27738j != null) {
            return enumC27738j;
        }
        m31929a(12);
        throw null;
    }
}
