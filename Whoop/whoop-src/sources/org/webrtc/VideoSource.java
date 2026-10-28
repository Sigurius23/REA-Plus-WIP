package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
public class VideoSource extends MediaSource {
    private final CapturerObserver capturerObserver;
    private boolean isCapturerRunning;
    private final NativeAndroidVideoTrackSource nativeAndroidVideoTrackSource;
    private VideoProcessor videoProcessor;
    private final Object videoProcessorLock;

    public static class AspectRatio {
        public static final AspectRatio UNDEFINED = new AspectRatio(0, 0);
        public final int height;
        public final int width;

        public AspectRatio(int i13, int i14) {
            this.width = i13;
            this.height = i14;
        }
    }

    public VideoSource(long j7) {
        super(j7);
        this.videoProcessorLock = new Object();
        this.capturerObserver = new CapturerObserver() { // from class: org.webrtc.VideoSource.1
            @Override // org.webrtc.CapturerObserver
            public void onCapturerStarted(boolean z4) {
                VideoSource.this.nativeAndroidVideoTrackSource.setState(z4);
                synchronized (VideoSource.this.videoProcessorLock) {
                    try {
                        VideoSource.this.isCapturerRunning = z4;
                        if (VideoSource.this.videoProcessor != null) {
                            VideoSource.this.videoProcessor.onCapturerStarted(z4);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }

            @Override // org.webrtc.CapturerObserver
            public void onCapturerStopped() {
                VideoSource.this.nativeAndroidVideoTrackSource.setState(false);
                synchronized (VideoSource.this.videoProcessorLock) {
                    try {
                        VideoSource.this.isCapturerRunning = false;
                        if (VideoSource.this.videoProcessor != null) {
                            VideoSource.this.videoProcessor.onCapturerStopped();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }

            @Override // org.webrtc.CapturerObserver
            public void onFrameCaptured(VideoFrame videoFrame) {
                VideoProcessor.FrameAdaptationParameters frameAdaptationParametersAdaptFrame = VideoSource.this.nativeAndroidVideoTrackSource.adaptFrame(videoFrame);
                synchronized (VideoSource.this.videoProcessorLock) {
                    try {
                        if (VideoSource.this.videoProcessor != null) {
                            VideoSource.this.videoProcessor.onFrameCaptured(videoFrame, frameAdaptationParametersAdaptFrame);
                            return;
                        }
                        VideoFrame videoFrameApplyFrameAdaptationParameters = VideoProcessor.applyFrameAdaptationParameters(videoFrame, frameAdaptationParametersAdaptFrame);
                        if (videoFrameApplyFrameAdaptationParameters != null) {
                            VideoSource.this.nativeAndroidVideoTrackSource.onFrameCaptured(videoFrameApplyFrameAdaptationParameters);
                            videoFrameApplyFrameAdaptationParameters.release();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        };
        this.nativeAndroidVideoTrackSource = new NativeAndroidVideoTrackSource(j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setVideoProcessor$0(VideoFrame videoFrame) {
        this.nativeAndroidVideoTrackSource.onFrameCaptured(videoFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setVideoProcessor$1(VideoFrame videoFrame) {
        runWithReference(new RunnableC28299v(5, this, videoFrame));
    }

    public void adaptOutputFormat(int i13, int i14, int i15) {
        int iMax = Math.max(i13, i14);
        int iMin = Math.min(i13, i14);
        adaptOutputFormat(iMax, iMin, iMin, iMax, i15);
    }

    @Override // org.webrtc.MediaSource
    public void dispose() {
        setVideoProcessor(null);
        super.dispose();
    }

    public CapturerObserver getCapturerObserver() {
        return this.capturerObserver;
    }

    public long getNativeVideoTrackSource() {
        return getNativeMediaSource();
    }

    public void setIsScreencast(boolean z4) {
        this.nativeAndroidVideoTrackSource.setIsScreencast(z4);
    }

    public void setVideoProcessor(VideoProcessor videoProcessor) {
        synchronized (this.videoProcessorLock) {
            try {
                VideoProcessor videoProcessor2 = this.videoProcessor;
                if (videoProcessor2 != null) {
                    videoProcessor2.setSink(null);
                    if (this.isCapturerRunning) {
                        this.videoProcessor.onCapturerStopped();
                    }
                }
                this.videoProcessor = videoProcessor;
                if (videoProcessor != null) {
                    videoProcessor.setSink(new C28277a(this, 2));
                    if (this.isCapturerRunning) {
                        videoProcessor.onCapturerStarted(true);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void adaptOutputFormat(int i13, int i14, int i15, int i16, int i17) {
        adaptOutputFormat(new AspectRatio(i13, i14), Integer.valueOf(i13 * i14), new AspectRatio(i15, i16), Integer.valueOf(i15 * i16), Integer.valueOf(i17));
    }

    public void adaptOutputFormat(AspectRatio aspectRatio, Integer num, AspectRatio aspectRatio2, Integer num2, Integer num3) {
        this.nativeAndroidVideoTrackSource.adaptOutputFormat(aspectRatio, num, aspectRatio2, num2, num3);
    }
}
