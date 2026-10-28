package hms.webrtc;

/* JADX INFO: loaded from: classes11.dex */
public interface VideoProcessor extends CapturerObserver {

    public static class FrameAdaptationParameters {
        public final int cropHeight;
        public final int cropWidth;
        public final int cropX;
        public final int cropY;
        public final boolean drop;
        public final int scaleHeight;
        public final int scaleWidth;
        public final long timestampNs;

        public FrameAdaptationParameters(int i13, int i14, int i15, int i16, int i17, int i18, long j7, boolean z4) {
            this.cropX = i13;
            this.cropY = i14;
            this.cropWidth = i15;
            this.cropHeight = i16;
            this.scaleWidth = i17;
            this.scaleHeight = i18;
            this.timestampNs = j7;
            this.drop = z4;
        }
    }

    static VideoFrame applyFrameAdaptationParameters(VideoFrame videoFrame, FrameAdaptationParameters frameAdaptationParameters) {
        if (frameAdaptationParameters.drop) {
            return null;
        }
        return new VideoFrame(videoFrame.getBuffer().cropAndScale(frameAdaptationParameters.cropX, frameAdaptationParameters.cropY, frameAdaptationParameters.cropWidth, frameAdaptationParameters.cropHeight, frameAdaptationParameters.scaleWidth, frameAdaptationParameters.scaleHeight), videoFrame.getRotation(), frameAdaptationParameters.timestampNs);
    }

    default void onFrameCaptured(VideoFrame videoFrame, FrameAdaptationParameters frameAdaptationParameters) {
        VideoFrame videoFrameApplyFrameAdaptationParameters = applyFrameAdaptationParameters(videoFrame, frameAdaptationParameters);
        if (videoFrameApplyFrameAdaptationParameters != null) {
            onFrameCaptured(videoFrameApplyFrameAdaptationParameters);
            videoFrameApplyFrameAdaptationParameters.release();
        }
    }

    void setSink(VideoSink videoSink);
}
