package v30;

/* JADX INFO: renamed from: v30.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C35600i implements InterfaceC35601j {

    /* JADX INFO: renamed from: a */
    public final Exception f151373a;

    public C35600i(Exception exc) {
        this.f151373a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35600i) && this.f151373a.equals(((C35600i) obj).f151373a);
    }

    public final int hashCode() {
        return this.f151373a.hashCode();
    }

    public final String toString() {
        return "Failed(error=" + this.f151373a + ")";
    }
}
