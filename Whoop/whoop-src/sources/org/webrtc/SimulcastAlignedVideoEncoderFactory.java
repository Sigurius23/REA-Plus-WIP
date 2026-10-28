package org.webrtc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p088dc.AbstractC11895b;

/* JADX INFO: loaded from: classes3.dex */
public class SimulcastAlignedVideoEncoderFactory implements VideoEncoderFactory {
    private final SimulcastVideoEncoderFactory delegate;
    private final VideoEncoderFactory fallback;
    private final VideoEncoderFactory primary;

    public static class StreamEncoderWrapper implements VideoEncoder {
        private static final String TAG = "StreamEncoderWrapper";
        private final VideoEncoder encoder;
        private final ExecutorService executor = Executors.newSingleThreadExecutor();
        private VideoEncoder.Settings streamSettings;

        public StreamEncoderWrapper(VideoEncoder videoEncoder) {
            this.encoder = videoEncoder;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ VideoCodecStatus lambda$encode$2(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) throws Exception {
            if (this.streamSettings == null) {
                return VideoCodecStatus.ERROR;
            }
            if (videoFrame.getBuffer().getWidth() == this.streamSettings.width) {
                return this.encoder.encode(videoFrame, encodeInfo);
            }
            int width = videoFrame.getBuffer().getWidth();
            int height = videoFrame.getBuffer().getHeight();
            VideoFrame.Buffer buffer = videoFrame.getBuffer();
            VideoEncoder.Settings settings = this.streamSettings;
            VideoFrame.Buffer bufferCropAndScale = buffer.cropAndScale(0, 0, width, height, settings.width, settings.height);
            VideoCodecStatus videoCodecStatusEncode = this.encoder.encode(new VideoFrame(bufferCropAndScale, videoFrame.getRotation(), videoFrame.getTimestampNs()), encodeInfo);
            bufferCropAndScale.release();
            return videoCodecStatusEncode;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String lambda$getImplementationName$5() throws Exception {
            return this.encoder.getImplementationName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ VideoEncoder.ScalingSettings lambda$getScalingSettings$4() throws Exception {
            return this.encoder.getScalingSettings();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ VideoCodecStatus lambda$initEncode$0(VideoEncoder.Settings settings, VideoEncoder.Callback callback) throws Exception {
            StringBuilder sbM32000s = AbstractC11895b.m32000s("initEncode() thread=", Thread.currentThread().getName(), Thread.currentThread().getId(), " [");
            sbM32000s.append("]");
            Logging.m85624v(TAG, sbM32000s.toString());
            Logging.m85624v(TAG, "  encoder=" + this.encoder.getImplementationName());
            Logging.m85624v(TAG, "  streamSettings:");
            Logging.m85624v(TAG, "    numberOfCores=" + settings.numberOfCores);
            Logging.m85624v(TAG, "    width=" + settings.width);
            Logging.m85624v(TAG, "    height=" + settings.height);
            Logging.m85624v(TAG, "    startBitrate=" + settings.startBitrate);
            Logging.m85624v(TAG, "    maxFramerate=" + settings.maxFramerate);
            Logging.m85624v(TAG, "    automaticResizeOn=" + settings.automaticResizeOn);
            Logging.m85624v(TAG, "    numberOfSimulcastStreams=" + settings.numberOfSimulcastStreams);
            Logging.m85624v(TAG, "    lossNotification=" + settings.capabilities.lossNotification);
            return this.encoder.initEncode(settings, callback);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ VideoCodecStatus lambda$release$1() throws Exception {
            return this.encoder.release();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ VideoCodecStatus lambda$setRateAllocation$3(VideoEncoder.BitrateAllocation bitrateAllocation, int i13) throws Exception {
            return this.encoder.setRateAllocation(bitrateAllocation, i13);
        }

        @Override // org.webrtc.VideoEncoder
        public VideoCodecStatus encode(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
            try {
                return (VideoCodecStatus) this.executor.submit(new CallableC28295q(this, videoFrame, encodeInfo, 1)).get();
            } catch (Exception unused) {
                return VideoCodecStatus.ERROR;
            }
        }

        @Override // org.webrtc.VideoEncoder
        public String getImplementationName() {
            try {
                return (String) this.executor.submit(new CallableC28294p(this, 1)).get();
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // org.webrtc.VideoEncoder
        public VideoEncoder.ScalingSettings getScalingSettings() {
            try {
                return (VideoEncoder.ScalingSettings) this.executor.submit(new CallableC28294p(this, 0)).get();
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // org.webrtc.VideoEncoder
        public VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
            this.streamSettings = settings;
            try {
                return (VideoCodecStatus) this.executor.submit(new CallableC28295q(this, settings, callback, 0)).get();
            } catch (Exception unused) {
                return VideoCodecStatus.ERROR;
            }
        }

        @Override // org.webrtc.VideoEncoder
        public VideoCodecStatus release() {
            try {
                return (VideoCodecStatus) this.executor.submit(new CallableC28294p(this, 2)).get();
            } catch (Exception unused) {
                return VideoCodecStatus.ERROR;
            }
        }

        @Override // org.webrtc.VideoEncoder
        public VideoCodecStatus setRateAllocation(final VideoEncoder.BitrateAllocation bitrateAllocation, final int i13) {
            try {
                return (VideoCodecStatus) this.executor.submit(new Callable() { // from class: org.webrtc.s
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f114095w.lambda$setRateAllocation$3(bitrateAllocation, i13);
                    }
                }).get();
            } catch (Exception unused) {
                return VideoCodecStatus.ERROR;
            }
        }
    }

    public static class StreamEncoderWrapperFactory implements VideoEncoderFactory {
        private final VideoEncoderFactory factory;

        public StreamEncoderWrapperFactory(VideoEncoderFactory videoEncoderFactory) {
            this.factory = videoEncoderFactory;
        }

        @Override // org.webrtc.VideoEncoderFactory
        public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
            VideoEncoder videoEncoderCreateEncoder = this.factory.createEncoder(videoCodecInfo);
            if (videoEncoderCreateEncoder == null) {
                return null;
            }
            return new StreamEncoderWrapper(videoEncoderCreateEncoder);
        }

        @Override // org.webrtc.VideoEncoderFactory
        public VideoCodecInfo[] getSupportedCodecs() {
            return this.factory.getSupportedCodecs();
        }
    }

    public SimulcastAlignedVideoEncoderFactory(EglBase.Context context, boolean z4, boolean z13, ResolutionAdjustment resolutionAdjustment) {
        HardwareVideoEncoderFactory hardwareVideoEncoderFactory = new HardwareVideoEncoderFactory(context, z4, z13);
        StreamEncoderWrapperFactory streamEncoderWrapperFactory = new StreamEncoderWrapperFactory(resolutionAdjustment != ResolutionAdjustment.NONE ? new HardwareVideoEncoderWrapperFactory(hardwareVideoEncoderFactory, resolutionAdjustment.getValue()) : hardwareVideoEncoderFactory);
        this.primary = streamEncoderWrapperFactory;
        SoftwareVideoEncoderFactory softwareVideoEncoderFactory = new SoftwareVideoEncoderFactory();
        this.fallback = softwareVideoEncoderFactory;
        this.delegate = new SimulcastVideoEncoderFactory(streamEncoderWrapperFactory, softwareVideoEncoderFactory);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        return this.delegate.createEncoder(videoCodecInfo);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        return this.delegate.getSupportedCodecs();
    }
}
