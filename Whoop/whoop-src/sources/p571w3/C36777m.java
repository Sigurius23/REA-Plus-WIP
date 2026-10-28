package p571w3;

/* JADX INFO: renamed from: w3.m */
/* JADX INFO: loaded from: classes.dex */
public final class C36777m {

    /* JADX INFO: renamed from: a */
    public final int f157355a;

    /* JADX INFO: renamed from: a */
    public static String m117882a(int i13) {
        if (i13 == 1) {
            return "Ltr";
        }
        if (i13 == 2) {
            return "Rtl";
        }
        if (i13 == 3) {
            return "Content";
        }
        if (i13 == 4) {
            return "ContentOrLtr";
        }
        if (i13 == 5) {
            return "ContentOrRtl";
        }
        return i13 == Integer.MIN_VALUE ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C36777m) {
            return this.f157355a == ((C36777m) obj).f157355a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f157355a);
    }

    public final String toString() {
        return m117882a(this.f157355a);
    }
}
