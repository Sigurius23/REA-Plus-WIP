package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class CustomLayerHostNative implements CustomLayerHost {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class CustomLayerHostPeerCleaner implements Runnable {
        private long peer;

        public CustomLayerHostPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            CustomLayerHostNative.cleanNativePeer(this.peer);
        }
    }

    public CustomLayerHostNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new CustomLayerHostPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.CustomLayerHost
    public native void contextLost();

    @Override // com.mapbox.maps.CustomLayerHost
    public native void deinitialize();

    @Override // com.mapbox.maps.CustomLayerHost
    public native void initialize();

    @Override // com.mapbox.maps.CustomLayerHost
    public native CustomLayerRenderConfiguration prerender(CustomLayerRenderParameters customLayerRenderParameters);

    @Override // com.mapbox.maps.CustomLayerHost
    public native void render(CustomLayerRenderParameters customLayerRenderParameters);

    @Override // com.mapbox.maps.CustomLayerHost
    public native void renderToTile(CanonicalTileID canonicalTileID);
}
