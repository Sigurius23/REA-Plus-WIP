package m83;

/* JADX INFO: renamed from: m83.k0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C25255k0 extends AbstractC25236b {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C25257l0 f99130E;

    /* JADX INFO: renamed from: y */
    public int f99131y;

    /* JADX INFO: renamed from: z */
    public int f99132z;

    public C25255k0(C25257l0 c25257l0) {
        this.f99130E = c25257l0;
        this.f99131y = c25257l0.f99138z;
        this.f99132z = c25257l0.f99137y;
    }

    @Override // m83.AbstractC25236b
    /* JADX INFO: renamed from: a */
    public final void mo73981a() {
        int i13 = this.f99131y;
        if (i13 == 0) {
            this.f99114w = 2;
            return;
        }
        C25257l0 c25257l0 = this.f99130E;
        Object[] objArr = c25257l0.f99135w;
        int i14 = this.f99132z;
        this.f99115x = objArr[i14];
        this.f99114w = 1;
        this.f99132z = (i14 + 1) % c25257l0.f99136x;
        this.f99131y = i13 - 1;
    }
}
