package live.hms.video.video.utils.matrix;

import android.graphics.Matrix;
import android.graphics.PointF;
import e93.AbstractC12889b;
import live.hms.videoview.ZoomPanManager;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001:B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001e\u0010\u0016J\u001f\u0010$\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\"\u0010#J\u000f\u0010&\u001a\u00020\bH\u0000¢\u0006\u0004\b%\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u001a\u0010*\u001a\u00020)8\u0006X\u0086D¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00105\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R\u0014\u00106\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b6\u0010/R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, m65681d2 = {"Llive/hms/video/video/utils/matrix/MatrixManager;", "", "Llive/hms/videoview/ZoomPanManager;", "zoomPanManager", "Llive/hms/video/video/utils/matrix/MatrixManager$Callback;", "callback", "<init>", "(Llive/hms/videoview/ZoomPanManager;Llive/hms/video/video/utils/matrix/MatrixManager$Callback;)V", "Ll83/a0;", "limitToBoundary", "()V", "", "currentScale", "scaleFactor", "maxZoom", "minZoom", "applyScaleWithLimit", "(FFFF)F", "Landroid/graphics/PointF;", "currentFocusPoint", "scaleMultiplier", "applyScale", "(Landroid/graphics/PointF;F)V", "width", "height", "", "forceReset", "setContainerSize$videoview_release", "(FFZ)V", "setContainerSize", "onZoom$videoview_release", "onZoom", "distanceX", "distanceY", "onPan$videoview_release", "(FF)V", "onPan", "reset$videoview_release", "reset", "Llive/hms/videoview/ZoomPanManager;", "Llive/hms/video/video/utils/matrix/MatrixManager$Callback;", "", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "containerWidth", "F", "containerHeight", "Landroid/graphics/Matrix;", "scaleMatrix", "Landroid/graphics/Matrix;", "outputMatrix", "boundaryFixMatrix", "totalWidth", "", "value", "[F", "Callback", "videoview_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class MatrixManager {
    private final String TAG;
    private final Matrix boundaryFixMatrix;
    private final Callback callback;
    private float containerHeight;
    private float containerWidth;
    private final Matrix outputMatrix;
    private final Matrix scaleMatrix;
    private final float totalWidth;
    private final float[] value;
    private final ZoomPanManager zoomPanManager;

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Llive/hms/video/video/utils/matrix/MatrixManager$Callback;", "", "Landroid/graphics/Matrix;", "matrix", "Ll83/a0;", "onMatrixUpdate", "(Landroid/graphics/Matrix;)V", "videoview_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public interface Callback {
        void onMatrixUpdate(Matrix matrix);
    }

    public MatrixManager(ZoomPanManager zoomPanManager, Callback callback) {
        AbstractC22676k.m65750j(zoomPanManager, "zoomPanManager");
        AbstractC22676k.m65750j(callback, "callback");
        this.zoomPanManager = zoomPanManager;
        this.callback = callback;
        this.TAG = "MatrixManager";
        this.scaleMatrix = new Matrix();
        this.outputMatrix = new Matrix();
        this.boundaryFixMatrix = new Matrix();
        this.totalWidth = 1.0f;
        this.value = new float[9];
    }

    private final void applyScale(PointF currentFocusPoint, float scaleMultiplier) {
        float f13 = currentFocusPoint.x / this.containerWidth;
        float f14 = 1.0f - (currentFocusPoint.y / this.containerHeight);
        this.outputMatrix.getValues(this.value);
        float fApplyScaleWithLimit$default = 1 / applyScaleWithLimit$default(this, 1.0f / this.value[0], scaleMultiplier, 0.0f, 0.0f, 12, null);
        Matrix matrix = this.scaleMatrix;
        matrix.reset();
        matrix.preTranslate(f13, f14);
        matrix.preScale(fApplyScaleWithLimit$default, fApplyScaleWithLimit$default);
        matrix.preTranslate(-f13, -f14);
        this.outputMatrix.preConcat(this.scaleMatrix);
        limitToBoundary();
    }

    private final float applyScaleWithLimit(float currentScale, float scaleFactor, float maxZoom, float minZoom) {
        if (currentScale * scaleFactor > maxZoom) {
            scaleFactor = maxZoom / currentScale;
        }
        return currentScale * scaleFactor < minZoom ? minZoom / currentScale : scaleFactor;
    }

    public static /* synthetic */ float applyScaleWithLimit$default(MatrixManager matrixManager, float f13, float f14, float f15, float f16, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            f15 = matrixManager.zoomPanManager.getCurrentZoom();
        }
        if ((i13 & 8) != 0) {
            f16 = ZoomPanManager.INSTANCE.getMIN_ZOOM();
        }
        return matrixManager.applyScaleWithLimit(f13, f14, f15, f16);
    }

    private final void limitToBoundary() {
        this.outputMatrix.getValues(this.value);
        float[] fArr = this.value;
        float f13 = fArr[2];
        float f14 = fArr[5];
        boolean z4 = false;
        float f15 = 1.0f / fArr[0];
        this.boundaryFixMatrix.reset();
        boolean z13 = true;
        if (f13 < 0.0f) {
            this.boundaryFixMatrix.postTranslate(-f13, 0.0f);
            z4 = true;
        }
        if (f14 < 0.0f) {
            this.boundaryFixMatrix.postTranslate(0.0f, -f14);
            z4 = true;
        }
        float f16 = this.totalWidth;
        float f17 = f16 - (f16 / f15);
        if (f13 > f17) {
            this.boundaryFixMatrix.postTranslate(-(f13 - f17), 0.0f);
            z4 = true;
        }
        if (f14 > f17) {
            this.boundaryFixMatrix.postTranslate(0.0f, -(f14 - f17));
        } else {
            z13 = z4;
        }
        if (z13) {
            this.outputMatrix.postConcat(this.boundaryFixMatrix);
        }
        this.outputMatrix.getValues(this.value);
        this.callback.onMatrixUpdate(this.outputMatrix);
    }

    public final String getTAG() {
        return this.TAG;
    }

    public final void onPan$videoview_release(float distanceX, float distanceY) {
        if (this.containerWidth == 0.0f) {
            return;
        }
        float f13 = this.containerHeight;
        if (f13 == 0.0f) {
            return;
        }
        float fM36283m = AbstractC12889b.m36283m(distanceY / f13, -1.0f, 1.0f);
        this.outputMatrix.preTranslate(AbstractC12889b.m36283m(distanceX / this.containerWidth, -1.0f, 1.0f), fM36283m);
        limitToBoundary();
    }

    public final void onZoom$videoview_release(PointF currentFocusPoint, float scaleMultiplier) {
        AbstractC22676k.m65750j(currentFocusPoint, "currentFocusPoint");
        if (this.containerWidth == 0.0f || this.containerHeight == 0.0f) {
            return;
        }
        applyScale(currentFocusPoint, scaleMultiplier);
    }

    public final void reset$videoview_release() {
        this.outputMatrix.reset();
        this.callback.onMatrixUpdate(this.outputMatrix);
    }

    public final void setContainerSize$videoview_release(float width, float height, boolean forceReset) {
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        if (width == this.containerWidth && height == this.containerHeight && !forceReset) {
            return;
        }
        this.containerWidth = width;
        this.containerHeight = height;
    }
}
