package hms.webrtc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Point;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.mapbox.maps.RunnableC5502c;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;

/* JADX INFO: loaded from: classes11.dex */
public class SurfaceViewRenderer extends SurfaceView implements SurfaceHolder.Callback, VideoSink, RendererCommon.RendererEvents {
    private static final String TAG = "SurfaceViewRenderer";
    private final SurfaceEglRenderer eglRenderer;
    private boolean enableFixedSize;
    private RendererCommon.RendererEvents rendererEvents;
    private final String resourceName;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;
    private int surfaceHeight;
    private int surfaceWidth;
    private final RendererCommon.VideoLayoutMeasure videoLayoutMeasure;

    public SurfaceViewRenderer(Context context) {
        super(context);
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        String resourceName = getResourceName();
        this.resourceName = resourceName;
        SurfaceEglRenderer surfaceEglRenderer = new SurfaceEglRenderer(resourceName);
        this.eglRenderer = surfaceEglRenderer;
        getHolder().addCallback(this);
        getHolder().addCallback(surfaceEglRenderer);
    }

    private String getResourceName() {
        try {
            return getResources().getResourceEntryName(getId());
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFrameResolutionChanged$0(int i13, int i14) {
        this.rotatedFrameWidth = i13;
        this.rotatedFrameHeight = i14;
        updateSurfaceSize();
        requestLayout();
    }

    private void logD(String str) {
        Logging.m49570d(TAG, this.resourceName + ": " + str);
    }

    private void postOrRun(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    private void updateSurfaceSize() {
        ThreadUtils.checkIsOnMainThread();
        if (!this.enableFixedSize || this.rotatedFrameWidth == 0 || this.rotatedFrameHeight == 0 || getWidth() == 0 || getHeight() == 0) {
            this.surfaceHeight = 0;
            this.surfaceWidth = 0;
            getHolder().setSizeFromLayout();
            return;
        }
        float width = getWidth() / getHeight();
        int i13 = this.rotatedFrameWidth;
        int i14 = this.rotatedFrameHeight;
        if (i13 / i14 > width) {
            i13 = (int) (i14 * width);
        } else {
            i14 = (int) (i13 / width);
        }
        int iMin = Math.min(getWidth(), i13);
        int iMin2 = Math.min(getHeight(), i14);
        int width2 = getWidth();
        int height = getHeight();
        int i15 = this.rotatedFrameWidth;
        int i16 = this.rotatedFrameHeight;
        int i17 = this.surfaceWidth;
        int i18 = this.surfaceHeight;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(width2, height, "updateSurfaceSize. Layout size: ", "x", ", frame size: ");
        AbstractC30802r.m94773v(sbM30465s, i15, "x", i16, ", requested surface size: ");
        AbstractC30802r.m94773v(sbM30465s, iMin, "x", iMin2, ", old surface size: ");
        sbM30465s.append(i17);
        sbM30465s.append("x");
        sbM30465s.append(i18);
        logD(sbM30465s.toString());
        if (iMin == this.surfaceWidth && iMin2 == this.surfaceHeight) {
            return;
        }
        this.surfaceWidth = iMin;
        this.surfaceHeight = iMin2;
        getHolder().setFixedSize(iMin, iMin2);
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f13, RendererCommon.GlDrawer glDrawer) {
        this.eglRenderer.addFrameListener(frameListener, f13, glDrawer);
    }

    public void clearFrame() {
        this.eglRenderer.clearFrame();
    }

    public void clearImage() {
        this.eglRenderer.clearImage();
    }

    public void disableFpsReduction() {
        this.eglRenderer.disableFpsReduction();
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents) {
        init(context, rendererEvents, EglBase.CONFIG_PLAIN, new GlRectDrawer());
    }

    @Override // hms.webrtc.RendererCommon.RendererEvents
    public void onFirstFrameRendered() {
        RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents != null) {
            rendererEvents.onFirstFrameRendered();
        }
    }

    @Override // hms.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        this.eglRenderer.onFrame(videoFrame);
    }

    @Override // hms.webrtc.RendererCommon.RendererEvents
    public void onFrameResolutionChanged(int i13, int i14, int i15) {
        RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents != null) {
            rendererEvents.onFrameResolutionChanged(i13, i14, i15);
        }
        int i16 = (i15 == 0 || i15 == 180) ? i13 : i14;
        if (i15 == 0 || i15 == 180) {
            i13 = i14;
        }
        postOrRun(new RunnableC5502c(this, i16, i13, 2));
    }

    @Override // android.view.View
    public void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        ThreadUtils.checkIsOnMainThread();
        this.eglRenderer.setLayoutAspectRatio((i15 - i13) / (i16 - i14));
        updateSurfaceSize();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i13, int i14) {
        ThreadUtils.checkIsOnMainThread();
        Point pointMeasure = this.videoLayoutMeasure.measure(i13, i14, this.rotatedFrameWidth, this.rotatedFrameHeight);
        setMeasuredDimension(pointMeasure.x, pointMeasure.y);
        logD(AbstractC2875y.m8294g(pointMeasure.x, pointMeasure.y, "onMeasure(). New size: ", "x"));
    }

    public void pauseVideo() {
        this.eglRenderer.pauseVideo();
    }

    public void release() {
        this.eglRenderer.release();
    }

    public void removeFrameListener(EglRenderer.FrameListener frameListener) {
        this.eglRenderer.removeFrameListener(frameListener);
    }

    public void setEnableHardwareScaler(boolean z4) {
        ThreadUtils.checkIsOnMainThread();
        this.enableFixedSize = z4;
        updateSurfaceSize();
    }

    public void setFpsReduction(float f13) {
        this.eglRenderer.setFpsReduction(f13);
    }

    public void setMirror(boolean z4) {
        this.eglRenderer.setMirror(z4);
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType);
        requestLayout();
    }

    public void setTranslationMatrix(Matrix matrix) {
        ThreadUtils.checkIsOnMainThread();
        this.eglRenderer.setTranslationMatrix(matrix);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i13, int i14, int i15) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        this.surfaceHeight = 0;
        this.surfaceWidth = 0;
        updateSurfaceSize();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f13) {
        this.eglRenderer.addFrameListener(frameListener, f13);
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents;
        this.rotatedFrameWidth = 0;
        this.rotatedFrameHeight = 0;
        this.eglRenderer.init(context, this, iArr, glDrawer);
    }

    public void setScalingType(RendererCommon.ScalingType scalingType, RendererCommon.ScalingType scalingType2) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType, scalingType2);
        requestLayout();
    }

    public SurfaceViewRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        String resourceName = getResourceName();
        this.resourceName = resourceName;
        SurfaceEglRenderer surfaceEglRenderer = new SurfaceEglRenderer(resourceName);
        this.eglRenderer = surfaceEglRenderer;
        getHolder().addCallback(this);
        getHolder().addCallback(surfaceEglRenderer);
    }
}
