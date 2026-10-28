package p672z6;

/* JADX INFO: renamed from: z6.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C40120c {

    /* JADX INFO: renamed from: a */
    public final int f173167a;

    /* JADX INFO: renamed from: a */
    public static String m128661a(int i13) {
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
            return "Start";
        }
        return i13 == 5 ? "End" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C40120c) {
            return this.f173167a == ((C40120c) obj).f173167a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f173167a);
    }

    public final String toString() {
        return m128661a(this.f173167a);
    }
}
