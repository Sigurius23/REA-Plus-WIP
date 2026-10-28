package hms.webrtc;

/* JADX INFO: renamed from: hms.webrtc.p */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C17492p implements VideoDecoder.Callback, VideoEncoder.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f67608a;

    public /* synthetic */ C17492p(long j7) {
        this.f67608a = j7;
    }

    @Override // hms.webrtc.VideoDecoder.Callback
    public void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2) {
        VideoDecoderWrapper.nativeOnDecodedFrame(this.f67608a, videoFrame, num, num2);
    }

    @Override // hms.webrtc.VideoEncoder.Callback
    public void onEncodedFrame(EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
        VideoEncoderWrapper.nativeOnEncodedFrame(this.f67608a, encodedImage);
    }
}
