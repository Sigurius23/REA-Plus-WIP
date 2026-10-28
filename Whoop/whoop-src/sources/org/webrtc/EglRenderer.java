package org.webrtc;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLException;
import android.view.Surface;
import hms.webrtc.RunnableC17481e;
import hms.webrtc.RunnableC17482f;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import no.nordicsemi.android.dfu.DfuBaseService;

/* JADX INFO: loaded from: classes3.dex */
public class EglRenderer implements VideoSink {
    private static final UUID EMPTY_UUID = new UUID(0, 0);
    private static final long LOG_INTERVAL_SEC = 4;
    private static final String TAG = "EglRenderer";
    private final GlTextureFrameBuffer bitmapTextureFramebuffer;
    private final Matrix drawMatrix;
    private RendererCommon.GlDrawer drawer;
    private EglBase eglBase;
    private final Runnable eglExceptionCallback;
    private final EglSurfaceCreation eglSurfaceCreationRunnable;
    private EglThread eglThread;
    private volatile ErrorCallback errorCallback;
    private final Object fpsReductionLock;
    private final VideoFrameDrawer frameDrawer;
    private final ArrayList<FrameListenerAndParams> frameListeners;
    private final Object frameLock;
    private int framesDropped;
    private int framesReceived;
    private int framesRendered;

    /* JADX INFO: renamed from: id */
    private UUID f114040id;
    private float layoutAspectRatio;
    private final Object layoutLock;
    private final Runnable logStatisticsRunnable;
    private long minRenderPeriodNs;
    private boolean mirrorHorizontally;
    private boolean mirrorVertically;
    protected final String name;
    private long nextFrameTimeNs;
    private VideoFrame pendingFrame;
    private final ArrayList<RenderListener> renderListeners;
    private long renderSwapBufferTimeNs;
    private long renderTimeNs;
    private final Object statisticsLock;
    private long statisticsStartTimeNs;
    private final Object threadLock;
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
                            throw new IllegalStateException("Invalid surface: ".concat(String.valueOf(this.surface)));
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

    public interface RenderListener {
        void onRender(long j7);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: clearSurfaceOnRenderThread, reason: merged with bridge method [inline-methods] */
    public void lambda$clearImage$5(float f13, float f14, float f15, float f16) {
        EglBase eglBase = this.eglBase;
        if (eglBase == null || !eglBase.hasSurface()) {
            return;
        }
        logD("clearSurface");
        this.eglBase.makeCurrent();
        GLES20.glClearColor(f13, f14, f15, f16);
        GLES20.glClear(DfuBaseService.ERROR_CONNECTION_MASK);
        this.eglBase.swapBuffers();
    }

    private void createEglSurfaceInternal(Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addFrameListener$1(RendererCommon.GlDrawer glDrawer, FrameListener frameListener, float f13, boolean z4) {
        if (glDrawer == null) {
            glDrawer = this.drawer;
        }
        this.frameListeners.add(new FrameListenerAndParams(frameListener, f13, glDrawer, z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$0(CountDownLatch countDownLatch) {
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
        if (this.eglBase != null) {
            logD("eglBase detach and release.");
            this.eglBase.detachCurrent();
            this.eglBase.release();
            this.eglBase = null;
        }
        this.renderListeners.clear();
        this.frameListeners.clear();
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseEglSurface$4(Runnable runnable) {
        EglBase eglBase = this.eglBase;
        if (eglBase != null) {
            eglBase.detachCurrent();
            this.eglBase.releaseSurface();
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeFrameListener$2(CountDownLatch countDownLatch, FrameListener frameListener) {
        countDownLatch.countDown();
        Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            if (it.next().listener == frameListener) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeRenderListener$3(CountDownLatch countDownLatch, RenderListener renderListener) {
        countDownLatch.countDown();
        Iterator<RenderListener> it = this.renderListeners.iterator();
        while (it.hasNext()) {
            if (it.next() == renderListener) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$swapBuffersOnRenderThread$6(VideoFrame videoFrame, long j7, boolean z4) {
        if (!z4) {
            EglBase eglBase = this.eglBase;
            if (eglBase == null || !eglBase.hasSurface()) {
                return;
            } else {
                this.eglBase.makeCurrent();
            }
        }
        if (this.usePresentationTimeStamp) {
            this.eglBase.swapBuffers(videoFrame.getTimestampNs());
        } else {
            this.eglBase.swapBuffers();
        }
        Iterator<RenderListener> it = this.renderListeners.iterator();
        while (it.hasNext()) {
            it.next().onRender(System.nanoTime());
        }
        synchronized (this.statisticsLock) {
            this.renderSwapBufferTimeNs = (System.nanoTime() - j7) + this.renderSwapBufferTimeNs;
        }
    }

    private void logD(String str) {
        Logging.m85621d(TAG, this.name + str);
    }

    private void logE(String str, Throwable th3) {
        Logging.m85623e(TAG, this.name + str, th3);
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
        Logging.m85625w(TAG, this.name + str);
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
        synchronized (this.threadLock) {
            try {
                EglThread eglThread = this.eglThread;
                if (eglThread != null) {
                    eglThread.getHandler().post(runnable);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderFrameOnRenderThread() {
        boolean z4;
        float f13;
        float f14;
        float f15;
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
                try {
                    this.eglBase.makeCurrent();
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
                    float rotatedWidth = videoFrame.getRotatedWidth() / videoFrame.getRotatedHeight();
                    synchronized (this.layoutLock) {
                        f13 = this.layoutAspectRatio;
                        if (f13 == 0.0f) {
                            f13 = rotatedWidth;
                        }
                    }
                    if (rotatedWidth > f13) {
                        f15 = f13 / rotatedWidth;
                        f14 = 1.0f;
                    } else {
                        f14 = rotatedWidth / f13;
                        f15 = 1.0f;
                    }
                    this.drawMatrix.reset();
                    this.drawMatrix.preTranslate(0.5f, 0.5f);
                    this.drawMatrix.preScale(this.mirrorHorizontally ? -1.0f : 1.0f, this.mirrorVertically ? -1.0f : 1.0f);
                    this.drawMatrix.preScale(f15, f14);
                    this.drawMatrix.preTranslate(-0.5f, -0.5f);
                    try {
                        if (z4) {
                            try {
                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                GLES20.glClear(DfuBaseService.ERROR_CONNECTION_MASK);
                                this.frameDrawer.drawFrame(videoFrame, this.drawer, this.drawMatrix, 0, 0, this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight());
                                long jNanoTime3 = System.nanoTime();
                                swapBuffersOnRenderThread(videoFrame, jNanoTime3);
                                synchronized (this.statisticsLock) {
                                    this.framesRendered++;
                                    this.renderTimeNs = (jNanoTime3 - jNanoTime2) + this.renderTimeNs;
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
                                videoFrame.release();
                                return;
                            }
                        }
                        notifyCallbacks(videoFrame, z4);
                        videoFrame.release();
                    } catch (Throwable th4) {
                        videoFrame.release();
                        throw th4;
                    }
                } catch (GLException e13) {
                    logE("Error while eglMakeCurrent", e13);
                    videoFrame.release();
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

    private void swapBuffersOnRenderThread(final VideoFrame videoFrame, final long j7) {
        synchronized (this.threadLock) {
            try {
                if (this.eglThread == null) {
                    return;
                }
                EglThread.RenderUpdate renderUpdate = new EglThread.RenderUpdate() { // from class: org.webrtc.d
                    @Override // org.webrtc.EglThread.RenderUpdate
                    public final void update(boolean z4) {
                        this.f114060a.lambda$swapBuffersOnRenderThread$6(videoFrame, j7, z4);
                    }
                };
                if (this.f114040id.equals(EMPTY_UUID)) {
                    this.eglThread.scheduleRenderUpdate(renderUpdate);
                } else {
                    this.eglThread.scheduleRenderUpdate(this.f114040id, renderUpdate);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void addFrameListener(FrameListener frameListener, float f13) {
        addFrameListener(frameListener, f13, null, false);
    }

    public void addRenderListener(RenderListener renderListener) {
        this.renderListeners.add(renderListener);
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

    public void init(EglThread eglThread, RendererCommon.GlDrawer glDrawer, boolean z4) {
        synchronized (this.threadLock) {
            try {
                if (this.eglThread != null) {
                    throw new IllegalStateException(this.name + "Already initialized");
                }
                logD("Initializing EglRenderer");
                this.eglThread = eglThread;
                this.drawer = glDrawer;
                this.usePresentationTimeStamp = z4;
                eglThread.addExceptionCallback(this.eglExceptionCallback);
                this.eglBase = eglThread.createEglBaseWithSharedConnection();
                eglThread.getHandler().post(this.eglSurfaceCreationRunnable);
                resetStatistics(System.nanoTime());
                eglThread.getHandler().postDelayed(this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(LOG_INTERVAL_SEC));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        boolean z4;
        synchronized (this.statisticsLock) {
            this.framesReceived++;
        }
        synchronized (this.threadLock) {
            try {
                if (this.eglThread == null) {
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
                        this.eglThread.getHandler().post(new RunnableC28281c(this, 2));
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
        synchronized (this.threadLock) {
            try {
                EglThread eglThread = this.eglThread;
                Thread thread = eglThread == null ? null : eglThread.getHandler().getLooper().getThread();
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
        synchronized (this.threadLock) {
            try {
                EglThread eglThread = this.eglThread;
                if (eglThread == null) {
                    logD("Already released");
                    return;
                }
                eglThread.getHandler().removeCallbacks(this.logStatisticsRunnable);
                this.eglThread.removeExceptionCallback(this.eglExceptionCallback);
                this.eglThread.getHandler().postAtFrontOfQueue(new RunnableC28299v(2, this, countDownLatch));
                this.eglThread.release();
                this.eglThread = null;
                ThreadUtils.awaitUninterruptibly(countDownLatch);
                synchronized (this.frameLock) {
                    try {
                        VideoFrame videoFrame = this.pendingFrame;
                        if (videoFrame != null) {
                            videoFrame.release();
                            this.pendingFrame = null;
                        }
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
        synchronized (this.threadLock) {
            try {
                EglThread eglThread = this.eglThread;
                if (eglThread == null) {
                    runnable.run();
                } else {
                    eglThread.getHandler().removeCallbacks(this.eglSurfaceCreationRunnable);
                    this.eglThread.getHandler().postAtFrontOfQueue(new RunnableC28299v(1, this, runnable));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void removeFrameListener(FrameListener frameListener) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.threadLock) {
            try {
                if (this.eglThread == null) {
                    return;
                }
                if (Thread.currentThread() == this.eglThread.getHandler().getLooper().getThread()) {
                    throw new RuntimeException("removeFrameListener must not be called on the render thread.");
                }
                postToRenderThread(new RunnableC28283e(this, countDownLatch, frameListener, 0));
                ThreadUtils.awaitUninterruptibly(countDownLatch);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void removeRenderListener(RenderListener renderListener) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.threadLock) {
            try {
                if (this.eglThread == null) {
                    return;
                }
                if (Thread.currentThread() == this.eglThread.getHandler().getLooper().getThread()) {
                    throw new RuntimeException("removeRenderListener must not be called on the render thread.");
                }
                postToRenderThread(new RunnableC28283e(this, countDownLatch, renderListener, 1));
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
        synchronized (this.layoutLock) {
            this.layoutAspectRatio = f13;
        }
    }

    public void setMirror(boolean z4) {
        synchronized (this.layoutLock) {
            this.mirrorHorizontally = z4;
        }
    }

    public void setMirrorVertically(boolean z4) {
        synchronized (this.layoutLock) {
            this.mirrorVertically = z4;
        }
    }

    public EglRenderer(String str, VideoFrameDrawer videoFrameDrawer) {
        this.f114040id = EMPTY_UUID;
        this.threadLock = new Object();
        this.eglExceptionCallback = new Runnable() { // from class: org.webrtc.EglRenderer.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (EglRenderer.this.threadLock) {
                    EglRenderer.this.eglThread = null;
                }
            }
        };
        this.frameListeners = new ArrayList<>();
        this.renderListeners = new ArrayList<>();
        this.fpsReductionLock = new Object();
        this.drawMatrix = new Matrix();
        this.frameLock = new Object();
        this.layoutLock = new Object();
        this.statisticsLock = new Object();
        this.bitmapTextureFramebuffer = new GlTextureFrameBuffer(6408);
        this.logStatisticsRunnable = new Runnable() { // from class: org.webrtc.EglRenderer.2
            @Override // java.lang.Runnable
            public void run() {
                EglRenderer.this.logStatistics();
                synchronized (EglRenderer.this.threadLock) {
                    try {
                        if (EglRenderer.this.eglThread != null) {
                            EglRenderer.this.eglThread.getHandler().removeCallbacks(EglRenderer.this.logStatisticsRunnable);
                            EglRenderer.this.eglThread.getHandler().postDelayed(EglRenderer.this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(EglRenderer.LOG_INTERVAL_SEC));
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

    public void addFrameListener(FrameListener frameListener, float f13, RendererCommon.GlDrawer glDrawer) {
        addFrameListener(frameListener, f13, glDrawer, false);
    }

    public void clearImage(float f13, float f14, float f15, float f16) {
        synchronized (this.threadLock) {
            try {
                EglThread eglThread = this.eglThread;
                if (eglThread == null) {
                    return;
                }
                eglThread.getHandler().postAtFrontOfQueue(new RunnableC17482f(this, f13, f14, f15, f16, 1));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture);
    }

    public void addFrameListener(FrameListener frameListener, float f13, RendererCommon.GlDrawer glDrawer, boolean z4) {
        postToRenderThread(new RunnableC17481e(this, glDrawer, frameListener, f13, z4, 1));
    }

    public void init(EglThread eglThread, RendererCommon.GlDrawer glDrawer, boolean z4, boolean z13) {
        if (z13) {
            this.f114040id = UUID.randomUUID();
        }
        init(eglThread, glDrawer, z4);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer, boolean z4) {
        init(EglThread.create(null, context, iArr), glDrawer, z4);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, iArr, glDrawer, false);
    }
}
