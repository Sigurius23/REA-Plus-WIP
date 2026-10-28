package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1624s0 implements InterfaceC1633v0 {

    /* JADX INFO: renamed from: w */
    public final AbstractC1615p0 f6305w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC1633v0 f6306x;

    /* JADX INFO: renamed from: y */
    public int f6307y = -1;

    public C1624s0(AbstractC1615p0 abstractC1615p0, InterfaceC1633v0 interfaceC1633v0) {
        this.f6305w = abstractC1615p0;
        this.f6306x = interfaceC1633v0;
    }

    @Override // androidx.lifecycle.InterfaceC1633v0
    public final void onChanged(Object obj) {
        int i13 = this.f6307y;
        AbstractC1615p0 abstractC1615p0 = this.f6305w;
        if (i13 != abstractC1615p0.getVersion()) {
            this.f6307y = abstractC1615p0.getVersion();
            this.f6306x.onChanged(obj);
        }
    }
}
