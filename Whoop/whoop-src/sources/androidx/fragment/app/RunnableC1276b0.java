package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1276b0 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f5543w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f5544x;

    public /* synthetic */ RunnableC1276b0(Object obj, int i13) {
        this.f5543w = i13;
        this.f5544x = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5543w) {
            case 0:
                ((AbstractComponentCallbacksC1320m0) this.f5544x).startPostponedEnterTransition();
                break;
            default:
                ((AbstractC1329o1) this.f5544x).m4195z(true);
                break;
        }
    }
}
