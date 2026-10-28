package hms.webrtc;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class SoftwareVideoDecoderFactory implements VideoDecoderFactory {
    private static final String TAG = "SoftwareVideoDecoderFactory";
    private final long nativeFactory = nativeCreateFactory();

    private static native long nativeCreateDecoder(long j7, VideoCodecInfo videoCodecInfo);

    private static native long nativeCreateFactory();

    private static native List<VideoCodecInfo> nativeGetSupportedCodecs(long j7);

    @Override // hms.webrtc.VideoDecoderFactory
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        final long jNativeCreateDecoder = nativeCreateDecoder(this.nativeFactory, videoCodecInfo);
        if (jNativeCreateDecoder != 0) {
            return new WrappedNativeVideoDecoder() { // from class: hms.webrtc.SoftwareVideoDecoderFactory.1
                @Override // hms.webrtc.WrappedNativeVideoDecoder, hms.webrtc.VideoDecoder
                public long createNativeVideoDecoder() {
                    return jNativeCreateDecoder;
                }
            };
        }
        Logging.m49574w(TAG, "Trying to create decoder for unsupported format. " + videoCodecInfo);
        return null;
    }

    @Override // hms.webrtc.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        return (VideoCodecInfo[]) nativeGetSupportedCodecs(this.nativeFactory).toArray(new VideoCodecInfo[0]);
    }
}
