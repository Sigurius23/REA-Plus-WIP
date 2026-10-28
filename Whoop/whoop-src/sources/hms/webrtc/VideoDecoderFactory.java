package hms.webrtc;

/* JADX INFO: loaded from: classes11.dex */
public interface VideoDecoderFactory {
    @CalledByNative
    VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo);

    @CalledByNative
    default VideoCodecInfo[] getSupportedCodecs() {
        return new VideoCodecInfo[0];
    }
}
