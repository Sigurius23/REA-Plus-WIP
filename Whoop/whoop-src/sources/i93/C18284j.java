package i93;

/* JADX INFO: renamed from: i93.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C18284j extends C18282h implements InterfaceC18281g {

    /* JADX INFO: renamed from: z */
    public static final C18284j f71140z = new C18284j(1, 0, 1);

    @Override // i93.InterfaceC18281g
    /* JADX INFO: renamed from: d */
    public final Comparable mo52651d() {
        return Integer.valueOf(this.f71134x);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m52655e(int i13) {
        return this.f71133w <= i13 && i13 <= this.f71134x;
    }

    @Override // i93.C18282h
    public final boolean equals(Object obj) {
        if (!(obj instanceof C18284j)) {
            return false;
        }
        if (isEmpty() && ((C18284j) obj).isEmpty()) {
            return true;
        }
        C18284j c18284j = (C18284j) obj;
        return this.f71133w == c18284j.f71133w && this.f71134x == c18284j.f71134x;
    }

    @Override // i93.InterfaceC18281g
    public final Comparable getStart() {
        return Integer.valueOf(this.f71133w);
    }

    @Override // i93.C18282h
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f71133w * 31) + this.f71134x;
    }

    @Override // i93.C18282h, i93.InterfaceC18281g
    public final boolean isEmpty() {
        return this.f71133w > this.f71134x;
    }

    @Override // i93.C18282h
    public final String toString() {
        return this.f71133w + ".." + this.f71134x;
    }
}
