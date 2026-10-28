package i93;

/* JADX INFO: renamed from: i93.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C18278d implements InterfaceC18280f {

    /* JADX INFO: renamed from: w */
    public final double f71129w;

    /* JADX INFO: renamed from: x */
    public final double f71130x;

    public C18278d(double d3, double d14) {
        this.f71129w = d3;
        this.f71130x = d14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i93.InterfaceC18280f
    /* JADX INFO: renamed from: a */
    public final boolean mo52653a(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).doubleValue() <= ((Number) comparable2).doubleValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i93.InterfaceC18280f
    /* JADX INFO: renamed from: c */
    public final boolean mo52654c(Comparable comparable) {
        double dDoubleValue = ((Number) comparable).doubleValue();
        return dDoubleValue >= this.f71129w && dDoubleValue <= this.f71130x;
    }

    @Override // i93.InterfaceC18281g
    /* JADX INFO: renamed from: d */
    public final Comparable mo52651d() {
        return Double.valueOf(this.f71130x);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18278d)) {
            return false;
        }
        double d3 = this.f71129w;
        double d14 = this.f71130x;
        if (d3 > d14) {
            C18278d c18278d = (C18278d) obj;
            if (c18278d.f71129w > c18278d.f71130x) {
                return true;
            }
        }
        C18278d c18278d2 = (C18278d) obj;
        return d3 == c18278d2.f71129w && d14 == c18278d2.f71130x;
    }

    @Override // i93.InterfaceC18281g
    public final Comparable getStart() {
        return Double.valueOf(this.f71129w);
    }

    public final int hashCode() {
        double d3 = this.f71129w;
        double d14 = this.f71130x;
        if (d3 > d14) {
            return -1;
        }
        return Double.hashCode(d14) + (Double.hashCode(d3) * 31);
    }

    @Override // i93.InterfaceC18281g
    public final boolean isEmpty() {
        return this.f71129w > this.f71130x;
    }

    public final String toString() {
        return this.f71129w + ".." + this.f71130x;
    }
}
