package live.hms.video.sdk;

/* JADX INFO: renamed from: live.hms.video.sdk.c */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC24262c implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95249w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ SDKDelegate f95250x;

    public /* synthetic */ RunnableC24262c(SDKDelegate sDKDelegate, int i13) {
        this.f95249w = i13;
        this.f95250x = sDKDelegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f95249w) {
            case 0:
                SDKDelegate.onPolicyChangeHandled$lambda$23(this.f95250x);
                break;
            case 1:
                SDKDelegate.startAudioManager$lambda$68(this.f95250x);
                break;
            default:
                SDKDelegate.tearDownSDKDelegate$lambda$74(this.f95250x);
                break;
        }
    }
}
