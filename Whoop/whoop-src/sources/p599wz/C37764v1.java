package p599wz;

/* JADX INFO: renamed from: wz.v1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37764v1 implements InterfaceC37767w1 {

    /* JADX INFO: renamed from: a */
    public final Exception f161746a;

    public C37764v1(Exception exc) {
        this.f161746a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37764v1) && this.f161746a.equals(((C37764v1) obj).f161746a);
    }

    public final int hashCode() {
        return this.f161746a.hashCode();
    }

    public final String toString() {
        return "Failure(error=" + this.f161746a + ")";
    }
}
