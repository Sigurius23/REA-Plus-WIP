package live.hms.video.sdk;

import c93.InterfaceC4339a;

/* JADX INFO: renamed from: live.hms.video.sdk.f */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C24265f implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95256w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ SDKDelegate f95257x;

    public /* synthetic */ C24265f(SDKDelegate sDKDelegate, int i13) {
        this.f95256w = i13;
        this.f95257x = sDKDelegate;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f95256w) {
            case 0:
                return SDKDelegate.C242342.AnonymousClass1.invokeSuspend$lambda$3$lambda$1(this.f95257x);
            case 1:
                return SDKDelegate.muteOnPhoneCalManager_delegate$lambda$18(this.f95257x);
            case 2:
                return SDKDelegate.ncStatusChecker$lambda$1(this.f95257x);
            case 3:
                return SDKDelegate.ncStatusChecker$lambda$2(this.f95257x);
            case 4:
                return SDKDelegate.performanceMeasurement_delegate$lambda$4(this.f95257x);
            case 5:
                return SDKDelegate.audioHandler_delegate$lambda$7(this.f95257x);
            case 6:
                return SDKDelegate.hmsAudioManager_delegate$lambda$10(this.f95257x);
            case 7:
                return SDKDelegate.createHmsInteractivityCenterIfNeeded$lambda$65(this.f95257x);
            case 8:
                return SDKDelegate.permissionsHandler_delegate$lambda$0(this.f95257x);
            case 9:
                return Boolean.valueOf(SDKDelegate.onPolicyChangeManager$lambda$12(this.f95257x));
            case 10:
                return SDKDelegate.hmsWhiteBoardManager_delegate$lambda$13(this.f95257x);
            case 11:
                return Boolean.valueOf(SDKDelegate.networkObserverUseCase$lambda$15(this.f95257x));
            default:
                return Boolean.valueOf(SDKDelegate.rtcStatsObserverUseCase$lambda$16(this.f95257x));
        }
    }
}
