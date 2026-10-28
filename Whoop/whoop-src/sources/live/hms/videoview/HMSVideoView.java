package live.hms.videoview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import hms.webrtc.EglRenderer;
import hms.webrtc.RendererCommon;
import hms.webrtc.SurfaceViewRenderer;
import hms.webrtc.VideoSink;
import io.sentry.android.core.RunnableC20151r0;
import l83.C23454a0;
import l83.InterfaceC23462h;
import lc0.C23821c;
import live.hms.video.media.tracks.HMSLocalVideoTrack;
import live.hms.video.media.tracks.HMSRemoteVideoTrack;
import live.hms.video.media.tracks.HMSVideoTrack;
import live.hms.video.sdk.HmsVideoFrameListener;
import live.hms.video.utils.SharedEglContext;
import live.hms.videoview.common.VideoTrackManager;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0011¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00112\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J-\u0010/\u001a\u00020\u00112\u0014\u0010,\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0004\u0012\u00020\u00110*2\b\b\u0002\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u000b¢\u0006\u0004\b2\u0010#J\u0017\u00105\u001a\u00020\u00112\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0011H\u0014¢\u0006\u0004\b7\u0010%R\u0018\u00108\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010<\u001a\u0004\bB\u0010C¨\u0006E"}, m65681d2 = {"Llive/hms/videoview/HMSVideoView;", "Lhms/webrtc/SurfaceViewRenderer;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attributeSet", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "widthSpec", "heightSpec", "Ll83/a0;", "onMeasure", "(II)V", "Llive/hms/video/media/tracks/HMSVideoTrack;", "track", "addTrack", "(Llive/hms/video/media/tracks/HMSVideoTrack;)V", "getTrack", "()Llive/hms/video/media/tracks/HMSVideoTrack;", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "isDisabled", "disableAutoSimulcastLayerSelect", "(Z)V", "removeTrack", "()V", "Llive/hms/videoview/VideoViewStateChangeListener;", "videoViewStateChangeListener", "addVideoViewStateChangeListener", "(Llive/hms/videoview/VideoViewStateChangeListener;)V", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "onBitmap", "", "scale", "captureBitmap", "(Lkotlin/jvm/functions/Function1;F)V", "isEnabled", "enableZoomAndPan", "Lhms/webrtc/RendererCommon$ScalingType;", "scalingType", "setScalingType", "(Lhms/webrtc/RendererCommon$ScalingType;)V", "onDetachedFromWindow", "currentScalingType", "Lhms/webrtc/RendererCommon$ScalingType;", "Llive/hms/videoview/common/VideoTrackManager;", "videoTrackManager$delegate", "Ll83/h;", "getVideoTrackManager", "()Llive/hms/videoview/common/VideoTrackManager;", "videoTrackManager", "Llive/hms/videoview/ZoomPanManager;", "zoomPanManager$delegate", "getZoomPanManager", "()Llive/hms/videoview/ZoomPanManager;", "zoomPanManager", "videoview_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSVideoView extends SurfaceViewRenderer {
    private RendererCommon.ScalingType currentScalingType;

    /* JADX INFO: renamed from: videoTrackManager$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h videoTrackManager;

    /* JADX INFO: renamed from: zoomPanManager$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h zoomPanManager;

    /* JADX INFO: renamed from: live.hms.videoview.HMSVideoView$captureBitmap$2 */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"live/hms/videoview/HMSVideoView$captureBitmap$2", "Lhms/webrtc/EglRenderer$FrameListener;", "Landroid/graphics/Bitmap;", "bitmap", "Ll83/a0;", "onFrame", "(Landroid/graphics/Bitmap;)V", "videoview_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C244102 implements EglRenderer.FrameListener {
        final /* synthetic */ Function1 $onBitmap;
        final /* synthetic */ HMSVideoView this$0;

        public C244102(Function1 function1, HMSVideoView hMSVideoView) {
            this.$onBitmap = function1;
            this.this$0 = hMSVideoView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onFrame$lambda$0(HMSVideoView this$0, C244102 this$1) {
            AbstractC22676k.m65750j(this$0, "this$0");
            AbstractC22676k.m65750j(this$1, "this$1");
            this$0.removeFrameListener(this$1);
        }

        @Override // hms.webrtc.EglRenderer.FrameListener
        public void onFrame(Bitmap bitmap) {
            this.$onBitmap.invoke(bitmap);
            new Handler(Looper.getMainLooper()).post(new RunnableC20151r0(17, this.this$0, this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSVideoView(Context context) {
        super(context);
        AbstractC22676k.m65750j(context, "context");
        this.videoTrackManager = AbstractC30060g.m92088H(new C24412a(this, 0));
        this.zoomPanManager = AbstractC30060g.m92088H(new C24412a(this, 1));
    }

    public static /* synthetic */ void captureBitmap$default(HMSVideoView hMSVideoView, Function1 function1, float f13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            f13 = 1.0f;
        }
        hMSVideoView.captureBitmap(function1, f13);
    }

    private final VideoTrackManager getVideoTrackManager() {
        return (VideoTrackManager) this.videoTrackManager.getValue();
    }

    private final ZoomPanManager getZoomPanManager() {
        return (ZoomPanManager) this.zoomPanManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VideoTrackManager videoTrackManager_delegate$lambda$4(HMSVideoView this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        return new VideoTrackManager(new C24412a(this$0, 2), new C23821c(this$0, 4), new C24412a(this$0, 3), new C24412a(this$0, 4), false, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VideoSink videoTrackManager_delegate$lambda$4$lambda$0(HMSVideoView this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        return this$0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 videoTrackManager_delegate$lambda$4$lambda$1(HMSVideoView this$0, RendererCommon.RendererEvents it) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(it, "it");
        this$0.init(SharedEglContext.INSTANCE.getContext(), it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 videoTrackManager_delegate$lambda$4$lambda$2(HMSVideoView this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        this$0.release();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 videoTrackManager_delegate$lambda$4$lambda$3(HMSVideoView this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        this$0.clearFrame();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ZoomPanManager zoomPanManager_delegate$lambda$5(final HMSVideoView this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        Context context = this$0.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        return new ZoomPanManager(context, new ZoomPanManager.ZoomPanCallBack() { // from class: live.hms.videoview.HMSVideoView$zoomPanManager$2$1
            @Override // live.hms.videoview.ZoomPanManager.ZoomPanCallBack
            public void onMatrixUpdate(Matrix translationMatrix) {
                AbstractC22676k.m65750j(translationMatrix, "translationMatrix");
                this.this$0.setTranslationMatrix(translationMatrix);
            }
        });
    }

    public final void addTrack(HMSVideoTrack track) {
        AbstractC22676k.m65750j(track, "track");
        if (track instanceof HMSRemoteVideoTrack) {
            Log.i("HMSVIDEOVIEW", "TRACK%%TRACK ADDED trackID: " + track.getTrackId() + " ssrc:" + ((HMSRemoteVideoTrack) track).getSsrc() + ' ');
        }
        VideoTrackManager.addTrack$default(getVideoTrackManager(), track, false, 2, null);
    }

    public final void addVideoViewStateChangeListener(VideoViewStateChangeListener videoViewStateChangeListener) {
        getVideoTrackManager().setVideoViewStateChangeListener$videoview_release(videoViewStateChangeListener);
    }

    public final void captureBitmap(final Function1 onBitmap, float scale) {
        AbstractC22676k.m65750j(onBitmap, "onBitmap");
        HMSVideoTrack currentTrack = getVideoTrackManager().getCurrentTrack();
        if (currentTrack instanceof HMSLocalVideoTrack) {
            ((HMSLocalVideoTrack) currentTrack).captureImageAtMaxPublishResolution(new HmsVideoFrameListener() { // from class: live.hms.videoview.HMSVideoView.captureBitmap.1
                @Override // live.hms.video.sdk.HmsVideoFrameListener
                public void onFrameCaptured(Bitmap bitmap) {
                    AbstractC22676k.m65750j(bitmap, "bitmap");
                    onBitmap.invoke(bitmap);
                }
            });
        } else {
            addFrameListener(new C244102(onBitmap, this), scale);
        }
    }

    public final void disableAutoSimulcastLayerSelect(boolean isDisabled) {
        getVideoTrackManager().disableAutoSimulcastLayerSelect$videoview_release(isDisabled);
    }

    public final void enableZoomAndPan(boolean isEnabled) {
        setFpsReduction(60.0f);
        getZoomPanManager().enableZoomAndPan$videoview_release(isEnabled);
    }

    public final HMSVideoTrack getTrack() {
        return getVideoTrackManager().getCurrentTrack();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeTrack();
    }

    @Override // hms.webrtc.SurfaceViewRenderer, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        getVideoTrackManager().onSizeChanged$videoview_release(Math.abs(left - right), Math.abs(top - bottom));
    }

    @Override // hms.webrtc.SurfaceViewRenderer, android.view.SurfaceView, android.view.View
    public void onMeasure(int widthSpec, int heightSpec) {
        super.onMeasure(widthSpec, heightSpec);
        getZoomPanManager().setContainerSize$videoview_release(getWidth(), getHeight());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        AbstractC22676k.m65750j(event, "event");
        return getZoomPanManager().shouldInterceptGesture$videoview_release(event) || super.onTouchEvent(event);
    }

    public final void removeTrack() {
        HMSVideoTrack track = getTrack();
        if (track instanceof HMSRemoteVideoTrack) {
            StringBuilder sb4 = new StringBuilder("TRACK%%TRACK remove trackID: ");
            HMSRemoteVideoTrack hMSRemoteVideoTrack = (HMSRemoteVideoTrack) track;
            sb4.append(hMSRemoteVideoTrack.getTrackId());
            sb4.append(" ssrc:");
            sb4.append(hMSRemoteVideoTrack.getSsrc());
            sb4.append(' ');
            Log.i("HMSVIDEOVIEW", sb4.toString());
        }
        getVideoTrackManager().removeTrack$videoview_release();
    }

    @Override // hms.webrtc.SurfaceViewRenderer
    public void setScalingType(RendererCommon.ScalingType scalingType) {
        AbstractC22676k.m65750j(scalingType, "scalingType");
        if (scalingType != this.currentScalingType) {
            super.setScalingType(scalingType);
            this.currentScalingType = scalingType;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(attributeSet, "attributeSet");
        this.videoTrackManager = AbstractC30060g.m92088H(new C24412a(this, 0));
        this.zoomPanManager = AbstractC30060g.m92088H(new C24412a(this, 1));
    }
}
