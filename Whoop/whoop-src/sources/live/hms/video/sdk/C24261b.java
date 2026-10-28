package live.hms.video.sdk;

import c93.InterfaceC4339a;

/* JADX INFO: renamed from: live.hms.video.sdk.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C24261b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95247w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f95248x;

    public /* synthetic */ C24261b(Object obj, int i13) {
        this.f95247w = i13;
        this.f95248x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f95247w) {
            case 0:
                return RtcStatsObserverUseCase.C241971.AnonymousClass1.emit$lambda$2((RtcStatsObserverUseCase) this.f95248x);
            default:
                return SDKDelegate.C242342.AnonymousClass1.invokeSuspend$lambda$3$lambda$2((InterfaceC4339a) this.f95248x);
        }
    }
}
