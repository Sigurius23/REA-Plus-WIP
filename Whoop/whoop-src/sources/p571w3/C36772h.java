package p571w3;

/* JADX INFO: renamed from: w3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C36772h {

    /* JADX INFO: renamed from: a */
    public final int f157343a;

    public final boolean equals(Object obj) {
        if (obj instanceof C36772h) {
            return this.f157343a == ((C36772h) obj).f157343a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f157343a);
    }

    public final String toString() {
        int i13 = this.f157343a;
        if (i13 == 1) {
            return "LineHeightStyle.Trim.FirstLineTop";
        }
        if (i13 == 16) {
            return "LineHeightStyle.Trim.LastLineBottom";
        }
        if (i13 == 17) {
            return "LineHeightStyle.Trim.Both";
        }
        return i13 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
