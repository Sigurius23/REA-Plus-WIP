package bc3;

/* JADX INFO: renamed from: bc3.w0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3068w0 extends AbstractRunnableC3071x0 {

    /* JADX INFO: renamed from: y */
    public final Runnable f12105y;

    public C3068w0(Runnable runnable, long j7) {
        super(j7);
        this.f12105y = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12105y.run();
    }

    @Override // bc3.AbstractRunnableC3071x0
    public final String toString() {
        return super.toString() + this.f12105y;
    }
}
