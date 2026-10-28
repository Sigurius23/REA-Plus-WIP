package org.webrtc;

import p000.AbstractC11266d;
import p000.AbstractC30802r;

/* JADX INFO: loaded from: classes3.dex */
class HardwareVideoEncoderWrapper implements VideoEncoder {
    private static final String TAG = "HardwareVideoEncoderWrapper";
    private final int alignment;
    private CropSizeCalculator calculator = new CropSizeCalculator(1, 0, 0);
    private final VideoEncoder internalEncoder;

    public static class CropSizeCalculator {
        private static final String TAG = "CropSizeCalculator";
        private final int alignment;
        private final int cropX;
        private final int cropY;
        private final int originalHeight;
        private final int originalWidth;

        public CropSizeCalculator(int i13, int i14, int i15) {
            this.alignment = i13;
            this.originalWidth = i14;
            this.originalHeight = i15;
            this.cropX = i14 % i13;
            this.cropY = i15 % i13;
            if (i14 == 0 || i15 == 0) {
                return;
            }
            int croppedWidth = getCroppedWidth();
            int croppedHeight = getCroppedHeight();
            StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "init(): alignment=", " size=", "x");
            AbstractC30802r.m94773v(sbM30465s, i15, " => ", croppedWidth, "x");
            sbM30465s.append(croppedHeight);
            Logging.m85624v(TAG, sbM30465s.toString());
        }

        public int getCroppedHeight() {
            return this.originalHeight - this.cropY;
        }

        public int getCroppedWidth() {
            return this.originalWidth - this.cropX;
        }

        public boolean hasFrameSizeChanged(int i13, int i14) {
            int i15 = this.originalWidth;
            if (i15 == i13 && this.originalHeight == i14) {
                return false;
            }
            StringBuilder sbM30465s = AbstractC11266d.m30465s(i15, this.originalHeight, "frame size has changed: ", "x", " => ");
            sbM30465s.append(i13);
            sbM30465s.append("x");
            sbM30465s.append(i14);
            Logging.m85624v(TAG, sbM30465s.toString());
            return true;
        }

        public boolean isCropRequired() {
            return (this.cropX == 0 && this.cropY == 0) ? false : true;
        }
    }

    public HardwareVideoEncoderWrapper(VideoEncoder videoEncoder, int i13) {
        this.internalEncoder = videoEncoder;
        this.alignment = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$encode$2(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
        this.internalEncoder.encode(videoFrame, encodeInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$encode$3(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
        this.internalEncoder.encode(videoFrame, encodeInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initEncode$0(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        this.internalEncoder.initEncode(settings, callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initEncode$1(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        this.internalEncoder.initEncode(settings, callback);
    }

    private VideoCodecStatus retryWithoutCropping(int i13, int i14, Runnable runnable) {
        Logging.m85624v(TAG, "retrying without resolution adjustment");
        this.calculator = new CropSizeCalculator(1, i13, i14);
        runnable.run();
        return VideoCodecStatus.OK;
    }

    @Override // org.webrtc.VideoEncoder
    public long createNative(long j7) {
        return this.internalEncoder.createNative(j7);
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus encode(final VideoFrame videoFrame, final VideoEncoder.EncodeInfo encodeInfo) {
        if (this.calculator.hasFrameSizeChanged(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight())) {
            this.calculator = new CropSizeCalculator(this.alignment, videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight());
        }
        if (!this.calculator.isCropRequired()) {
            return this.internalEncoder.encode(videoFrame, encodeInfo);
        }
        int croppedWidth = this.calculator.getCroppedWidth();
        int croppedHeight = this.calculator.getCroppedHeight();
        VideoFrame.Buffer bufferCropAndScale = videoFrame.getBuffer().cropAndScale(this.calculator.cropX / 2, this.calculator.cropY / 2, croppedWidth, croppedHeight, croppedWidth, croppedHeight);
        try {
            VideoCodecStatus videoCodecStatusEncode = this.internalEncoder.encode(new VideoFrame(bufferCropAndScale, videoFrame.getRotation(), videoFrame.getTimestampNs()), encodeInfo);
            if (videoCodecStatusEncode != VideoCodecStatus.FALLBACK_SOFTWARE) {
                return videoCodecStatusEncode;
            }
            Logging.m85622e(TAG, "internalEncoder.encode() returned FALLBACK_SOFTWARE");
            final int i13 = 0;
            return retryWithoutCropping(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), new Runnable(this) { // from class: org.webrtc.i

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ HardwareVideoEncoderWrapper f114075x;

                {
                    this.f114075x = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            this.f114075x.lambda$encode$2(videoFrame, encodeInfo);
                            break;
                        default:
                            this.f114075x.lambda$encode$3(videoFrame, encodeInfo);
                            break;
                    }
                }
            });
        } catch (Exception e5) {
            Logging.m85623e(TAG, "internalEncoder.encode() failed", e5);
            final int i14 = 1;
            return retryWithoutCropping(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), new Runnable(this) { // from class: org.webrtc.i

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ HardwareVideoEncoderWrapper f114075x;

                {
                    this.f114075x = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            this.f114075x.lambda$encode$2(videoFrame, encodeInfo);
                            break;
                        default:
                            this.f114075x.lambda$encode$3(videoFrame, encodeInfo);
                            break;
                    }
                }
            });
        } finally {
            bufferCropAndScale.release();
        }
    }

    @Override // org.webrtc.VideoEncoder
    public VideoEncoder.EncoderInfo getEncoderInfo() {
        return this.internalEncoder.getEncoderInfo();
    }

    @Override // org.webrtc.VideoEncoder
    public String getImplementationName() {
        return this.internalEncoder.getImplementationName();
    }

    @Override // org.webrtc.VideoEncoder
    public VideoEncoder.ResolutionBitrateLimits[] getResolutionBitrateLimits() {
        return this.internalEncoder.getResolutionBitrateLimits();
    }

    @Override // org.webrtc.VideoEncoder
    public VideoEncoder.ScalingSettings getScalingSettings() {
        return this.internalEncoder.getScalingSettings();
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus initEncode(final VideoEncoder.Settings settings, final VideoEncoder.Callback callback) {
        CropSizeCalculator cropSizeCalculator = new CropSizeCalculator(this.alignment, settings.width, settings.height);
        this.calculator = cropSizeCalculator;
        if (!cropSizeCalculator.isCropRequired()) {
            return this.internalEncoder.initEncode(settings, callback);
        }
        VideoEncoder.Settings settings2 = new VideoEncoder.Settings(settings.numberOfCores, this.calculator.getCroppedWidth(), this.calculator.getCroppedHeight(), settings.startBitrate, settings.maxFramerate, settings.numberOfSimulcastStreams, settings.automaticResizeOn, settings.capabilities);
        try {
            VideoCodecStatus videoCodecStatusInitEncode = this.internalEncoder.initEncode(settings2, callback);
            if (videoCodecStatusInitEncode != VideoCodecStatus.FALLBACK_SOFTWARE) {
                return videoCodecStatusInitEncode;
            }
            Logging.m85622e(TAG, "internalEncoder.initEncode() returned FALLBACK_SOFTWARE: croppedSettings ".concat(String.valueOf(settings2)));
            final int i13 = 0;
            return retryWithoutCropping(settings.width, settings.height, new Runnable(this) { // from class: org.webrtc.j

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ HardwareVideoEncoderWrapper f114079x;

                {
                    this.f114079x = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            this.f114079x.lambda$initEncode$0(settings, callback);
                            break;
                        default:
                            this.f114079x.lambda$initEncode$1(settings, callback);
                            break;
                    }
                }
            });
        } catch (Exception e5) {
            Logging.m85623e(TAG, "internalEncoder.initEncode() failed", e5);
            final int i14 = 1;
            return retryWithoutCropping(settings.width, settings.height, new Runnable(this) { // from class: org.webrtc.j

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ HardwareVideoEncoderWrapper f114079x;

                {
                    this.f114079x = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            this.f114079x.lambda$initEncode$0(settings, callback);
                            break;
                        default:
                            this.f114079x.lambda$initEncode$1(settings, callback);
                            break;
                    }
                }
            });
        }
    }

    @Override // org.webrtc.VideoEncoder
    public boolean isHardwareEncoder() {
        return this.internalEncoder.isHardwareEncoder();
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus release() {
        return this.internalEncoder.release();
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus setRateAllocation(VideoEncoder.BitrateAllocation bitrateAllocation, int i13) {
        return this.internalEncoder.setRateAllocation(bitrateAllocation, i13);
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus setRates(VideoEncoder.RateControlParameters rateControlParameters) {
        return this.internalEncoder.setRates(rateControlParameters);
    }
}
