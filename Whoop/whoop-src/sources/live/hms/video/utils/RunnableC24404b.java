package live.hms.video.utils;

import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: live.hms.video.utils.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC24404b implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95269w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f95270x;

    public /* synthetic */ RunnableC24404b(Function1 function1, int i13) {
        this.f95269w = i13;
        this.f95270x = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f95269w) {
            case 0:
                HMSCoroutineScope.schedule$lambda$2(this.f95270x);
                break;
            default:
                HMSCoroutineScope.scheduleWithFixedDelay$lambda$1(this.f95270x);
                break;
        }
    }
}
