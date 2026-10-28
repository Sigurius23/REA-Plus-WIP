package p412q3;

/* JADX INFO: renamed from: q3.k */
/* JADX INFO: loaded from: classes.dex */
public final class C29877k {

    /* JADX INFO: renamed from: a */
    public final int f122097a;

    /* JADX INFO: renamed from: a */
    public static String m91501a(int i13) {
        if (i13 == -1) {
            return "Unspecified";
        }
        if (i13 == 0) {
            return "None";
        }
        if (i13 == 1) {
            return "Default";
        }
        if (i13 == 2) {
            return "Go";
        }
        if (i13 == 3) {
            return "Search";
        }
        if (i13 == 4) {
            return "Send";
        }
        if (i13 == 5) {
            return "Previous";
        }
        if (i13 == 6) {
            return "Next";
        }
        return i13 == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C29877k) {
            return this.f122097a == ((C29877k) obj).f122097a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f122097a);
    }

    public final String toString() {
        return m91501a(this.f122097a);
    }
}
