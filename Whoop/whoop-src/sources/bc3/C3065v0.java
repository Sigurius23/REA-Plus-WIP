package bc3;

/* JADX INFO: renamed from: bc3.v0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3065v0 extends AbstractRunnableC3071x0 {

    /* JADX INFO: renamed from: y */
    public final C3033m f12100y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC3077z0 f12101z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3065v0(AbstractC3077z0 abstractC3077z0, long j7, C3033m c3033m) {
        super(j7);
        this.f12101z = abstractC3077z0;
        this.f12100y = c3033m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12100y.m8758C(this.f12101z);
    }

    @Override // bc3.AbstractRunnableC3071x0
    public final String toString() {
        return super.toString() + this.f12100y;
    }
}
