package hms.webrtc;

/* JADX INFO: loaded from: classes11.dex */
class VideoEncoderWrapper {
    @CalledByNative
    public static VideoEncoder.Callback createEncoderCallback(long j7) {
        return new C17492p(j7);
    }

    @CalledByNative
    public static Integer getScalingSettingsHigh(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.high;
    }

    @CalledByNative
    public static Integer getScalingSettingsLow(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.low;
    }

    @CalledByNative
    public static boolean getScalingSettingsOn(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.f67571on;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnEncodedFrame(long j7, EncodedImage encodedImage);
}
