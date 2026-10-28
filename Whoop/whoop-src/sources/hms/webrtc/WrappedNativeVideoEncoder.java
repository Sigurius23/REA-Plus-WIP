package hms.webrtc;

/* JADX INFO: loaded from: classes11.dex */
public abstract class WrappedNativeVideoEncoder implements VideoEncoder {
    @Override // hms.webrtc.VideoEncoder
    public abstract long createNativeVideoEncoder();

    @Override // hms.webrtc.VideoEncoder
    public final VideoCodecStatus encode(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // hms.webrtc.VideoEncoder
    public final String getImplementationName() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // hms.webrtc.VideoEncoder
    public final VideoEncoder.ScalingSettings getScalingSettings() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // hms.webrtc.VideoEncoder
    public final VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // hms.webrtc.VideoEncoder
    public abstract boolean isHardwareEncoder();

    @Override // hms.webrtc.VideoEncoder
    public final VideoCodecStatus release() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // hms.webrtc.VideoEncoder
    public final VideoCodecStatus setRateAllocation(VideoEncoder.BitrateAllocation bitrateAllocation, int i13) {
        throw new UnsupportedOperationException("Not implemented.");
    }
}
