package org.webrtc;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultBlacklistedVideoDecoderFactory implements VideoDecoderFactory {
    private static final String TAG = "DefaultBlacklistedVideoDecoderFactory";
    private static final java.util.function.Predicate<VideoDecoder> defaultBlacklistedPredicate = new java.util.function.Predicate<VideoDecoder>() { // from class: org.webrtc.DefaultBlacklistedVideoDecoderFactory.1
        @Override // java.util.function.Predicate
        public boolean test(VideoDecoder videoDecoder) {
            return DefaultBlacklistedVideoDecoderFactory.isExynosVP9(videoDecoder);
        }
    };
    private final VideoDecoderFactory hardwareVideoDecoderFactory;
    private final java.util.function.Predicate<VideoDecoder> isHardwareDecoderBlacklisted;
    private final VideoDecoderFactory platformSoftwareVideoDecoderFactory;
    private final VideoDecoderFactory softwareVideoDecoderFactory;

    public DefaultBlacklistedVideoDecoderFactory(EglBase.Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isExynosVP9(VideoDecoder videoDecoder) {
        if (videoDecoder == null) {
            return false;
        }
        String lowerCase = videoDecoder.getImplementationName().toLowerCase();
        return lowerCase.contains("exynos") && lowerCase.contains("vp9");
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        VideoDecoder videoDecoderCreateDecoder = this.softwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        VideoDecoder videoDecoderCreateDecoder2 = this.hardwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        if (videoDecoderCreateDecoder == null) {
            videoDecoderCreateDecoder = this.platformSoftwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        }
        if (!this.isHardwareDecoderBlacklisted.test(videoDecoderCreateDecoder2)) {
            if (videoDecoderCreateDecoder2 == null || videoDecoderCreateDecoder == null) {
                return videoDecoderCreateDecoder2 != null ? videoDecoderCreateDecoder2 : videoDecoderCreateDecoder;
            }
            return new VideoDecoderFallback(videoDecoderCreateDecoder, videoDecoderCreateDecoder2);
        }
        Logging.m85621d(TAG, "Hardware decoder is blacklisted: " + videoDecoderCreateDecoder2.getImplementationName());
        return videoDecoderCreateDecoder;
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(Arrays.asList(this.softwareVideoDecoderFactory.getSupportedCodecs()));
        hashSet.addAll(Arrays.asList(this.hardwareVideoDecoderFactory.getSupportedCodecs()));
        hashSet.addAll(Arrays.asList(this.platformSoftwareVideoDecoderFactory.getSupportedCodecs()));
        return (VideoCodecInfo[]) hashSet.toArray(new VideoCodecInfo[0]);
    }

    public DefaultBlacklistedVideoDecoderFactory(EglBase.Context context, java.util.function.Predicate<VideoDecoder> predicate) {
        this.hardwareVideoDecoderFactory = new HardwareVideoDecoderFactory(context);
        this.softwareVideoDecoderFactory = new SoftwareVideoDecoderFactory();
        this.platformSoftwareVideoDecoderFactory = new PlatformSoftwareVideoDecoderFactory(context);
        this.isHardwareDecoderBlacklisted = predicate == null ? defaultBlacklistedPredicate : predicate.or(defaultBlacklistedPredicate);
    }
}
