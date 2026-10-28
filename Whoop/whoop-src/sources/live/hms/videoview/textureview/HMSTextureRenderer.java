package live.hms.videoview.textureview;

import android.graphics.SurfaceTexture;
import android.util.Log;
import hms.webrtc.EglBase;
import hms.webrtc.GlRectDrawer;
import hms.webrtc.RendererCommon;
import hms.webrtc.RunnableC17485i;
import hms.webrtc.SurfaceEglRenderer;
import hms.webrtc.ThreadUtils;
import hms.webrtc.VideoSink;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import l83.C23454a0;
import l83.InterfaceC23462h;
import lc0.C23821c;
import live.hms.video.media.tracks.HMSVideoTrack;
import live.hms.video.utils.SharedEglContext;
import live.hms.videoview.VideoViewStateChangeListener;
import live.hms.videoview.common.VideoTrackManager;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u001a\u0010\"\u001a\u00020!8\u0006X\u0086D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, m65681d2 = {"Llive/hms/videoview/textureview/HMSTextureRenderer;", "", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "<init>", "(Landroid/graphics/SurfaceTexture;)V", "Ll83/a0;", "init", "()V", "release", "removeTrack", "Llive/hms/video/media/tracks/HMSVideoTrack;", "getTrack", "()Llive/hms/video/media/tracks/HMSVideoTrack;", "track", "addTrack", "(Llive/hms/video/media/tracks/HMSVideoTrack;)V", "", "enableBlackFrame", "(Llive/hms/video/media/tracks/HMSVideoTrack;Z)V", "Llive/hms/videoview/VideoViewStateChangeListener;", "videoViewStateChangeListener", "addVideoViewStateChangeListener", "(Llive/hms/videoview/VideoViewStateChangeListener;)V", "isDisabled", "disableAutoSimulcastLayerSelect", "(Z)V", "", "width", "height", "displayResolution", "(II)V", "Landroid/graphics/SurfaceTexture;", "", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "Lhms/webrtc/SurfaceEglRenderer;", "renderer", "Lhms/webrtc/SurfaceEglRenderer;", "Llive/hms/videoview/common/VideoTrackManager;", "videoTrackManager$delegate", "Ll83/h;", "getVideoTrackManager", "()Llive/hms/videoview/common/VideoTrackManager;", "videoTrackManager", "videoview_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSTextureRenderer {
    private final String TAG;
    private SurfaceEglRenderer renderer;
    private final SurfaceTexture surfaceTexture;

    /* JADX INFO: renamed from: videoTrackManager$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h videoTrackManager;

    public HMSTextureRenderer(SurfaceTexture surfaceTexture) {
        AbstractC22676k.m65750j(surfaceTexture, "surfaceTexture");
        this.surfaceTexture = surfaceTexture;
        this.TAG = "HMSTextureRenderer";
        this.videoTrackManager = AbstractC30060g.m92088H(new C24414a(this, 0));
    }

    public static /* synthetic */ void addTrack$default(HMSTextureRenderer hMSTextureRenderer, HMSVideoTrack hMSVideoTrack, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        hMSTextureRenderer.addTrack(hMSVideoTrack, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VideoTrackManager getVideoTrackManager() {
        return (VideoTrackManager) this.videoTrackManager.getValue();
    }

    private final void init() {
        SurfaceEglRenderer surfaceEglRenderer = new SurfaceEglRenderer(UUID.randomUUID().toString());
        ThreadUtils.checkIsOnMainThread();
        surfaceEglRenderer.init(SharedEglContext.INSTANCE.getContext(), new HMSTextureRenderer$init$1$1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        surfaceEglRenderer.createEglSurface(this.surfaceTexture);
        this.renderer = surfaceEglRenderer;
    }

    private final void release() {
        if (this.renderer == null) {
            Log.d(this.TAG, "HMSTextureRenderer Release called without init ");
            return;
        }
        ThreadUtils.checkIsOnMainThread();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        SurfaceEglRenderer surfaceEglRenderer = this.renderer;
        if (surfaceEglRenderer != null) {
            surfaceEglRenderer.releaseEglSurface(new RunnableC17485i(countDownLatch, 1));
        }
        ThreadUtils.awaitUninterruptibly(countDownLatch);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VideoTrackManager videoTrackManager_delegate$lambda$4(HMSTextureRenderer this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        return new VideoTrackManager(new C24414a(this$0, 1), new C23821c(this$0, 5), new C24414a(this$0, 2), new C24414a(this$0, 3), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VideoSink videoTrackManager_delegate$lambda$4$lambda$0(HMSTextureRenderer this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        SurfaceEglRenderer surfaceEglRenderer = this$0.renderer;
        AbstractC22676k.m65747g(surfaceEglRenderer);
        return surfaceEglRenderer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 videoTrackManager_delegate$lambda$4$lambda$1(HMSTextureRenderer this$0, RendererCommon.RendererEvents it) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(it, "it");
        this$0.init();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 videoTrackManager_delegate$lambda$4$lambda$2(HMSTextureRenderer this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        this$0.release();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 videoTrackManager_delegate$lambda$4$lambda$3(HMSTextureRenderer this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        SurfaceEglRenderer surfaceEglRenderer = this$0.renderer;
        if (surfaceEglRenderer != null) {
            surfaceEglRenderer.clearFrame();
        }
        return C23454a0.f92919a;
    }

    public final void addTrack(HMSVideoTrack track) {
        AbstractC22676k.m65750j(track, "track");
        VideoTrackManager.addTrack$default(getVideoTrackManager(), track, false, 2, null);
    }

    public final void addVideoViewStateChangeListener(VideoViewStateChangeListener videoViewStateChangeListener) {
        getVideoTrackManager().setVideoViewStateChangeListener$videoview_release(videoViewStateChangeListener);
    }

    public final void disableAutoSimulcastLayerSelect(boolean isDisabled) {
        getVideoTrackManager().disableAutoSimulcastLayerSelect$videoview_release(isDisabled);
    }

    public final void displayResolution(int width, int height) {
        getVideoTrackManager().onSizeChanged$videoview_release(width, height);
    }

    public final String getTAG() {
        return this.TAG;
    }

    public final HMSVideoTrack getTrack() {
        return getVideoTrackManager().getCurrentTrack();
    }

    public final void removeTrack() {
        getVideoTrackManager().removeTrack$videoview_release();
    }

    public final void addTrack(HMSVideoTrack track, boolean enableBlackFrame) {
        AbstractC22676k.m65750j(track, "track");
        getVideoTrackManager().addTrack(track, enableBlackFrame);
    }
}
