package p571w3;

/* JADX INFO: renamed from: w3.k */
/* JADX INFO: loaded from: classes.dex */
public final class C36775k {

    /* JADX INFO: renamed from: a */
    public final int f157350a;

    /* JADX INFO: renamed from: a */
    public static String m117881a(int i13) {
        if (i13 == 1) {
            return "Left";
        }
        if (i13 == 2) {
            return "Right";
        }
        if (i13 == 3) {
            return "Center";
        }
        if (i13 == 4) {
            return "Justify";
        }
        if (i13 == 5) {
            return "Start";
        }
        if (i13 == 6) {
            return "End";
        }
        return i13 == Integer.MIN_VALUE ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C36775k) {
            return this.f157350a == ((C36775k) obj).f157350a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f157350a);
    }

    public final String toString() {
        return m117881a(this.f157350a);
    }
}
