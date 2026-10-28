package af3;

/* JADX INFO: renamed from: af3.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0822a extends AbstractC0844t {
    @Override // af3.AbstractC0844t
    /* JADX INFO: renamed from: d */
    public final AbstractC0844t mo2027d() {
        return (AbstractC0822a) this.f3038a;
    }

    @Override // af3.AbstractC0844t
    /* JADX INFO: renamed from: g */
    public final void mo2028g(AbstractC0844t abstractC0844t) {
        if (!(abstractC0844t instanceof AbstractC0822a)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        this.f3038a = abstractC0844t;
    }
}
