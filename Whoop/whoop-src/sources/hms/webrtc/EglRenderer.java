package hms.webrtc;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import androidx.fragment.app.RunnableC1283d;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;

/* JADX INFO: loaded from: classes11.dex */
public class EglRenderer implements VideoSink {
    private static final long LOG_INTERVAL_SEC = 4;
    private static final String TAG = "EglRenderer";
    private final GlTextureFrameBuffer bitmapTextureFramebuffer;
    private final Object cacheFrameLock;
    int cacheRotation;
    int cachedRotatedHeight;
    int cachedRotatedWidth;
    int cachedStride;
    private final Matrix drawMatrix;
    private RendererCommon.GlDrawer drawer;
    private EglBase eglBase;
    private final EglSurfaceCreation eglSurfaceCreationRunnable;
    private volatile ErrorCallback errorCallback;
    private final Object fpsReductionLock;
    private final VideoFrameDrawer frameDrawer;
    private final ArrayList<FrameListenerAndParams> frameListeners;
    private final Object frameLock;
    private int framesDropped;
    private int framesReceived;
    private int framesRendered;
    private final Object handlerLock;
    ByteBuffer lastFrameRBGAByteBuffer;
    private float layoutAspectRatio;
    private final Object layoutLock;
    private final Runnable logStatisticsRunnable;
    private long minRenderPeriodNs;
    private boolean mirrorHorizontally;
    private boolean mirrorVertically;
    protected final String name;
    private long nextFrameTimeNs;
    private VideoFrame pendingFrame;
    private long renderSwapBufferTimeNs;
    private Handler renderThreadHandler;
    private long renderTimeNs;
    boolean shouldCache;
    private final Object statisticsLock;
    private long statisticsStartTimeNs;
    private final GlTextureFrameBuffer textureFrameBuffer;
    private Matrix translationMatrix;
    private boolean usePresentationTimeStamp;

    public class EglSurfaceCreation implements Runnable {
        private Object surface;

        public /* synthetic */ EglSurfaceCreation(EglRenderer eglRenderer, int i13) {
            this();
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            try {
                if (this.surface != null && EglRenderer.this.eglBase != null && !EglRenderer.this.eglBase.hasSurface()) {
                    Object obj = this.surface;
                    if (obj instanceof Surface) {
                        EglRenderer.this.eglBase.createSurface((Surface) this.surface);
                    } else {
                        if (!(obj instanceof SurfaceTexture)) {
                            throw new IllegalStateException("Invalid surface: " + this.surface);
                        }
                        EglRenderer.this.eglBase.createSurface((SurfaceTexture) this.surface);
                    }
                    EglRenderer.this.eglBase.makeCurrent();
                    GLES20.glPixelStorei(3317, 1);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }

        public synchronized void setSurface(Object obj) {
            this.surface = obj;
        }

        private EglSurfaceCreation() {
        }
    }

    public interface ErrorCallback {
        void onGlOutOfMemory();
    }

    public interface FrameListener {
        void onFrame(Bitmap bitmap);
    }

    public static class FrameListenerAndParams {
        public final boolean applyFpsReduction;
        public final RendererCommon.GlDrawer drawer;
        public final FrameListener listener;
        public final float scale;

        public FrameListenerAndParams(FrameListener frameListener, float f13, RendererCommon.GlDrawer glDrawer, boolean z4) {
            this.listener = frameListener;
            this.scale = f13;
            this.drawer = glDrawer;
            this.applyFpsReduction = z4;
        }
    }

    public static class HandlerWithExceptionCallback extends Handler {
        private final Runnable exceptionCallback;

        public HandlerWithExceptionCallback(Looper looper, Runnable runnable) {
            super(looper);
            this.exceptionCallback = runnable;
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) throws Exception {
            try {
                super.dispatchMessage(message);
            } catch (Exception e5) {
                Logging.m49572e(EglRenderer.TAG, "Exception on EglRenderer thread", e5);
                this.exceptionCallback.run();
                throw e5;
            }
        }
    }

    public EglRenderer(String str) {
        this(str, new VideoFrameDrawer());
    }

    private String averageTimeAsString(long j7, int i13) {
        if (i13 <= 0) {
            return "NA";
        }
        return TimeUnit.NANOSECONDS.toMicros(j7 / ((long) i13)) + " us";
    }

    private void cacheVideoFrame(VideoFrame videoFrame) {
        releaseCacheFrameData();
        synchronized (this.cacheFrameLock) {
            this.lastFrameRBGAByteBuffer = getByteBufferFromInputVideoFrame(videoFrame);
        }
        this.cachedRotatedWidth = videoFrame.getRotatedWidth();
        this.cachedRotatedHeight = videoFrame.getRotatedHeight();
        this.cachedStride = videoFrame.getRotatedWidth() * 4;
        this.cacheRotation = videoFrame.getRotation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: clearSurfaceOnRenderThread, reason: merged with bridge method [inline-methods] */
    public void lambda$clearImage$6(float f13, float f14, float f15, float f16) {
        EglBase eglBase = this.eglBase;
        if (eglBase == null || !eglBase.hasSurface()) {
            return;
        }
        logD("clearSurface");
        GLES20.glClearColor(f13, f14, f15, f16);
        GLES20.glClear(DfuBaseService.ERROR_CONNECTION_MASK);
        this.eglBase.swapBuffers();
    }

    private void createEglSurfaceInternal(Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    private ByteBuffer getByteBufferFromInputVideoFrame(VideoFrame videoFrame) {
        this.drawMatrix.reset();
        this.drawMatrix.preTranslate(0.5f, 0.5f);
        this.drawMatrix.preScale(this.mirrorHorizontally ? -1.0f : 1.0f, this.mirrorVertically ? -1.0f : 1.0f);
        this.drawMatrix.preTranslate(-0.5f, -0.5f);
        this.textureFrameBuffer.setSize(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
        GLES20.glBindFramebuffer(36160, this.textureFrameBuffer.getFrameBufferId());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.textureFrameBuffer.getTextureId(), 0);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(DfuBaseService.ERROR_CONNECTION_MASK);
        this.frameDrawer.drawFrame(videoFrame, this.drawer, this.drawMatrix, 0, 0, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
        ByteBuffer byteBufferNativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(videoFrame.getRotatedHeight() * videoFrame.getRotatedWidth() * 4);
        GLES20.glViewport(0, 0, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
        GLES20.glReadPixels(0, 0, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), 6408, 5121, byteBufferNativeAllocateByteBuffer);
        GLES20.glBindFramebuffer(36160, 0);
        GlUtil.checkNoGLES2Error("EglRenderer.notifyCallbacks");
        return byteBufferNativeAllocateByteBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addFrameListener$3(RendererCommon.GlDrawer glDrawer, FrameListener frameListener, float f13, boolean z4) {
        if (glDrawer == null) {
            glDrawer = this.drawer;
        }
        this.frameListeners.add(new FrameListenerAndParams(frameListener, f13, glDrawer, z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(EglBase.Context context, int[] iArr) {
        if (context == null) {
            logD("EglBase10.create context");
            this.eglBase = EglBase.createEgl10(iArr);
        } else {
            logD("EglBase.create shared context");
            this.eglBase = EglBase.create(context, iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$1(CountDownLatch countDownLatch) {
        synchronized (EglBase.lock) {
            GLES20.glUseProgram(0);
        }
        RendererCommon.GlDrawer glDrawer = this.drawer;
        if (glDrawer != null) {
            glDrawer.release();
            this.drawer = null;
        }
        this.frameDrawer.release();
        this.bitmapTextureFramebuffer.release();
        this.textureFrameBuffer.release();
        if (this.eglBase != null) {
            logD("eglBase detach and release.");
            this.eglBase.detachCurrent();
            this.eglBase.release();
            this.eglBase = null;
        }
        this.frameListeners.clear();
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$2(Looper looper) {
        logD("Quitting render thread.");
        looper.quit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseEglSurface$5(Runnable runnable) {
        EglBase eglBase = this.eglBase;
        if (eglBase != null) {
            eglBase.detachCurrent();
            this.eglBase.releaseSurface();
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeFrameListener$4(CountDownLatch countDownLatch, FrameListener frameListener) {
        countDownLatch.countDown();
        Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            if (it.next().listener == frameListener) {
                it.remove();
            }
        }
    }

    private void logD(String str) {
        Logging.m49570d(TAG, this.name + str);
    }

    private void logE(String str, Throwable th3) {
        Logging.m49572e(TAG, this.name + str, th3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logStatistics() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        long jNanoTime = System.nanoTime();
        synchronized (this.statisticsLock) {
            try {
                long j7 = jNanoTime - this.statisticsStartTimeNs;
                if (j7 > 0 && (this.minRenderPeriodNs != Long.MAX_VALUE || this.framesReceived != 0)) {
                    float nanos = (((long) this.framesRendered) * TimeUnit.SECONDS.toNanos(1L)) / j7;
                    logD("Duration: " + TimeUnit.NANOSECONDS.toMillis(j7) + " ms. Frames received: " + this.framesReceived + ". Dropped: " + this.framesDropped + ". Rendered: " + this.framesRendered + ". Render fps: " + decimalFormat.format(nanos) + ". Average render time: " + averageTimeAsString(this.renderTimeNs, this.framesRendered) + ". Average swapBuffer time: " + averageTimeAsString(this.renderSwapBufferTimeNs, this.framesRendered) + ".");
                    resetStatistics(jNanoTime);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private void logW(String str) {
        Logging.m49574w(TAG, this.name + str);
    }

    private void notifyCallbacks(VideoFrame videoFrame, boolean z4) {
        if (this.frameListeners.isEmpty()) {
            return;
        }
        this.drawMatrix.reset();
        this.drawMatrix.preTranslate(0.5f, 0.5f);
        this.drawMatrix.preScale(this.mirrorHorizontally ? -1.0f : 1.0f, this.mirrorVertically ? -1.0f : 1.0f);
        this.drawMatrix.preScale(1.0f, -1.0f);
        this.drawMatrix.preTranslate(-0.5f, -0.5f);
        Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            FrameListenerAndParams next = it.next();
            if (z4 || !next.applyFpsReduction) {
                it.remove();
                int rotatedWidth = (int) (next.scale * videoFrame.getRotatedWidth());
                int rotatedHeight = (int) (next.scale * videoFrame.getRotatedHeight());
                if (rotatedWidth == 0 || rotatedHeight == 0) {
                    next.listener.onFrame(null);
                } else {
                    this.bitmapTextureFramebuffer.setSize(rotatedWidth, rotatedHeight);
                    GLES20.glBindFramebuffer(36160, this.bitmapTextureFramebuffer.getFrameBufferId());
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.bitmapTextureFramebuffer.getTextureId(), 0);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(DfuBaseService.ERROR_CONNECTION_MASK);
                    this.frameDrawer.drawFrame(videoFrame, next.drawer, this.drawMatrix, 0, 0, rotatedWidth, rotatedHeight);
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(rotatedWidth * rotatedHeight * 4);
                    GLES20.glViewport(0, 0, rotatedWidth, rotatedHeight);
                    GLES20.glReadPixels(0, 0, rotatedWidth, rotatedHeight, 6408, 5121, byteBufferAllocateDirect);
                    GLES20.glBindFramebuffer(36160, 0);
                    GlUtil.checkNoGLES2Error("EglRenderer.notifyCallbacks");
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rotatedWidth, rotatedHeight, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocateDirect);
                    next.listener.onFrame(bitmapCreateBitmap);
                }
            }
        }
    }

    private void postToRenderThread(Runnable runnable) {
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler != null) {
                    handler.post(runnable);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private void releaseCacheFrameData() {
        synchronized (this.cacheFrameLock) {
            try {
                ByteBuffer byteBuffer = this.lastFrameRBGAByteBuffer;
                if (byteBuffer != null) {
                    JniCommon.nativeFreeByteBuffer(byteBuffer);
                    this.lastFrameRBGAByteBuffer = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderBlackFrame() {
        EglBase eglBase = this.eglBase;
        if (eglBase == null || !eglBase.hasSurface()) {
            logD("Dropping frame - No surface");
            return;
        }
        try {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(DfuBaseService.ERROR_CONNECTION_MASK);
            this.eglBase.swapBuffers();
        } catch (GlUtil.GlOutOfMemoryException e5) {
            logE("Error while clearing frame", e5);
        }
    }

    private void renderBlackFrames() {
        EglBase eglBase = this.eglBase;
        if (eglBase == null || !eglBase.hasSurface()) {
            logD("Dropping frame - No surface");
            return;
        }
        try {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(DfuBaseService.ERROR_CONNECTION_MASK);
            this.eglBase.swapBuffers();
        } catch (GlUtil.GlOutOfMemoryException e5) {
            logE("Error while clearing frame", e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderFrameFromCache() {
        boolean z4;
        EglBase eglBase;
        int i13;
        int i14;
        synchronized (this.fpsReductionLock) {
            try {
                long j7 = this.minRenderPeriodNs;
                z4 = false;
                if (j7 != Long.MAX_VALUE) {
                    if (j7 <= 0) {
                        z4 = true;
                    } else {
                        long jNanoTime = System.nanoTime();
                        long j13 = this.nextFrameTimeNs;
                        if (jNanoTime < j13) {
                            logD("Skipping frame rendering - fps reduction is active.");
                        } else {
                            long j14 = j13 + this.minRenderPeriodNs;
                            this.nextFrameTimeNs = j14;
                            this.nextFrameTimeNs = Math.max(j14, jNanoTime);
                            z4 = true;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (!z4 || this.lastFrameRBGAByteBuffer == null || (eglBase = this.eglBase) == null || !eglBase.hasSurface() || (i13 = this.cachedRotatedWidth) == 0 || (i14 = this.cachedRotatedHeight) == 0) {
            return;
        }
        resizeRenderMatrixBasedOnAspectRatio(i13, i14);
        try {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(DfuBaseService.ERROR_CONNECTION_MASK);
            this.frameDrawer.drawRGBAFrame(this.drawer, this.drawMatrix, 0, 0, this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight(), this.cachedRotatedWidth, this.cachedRotatedHeight, this.cacheRotation, this.cachedStride, this.lastFrameRBGAByteBuffer);
            this.eglBase.swapBuffers();
        } catch (GlUtil.GlOutOfMemoryException unused) {
            this.drawer.release();
            this.frameDrawer.release();
            this.bitmapTextureFramebuffer.release();
            this.textureFrameBuffer.release();
            releaseCacheFrameData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderFrameOnRenderThread() {
        boolean z4;
        synchronized (this.frameLock) {
            try {
                VideoFrame videoFrame = this.pendingFrame;
                if (videoFrame == null) {
                    return;
                }
                this.pendingFrame = null;
                EglBase eglBase = this.eglBase;
                if (eglBase == null || !eglBase.hasSurface()) {
                    logD("Dropping frame - No surface");
                    videoFrame.release();
                    return;
                }
                synchronized (this.fpsReductionLock) {
                    try {
                        long j7 = this.minRenderPeriodNs;
                        if (j7 != Long.MAX_VALUE) {
                            if (j7 > 0) {
                                long jNanoTime = System.nanoTime();
                                long j13 = this.nextFrameTimeNs;
                                if (jNanoTime < j13) {
                                    logD("Skipping frame rendering - fps reduction is active.");
                                    z4 = false;
                                } else {
                                    long j14 = j13 + this.minRenderPeriodNs;
                                    this.nextFrameTimeNs = j14;
                                    this.nextFrameTimeNs = Math.max(j14, jNanoTime);
                                }
                            }
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                long jNanoTime2 = System.nanoTime();
                resizeRenderMatrixBasedOnAspectRatio(videoFrame);
                try {
                    if (z4) {
                        try {
                            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                            GLES20.glClear(DfuBaseService.ERROR_CONNECTION_MASK);
                            this.frameDrawer.drawFrame(videoFrame, this.drawer, this.drawMatrix, 0, 0, this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight());
                            long jNanoTime3 = System.nanoTime();
                            if (this.usePresentationTimeStamp) {
                                this.eglBase.swapBuffers(videoFrame.getTimestampNs());
                            } else {
                                this.eglBase.swapBuffers();
                            }
                            long jNanoTime4 = System.nanoTime();
                            synchronized (this.statisticsLock) {
                                this.framesRendered++;
                                this.renderTimeNs = (jNanoTime4 - jNanoTime2) + this.renderTimeNs;
                                this.renderSwapBufferTimeNs = (jNanoTime4 - jNanoTime3) + this.renderSwapBufferTimeNs;
                            }
                        } catch (GlUtil.GlOutOfMemoryException e5) {
                            logE("Error while drawing frame", e5);
                            ErrorCallback errorCallback = this.errorCallback;
                            if (errorCallback != null) {
                                errorCallback.onGlOutOfMemory();
                            }
                            this.drawer.release();
                            this.frameDrawer.release();
                            this.bitmapTextureFramebuffer.release();
                            this.textureFrameBuffer.release();
                            releaseCacheFrameData();
                            videoFrame.release();
                            return;
                        }
                    }
                    if (this.shouldCache) {
                        cacheVideoFrame(videoFrame);
                    }
                    notifyCallbacks(videoFrame, z4);
                    videoFrame.release();
                } catch (Throwable th4) {
                    videoFrame.release();
                    throw th4;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    private void resetStatistics(long j7) {
        synchronized (this.statisticsLock) {
            this.statisticsStartTimeNs = j7;
            this.framesReceived = 0;
            this.framesDropped = 0;
            this.framesRendered = 0;
            this.renderTimeNs = 0L;
            this.renderSwapBufferTimeNs = 0L;
        }
    }

    private void resizeRenderMatrixBasedOnAspectRatio(VideoFrame videoFrame) {
        resizeRenderMatrixBasedOnAspectRatio(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
    }

    public void addFrameListener(FrameListener frameListener, float f13) {
        addFrameListener(frameListener, f13, null, false);
    }

    public void clearFrame() {
        synchronized (this.handlerLock) {
            try {
                if (this.renderThreadHandler == null) {
                    logD("Unable to clear frame - Not initialized or already released.");
                    return;
                }
                synchronized (this.frameLock) {
                    this.renderThreadHandler.post(new RunnableC17480d(this, 1));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void clearImage() {
        clearImage(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void createEglSurface(Surface surface) {
        createEglSurfaceInternal(surface);
    }

    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer, boolean z4) {
        synchronized (this.handlerLock) {
            try {
                if (this.renderThreadHandler != null) {
                    throw new IllegalStateException(this.name + "Already initialized");
                }
                logD("Initializing EglRenderer");
                this.drawer = glDrawer;
                this.usePresentationTimeStamp = z4;
                HandlerThread handlerThread = new HandlerThread(this.name + TAG);
                handlerThread.start();
                HandlerWithExceptionCallback handlerWithExceptionCallback = new HandlerWithExceptionCallback(handlerThread.getLooper(), new Runnable() { // from class: hms.webrtc.EglRenderer.2
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (EglRenderer.this.handlerLock) {
                            EglRenderer.this.renderThreadHandler = null;
                        }
                    }
                });
                this.renderThreadHandler = handlerWithExceptionCallback;
                ThreadUtils.invokeAtFrontUninterruptibly(handlerWithExceptionCallback, new RunnableC1283d(this, context, iArr, 8));
                this.renderThreadHandler.post(this.eglSurfaceCreationRunnable);
                resetStatistics(System.nanoTime());
                this.renderThreadHandler.postDelayed(this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(LOG_INTERVAL_SEC));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // hms.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        boolean z4;
        synchronized (this.statisticsLock) {
            this.framesReceived++;
        }
        synchronized (this.handlerLock) {
            try {
                if (this.renderThreadHandler == null) {
                    logD("Dropping frame - Not initialized or already released.");
                    return;
                }
                synchronized (this.frameLock) {
                    try {
                        VideoFrame videoFrame2 = this.pendingFrame;
                        z4 = videoFrame2 != null;
                        if (z4) {
                            videoFrame2.release();
                        }
                        this.pendingFrame = videoFrame;
                        videoFrame.retain();
                        this.renderThreadHandler.post(new RunnableC17480d(this, 0));
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (z4) {
                    synchronized (this.statisticsLock) {
                        this.framesDropped++;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public void pauseVideo() {
        setFpsReduction(0.0f);
    }

    public void printStackTrace() {
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                Thread thread = handler == null ? null : handler.getLooper().getThread();
                if (thread != null) {
                    StackTraceElement[] stackTrace = thread.getStackTrace();
                    if (stackTrace.length > 0) {
                        logW("EglRenderer stack trace:");
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            logW(stackTraceElement.toString());
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void release() {
        logD("Releasing.");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler == null) {
                    logD("Already released");
                    return;
                }
                handler.removeCallbacks(this.logStatisticsRunnable);
                this.renderThreadHandler.postAtFrontOfQueue(new RunnableC17491o(2, this, countDownLatch));
                this.renderThreadHandler.post(new RunnableC17491o(3, this, this.renderThreadHandler.getLooper()));
                this.renderThreadHandler = null;
                ThreadUtils.awaitUninterruptibly(countDownLatch);
                synchronized (this.frameLock) {
                    try {
                        VideoFrame videoFrame = this.pendingFrame;
                        if (videoFrame != null) {
                            videoFrame.release();
                            this.pendingFrame = null;
                        }
                        releaseCacheFrameData();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                logD("Releasing done.");
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public void releaseEglSurface(Runnable runnable) {
        this.eglSurfaceCreationRunnable.setSurface(null);
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler == null) {
                    runnable.run();
                } else {
                    handler.removeCallbacks(this.eglSurfaceCreationRunnable);
                    this.renderThreadHandler.postAtFrontOfQueue(new RunnableC17491o(1, this, runnable));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void removeFrameListener(FrameListener frameListener) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            try {
                if (this.renderThreadHandler == null) {
                    return;
                }
                if (Thread.currentThread() == this.renderThreadHandler.getLooper().getThread()) {
                    throw new RuntimeException("removeFrameListener must not be called on the render thread.");
                }
                postToRenderThread(new RunnableC1283d(this, countDownLatch, frameListener, 7));
                ThreadUtils.awaitUninterruptibly(countDownLatch);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void setErrorCallback(ErrorCallback errorCallback) {
        this.errorCallback = errorCallback;
    }

    public void setFpsReduction(float f13) {
        logD("setFpsReduction: " + f13);
        synchronized (this.fpsReductionLock) {
            try {
                long j7 = this.minRenderPeriodNs;
                if (f13 <= 0.0f) {
                    this.minRenderPeriodNs = Long.MAX_VALUE;
                } else {
                    this.minRenderPeriodNs = (long) (TimeUnit.SECONDS.toNanos(1L) / f13);
                }
                if (this.minRenderPeriodNs != j7) {
                    this.nextFrameTimeNs = System.nanoTime();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void setLayoutAspectRatio(float f13) {
        logD("setLayoutAspectRatio: " + f13);
        synchronized (this.layoutLock) {
            this.layoutAspectRatio = f13;
        }
    }

    public void setMirror(boolean z4) {
        logD(AbstractC11266d.m30462p("setMirrorHorizontally: ", z4));
        synchronized (this.layoutLock) {
            this.mirrorHorizontally = z4;
        }
    }

    public void setMirrorVertically(boolean z4) {
        logD(AbstractC11266d.m30462p("setMirrorVertically: ", z4));
        synchronized (this.layoutLock) {
            this.mirrorVertically = z4;
        }
    }

    public void setTranslationMatrix(Matrix matrix) {
        synchronized (this.layoutLock) {
            this.translationMatrix.set(matrix);
            this.shouldCache = true;
        }
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler == null) {
                    return;
                }
                handler.post(new RunnableC17480d(this, 2));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public EglRenderer(String str, VideoFrameDrawer videoFrameDrawer) {
        this.handlerLock = new Object();
        this.frameListeners = new ArrayList<>();
        this.fpsReductionLock = new Object();
        this.drawMatrix = new Matrix();
        this.frameLock = new Object();
        this.cacheFrameLock = new Object();
        this.layoutLock = new Object();
        this.translationMatrix = new Matrix();
        this.statisticsLock = new Object();
        this.bitmapTextureFramebuffer = new GlTextureFrameBuffer(6408);
        this.textureFrameBuffer = new GlTextureFrameBuffer(6408);
        this.logStatisticsRunnable = new Runnable() { // from class: hms.webrtc.EglRenderer.1
            @Override // java.lang.Runnable
            public void run() {
                EglRenderer.this.logStatistics();
                synchronized (EglRenderer.this.handlerLock) {
                    try {
                        if (EglRenderer.this.renderThreadHandler != null) {
                            EglRenderer.this.renderThreadHandler.removeCallbacks(EglRenderer.this.logStatisticsRunnable);
                            EglRenderer.this.renderThreadHandler.postDelayed(EglRenderer.this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(EglRenderer.LOG_INTERVAL_SEC));
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        };
        this.eglSurfaceCreationRunnable = new EglSurfaceCreation(this, 0);
        this.name = str;
        this.frameDrawer = videoFrameDrawer;
    }

    private void resizeRenderMatrixBasedOnAspectRatio(int i13, int i14) {
        float f13;
        float f14;
        float f15;
        float f16 = i13 / i14;
        synchronized (this.layoutLock) {
            f13 = this.layoutAspectRatio;
            if (f13 == 0.0f) {
                f13 = f16;
            }
        }
        if (f16 > f13) {
            f15 = f13 / f16;
            f14 = 1.0f;
        } else {
            f14 = f16 / f13;
            f15 = 1.0f;
        }
        this.drawMatrix.reset();
        this.drawMatrix.preTranslate(0.5f, 0.5f);
        this.drawMatrix.preScale(this.mirrorHorizontally ? -1.0f : 1.0f, this.mirrorVertically ? -1.0f : 1.0f);
        this.drawMatrix.preScale(f15, f14);
        this.drawMatrix.preTranslate(-0.5f, -0.5f);
        this.drawMatrix.postConcat(this.translationMatrix);
    }

    public void addFrameListener(FrameListener frameListener, float f13, RendererCommon.GlDrawer glDrawer) {
        addFrameListener(frameListener, f13, glDrawer, false);
    }

    public void clearImage(float f13, float f14, float f15, float f16) {
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler == null) {
                    return;
                }
                handler.postAtFrontOfQueue(new RunnableC17482f(this, f13, f14, f15, f16, 0));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture);
    }

    public void addFrameListener(FrameListener frameListener, float f13, RendererCommon.GlDrawer glDrawer, boolean z4) {
        postToRenderThread(new RunnableC17481e(this, glDrawer, frameListener, f13, z4, 0));
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, iArr, glDrawer, false);
    }
}
