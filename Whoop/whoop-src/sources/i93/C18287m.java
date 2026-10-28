package i93;

/* JADX INFO: renamed from: i93.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C18287m extends C18285k implements InterfaceC18281g {

    /* JADX INFO: renamed from: z */
    public static final C18287m f71148z = new C18287m(1, 0);

    public C18287m(long j7, long j13) {
        super(j7, j13, 1L);
    }

    @Override // i93.InterfaceC18281g
    /* JADX INFO: renamed from: d */
    public final Comparable mo52651d() {
        return Long.valueOf(this.f71142x);
    }

    @Override // i93.C18285k
    public final boolean equals(Object obj) {
        if (!(obj instanceof C18287m)) {
            return false;
        }
        if (isEmpty() && ((C18287m) obj).isEmpty()) {
            return true;
        }
        C18287m c18287m = (C18287m) obj;
        return this.f71141w == c18287m.f71141w && this.f71142x == c18287m.f71142x;
    }

    @Override // i93.InterfaceC18281g
    public final Comparable getStart() {
        return Long.valueOf(this.f71141w);
    }

    @Override // i93.C18285k
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j7 = this.f71141w;
        long j13 = ((long) 31) * (j7 ^ (j7 >>> 32));
        long j14 = this.f71142x;
        return (int) (j13 + (j14 ^ (j14 >>> 32)));
    }

    @Override // i93.C18285k, i93.InterfaceC18281g
    public final boolean isEmpty() {
        return this.f71141w > this.f71142x;
    }

    @Override // i93.C18285k
    public final String toString() {
        return this.f71141w + ".." + this.f71142x;
    }
}
