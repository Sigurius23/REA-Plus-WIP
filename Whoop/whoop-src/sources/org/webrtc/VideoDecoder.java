package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
public interface VideoDecoder {

    public interface Callback {
        void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2);
    }

    public static class DecodeInfo {
        public final boolean isMissingFrames;
        public final long renderTimeMs;

        public DecodeInfo(boolean z4, long j7) {
            this.isMissingFrames = z4;
            this.renderTimeMs = j7;
        }
    }

    public static class Settings {
        public final int height;
        public final int numberOfCores;
        public final int width;

        @CalledByNative("Settings")
        public Settings(int i13, int i14, int i15) {
            this.numberOfCores = i13;
            this.width = i14;
            this.height = i15;
        }
    }

    @CalledByNative
    default long createNative(long j7) {
        return 0L;
    }

    @CalledByNative
    VideoCodecStatus decode(EncodedImage encodedImage, DecodeInfo decodeInfo);

    @CalledByNative
    String getImplementationName();

    @CalledByNative
    VideoCodecStatus initDecode(Settings settings, Callback callback);

    @CalledByNative
    VideoCodecStatus release();
}
