package p412q3;

/* JADX INFO: renamed from: q3.n */
/* JADX INFO: loaded from: classes.dex */
public final class C29880n {

    /* JADX INFO: renamed from: a */
    public final int f122106a;

    /* JADX INFO: renamed from: a */
    public static String m91503a(int i13) {
        if (i13 == 0) {
            return "Unspecified";
        }
        if (i13 == 1) {
            return "Text";
        }
        if (i13 == 2) {
            return "Ascii";
        }
        if (i13 == 3) {
            return "Number";
        }
        if (i13 == 4) {
            return "Phone";
        }
        if (i13 == 5) {
            return "Uri";
        }
        if (i13 == 6) {
            return "Email";
        }
        if (i13 == 7) {
            return "Password";
        }
        if (i13 == 8) {
            return "NumberPassword";
        }
        return i13 == 9 ? "Decimal" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C29880n) {
            return this.f122106a == ((C29880n) obj).f122106a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f122106a);
    }

    public final String toString() {
        return m91503a(this.f122106a);
    }
}
