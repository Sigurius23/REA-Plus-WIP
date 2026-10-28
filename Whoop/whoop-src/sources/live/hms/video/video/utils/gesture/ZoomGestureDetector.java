package live.hms.video.video.utils.gesture;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import androidx.core.app.NotificationCompat;
import live.hms.video.video.utils.matrix.MatrixManager;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Llive/hms/video/video/utils/gesture/ZoomGestureDetector;", "Landroid/view/ScaleGestureDetector$OnScaleGestureListener;", "Landroid/content/Context;", "context", "Llive/hms/video/video/utils/matrix/MatrixManager;", "matrixManager", "<init>", "(Landroid/content/Context;Llive/hms/video/video/utils/matrix/MatrixManager;)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "interceptTouch$videoview_release", "(Landroid/view/MotionEvent;)Z", "interceptTouch", "Landroid/view/ScaleGestureDetector;", "detector", "onScaleBegin", "(Landroid/view/ScaleGestureDetector;)Z", "onScale", "Ll83/a0;", "onScaleEnd", "(Landroid/view/ScaleGestureDetector;)V", "Llive/hms/video/video/utils/matrix/MatrixManager;", "Landroid/view/ScaleGestureDetector;", "Landroid/graphics/PointF;", "currentFocusPoint", "Landroid/graphics/PointF;", "videoview_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class ZoomGestureDetector implements ScaleGestureDetector.OnScaleGestureListener {
    private final PointF currentFocusPoint;
    private final ScaleGestureDetector detector;
    private final MatrixManager matrixManager;

    public ZoomGestureDetector(Context context, MatrixManager matrixManager) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(matrixManager, "matrixManager");
        this.matrixManager = matrixManager;
        this.detector = new ScaleGestureDetector(context, this);
        this.currentFocusPoint = new PointF(0.0f, 0.0f);
    }

    public final boolean interceptTouch$videoview_release(MotionEvent event) {
        AbstractC22676k.m65750j(event, "event");
        return this.detector.onTouchEvent(event);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector detector) {
        AbstractC22676k.m65750j(detector, "detector");
        this.currentFocusPoint.set(detector.getFocusX(), detector.getFocusY());
        this.matrixManager.onZoom$videoview_release(this.currentFocusPoint, detector.getScaleFactor());
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector detector) {
        AbstractC22676k.m65750j(detector, "detector");
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector detector) {
        AbstractC22676k.m65750j(detector, "detector");
    }
}
