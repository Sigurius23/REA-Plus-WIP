package hms.webrtc;

/* JADX INFO: loaded from: classes11.dex */
class NativeCapturerObserver implements CapturerObserver {
    private final NativeAndroidVideoTrackSource nativeAndroidVideoTrackSource;

    @CalledByNative
    public NativeCapturerObserver(long j7) {
        this.nativeAndroidVideoTrackSource = new NativeAndroidVideoTrackSource(j7);
    }

    @Override // hms.webrtc.CapturerObserver
    public void onCapturerStarted(boolean z4) {
        this.nativeAndroidVideoTrackSource.setState(z4);
    }

    @Override // hms.webrtc.CapturerObserver
    public void onCapturerStopped() {
        this.nativeAndroidVideoTrackSource.setState(false);
    }

    @Override // hms.webrtc.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        VideoProcessor.FrameAdaptationParameters frameAdaptationParametersAdaptFrame = this.nativeAndroidVideoTrackSource.adaptFrame(videoFrame);
        if (frameAdaptationParametersAdaptFrame == null) {
            return;
        }
        VideoFrame.Buffer bufferCropAndScale = videoFrame.getBuffer().cropAndScale(frameAdaptationParametersAdaptFrame.cropX, frameAdaptationParametersAdaptFrame.cropY, frameAdaptationParametersAdaptFrame.cropWidth, frameAdaptationParametersAdaptFrame.cropHeight, frameAdaptationParametersAdaptFrame.scaleWidth, frameAdaptationParametersAdaptFrame.scaleHeight);
        this.nativeAndroidVideoTrackSource.onFrameCaptured(new VideoFrame(bufferCropAndScale, videoFrame.getRotation(), frameAdaptationParametersAdaptFrame.timestampNs));
        bufferCropAndScale.release();
    }
}
