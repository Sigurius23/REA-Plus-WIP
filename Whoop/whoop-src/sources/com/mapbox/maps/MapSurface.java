package com.mapbox.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Display;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import androidx.core.app.NotificationCompat;
import com.mapbox.maps.renderer.MapboxSurfaceRenderer;
import com.mapbox.maps.renderer.OnFpsChangedListener;
import com.mapbox.maps.renderer.RenderThreadStatsRecorder;
import com.mapbox.maps.renderer.RendererSetupErrorListener;
import com.mapbox.maps.renderer.widget.Widget;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import mv.InterfaceC25967f;
import p127ev.InterfaceC13669j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB1\b\u0011\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\t\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u001c\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\"\u0010!J\u001f\u0010%\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010\u0017J\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001fH\u0016¢\u0006\u0004\b(\u0010)J\u0011\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b+\u0010/J\u0017\u00101\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u0013H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00102\u0006\u0010.\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u00102\u0006\u00107\u001a\u000206H\u0017¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0010H\u0016¢\u0006\u0004\b:\u0010\u0012J\u000f\u0010;\u001a\u00020\u0010H\u0016¢\u0006\u0004\b;\u0010\u0012J\u000f\u0010<\u001a\u00020\u0010H\u0016¢\u0006\u0004\b<\u0010\u0012J\u000f\u0010=\u001a\u00020\u0010H\u0016¢\u0006\u0004\b=\u0010\u0012J\u0017\u0010@\u001a\u00020\u00102\u0006\u0010?\u001a\u00020>H\u0017¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u001f2\u0006\u0010?\u001a\u00020>H\u0017¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020\u00102\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\u00102\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bH\u0010GJ#\u0010M\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010J*\u00020I2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010NR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010OR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010PR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010QR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010RR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010S\u001a\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001b¨\u0006W"}, m65681d2 = {"Lcom/mapbox/maps/MapSurface;", "Lmv/f;", "Lcom/mapbox/maps/MapControllable;", "Landroid/content/Context;", "context", "Landroid/view/Surface;", "surface", "Lcom/mapbox/maps/MapInitOptions;", "mapInitOptions", "<init>", "(Landroid/content/Context;Landroid/view/Surface;Lcom/mapbox/maps/MapInitOptions;)V", "Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;", "renderer", "Lcom/mapbox/maps/MapController;", "mapController", "(Landroid/content/Context;Landroid/view/Surface;Lcom/mapbox/maps/MapInitOptions;Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;Lcom/mapbox/maps/MapController;)V", "Ll83/a0;", "surfaceCreated", "()V", "", "width", "height", "surfaceChanged", "(II)V", "surfaceDestroyed", "Lcom/mapbox/maps/MapboxMap;", "getMapboxMapDeprecated", "()Lcom/mapbox/maps/MapboxMap;", "getMapboxMap", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onGenericMotionEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "onSizeChanged", "Ljava/lang/Runnable;", "needRender", "queueEvent", "(Ljava/lang/Runnable;Z)V", "Landroid/graphics/Bitmap;", "snapshot", "()Landroid/graphics/Bitmap;", "Lcom/mapbox/maps/MapView$OnSnapshotReady;", "listener", "(Lcom/mapbox/maps/MapView$OnSnapshotReady;)V", "fps", "setMaximumFps", "(I)V", "Lcom/mapbox/maps/renderer/OnFpsChangedListener;", "setOnFpsChangedListener", "(Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V", "Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;", "renderThreadStatsRecorder", "setRenderThreadStatsRecorder", "(Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;)V", "onStart", "onStop", "onDestroy", "onLowMemory", "Lcom/mapbox/maps/renderer/widget/Widget;", "widget", "addWidget", "(Lcom/mapbox/maps/renderer/widget/Widget;)V", "removeWidget", "(Lcom/mapbox/maps/renderer/widget/Widget;)Z", "Lcom/mapbox/maps/renderer/RendererSetupErrorListener;", "rendererSetupErrorListener", "addRendererSetupErrorListener", "(Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V", "removeRendererSetupErrorListener", "Lev/j;", "T", "", "id", "getPlugin", "(Ljava/lang/String;)Lev/j;", "Landroid/content/Context;", "Lcom/mapbox/maps/MapController;", "Lcom/mapbox/maps/MapInitOptions;", "Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;", "Landroid/view/Surface;", "getSurface", "()Landroid/view/Surface;", "mapboxMap", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapSurface implements InterfaceC25967f, MapControllable {
    private final Context context;
    private final MapController mapController;
    private final MapInitOptions mapInitOptions;
    private final MapboxSurfaceRenderer renderer;
    private final Surface surface;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapSurface(Context context, Surface surface) {
        this(context, surface, (MapInitOptions) null, 4, (DefaultConstructorMarker) null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(surface, "surface");
    }

    @Override // com.mapbox.maps.MapControllable
    public void addRendererSetupErrorListener(RendererSetupErrorListener rendererSetupErrorListener) {
        AbstractC22676k.m65750j(rendererSetupErrorListener, "rendererSetupErrorListener");
        this.mapController.addRendererSetupErrorListener(rendererSetupErrorListener);
    }

    @Override // com.mapbox.maps.MapControllable
    @MapboxExperimental
    public void addWidget(Widget widget) {
        AbstractC22676k.m65750j(widget, "widget");
        this.mapController.addWidget(widget);
    }

    @Override // com.mapbox.maps.MapControllable
    /* JADX INFO: renamed from: getMapboxMap */
    public MapboxMap getMapboxMapDeprecated() {
        return this.mapController.getMapboxMapDeprecated();
    }

    @Override // mv.InterfaceC25967f
    public <T extends InterfaceC13669j> T getPlugin(String id4) {
        AbstractC22676k.m65750j(id4, "id");
        return (T) this.mapController.getPlugin(id4);
    }

    public final Surface getSurface() {
        return this.surface;
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onDestroy() {
        this.mapController.onDestroy();
    }

    @Override // com.mapbox.maps.MapControllable
    public boolean onGenericMotionEvent(MotionEvent event) {
        AbstractC22676k.m65750j(event, "event");
        return this.mapController.onGenericMotionEvent(event);
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onLowMemory() {
        this.mapController.onLowMemory();
    }

    @Override // com.mapbox.maps.MapControllable
    public void onSizeChanged(int w9, int h7) {
        this.mapController.onSizeChanged(w9, h7);
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onStart() {
        this.mapController.onStart();
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onStop() {
        this.mapController.onStop();
    }

    @Override // com.mapbox.maps.MapControllable
    public boolean onTouchEvent(MotionEvent event) {
        AbstractC22676k.m65750j(event, "event");
        return this.mapController.onTouchEvent(event);
    }

    @Override // com.mapbox.maps.MapControllable
    public void queueEvent(Runnable event, boolean needRender) {
        AbstractC22676k.m65750j(event, "event");
        MapControllable.DefaultImpls.queueEvent$default(this.mapController, event, false, 2, null);
    }

    @Override // com.mapbox.maps.MapControllable
    public void removeRendererSetupErrorListener(RendererSetupErrorListener rendererSetupErrorListener) {
        AbstractC22676k.m65750j(rendererSetupErrorListener, "rendererSetupErrorListener");
        this.mapController.removeRendererSetupErrorListener(rendererSetupErrorListener);
    }

    @Override // com.mapbox.maps.MapControllable
    @MapboxExperimental
    public boolean removeWidget(Widget widget) {
        AbstractC22676k.m65750j(widget, "widget");
        return this.mapController.removeWidget(widget);
    }

    @Override // com.mapbox.maps.MapControllable
    public void setMaximumFps(int fps) {
        this.renderer.setMaximumFps(fps);
    }

    @Override // com.mapbox.maps.MapControllable
    public void setOnFpsChangedListener(OnFpsChangedListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.renderer.setOnFpsChangedListener(listener);
    }

    @Override // com.mapbox.maps.MapControllable
    @MapboxExperimental
    public void setRenderThreadStatsRecorder(RenderThreadStatsRecorder renderThreadStatsRecorder) {
        AbstractC22676k.m65750j(renderThreadStatsRecorder, "renderThreadStatsRecorder");
        this.mapController.setRenderThreadStatsRecorder(renderThreadStatsRecorder);
    }

    @Override // com.mapbox.maps.MapControllable
    public Bitmap snapshot() {
        return this.mapController.snapshot();
    }

    public final void surfaceChanged(int width, int height) {
        this.renderer.surfaceChanged(this.surface, width, height);
        onSizeChanged(width, height);
    }

    public final void surfaceCreated() {
        Display defaultDisplay;
        this.renderer.surfaceCreated();
        WindowManager windowManager = (WindowManager) this.context.getSystemService("window");
        this.mapController.setScreenRefreshRate$maps_sdk_release((windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) ? 60 : (int) defaultDisplay.getRefreshRate());
    }

    public final void surfaceDestroyed() {
        this.renderer.surfaceDestroyed();
    }

    public /* synthetic */ MapSurface(Context context, Surface surface, MapInitOptions mapInitOptions, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, surface, (i13 & 4) != 0 ? new MapInitOptions(context, null, null, null, false, null, null, 0, null, 510, null) : mapInitOptions);
    }

    @Override // com.mapbox.maps.MapControllable
    public void snapshot(MapView.OnSnapshotReady listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.mapController.snapshot(listener);
    }

    public MapSurface(Context context, Surface surface, MapInitOptions mapInitOptions) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(surface, "surface");
        AbstractC22676k.m65750j(mapInitOptions, "mapInitOptions");
        this.context = context;
        this.surface = surface;
        this.mapInitOptions = mapInitOptions;
        int antialiasingSampleCount = mapInitOptions.getAntialiasingSampleCount();
        ContextMode contextMode = mapInitOptions.getMapOptions().getContextMode();
        contextMode = contextMode == null ? ContextMode.UNIQUE : contextMode;
        AbstractC22676k.m65749i(contextMode, "mapInitOptions.mapOption…ode ?: ContextMode.UNIQUE");
        MapboxSurfaceRenderer mapboxSurfaceRenderer = new MapboxSurfaceRenderer(antialiasingSampleCount, contextMode, mapInitOptions.getMapName());
        this.renderer = mapboxSurfaceRenderer;
        MapController mapController = new MapController(mapboxSurfaceRenderer, mapInitOptions);
        MapController.initializePlugins$default(mapController, mapInitOptions, null, 2, null);
        this.mapController = mapController;
    }

    public MapSurface(Context context, Surface surface, MapInitOptions mapInitOptions, MapboxSurfaceRenderer renderer, MapController mapController) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(surface, "surface");
        AbstractC22676k.m65750j(mapInitOptions, "mapInitOptions");
        AbstractC22676k.m65750j(renderer, "renderer");
        AbstractC22676k.m65750j(mapController, "mapController");
        this.context = context;
        this.surface = surface;
        this.mapInitOptions = mapInitOptions;
        this.renderer = renderer;
        this.mapController = mapController;
    }
}
