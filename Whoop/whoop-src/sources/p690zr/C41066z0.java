package p690zr;

/* JADX INFO: renamed from: zr.z0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C41066z0 extends AbstractC41032j0 {

    /* JADX INFO: renamed from: E */
    public final transient C41006a1 f177079E;

    /* JADX INFO: renamed from: z */
    public final transient C41009b1 f177080z;

    public C41066z0(C41009b1 c41009b1, C41006a1 c41006a1) {
        this.f177080z = c41009b1;
        this.f177079E = c41006a1;
    }

    @Override // p690zr.AbstractC41032j0, p690zr.AbstractC41008b0
    /* JADX INFO: renamed from: a */
    public final AbstractC41023g0 mo133227a() {
        return this.f177079E;
    }

    @Override // p690zr.AbstractC41008b0
    /* JADX INFO: renamed from: c */
    public final int mo133228c(int i13, Object[] objArr) {
        return this.f177079E.mo133228c(i13, objArr);
    }

    @Override // p690zr.AbstractC41008b0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f177080z.get(obj) != null;
    }

    @Override // p690zr.AbstractC41008b0
    /* JADX INFO: renamed from: g */
    public final boolean mo133226g() {
        return true;
    }

    @Override // p690zr.AbstractC41032j0
    /* JADX INFO: renamed from: o */
    public final AbstractC41036k1 iterator() {
        return this.f177079E.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f177080z.f176961F;
    }
}
