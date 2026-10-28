package db3;

import va3.C35845c;
import va3.C35847e;

/* JADX INFO: renamed from: db3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C11890b {

    /* JADX INFO: renamed from: a */
    public final String f38861a;

    public C11890b(String str) {
        if (str != null) {
            this.f38861a = str;
        } else {
            m31924a(7);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m31924a(int i13) {
        String str;
        int i14;
        if (i13 != 3 && i13 != 5) {
            switch (i13) {
                case 8:
                case 9:
                case 10:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i13 != 3 && i13 != 5) {
            switch (i13) {
                case 8:
                case 9:
                case 10:
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
            case 2:
                objArr[0] = "classId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 4:
            case 6:
                objArr[0] = "fqName";
                break;
            case 7:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i13 == 3) {
            objArr[1] = "internalNameByClassId";
        } else if (i13 != 5) {
            switch (i13) {
                case 8:
                    objArr[1] = "getFqNameForClassNameWithoutDollars";
                    break;
                case 9:
                    objArr[1] = "getPackageFqName";
                    break;
                case 10:
                    objArr[1] = "getInternalName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                    break;
            }
        } else {
            objArr[1] = "byFqNameWithoutInnerClasses";
        }
        switch (i13) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
                objArr[2] = "internalNameByClassId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                break;
            case 4:
            case 6:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 3 && i13 != 5) {
            switch (i13) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public static C11890b m31925b(C35847e c35847e) {
        if (c35847e != null) {
            return new C11890b(c35847e.f152613a.f152616a.replace('.', '/'));
        }
        m31924a(4);
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static C11890b m31926c(String str) {
        if (str != null) {
            return new C11890b(str);
        }
        m31924a(0);
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static String m31927e(C35845c c35845c) {
        C35847e c35847e = c35845c.f152609a;
        String strReplace = c35845c.f152610b.f152613a.f152616a.replace('.', '$');
        if (!c35847e.f152613a.m113793c()) {
            strReplace = c35847e.f152613a.f152616a.replace('.', '/') + "/" + strReplace;
        }
        if (strReplace != null) {
            return strReplace;
        }
        m31924a(3);
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final String m31928d() {
        String str = this.f38861a;
        if (str != null) {
            return str;
        }
        m31924a(10);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11890b.class != obj.getClass()) {
            return false;
        }
        return this.f38861a.equals(((C11890b) obj).f38861a);
    }

    public final int hashCode() {
        return this.f38861a.hashCode();
    }

    public final String toString() {
        return this.f38861a;
    }
}
