package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.t */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC1346t implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f5800w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f5801x;

    public /* synthetic */ RunnableC1346t(Object obj, int i13) {
        this.f5800w = i13;
        this.f5801x = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5800w) {
            case 0:
                DialogInterfaceOnCancelListenerC1361y dialogInterfaceOnCancelListenerC1361y = (DialogInterfaceOnCancelListenerC1361y) this.f5801x;
                dialogInterfaceOnCancelListenerC1361y.mOnDismissListener.onDismiss(dialogInterfaceOnCancelListenerC1361y.mDialog);
                break;
            case 1:
                ((AbstractComponentCallbacksC1320m0) this.f5801x).callStartTransitionListener(false);
                break;
            default:
                C1343s c1343s = (C1343s) this.f5801x;
                if (!c1343s.f5791b.isEmpty()) {
                    c1343s.m4219e();
                }
                break;
        }
    }
}
