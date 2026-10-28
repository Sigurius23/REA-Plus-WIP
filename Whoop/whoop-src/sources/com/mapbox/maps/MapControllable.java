package com.mapbox.maps;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import com.mapbox.maps.renderer.OnFpsChangedListener;
import com.mapbox.maps.renderer.RenderThreadStatsRecorder;
import com.mapbox.maps.renderer.RendererSetupErrorListener;
import com.mapbox.maps.renderer.widget.Widget;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0013\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\bH&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH'¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"H'¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H'¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(H&¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(H&¢\u0006\u0004\b,\u0010+R\u0014\u00100\u001a\u00020-8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, m65681d2 = {"Lcom/mapbox/maps/MapControllable;", "Lcom/mapbox/maps/MapboxLifecycleObserver;", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onGenericMotionEvent", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ll83/a0;", "onSizeChanged", "(II)V", "Ljava/lang/Runnable;", "needRender", "queueEvent", "(Ljava/lang/Runnable;Z)V", "Landroid/graphics/Bitmap;", "snapshot", "()Landroid/graphics/Bitmap;", "Lcom/mapbox/maps/MapView$OnSnapshotReady;", "listener", "(Lcom/mapbox/maps/MapView$OnSnapshotReady;)V", "fps", "setMaximumFps", "(I)V", "Lcom/mapbox/maps/renderer/OnFpsChangedListener;", "setOnFpsChangedListener", "(Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V", "Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;", "renderThreadStatsRecorder", "setRenderThreadStatsRecorder", "(Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;)V", "Lcom/mapbox/maps/renderer/widget/Widget;", "widget", "addWidget", "(Lcom/mapbox/maps/renderer/widget/Widget;)V", "removeWidget", "(Lcom/mapbox/maps/renderer/widget/Widget;)Z", "Lcom/mapbox/maps/renderer/RendererSetupErrorListener;", "rendererSetupErrorListener", "addRendererSetupErrorListener", "(Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V", "removeRendererSetupErrorListener", "Lcom/mapbox/maps/MapboxMap;", "getMapboxMap", "()Lcom/mapbox/maps/MapboxMap;", "mapboxMap", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public interface MapControllable extends MapboxLifecycleObserver {

    @Metadata(m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void queueEvent$default(MapControllable mapControllable, Runnable runnable, boolean z4, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queueEvent");
            }
            if ((i13 & 2) != 0) {
                z4 = true;
            }
            mapControllable.queueEvent(runnable, z4);
        }
    }

    void addRendererSetupErrorListener(RendererSetupErrorListener rendererSetupErrorListener);

    @MapboxExperimental
    void addWidget(Widget widget);

    /* JADX INFO: renamed from: getMapboxMap */
    MapboxMap getMapboxMapDeprecated();

    boolean onGenericMotionEvent(MotionEvent event);

    void onSizeChanged(int w9, int h7);

    boolean onTouchEvent(MotionEvent event);

    void queueEvent(Runnable event, boolean needRender);

    void removeRendererSetupErrorListener(RendererSetupErrorListener rendererSetupErrorListener);

    @MapboxExperimental
    boolean removeWidget(Widget widget);

    void setMaximumFps(int fps);

    void setOnFpsChangedListener(OnFpsChangedListener listener);

    @MapboxExperimental
    void setRenderThreadStatsRecorder(RenderThreadStatsRecorder renderThreadStatsRecorder);

    Bitmap snapshot();

    void snapshot(MapView.OnSnapshotReady listener);
}
