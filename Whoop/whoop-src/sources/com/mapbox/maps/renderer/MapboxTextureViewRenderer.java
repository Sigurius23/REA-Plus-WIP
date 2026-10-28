package com.mapbox.maps.renderer;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.mapbox.maps.ContextMode;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0011\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u0016R\u001a\u0010\u001f\u001a\u00020\u001e8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, m65681d2 = {"Lcom/mapbox/maps/renderer/MapboxTextureViewRenderer;", "Lcom/mapbox/maps/renderer/MapboxRenderer;", "Landroid/view/TextureView$SurfaceTextureListener;", "Landroid/view/TextureView;", "textureView", "", "antialiasingSampleCount", "Lcom/mapbox/maps/ContextMode;", "contextMode", "", "mapName", "<init>", "(Landroid/view/TextureView;ILcom/mapbox/maps/ContextMode;Ljava/lang/String;)V", "Lcom/mapbox/maps/renderer/MapboxRenderThread;", "renderThread", "(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V", "Landroid/graphics/SurfaceTexture;", "surface", "width", "height", "Ll83/a0;", "onSurfaceTextureSizeChanged", "(Landroid/graphics/SurfaceTexture;II)V", "onSurfaceTextureUpdated", "(Landroid/graphics/SurfaceTexture;)V", "", "onSurfaceTextureDestroyed", "(Landroid/graphics/SurfaceTexture;)Z", "surfaceTexture", "onSurfaceTextureAvailable", "Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;", "widgetRenderer", "Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;", "getWidgetRenderer$maps_sdk_release", "()Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapboxTextureViewRenderer extends MapboxRenderer implements TextureView.SurfaceTextureListener {
    private final MapboxWidgetRenderer widgetRenderer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxTextureViewRenderer(TextureView textureView, int i13, ContextMode contextMode, String mapName) {
        super(mapName);
        AbstractC22676k.m65750j(textureView, "textureView");
        AbstractC22676k.m65750j(contextMode, "contextMode");
        AbstractC22676k.m65750j(mapName, "mapName");
        MapboxWidgetRenderer mapboxWidgetRenderer = new MapboxWidgetRenderer(i13, mapName);
        this.widgetRenderer = mapboxWidgetRenderer;
        setRenderThread$maps_sdk_release(new MapboxRenderThread(this, mapboxWidgetRenderer, true, i13, contextMode, mapName));
        textureView.setOpaque(false);
        textureView.setSurfaceTextureListener(this);
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderer
    /* JADX INFO: renamed from: getWidgetRenderer$maps_sdk_release, reason: from getter */
    public MapboxWidgetRenderer getWidgetRenderer() {
        return this.widgetRenderer;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int width, int height) {
        AbstractC22676k.m65750j(surfaceTexture, "surfaceTexture");
        getRenderThread$maps_sdk_release().onSurfaceCreated(new Surface(surfaceTexture), width, height);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        AbstractC22676k.m65750j(surface, "surface");
        getRenderThread$maps_sdk_release().onSurfaceDestroyed();
        surface.release();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {
        AbstractC22676k.m65750j(surface, "surface");
        getRenderThread$maps_sdk_release().onSurfaceSizeChanged(width, height);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {
        AbstractC22676k.m65750j(surface, "surface");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxTextureViewRenderer(MapboxRenderThread renderThread) {
        super("");
        AbstractC22676k.m65750j(renderThread, "renderThread");
        this.widgetRenderer = new MapboxWidgetRenderer(1, "");
        setRenderThread$maps_sdk_release(renderThread);
    }
}
