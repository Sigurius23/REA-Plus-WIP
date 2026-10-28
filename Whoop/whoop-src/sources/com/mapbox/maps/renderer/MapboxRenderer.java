package com.mapbox.maps.renderer;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.DelegatingMapClient;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.NativeMapImpl;
import com.mapbox.maps.RenderFrameFinished;
import com.mapbox.maps.RenderFrameFinishedCallback;
import com.mapbox.maps.RenderModeType;
import com.mapbox.maps.Size;
import com.mapbox.maps.renderer.p053gl.PixelReader;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import p012ab.C0680g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000 ]2\u00020\u0001:\u0001]B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\bJ\u001d\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\bJ\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\bJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001b\u0010\bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\bJ\u000f\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\u001e\u0010\"J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0014H\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00062\u0006\u0010!\u001a\u00020&H\u0007¢\u0006\u0004\b'\u0010(J\u0019\u0010+\u001a\u0004\u0018\u00010\u001d2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,R\"\u0010.\u001a\u00020-8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u0010\fR\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00108R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00108R*\u0010:\u001a\u0004\u0018\u0001098\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b:\u0010;\u0012\u0004\b@\u0010\b\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R(\u0010B\u001a\u00020A8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bB\u0010C\u0012\u0004\bH\u0010\b\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010O\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\f\n\u0004\bO\u0010P\u0012\u0004\bQ\u0010\bR*\u0010S\u001a\u00020)2\u0006\u0010R\u001a\u00020)8A@AX\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u0014\u0010\\\u001a\u00020Y8 X \u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[¨\u0006^"}, m65681d2 = {"Lcom/mapbox/maps/renderer/MapboxRenderer;", "Lcom/mapbox/maps/DelegatingMapClient;", "", "mapName", "<init>", "(Ljava/lang/String;)V", "Ll83/a0;", "onDestroy", "()V", "Lcom/mapbox/maps/NativeMapImpl;", "map", "setMap", "(Lcom/mapbox/maps/NativeMapImpl;)V", "scheduleRepaint", "Ljava/lang/Runnable;", "runnable", "queueRenderEvent", "(Ljava/lang/Runnable;)V", "queueNonRenderEvent", "createRenderer", "", "width", "height", "onSurfaceChanged", "(II)V", "destroyRenderer", "render", "onStop", "onStart", "Landroid/graphics/Bitmap;", "snapshot", "()Landroid/graphics/Bitmap;", "Lcom/mapbox/maps/MapView$OnSnapshotReady;", "listener", "(Lcom/mapbox/maps/MapView$OnSnapshotReady;)V", "fps", "setMaximumFps", "(I)V", "Lcom/mapbox/maps/renderer/OnFpsChangedListener;", "setOnFpsChangedListener", "(Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V", "", "legacyMode", "performSnapshot", "(Z)Landroid/graphics/Bitmap;", "Lcom/mapbox/maps/renderer/MapboxRenderThread;", "renderThread", "Lcom/mapbox/maps/renderer/MapboxRenderThread;", "getRenderThread$maps_sdk_release", "()Lcom/mapbox/maps/renderer/MapboxRenderThread;", "setRenderThread$maps_sdk_release", "(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V", "Lcom/mapbox/maps/NativeMapImpl;", "getMap$maps_sdk_release", "()Lcom/mapbox/maps/NativeMapImpl;", "setMap$maps_sdk_release", "I", "Lcom/mapbox/maps/renderer/gl/PixelReader;", "pixelReader", "Lcom/mapbox/maps/renderer/gl/PixelReader;", "getPixelReader$maps_sdk_release", "()Lcom/mapbox/maps/renderer/gl/PixelReader;", "setPixelReader$maps_sdk_release", "(Lcom/mapbox/maps/renderer/gl/PixelReader;)V", "getPixelReader$maps_sdk_release$annotations", "Ljava/util/concurrent/atomic/AtomicBoolean;", "readyForSnapshot", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getReadyForSnapshot$maps_sdk_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "setReadyForSnapshot$maps_sdk_release", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "getReadyForSnapshot$maps_sdk_release$annotations", "Lcom/mapbox/common/Cancelable;", "renderFrameCancelable", "Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/RenderFrameFinishedCallback;", "renderFrameFinishedCallback", "Lcom/mapbox/maps/RenderFrameFinishedCallback;", "TAG", "Ljava/lang/String;", "getTAG$annotations", "<set-?>", "snapshotLegacyModeEnabled", "Z", "getSnapshotLegacyModeEnabled$maps_sdk_release", "()Z", "setSnapshotLegacyModeEnabled$maps_sdk_release", "(Z)V", "Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;", "getWidgetRenderer$maps_sdk_release", "()Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;", "widgetRenderer", "Companion", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public abstract class MapboxRenderer implements DelegatingMapClient {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final RenderEvent repaintRenderEvent = new RenderEvent(null, true);
    private final String TAG;
    private int height;
    private NativeMapImpl map;
    private PixelReader pixelReader;
    private AtomicBoolean readyForSnapshot;
    private Cancelable renderFrameCancelable;
    private final RenderFrameFinishedCallback renderFrameFinishedCallback;
    public MapboxRenderThread renderThread;
    private boolean snapshotLegacyModeEnabled;
    private int width;

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/mapbox/maps/renderer/MapboxRenderer$Companion;", "", "()V", "repaintRenderEvent", "Lcom/mapbox/maps/renderer/RenderEvent;", "getRepaintRenderEvent$maps_sdk_release$annotations", "getRepaintRenderEvent$maps_sdk_release", "()Lcom/mapbox/maps/renderer/RenderEvent;", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getRepaintRenderEvent$maps_sdk_release$annotations() {
        }

        public final RenderEvent getRepaintRenderEvent$maps_sdk_release() {
            return MapboxRenderer.repaintRenderEvent;
        }

        private Companion() {
        }
    }

    public MapboxRenderer(String mapName) {
        AbstractC22676k.m65750j(mapName, "mapName");
        this.readyForSnapshot = new AtomicBoolean(false);
        this.renderFrameFinishedCallback = new C0680g0(this, 21);
        StringBuilder sb4 = new StringBuilder("Mbgl-Renderer");
        sb4.append(!AbstractC39414r.m125890i0(mapName) ? "\\".concat(mapName) : "");
        this.TAG = sb4.toString();
    }

    public static /* synthetic */ void getPixelReader$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void getReadyForSnapshot$maps_sdk_release$annotations() {
    }

    private static /* synthetic */ void getTAG$annotations() {
    }

    private final Bitmap performSnapshot(boolean legacyMode) {
        PixelReader pixelReader;
        PixelReader pixelReader2;
        if (this.width == 0 && this.height == 0) {
            MapboxLogger.logE(this.TAG, "Could not take map snapshot because map is not ready yet.");
            return null;
        }
        PixelReader pixelReader3 = this.pixelReader;
        if (pixelReader3 == null || pixelReader3 == null || pixelReader3.getWidth() != this.width || (pixelReader = this.pixelReader) == null || pixelReader.getHeight() != this.height || (pixelReader2 = this.pixelReader) == null || pixelReader2.getLegacyMode() != legacyMode) {
            PixelReader pixelReader4 = this.pixelReader;
            if (pixelReader4 != null) {
                pixelReader4.release();
            }
            this.pixelReader = new PixelReader(this.width, this.height, legacyMode);
        }
        PixelReader pixelReader5 = this.pixelReader;
        AbstractC22676k.m65747g(pixelReader5);
        try {
            ByteBuffer pixels = pixelReader5.readPixels();
            pixels.rewind();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.copyPixelsFromBuffer(pixels);
            int i13 = this.width;
            float f13 = i13 / 2.0f;
            int i14 = this.height;
            float f14 = i14 / 2.0f;
            try {
                Matrix matrix = new Matrix();
                matrix.postScale(1.0f, -1.0f, f13, f14);
                return Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, i13, i14, matrix, true);
            } finally {
                bitmapCreateBitmap.recycle();
            }
        } catch (Throwable th3) {
            MapboxLogger.logW(this.TAG, "Exception " + th3.getLocalizedMessage() + " happened when reading pixels");
            if (pixelReader5.getLegacyMode()) {
                return null;
            }
            MapboxLogger.logW(this.TAG, "Re-creating PixelReader with no PBO support and making snapshot again");
            pixelReader5.release();
            this.pixelReader = new PixelReader(pixelReader5.getWidth(), pixelReader5.getHeight(), true);
            return performSnapshot(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderFrameFinishedCallback$lambda$0(MapboxRenderer this$0, RenderFrameFinished eventData) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(eventData, "eventData");
        if (eventData.getRenderMode() == RenderModeType.FULL) {
            this$0.readyForSnapshot.set(true);
            Cancelable cancelable = this$0.renderFrameCancelable;
            if (cancelable != null) {
                cancelable.cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void snapshot$lambda$3$lambda$2(ReentrantLock lock, C22669g0 snapshot, MapboxRenderer this$0, boolean z4, Condition condition) {
        AbstractC22676k.m65750j(lock, "$lock");
        AbstractC22676k.m65750j(snapshot, "$snapshot");
        AbstractC22676k.m65750j(this$0, "this$0");
        lock.lock();
        try {
            snapshot.f89336w = this$0.performSnapshot(z4);
            condition.signal();
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void snapshot$lambda$4(MapView.OnSnapshotReady listener, MapboxRenderer this$0, boolean z4) {
        AbstractC22676k.m65750j(listener, "$listener");
        AbstractC22676k.m65750j(this$0, "this$0");
        listener.onSnapshotReady(this$0.performSnapshot(z4));
    }

    public final void createRenderer() {
        NativeMapImpl nativeMapImpl = this.map;
        if (nativeMapImpl != null) {
            nativeMapImpl.createRenderer();
        }
    }

    public final void destroyRenderer() {
        NativeMapImpl nativeMapImpl = this.map;
        if (nativeMapImpl != null) {
            nativeMapImpl.destroyRenderer();
        }
        PixelReader pixelReader = this.pixelReader;
        if (pixelReader != null) {
            pixelReader.release();
        }
        this.pixelReader = null;
    }

    /* JADX INFO: renamed from: getMap$maps_sdk_release, reason: from getter */
    public final NativeMapImpl getMap() {
        return this.map;
    }

    /* JADX INFO: renamed from: getPixelReader$maps_sdk_release, reason: from getter */
    public final PixelReader getPixelReader() {
        return this.pixelReader;
    }

    /* JADX INFO: renamed from: getReadyForSnapshot$maps_sdk_release, reason: from getter */
    public final AtomicBoolean getReadyForSnapshot() {
        return this.readyForSnapshot;
    }

    public final MapboxRenderThread getRenderThread$maps_sdk_release() {
        MapboxRenderThread mapboxRenderThread = this.renderThread;
        if (mapboxRenderThread != null) {
            return mapboxRenderThread;
        }
        AbstractC22676k.m65757q("renderThread");
        throw null;
    }

    /* JADX INFO: renamed from: getSnapshotLegacyModeEnabled$maps_sdk_release, reason: from getter */
    public final boolean getSnapshotLegacyModeEnabled() {
        return this.snapshotLegacyModeEnabled;
    }

    /* JADX INFO: renamed from: getWidgetRenderer$maps_sdk_release */
    public abstract MapboxWidgetRenderer getWidgetRenderer();

    public final void onDestroy() {
        getWidgetRenderer().cleanUpAllWidgets();
        getRenderThread$maps_sdk_release().destroy$maps_sdk_release();
        getRenderThread$maps_sdk_release().setFpsChangedListener$maps_sdk_release(null);
    }

    public final void onStart() {
        getRenderThread$maps_sdk_release().resume();
        NativeMapImpl nativeMapImpl = this.map;
        this.renderFrameCancelable = nativeMapImpl != null ? nativeMapImpl.subscribe(this.renderFrameFinishedCallback) : null;
    }

    public final void onStop() {
        getRenderThread$maps_sdk_release().pause();
        Cancelable cancelable = this.renderFrameCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.readyForSnapshot.set(false);
    }

    public final void onSurfaceChanged(int width, int height) {
        if (width == this.width && height == this.height) {
            return;
        }
        this.width = width;
        this.height = height;
        GLES20.glViewport(0, 0, width, height);
        NativeMapImpl nativeMapImpl = this.map;
        if (nativeMapImpl != null) {
            nativeMapImpl.setSize(new Size(width, height));
        }
    }

    public final void queueNonRenderEvent(Runnable runnable) {
        AbstractC22676k.m65750j(runnable, "runnable");
        getRenderThread$maps_sdk_release().queueRenderEvent(new RenderEvent(runnable, false));
    }

    public final void queueRenderEvent(Runnable runnable) {
        AbstractC22676k.m65750j(runnable, "runnable");
        getRenderThread$maps_sdk_release().queueRenderEvent(new RenderEvent(runnable, true));
    }

    public final void render() {
        NativeMapImpl nativeMapImpl = this.map;
        if (nativeMapImpl != null) {
            nativeMapImpl.render();
        }
    }

    @Override // com.mapbox.maps.MapClient
    public void scheduleRepaint() {
        getRenderThread$maps_sdk_release().queueRenderEvent(repaintRenderEvent);
    }

    public final synchronized void setMap(NativeMapImpl map) {
        AbstractC22676k.m65750j(map, "map");
        this.map = map;
    }

    public final void setMap$maps_sdk_release(NativeMapImpl nativeMapImpl) {
        this.map = nativeMapImpl;
    }

    public final void setMaximumFps(int fps) {
        if (fps > 0) {
            getRenderThread$maps_sdk_release().setUserRefreshRate(fps);
            return;
        }
        MapboxLogger.logE(this.TAG, "Maximum FPS could not be <= 0, ignoring " + fps + " value.");
    }

    public final synchronized void setOnFpsChangedListener(OnFpsChangedListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        getRenderThread$maps_sdk_release().setFpsChangedListener$maps_sdk_release(listener);
    }

    public final void setPixelReader$maps_sdk_release(PixelReader pixelReader) {
        this.pixelReader = pixelReader;
    }

    public final void setReadyForSnapshot$maps_sdk_release(AtomicBoolean atomicBoolean) {
        AbstractC22676k.m65750j(atomicBoolean, "<set-?>");
        this.readyForSnapshot = atomicBoolean;
    }

    public final void setRenderThread$maps_sdk_release(MapboxRenderThread mapboxRenderThread) {
        AbstractC22676k.m65750j(mapboxRenderThread, "<set-?>");
        this.renderThread = mapboxRenderThread;
    }

    public final void setSnapshotLegacyModeEnabled$maps_sdk_release(boolean z4) {
        this.snapshotLegacyModeEnabled = z4;
    }

    public final Bitmap snapshot() {
        if (!this.readyForSnapshot.get()) {
            MapboxLogger.logE(this.TAG, "Could not take map snapshot because map is not ready yet.");
            return null;
        }
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition conditionNewCondition = reentrantLock.newCondition();
        final boolean z4 = this.snapshotLegacyModeEnabled;
        reentrantLock.lock();
        try {
            final C22669g0 c22669g0 = new C22669g0();
            getRenderThread$maps_sdk_release().queueRenderEvent(new RenderEvent(new Runnable() { // from class: com.mapbox.maps.renderer.b
                @Override // java.lang.Runnable
                public final void run() {
                    MapboxRenderer.snapshot$lambda$3$lambda$2(reentrantLock, c22669g0, this, z4, conditionNewCondition);
                }
            }, true));
            conditionNewCondition.await(1L, TimeUnit.SECONDS);
            return (Bitmap) c22669g0.f89336w;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void snapshot(MapView.OnSnapshotReady listener) {
        AbstractC22676k.m65750j(listener, "listener");
        if (!this.readyForSnapshot.get()) {
            MapboxLogger.logE(this.TAG, "Could not take map snapshot because map is not ready yet.");
            listener.onSnapshotReady(null);
        }
        getRenderThread$maps_sdk_release().queueRenderEvent(new RenderEvent(new RunnableC5555c(listener, this, this.snapshotLegacyModeEnabled), true));
    }
}
