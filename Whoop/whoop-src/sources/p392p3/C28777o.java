package p392p3;

/* JADX INFO: renamed from: p3.o */
/* JADX INFO: loaded from: classes.dex */
public final class C28777o {

    /* JADX INFO: renamed from: a */
    public final int f116536a;

    public final boolean equals(Object obj) {
        if (obj instanceof C28777o) {
            return this.f116536a == ((C28777o) obj).f116536a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f116536a);
    }

    public final String toString() {
        int i13 = this.f116536a;
        if (i13 == 0) {
            return "None";
        }
        if (i13 == 1) {
            return "Weight";
        }
        if (i13 == 2) {
            return "Style";
        }
        return i13 == 65535 ? "All" : "Invalid";
    }
}
