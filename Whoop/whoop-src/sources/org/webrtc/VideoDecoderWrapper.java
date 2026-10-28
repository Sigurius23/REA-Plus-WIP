package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
class VideoDecoderWrapper {
    @CalledByNative
    public static VideoDecoder.Callback createDecoderCallback(long j7) {
        return new C28300w(j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnDecodedFrame(long j7, VideoFrame videoFrame, Integer num, Integer num2);
}
