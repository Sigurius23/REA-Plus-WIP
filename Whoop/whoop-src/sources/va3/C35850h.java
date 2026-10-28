package va3;

/* JADX INFO: renamed from: va3.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C35850h implements Comparable {

    /* JADX INFO: renamed from: w */
    public final String f152620w;

    /* JADX INFO: renamed from: x */
    public final boolean f152621x;

    public C35850h(String str, boolean z4) {
        if (str == null) {
            m113812a(0);
            throw null;
        }
        this.f152620w = str;
        this.f152621x = z4;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m113812a(int i13) {
        String str = (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4) ? 2 : 3];
        if (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i13 == 1) {
            objArr[1] = "asString";
        } else if (i13 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i13 == 3 || i13 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i13) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 1 && i13 != 2 && i13 != 3 && i13 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: d */
    public static C35850h m113813d(String str) {
        if (str != null) {
            return str.startsWith("<") ? m113816g(str) : m113814e(str);
        }
        m113812a(9);
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static C35850h m113814e(String str) {
        if (str != null) {
            return new C35850h(str, false);
        }
        m113812a(5);
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m113815f(String str) {
        if (str == null) {
            m113812a(6);
            throw null;
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static C35850h m113816g(String str) {
        if (str == null) {
            m113812a(8);
            throw null;
        }
        if (str.startsWith("<")) {
            return new C35850h(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': ".concat(str));
    }

    /* JADX INFO: renamed from: b */
    public final String m113817b() {
        String str = this.f152620w;
        if (str != null) {
            return str;
        }
        m113812a(1);
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public final String m113818c() {
        if (this.f152621x) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String strM113817b = m113817b();
        if (strM113817b != null) {
            return strM113817b;
        }
        m113812a(2);
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f152620w.compareTo(((C35850h) obj).f152620w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35850h)) {
            return false;
        }
        C35850h c35850h = (C35850h) obj;
        return this.f152621x == c35850h.f152621x && this.f152620w.equals(c35850h.f152620w);
    }

    public final int hashCode() {
        return (this.f152620w.hashCode() * 31) + (this.f152621x ? 1 : 0);
    }

    public final String toString() {
        return this.f152620w;
    }
}
