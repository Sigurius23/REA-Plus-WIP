package p209i3;

/* JADX INFO: renamed from: i3.f */
/* JADX INFO: loaded from: classes.dex */
public final class C18024f {

    /* JADX INFO: renamed from: a */
    public final int f69940a;

    public final boolean equals(Object obj) {
        if (obj instanceof C18024f) {
            return this.f69940a == ((C18024f) obj).f69940a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f69940a);
    }

    public final String toString() {
        int i13 = this.f69940a;
        if (i13 == 0) {
            return "Polite";
        }
        return i13 == 1 ? "Assertive" : "Unknown";
    }
}
