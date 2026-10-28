package com.mapbox.maps;

import hms.webrtc.SurfaceTextureHelper;
import hms.webrtc.SurfaceViewRenderer;
import live.hms.video.services.ScreenCapturerAndroidCustom;
import live.hms.videoview.common.VideoTrackManager;

/* JADX INFO: renamed from: com.mapbox.maps.c */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC5502c implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f22028w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f22029x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f22030y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f22031z;

    public /* synthetic */ RunnableC5502c(Object obj, int i13, int i14, int i15) {
        this.f22028w = i15;
        this.f22031z = obj;
        this.f22029x = i13;
        this.f22030y = i14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22028w) {
            case 0:
                MapController.onSizeChanged$lambda$9((MapController) this.f22031z, this.f22029x, this.f22030y);
                break;
            case 1:
                ((SurfaceTextureHelper) this.f22031z).lambda$setTextureSize$2(this.f22029x, this.f22030y);
                break;
            case 2:
                ((SurfaceViewRenderer) this.f22031z).lambda$onFrameResolutionChanged$0(this.f22029x, this.f22030y);
                break;
            case 3:
                VideoTrackManager.onFrameResolutionChanged$lambda$4((VideoTrackManager) this.f22031z, this.f22029x, this.f22030y);
                break;
            case 4:
                ((ScreenCapturerAndroidCustom) this.f22031z).lambda$changeCaptureFormat$0(this.f22029x, this.f22030y);
                break;
            case 5:
                ((org.webrtc.SurfaceTextureHelper) this.f22031z).lambda$setTextureSize$2(this.f22029x, this.f22030y);
                break;
            default:
                ((org.webrtc.SurfaceViewRenderer) this.f22031z).lambda$onFrameResolutionChanged$0(this.f22029x, this.f22030y);
                break;
        }
    }
}
