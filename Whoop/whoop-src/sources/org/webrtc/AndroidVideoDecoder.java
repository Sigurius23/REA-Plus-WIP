package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;

/* JADX INFO: loaded from: classes3.dex */
class AndroidVideoDecoder implements VideoDecoder, VideoSink {
    private static final int DEQUEUE_INPUT_TIMEOUT_US = 500000;
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final String TAG = "AndroidVideoDecoder";
    private VideoDecoder.Callback callback;
    private MediaCodecWrapper codec;
    private final String codecName;
    private final VideoCodecMimeType codecType;
    private int colorFormat;
    private ThreadUtils.ThreadChecker decoderThreadChecker;
    private final BlockingDeque<FrameInfo> frameInfos;
    private boolean hasDecodedFirstFrame;
    private int height;
    private boolean keyFrameRequired;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private Thread outputThread;
    private ThreadUtils.ThreadChecker outputThreadChecker;
    private DecodedTextureMetadata renderedTextureMetadata;
    private volatile boolean running;
    private final EglBase.Context sharedContext;
    private volatile Exception shutdownException;
    private int sliceHeight;
    private int stride;
    private Surface surface;
    private SurfaceTextureHelper surfaceTextureHelper;
    private int width;
    private final Object dimensionLock = new Object();
    private final Object renderedTextureMetadataLock = new Object();

    public static class DecodedTextureMetadata {
        final Integer decodeTimeMs;
        final long presentationTimestampUs;

        public DecodedTextureMetadata(long j7, Integer num) {
            this.presentationTimestampUs = j7;
            this.decodeTimeMs = num;
        }
    }

    public static class FrameInfo {
        final long decodeStartTimeMs;
        final int rotation;

        public FrameInfo(long j7, int i13) {
            this.decodeStartTimeMs = j7;
            this.rotation = i13;
        }
    }

    public AndroidVideoDecoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecMimeType videoCodecMimeType, int i13, EglBase.Context context) {
        if (!isSupportedColorFormat(i13)) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Unsupported color format: "));
        }
        String strValueOf = String.valueOf(videoCodecMimeType);
        String strValueOf2 = String.valueOf(context);
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ctor name: ", str, " type: ", strValueOf, " color format: ");
        sbM32001t.append(i13);
        sbM32001t.append(" context: ");
        sbM32001t.append(strValueOf2);
        Logging.m85621d(TAG, sbM32001t.toString());
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecType = videoCodecMimeType;
        this.colorFormat = i13;
        this.sharedContext = context;
        this.frameInfos = new LinkedBlockingDeque();
    }

    private VideoFrame.Buffer copyI420Buffer(ByteBuffer byteBuffer, int i13, int i14, int i15, int i16) {
        if (i13 % 2 != 0) {
            throw new AssertionError(AbstractC2875y.m8295h(i13, "Stride is not divisible by two: "));
        }
        int i17 = (i15 + 1) / 2;
        int i18 = i14 % 2;
        int i19 = i18 == 0 ? (i16 + 1) / 2 : i16 / 2;
        int i24 = i13 / 2;
        int i25 = i13 * i14;
        int i26 = i24 * i19;
        int iM30446D = AbstractC11266d.m30446D(i24, i14, 2, i25);
        int i27 = iM30446D + i26;
        VideoFrame.I420Buffer i420BufferAllocateI420Buffer = allocateI420Buffer(i15, i16);
        copyPlane(byteBuffer.slice(), i13, i420BufferAllocateI420Buffer.getDataY(), i420BufferAllocateI420Buffer.getStrideY(), i15, i16);
        copyPlane(byteBuffer.slice(), i24, i420BufferAllocateI420Buffer.getDataU(), i420BufferAllocateI420Buffer.getStrideU(), i17, i19);
        if (i18 == 1) {
            ByteBuffer dataU = i420BufferAllocateI420Buffer.getDataU();
            dataU.put(byteBuffer);
        }
        copyPlane(byteBuffer.slice(), i24, i420BufferAllocateI420Buffer.getDataV(), i420BufferAllocateI420Buffer.getStrideV(), i17, i19);
        if (i18 == 1) {
            ByteBuffer dataV = i420BufferAllocateI420Buffer.getDataV();
            dataV.put(byteBuffer);
        }
        return i420BufferAllocateI420Buffer;
    }

    private VideoFrame.Buffer copyNV12ToI420Buffer(ByteBuffer byteBuffer, int i13, int i14, int i15, int i16) {
        return new NV12Buffer(i15, i16, i13, i14, byteBuffer, null).toI420();
    }

    private Thread createOutputThread() {
        return new Thread("AndroidVideoDecoder.outputThread") { // from class: org.webrtc.AndroidVideoDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws Throwable {
                AndroidVideoDecoder.this.outputThreadChecker = new ThreadUtils.ThreadChecker();
                while (AndroidVideoDecoder.this.running) {
                    AndroidVideoDecoder.this.deliverDecodedFrame();
                }
                AndroidVideoDecoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x008a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void deliverByteFrame(int r9, android.media.MediaCodec.BufferInfo r10, int r11, java.lang.Integer r12) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r1 = r8.dimensionLock
            monitor-enter(r1)
            int r6 = r8.width     // Catch: java.lang.Throwable -> L85
            int r7 = r8.height     // Catch: java.lang.Throwable -> L85
            int r0 = r8.stride     // Catch: java.lang.Throwable -> L85
            int r5 = r8.sliceHeight     // Catch: java.lang.Throwable -> L85
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L85
            int r1 = r10.size
            int r2 = r6 * r7
            int r2 = r2 * 3
            int r2 = r2 / 2
            if (r1 >= r2) goto L2a
            java.lang.String r9 = "AndroidVideoDecoder"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Insufficient output buffer size: "
            r10.<init>(r11)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            org.webrtc.Logging.m85622e(r9, r10)
            return
        L2a:
            int r2 = r0 * r7
            int r2 = r2 * 3
            int r2 = r2 / 2
            if (r1 >= r2) goto L3c
            if (r5 != r7) goto L3c
            if (r0 <= r6) goto L3c
            int r1 = r1 * 2
            int r0 = r7 * 3
            int r0 = r1 / r0
        L3c:
            r4 = r0
            org.webrtc.MediaCodecWrapper r0 = r8.codec
            java.nio.ByteBuffer r0 = r0.getOutputBuffer(r9)
            int r1 = r10.offset
            java.nio.Buffer r1 = r0.position(r1)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r10.offset
            int r2 = r10.size
            int r1 = r1 + r2
            java.nio.Buffer r1 = r0.limit(r1)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            java.nio.ByteBuffer r3 = r0.slice()
            int r0 = r8.colorFormat
            r1 = 19
            if (r0 != r1) goto L66
            r2 = r8
            org.webrtc.VideoFrame$Buffer r0 = r2.copyI420Buffer(r3, r4, r5, r6, r7)
            goto L6b
        L66:
            r2 = r8
            org.webrtc.VideoFrame$Buffer r0 = r2.copyNV12ToI420Buffer(r3, r4, r5, r6, r7)
        L6b:
            org.webrtc.MediaCodecWrapper r1 = r2.codec
            r3 = 0
            r1.releaseOutputBuffer(r9, r3)
            long r9 = r10.presentationTimeUs
            r3 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r3
            org.webrtc.VideoFrame r1 = new org.webrtc.VideoFrame
            r1.<init>(r0, r11, r9)
            org.webrtc.VideoDecoder$Callback r9 = r2.callback
            r10 = 0
            r9.onDecodedFrame(r1, r12, r10)
            r1.release()
            return
        L85:
            r0 = move-exception
            r2 = r8
        L87:
            r9 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8a
            throw r9
        L8a:
            r0 = move-exception
            goto L87
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.AndroidVideoDecoder.deliverByteFrame(int, android.media.MediaCodec$BufferInfo, int, java.lang.Integer):void");
    }

    private void deliverTextureFrame(int i13, MediaCodec.BufferInfo bufferInfo, int i14, Integer num) {
        int i15;
        int i16;
        synchronized (this.dimensionLock) {
            i15 = this.width;
            i16 = this.height;
        }
        synchronized (this.renderedTextureMetadataLock) {
            try {
                if (this.renderedTextureMetadata != null) {
                    this.codec.releaseOutputBuffer(i13, false);
                    return;
                }
                this.surfaceTextureHelper.setTextureSize(i15, i16);
                this.surfaceTextureHelper.setFrameRotation(i14);
                this.renderedTextureMetadata = new DecodedTextureMetadata(bufferInfo.presentationTimeUs, num);
                this.codec.releaseOutputBuffer(i13, true);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private VideoCodecStatus initDecodeInternal(int i13, int i14) {
        this.decoderThreadChecker.checkIsOnValidThread();
        String str = this.codecName;
        String strValueOf = String.valueOf(this.codecType);
        int i15 = this.colorFormat;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("initDecodeInternal name: ", str, " type: ", strValueOf, " width: ");
        AbstractC30802r.m94773v(sbM32001t, i13, " height: ", i14, " color format: ");
        sbM32001t.append(i15);
        Logging.m85621d(TAG, sbM32001t.toString());
        if (this.outputThread != null) {
            Logging.m85622e(TAG, "initDecodeInternal called while the codec is already running");
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        this.width = i13;
        this.height = i14;
        this.stride = i13;
        this.sliceHeight = i14;
        this.hasDecodedFirstFrame = false;
        this.keyFrameRequired = true;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            try {
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), i13, i14);
                if (this.sharedContext == null) {
                    mediaFormatCreateVideoFormat.setInteger("color-format", this.colorFormat);
                }
                this.codec.configure(mediaFormatCreateVideoFormat, this.surface, null, 0);
                this.codec.start();
                this.running = true;
                Thread threadCreateOutputThread = createOutputThread();
                this.outputThread = threadCreateOutputThread;
                threadCreateOutputThread.start();
                Logging.m85621d(TAG, "initDecodeInternal done");
                return VideoCodecStatus.OK;
            } catch (IllegalArgumentException e5) {
                e = e5;
                Logging.m85623e(TAG, "initDecode failed", e);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            } catch (IllegalStateException e13) {
                e = e13;
                Logging.m85623e(TAG, "initDecode failed", e);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (IOException | IllegalArgumentException | IllegalStateException unused) {
            Logging.m85622e(TAG, "Cannot create media decoder " + this.codecName);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private boolean isSupportedColorFormat(int i13) {
        for (int i14 : MediaCodecUtils.DECODER_COLOR_FORMATS) {
            if (i14 == i13) {
                return true;
            }
        }
        return false;
    }

    private void reformat(MediaFormat mediaFormat) {
        int integer;
        int integer2;
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.m85621d(TAG, "Decoder format changed: ".concat(String.valueOf(mediaFormat)));
        if (mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            integer = (mediaFormat.getInteger("crop-right") + 1) - mediaFormat.getInteger("crop-left");
            integer2 = (mediaFormat.getInteger("crop-bottom") + 1) - mediaFormat.getInteger("crop-top");
        } else {
            integer = mediaFormat.getInteger("width");
            integer2 = mediaFormat.getInteger("height");
        }
        synchronized (this.dimensionLock) {
            try {
                int i13 = this.width;
                if (integer != i13 || integer2 != this.height) {
                    if (this.hasDecodedFirstFrame) {
                        stopOnOutputThread(new RuntimeException("Unexpected size change. Configured " + this.width + "*" + this.height + ". New " + integer + "*" + integer2));
                        return;
                    }
                    if (integer > 0 && integer2 > 0) {
                        this.width = integer;
                        this.height = integer2;
                    }
                    Logging.m85625w(TAG, "Unexpected format dimensions. Configured " + i13 + "*" + this.height + ". New " + integer + "*" + integer2 + ". Skip it");
                    return;
                }
                if (this.surfaceTextureHelper == null && mediaFormat.containsKey("color-format")) {
                    int integer3 = mediaFormat.getInteger("color-format");
                    this.colorFormat = integer3;
                    Logging.m85621d(TAG, "Color: 0x" + Integer.toHexString(integer3));
                    if (!isSupportedColorFormat(this.colorFormat)) {
                        stopOnOutputThread(new IllegalStateException(AbstractC2875y.m8295h(this.colorFormat, "Unsupported color format: ")));
                        return;
                    }
                }
                synchronized (this.dimensionLock) {
                    try {
                        if (mediaFormat.containsKey("stride")) {
                            this.stride = mediaFormat.getInteger("stride");
                        }
                        if (mediaFormat.containsKey("slice-height")) {
                            this.sliceHeight = mediaFormat.getInteger("slice-height");
                        }
                        Logging.m85621d(TAG, "Frame stride and slice height: " + this.stride + " x " + this.sliceHeight);
                        this.stride = Math.max(this.width, this.stride);
                        this.sliceHeight = Math.max(this.height, this.sliceHeight);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private VideoCodecStatus reinitDecode(int i13, int i14) {
        this.decoderThreadChecker.checkIsOnValidThread();
        VideoCodecStatus videoCodecStatusReleaseInternal = releaseInternal();
        return videoCodecStatusReleaseInternal != VideoCodecStatus.OK ? videoCodecStatusReleaseInternal : initDecodeInternal(i13, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.m85621d(TAG, "Releasing MediaCodec on output thread");
        try {
            this.codec.stop();
        } catch (Exception e5) {
            Logging.m85623e(TAG, "Media decoder stop failed", e5);
        }
        try {
            this.codec.release();
        } catch (Exception e13) {
            Logging.m85623e(TAG, "Media decoder release failed", e13);
            this.shutdownException = e13;
        }
        Logging.m85621d(TAG, "Release on output thread done");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private VideoCodecStatus releaseInternal() {
        if (!this.running) {
            Logging.m85621d(TAG, "release: Decoder is not running.");
            return VideoCodecStatus.OK;
        }
        try {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, 5000L)) {
                Logging.m85623e(TAG, "Media decoder release timeout", new RuntimeException());
                return VideoCodecStatus.TIMEOUT;
            }
            if (this.shutdownException == null) {
                Object[] objArr = objArr == true ? 1 : 0;
                return VideoCodecStatus.OK;
            }
            Logging.m85623e(TAG, "Media decoder release error", new RuntimeException(this.shutdownException));
            this.shutdownException = null;
            return VideoCodecStatus.ERROR;
        } finally {
            this.codec = null;
            this.outputThread = null;
            this.frameInfos.clear();
        }
    }

    private void stopOnOutputThread(Exception exc) {
        this.outputThreadChecker.checkIsOnValidThread();
        this.running = false;
        this.shutdownException = exc;
    }

    public VideoFrame.I420Buffer allocateI420Buffer(int i13, int i14) {
        return JavaI420Buffer.allocate(i13, i14);
    }

    public void copyPlane(ByteBuffer byteBuffer, int i13, ByteBuffer byteBuffer2, int i14, int i15, int i16) {
        YuvHelper.copyPlane(byteBuffer, i13, byteBuffer2, i14, i15, i16);
    }

    public SurfaceTextureHelper createSurfaceTextureHelper() {
        return SurfaceTextureHelper.create("decoder-texture-thread", this.sharedContext);
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo) {
        int i13;
        int i14;
        VideoCodecStatus videoCodecStatusReinitDecode;
        this.decoderThreadChecker.checkIsOnValidThread();
        MediaCodecWrapper mediaCodecWrapper = this.codec;
        if (mediaCodecWrapper == null || this.callback == null) {
            boolean z4 = mediaCodecWrapper != null;
            Logging.m85621d(TAG, "decode uninitalized, codec: " + z4 + ", callback: " + String.valueOf(this.callback));
            return VideoCodecStatus.UNINITIALIZED;
        }
        ByteBuffer byteBuffer = encodedImage.buffer;
        if (byteBuffer == null) {
            Logging.m85622e(TAG, "decode() - no input data");
            return VideoCodecStatus.ERR_PARAMETER;
        }
        int iRemaining = byteBuffer.remaining();
        if (iRemaining == 0) {
            Logging.m85622e(TAG, "decode() - input buffer empty");
            return VideoCodecStatus.ERR_PARAMETER;
        }
        synchronized (this.dimensionLock) {
            i13 = this.width;
            i14 = this.height;
        }
        int i15 = encodedImage.encodedWidth;
        int i16 = encodedImage.encodedHeight;
        if (i15 * i16 > 0 && ((i15 != i13 || i16 != i14) && (videoCodecStatusReinitDecode = reinitDecode(i15, i16)) != VideoCodecStatus.OK)) {
            return videoCodecStatusReinitDecode;
        }
        if (this.keyFrameRequired && encodedImage.frameType != EncodedImage.FrameType.VideoFrameKey) {
            Logging.m85622e(TAG, "decode() - key frame required first");
            return VideoCodecStatus.NO_OUTPUT;
        }
        try {
            int iDequeueInputBuffer = this.codec.dequeueInputBuffer(500000L);
            if (iDequeueInputBuffer < 0) {
                Logging.m85622e(TAG, "decode() - no HW buffers available; decoder falling behind");
                return VideoCodecStatus.ERROR;
            }
            try {
                ByteBuffer inputBuffer = this.codec.getInputBuffer(iDequeueInputBuffer);
                if (inputBuffer.capacity() < iRemaining) {
                    Logging.m85622e(TAG, "decode() - HW buffer too small");
                    return VideoCodecStatus.ERROR;
                }
                inputBuffer.put(encodedImage.buffer);
                this.frameInfos.offer(new FrameInfo(SystemClock.elapsedRealtime(), encodedImage.rotation));
                try {
                    this.codec.queueInputBuffer(iDequeueInputBuffer, 0, iRemaining, TimeUnit.NANOSECONDS.toMicros(encodedImage.captureTimeNs), 0);
                    if (this.keyFrameRequired) {
                        this.keyFrameRequired = false;
                    }
                    return VideoCodecStatus.OK;
                } catch (IllegalStateException e5) {
                    Logging.m85623e(TAG, "queueInputBuffer failed", e5);
                    this.frameInfos.pollLast();
                    return VideoCodecStatus.ERROR;
                }
            } catch (IllegalStateException e13) {
                Logging.m85623e(TAG, "getInputBuffer with index=" + iDequeueInputBuffer + " failed", e13);
                return VideoCodecStatus.ERROR;
            }
        } catch (IllegalStateException e14) {
            Logging.m85623e(TAG, "dequeueInputBuffer failed", e14);
            return VideoCodecStatus.ERROR;
        }
    }

    public void deliverDecodedFrame() throws Throwable {
        Integer numValueOf;
        int i13;
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int iDequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (iDequeueOutputBuffer == -2) {
                reformat(this.codec.getOutputFormat());
                return;
            }
            if (iDequeueOutputBuffer < 0) {
                Logging.m85624v(TAG, "dequeueOutputBuffer returned " + iDequeueOutputBuffer);
                return;
            }
            FrameInfo frameInfoPoll = this.frameInfos.poll();
            if (frameInfoPoll != null) {
                numValueOf = Integer.valueOf((int) (SystemClock.elapsedRealtime() - frameInfoPoll.decodeStartTimeMs));
                i13 = frameInfoPoll.rotation;
            } else {
                numValueOf = null;
                i13 = 0;
            }
            this.hasDecodedFirstFrame = true;
            if (this.surfaceTextureHelper != null) {
                deliverTextureFrame(iDequeueOutputBuffer, bufferInfo, i13, numValueOf);
            } else {
                deliverByteFrame(iDequeueOutputBuffer, bufferInfo, i13, numValueOf);
            }
        } catch (IllegalStateException e5) {
            Logging.m85623e(TAG, "deliverDecodedFrame failed", e5);
        }
    }

    @Override // org.webrtc.VideoDecoder
    public String getImplementationName() {
        return this.codecName;
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        this.decoderThreadChecker = new ThreadUtils.ThreadChecker();
        this.callback = callback;
        if (this.sharedContext != null) {
            this.surfaceTextureHelper = createSurfaceTextureHelper();
            this.surface = new Surface(this.surfaceTextureHelper.getSurfaceTexture());
            this.surfaceTextureHelper.startListening(this);
        }
        return initDecodeInternal(settings.width, settings.height);
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        long j7;
        Integer num;
        synchronized (this.renderedTextureMetadataLock) {
            DecodedTextureMetadata decodedTextureMetadata = this.renderedTextureMetadata;
            if (decodedTextureMetadata == null) {
                throw new IllegalStateException("Rendered texture metadata was null in onTextureFrameAvailable.");
            }
            j7 = decodedTextureMetadata.presentationTimestampUs * 1000;
            num = decodedTextureMetadata.decodeTimeMs;
            this.renderedTextureMetadata = null;
        }
        this.callback.onDecodedFrame(new VideoFrame(videoFrame.getBuffer(), videoFrame.getRotation(), j7), num, null);
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus release() {
        Logging.m85621d(TAG, "release");
        VideoCodecStatus videoCodecStatusReleaseInternal = releaseInternal();
        if (this.surface != null) {
            releaseSurface();
            this.surface = null;
            this.surfaceTextureHelper.stopListening();
            this.surfaceTextureHelper.dispose();
            this.surfaceTextureHelper = null;
        }
        synchronized (this.renderedTextureMetadataLock) {
            this.renderedTextureMetadata = null;
        }
        this.callback = null;
        return videoCodecStatusReleaseInternal;
    }

    public void releaseSurface() {
        this.surface.release();
    }
}
