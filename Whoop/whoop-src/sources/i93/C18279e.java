package i93;

/* JADX INFO: renamed from: i93.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C18279e implements InterfaceC18280f {

    /* JADX INFO: renamed from: w */
    public final float f71131w;

    /* JADX INFO: renamed from: x */
    public final float f71132x;

    public C18279e(float f13, float f14) {
        this.f71131w = f13;
        this.f71132x = f14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i93.InterfaceC18280f
    /* JADX INFO: renamed from: a */
    public final boolean mo52653a(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i93.InterfaceC18280f
    /* JADX INFO: renamed from: c */
    public final boolean mo52654c(Comparable comparable) {
        float fFloatValue = ((Number) comparable).floatValue();
        return fFloatValue >= this.f71131w && fFloatValue <= this.f71132x;
    }

    @Override // i93.InterfaceC18281g
    /* JADX INFO: renamed from: d */
    public final Comparable mo52651d() {
        return Float.valueOf(this.f71132x);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18279e)) {
            return false;
        }
        float f13 = this.f71131w;
        float f14 = this.f71132x;
        if (f13 > f14) {
            C18279e c18279e = (C18279e) obj;
            if (c18279e.f71131w > c18279e.f71132x) {
                return true;
            }
        }
        C18279e c18279e2 = (C18279e) obj;
        return f13 == c18279e2.f71131w && f14 == c18279e2.f71132x;
    }

    @Override // i93.InterfaceC18281g
    public final Comparable getStart() {
        return Float.valueOf(this.f71131w);
    }

    public final int hashCode() {
        float f13 = this.f71131w;
        float f14 = this.f71132x;
        if (f13 > f14) {
            return -1;
        }
        return Float.hashCode(f14) + (Float.hashCode(f13) * 31);
    }

    @Override // i93.InterfaceC18281g
    public final boolean isEmpty() {
        return this.f71131w > this.f71132x;
    }

    public final String toString() {
        return this.f71131w + ".." + this.f71132x;
    }
}
