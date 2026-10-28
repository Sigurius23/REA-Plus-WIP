package fr;

/* JADX INFO: renamed from: fr.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C14710u extends AbstractC14694e {

    /* JADX INFO: renamed from: h */
    public int f54394h;

    /* JADX INFO: renamed from: i */
    public int f54395i;

    /* JADX INFO: renamed from: j */
    public boolean f54396j;

    /* JADX INFO: renamed from: k */
    public int f54397k;

    @Override // fr.AbstractC14694e
    /* JADX INFO: renamed from: a */
    public final void mo42130a() {
        super.mo42130a();
        if (this.f54397k < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.f54394h == 0) {
            if (this.f54313b > 0 && this.f54318g == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.f54314c.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}
