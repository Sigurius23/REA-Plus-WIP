package aa3;

/* JADX INFO: renamed from: aa3.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C0665z extends AbstractC0614e0 {

    /* JADX INFO: renamed from: a */
    public final double f2306a;

    public C0665z(double d3) {
        this.f2306a = d3;
    }

    @Override // aa3.AbstractC0614e0
    /* JADX INFO: renamed from: a */
    public final Object mo1614a() {
        return Double.valueOf(this.f2306a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0665z) && Double.compare(this.f2306a, ((C0665z) obj).f2306a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f2306a);
    }
}
