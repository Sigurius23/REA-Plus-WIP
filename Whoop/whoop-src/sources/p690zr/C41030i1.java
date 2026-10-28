package p690zr;

/* JADX INFO: renamed from: zr.i1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C41030i1 extends AbstractC41032j0 {

    /* JADX INFO: renamed from: z */
    public final transient Object f177004z;

    public C41030i1(Object obj) {
        obj.getClass();
        this.f177004z = obj;
    }

    @Override // p690zr.AbstractC41032j0, p690zr.AbstractC41008b0
    /* JADX INFO: renamed from: a */
    public final AbstractC41023g0 mo133227a() {
        return AbstractC41023g0.m133256r(this.f177004z);
    }

    @Override // p690zr.AbstractC41008b0
    /* JADX INFO: renamed from: c */
    public final int mo133228c(int i13, Object[] objArr) {
        objArr[i13] = this.f177004z;
        return i13 + 1;
    }

    @Override // p690zr.AbstractC41008b0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f177004z.equals(obj);
    }

    @Override // p690zr.AbstractC41008b0
    /* JADX INFO: renamed from: g */
    public final boolean mo133226g() {
        return false;
    }

    @Override // p690zr.AbstractC41032j0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f177004z.hashCode();
    }

    @Override // p690zr.AbstractC41032j0
    /* JADX INFO: renamed from: o */
    public final AbstractC41036k1 iterator() {
        return new C41040m0(this.f177004z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f177004z.toString() + ']';
    }
}
