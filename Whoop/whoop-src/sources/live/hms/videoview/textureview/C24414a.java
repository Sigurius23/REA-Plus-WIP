package live.hms.videoview.textureview;

import c93.InterfaceC4339a;

/* JADX INFO: renamed from: live.hms.videoview.textureview.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C24414a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95280w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ HMSTextureRenderer f95281x;

    public /* synthetic */ C24414a(HMSTextureRenderer hMSTextureRenderer, int i13) {
        this.f95280w = i13;
        this.f95281x = hMSTextureRenderer;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f95280w) {
            case 0:
                return HMSTextureRenderer.videoTrackManager_delegate$lambda$4(this.f95281x);
            case 1:
                return HMSTextureRenderer.videoTrackManager_delegate$lambda$4$lambda$0(this.f95281x);
            case 2:
                return HMSTextureRenderer.videoTrackManager_delegate$lambda$4$lambda$2(this.f95281x);
            default:
                return HMSTextureRenderer.videoTrackManager_delegate$lambda$4$lambda$3(this.f95281x);
        }
    }
}
