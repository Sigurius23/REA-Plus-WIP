package p292l1;

/* JADX INFO: renamed from: l1.k1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23122k1 {

    /* JADX INFO: renamed from: a */
    public final int f91354a;

    public final boolean equals(Object obj) {
        if (obj instanceof C23122k1) {
            return this.f91354a == ((C23122k1) obj).f91354a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f91354a);
    }

    public final String toString() {
        int i13 = this.f91354a;
        if (i13 == 0) {
            return "Picker";
        }
        return i13 == 1 ? "Input" : "Unknown";
    }
}
