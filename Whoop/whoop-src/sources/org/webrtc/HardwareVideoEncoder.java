package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
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
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;

/* JADX INFO: loaded from: classes3.dex */
class HardwareVideoEncoder implements VideoEncoder {
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final int MAX_ENCODER_Q_SIZE = 2;
    private static final int MAX_VIDEO_FRAMERATE = 30;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final int REQUIRED_RESOLUTION_ALIGNMENT = 2;
    private static final String TAG = "HardwareVideoEncoder";
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
    private int frameSizeBytes;
    private int height;
    private boolean isEncodingStatisticsEnabled;
    private boolean isSemiPlanar;
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
                        Logging.m85623e(HardwareVideoEncoder.TAG, "Interrupted while waiting on busy count", e5);
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
        return new Thread() { // from class: org.webrtc.HardwareVideoEncoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (HardwareVideoEncoder.this.running) {
                    HardwareVideoEncoder.this.deliverEncodedImage();
                }
                HardwareVideoEncoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    private VideoCodecStatus encodeByteBuffer(VideoFrame videoFrame, long j7) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            int iDequeueInputBuffer = this.codec.dequeueInputBuffer(0L);
            if (iDequeueInputBuffer == -1) {
                Logging.m85621d(TAG, "Dropped frame, no input buffers available");
                return VideoCodecStatus.NO_OUTPUT;
            }
            try {
                ByteBuffer inputBuffer = this.codec.getInputBuffer(iDequeueInputBuffer);
                if (inputBuffer.capacity() >= this.frameSizeBytes) {
                    fillInputBuffer(inputBuffer, videoFrame.getBuffer());
                    try {
                        this.codec.queueInputBuffer(iDequeueInputBuffer, 0, this.frameSizeBytes, j7, 0);
                        return VideoCodecStatus.OK;
                    } catch (IllegalStateException e5) {
                        Logging.m85623e(TAG, "queueInputBuffer failed", e5);
                        return VideoCodecStatus.ERROR;
                    }
                }
                Logging.m85622e(TAG, "Input buffer size: " + inputBuffer.capacity() + " is smaller than frame size: " + this.frameSizeBytes);
                return VideoCodecStatus.ERROR;
            } catch (IllegalStateException e13) {
                Logging.m85623e(TAG, "getInputBuffer with index=" + iDequeueInputBuffer + " failed", e13);
                return VideoCodecStatus.ERROR;
            }
        } catch (IllegalStateException e14) {
            Logging.m85623e(TAG, "dequeueInputBuffer failed", e14);
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
            Logging.m85623e(TAG, "encodeTexture failed", e5);
            return VideoCodecStatus.ERROR;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a8 A[Catch: IllegalStateException -> 0x009b, IllegalArgumentException -> 0x009e, TryCatch #5 {IllegalArgumentException -> 0x009e, IllegalStateException -> 0x009b, blocks: (B:9:0x002d, B:11:0x0066, B:15:0x0075, B:30:0x00a8, B:20:0x0084, B:22:0x008c, B:27:0x00a1, B:31:0x00af, B:33:0x00ba, B:34:0x00bf, B:36:0x00c5, B:37:0x00cc, B:39:0x00e1, B:40:0x00fd), top: B:52:0x002d }] */
    private VideoCodecStatus initEncodeInternal() {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.nextPresentationTimestampUs = 0L;
        this.lastKeyFrameNs = -1L;
        this.isEncodingStatisticsEnabled = false;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            int iIntValue = (this.useSurfaceMode ? this.surfaceColorFormat : this.yuvColorFormat).intValue();
            try {
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), this.width, this.height);
                mediaFormatCreateVideoFormat.setInteger("bitrate", this.adjustedBitrate);
                mediaFormatCreateVideoFormat.setInteger("bitrate-mode", 2);
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
                            Logging.m85625w(TAG, "Unknown profile level id: ".concat(str));
                        }
                    } else if (!str.equals("42e01f")) {
                        Logging.m85625w(TAG, "Unknown profile level id: ".concat(str));
                    }
                }
                if (this.codecName.equals("c2.google.av1.encoder")) {
                    mediaFormatCreateVideoFormat.setInteger("vendor.google-av1enc.encoding-preset.int32.value", 1);
                }
                if (isEncodingStatisticsSupported()) {
                    mediaFormatCreateVideoFormat.setInteger("video-encoding-statistics-level", 1);
                    this.isEncodingStatisticsEnabled = true;
                }
                Logging.m85621d(TAG, "Format: ".concat(String.valueOf(mediaFormatCreateVideoFormat)));
                this.codec.configure(mediaFormatCreateVideoFormat, null, null, 1);
                if (this.useSurfaceMode) {
                    this.textureEglBase = EglBase.createEgl14(this.sharedContext, EglBase.CONFIG_RECORDABLE);
                    Surface surfaceCreateInputSurface = this.codec.createInputSurface();
                    this.textureInputSurface = surfaceCreateInputSurface;
                    this.textureEglBase.createSurface(surfaceCreateInputSurface);
                    this.textureEglBase.makeCurrent();
                }
                updateInputFormat(this.codec.getInputFormat());
                this.codec.start();
                this.running = true;
                this.outputThreadChecker.detachThread();
                Thread threadCreateOutputThread = createOutputThread();
                this.outputThread = threadCreateOutputThread;
                threadCreateOutputThread.start();
                return VideoCodecStatus.OK;
            } catch (IllegalArgumentException e5) {
                e = e5;
                Logging.m85623e(TAG, "initEncodeInternal failed", e);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            } catch (IllegalStateException e13) {
                e = e13;
                Logging.m85623e(TAG, "initEncodeInternal failed", e);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (IOException | IllegalArgumentException | IllegalStateException e14) {
            Logging.m85623e(TAG, "Cannot create media encoder " + this.codecName, e14);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deliverEncodedImage$0(int i13) {
        try {
            this.codec.releaseOutputBuffer(i13, false);
        } catch (Exception e5) {
            Logging.m85623e(TAG, "releaseOutputBuffer failed", e5);
        }
        this.outputBuffersBusyCount.decrement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.m85621d(TAG, "Releasing MediaCodec on output thread");
        this.outputBuffersBusyCount.waitForZero();
        try {
            this.codec.stop();
        } catch (Exception e5) {
            Logging.m85623e(TAG, "Media encoder stop failed", e5);
        }
        try {
            this.codec.release();
        } catch (Exception e13) {
            Logging.m85623e(TAG, "Media encoder release failed", e13);
            this.shutdownException = e13;
        }
        this.configBuffer = null;
        Logging.m85621d(TAG, "Release on output thread done");
    }

    private void requestKeyFrame(long j7) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.codec.setParameters(bundle);
            this.lastKeyFrameNs = j7;
        } catch (IllegalStateException e5) {
            Logging.m85623e(TAG, "requestKeyFrame failed", e5);
        }
    }

    private VideoCodecStatus resetCodec(int i13, int i14, boolean z4) {
        this.encodeThreadChecker.checkIsOnValidThread();
        VideoCodecStatus videoCodecStatusRelease = release();
        if (videoCodecStatusRelease != VideoCodecStatus.OK) {
            return videoCodecStatusRelease;
        }
        if (i13 % 2 != 0 || i14 % 2 != 0) {
            Logging.m85622e(TAG, "MediaCodec requires 2x2 alignment.");
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
            Logging.m85623e(TAG, "updateBitrate failed", e5);
            return VideoCodecStatus.ERROR;
        }
    }

    private void updateInputFormat(MediaFormat mediaFormat) {
        this.stride = this.width;
        this.sliceHeight = this.height;
        if (mediaFormat != null) {
            if (mediaFormat.containsKey("stride")) {
                int integer = mediaFormat.getInteger("stride");
                this.stride = integer;
                this.stride = Math.max(integer, this.width);
            }
            if (mediaFormat.containsKey("slice-height")) {
                int integer2 = mediaFormat.getInteger("slice-height");
                this.sliceHeight = integer2;
                this.sliceHeight = Math.max(integer2, this.height);
            }
        }
        boolean zIsSemiPlanar = isSemiPlanar(this.yuvColorFormat.intValue());
        this.isSemiPlanar = zIsSemiPlanar;
        if (zIsSemiPlanar) {
            int i13 = (this.height + 1) / 2;
            int i14 = this.sliceHeight;
            int i15 = this.stride;
            this.frameSizeBytes = (i13 * i15) + (i14 * i15);
        } else {
            int i16 = this.stride;
            int i17 = this.sliceHeight;
            this.frameSizeBytes = (((i17 + 1) / 2) * ((i16 + 1) / 2) * 2) + (i17 * i16);
        }
        String strValueOf = String.valueOf(mediaFormat);
        int i18 = this.stride;
        int i19 = this.sliceHeight;
        boolean z4 = this.isSemiPlanar;
        int i24 = this.frameSizeBytes;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i18, "updateInputFormat format: ", strValueOf, " stride: ", " sliceHeight: ");
        AbstractC13673n.m38573t(i19, " isSemiPlanar: ", " frameSizeBytes: ", sbM30467u, z4);
        sbM30467u.append(i24);
        Logging.m85621d(TAG, sbM30467u.toString());
    }

    public void deliverEncodedImage() {
        ByteBuffer byteBufferSlice;
        ByteBuffer byteBuffer;
        MediaFormat outputFormat;
        VideoCodecMimeType videoCodecMimeType;
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
                Logging.m85621d(TAG, "Config frame generated. Offset: " + bufferInfo.offset + ". Size: " + bufferInfo.size);
                int i13 = bufferInfo.size;
                if (i13 > 0 && ((videoCodecMimeType = this.codecType) == VideoCodecMimeType.H264 || videoCodecMimeType == VideoCodecMimeType.H265)) {
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i13);
                    this.configBuffer = byteBufferAllocateDirect;
                    byteBufferAllocateDirect.put(outputBuffer);
                }
                this.codec.releaseOutputBuffer(iDequeueOutputBuffer, false);
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
                Logging.m85621d(TAG, "Sync frame generated");
            }
            RunnableC28286h runnableC28286h = null;
            Integer numValueOf = (this.isEncodingStatisticsEnabled && (outputFormat = this.codec.getOutputFormat(iDequeueOutputBuffer)) != null && outputFormat.containsKey("video-qp-average")) ? Integer.valueOf(outputFormat.getInteger("video-qp-average")) : null;
            if (!z4 || (byteBuffer = this.configBuffer) == null) {
                byteBufferSlice = outputBuffer.slice();
                this.outputBuffersBusyCount.increment();
                runnableC28286h = new RunnableC28286h(this, iDequeueOutputBuffer, 0);
            } else {
                Logging.m85621d(TAG, "Prepending config buffer of size " + byteBuffer.capacity() + " to output buffer with offset " + bufferInfo.offset + ", size " + bufferInfo.size);
                byteBufferSlice = ByteBuffer.allocateDirect(bufferInfo.size + this.configBuffer.capacity());
                byteBufferSlice.put(this.configBuffer);
                byteBufferSlice.put(outputBuffer);
                this.codec.releaseOutputBuffer(iDequeueOutputBuffer, false);
            }
            EncodedImage.FrameType frameType = z4 ? EncodedImage.FrameType.VideoFrameKey : EncodedImage.FrameType.VideoFrameDelta;
            EncodedImage.Builder builderPoll = this.outputBuilders.poll();
            builderPoll.setBuffer(byteBufferSlice, runnableC28286h);
            builderPoll.setFrameType(frameType);
            builderPoll.setQp(numValueOf);
            EncodedImage encodedImageCreateEncodedImage = builderPoll.createEncodedImage();
            this.callback.onEncodedFrame(encodedImageCreateEncodedImage, new VideoEncoder.CodecSpecificInfo());
            encodedImageCreateEncodedImage.release();
        } catch (IllegalStateException e5) {
            Logging.m85623e(TAG, "deliverOutput failed", e5);
        }
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus encode(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
        VideoCodecStatus videoCodecStatusResetCodec;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.codec == null) {
            return VideoCodecStatus.UNINITIALIZED;
        }
        boolean z4 = videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer;
        int width = videoFrame.getBuffer().getWidth();
        int height = videoFrame.getBuffer().getHeight();
        boolean z13 = canUseSurface() && z4;
        if ((width != this.width || height != this.height || z13 != this.useSurfaceMode) && (videoCodecStatusResetCodec = resetCodec(width, height, z13)) != VideoCodecStatus.OK) {
            return videoCodecStatusResetCodec;
        }
        if (this.outputBuilders.size() > 2) {
            Logging.m85622e(TAG, "Dropped frame, encoder queue full");
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
        this.outputBuilders.offer(EncodedImage.builder().setCaptureTimeNs(videoFrame.getTimestampNs()).setEncodedWidth(videoFrame.getBuffer().getWidth()).setEncodedHeight(videoFrame.getBuffer().getHeight()).setRotation(videoFrame.getRotation()));
        long j7 = this.nextPresentationTimestampUs;
        this.nextPresentationTimestampUs += (long) (TimeUnit.SECONDS.toMicros(1L) / this.bitrateAdjuster.getAdjustedFramerateFps());
        VideoCodecStatus videoCodecStatusEncodeTextureBuffer = this.useSurfaceMode ? encodeTextureBuffer(videoFrame, j7) : encodeByteBuffer(videoFrame, j7);
        if (videoCodecStatusEncodeTextureBuffer != VideoCodecStatus.OK) {
            this.outputBuilders.pollLast();
        }
        return videoCodecStatusEncodeTextureBuffer;
    }

    public void fillInputBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
        VideoFrame.I420Buffer i420 = buffer.toI420();
        if (this.isSemiPlanar) {
            YuvHelper.I420ToNV12(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight(), this.stride, this.sliceHeight);
        } else {
            YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight(), this.stride, this.sliceHeight);
        }
        i420.release();
    }

    @Override // org.webrtc.VideoEncoder
    public VideoEncoder.EncoderInfo getEncoderInfo() {
        return new VideoEncoder.EncoderInfo(2, false);
    }

    @Override // org.webrtc.VideoEncoder
    public String getImplementationName() {
        return this.codecName;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoEncoder.ScalingSettings getScalingSettings() {
        if (this.automaticResizeOn) {
            VideoCodecMimeType videoCodecMimeType = this.codecType;
            if (videoCodecMimeType == VideoCodecMimeType.VP8) {
                return new VideoEncoder.ScalingSettings(29, 95);
            }
            if (videoCodecMimeType == VideoCodecMimeType.H264) {
                return new VideoEncoder.ScalingSettings(24, 37);
            }
            if (videoCodecMimeType == VideoCodecMimeType.H265) {
                return new VideoEncoder.ScalingSettings(24, 37);
            }
        }
        return VideoEncoder.ScalingSettings.OFF;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        int i13;
        this.encodeThreadChecker.checkIsOnValidThread();
        this.callback = callback;
        this.automaticResizeOn = settings.automaticResizeOn;
        int i14 = settings.width;
        if (i14 % 2 == 0) {
            int i15 = settings.height;
            if (i15 % 2 == 0) {
                this.width = i14;
                this.height = i15;
                this.useSurfaceMode = canUseSurface();
                int i16 = settings.startBitrate;
                if (i16 != 0 && (i13 = settings.maxFramerate) != 0) {
                    this.bitrateAdjuster.setTargets(i16 * 1000, i13);
                }
                this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
                String str = this.codecName;
                String strValueOf = String.valueOf(this.codecType);
                int i17 = this.width;
                int i18 = this.height;
                int i19 = settings.maxFramerate;
                int i24 = settings.startBitrate;
                boolean z4 = this.useSurfaceMode;
                StringBuilder sbM32001t = AbstractC11895b.m32001t("initEncode name: ", str, " type: ", strValueOf, " width: ");
                AbstractC30802r.m94773v(sbM32001t, i17, " height: ", i18, " framerate_fps: ");
                AbstractC30802r.m94773v(sbM32001t, i19, " bitrate_kbps: ", i24, " surface mode: ");
                sbM32001t.append(z4);
                Logging.m85621d(TAG, sbM32001t.toString());
                return initEncodeInternal();
            }
        }
        Logging.m85622e(TAG, "MediaCodec requires 2x2 alignment.");
        return VideoCodecStatus.ERR_SIZE;
    }

    public boolean isEncodingStatisticsSupported() {
        MediaCodecInfo codecInfo;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        VideoCodecMimeType videoCodecMimeType = this.codecType;
        if (videoCodecMimeType == VideoCodecMimeType.VP8 || videoCodecMimeType == VideoCodecMimeType.VP9 || (codecInfo = this.codec.getCodecInfo()) == null || (capabilitiesForType = codecInfo.getCapabilitiesForType(this.codecType.mimeType())) == null) {
            return false;
        }
        return capabilitiesForType.isFeatureSupported("encoding-statistics");
    }

    public boolean isSemiPlanar(int i13) {
        if (i13 == 19) {
            return false;
        }
        if (i13 == 21 || i13 == 2141391872 || i13 == 2141391876) {
            return true;
        }
        throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Unsupported colorFormat: "));
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus release() {
        VideoCodecStatus videoCodecStatus;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.outputThread == null) {
            videoCodecStatus = VideoCodecStatus.OK;
        } else {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, 5000L)) {
                Logging.m85622e(TAG, "Media encoder release timeout");
                videoCodecStatus = VideoCodecStatus.TIMEOUT;
            } else if (this.shutdownException != null) {
                Logging.m85623e(TAG, "Media encoder release exception", this.shutdownException);
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

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus setRateAllocation(VideoEncoder.BitrateAllocation bitrateAllocation, int i13) {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (i13 > 30) {
            i13 = 30;
        }
        this.bitrateAdjuster.setTargets(bitrateAllocation.getSum(), i13);
        return VideoCodecStatus.OK;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus setRates(VideoEncoder.RateControlParameters rateControlParameters) {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.bitrateAdjuster.setTargets(rateControlParameters.bitrate.getSum(), rateControlParameters.framerateFps);
        return VideoCodecStatus.OK;
    }
}
