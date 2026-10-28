package p208i2;

/* JADX INFO: renamed from: i2.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17890i0 {

    /* JADX INFO: renamed from: a */
    public final int f69586a;

    public final boolean equals(Object obj) {
        if (obj instanceof C17890i0) {
            return this.f69586a == ((C17890i0) obj).f69586a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f69586a);
    }

    public final String toString() {
        int i13 = this.f69586a;
        if (i13 == 0) {
            return "Argb8888";
        }
        if (i13 == 1) {
            return "Alpha8";
        }
        if (i13 == 2) {
            return "Rgb565";
        }
        if (i13 == 3) {
            return "F16";
        }
        return i13 == 4 ? "Gpu" : "Unknown";
    }
}
