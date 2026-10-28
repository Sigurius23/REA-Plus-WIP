package com.mapbox.common;

/* JADX INFO: renamed from: com.mapbox.common.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC5410a implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f21897w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f21898x;

    public /* synthetic */ RunnableC5410a(Object obj, int i13) {
        this.f21897w = i13;
        this.f21898x = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f21897w) {
            case 0:
                ((ConnectionChangeCallback) this.f21898x).lambda$notifyReachability$0();
                break;
            default:
                RunloopErrorHandler.postErrorToMainLooper$lambda$0((Throwable) this.f21898x);
                break;
        }
    }
}
