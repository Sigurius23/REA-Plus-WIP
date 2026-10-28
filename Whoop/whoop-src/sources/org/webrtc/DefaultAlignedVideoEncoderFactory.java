package org.webrtc;

import java.util.Arrays;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultAlignedVideoEncoderFactory implements VideoEncoderFactory {
    private final VideoEncoderFactory hardwareVideoEncoderFactory;
    private final VideoEncoderFactory softwareVideoEncoderFactory;

    public DefaultAlignedVideoEncoderFactory(EglBase.Context context, boolean z4, boolean z13, ResolutionAdjustment resolutionAdjustment) {
        HardwareVideoEncoderFactory hardwareVideoEncoderFactory = new HardwareVideoEncoderFactory(context, z4, z13);
        this.hardwareVideoEncoderFactory = resolutionAdjustment != ResolutionAdjustment.NONE ? new HardwareVideoEncoderWrapperFactory(hardwareVideoEncoderFactory, resolutionAdjustment.getValue()) : hardwareVideoEncoderFactory;
        this.softwareVideoEncoderFactory = new SoftwareVideoEncoderFactory();
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        VideoEncoder videoEncoderCreateEncoder = this.softwareVideoEncoderFactory.createEncoder(videoCodecInfo);
        VideoEncoder videoEncoderCreateEncoder2 = this.hardwareVideoEncoderFactory.createEncoder(videoCodecInfo);
        if (videoEncoderCreateEncoder2 == null || videoEncoderCreateEncoder == null) {
            return videoEncoderCreateEncoder2 != null ? videoEncoderCreateEncoder2 : videoEncoderCreateEncoder;
        }
        return new VideoEncoderFallback(videoEncoderCreateEncoder, videoEncoderCreateEncoder2);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(Arrays.asList(this.softwareVideoEncoderFactory.getSupportedCodecs()));
        linkedHashSet.addAll(Arrays.asList(this.hardwareVideoEncoderFactory.getSupportedCodecs()));
        return (VideoCodecInfo[]) linkedHashSet.toArray(new VideoCodecInfo[0]);
    }
}
