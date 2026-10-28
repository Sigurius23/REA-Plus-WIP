package p447r2;

/* JADX INFO: renamed from: r2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C30860a {

    /* JADX INFO: renamed from: a */
    public final int f127256a;

    public final boolean equals(Object obj) {
        if (obj instanceof C30860a) {
            return this.f127256a == ((C30860a) obj).f127256a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f127256a);
    }

    public final String toString() {
        int i13 = this.f127256a;
        if (i13 == 1) {
            return "Touch";
        }
        return i13 == 2 ? "Keyboard" : "Error";
    }
}
