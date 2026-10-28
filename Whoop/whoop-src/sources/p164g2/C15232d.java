package p164g2;

/* JADX INFO: renamed from: g2.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C15232d {

    /* JADX INFO: renamed from: a */
    public final int f57230a;

    public /* synthetic */ C15232d(int i13) {
        this.f57230a = i13;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C15232d m43297a(int i13) {
        return new C15232d(i13);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m43298b(int i13, int i14) {
        return i13 == i14;
    }

    /* JADX INFO: renamed from: c */
    public static String m43299c(int i13) {
        if (i13 == 1) {
            return "Next";
        }
        if (i13 == 2) {
            return "Previous";
        }
        if (i13 == 3) {
            return "Left";
        }
        if (i13 == 4) {
            return "Right";
        }
        if (i13 == 5) {
            return "Up";
        }
        if (i13 == 6) {
            return "Down";
        }
        if (i13 == 7) {
            return "Enter";
        }
        return i13 == 8 ? "Exit" : "Invalid FocusDirection";
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int m43300d() {
        return this.f57230a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C15232d) {
            return this.f57230a == ((C15232d) obj).f57230a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f57230a);
    }

    public final String toString() {
        return m43299c(this.f57230a);
    }
}
