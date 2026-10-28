package com.mapbox.maps.renderer;

import android.view.Surface;
import android.view.SurfaceHolder;
import com.mapbox.maps.ContextMode;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0011\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lcom/mapbox/maps/renderer/MapboxSurfaceHolderRenderer;", "Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;", "Landroid/view/SurfaceHolder$Callback;", "Landroid/view/SurfaceHolder;", "surfaceHolder", "", "antialiasingSampleCount", "Lcom/mapbox/maps/ContextMode;", "contextMode", "", "mapName", "<init>", "(Landroid/view/SurfaceHolder;ILcom/mapbox/maps/ContextMode;Ljava/lang/String;)V", "Lcom/mapbox/maps/renderer/MapboxRenderThread;", "renderThread", "(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V", "holder", "format", "width", "height", "Ll83/a0;", "surfaceChanged", "(Landroid/view/SurfaceHolder;III)V", "surfaceDestroyed", "(Landroid/view/SurfaceHolder;)V", "surfaceCreated", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapboxSurfaceHolderRenderer extends MapboxSurfaceRenderer implements SurfaceHolder.Callback {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxSurfaceHolderRenderer(SurfaceHolder surfaceHolder, int i13, ContextMode contextMode, String mapName) {
        super(i13, contextMode, mapName);
        AbstractC22676k.m65750j(surfaceHolder, "surfaceHolder");
        AbstractC22676k.m65750j(contextMode, "contextMode");
        AbstractC22676k.m65750j(mapName, "mapName");
        surfaceHolder.addCallback(this);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        AbstractC22676k.m65750j(holder, "holder");
        Surface surface = holder.getSurface();
        AbstractC22676k.m65749i(surface, "holder.surface");
        surfaceChanged(surface, width, height);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder holder) {
        AbstractC22676k.m65750j(holder, "holder");
        surfaceCreated();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder holder) {
        AbstractC22676k.m65750j(holder, "holder");
        surfaceDestroyed();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxSurfaceHolderRenderer(MapboxRenderThread renderThread) {
        super(renderThread);
        AbstractC22676k.m65750j(renderThread, "renderThread");
    }
}
