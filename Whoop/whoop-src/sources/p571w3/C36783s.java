package p571w3;

/* JADX INFO: renamed from: w3.s */
/* JADX INFO: loaded from: classes.dex */
public final class C36783s {

    /* JADX INFO: renamed from: c */
    public static final C36783s f157364c = new C36783s(2, false);

    /* JADX INFO: renamed from: d */
    public static final C36783s f157365d = new C36783s(1, true);

    /* JADX INFO: renamed from: a */
    public final int f157366a;

    /* JADX INFO: renamed from: b */
    public final boolean f157367b;

    public C36783s(int i13, boolean z4) {
        this.f157366a = i13;
        this.f157367b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36783s)) {
            return false;
        }
        C36783s c36783s = (C36783s) obj;
        return this.f157366a == c36783s.f157366a && this.f157367b == c36783s.f157367b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f157367b) + (Integer.hashCode(this.f157366a) * 31);
    }

    public final String toString() {
        if (equals(f157364c)) {
            return "TextMotion.Static";
        }
        return equals(f157365d) ? "TextMotion.Animated" : "Invalid";
    }
}
