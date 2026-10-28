package hms.webrtc;

import android.media.MediaCodecInfo;

/* JADX INFO: loaded from: classes11.dex */
public class PlatformSoftwareVideoDecoderFactory extends MediaCodecVideoDecoderFactory {
    private static final Predicate<MediaCodecInfo> defaultAllowedPredicate = new Predicate<MediaCodecInfo>() { // from class: hms.webrtc.PlatformSoftwareVideoDecoderFactory.1
        @Override // hms.webrtc.Predicate
        public boolean test(MediaCodecInfo mediaCodecInfo) {
            return MediaCodecUtils.isSoftwareOnly(mediaCodecInfo);
        }
    };

    public PlatformSoftwareVideoDecoderFactory(EglBase.Context context) {
        super(context, defaultAllowedPredicate);
    }

    @Override // hms.webrtc.MediaCodecVideoDecoderFactory, hms.webrtc.VideoDecoderFactory
    public /* bridge */ /* synthetic */ VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return super.createDecoder(videoCodecInfo);
    }

    @Override // hms.webrtc.MediaCodecVideoDecoderFactory, hms.webrtc.VideoDecoderFactory
    public /* bridge */ /* synthetic */ VideoCodecInfo[] getSupportedCodecs() {
        return super.getSupportedCodecs();
    }
}
