package u10;

/* JADX INFO: renamed from: u10.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C34425m extends AbstractC34422j {

    /* JADX INFO: renamed from: b */
    public final C34427o f144663b;

    public C34425m(C34427o c34427o) {
        this.f144663b = c34427o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C34425m) && this.f144663b.equals(((C34425m) obj).f144663b);
    }

    public final int hashCode() {
        return this.f144663b.hashCode();
    }

    public final String toString() {
        return "GoToScreen(screen=" + this.f144663b + ")";
    }
}
