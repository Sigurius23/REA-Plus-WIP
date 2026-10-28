package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class CustomRasterSourceTileRendererNative implements CustomRasterSourceTileRenderer {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class CustomRasterSourceTileRendererPeerCleaner implements Runnable {
        private long peer;

        public CustomRasterSourceTileRendererPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            CustomRasterSourceTileRendererNative.cleanNativePeer(this.peer);
        }
    }

    public CustomRasterSourceTileRendererNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new CustomRasterSourceTileRendererPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.CustomRasterSourceTileRenderer
    public native void contextLost();

    @Override // com.mapbox.maps.CustomRasterSourceTileRenderer
    public native void deinitialize();

    @Override // com.mapbox.maps.CustomRasterSourceTileRenderer
    public native void initialize();

    @Override // com.mapbox.maps.CustomRasterSourceTileRenderer
    public native boolean isTileRenderable(CanonicalTileID canonicalTileID, CustomRasterSourceTileStatus customRasterSourceTileStatus);

    @Override // com.mapbox.maps.CustomRasterSourceTileRenderer
    public native void prerender(CustomLayerRenderParameters customLayerRenderParameters);

    @Override // com.mapbox.maps.CustomRasterSourceTileRenderer
    public native void renderToTile(CanonicalTileID canonicalTileID);
}
