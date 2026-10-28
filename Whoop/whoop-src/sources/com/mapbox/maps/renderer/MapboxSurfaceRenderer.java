package com.mapbox.maps.renderer;

import android.view.Surface;
import com.mapbox.maps.ContextMode;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;", "Lcom/mapbox/maps/renderer/MapboxRenderer;", "", "antialiasingSampleCount", "Lcom/mapbox/maps/ContextMode;", "contextMode", "", "mapName", "<init>", "(ILcom/mapbox/maps/ContextMode;Ljava/lang/String;)V", "Lcom/mapbox/maps/renderer/MapboxRenderThread;", "renderThread", "(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V", "Landroid/view/Surface;", "surface", "width", "height", "Ll83/a0;", "surfaceChanged", "(Landroid/view/Surface;II)V", "surfaceDestroyed", "()V", "surfaceCreated", "", "createSurface", "Z", "Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;", "widgetRenderer", "Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;", "getWidgetRenderer$maps_sdk_release", "()Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public class MapboxSurfaceRenderer extends MapboxRenderer {
    private boolean createSurface;
    private final MapboxWidgetRenderer widgetRenderer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxSurfaceRenderer(int i13, ContextMode contextMode, String mapName) {
        super(mapName);
        AbstractC22676k.m65750j(contextMode, "contextMode");
        AbstractC22676k.m65750j(mapName, "mapName");
        this.widgetRenderer = new MapboxWidgetRenderer(i13, mapName);
        setRenderThread$maps_sdk_release(new MapboxRenderThread(this, getWidgetRenderer(), false, i13, contextMode, mapName));
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderer
    /* JADX INFO: renamed from: getWidgetRenderer$maps_sdk_release, reason: from getter */
    public MapboxWidgetRenderer getWidgetRenderer() {
        return this.widgetRenderer;
    }

    public final void surfaceChanged(Surface surface, int width, int height) {
        AbstractC22676k.m65750j(surface, "surface");
        if (this.createSurface) {
            getRenderThread$maps_sdk_release().onSurfaceCreated(surface, width, height);
            this.createSurface = false;
        }
        getRenderThread$maps_sdk_release().onSurfaceSizeChanged(width, height);
    }

    public final void surfaceCreated() {
        this.createSurface = true;
    }

    public final void surfaceDestroyed() {
        getRenderThread$maps_sdk_release().onSurfaceDestroyed();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxSurfaceRenderer(MapboxRenderThread renderThread) {
        super("");
        AbstractC22676k.m65750j(renderThread, "renderThread");
        this.widgetRenderer = new MapboxWidgetRenderer(1, "");
        setRenderThread$maps_sdk_release(renderThread);
    }
}
