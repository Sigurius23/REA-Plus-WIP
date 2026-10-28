package androidx.viewpager2.adapter;

/* JADX INFO: renamed from: androidx.viewpager2.adapter.b */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC1854b implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ AbstractC1861i f7297w;

    public RunnableC1854b(AbstractC1861i abstractC1861i) {
        this.f7297w = abstractC1861i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC1861i abstractC1861i = this.f7297w;
        abstractC1861i.mIsInGracePeriod = false;
        abstractC1861i.gcFragments();
    }
}
