package live.hms.videoview;

import android.content.Context;
import android.graphics.Matrix;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import c93.InterfaceC4339a;
import l83.InterfaceC23462h;
import live.hms.video.connection.degredation.C24117a;
import live.hms.video.video.utils.gesture.PanGestureDetector;
import live.hms.video.video.utils.gesture.ZoomGestureDetector;
import live.hms.video.video.utils.matrix.MatrixManager;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 @2\u00020\u0001:\u0002@AB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010$\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\nH\u0000¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u00104R\"\u00106\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010\u001fR\"\u0010;\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010#¨\u0006B"}, m65681d2 = {"Llive/hms/videoview/ZoomPanManager;", "Llive/hms/video/video/utils/matrix/MatrixManager$Callback;", "Landroid/content/Context;", "context", "Llive/hms/videoview/ZoomPanManager$ZoomPanCallBack;", "zoomPanCallBack", "<init>", "(Landroid/content/Context;Llive/hms/videoview/ZoomPanManager$ZoomPanCallBack;)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "shouldInterceptGesture$videoview_release", "(Landroid/view/MotionEvent;)Z", "shouldInterceptGesture", "", "width", "height", "Ll83/a0;", "setContainerSize$videoview_release", "(II)V", "setContainerSize", "Landroid/graphics/Matrix;", "matrix", "onMatrixUpdate", "(Landroid/graphics/Matrix;)V", "resetZoomAndPan$videoview_release", "()V", "resetZoomAndPan", "", "zoom", "setMaxZoom$videoview_release", "(F)V", "setMaxZoom", "enable", "enableZoomAndPan$videoview_release", "(Z)V", "enableZoomAndPan", "Llive/hms/videoview/ZoomPanManager$ZoomPanCallBack;", "Llive/hms/video/video/utils/matrix/MatrixManager;", "matrixManager$delegate", "Ll83/h;", "getMatrixManager", "()Llive/hms/video/video/utils/matrix/MatrixManager;", "matrixManager", "Llive/hms/video/video/utils/gesture/ZoomGestureDetector;", "zoomGestureDetector$delegate", "getZoomGestureDetector", "()Llive/hms/video/video/utils/gesture/ZoomGestureDetector;", "zoomGestureDetector", "Llive/hms/video/video/utils/gesture/PanGestureDetector;", "panGestureDetector$delegate", "getPanGestureDetector", "()Llive/hms/video/video/utils/gesture/PanGestureDetector;", "panGestureDetector", "currentZoom", "F", "getCurrentZoom$videoview_release", "()F", "setCurrentZoom$videoview_release", "isZoomEnabled", "Z", "isZoomEnabled$videoview_release", "()Z", "setZoomEnabled$videoview_release", "Companion", "ZoomPanCallBack", "videoview_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class ZoomPanManager implements MatrixManager.Callback {
    private float currentZoom;
    private boolean isZoomEnabled;

    /* JADX INFO: renamed from: matrixManager$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h matrixManager;

    /* JADX INFO: renamed from: panGestureDetector$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h panGestureDetector;

    /* JADX INFO: renamed from: zoomGestureDetector$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h zoomGestureDetector;
    private final ZoomPanCallBack zoomPanCallBack;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float MIN_ZOOM = 1.0f;
    private static final float MAX_ZOOM = 3.0f;

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, m65681d2 = {"Llive/hms/videoview/ZoomPanManager$Companion;", "", "<init>", "()V", "MIN_ZOOM", "", "getMIN_ZOOM", "()F", "MAX_ZOOM", "getMAX_ZOOM", "videoview_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getMAX_ZOOM() {
            return ZoomPanManager.MAX_ZOOM;
        }

        public final float getMIN_ZOOM() {
            return ZoomPanManager.MIN_ZOOM;
        }

        private Companion() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Llive/hms/videoview/ZoomPanManager$ZoomPanCallBack;", "", "Landroid/graphics/Matrix;", "translationMatrix", "Ll83/a0;", "onMatrixUpdate", "(Landroid/graphics/Matrix;)V", "videoview_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public interface ZoomPanCallBack {
        void onMatrixUpdate(Matrix translationMatrix);
    }

    public ZoomPanManager(final Context context, ZoomPanCallBack zoomPanCallBack) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(zoomPanCallBack, "zoomPanCallBack");
        this.zoomPanCallBack = zoomPanCallBack;
        this.matrixManager = AbstractC30060g.m92088H(new C24117a(this, 5));
        final int i13 = 0;
        this.zoomGestureDetector = AbstractC30060g.m92088H(new InterfaceC4339a() { // from class: live.hms.videoview.b
            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return ZoomPanManager.zoomGestureDetector_delegate$lambda$1(context, this);
                    default:
                        return ZoomPanManager.panGestureDetector_delegate$lambda$2(context, this);
                }
            }
        });
        final int i14 = 1;
        this.panGestureDetector = AbstractC30060g.m92088H(new InterfaceC4339a() { // from class: live.hms.videoview.b
            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return ZoomPanManager.zoomGestureDetector_delegate$lambda$1(context, this);
                    default:
                        return ZoomPanManager.panGestureDetector_delegate$lambda$2(context, this);
                }
            }
        });
        this.currentZoom = MAX_ZOOM;
    }

    private final MatrixManager getMatrixManager() {
        return (MatrixManager) this.matrixManager.getValue();
    }

    private final PanGestureDetector getPanGestureDetector() {
        return (PanGestureDetector) this.panGestureDetector.getValue();
    }

    private final ZoomGestureDetector getZoomGestureDetector() {
        return (ZoomGestureDetector) this.zoomGestureDetector.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatrixManager matrixManager_delegate$lambda$0(ZoomPanManager this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        return new MatrixManager(this$0, this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PanGestureDetector panGestureDetector_delegate$lambda$2(Context context, ZoomPanManager this$0) {
        AbstractC22676k.m65750j(context, "$context");
        AbstractC22676k.m65750j(this$0, "this$0");
        return new PanGestureDetector(context, this$0.getMatrixManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ZoomGestureDetector zoomGestureDetector_delegate$lambda$1(Context context, ZoomPanManager this$0) {
        AbstractC22676k.m65750j(context, "$context");
        AbstractC22676k.m65750j(this$0, "this$0");
        return new ZoomGestureDetector(context, this$0.getMatrixManager());
    }

    public final void enableZoomAndPan$videoview_release(boolean enable) {
        this.isZoomEnabled = enable;
    }

    /* JADX INFO: renamed from: getCurrentZoom$videoview_release, reason: from getter */
    public final float getCurrentZoom() {
        return this.currentZoom;
    }

    /* JADX INFO: renamed from: isZoomEnabled$videoview_release, reason: from getter */
    public final boolean getIsZoomEnabled() {
        return this.isZoomEnabled;
    }

    @Override // live.hms.video.video.utils.matrix.MatrixManager.Callback
    public void onMatrixUpdate(Matrix matrix) {
        AbstractC22676k.m65750j(matrix, "matrix");
        this.zoomPanCallBack.onMatrixUpdate(matrix);
    }

    public final void resetZoomAndPan$videoview_release() {
        getMatrixManager().reset$videoview_release();
    }

    public final void setContainerSize$videoview_release(int width, int height) {
        getMatrixManager().setContainerSize$videoview_release(width, height, true);
    }

    public final void setCurrentZoom$videoview_release(float f13) {
        this.currentZoom = f13;
    }

    public final void setMaxZoom$videoview_release(float zoom) {
        this.currentZoom = zoom;
    }

    public final void setZoomEnabled$videoview_release(boolean z4) {
        this.isZoomEnabled = z4;
    }

    public final boolean shouldInterceptGesture$videoview_release(MotionEvent event) {
        AbstractC22676k.m65750j(event, "event");
        if (this.isZoomEnabled) {
            return getZoomGestureDetector().interceptTouch$videoview_release(event) || getPanGestureDetector().interceptTouch$videoview_release(event);
        }
        return false;
    }
}
