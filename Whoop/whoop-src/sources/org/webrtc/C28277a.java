package org.webrtc;

/* JADX INFO: renamed from: org.webrtc.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C28277a implements VideoSink {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f114050w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f114051x;

    public /* synthetic */ C28277a(Object obj, int i13) {
        this.f114050w = i13;
        this.f114051x = obj;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f114050w) {
            case 0:
                ((Camera1Session) this.f114051x).lambda$listenForTextureFrames$0(videoFrame);
                break;
            case 1:
                ((Camera2Session.CaptureSessionCallback) this.f114051x).lambda$onConfigured$0(videoFrame);
                break;
            default:
                ((VideoSource) this.f114051x).lambda$setVideoProcessor$1(videoFrame);
                break;
        }
    }
}
