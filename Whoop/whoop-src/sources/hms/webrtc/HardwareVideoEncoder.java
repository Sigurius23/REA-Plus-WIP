package hms.webrtc;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;

/* JADX INFO: loaded from: classes11.dex */
class HardwareVideoEncoder implements VideoEncoder {
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final String KEY_BITRATE_MODE = "bitrate-mode";
    private static final int MAX_ENCODER_Q_SIZE = 2;
    private static final int MAX_VIDEO_FRAMERATE = 30;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final int REQUIRED_RESOLUTION_ALIGNMENT = 16;
    private static final String TAG = "HardwareVideoEncoder";
    private static final int VIDEO_AVC_LEVEL_3 = 256;
    private static final int VIDEO_AVC_PROFILE_HIGH = 8;
    private static final int VIDEO_ControlRateConstant = 2;
    private int adjustedBitrate;
    private boolean automaticResizeOn;
    private final BitrateAdjuster bitrateAdjuster;
    private VideoEncoder.Callback callback;
    private MediaCodecWrapper codec;
    private final String codecName;
    private final VideoCodecMimeType codecType;
    private ByteBuffer configBuffer;
    private final ThreadUtils.ThreadChecker encodeThreadChecker;
    private final long forcedKeyFrameNs;
    private int height;
    private final int keyFrameIntervalSec;
    private long lastKeyFrameNs;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private long nextPresentationTimestampUs;
    private final BusyCount outputBuffersBusyCount;
    private Thread outputThread;
    private final ThreadUtils.ThreadChecker outputThreadChecker;
    private final Map<String, String> params;
    private volatile boolean running;
    private final EglBase14.Context sharedContext;
    private volatile Exception shutdownException;
    private int sliceHeight;
    private int stride;
    private final Integer surfaceColorFormat;
    private EglBase14 textureEglBase;
    private Surface textureInputSurface;
    private boolean useSurfaceMode;
    private int width;
    private final Integer yuvColorFormat;
    private final YuvFormat yuvFormat;
    private final GlRectDrawer textureDrawer = new GlRectDrawer();
    private final VideoFrameDrawer videoFrameDrawer = new VideoFrameDrawer();
    private final BlockingDeque<EncodedImage.Builder> outputBuilders = new LinkedBlockingDeque();

    public static class BusyCount {
        private int count;
        private final Object countLock;

        public /* synthetic */ BusyCount(int i13) {
            this();
        }

        public void decrement() {
            synchronized (this.countLock) {
                try {
                    int i13 = this.count - 1;
                    this.count = i13;
                    if (i13 == 0) {
                        this.countLock.notifyAll();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public void increment() {
            synchronized (this.countLock) {
                this.count++;
            }
        }

        public void waitForZero() {
            boolean z4;
            synchronized (this.countLock) {
                z4 = false;
                while (this.count > 0) {
                    try {
                        this.countLock.wait();
                    } catch (InterruptedException e5) {
                        Logging.m49572e(HardwareVideoEncoder.TAG, "Interrupted while waiting on busy count", e5);
                        z4 = true;
                    }
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }

        private BusyCount() {
            this.countLock = new Object();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class YuvFormat {
        private static final /* synthetic */ YuvFormat[] $VALUES;
        public static final YuvFormat I420;
        public static final YuvFormat NV12;

        /* JADX INFO: renamed from: hms.webrtc.HardwareVideoEncoder$YuvFormat$1 */
        public final enum C174471 extends YuvFormat {
            public /* synthetic */ C174471() {
                this("I420", 0);
            }

            @Override // hms.webrtc.HardwareVideoEncoder.YuvFormat
            public void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer, int i13, int i14) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight(), i13, i14, i13 / 2, i14 / 2);
                i420.release();
            }

            private C174471(String str, int i13) {
                super(str, i13, 0);
            }
        }

        /* JADX INFO: renamed from: hms.webrtc.HardwareVideoEncoder$YuvFormat$2 */
        public final enum C174482 extends YuvFormat {
            public /* synthetic */ C174482() {
                this("NV12", 1);
            }

            @Override // hms.webrtc.HardwareVideoEncoder.YuvFormat
            public void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer, int i13, int i14) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.I420ToNV12(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight(), i13, i14);
                i420.release();
            }

            private C174482(String str, int i13) {
                super(str, i13, 0);
            }
        }

        static {
            C174471 c174471 = new C174471();
            I420 = c174471;
            C174482 c174482 = new C174482();
            NV12 = c174482;
            $VALUES = new YuvFormat[]{c174471, c174482};
        }

        public /* synthetic */ YuvFormat(String str, int i13, int i14) {
            this(str, i13);
        }

        public static YuvFormat valueOf(String str) {
            return (YuvFormat) Enum.valueOf(YuvFormat.class, str);
        }

        public static YuvFormat[] values() {
            return (YuvFormat[]) $VALUES.clone();
        }

        public abstract void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer, int i13, int i14);

        private YuvFormat(String str, int i13) {
            super(str, i13);
        }

        public static YuvFormat valueOf(int i13) {
            if (i13 == 19) {
                return I420;
            }
            if (i13 == 21 || i13 == 2141391872 || i13 == 2141391876) {
                return NV12;
            }
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Unsupported colorFormat: "));
        }
    }

    public HardwareVideoEncoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecMimeType videoCodecMimeType, Integer num, Integer num2, Map<String, String> map, int i13, int i14, BitrateAdjuster bitrateAdjuster, EglBase14.Context context) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.encodeThreadChecker = threadChecker;
        this.outputThreadChecker = new ThreadUtils.ThreadChecker();
        this.outputBuffersBusyCount = new BusyCount(0);
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecType = videoCodecMimeType;
        this.surfaceColorFormat = num;
        this.yuvColorFormat = num2;
        this.yuvFormat = YuvFormat.valueOf(num2.intValue());
        this.params = map;
        this.keyFrameIntervalSec = i13;
        this.forcedKeyFrameNs = TimeUnit.MILLISECONDS.toNanos(i14);
        this.bitrateAdjuster = bitrateAdjuster;
        this.sharedContext = context;
        threadChecker.detachThread();
    }

    private boolean canUseSurface() {
        return (this.sharedContext == null || this.surfaceColorFormat == null) ? false : true;
    }

    private Thread createOutputThread() {
        return new Thread() { // from class: hms.webrtc.HardwareVideoEncoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (HardwareVideoEncoder.this.running) {
                    HardwareVideoEncoder.this.deliverEncodedImage();
                }
                HardwareVideoEncoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    private VideoCodecStatus encodeByteBuffer(VideoFrame videoFrame, long j7, VideoFrame.Buffer buffer, int i13) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            int iDequeueInputBuffer = this.codec.dequeueInputBuffer(0L);
            if (iDequeueInputBuffer == -1) {
                Logging.m49570d(TAG, "Dropped frame, no input buffers available");
                return VideoCodecStatus.NO_OUTPUT;
            }
            try {
                fillInputBuffer(this.codec.getInputBuffer(iDequeueInputBuffer), buffer);
                try {
                    this.codec.queueInputBuffer(iDequeueInputBuffer, 0, i13, j7, 0);
                    return VideoCodecStatus.OK;
                } catch (IllegalStateException e5) {
                    Logging.m49572e(TAG, "queueInputBuffer failed", e5);
                    return VideoCodecStatus.ERROR;
                }
            } catch (IllegalStateException e13) {
                Logging.m49572e(TAG, "getInputBuffer with index=" + iDequeueInputBuffer + " failed", e13);
                return VideoCodecStatus.ERROR;
            }
        } catch (IllegalStateException e14) {
            Logging.m49572e(TAG, "dequeueInputBuffer failed", e14);
            return VideoCodecStatus.ERROR;
        }
    }

    private VideoCodecStatus encodeTextureBuffer(VideoFrame videoFrame, long j7) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            GLES20.glClear(DfuBaseService.ERROR_CONNECTION_MASK);
            this.videoFrameDrawer.drawFrame(new VideoFrame(videoFrame.getBuffer(), 0, videoFrame.getTimestampNs()), this.textureDrawer, null);
            this.textureEglBase.swapBuffers(TimeUnit.MICROSECONDS.toNanos(j7));
            return VideoCodecStatus.OK;
        } catch (RuntimeException e5) {
            Logging.m49572e(TAG, "encodeTexture failed", e5);
            return VideoCodecStatus.ERROR;
        }
    }

    private static int getSliceHeight(MediaFormat mediaFormat, int i13) {
        return (mediaFormat == null || !mediaFormat.containsKey("slice-height")) ? i13 : mediaFormat.getInteger("slice-height");
    }

    private static int getStride(MediaFormat mediaFormat, int i13) {
        return (mediaFormat == null || !mediaFormat.containsKey("stride")) ? i13 : mediaFormat.getInteger("stride");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a1 A[Catch: IllegalStateException -> 0x0098, TryCatch #0 {IllegalStateException -> 0x0098, blocks: (B:9:0x002a, B:11:0x0063, B:15:0x0072, B:28:0x00a1, B:20:0x0081, B:22:0x0089, B:25:0x009a, B:29:0x00a8, B:31:0x00c2, B:32:0x00de), top: B:39:0x002a }] */
    private VideoCodecStatus initEncodeInternal() {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.nextPresentationTimestampUs = 0L;
        this.lastKeyFrameNs = -1L;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            int iIntValue = (this.useSurfaceMode ? this.surfaceColorFormat : this.yuvColorFormat).intValue();
            try {
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), this.width, this.height);
                mediaFormatCreateVideoFormat.setInteger("bitrate", this.adjustedBitrate);
                mediaFormatCreateVideoFormat.setInteger(KEY_BITRATE_MODE, 2);
                mediaFormatCreateVideoFormat.setInteger("color-format", iIntValue);
                mediaFormatCreateVideoFormat.setFloat("frame-rate", (float) this.bitrateAdjuster.getAdjustedFramerateFps());
                mediaFormatCreateVideoFormat.setInteger("i-frame-interval", this.keyFrameIntervalSec);
                if (this.codecType == VideoCodecMimeType.H264) {
                    String str = this.params.get("profile-level-id");
                    if (str == null) {
                        str = "42e01f";
                    }
                    int iHashCode = str.hashCode();
                    if (iHashCode != 1537948542) {
                        if (iHashCode == 1595523974 && str.equals("640c1f")) {
                            mediaFormatCreateVideoFormat.setInteger("profile", 8);
                            mediaFormatCreateVideoFormat.setInteger("level", 256);
                        } else {
                            Logging.m49574w(TAG, "Unknown profile level id: ".concat(str));
                        }
                    } else if (!str.equals("42e01f")) {
                        Logging.m49574w(TAG, "Unknown profile level id: ".concat(str));
                    }
                }
                Logging.m49570d(TAG, "Format: " + mediaFormatCreateVideoFormat);
                this.codec.configure(mediaFormatCreateVideoFormat, null, null, 1);
                if (this.useSurfaceMode) {
                    this.textureEglBase = EglBase.createEgl14(this.sharedContext, EglBase.CONFIG_RECORDABLE);
                    Surface surfaceCreateInputSurface = this.codec.createInputSurface();
                    this.textureInputSurface = surfaceCreateInputSurface;
                    this.textureEglBase.createSurface(surfaceCreateInputSurface);
                    this.textureEglBase.makeCurrent();
                }
                MediaFormat inputFormat = this.codec.getInputFormat();
                this.stride = getStride(inputFormat, this.width);
                this.sliceHeight = getSliceHeight(inputFormat, this.height);
                this.codec.start();
                this.running = true;
                this.outputThreadChecker.detachThread();
                Thread threadCreateOutputThread = createOutputThread();
                this.outputThread = threadCreateOutputThread;
                threadCreateOutputThread.start();
                return VideoCodecStatus.OK;
            } catch (IllegalStateException e5) {
                Logging.m49572e(TAG, "initEncodeInternal failed", e5);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (IOException | IllegalArgumentException unused) {
            Logging.m49571e(TAG, "Cannot create media encoder " + this.codecName);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deliverEncodedImage$0(int i13) {
        try {
            this.codec.releaseOutputBuffer(i13, false);
        } catch (Exception e5) {
            Logging.m49572e(TAG, "releaseOutputBuffer failed", e5);
        }
        this.outputBuffersBusyCount.decrement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.m49570d(TAG, "Releasing MediaCodec on output thread");
        this.outputBuffersBusyCount.waitForZero();
        try {
            this.codec.stop();
        } catch (Exception e5) {
            Logging.m49572e(TAG, "Media encoder stop failed", e5);
        }
        try {
            this.codec.release();
        } catch (Exception e13) {
            Logging.m49572e(TAG, "Media encoder release failed", e13);
            this.shutdownException = e13;
        }
        this.configBuffer = null;
        Logging.m49570d(TAG, "Release on output thread done");
    }

    private void requestKeyFrame(long j7) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.codec.setParameters(bundle);
            this.lastKeyFrameNs = j7;
        } catch (IllegalStateException e5) {
            Logging.m49572e(TAG, "requestKeyFrame failed", e5);
        }
    }

    private VideoCodecStatus resetCodec(int i13, int i14, boolean z4) {
        this.encodeThreadChecker.checkIsOnValidThread();
        VideoCodecStatus videoCodecStatusRelease = release();
        if (videoCodecStatusRelease != VideoCodecStatus.OK) {
            return videoCodecStatusRelease;
        }
        if (i13 % 16 != 0 || i14 % 16 != 0) {
            Logging.m49571e(TAG, "MediaCodec is only tested with resolutions that are 16x16 aligned.");
            return VideoCodecStatus.ERR_SIZE;
        }
        this.width = i13;
        this.height = i14;
        this.useSurfaceMode = z4;
        return initEncodeInternal();
    }

    private boolean shouldForceKeyFrame(long j7) {
        this.encodeThreadChecker.checkIsOnValidThread();
        long j13 = this.forcedKeyFrameNs;
        return j13 > 0 && j7 > this.lastKeyFrameNs + j13;
    }

    private VideoCodecStatus updateBitrate() {
        this.outputThreadChecker.checkIsOnValidThread();
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", this.adjustedBitrate);
            this.codec.setParameters(bundle);
            return VideoCodecStatus.OK;
        } catch (IllegalStateException e5) {
            Logging.m49572e(TAG, "updateBitrate failed", e5);
            return VideoCodecStatus.ERROR;
        }
    }

    public void deliverEncodedImage() {
        ByteBuffer byteBufferSlice;
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int iDequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (iDequeueOutputBuffer < 0) {
                if (iDequeueOutputBuffer == -3) {
                    this.outputBuffersBusyCount.waitForZero();
                    return;
                }
                return;
            }
            ByteBuffer outputBuffer = this.codec.getOutputBuffer(iDequeueOutputBuffer);
            if ((bufferInfo.flags & 2) != 0) {
                Logging.m49570d(TAG, "Config frame generated. Offset: " + bufferInfo.offset + ". Size: " + bufferInfo.size);
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                this.configBuffer = byteBufferAllocateDirect;
                byteBufferAllocateDirect.put(outputBuffer);
                return;
            }
            this.bitrateAdjuster.reportEncodedFrame(bufferInfo.size);
            if (this.adjustedBitrate != this.bitrateAdjuster.getAdjustedBitrateBps()) {
                updateBitrate();
            }
            boolean z4 = true;
            if ((bufferInfo.flags & 1) == 0) {
                z4 = false;
            }
            if (z4) {
                Logging.m49570d(TAG, "Sync frame generated");
            }
            if (z4 && this.codecType == VideoCodecMimeType.H264) {
                Logging.m49570d(TAG, "Prepending config frame of size " + this.configBuffer.capacity() + " to output buffer with offset " + bufferInfo.offset + ", size " + bufferInfo.size);
                byteBufferSlice = ByteBuffer.allocateDirect(bufferInfo.size + this.configBuffer.capacity());
                byteBufferSlice.put(this.configBuffer);
                byteBufferSlice.put(outputBuffer);
            } else {
                byteBufferSlice = outputBuffer.slice();
            }
            EncodedImage.FrameType frameType = z4 ? EncodedImage.FrameType.VideoFrameKey : EncodedImage.FrameType.VideoFrameDelta;
            this.outputBuffersBusyCount.increment();
            EncodedImage encodedImageCreateEncodedImage = this.outputBuilders.poll().setBuffer(byteBufferSlice, new RunnableC17483g(this, iDequeueOutputBuffer, 0)).setFrameType(frameType).createEncodedImage();
            this.callback.onEncodedFrame(encodedImageCreateEncodedImage, new VideoEncoder.CodecSpecificInfo());
            encodedImageCreateEncodedImage.release();
        } catch (IllegalStateException e5) {
            Logging.m49572e(TAG, "deliverOutput failed", e5);
        }
    }

    @Override // hms.webrtc.VideoEncoder
    public VideoCodecStatus encode(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
        VideoCodecStatus videoCodecStatusResetCodec;
        HardwareVideoEncoder hardwareVideoEncoder;
        VideoCodecStatus videoCodecStatusEncodeByteBuffer;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.codec == null) {
            return VideoCodecStatus.UNINITIALIZED;
        }
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        boolean z4 = buffer instanceof VideoFrame.TextureBuffer;
        int width = videoFrame.getBuffer().getWidth();
        int height = videoFrame.getBuffer().getHeight();
        boolean z13 = canUseSurface() && z4;
        if ((width != this.width || height != this.height || z13 != this.useSurfaceMode) && (videoCodecStatusResetCodec = resetCodec(width, height, z13)) != VideoCodecStatus.OK) {
            return videoCodecStatusResetCodec;
        }
        if (this.outputBuilders.size() > 2) {
            Logging.m49571e(TAG, "Dropped frame, encoder queue full");
            return VideoCodecStatus.NO_OUTPUT;
        }
        boolean z14 = false;
        for (EncodedImage.FrameType frameType : encodeInfo.frameTypes) {
            if (frameType == EncodedImage.FrameType.VideoFrameKey) {
                z14 = true;
            }
        }
        if (z14 || shouldForceKeyFrame(videoFrame.getTimestampNs())) {
            requestKeyFrame(videoFrame.getTimestampNs());
        }
        int width2 = ((buffer.getWidth() * buffer.getHeight()) * 3) / 2;
        this.outputBuilders.offer(EncodedImage.builder().setCaptureTimeNs(videoFrame.getTimestampNs()).setEncodedWidth(videoFrame.getBuffer().getWidth()).setEncodedHeight(videoFrame.getBuffer().getHeight()).setRotation(videoFrame.getRotation()));
        long j7 = this.nextPresentationTimestampUs;
        this.nextPresentationTimestampUs += (long) (TimeUnit.SECONDS.toMicros(1L) / this.bitrateAdjuster.getAdjustedFramerateFps());
        if (this.useSurfaceMode) {
            videoCodecStatusEncodeByteBuffer = encodeTextureBuffer(videoFrame, j7);
            hardwareVideoEncoder = this;
        } else {
            hardwareVideoEncoder = this;
            videoCodecStatusEncodeByteBuffer = hardwareVideoEncoder.encodeByteBuffer(videoFrame, j7, buffer, width2);
        }
        if (videoCodecStatusEncodeByteBuffer != VideoCodecStatus.OK) {
            hardwareVideoEncoder.outputBuilders.pollLast();
        }
        return videoCodecStatusEncodeByteBuffer;
    }

    public void fillInputBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
        this.yuvFormat.fillBuffer(byteBuffer, buffer, this.stride, this.sliceHeight);
    }

    @Override // hms.webrtc.VideoEncoder
    public VideoEncoder.EncoderInfo getEncoderInfo() {
        return new VideoEncoder.EncoderInfo(16, false);
    }

    @Override // hms.webrtc.VideoEncoder
    public String getImplementationName() {
        return this.codecName;
    }

    @Override // hms.webrtc.VideoEncoder
    public VideoEncoder.ScalingSettings getScalingSettings() {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.automaticResizeOn) {
            VideoCodecMimeType videoCodecMimeType = this.codecType;
            if (videoCodecMimeType == VideoCodecMimeType.VP8) {
                return new VideoEncoder.ScalingSettings(29, 95);
            }
            if (videoCodecMimeType == VideoCodecMimeType.H264) {
                return new VideoEncoder.ScalingSettings(24, 37);
            }
        }
        return VideoEncoder.ScalingSettings.OFF;
    }

    @Override // hms.webrtc.VideoEncoder
    public VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        int i13;
        this.encodeThreadChecker.checkIsOnValidThread();
        this.callback = callback;
        this.automaticResizeOn = settings.automaticResizeOn;
        int i14 = settings.width;
        if (i14 % 16 == 0) {
            int i15 = settings.height;
            if (i15 % 16 == 0) {
                this.width = i14;
                this.height = i15;
                this.useSurfaceMode = canUseSurface();
                int i16 = settings.startBitrate;
                if (i16 != 0 && (i13 = settings.maxFramerate) != 0) {
                    this.bitrateAdjuster.setTargets(i16 * 1000, i13);
                }
                this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
                int i17 = this.width;
                int i18 = this.height;
                int i19 = settings.startBitrate;
                int i24 = settings.maxFramerate;
                boolean z4 = this.useSurfaceMode;
                StringBuilder sbM30465s = AbstractC11266d.m30465s(i17, i18, "initEncode: ", " x ", ". @ ");
                AbstractC30802r.m94773v(sbM30465s, i19, "kbps. Fps: ", i24, " Use surface mode: ");
                sbM30465s.append(z4);
                Logging.m49570d(TAG, sbM30465s.toString());
                return initEncodeInternal();
            }
        }
        Logging.m49571e(TAG, "MediaCodec is only tested with resolutions that are 16x16 aligned.");
        return VideoCodecStatus.ERR_SIZE;
    }

    @Override // hms.webrtc.VideoEncoder
    public VideoCodecStatus release() {
        VideoCodecStatus videoCodecStatus;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.outputThread == null) {
            videoCodecStatus = VideoCodecStatus.OK;
        } else {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, 5000L)) {
                Logging.m49571e(TAG, "Media encoder release timeout");
                videoCodecStatus = VideoCodecStatus.TIMEOUT;
            } else if (this.shutdownException != null) {
                Logging.m49572e(TAG, "Media encoder release exception", this.shutdownException);
                videoCodecStatus = VideoCodecStatus.ERROR;
            } else {
                videoCodecStatus = VideoCodecStatus.OK;
            }
        }
        this.textureDrawer.release();
        this.videoFrameDrawer.release();
        EglBase14 eglBase14 = this.textureEglBase;
        if (eglBase14 != null) {
            eglBase14.release();
            this.textureEglBase = null;
        }
        Surface surface = this.textureInputSurface;
        if (surface != null) {
            surface.release();
            this.textureInputSurface = null;
        }
        this.outputBuilders.clear();
        this.codec = null;
        this.outputThread = null;
        this.encodeThreadChecker.detachThread();
        return videoCodecStatus;
    }

    @Override // hms.webrtc.VideoEncoder
    public VideoCodecStatus setRateAllocation(VideoEncoder.BitrateAllocation bitrateAllocation, int i13) {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (i13 > 30) {
            i13 = 30;
        }
        this.bitrateAdjuster.setTargets(bitrateAllocation.getSum(), i13);
        return VideoCodecStatus.OK;
    }

    @Override // hms.webrtc.VideoEncoder
    public VideoCodecStatus setRates(VideoEncoder.RateControlParameters rateControlParameters) {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.bitrateAdjuster.setTargets(rateControlParameters.bitrate.getSum(), rateControlParameters.framerateFps);
        return VideoCodecStatus.OK;
    }
}
