package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1603l0 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ AbstractC1615p0 f6273w;

    public RunnableC1603l0(AbstractC1615p0 abstractC1615p0) {
        this.f6273w = abstractC1615p0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.f6273w.mDataLock) {
            obj = this.f6273w.mPendingData;
            this.f6273w.mPendingData = AbstractC1615p0.NOT_SET;
        }
        this.f6273w.setValue(obj);
    }
}
