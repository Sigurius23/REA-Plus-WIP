package p571w3;

/* JADX INFO: renamed from: w3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C36768d {

    /* JADX INFO: renamed from: a */
    public final int f157336a;

    /* JADX INFO: renamed from: a */
    public static String m117877a(int i13) {
        if (i13 == 1) {
            return "Hyphens.None";
        }
        if (i13 == 2) {
            return "Hyphens.Auto";
        }
        return i13 == Integer.MIN_VALUE ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C36768d) {
            return this.f157336a == ((C36768d) obj).f157336a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f157336a);
    }

    public final String toString() {
        return m117877a(this.f157336a);
    }
}
