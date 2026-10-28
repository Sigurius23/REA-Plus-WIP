package org.webrtc;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SoftwareVideoEncoderFactory implements VideoEncoderFactory {
    private static final String TAG = "SoftwareVideoEncoderFactory";
    private final long nativeFactory = nativeCreateFactory();

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeCreate(long j7, long j13, VideoCodecInfo videoCodecInfo);

    private static native long nativeCreateFactory();

    private static native List<VideoCodecInfo> nativeGetSupportedCodecs(long j7);

    private static native boolean nativeIsSupported(long j7, VideoCodecInfo videoCodecInfo);

    @Override // org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(final VideoCodecInfo videoCodecInfo) {
        if (nativeIsSupported(this.nativeFactory, videoCodecInfo)) {
            return new WrappedNativeVideoEncoder(this) { // from class: org.webrtc.SoftwareVideoEncoderFactory.1
                final /* synthetic */ SoftwareVideoEncoderFactory this$0;

                {
                    this.this$0 = this;
                }

                @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
                public long createNative(long j7) {
                    return SoftwareVideoEncoderFactory.nativeCreate(this.this$0.nativeFactory, j7, videoCodecInfo);
                }

                @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
                public boolean isHardwareEncoder() {
                    return false;
                }
            };
        }
        Logging.m85625w(TAG, "Trying to create encoder for unsupported format. ".concat(String.valueOf(videoCodecInfo)));
        return null;
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        return (VideoCodecInfo[]) nativeGetSupportedCodecs(this.nativeFactory).toArray(new VideoCodecInfo[0]);
    }
}
