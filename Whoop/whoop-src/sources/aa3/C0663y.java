package aa3;

/* JADX INFO: renamed from: aa3.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C0663y extends AbstractC0614e0 {

    /* JADX INFO: renamed from: a */
    public final char f2297a;

    public C0663y(char c3) {
        this.f2297a = c3;
    }

    @Override // aa3.AbstractC0614e0
    /* JADX INFO: renamed from: a */
    public final Object mo1614a() {
        return Character.valueOf(this.f2297a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0663y) && this.f2297a == ((C0663y) obj).f2297a;
    }

    public final int hashCode() {
        return Character.hashCode(this.f2297a);
    }
}
