package p097ds;

/* JADX INFO: renamed from: ds.e */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC12302e implements Runnable {

    /* JADX INFO: renamed from: w */
    public final RunnableC12312o f41220w;

    /* JADX INFO: renamed from: x */
    public final InterfaceFutureC12319v f41221x;

    public RunnableC12302e(RunnableC12312o runnableC12312o, C12320w c12320w) {
        this.f41220w = runnableC12312o;
        this.f41221x = c12320w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f41220w.f41235w != this) {
            return;
        }
        if (AbstractC12311n.f41232F.mo9534k(this.f41220w, this, AbstractC12311n.m34242h(this.f41221x))) {
            AbstractC12311n.m34239e(this.f41220w, false);
        }
    }
}
