package live.hms.video.encoder.video;

import android.os.Build;
import hms.webrtc.EglBase;
import hms.webrtc.HardwareVideoEncoderFactory;
import hms.webrtc.SimulcastVideoEncoderFactory;
import hms.webrtc.SoftwareVideoEncoderFactory;
import hms.webrtc.VideoCodecInfo;
import hms.webrtc.VideoCodecStatus;
import hms.webrtc.VideoEncoder;
import hms.webrtc.VideoEncoderFactory;
import hms.webrtc.VideoEncoderFallback;
import hms.webrtc.VideoFrame;
import hms.webrtc.WrappedNativeVideoEncoder;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import live.hms.video.utils.HMSLogger;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39414r;
import yb3.AbstractC39415s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0015\u0016\u0017B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013H\u0016¢\u0006\u0002\u0010\u0014R\u000e\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m65681d2 = {"Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper;", "Lhms/webrtc/VideoEncoderFactory;", "sharedContext", "Lhms/webrtc/EglBase$Context;", "enableIntelVp8Encoder", "", "enableH264HighProfile", "forceSoftwareEncoder", "<init>", "(Lhms/webrtc/EglBase$Context;ZZZ)V", "primary", "fallback", "native", "Lhms/webrtc/SimulcastVideoEncoderFactory;", "createEncoder", "Lhms/webrtc/VideoEncoder;", "info", "Lhms/webrtc/VideoCodecInfo;", "getSupportedCodecs", "", "()[Lhms/webrtc/VideoCodecInfo;", "FallbackFactory", "StreamEncoderWrapper", "StreamEncoderWrapperFactory", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class SimulcastVideoEncoderFactoryWrapper implements VideoEncoderFactory {
    private final VideoEncoderFactory fallback;
    private final SimulcastVideoEncoderFactory native;
    private final VideoEncoderFactory primary;

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0016¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m65681d2 = {"Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$FallbackFactory;", "Lhms/webrtc/VideoEncoderFactory;", "hardwareVideoEncoderFactory", "<init>", "(Lhms/webrtc/VideoEncoderFactory;)V", "softwareVideoEncoderFactory", "createEncoder", "Lhms/webrtc/VideoEncoder;", "info", "Lhms/webrtc/VideoCodecInfo;", "getSupportedCodecs", "", "()[Lhms/webrtc/VideoCodecInfo;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class FallbackFactory implements VideoEncoderFactory {
        private final VideoEncoderFactory hardwareVideoEncoderFactory;
        private final VideoEncoderFactory softwareVideoEncoderFactory;

        public FallbackFactory(VideoEncoderFactory hardwareVideoEncoderFactory) {
            AbstractC22676k.m65750j(hardwareVideoEncoderFactory, "hardwareVideoEncoderFactory");
            this.hardwareVideoEncoderFactory = hardwareVideoEncoderFactory;
            this.softwareVideoEncoderFactory = new SoftwareVideoEncoderFactory();
        }

        @Override // hms.webrtc.VideoEncoderFactory
        public VideoEncoder createEncoder(VideoCodecInfo info) {
            AbstractC22676k.m65750j(info, "info");
            VideoEncoder videoEncoderCreateEncoder = this.softwareVideoEncoderFactory.createEncoder(info);
            VideoEncoder videoEncoderCreateEncoder2 = this.hardwareVideoEncoderFactory.createEncoder(info);
            if (videoEncoderCreateEncoder2 == null || videoEncoderCreateEncoder == null) {
                return videoEncoderCreateEncoder == null ? videoEncoderCreateEncoder2 : videoEncoderCreateEncoder;
            }
            return new VideoEncoderFallback(videoEncoderCreateEncoder2, videoEncoderCreateEncoder);
        }

        @Override // hms.webrtc.VideoEncoderFactory
        public VideoCodecInfo[] getSupportedCodecs() {
            ArrayList arrayList = new ArrayList();
            VideoCodecInfo[] supportedCodecs = this.softwareVideoEncoderFactory.getSupportedCodecs();
            AbstractC22676k.m65749i(supportedCodecs, "getSupportedCodecs(...)");
            AbstractC25265s.m74139o0(arrayList, supportedCodecs);
            VideoCodecInfo[] supportedCodecs2 = this.hardwareVideoEncoderFactory.getSupportedCodecs();
            AbstractC22676k.m65749i(supportedCodecs2, "getSupportedCodecs(...)");
            AbstractC25265s.m74139o0(arrayList, supportedCodecs2);
            return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[0]);
        }
    }

    @Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\u001a\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020&H\u0016J\u0012\u0010'\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0013\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0016¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020/H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u00060"}, m65681d2 = {"Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;", "Lhms/webrtc/VideoEncoder;", "encoder", "<init>", "(Lhms/webrtc/VideoEncoder;)V", "executor", "Ljava/util/concurrent/ExecutorService;", "getExecutor", "()Ljava/util/concurrent/ExecutorService;", "streamSettings", "Lhms/webrtc/VideoEncoder$Settings;", "getStreamSettings", "()Lhms/webrtc/VideoEncoder$Settings;", "setStreamSettings", "(Lhms/webrtc/VideoEncoder$Settings;)V", "initEncode", "Lhms/webrtc/VideoCodecStatus;", "settings", "callback", "Lhms/webrtc/VideoEncoder$Callback;", "release", "encode", "frame", "Lhms/webrtc/VideoFrame;", "encodeInfo", "Lhms/webrtc/VideoEncoder$EncodeInfo;", "setRateAllocation", "allocation", "Lhms/webrtc/VideoEncoder$BitrateAllocation;", "frameRate", "", "getScalingSettings", "Lhms/webrtc/VideoEncoder$ScalingSettings;", "getImplementationName", "", "createNativeVideoEncoder", "", "isHardwareEncoder", "", "setRates", "rcParameters", "Lhms/webrtc/VideoEncoder$RateControlParameters;", "getResolutionBitrateLimits", "", "Lhms/webrtc/VideoEncoder$ResolutionBitrateLimits;", "()[Lhms/webrtc/VideoEncoder$ResolutionBitrateLimits;", "getEncoderInfo", "Lhms/webrtc/VideoEncoder$EncoderInfo;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class StreamEncoderWrapper implements VideoEncoder {
        private final VideoEncoder encoder;
        private final ExecutorService executor;
        private VideoEncoder.Settings streamSettings;

        public StreamEncoderWrapper(VideoEncoder encoder) {
            AbstractC22676k.m65750j(encoder, "encoder");
            this.encoder = encoder;
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            AbstractC22676k.m65749i(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
            this.executor = executorServiceNewSingleThreadExecutor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Long createNativeVideoEncoder$lambda$6(StreamEncoderWrapper this$0) {
            AbstractC22676k.m65750j(this$0, "this$0");
            return Long.valueOf(this$0.encoder.createNativeVideoEncoder());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoCodecStatus encode$lambda$2(StreamEncoderWrapper this$0, VideoFrame frame, VideoEncoder.EncodeInfo encodeInfo) {
            AbstractC22676k.m65750j(this$0, "this$0");
            AbstractC22676k.m65750j(frame, "$frame");
            if (this$0.streamSettings == null) {
                return this$0.encoder.encode(frame, encodeInfo);
            }
            int width = frame.getBuffer().getWidth();
            VideoEncoder.Settings settings = this$0.streamSettings;
            AbstractC22676k.m65747g(settings);
            if (width == settings.width) {
                return this$0.encoder.encode(frame, encodeInfo);
            }
            VideoFrame.Buffer buffer = frame.getBuffer();
            int width2 = buffer.getWidth();
            int height = buffer.getHeight();
            VideoEncoder.Settings settings2 = this$0.streamSettings;
            AbstractC22676k.m65747g(settings2);
            int i13 = settings2.width;
            VideoEncoder.Settings settings3 = this$0.streamSettings;
            AbstractC22676k.m65747g(settings3);
            VideoFrame.Buffer bufferCropAndScale = buffer.cropAndScale(0, 0, width2, height, i13, settings3.height);
            VideoCodecStatus videoCodecStatusEncode = this$0.encoder.encode(new VideoFrame(bufferCropAndScale, frame.getRotation(), frame.getTimestampNs()), encodeInfo);
            bufferCropAndScale.release();
            return videoCodecStatusEncode;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoEncoder.EncoderInfo getEncoderInfo$lambda$10(StreamEncoderWrapper this$0) {
            AbstractC22676k.m65750j(this$0, "this$0");
            return this$0.encoder.getEncoderInfo();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getImplementationName$lambda$5(StreamEncoderWrapper this$0) {
            AbstractC22676k.m65750j(this$0, "this$0");
            return this$0.encoder.getImplementationName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoEncoder.ResolutionBitrateLimits[] getResolutionBitrateLimits$lambda$9(StreamEncoderWrapper this$0) {
            AbstractC22676k.m65750j(this$0, "this$0");
            return this$0.encoder.getResolutionBitrateLimits();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoEncoder.ScalingSettings getScalingSettings$lambda$4(StreamEncoderWrapper this$0) {
            AbstractC22676k.m65750j(this$0, "this$0");
            return this$0.encoder.getScalingSettings();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoCodecStatus initEncode$lambda$0(StreamEncoderWrapper this$0, VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
            AbstractC22676k.m65750j(this$0, "this$0");
            AbstractC22676k.m65750j(settings, "$settings");
            HMSLogger.m71136d("SimulcastVideoEncoderFactoryWrapper", AbstractC39415s.m125910t("initEncode() thread=" + Thread.currentThread().getName() + " [" + Thread.currentThread().getId() + "]\n                |  encoder=" + this$0.encoder.getImplementationName() + "\n                |  streamSettings:\n                |    numberOfCores=" + settings.numberOfCores + "\n                |    width=" + settings.width + "\n                |    height=" + settings.height + "\n                |    startBitrate=" + settings.startBitrate + "\n                |    maxFramerate=" + settings.maxFramerate + "\n                |    automaticResizeOn=" + settings.automaticResizeOn + "\n                |    numberOfSimulcastStreams=" + settings.numberOfSimulcastStreams + "\n                |    lossNotification=" + settings.capabilities.lossNotification + "\n            "));
            return this$0.encoder.initEncode(settings, callback);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Boolean isHardwareEncoder$lambda$7(StreamEncoderWrapper this$0) {
            AbstractC22676k.m65750j(this$0, "this$0");
            return Boolean.valueOf(this$0.encoder.isHardwareEncoder());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoCodecStatus release$lambda$1(StreamEncoderWrapper this$0) {
            AbstractC22676k.m65750j(this$0, "this$0");
            return this$0.encoder.release();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoCodecStatus setRateAllocation$lambda$3(StreamEncoderWrapper this$0, VideoEncoder.BitrateAllocation bitrateAllocation, int i13) {
            AbstractC22676k.m65750j(this$0, "this$0");
            return this$0.encoder.setRateAllocation(bitrateAllocation, i13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoCodecStatus setRates$lambda$8(StreamEncoderWrapper this$0, VideoEncoder.RateControlParameters rateControlParameters) {
            AbstractC22676k.m65750j(this$0, "this$0");
            return this$0.encoder.setRates(rateControlParameters);
        }

        @Override // hms.webrtc.VideoEncoder
        public long createNativeVideoEncoder() throws ExecutionException, InterruptedException {
            Object obj = this.executor.submit(new CallableC24140a(this, 5)).get();
            AbstractC22676k.m65749i(obj, "get(...)");
            return ((Number) obj).longValue();
        }

        @Override // hms.webrtc.VideoEncoder
        public VideoCodecStatus encode(VideoFrame frame, VideoEncoder.EncodeInfo encodeInfo) throws ExecutionException, InterruptedException {
            AbstractC22676k.m65750j(frame, "frame");
            Object obj = this.executor.submit(new CallableC24142c(this, frame, encodeInfo, 1)).get();
            AbstractC22676k.m65749i(obj, "get(...)");
            return (VideoCodecStatus) obj;
        }

        @Override // hms.webrtc.VideoEncoder
        public VideoEncoder.EncoderInfo getEncoderInfo() throws ExecutionException, InterruptedException {
            Object obj = this.executor.submit(new CallableC24140a(this, 1)).get();
            AbstractC22676k.m65749i(obj, "get(...)");
            return (VideoEncoder.EncoderInfo) obj;
        }

        public final ExecutorService getExecutor() {
            return this.executor;
        }

        @Override // hms.webrtc.VideoEncoder
        public String getImplementationName() throws ExecutionException, InterruptedException {
            Object obj = this.executor.submit(new CallableC24140a(this, 2)).get();
            AbstractC22676k.m65749i(obj, "get(...)");
            return (String) obj;
        }

        @Override // hms.webrtc.VideoEncoder
        public VideoEncoder.ResolutionBitrateLimits[] getResolutionBitrateLimits() throws ExecutionException, InterruptedException {
            Object obj = this.executor.submit(new CallableC24140a(this, 6)).get();
            AbstractC22676k.m65749i(obj, "get(...)");
            return (VideoEncoder.ResolutionBitrateLimits[]) obj;
        }

        @Override // hms.webrtc.VideoEncoder
        public VideoEncoder.ScalingSettings getScalingSettings() throws ExecutionException, InterruptedException {
            Object obj = this.executor.submit(new CallableC24140a(this, 3)).get();
            AbstractC22676k.m65749i(obj, "get(...)");
            return (VideoEncoder.ScalingSettings) obj;
        }

        public final VideoEncoder.Settings getStreamSettings() {
            return this.streamSettings;
        }

        @Override // hms.webrtc.VideoEncoder
        public VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) throws ExecutionException, InterruptedException {
            AbstractC22676k.m65750j(settings, "settings");
            this.streamSettings = settings;
            Object obj = this.executor.submit(new CallableC24142c(this, settings, callback, 0)).get();
            AbstractC22676k.m65749i(obj, "get(...)");
            return (VideoCodecStatus) obj;
        }

        @Override // hms.webrtc.VideoEncoder
        public boolean isHardwareEncoder() throws ExecutionException, InterruptedException {
            Object obj = this.executor.submit(new CallableC24140a(this, 4)).get();
            AbstractC22676k.m65749i(obj, "get(...)");
            return ((Boolean) obj).booleanValue();
        }

        @Override // hms.webrtc.VideoEncoder
        public VideoCodecStatus release() throws ExecutionException, InterruptedException {
            Object obj = this.executor.submit(new CallableC24140a(this, 0)).get();
            AbstractC22676k.m65749i(obj, "get(...)");
            return (VideoCodecStatus) obj;
        }

        @Override // hms.webrtc.VideoEncoder
        public VideoCodecStatus setRateAllocation(final VideoEncoder.BitrateAllocation allocation, final int frameRate) throws ExecutionException, InterruptedException {
            Object obj = this.executor.submit(new Callable() { // from class: live.hms.video.encoder.video.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.setRateAllocation$lambda$3(this.f95204w, allocation, frameRate);
                }
            }).get();
            AbstractC22676k.m65749i(obj, "get(...)");
            return (VideoCodecStatus) obj;
        }

        @Override // hms.webrtc.VideoEncoder
        public VideoCodecStatus setRates(final VideoEncoder.RateControlParameters rcParameters) throws ExecutionException, InterruptedException {
            Object obj = this.executor.submit(new Callable() { // from class: live.hms.video.encoder.video.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.setRates$lambda$8(this.f95211w, rcParameters);
                }
            }).get();
            AbstractC22676k.m65749i(obj, "get(...)");
            return (VideoCodecStatus) obj;
        }

        public final void setStreamSettings(VideoEncoder.Settings settings) {
            this.streamSettings = settings;
        }
    }

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0016¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m65681d2 = {"Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapperFactory;", "Lhms/webrtc/VideoEncoderFactory;", "factory", "<init>", "(Lhms/webrtc/VideoEncoderFactory;)V", "createEncoder", "Lhms/webrtc/VideoEncoder;", "videoCodecInfo", "Lhms/webrtc/VideoCodecInfo;", "getSupportedCodecs", "", "()[Lhms/webrtc/VideoCodecInfo;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class StreamEncoderWrapperFactory implements VideoEncoderFactory {
        private final VideoEncoderFactory factory;

        public StreamEncoderWrapperFactory(VideoEncoderFactory factory) {
            AbstractC22676k.m65750j(factory, "factory");
            this.factory = factory;
        }

        @Override // hms.webrtc.VideoEncoderFactory
        public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
            VideoEncoder videoEncoderCreateEncoder = this.factory.createEncoder(videoCodecInfo);
            if (videoEncoderCreateEncoder == null) {
                return null;
            }
            return videoEncoderCreateEncoder instanceof WrappedNativeVideoEncoder ? videoEncoderCreateEncoder : new StreamEncoderWrapper(videoEncoderCreateEncoder);
        }

        @Override // hms.webrtc.VideoEncoderFactory
        public VideoCodecInfo[] getSupportedCodecs() {
            VideoCodecInfo[] supportedCodecs = this.factory.getSupportedCodecs();
            AbstractC22676k.m65749i(supportedCodecs, "getSupportedCodecs(...)");
            return supportedCodecs;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0034  */
    public SimulcastVideoEncoderFactoryWrapper(EglBase.Context context, boolean z4, boolean z13, boolean z14) {
        SimulcastVideoEncoderFactory simulcastVideoEncoderFactory;
        StreamEncoderWrapperFactory streamEncoderWrapperFactory = new StreamEncoderWrapperFactory(new HardwareVideoEncoderFactory(context, z4, z13));
        this.primary = streamEncoderWrapperFactory;
        StreamEncoderWrapperFactory streamEncoderWrapperFactory2 = new StreamEncoderWrapperFactory(new FallbackFactory(streamEncoderWrapperFactory));
        this.fallback = streamEncoderWrapperFactory2;
        if (z14) {
            simulcastVideoEncoderFactory = new SimulcastVideoEncoderFactory(streamEncoderWrapperFactory2, streamEncoderWrapperFactory);
        } else {
            String MODEL = Build.MODEL;
            AbstractC22676k.m65749i(MODEL, "MODEL");
            if (AbstractC39414r.m125876U(MODEL, "Pixel 3", false)) {
                simulcastVideoEncoderFactory = new SimulcastVideoEncoderFactory(streamEncoderWrapperFactory2, streamEncoderWrapperFactory);
            } else {
                simulcastVideoEncoderFactory = new SimulcastVideoEncoderFactory(streamEncoderWrapperFactory, streamEncoderWrapperFactory2);
            }
        }
        this.native = simulcastVideoEncoderFactory;
    }

    @Override // hms.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo info) {
        return this.native.createEncoder(info);
    }

    @Override // hms.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        VideoCodecInfo[] supportedCodecs = this.native.getSupportedCodecs();
        AbstractC22676k.m65749i(supportedCodecs, "getSupportedCodecs(...)");
        return supportedCodecs;
    }

    public /* synthetic */ SimulcastVideoEncoderFactoryWrapper(EglBase.Context context, boolean z4, boolean z13, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? true : z4, (i13 & 4) != 0 ? true : z13, z14);
    }
}
