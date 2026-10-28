package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.g2 */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC1587g2 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f6235w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC1638x f6236x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C1595i2 f6237y;

    public /* synthetic */ RunnableC1587g2(AbstractC1638x abstractC1638x, C1595i2 c1595i2, int i13) {
        this.f6235w = i13;
        this.f6236x = abstractC1638x;
        this.f6237y = c1595i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6235w) {
            case 0:
                this.f6236x.mo4986a(this.f6237y);
                break;
            default:
                this.f6236x.mo4988d(this.f6237y);
                break;
        }
    }
}
