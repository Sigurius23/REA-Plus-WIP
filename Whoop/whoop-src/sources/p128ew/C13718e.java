package p128ew;

/* JADX INFO: renamed from: ew.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C13718e {

    /* JADX INFO: renamed from: a */
    public final C13714a f48695a;

    public C13718e(C13714a c13714a) {
        this.f48695a = c13714a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13718e) && this.f48695a.equals(((C13718e) obj).f48695a);
    }

    public final int hashCode() {
        return this.f48695a.hashCode();
    }

    public final String toString() {
        return "Part(body=" + this.f48695a + ")";
    }
}
