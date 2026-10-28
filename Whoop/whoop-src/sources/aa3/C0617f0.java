package aa3;

/* JADX INFO: renamed from: aa3.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0617f0 extends AbstractC0614e0 {

    /* JADX INFO: renamed from: a */
    public final long f2178a;

    public C0617f0(long j7) {
        this.f2178a = j7;
    }

    @Override // aa3.AbstractC0614e0
    /* JADX INFO: renamed from: a */
    public final Object mo1614a() {
        return Long.valueOf(this.f2178a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0617f0) && this.f2178a == ((C0617f0) obj).f2178a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2178a);
    }
}
