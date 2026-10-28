package hms.webrtc;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public class SimulcastVideoEncoderFactory implements VideoEncoderFactory {
    VideoEncoderFactory fallback;
    VideoEncoderFactory primary;

    public SimulcastVideoEncoderFactory(VideoEncoderFactory videoEncoderFactory, VideoEncoderFactory videoEncoderFactory2) {
        this.primary = videoEncoderFactory;
        this.fallback = videoEncoderFactory2;
    }

    @Override // hms.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        return new SimulcastVideoEncoder(this.primary, this.fallback, videoCodecInfo);
    }

    @Override // hms.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(this.primary.getSupportedCodecs()));
        VideoEncoderFactory videoEncoderFactory = this.fallback;
        if (videoEncoderFactory != null) {
            arrayList.addAll(Arrays.asList(videoEncoderFactory.getSupportedCodecs()));
        }
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
    }
}
