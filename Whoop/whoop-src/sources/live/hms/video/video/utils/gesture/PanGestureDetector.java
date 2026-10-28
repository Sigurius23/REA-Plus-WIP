package live.hms.video.video.utils.gesture;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import live.hms.video.video.utils.matrix.MatrixManager;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m65681d2 = {"Llive/hms/video/video/utils/gesture/PanGestureDetector;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "context", "Landroid/content/Context;", "matrixManager", "Llive/hms/video/video/utils/matrix/MatrixManager;", "<init>", "(Landroid/content/Context;Llive/hms/video/video/utils/matrix/MatrixManager;)V", "onScroll", "", "e1", "Landroid/view/MotionEvent;", "e2", "distanceX", "", "distanceY", "detector", "Landroid/view/GestureDetector;", "interceptTouch", NotificationCompat.CATEGORY_EVENT, "interceptTouch$videoview_release", "videoview_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class PanGestureDetector extends GestureDetector.SimpleOnGestureListener {
    private final GestureDetector detector;
    private final MatrixManager matrixManager;

    public PanGestureDetector(Context context, MatrixManager matrixManager) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(matrixManager, "matrixManager");
        this.matrixManager = matrixManager;
        this.detector = new GestureDetector(context, this);
    }

    public final boolean interceptTouch$videoview_release(MotionEvent event) {
        AbstractC22676k.m65750j(event, "event");
        return this.detector.onTouchEvent(event);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent e5, MotionEvent e13, float distanceX, float distanceY) {
        AbstractC22676k.m65750j(e13, "e2");
        this.matrixManager.onPan$videoview_release(distanceX, -distanceY);
        return true;
    }
}
