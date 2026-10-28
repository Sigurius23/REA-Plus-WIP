package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.z */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1364z implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ AbstractComponentCallbacksC1320m0 f5848w;

    public /* synthetic */ RunnableC1364z(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        this.f5848w = abstractComponentCallbacksC1320m0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5848w;
        C1318l2 c1318l2 = abstractComponentCallbacksC1320m0.mViewLifecycleOwner;
        c1318l2.f5670F.m88295a(abstractComponentCallbacksC1320m0.mSavedViewRegistryState);
        abstractComponentCallbacksC1320m0.mSavedViewRegistryState = null;
    }
}
