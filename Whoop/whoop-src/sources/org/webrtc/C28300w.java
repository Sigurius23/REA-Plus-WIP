package org.webrtc;

/* JADX INFO: renamed from: org.webrtc.w */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C28300w implements VideoDecoder.Callback, VideoEncoder.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f114104a;

    public /* synthetic */ C28300w(long j7) {
        this.f114104a = j7;
    }

    @Override // org.webrtc.VideoDecoder.Callback
    public void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2) {
        VideoDecoderWrapper.nativeOnDecodedFrame(this.f114104a, videoFrame, num, num2);
    }

    @Override // org.webrtc.VideoEncoder.Callback
    public void onEncodedFrame(EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
        VideoEncoderWrapper.nativeOnEncodedFrame(this.f114104a, encodedImage);
    }
}
