package hms.webrtc;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class SoftwareVideoEncoderFactory implements VideoEncoderFactory {
    private static final String TAG = "SoftwareVideoEncoderFactory";
    private final long nativeFactory = nativeCreateFactory();

    private static native long nativeCreateEncoder(long j7, VideoCodecInfo videoCodecInfo);

    private static native long nativeCreateFactory();

    private static native List<VideoCodecInfo> nativeGetSupportedCodecs(long j7);

    @Override // hms.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        final long jNativeCreateEncoder = nativeCreateEncoder(this.nativeFactory, videoCodecInfo);
        if (jNativeCreateEncoder != 0) {
            return new WrappedNativeVideoEncoder() { // from class: hms.webrtc.SoftwareVideoEncoderFactory.1
                @Override // hms.webrtc.WrappedNativeVideoEncoder, hms.webrtc.VideoEncoder
                public long createNativeVideoEncoder() {
                    return jNativeCreateEncoder;
                }

                @Override // hms.webrtc.WrappedNativeVideoEncoder, hms.webrtc.VideoEncoder
                public boolean isHardwareEncoder() {
                    return false;
                }
            };
        }
        Logging.m49574w(TAG, "Trying to create encoder for unsupported format. " + videoCodecInfo);
        return null;
    }

    @Override // hms.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        return (VideoCodecInfo[]) nativeGetSupportedCodecs(this.nativeFactory).toArray(new VideoCodecInfo[0]);
    }
}
