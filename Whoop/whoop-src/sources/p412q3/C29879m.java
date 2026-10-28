package p412q3;

/* JADX INFO: renamed from: q3.m */
/* JADX INFO: loaded from: classes.dex */
public final class C29879m {

    /* JADX INFO: renamed from: a */
    public final int f122105a;

    /* JADX INFO: renamed from: a */
    public static String m91502a(int i13) {
        if (i13 == -1) {
            return "Unspecified";
        }
        if (i13 == 0) {
            return "None";
        }
        if (i13 == 1) {
            return "Characters";
        }
        if (i13 == 2) {
            return "Words";
        }
        return i13 == 3 ? "Sentences" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C29879m) {
            return this.f122105a == ((C29879m) obj).f122105a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f122105a);
    }

    public final String toString() {
        return m91502a(this.f122105a);
    }
}
