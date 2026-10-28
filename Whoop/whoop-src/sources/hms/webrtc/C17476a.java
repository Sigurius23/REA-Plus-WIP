package hms.webrtc;

/* JADX INFO: renamed from: hms.webrtc.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C17476a implements VideoSink {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67572w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f67573x;

    public /* synthetic */ C17476a(Object obj, int i13) {
        this.f67572w = i13;
        this.f67573x = obj;
    }

    @Override // hms.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        switch (this.f67572w) {
            case 0:
                ((Camera1Session) this.f67573x).lambda$listenForTextureFrames$0(videoFrame);
                break;
            case 1:
                ((Camera2Session.CaptureSessionCallback) this.f67573x).lambda$onConfigured$0(videoFrame);
                break;
            default:
                ((VideoSource) this.f67573x).lambda$setVideoProcessor$1(videoFrame);
                break;
        }
    }
}
