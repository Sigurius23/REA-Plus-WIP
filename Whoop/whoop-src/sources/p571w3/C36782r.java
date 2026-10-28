package p571w3;

/* JADX INFO: renamed from: w3.r */
/* JADX INFO: loaded from: classes.dex */
public final class C36782r {

    /* JADX INFO: renamed from: a */
    public final int f157363a;

    public final boolean equals(Object obj) {
        if (obj instanceof C36782r) {
            return this.f157363a == ((C36782r) obj).f157363a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f157363a);
    }

    public final String toString() {
        int i13 = this.f157363a;
        if (i13 == 1) {
            return "Linearity.Linear";
        }
        if (i13 == 2) {
            return "Linearity.FontHinting";
        }
        return i13 == 3 ? "Linearity.None" : "Invalid";
    }
}
