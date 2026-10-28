package live.hms.video.sdk;

import live.hms.video.signal.init.InitConfig;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: live.hms.video.sdk.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C24260a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95245w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f95246x;

    public /* synthetic */ C24260a(Object obj, int i13) {
        this.f95245w = i13;
        this.f95246x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f95245w) {
            case 0:
                return RtcStatsObserverUseCase.C241971.AnonymousClass1.emit$lambda$0((RtcStatsObserverUseCase) this.f95246x, (String) obj);
            case 1:
                return RtcStatsObserverUseCase.C241971.AnonymousClass1.emit$lambda$1((RtcStatsObserverUseCase) this.f95246x, (String) obj);
            default:
                return SDKDelegate.setSdkStoreConfig$lambda$87((SDKStore) this.f95246x, (InitConfig) obj);
        }
    }
}
