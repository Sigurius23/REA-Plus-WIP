package live.hms.videoview;

import c93.InterfaceC4339a;

/* JADX INFO: renamed from: live.hms.videoview.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C24412a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95275w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ HMSVideoView f95276x;

    public /* synthetic */ C24412a(HMSVideoView hMSVideoView, int i13) {
        this.f95275w = i13;
        this.f95276x = hMSVideoView;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f95275w) {
            case 0:
                return HMSVideoView.videoTrackManager_delegate$lambda$4(this.f95276x);
            case 1:
                return HMSVideoView.zoomPanManager_delegate$lambda$5(this.f95276x);
            case 2:
                return HMSVideoView.videoTrackManager_delegate$lambda$4$lambda$0(this.f95276x);
            case 3:
                return HMSVideoView.videoTrackManager_delegate$lambda$4$lambda$2(this.f95276x);
            default:
                return HMSVideoView.videoTrackManager_delegate$lambda$4$lambda$3(this.f95276x);
        }
    }
}
