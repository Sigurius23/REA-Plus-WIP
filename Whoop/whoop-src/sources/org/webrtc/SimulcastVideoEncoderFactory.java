package org.webrtc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SimulcastVideoEncoderFactory implements VideoEncoderFactory {
    VideoEncoderFactory fallback;
    VideoEncoderFactory primary;

    public SimulcastVideoEncoderFactory(VideoEncoderFactory videoEncoderFactory, VideoEncoderFactory videoEncoderFactory2) {
        this.primary = videoEncoderFactory;
        this.fallback = videoEncoderFactory2;
    }

    public static native VideoCodecInfo nativeAV1Codec();

    public static native List<VideoCodecInfo> nativeVP9Codecs();

    @Override // org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        return new SimulcastVideoEncoder(this.primary, this.fallback, videoCodecInfo);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(this.primary.getSupportedCodecs()));
        VideoEncoderFactory videoEncoderFactory = this.fallback;
        if (videoEncoderFactory != null) {
            arrayList.addAll(Arrays.asList(videoEncoderFactory.getSupportedCodecs()));
        }
        arrayList.addAll(nativeVP9Codecs());
        arrayList.add(nativeAV1Codec());
        Collections.sort(arrayList, new Comparator<VideoCodecInfo>() { // from class: org.webrtc.SimulcastVideoEncoderFactory.1
            @Override // java.util.Comparator
            public int compare(VideoCodecInfo videoCodecInfo, VideoCodecInfo videoCodecInfo2) {
                int iCompareToIgnoreCase = videoCodecInfo.name.compareToIgnoreCase(videoCodecInfo2.name);
                if (iCompareToIgnoreCase != 0) {
                    return iCompareToIgnoreCase;
                }
                List<String> list = videoCodecInfo.scalabilityModes;
                boolean z4 = (list == null || list.isEmpty()) ? false : true;
                List<String> list2 = videoCodecInfo2.scalabilityModes;
                boolean z13 = (list2 == null || list2.isEmpty()) ? false : true;
                if (!z4 || z13) {
                    return (z4 || !z13) ? 0 : 1;
                }
                return -1;
            }
        });
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
    }
}
