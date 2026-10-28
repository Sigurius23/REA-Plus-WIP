package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
class HardwareVideoEncoderWrapperFactory implements VideoEncoderFactory {
    private static final String TAG = "HardwareVideoEncoderWrapperFactory";
    private final HardwareVideoEncoderFactory factory;
    private final int resolutionPixelAlignment;

    public HardwareVideoEncoderWrapperFactory(HardwareVideoEncoderFactory hardwareVideoEncoderFactory, int i13) {
        this.factory = hardwareVideoEncoderFactory;
        this.resolutionPixelAlignment = i13;
        if (i13 == 0) {
            throw new IllegalArgumentException("resolutionPixelAlignment should not be 0");
        }
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        try {
            VideoEncoder videoEncoderCreateEncoder = this.factory.createEncoder(videoCodecInfo);
            if (videoEncoderCreateEncoder == null) {
                return null;
            }
            return new HardwareVideoEncoderWrapper(videoEncoderCreateEncoder, this.resolutionPixelAlignment);
        } catch (Exception e5) {
            Logging.m85623e(TAG, "createEncoder failed", e5);
            return null;
        }
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        return this.factory.getSupportedCodecs();
    }
}
