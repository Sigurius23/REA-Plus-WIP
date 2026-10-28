package p392p3;

/* JADX INFO: renamed from: p3.n */
/* JADX INFO: loaded from: classes.dex */
public final class C28776n {

    /* JADX INFO: renamed from: a */
    public final int f116535a;

    /* JADX INFO: renamed from: a */
    public static String m87530a(int i13) {
        if (i13 == 0) {
            return "Normal";
        }
        return i13 == 1 ? "Italic" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C28776n) {
            return this.f116535a == ((C28776n) obj).f116535a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f116535a);
    }

    public final String toString() {
        return m87530a(this.f116535a);
    }
}
